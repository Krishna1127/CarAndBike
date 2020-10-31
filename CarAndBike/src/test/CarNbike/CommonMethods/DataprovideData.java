package test.CarNbike.CommonMethods;


import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import test.CarNbike.Utility.utils;

public class DataprovideData {
	
	@DataProvider(name="urllist1")
	 public static Object[][] getdatafromprovider(){
		 
		 return new Object[][] {
			 {"http://auto.ndtv.com/"},{"http://auto.ndtv.com/new-cars/cars-under-3-lakh"},
			 {"http://auto.ndtv.com/new-cars/cars-under-4-lakh"},{"http://auto.ndtv.com/new-cars/cars-between-5-to-10-lakh"},
			 {"http://auto.ndtv.com/new-cars/cars-between-10-to-20-lakh"},{"http://auto.ndtv.com/new-cars/cars-between-20-to-50-lakh"},
			 {"http://auto.ndtv.com/new-cars/petrol-cars"},{"http://auto.ndtv.com/new-cars/diesel-cars"},
			 {"http://auto.ndtv.com/new-cars/hatchback-cars"},{"http://auto.ndtv.com/new-cars/sedan-cars"},
			 {"http://auto.ndtv.com/new-cars/suv-cars"},{"http://auto.ndtv.com/compare-bikes/honda-activa-6g-1626-vs-honda-activa-5g-1400"}
		 };
	 }
	@DataProvider(name="urllist2")
	 public static Object[][] getdatafromprovider1(){
		 
		 return new Object[][] {
			 {"http://auto.ndtv.com/new-bikes/popular-bike-models"},{"http://auto.ndtv.com/used/bikes-for-sale"},
			 {"http://auto.ndtv.com/new-cars/suv-cars"},{"http://auto.ndtv.com/used/sell-bikes"},
			 {"http://auto.ndtv.com/new-cars/diesel-cars"},{"http://auto.ndtv.com/new-bikes/launches"},
			 {"http://auto.ndtv.com/new-cars/cars-between-10-to-20-lakh"},{"http://auto.ndtv.com/new-cars/sedan-cars"},
			 {"http://auto.ndtv.com/new-cars/petrol-cars"},{"http://auto.ndtv.com/new-cars/cars-under-3-lakh"},
			 {"http://auto.ndtv.com/new-bikes"},{"http://auto.ndtv.com/new-cars/hatchback-cars"},
			 {"http://auto.ndtv.com/new-cars/cars-between-5-to-10-lakh"},{"http://auto.ndtv.com/new-cars/cars-between-20-to-50-lakh"}
		 };
	 }		

