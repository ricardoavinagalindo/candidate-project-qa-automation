package tests.homepage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Loginpage;

public class TC03_IngreseButtonValidation extends BaseTest {

    @Test
    public void LoginButtonValidation(){
        Homepage hp = new Homepage(driver);
        hp.verifyIngreseButtonIsDisplayed();
        hp.loginButtonClick();
        Loginpage lp = new Loginpage(driver);
        lp.verifyLoginpageIsDisplayed();
    }
}