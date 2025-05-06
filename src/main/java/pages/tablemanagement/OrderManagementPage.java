package pages.tablemanagement;

import org.openqa.selenium.WebElement;

import core.flutter.FlutterElement;
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

    public OrderManagementPage selectOrderTableFilterAll() {
        WebElement element = getFlutterElement("order_filter_table_all");
        element.click();
        return this;
    }

    public FlutterElement getOrderTableFilterAt(int index) {
        return getFlutterElement("order_filter_table_index_" + index);
    }

    public FlutterElement getOrderCardAt(int index) {
        return getFlutterElement("order_card_" + index);
    }

    public RegisterPage clickOrderCardEdit(int index) {
        WebElement element = getFlutterElement("order_card_" + index + "_action_edit");
        element.click();
        return new RegisterPage(this.driver);
    }

    public OrderManagementPage clickOrderCardSplit(int index) {
        WebElement element = getFlutterElement("order_card_" + index + "_action_split");
        element.click();
        return this;
    }

    public OrderManagementPage clickOrderCardMerge(int index) {
        WebElement element = getFlutterElement("order_card_" + index + "_action_merge");
        element.click();
        return this;
    }

    public String getOrderCardOrderId(int index) {
        WebElement element = getFlutterElement("order_card_" + index + "_order_id");
        return element.getText();
    }
}
