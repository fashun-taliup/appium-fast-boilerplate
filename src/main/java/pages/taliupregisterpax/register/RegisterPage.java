package pages.taliupregisterpax.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import pages.taliupregisterpax.register.customitempopup.CustomItemPopupPage;
import pages.taliupregisterpax.register.orderdetails.OrderDetailsPage;

public class RegisterPage extends BasePage {
    private final By btnViewOrder = By.id("com.taliup.register:id/btn_view_order");
    private final By btnCustomItem = By.id("com.taliup.register:id/btn_custom_item");

    public RegisterPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isViewOrderButtonVisible() {
        waitForElementToBePresentAndVisible(btnViewOrder);
        WebElement button = getElement(btnViewOrder);
        return isElementDisplayed(button);
    }

    public CustomItemPopupPage tapOnCustomItem() {
        WebElement button = getElement(btnCustomItem);
        click(button);
        return new CustomItemPopupPage(driver);
    }

    public OrderDetailsPage clickViewOrder() {
        waitForElementToBePresentAndVisible(btnViewOrder);
        WebElement button = getElement(btnViewOrder);
        click(button);
        return new OrderDetailsPage(driver);
    }
}