package utilities.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.TestProperties;

public class DriverFactory {

    public static WebDriver getDriver() {

        //String browser = TestProperties.getBrowser();
        String browser = TestProperties.url;
        if (browser == null) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
            }
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
        }
    }
