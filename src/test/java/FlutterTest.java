import org.testng.Assert;
import org.testng.annotations.Test;

import constants.TestGroups;
import pages.tablemanagement.ActivationPage;
import pages.tablemanagement.HomePage;
import pages.tablemanagement.LoginPage;

public class FlutterTest extends BaseTest {

    @Test(groups = {TestGroups.FLUTTER})
    public void test() {
        ActivationPage activationPage = new ActivationPage(this.driver)
                .inputEmail("priyank+expresstaxe@taliup.ca")
                .inputPassword("12345678")
                .clickActivationButton();

        LoginPage loginPage = new LoginPage(this.driver)
                .selectUser(600)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1)
                .inputPin(1);

        HomePage homePage = new HomePage(this.driver)
                .navToOrderManagement();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
