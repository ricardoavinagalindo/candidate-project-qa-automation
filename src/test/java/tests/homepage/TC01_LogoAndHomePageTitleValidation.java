package tests.homepage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.TestProperties;

public class TC01_LogoAndHomePageTitleValidation extends BaseTest {

    @Test
    public void LogoIsDisplayed(){
        Homepage hp = new Homepage(driver);
        hp.verifyHPLogoIsDisplayed();
    }

    @Test
    public void PageTitleAssertion(){
        Homepage hp = new Homepage(driver);
        hp.verifyHPPageTitle(TestProperties.pageTitle);
    }


}
