package pages.tablemanagement;

import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }


    public LoginPage selectUser(int userId) {
        WebElement element = getFlutterElement("user_avatar_" + userId);
        element.click();
        return this;
    }

    public LoginPage inputPin(int pin) {
        if (pin < 0 || pin > 9) {
            throw new IllegalArgumentException("Pin must be between 0 and 9");
        }
        WebElement element = getFlutterElement("pin_input_" + pin);
        element.click();
        return this;
    }

    public LoginPage inputPinDel() {
        WebElement element = getFlutterElement("pin_input_delete");
        element.click();
        return this;
    }

}
