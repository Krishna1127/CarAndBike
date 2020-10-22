package test.CarNbike.UrlTestSuite;

import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.CarNbike.BaseClass.TestBase;
import test.CarNbike.CommonMethods.UrlListdataprovider;

public class Test4 extends TestBase{

	@BeforeTest
	public void setup() throws Exception {
		
		 
		 LaunchBrowser("chrome");
		
	}
	
	 	 
@Test(dataProvider="excelData4",dataProviderClass=UrlListdataprovider.class)
public void code(String data) throws Exception {
	
	 driver.get(data);
	 Wait();
	
	 
	 URL link = new URL(data);

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
