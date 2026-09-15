package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Selenium_Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        By username = By.id("user-name");
        By password = By.id("password");
        By loginButton = By.id("login-button");

        System.out.println("Username element found: "
                + driver.findElement(username).isDisplayed());

        System.out.println("Password element found: "
                + driver.findElement(password).isDisplayed());

        System.out.println("Login button found: "
                + driver.findElement(loginButton).isDisplayed());

        driver.quit();
    }
}
