package tests.homepage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.TestProperties;

public class TC04_LanguageSelectorValidation extends BaseTest {

    @Test
    public void LanguageSelectorValidation(){
        Homepage hp = new Homepage(driver);
        hp.verifyLanguageSelectorIsDisplayed();
        hp.languageSelectorButtonClick();
        hp.verifyLanguageSelectorFormIsDisplayed();
        hp.verifyLanguageSelectorDefaultValues(TestProperties.langSelectCty, TestProperties.langSelectLang);
    }
}