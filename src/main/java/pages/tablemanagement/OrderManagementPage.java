package pages.tablemanagement;

import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import pages.tablemanagement.register.RegisterPage;

public class OrderManagementPage extends BasePage {
    public OrderManagementPage(AppiumDriver driver) {
        super(driver);
    }

    public OrderManagementPage clickMergeButton() {
        WebElement element = getFlutterElement("merge_button");
        element.click();
        return this;
    }

    public OrderManagementPage clickMergeConfirm() {
        WebElement element = getFlutterElement("merge_confirm");
        element.click();
        return this;
    }

    public OrderManagementPage clickMergeCancel() {
        WebElement element = getFlutterElement("merge_cancel");
        element.click();
        return this;
    }

    public OrderManagementPage selectOrderTableFilter(int tableId) {
        WebElement element = getFlutterElement("order_filter_table_" + tableId);
        element.click();
        return this;
    }

    public OrderManagementPage selectOrder(int orderId) {
        WebElement element = getFlutterElement("order_card_" + orderId);
        element.click();
        return this;
    }


    public RegisterPage clickOrderCardEdit(int orderId) {
        WebElement element = getFlutterElement("order_card_" + orderId + "_action_edit");
        element.click();
        return new RegisterPage(this.driver);
    }

    public OrderManagementPage clickOrderCardSplit(int orderId) {
        WebElement element = getFlutterElement("order_card_" + orderId + "_action_split");
        element.click();
        return this;
    }

    public OrderManagementPage clickOrderCardMerge(int orderId) {
        WebElement element = getFlutterElement("order_card_" + orderId + "_action_merge");
        element.click();
        return this;
    }

    public String getOrderCardOrderId(int orderId) {
        WebElement element = getFlutterElement("order_card_" + orderId + "_order_id");
        return element.getText();
    }
}
