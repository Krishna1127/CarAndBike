package test.CarNbike.ProdTestSuite;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.CarNbike.BaseClass.TestBase;
import test.CarNbike.CommonMethods.DataprovideData;

public class LinkTest extends TestBase{
	
	@BeforeTest
	public void setup() throws Exception {
		
		 
		 LaunchBrowser("chrome");
		
	}
	
	 	 
@Test(dataProvider="excelData",dataProviderClass=DataprovideData.class)
public void code(String data) throws Exception {
	
	 driver.get(data);
	 Wait();
	 URL link = new URL(data);
	 
	 if(driver.findElements(By.tagName("html")).size()>0)
		    System.out.println("Html tag is present");
		else
		    System.out.println("html tag is not present");

	 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
	
	 httpConn.setConnectTimeout(2000);
	
	 httpConn.connect();
 
	 if(httpConn.getResponseCode()== 200) { 
	 System.out.println(data+" - "+httpConn.getResponseMessage());
	 }if(httpConn.getResponseCode()== 404) {
		 System.out.println(data+" - "+httpConn.getResponseMessage());
		 }
	
	    } 
	 @AfterTest
	 public void teardown() {
		 
		 driver.close();
		 driver.quit();
	 }

}
