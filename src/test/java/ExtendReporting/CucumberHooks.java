package ExtendReporting;

import WebDriverHooks.WebDriverhooks;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class CucumberHooks {
    private static ExtentReports extent = ExtendReportManager.getExtentReports();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    WebDriverhooks webDriverhooks;

    @Before
    public void beforeScenario(Scenario scenario){
        ExtentTest extentTest = extent.createTest(scenario.getName());
        test.set(extentTest);
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException{
        ExtentTest extentTest = test.get();
        if(scenario.isFailed()){
            WebDriver driver = WebDriverhooks.getInstance().getDriver();
            TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
            String base64Screenshot = takesScreenshot.getScreenshotAs(OutputType.BASE64);
            extentTest.fail("Scenario failed: "+ scenario.getName() + ". Reason: "+ scenario.getStatus());
            MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot);
            System.out.println("Failed Cases Executed!");
        }
        else{
            extentTest.pass("Scenario Passed: "+ scenario.getName());
            System.out.println("All Cases Executed!");
        }
        extent.flush();

        WebDriverhooks.getInstance().closeDriver();
    }

}
