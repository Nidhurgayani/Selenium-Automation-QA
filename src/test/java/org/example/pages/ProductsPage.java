package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private By productsHeading = By.className("title");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getProductsHeading() {
        return waitForVisible(productsHeading).getText();
    }

    public boolean isProductsPageDisplayed() {
        return waitForVisible(productsHeading).isDisplayed();
    }

    public void addItemToCart() {
        waitForClickable(addToCartButton).click();
    }

    public String getCartBadgeCount() {
        return waitForVisible(cartBadge).getText();
    }

    public void goToCart() {
        waitForClickable(cartIcon).click();
    }
}