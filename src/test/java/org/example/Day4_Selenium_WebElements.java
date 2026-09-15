package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Selenium_WebElements {

    public static void main(String[] args) {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Find username field
        WebElement username =
                driver.findElement(By.id("user-name"));

        // Enter username
        username.sendKeys("standard_user");

        // Find password field
        WebElement password =
                driver.findElement(By.id("password"));

        // Enter password
        password.sendKeys("secret_sauce");

        // Find login button
        WebElement loginButton =
                driver.findElement(By.id("login-button"));

        // Click login
        loginButton.click();

        // Find Products heading
        WebElement productsTitle =
                driver.findElement(By.className("title"));

        // Get actual page heading
        String actualTitle = productsTitle.getText();

        // Print page heading
        System.out.println(
                "Actual page heading: " + actualTitle
        );

        // Validate login result
        if (actualTitle.equals("Products")) {
            System.out.println("Login Test: PASS");
        } else {
            System.out.println("Login Test: FAIL");
        }

        // Check whether Products heading is displayed
        System.out.println(
                "Products title displayed: "
                        + productsTitle.isDisplayed()
        );

        // Check whether Products heading is enabled
        System.out.println(
                "Products title enabled: "
                        + productsTitle.isEnabled()
        );

        // Close browser
        driver.quit();
    }
}