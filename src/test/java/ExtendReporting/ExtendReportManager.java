package ExtendReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static synchronized ExtentReports getExtentReports(){
        if (extent == null){
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extendReport.html");
      //  ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extendReport.html");
       //     ExtentSparkReporter sparkReporter = new ExtentSparkReporter("src/test/resources/ExtendReportResults/extendReport.html");

            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("Home Mortgage Workflow Testing");
            sparkReporter.config().setReportName("Test Report");
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            System.out.println("Report Themes etc set");
        }
        return extent;
    }

    private static synchronized void startTest(String testName) {
        ExtentTest extendTest = getExtentReports().createTest(testName);
        test.set(extendTest);
    }

    public static ExtentTest getTest() {
       return test.get();
    }

    public static synchronized void endTest(){
        getExtentReports().flush();
    }
}
