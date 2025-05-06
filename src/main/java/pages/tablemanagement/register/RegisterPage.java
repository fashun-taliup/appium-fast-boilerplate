package pages.tablemanagement.register;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(AppiumDriver driver) {
        super(driver);
    }

    public RegisterPage clickCategory(int categoryId) {
        getFlutterElement("category_" + categoryId).click();
        return this;
    }

    public MyOrderItemBuilderPage clickProduct(int productId) {
        getFlutterElement("product_" + productId).click();
        return new MyOrderItemBuilderPage(this.driver);
    }
}
