package test.CarNbike.TestSuite;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.CarNbike.BaseClass.TestBase;
import test.CarNbike.CommonMethods.DataprovideData;

public class UrlTestBrokenlinks6 extends TestBase{
	
	@BeforeTest
	public void setup() throws Exception {
		
		 
		 LaunchBrowser("chrome");
		
	}
	
	 	 
@Test(dataProvider="urllist6",dataProviderClass=DataprovideData.class)
public void code(String data) throws Exception {
	
	 driver.get(data);
	 Wait();
	 List<WebElement> links = driver.findElements(By.tagName("a")); 

	 System.out.println("Total links are "+links.size()); 
	 
	 for(int i=0; i<links.size(); i++) {
	 WebElement element = links.get(i);

	 String url=element.getAttribute("href");
	
	 verifyLink(url); 
	 } 
	 }
	 
	
	 public static void verifyLink(String urlLink) {

	        try {

	 URL link = new URL(urlLink);

	 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
	
	 httpConn.setConnectTimeout(2000);
	
	 httpConn.connect();
 
	 if(httpConn.getResponseCode()== 200) { 
	 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
	 }
	 if(httpConn.getResponseCode()== 404) {
	 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
	 }
	 }

	 catch (Exception e) {
	 //e.printStackTrace();
	 }
	    } 
	 @AfterTest
	 public void teardown() {
		 
		 driver.close();
		 driver.quit();
	 }

	

}
