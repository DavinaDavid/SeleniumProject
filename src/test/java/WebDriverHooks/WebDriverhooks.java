package WebDriverHooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.checkerframework.checker.units.qual.C;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverhooks {

    private static WebDriver driver;
    private static WebDriverhooks instance;

    public WebDriverhooks(){
        driver = new ChromeDriver();
            driver.manage().window().maximize();
    }

    public static WebDriverhooks getInstance(){
        if(instance == null){
            instance = new WebDriverhooks();
        }
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }


    @AfterAll
   static public void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver = null;
            instance = null;
        }
    }
}
