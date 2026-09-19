package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By cartItemName = By.className("inventory_item_name");
    private By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartItemName() {
        return waitForVisible(cartItemName).getText();
    }

    public void clickCheckout() {
        waitForClickable(checkoutButton).click();
    }
}