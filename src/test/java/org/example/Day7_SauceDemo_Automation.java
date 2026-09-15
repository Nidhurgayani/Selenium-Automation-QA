package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day7_SauceDemo_Automation {

    // Test Case 1: Valid Login
    @Test
    public void validLoginTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click Login
        driver.findElement(By.id("login-button"))
                .click();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the Products title element itself, not just the URL
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("title"))
        );

        // Verify Products heading
        String actualHeading =
                driver.findElement(By.className("title"))
                        .getText();

        Assert.assertEquals(actualHeading, "Products");

        System.out.println("Valid Login Test: PASS");

        driver.quit();
    }


    // Test Case 2: Invalid Login
    @Test
    public void invalidLoginTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter incorrect password
        driver.findElement(By.id("password"))
                .sendKeys("wrong_password");

        // Click Login
        driver.findElement(By.id("login-button"))
                .click();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the error banner to actually appear before reading it
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[data-test='error']")
                )
        );

        // Get error message
        String errorMessage =
                driver.findElement(
                        By.cssSelector("[data-test='error']")
                ).getText();

        // Verify error message
        Assert.assertTrue(
                errorMessage.contains(
                        "Username and password do not match"
                )
        );

        System.out.println("Invalid Login Test: PASS");

        driver.quit();
    }


    // Test Case 3: Empty Login
    @Test
    public void emptyLoginTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Click Login without entering details
        driver.findElement(By.id("login-button"))
                .click();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the error banner to actually appear before reading it
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[data-test='error']")
                )
        );

        // Get error message
        String errorMessage =
                driver.findElement(
                        By.cssSelector("[data-test='error']")
                ).getText();

        // Verify error message
        Assert.assertTrue(
                errorMessage.contains(
                        "Username is required"
                )
        );

        System.out.println("Empty Login Test: PASS");

        driver.quit();
    }


    // Test Case 4: Product Page Validation
    @Test
    public void productPageTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click Login
        driver.findElement(By.id("login-button"))
                .click();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the Products title element itself, not just the URL
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("title"))
        );

        // Verify Products heading
        String actualHeading =
                driver.findElement(By.className("title"))
                        .getText();

        Assert.assertEquals(actualHeading, "Products");

        System.out.println("Product Page Test: PASS");

        driver.quit();
    }
}