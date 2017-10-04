package wrappers;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeSuite

	public void startResult() {		
		
		extent=new ExtentReports("./reports/report.html", false);		
		extent.loadConfig(new File("./src/main/java/Extent-confiq.xml"));
	}
	
	@BeforeMethod
	public void startTestCase() 
	
	{
		test=extent.startTest("TC001", "creates a new lead");	
		test.assignAuthor("vinoth");
		test.assignCategory("Smoke");
		
	}
		
	/*	test.log(LogStatus.INFO, "information");
		test.log(LogStatus.PASS, "pass");
		test.log(LogStatus.FAIL, "Fail");*/

		@AfterMethod
		
		public void endTestCase() {			
		extent.endTest(test);
		
		}
		
		@AfterSuite
		public void endResult() {
		extent.flush();
		}
				

	}

