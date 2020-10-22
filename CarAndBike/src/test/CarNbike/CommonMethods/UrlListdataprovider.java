package test.CarNbike.CommonMethods;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import test.CarNbike.BaseClass.TestBase;
import test.CarNbike.Utility.utils;

public class UrlListdataprovider extends TestBase{
	
	@DataProvider(name="excelData1")
    public Iterator<String> gettestdata1() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap1.xls");
    	return testdata.iterator();
    }


	@DataProvider(name="excelData2")
    public Iterator<String> gettestdata2() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap2.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData3")
    public Iterator<String> gettestdata3() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap3.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData4")
    public Iterator<String> gettestdata4() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap4.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData5")
    public Iterator<String> gettestdata5() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap5.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData6")
    public Iterator<String> gettestdata6() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap6.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData7")
    public Iterator<String> gettestdata7() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap7.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData8")
    public Iterator<String> gettestdata8() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap8.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData9")
    public Iterator<String> gettestdata9() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap9.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData10")
    public Iterator<String> gettestdata10() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap10.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData11")
    public Iterator<String> gettestdata11() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap11.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData12")
    public Iterator<String> gettestdata12() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap12.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData13")
    public Iterator<String> gettestdata13() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap13.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData14")
    public Iterator<String> gettestdata14() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap14.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData15")
    public Iterator<String> gettestdata15() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap15.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData16")
    public Iterator<String> gettestdata16() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap16.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData17")
    public Iterator<String> gettestdata17() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap17.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData18")
    public Iterator<String> gettestdata18() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap18.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData19")
    public Iterator<String> gettestdata19() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap19.xls");
    	return testdata.iterator();
    }
	@DataProvider(name="excelData20")
    public Iterator<String> gettestdata20() throws Exception{
    	
    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\Urls\\Sitemap20.xls");
    	return testdata.iterator();
    }
	
}
