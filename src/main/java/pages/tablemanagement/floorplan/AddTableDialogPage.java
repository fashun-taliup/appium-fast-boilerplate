package pages.tablemanagement.floorplan;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class AddTableDialogPage extends BasePage {
    public AddTableDialogPage(AppiumDriver driver) {
        super(driver);
    }

    public AddTableDialogPage selectTableShape(String shape) {
        getFlutterElement("new_table_shape_" + shape).click();
        return this;
    }

    public FloorPlanPage addNewTable() {
        getFlutterElement("add_table_confirm").click();
        return new FloorPlanPage(this.driver);
    }
}
