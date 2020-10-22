package test.CarNbike.TestSuite;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.CarNbike.BaseClass.TestBase;
 
public class GetAllUrls extends TestBase{
	

	
	@BeforeTest
	public void setup() throws Exception {
		
		 
		 LaunchBrowser("chrome");
		 driver.get("https://auto.ndtv.com/sitemap.html");
		 Wait();
	}
	@DataProvider
	public void geturldata() {
		
	}
	 
@Test
public void code() {
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


