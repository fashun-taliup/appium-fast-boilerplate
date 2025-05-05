import constants.TestGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.taliupregisterpax.login.LoginPage;

public class AndroidTest extends BaseTest {

//    @Test(groups = {TestGroups.ANDROID})
//    public void testLogText() {
//        String logText = new APIDemosHomePage(this.driver)
//                .openText()
//                .tapOnLogTextBox()
//                .tapOnAddButton()
//                .getLogText();
//
//        Assert.assertEquals(logText, "This is a test");
//    }

    @Test(
            groups = {
                    TestGroups.ANDROID,
                    TestGroups.LOGIN
            }
    )
    public void testLogin() {
        boolean isHomeGreetingVisible = new LoginPage(driver)
                .login()
                .isHomeGreetingVisible();

        Assert.assertTrue(isHomeGreetingVisible, "Login failed: Home greeting not visible.");
    }

    @Test(
            groups = {
                    TestGroups.ANDROID,
//                    TestGroups.REGISTER
            }
    )
    public void testEnterRegister() {
        boolean isButtonGridVisible = new LoginPage(driver)
                .login()
                .clickOnRegister()
                .isViewOrderButtonVisible();

        Assert.assertTrue(isButtonGridVisible, "Enter Register failed: View Order Button not visible.");
    }

    @Test(
            groups = {
                    TestGroups.ANDROID,
                    TestGroups.REGISTER
            }
    )
    public void testCustomItem() {
        int res = new LoginPage(driver)
                .login()
                .clickOnRegister()
                .tapOnCustomItem()
                .inputPriceFiveDollars()
                .clickConfirm()
                .clickViewOrder()
                .getOrderItemsCount();

        Assert.assertEquals(res, 1, "Custom item not added to order.");
    }
}
