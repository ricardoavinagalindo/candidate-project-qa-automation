package tests.homepage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.TestProperties;

public class TC05_ReserveSubtabSectionValidation extends BaseTest {

    @Test
    public void LanguageSelectorValidation(){
        Homepage hp = new Homepage(driver);
        hp.verifyReserveTabIsDisplayed();
    }
}