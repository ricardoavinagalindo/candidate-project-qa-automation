package base;

import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

public class BasePage {
    protected WebDriver driver;
    protected Logger logger = Logger.getLogger(BasePage.class.getName());
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
