package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testchrome {

    WebDriver driver;

    @BeforeClass
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {
        // Exercise
        driver.get("https://www.aa.com/homePage.do?locale=es_MX");
        String title = driver.getTitle();
        Assert.assertEquals(title,"American Airlines - Boletos aéreos y vuelos baratos en AA.com");
    }
}
