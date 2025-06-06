package com.pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean isInventoryPage() {
        return driver.getCurrentUrl().contains("inventory.html");
    }
}
