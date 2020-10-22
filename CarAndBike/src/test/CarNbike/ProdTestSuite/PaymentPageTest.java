package test.CarNbike.ProdTestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.CarNbike.BaseClass.TestBase;
import test.CarNbike.CommonMethods.ProdTestCommon;
import test.CarNbike.Utility.utils;

public class PaymentPageTest extends TestBase{

	
	@BeforeTest
	public void setup() throws Exception {
		LaunchBrowser("chrome");
		Application();
		Wait();
	}
	@Test
	public void code() throws Exception {
		ProdTestCommon.Location();
		
		ProdTestCommon.search("Ampere");
		ProdTestCommon.PageCheck();
		utils.Screenshot("payment page");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		
	}
	
	
}
