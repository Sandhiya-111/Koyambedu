package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterClass;

public class ExtentReport {
ExtentSparkReporter sparkReporter;
    public ExtentReports reports;
    public ExtentTest test;
//@BeforeClass
    public void extentReporting()
    {

         reports.attachReporter(sparkReporter);
         sparkReporter.config().setDocumentTitle("Koyambedu");
         sparkReporter.config().setReportName("Koyambedu Regression Test");
         sparkReporter.config().setTheme(Theme.DARK);
         reports.setSystemInfo("Koyambedu","version1");


    }

    @AfterClass
    public void teardown()
    {
    reports.flush();
    }

}
