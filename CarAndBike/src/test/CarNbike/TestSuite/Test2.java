package test.CarNbike.TestSuite;

import java.io.FileInputStream;

import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;


import test.CarNbike.BaseClass.TestBase;

public class Test2 extends TestBase{
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file= new FileInputStream("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap1.xls");
      HSSFWorkbook workbook=new HSSFWorkbook(file);
        HSSFSheet sheet = workbook.getSheet("Sheet1");
        HSSFCell row=sheet.getRow(0).getCell(0);
     
        Iterator<Row> rowit=sheet.iterator();
        while(rowit.hasNext()) {
        
        	 String data=rowit.next().getCell(1).getStringCellValue();
             System.out.println(data);
     	}
        	
        }
       

}
