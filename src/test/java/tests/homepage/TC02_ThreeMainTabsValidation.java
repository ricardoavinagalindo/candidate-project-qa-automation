package tests.homepage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Homepage;

public class TC02_ThreeMainTabsValidation extends BaseTest {

    @Test
    public void ThreeMainTabsAreDisplayed(){
        Homepage hp = new Homepage(driver);
        hp.verifyPlanifiqueSuViajeIsDisplayed();
        hp.verifyInformacionDeViajeIsDisplayed();
        hp.verifyAAdvantageIsDisplayed();
    }
}