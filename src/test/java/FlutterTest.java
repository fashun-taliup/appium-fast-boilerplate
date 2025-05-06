import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.TestGroups;
import core.flutter.FlutterElement;
import pages.tablemanagement.ActivationPage;
import pages.tablemanagement.HomePage;
import pages.tablemanagement.floorplan.FloorPlanPage;

public class FlutterTest extends BaseTest {

    @Test(groups = {TestGroups.FLUTTER})
    public void test() {
        new ActivationPage(this.driver)
                .inputEmail("priyank+expresstaxe@taliup.ca")
                .inputPassword("12345678")
                .clickActivationButton()
                .selectUser(600)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1);

        new HomePage(this.driver)
                .navToFloorPlan()
                .manageFloorPlan()
                .openAddTableDialog()
                .selectTableShape("circle")
                .addNewTable()
                .saveFloorPlan();

        FlutterElement tableFilter = new HomePage(this.driver)
                .navToOrderManagement()
                .getOrderTableFilterAt(0);

        assertNotNull(tableFilter, "Table filter not found");
    }

}
