package test.CarNbike.TestSuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.CarNbike.BaseClass.TestBase;

public class Test1 extends TestBase{

	@BeforeTest
	public void setup() throws Exception {
		LaunchBrowser("Chrome");
		
		driver.get("https://carandbike:kar8kiaZ@stage.carandbike.com/used");
		
		Wait();
		
	}
	@Test
	public void code() {
		driver.findElement(By.xpath("//*[@id=\"seo-widget-form\"]/div/div[1]/a/div[1]/img")).click();
		
		driver.get("driver.get(\"https://carandbike:kar8kiaZ@stage-auto.ndtv.com/used\");");
	}
	@AfterTest
	public void teardown() {
		driver.close();
		
		
	}
}

