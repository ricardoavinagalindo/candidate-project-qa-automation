package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.TestProperties;
import utilities.driver.DriverFactory;

import java.lang.reflect.Method;
import java.util.logging.Logger;


public class BaseTest {
    public static WebDriver driver = null;
    protected Logger logger = Logger.getLogger(BaseTest.class.getName());

    @BeforeSuite
    public void loadProperties(){
        TestProperties.loadAllProperties();
    }

    @BeforeClass
    public void initializeDriver(){
        driver = DriverFactory.getDriver();
        driver.get(TestProperties.url);
    }

    @BeforeMethod
    public void logTestInformation(Method method){
        logger.info("Start test method: " + method.getName() + " from test class " + method.getDeclaringClass().getName());
    }

    @AfterClass
    public void quiteBrowserAfterTestMethod(){
        logger.info("After test method, tearing down");
        driver.quit();
    }
}
