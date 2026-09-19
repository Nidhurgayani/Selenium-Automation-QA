package org.example.tests;

import org.example.pages.LoginPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Day5_WebDriverWait_Test {

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
    public void testAddToCartUpdatesBadge() throws Exception {
        // Step 1: Login
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Confirm we're on Products page
        Assert.assertTrue(productsPage.isProductsPageDisplayed());

        // Step 3: Add item to cart
        productsPage.addItemToCart();

        // Step 4: Verify cart badge updates (this relies on WebDriverWait)
        String badgeCount = productsPage.getCartBadgeCount();
        System.out.println("Cart Badge Count: " + badgeCount);

        Assert.assertEquals(badgeCount, "1");

        takeScreenshot("Day5_Cart_Badge_Updated");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void takeScreenshot(String fileName) throws Exception {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destDir = new File("screenshots");
        if (!destDir.exists()) destDir.mkdirs();
        Files.copy(src.toPath(), new File(destDir, fileName + ".png").toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}