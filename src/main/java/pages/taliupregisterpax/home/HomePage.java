package pages.taliupregisterpax.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import pages.taliupregisterpax.register.RegisterPage;

public class HomePage extends BasePage {
    private final By homeGreetingText = By.id("com.taliup.register:id/greeting_text");
    private final By registerButton = By.id("com.taliup.register:id/btn_register");

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isHomeGreetingVisible() {
        waitForElementToBePresentAndVisible(homeGreetingText);
        WebElement greeting = getElement(homeGreetingText);
        return isElementDisplayed(greeting);
    }

    public RegisterPage clickOnRegister() {
        waitForElementToBePresentAndVisible(registerButton);
        WebElement button = getElement(registerButton);
        click(button);
        return new RegisterPage(driver);
    }
}