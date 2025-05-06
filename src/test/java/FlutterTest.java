import org.testng.Assert;
import org.testng.annotations.Test;

import constants.TestGroups;
import pages.tablemanagement.ActivationPage;
import pages.tablemanagement.HomePage;
import pages.tablemanagement.LoginPage;

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
                .navToOrderManagement()
                .selectOrder(15343)
                .clickOrderCardEdit(15343);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
