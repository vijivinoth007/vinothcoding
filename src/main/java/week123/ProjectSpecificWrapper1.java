package week123;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper1 extends PractiseWrapper1 {
	
	
	@BeforeMethod
	public void login(){
		
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
			
	}
	
	@AfterMethod
	
	public void close(){
		
		
		closeAllBrowsers();
	}

}
