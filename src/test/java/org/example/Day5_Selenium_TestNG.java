package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_Selenium_TestNG {

    @Test
    public void loginTest() {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click login
        driver.findElement(By.id("login-button"))
                .click();

        // Get page title
        String actualTitle =
                driver.findElement(By.className("title"))
                        .getText();

        // Verify expected result
        Assert.assertEquals(actualTitle, "Products");

        // Close browser
        driver.quit();
    }
}