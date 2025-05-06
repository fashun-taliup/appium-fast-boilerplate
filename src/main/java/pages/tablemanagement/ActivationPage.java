package pages.tablemanagement;

import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class ActivationPage extends BasePage {

    public ActivationPage(AppiumDriver driver) {
        super(driver);
    }

    public ActivationPage inputEmail(String email) {
        WebElement element = getFlutterElement("activation_email");
        type(element, email);
        return this;
    }

    public ActivationPage inputPassword(String password) {
        WebElement element = getFlutterElement("activation_password");
        type(element, password);
        return this;
    }

    public LoginPage clickActivationButton() {
        WebElement element = getFlutterElement("activation_button");
        element.click();
        return new LoginPage(this.driver);
    }

    public String getActivationButtonText() {
        WebElement element = getFlutterElement("activation_button");
        return element.getText();
    }
}
