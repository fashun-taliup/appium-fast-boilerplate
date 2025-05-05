import org.testng.Assert;
import org.testng.annotations.Test;

import constants.TestGroups;
import pages.tablemanagement.ActivationPage;

public class FlutterTest extends BaseTest {

    @Test(groups = {TestGroups.FLUTTER})
    public void test() {
        new ActivationPage(this.driver)
                .clickActivationButton();

//        Assert.assertEquals(res, "Activate", "Activation button text is not as expected.");
    }
}
