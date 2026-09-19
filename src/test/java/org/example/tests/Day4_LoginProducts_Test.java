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

public class Day4_LoginProducts_Test {

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
    public void testLoginNavigatesToProductsPage() throws Exception {
        // Step 1: Login using LoginPage
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Verify Products page using ProductsPage
        boolean isDisplayed = productsPage.isProductsPageDisplayed();
        String heading = productsPage.getProductsHeading();

        System.out.println("Products Page Displayed: " + isDisplayed);
        System.out.println("Products Heading: " + heading);

        Assert.assertTrue(isDisplayed, "Products page was not displayed after login");
        Assert.assertEquals(heading, "Products");

        takeScreenshot("Day4_Successful_Navigation");
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