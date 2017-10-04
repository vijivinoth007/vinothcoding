package wrappers;

import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificWrapper{

	
	//@Test(dependsOnMethods={"createLead"}")
	
	//@Test(testName="sequential",groups={"smoke"},dataProvider="editfetchdata")
	@Test(testName="sequential",dataProvider="editfetchdata")


	public  void Edit(String leadId,String companyName) {
		// TODO Auto-generated method stub
		
		//PractiseWrapper pw=new PractiseWrapper();
		
	/*	invokeApp("firefox", "http://leaftaps.com/opentaps");

		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");*/
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']",leadId);
		//clickByXpath("//input[@name='id']");
		clickByXpath("//button[text()='Find Leads']");
		sleep(2000);
		clickByXpath("//a[text()='10390']");
		clickByLink("Edit");
		verifyTitle("Edit Lead");
		clearTextByXpath("//*[@id='updateLeadForm_companyName']");
		enterById("updateLeadForm_companyName", companyName);
		clickByXpath("//input[@type='submit']");
		verifyTextContainsByXpath("//*[@id='viewLead_companyName_sp']",companyName);
		closeAllBrowsers();
		
		
		
		
		
			
	}

}