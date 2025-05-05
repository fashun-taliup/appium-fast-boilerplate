package pages.taliupregisterpax.register.customitempopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import pages.taliupregisterpax.register.RegisterPage;

public class CustomItemPopupPage extends BasePage {
    private final By priceInput = By.id("com.taliup.register:id/custom_item_price");
    private final By btn5 = By.id("com.taliup.register:id/tv_5");
    private final By btn0 = By.id("com.taliup.register:id/tv_0");
    private final By btnConfirm = By.id("com.taliup.register:id/btn_confirm");

    public CustomItemPopupPage(AppiumDriver driver) {
        super(driver);
    }

    public CustomItemPopupPage inputPriceFiveDollars() {
        WebElement b0 = getElement(btn0);
        WebElement b5 = getElement(btn5);
        click(b5);
        click(b0);
        click(b0);
        return this;
    }

    public String getPrice() {
        WebElement input = getElement(priceInput);
        return getText(input);
    }

    public RegisterPage clickConfirm() {
        WebElement button = getElement(btnConfirm);
        click(button);
        return new RegisterPage(driver);
    }
}