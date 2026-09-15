package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6_Selenium_Assertions {

    @Test
    public void loginTest() {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Verify page title
        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Swag Labs");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click login
        driver.findElement(By.id("login-button"))
                .click();

        // Get Products heading
        String actualHeading =
                driver.findElement(By.className("title"))
                        .getText();

        // Verify Products heading
        Assert.assertEquals(actualHeading, "Products");

        System.out.println("Login test completed successfully.");

        // Close browser
        driver.quit();
    }
}
