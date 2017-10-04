package wrappers;

import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificWrapper{
	
	//@Test(enabled=false)
	@Test(groups={"regression"},dependsOnGroups={"smoke"},dataProvider="duplicatefetchdata")


	public  void Duplicate(String mailId,String duplicateLead){
		// TODO Auto-generated method stub

		//PractiseWrapper pw=new PractiseWrapper();		
//		pw.invokeApp("chrome", "http://leaftaps.com/opentaps");		
//		pw.enterById("username", "DemoSalesManager");
//		pw.enterById("password", "crmsfa");
//		pw.clickByClassName("decorativeSubmit");
//		pw.clickByLink("CRM/SFA");
		
		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Email']");
		enterByXpath("//*[@name='emailAddress']",mailId);
		clickByXpath("//button[text()='Find Leads']");
		String name=getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		clickByLink(duplicateLead);
		verifyTitle("Duplicate Lead");
		clickByXpath("//input[@value='Create Lead']");
		
		String name2=getTextById("viewLead_firstName_sp");
		
		if (name == name2)
		
			System.out.println("The duplicated name matches"); 
		
		else			
			
			System.out.println("The duplicated name does not match");
		
					
		
		
		
		}

}
