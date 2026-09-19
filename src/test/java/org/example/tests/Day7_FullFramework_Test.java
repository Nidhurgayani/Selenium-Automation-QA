package org.example.tests;

import org.example.pages.LoginPage;
import org.example.pages.ProductsPage;
import org.example.pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Day7_FullFramework_Test {

    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void testFullPurchaseFlow() {
        // Login
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsPageDisplayed());

        // Add item and verify badge
        productsPage.addItemToCart();
        Assert.assertEquals(productsPage.getCartBadgeCount(), "1");

        // Go to cart and verify item is there
        productsPage.goToCart();
        Assert.assertEquals(cartPage.getCartItemName(), "Sauce Labs Backpack");

        System.out.println("Full framework flow: PASS");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}