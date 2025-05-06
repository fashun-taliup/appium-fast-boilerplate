package pages.tablemanagement.register;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class MyOrderItemBuilderPage extends BasePage {
    public MyOrderItemBuilderPage(AppiumDriver driver) {
        super(driver);
    }

    public MyOrderItemBuilderPage close() {
        getFlutterElement("close_my_order_item_builder").click();
        return this;
    }

    public MyOrderItemBuilderPage addToCart() {
        getFlutterElement("add_to_cart_button").click();
        return this;
    }

    public MyOrderItemBuilderPage selectAttributeValue(int attributeValueId) {
        getFlutterElement("attribute_value_button_" + attributeValueId).click();
        return this;
    }

    public MyOrderItemBuilderPage decreaseAttributeValueQty(int attributeValueId) {
        getFlutterElement("attribute_value_remove_" + attributeValueId).click();
        return this;
    }

    public MyOrderItemBuilderPage selectCustomerPosition(int position) {
        getFlutterElement("customer_position_" + position).click();
        return this;
    }

    public MyOrderItemBuilderPage decreaseItemQty() {
        getFlutterElement("decrease_item_quantity_button").click();
        return this;
    }

    public MyOrderItemBuilderPage increaseItemQty() {
        getFlutterElement("increase_item_quantity_button").click();
        return this;
    }
}
