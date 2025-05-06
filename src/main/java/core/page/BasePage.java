package core.page;

import core.flutter.FlutterElement;
import core.flutter.FlutterFinder;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected AppiumDriver driver;

    protected FlutterFinder flutterFinder;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        this.flutterFinder = new FlutterFinder(driver);
    }

    public void click(WebElement elem) {
        elem.click();
    }

    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

    public FlutterElement getFlutterElement(String key) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        return wait.until(driver -> {
            try {
                return flutterFinder.byValueKey(key);
            } catch (Exception e) {
                return null;
            }
        });
    }

    public List<WebElement> getElements(By by) {
        return driver.findElements(by);
    }

    public String getText(WebElement elem) {
        return elem.getText();
    }

    public void waitForElementToBeVisible(WebElement elem) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void waitForElementToBePresent(By by) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitForElementToBePresentAndVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementTextToBe(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(by, text));
    }

    public void waitForElementTextToNotBe(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(
                ExpectedConditions.textToBe(by, text)
        ));
    }

    public void type(WebElement elem, String text) {
        elem.sendKeys(text);
    }

    public boolean isElementDisplayed(WebElement elem) {
        return elem.isDisplayed();
    }
}