	@DataProvider(name="urllist3")
	 public static Object[][] getdatfromprovider2(){
		 
		 return new Object[][] {
			 {"http://auto.ndtv.com/new-cars/popular-car-models"},{"http://auto.ndtv.com/used/want-cars"},
			 {"http://auto.ndtv.com/used/cars-for-sale"},{"http://auto.ndtv.com/compare-cars"},
			 {"http://auto.ndtv.com/used/sell-cars"},{"http://auto.ndtv.com/new-cars/models"},
			 {"http://auto.ndtv.com/used"},{"http://auto.ndtv.com/new-cars"},
			 {"http://auto.ndtv.com/bmw-cars"},{"http://auto.ndtv.com/audi-cars"},
			 {"http://auto.ndtv.com/hyundai-cars"},{"http://auto.ndtv.com/maruti-suzuki-cars"},
			 {"http://auto.ndtv.com/car-dealers/mahindra"},{"http://auto.ndtv.com/car-dealers/maruti-suzuki"}
		 };
	 }		
	@DataProvider(name="urllist4")
	 public static Object[][] getdatfromprovider3(){
		 
		 return new Object[][] {
			 {"http://auto.ndtv.com/used/maruti-suzuki-alto-cars-in-mysore-45508-296d9"},{"http://auto.ndtv.com/used/hatchback-cars"},
			 {"http://auto.ndtv.com/car-dealers/land-rover/hyderabad"},{"http://auto.ndtv.com/audi-cars/a6"},
			 {"http://auto.ndtv.com/car-dealers/audi/hyderabad"},{"http://auto.ndtv.com/car-dealers/audi/chandigarh"},
			 {"http://auto.ndtv.com/car-dealers/skoda/pune"},{"http://auto.ndtv.com/mercedes-benz-cars"},
			 {"http://auto.ndtv.com/car-dealers/audi/mumbai"},{"http://auto.ndtv.com/jaguar-cars/xj"},
			 {"http://auto.ndtv.com/jaguar-cars"},{"http://auto.ndtv.com/car-dealers/tata/hyderabad"},
			 {"http://auto.ndtv.com/car-dealers/isuzu/pune"},{"http://auto.ndtv.com/car-dealers/tata/new-delhi"}
		 };
	 }		
	@DataProvider(name="urllist5")
	 public static Object[][] getdatfromprovider4(){
		 
		 return new Object[][] {
			 {"https://auto.ndtv.com/new-cars/petrol-cars"},{"https://auto.ndtv.com/new-cars/diesel-cars"},
			 {"https://auto.ndtv.com/new-cars/hatchback-cars"},{"https://auto.ndtv.com/new-cars/sedan-cars"},
			 {"https://auto.ndtv.com/new-cars/suv-cars"},{"https://auto.ndtv.com/used/sell-cars"},
			 {"https://auto.ndtv.com/mahindra-cars"},{"https://auto.ndtv.com/kia-cars"},
			 {"https://auto.ndtv.com/volkswagen-cars"},{"https://auto.ndtv.com/bmw-cars"},
			 {"https://auto.ndtv.com/new-cars/popular-car-models"},{"https://auto.ndtv.com/upcoming-cars"},
			 {"https://auto.ndtv.com/hero-honda-bikes"},{"https://auto.ndtv.com/indian-bikes"}
		 };
	 }		
	@DataProvider(name="urllist6")
	 public static Object[][] getdatfromprovider5(){
		 
		 return new Object[][] {
			 {"http://auto.ndtv.com/car-dealers/jaguar/gurgaon"},{"http://auto.ndtv.com/car-dealers/jaguar/chennai"},
			 {"http://auto.ndtv.com/car-dealers/toyota/pune"},{"http://auto.ndtv.com/car-dealers/nissan/gurgaon"},
		
		 };
	 }		
	
	@DataProvider(name="urllist7")
	 public static Object[][] getdatafromprovider6(){
		 
		 return new Object[][] {
			 {"https://www.carandbike.com/native/general/quality-assurance/get-product-urls?all=true"},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""}
		 };
	 }	
	@DataProvider(name="urllist8")
	 public static Object[][] getdatfromprovider7(){
		 
		 return new Object[][] {
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""}
		 };
	 }	
	@DataProvider(name="urllist9")
	 public static Object[][] getdatfromprovider8(){
		 
		 return new Object[][] {
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""}
		 };
	 }		
	@DataProvider(name="urllist10")
	 public static Object[][] getdatfromprovider9(){
		 
		 return new Object[][] {
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""},
			 {""},{""}
		 };
	 }		
	
	@DataProvider(name="Stageurldata")
	 public static Object[][] getstagedatfromprovider(){
		 
		 return new Object[][] {
			 {"https://carandbike:kar8kiaZ@stage.carandbike.com/used"},{"https://carandbike:kar8kiaZ@stage.carandbike.com/used/cars-for-sale"},
			 {"https://carandbike:kar8kiaZ@stage.carandbike.com/used/hatchback-cars"},{"https://carandbike:kar8kiaZ@stage.carandbike.com/used/certified-cars"},
			 {"https://carandbike:kar8kiaZ@stage.carandbike.com/used/maruti-suzuki-cars-in-hyderabad"},{"https://carandbike:kar8kiaZ@stage.carandbike.com/used/hyundai-cars-in-new-delhi"},
			 {"https://carandbike:kar8kiaZ@stage.carandbike.com/used/sedan-cars"},{"https://carandbike:kar8kiaZ@stage.carandbike.com/used/suv-cars"},
			 {"https://carandbike:kar8kiaZ@stage.carandbike.com/used/mahindra-cars-in-bangalore"},{"https://carandbike:kar8kiaZ@stage.carandbike.com/sitemap.html"},
			
		 };
	 }		
	@DataProvider(name="excelData")
	    public Iterator<String> gettestdata() throws Exception{
	    	
	    	ArrayList<String> testdata=utils.readExcel("C:\\Users\\mfcwl1\\Desktop\\urlprod.xls");
	    	return testdata.iterator();
	    }
	    }	    

