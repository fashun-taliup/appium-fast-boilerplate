package pages.tablemanagement;

import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class ActivationPage extends BasePage {

    public ActivationPage(AppiumDriver driver) {
        super(driver);
    }

    public ActivationPage clickActivationButton() {
        WebElement element = getFlutterElement("activation_button");
        element.click();
        return this;
    }

    public String getActivationButtonText() {
        WebElement element = getFlutterElement("activation_button");

        return element.getText();
    }
}
