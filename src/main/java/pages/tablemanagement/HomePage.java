package pages.tablemanagement;

import org.openqa.selenium.WebElement;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import pages.tablemanagement.floorplan.FloorPlanPage;

public class HomePage extends BasePage {

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public HomePage navToDashboard() {
        WebElement element = getFlutterElement("nav_bar_dashboard");
        element.click();
        return this;
    }

    public FloorPlanPage navToFloorPlan() {
        WebElement element = getFlutterElement("nav_bar_floor_plan");
        element.click();
        return new FloorPlanPage(this.driver);
    }

    public OrderManagementPage navToOrderManagement() {
        WebElement element = getFlutterElement("nav_bar_order_management");
        element.click();
        return new OrderManagementPage(this.driver);
    }

    public HomePage navToStaffManagement() {
        WebElement element = getFlutterElement("nav_bar_staff_management");
        element.click();
        return this;
    }

    public HomePage navToSettings() {
        WebElement element = getFlutterElement("nav_bar_settings");
        element.click();
        return this;
    }

    public HomePage clickLogout() {
        WebElement element = getFlutterElement("nav_bar_logout");
        element.click();
        return this;
    }

    public LoginPage clickLogoutConfirm() {
        WebElement element = getFlutterElement("logout_confirm");
        element.click();
        return new LoginPage(this.driver);
    }


}
