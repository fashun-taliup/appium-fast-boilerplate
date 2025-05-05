package pages.taliupregisterpax.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import pages.taliupregisterpax.home.HomePage;

public class LoginPage extends BasePage {
    private final By loginButton = By.id("com.taliup.register:id/btn_login");
    private final By passwordInput = By.xpath("//*[@resource-id='com.taliup.register:id/et_passcode']//*[@resource-id='com.taliup.register:id/editText']");


    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickLogin() {
        WebElement button = getElement(loginButton);
        click(button);

    }

    public HomePage login() {
        waitForElementTextToNotBe(passwordInput, "");
        WebElement pw = getElement(passwordInput);
        type(pw, "111111");
        clickLogin();
        return new HomePage(driver);
    }


}
