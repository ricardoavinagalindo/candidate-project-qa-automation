package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.driver.DriverFactory;

public class TestWebDriverManager {

    public static WebDriver driver;

    @BeforeSuite
    public void initializeDriver(){
        driver = DriverFactory.getDriver();
    }

    @Test
    void test() {
        driver.get("https://www.aa.com/homePage.do");
        String title = driver.getTitle();
        Assert.assertEquals(title,"American Airlines - Boletos aéreos y vuelos baratos en AA.com");
    }

    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }
}
