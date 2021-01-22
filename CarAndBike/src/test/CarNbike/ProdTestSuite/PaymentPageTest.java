package test.CarNbike.ProdTestSuite;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import test.CarNbike.BaseClass.TestBase;
import test.CarNbike.CommonMethods.ProdTestCommon;
import test.CarNbike.Utility.utils;

public class PaymentPageTest extends TestBase{

	static ExtentTest test;
	static ExtentReports report;
	@BeforeTest
	public void setup() throws Exception {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResult.html");
		test = report.startTest("JAWA TEST REPORT");
				
		LaunchBrowser("chrome");
		Application();
		Wait();
	}
	@Test
	public void code() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ProdTestCommon.Location();
		
		ProdTestCommon.search("Ampere");
		ProdTestCommon.PageCheck();
		utils.Screenshot("payment page");
	}
	
	@AfterTest
	public void teardown() {
		report.endTest(test);
		report.flush();
		driver.close();
		driver.quit();
		
	}
	
	
}
