package org.example.tests;

import org.example.pages.LoginPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Day6_TestNG_POM_Assertions {

    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void testLoginAndCartWithSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();

        loginPage.login("standard_user", "secret_sauce");

        boolean isDisplayed = productsPage.isProductsPageDisplayed();
        String heading = productsPage.getProductsHeading();

        softAssert.assertTrue(isDisplayed, "Products page should be displayed");
        softAssert.assertEquals(heading, "Products", "Heading text should be 'Products'");

        productsPage.addItemToCart();
        String badgeCount = productsPage.getCartBadgeCount();

        softAssert.assertEquals(badgeCount, "1", "Cart badge should show 1 after adding item");

        // This line runs ALL the above checks and reports every failure together
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}