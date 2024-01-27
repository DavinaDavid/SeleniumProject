package TestRunner;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/"},
glue ={"TestDefinitions"},
//tags ="@smoke",
plugin = {"json:target/cucumber.json","html:src/test/resources/TestReportResults/cucumberReport.html"})

public class WebRunner {

    @BeforeClass
    public static void PathFolderCreation(){
        DateFormat timeFormat = new SimpleDateFormat("HH.mm.ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
        ExtentReports extent;
                String Path = "src/test/resources/TestReportResults/extendReport.html";
     //   System.out.println(Path);
        extent = new ExtentReports();
    }


}
