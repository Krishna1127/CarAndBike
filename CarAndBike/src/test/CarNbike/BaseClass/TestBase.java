package test.CarNbike.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {
	
public static WebDriver driver;
	
	public static Properties prop;
	
	public static String propinit(String filename,String Locatername) {
		
		if(prop==null) {
			prop=new Properties();
			try {
				
	FileInputStream fis=new FileInputStream("D:\\Ediig\\CarAndBike\\src\\test\\CarNbike\\Config\\"+filename+".properties");
				prop.load(fis);
			
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
		String data=prop.getProperty(Locatername);
		return data;
	}

	public static void Wait() throws Exception {
		Thread.sleep(2000);
	}
	public static void WriteData(int row,int col,String Value) throws Exception {
		File f=new File("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Report\\testreport.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.getSheet("Sheet1");
		 Row rw= sheet.getRow(row);
			Cell cl=rw.createCell(col);
		        
		//	cl.setCellType(CellType.STRING);
		        
			cl.setCellValue(Value);
			FileOutputStream fos=new FileOutputStream(f);
			book.write(fos);
			fos.close();
		
	}
	public static void LaunchBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mfcwl1\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			
			FirefoxOptions options=new FirefoxOptions();
			options.setCapability("BrowserName","Firefox");
			options.setCapability("Version","56.0");
			options.setCapability("Platform",Platform.WINDOWS);
			options.setCapability("marionette",false);
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mfcwl1\\eclipse-workspace\\EDiig\\geckodriver.exe");
			driver=new FirefoxDriver(options);
		}
		driver.manage().window().maximize();
	}
	public static void Application() {
		driver.get(propinit("common","Url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public static WebElement getElement(String Locaterkey) {
		WebElement e=null;
		try {
			if(Locaterkey.startsWith("id"))
				e=driver.findElement(By.id(prop.getProperty(Locaterkey)));
			else if(Locaterkey.startsWith("_name"))
				e=driver.findElement(By.name(prop.getProperty(Locaterkey)));
			else if(Locaterkey.startsWith("_xpath"))
				e=driver.findElement(By.xpath(prop.getProperty(Locaterkey)));
			else {System.out.println("locater is not correct");
			}
		}catch(Exception r) {
			r.printStackTrace();
		}
		return e;
	}

}
