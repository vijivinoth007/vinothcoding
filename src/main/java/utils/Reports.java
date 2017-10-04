package utils;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reports {

		
		public String browser;
		public String datasheetname;
		
		public static ExtentReports extent;
		public  ExtentTest test;
		
		public ExtentReports startResultssss(){
								
				
			extent =new ExtentReports("./reports/report.html", false);
			extent.loadConfig(new File ("./src/main/java/Extent-confiq.xml"));
			return extent;
				

							}	
		public ExtentTest startTestCase(String testcasename,String description){
			
			test=extent.startTest(testcasename,description);
			return test;
/*			test.assignAuthor("authour");
			test.assignCategory("catogary");
			invokeApp(browser, url);*/		}
		
		
		public void endTestCase(){
			extent.endTest(test);
			
		}
		
		public void endResult(){
			
			 extent.flush();
		}
		





}
