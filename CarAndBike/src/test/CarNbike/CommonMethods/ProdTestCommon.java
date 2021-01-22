package test.CarNbike.CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import test.CarNbike.BaseClass.TestBase;

public class ProdTestCommon extends TestBase{

	
	public static void Location() throws Exception {
		
driver.findElement(By.xpath("//*[@id=\"ul-global-nav\"]/li[15]/span/span")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Chennai')]")).click();
		Wait();
	}
	public static void search(String keyword) throws Exception {
		
		driver.findElement(By.xpath("//*[@id=\"schemaheader\"]/div/div[1]/div/label/img")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(keyword);
		driver.findElement(By.xpath("//button[@id='btn-main-search']")).click();
		Wait();
		
	}
	public static void PageCheck() throws Exception {
		
	driver.findElement(By.xpath("//a[contains(text(),'Ampere Zeal Ex')]")).click();
		Wait();
		driver.findElement(By.xpath("//a[contains(text(),'Book @ ₹ 999')]")).click();
		Wait();
		driver.findElement(By.xpath("//input[@id='quickuserinfoform-name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@id='quickuserinfoform-email']")).sendKeys("hari.qaeng07@gmail.com");
		driver.findElement(By.xpath("//input[@id='quickuserinfoform-mobile']")).sendKeys("9700667771");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='quickuserinfoform-pincode']")).sendKeys("600001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='quickuserinfoform-pincode']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		//Select dealer=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_dealer']")));
		//dealer.selectByIndex(0);
		driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_dealer']")).click();
		driver.findElement(By.xpath("//*[@id=\"quickuserinfoform-id_dealer\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='proceed-button']")).click();
		Wait();
		driver.findElement(By.xpath("//input[@id='txt_verification_code_19']")).sendKeys("1919");
		driver.findElement(By.xpath("//button[@id='proceed-button']")).click();
		Wait();
		Wait();
		Wait();
		driver.findElement(By.xpath("//button[contains(text(),'Pay Now ₹ 999')]")).click();
		Wait();
		
	}
}
