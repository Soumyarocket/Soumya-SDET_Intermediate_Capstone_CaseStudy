package com.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import com.utils.ScreenshotUtil;

public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void verifyTitle() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Swag Labs", "Title does not match");
    }

    @Test(priority = 2)
    @Parameters({"validUser", "validPass"})
    public void loginValid(String user, String pass) {
        LoginPage login = new LoginPage(driver);
        login.login(user, pass);

        InventoryPage inventory = new InventoryPage(driver);
        Assert.assertTrue(inventory.isInventoryPage(), "Failed to navigate to inventory page");
        Assert.assertEquals(inventory.getTitle(), "Swag Labs");

        ScreenshotUtil.takeScreenshot(driver, "validLogin");
    }

    @Test(priority = 3)
    @Parameters({"invalidUser", "invalidPass"})
    public void loginInvalid(String user, String pass) {
        driver.get(BASE_URL);
        LoginPage login = new LoginPage(driver);
        login.login(user, pass);

        Assert.assertTrue(login.isErrorDisplayed(), "Error message not displayed for invalid login");
        ScreenshotUtil.takeScreenshot(driver, "invalidLogin");
    }

    @AfterMethod
    public void cleanup() {
        driver.get(BASE_URL);
    }
}
