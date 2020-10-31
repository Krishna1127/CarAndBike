package test.CarNbike.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;


import test.CarNbike.BaseClass.TestBase;

public class utils extends TestBase{

	public static JavascriptExecutor jse;
   static FileInputStream reader;
	public static void Scroll() {
		
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,150);");
		
	}
	public static ArrayList<Object[]> getdatafromexcel() {
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		try {
			 reader=new FileInputStream("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\urlSheet.xlsx");
			 XSSFWorkbook wb=new XSSFWorkbook();
				XSSFSheet sheet=wb.getSheet("Sheet1");
				for(int rownum=2;rownum<=sheet.getLastRowNum();rownum++) {
					String data=sheet.getRow(rownum).getCell(0).getStringCellValue();
					Object ob[]= {data};
					mydata.add(ob);
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return mydata;
	}

	
	 public static ArrayList<String> readExcel(String filepath) throws  IOException {
		 FileInputStream file= new FileInputStream(filepath);
	      HSSFWorkbook workbook=new HSSFWorkbook(file);
	        HSSFSheet sheet = workbook.getSheet("Sheet2");
	        HSSFCell row=sheet.getRow(0).getCell(0);
	     
	        Iterator<Row> rowit=sheet.iterator();
	        ArrayList<String> list=new ArrayList<String>();
	        while(rowit.hasNext()) {
	        
	        	list.add(rowit.next().getCell(0).getStringCellValue());
	        	 
	     	}
	        	
	         return list;
     }


	
	public static String Exceldata(String Sheetname,int Row,int Cell) throws Exception {
		FileInputStream fis =new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.getSheet(Sheetname);
		XSSFCell cel=sheet.getRow(Row).getCell(Cell);
		String data=cel.getStringCellValue();
		return data;
	}
	public static void Screenshot(String fileName) throws Exception {
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("D:\\Ediig\\CarAndBike\\src\\screenshots"+fileName+".png"));
	}
	public static void tearDown() {

		
		driver.close();
		driver.quit();
	}
}
