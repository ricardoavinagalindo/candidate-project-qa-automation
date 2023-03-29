package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Homepage extends BasePage {

    public Homepage(WebDriver driver) {
        super(driver);
    }

    WebElement homePageLogo = driver.findElement(By.xpath("//img[@src='/content/images/chrome/rebrand/aa-logo.png']"));
    WebElement planifiqueSuViajeBtn = driver.findElement(By.id("plan-travel-expander"));
    WebElement informacionDeViajeBtn = driver.findElement(By.id("travel-information-expander"));
    WebElement aAdvantageBtn = driver.findElement(By.id("aadvantage-expander"));
    WebElement loginBtn = driver.findElement(By.id("log-in-button"));
    WebElement langSelectBtn = driver.findElement(By.cssSelector(".js-dropdown-trigger"));
    WebElement langSelectCtyDropD = driver.findElement(By.id("aa-country-selector"));
    WebElement langSelectLangDropD = driver.findElement(By.id("aa-language-selector"));
    WebElement langSelectFrm = driver.findElement(By.id("splashForm"));
    WebElement reserveTab = driver.findElement(By.id("aa-tab-booking-module"));

    public Homepage verifyHPLogoIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying Homepage logo");
        Assert.assertTrue(homePageLogo.isDisplayed(), "Error to display home page logo");
        return this;
    }
    public Homepage verifyHPPageTitle(String expected){
        logger.info("[VERIFICATION] -> Verifying Home page title is correct :" + driver.getTitle() + " -> " + expected);
        Assert.assertEquals(driver.getTitle(), expected);
        return this;
    }
    public Homepage verifyPlanifiqueSuViajeIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying 'PLANIFIQUE SU VIAJE' button displayed");
        Assert.assertTrue(planifiqueSuViajeBtn.isDisplayed(), "Error displaying 'PLANIFIQUE SU VIAJE' element");
        return this;
    }
    public Homepage verifyInformacionDeViajeIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying 'INFORMACION DE VIAJE' button displayed");
        Assert.assertTrue(informacionDeViajeBtn.isDisplayed(), "Error displaying 'INFORMACIÖN DE VIAJE' element");
        return this;
    }
    public Homepage verifyAAdvantageIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying 'AADVANTAGE' button displayed");
        Assert.assertTrue(aAdvantageBtn.isDisplayed(), "Error displaying 'ADVANTAGE' element");
        return this;
    }
    public Homepage verifyIngreseButtonIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying 'INGRESE' button displayed");
        Assert.assertTrue(loginBtn.isDisplayed(), "Error displaying 'INGRESE' element");
        return this;
    }
    public Loginpage loginButtonClick(){
        logger.info("[ACTION] -> Clicking on 'INGRESE' button");
        loginBtn.click();
        return new Loginpage(driver);
    }
    public Homepage verifyLanguageSelectorIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying language selector button displayed");
        Assert.assertTrue(langSelectBtn.isDisplayed(), "Error displaying language selector element");
        return this;
    }
    public Homepage languageSelectorButtonClick(){
        logger.info("[ACTION] -> Clicking on language selector button");
        langSelectBtn.click();
        return this;
    }
    public Homepage verifyLanguageSelectorFormIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying language selector form is displayed");
        Assert.assertTrue(langSelectFrm.isDisplayed(), "Error displaying language selector form loaded after clicking on it");
        return this;
    }

    public Homepage verifyLanguageSelectorDefaultValues(String CtyDftValue, String LangDftValue){
        logger.info("[VERIFICATION] -> Verifying language selector form default values are correct: " + langSelectCtyDropD.getAttribute("value") + " -> " +  CtyDftValue);
        Assert.assertEquals(langSelectCtyDropD.getAttribute("value"),CtyDftValue);
        logger.info("[VERIFICATION] -> Verifying language selector form default values are correct: " + langSelectLangDropD.getText().trim() + " -> " +  LangDftValue);
        Assert.assertEquals(langSelectLangDropD.getText().trim(), LangDftValue);
        return this;
    }

    public Homepage verifyReserveTabIsDisplayed(){
        logger.info("[VERIFICATION] -> Verifying 'Reserve' tab is displayed");
        Assert.assertTrue(reserveTab.isDisplayed(), "Error displaying 'Reserve' tab on homepage");
        return this;
    }

}
