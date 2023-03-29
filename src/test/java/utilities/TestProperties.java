package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;


public class TestProperties {
    public static Logger logger = Logger.getLogger(TestProperties.class.getName());
    public static final Properties props = new Properties();
    public static final Object lock = new Object();
    public static String propertyFilePath = System.getProperty("user.dir")+
            "\\src\\configuration.properties";
    public static String url;
    public static String browser;
    public static String pageTitle;
    public static String langSelectCty;
    public static String langSelectLang;

    public static void loadAllProperties() {
        try {
            FileInputStream Locator;
            Locator = new FileInputStream("src/configuration.properties");
            props.load(Locator);
        } catch (IOException e) {
            logger.info("Could not load properties : " + e.getMessage());
        }

        url = props.getProperty("url");
        browser = props.getProperty("browser");
        pageTitle = props.getProperty("page_title");
        langSelectCty = props.getProperty("langSelectCty");
        langSelectLang = props.getProperty("langSelectLang");
    }
}
