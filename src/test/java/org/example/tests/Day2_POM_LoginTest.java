package org.example.tests;

import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2_POM_LoginTest {

    @Test
    public void validLoginTest() {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Perform login using POM method
        loginPage.login("standard_user", "secret_sauce");

        // Verify successful login
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("inventory.html"));

        System.out.println("POM Login Test: PASS");

        // Close browser
        driver.quit();
    }
}
