package pages.taliupregisterpax.register.orderdetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class OrderDetailsPage extends BasePage {
    private final By orderItemsList = By.id("com.taliup.register:id/recycler_order_items");
    private final By btnViewOrder = By.id("com.taliup.register:id/btn_view_order");

    public OrderDetailsPage(AppiumDriver driver) {
        super(driver);
    }

    public int getOrderItemsCount() {
        return getElements(orderItemsList).size();
    }

    public OrderDetailsPage clickViewOrder() {
        waitForElementToBePresentAndVisible(btnViewOrder);
        WebElement button = getElement(btnViewOrder);
        click(button);
        return this;
    }
}