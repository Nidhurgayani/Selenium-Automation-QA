package org.example.tests;

import org.example.pages.LoginPage;
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

public class Day3_LoginPage_ReusableMethods {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() throws Exception {
        loginPage.login("standard_user", "secret_sauce");

        String title = loginPage.getPageTitle();
        String heading = loginPage.getPageHeading();

        System.out.println("Page Title: " + title);
        System.out.println("Page Heading: " + heading);

        Assert.assertEquals(heading, "Products");

        takeScreenshot("Day3_Successful_Login");
    }

    @Test
    public void testInvalidLogin() throws Exception {
        loginPage.login("wrong_user", "wrong_pass");

        String error = loginPage.getErrorMessage();
        System.out.println("Error Message: " + error);

        Assert.assertTrue(error.contains("Username and password do not match"));

        takeScreenshot("Day3_Invalid_Login_Error");
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
