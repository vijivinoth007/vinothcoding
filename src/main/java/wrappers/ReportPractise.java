package wrappers;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ExtentReports extent=new ExtentReports("./reports/report.html", false);		
		extent.loadConfig(new File("./src/main/java/Extent-confiq.xml"));
		
		ExtentTest test=extent.startTest("TC001", "creates a new lead");	
		test.assignAuthor("vinoth");
		test.assignCategory("Smoke");
		
		test.log(LogStatus.INFO, "information");
		test.log(LogStatus.PASS, "pass");
		test.log(LogStatus.FAIL, "Fail");
		
		extent.endTest(test);
		extent.flush();

	}

}


