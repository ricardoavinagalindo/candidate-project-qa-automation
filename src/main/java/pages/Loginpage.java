package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Loginpage extends BasePage {

    WebElement loginPageDiv = driver.findElement(By.cssSelector("#aa-content-frame>section>h1"));

    public Loginpage(WebDriver driver) {
        super(driver);
    }

    public Loginpage verifyLoginpageIsDisplayed(){
        logger.info("[Verification] -> Verifying Loginpage loaded");
        Assert.assertTrue(loginPageDiv.isDisplayed(), "Error to display home page logo");
        return this;
    }
}