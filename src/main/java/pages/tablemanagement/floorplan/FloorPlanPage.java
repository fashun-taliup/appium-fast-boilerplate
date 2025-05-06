package pages.tablemanagement.floorplan;

import core.flutter.FlutterElement;
import core.page.BasePage;
import io.appium.java_client.AppiumDriver;

public class FloorPlanPage extends BasePage {
    public FloorPlanPage(AppiumDriver driver) {
        super(driver);
    }

    public FloorPlanPage manageFloorPlan() {
        getFlutterElement("manage_floor_plan_button").click();
        return this;
    }

    public FloorPlanPage saveFloorPlan() {
        getFlutterElement("save_floor_plan_button").click();
        return this;
    }

    public AddTableDialogPage openAddTableDialog() {
        getFlutterElement("add_table_button").click();
        return new AddTableDialogPage(this.driver);
    }

    public FlutterElement getTableAt(int tableIndex) {
        return getFlutterElement("table_index_" + tableIndex);
    }
}
