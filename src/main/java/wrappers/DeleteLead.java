package wrappers;

import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificWrapper {

	//@Test(dependsOnMethods={"createLead"},groups="sanity")
	
	//@Test(testName="parallel",groups={"sanity"},dataProvider="deletefetchdata")//dependsOnGroups={"smoke"})
	@Test(testName="parallel",dataProvider="deletefetchdata")//dependsOnGroups={"smoke"})

	public void delete(String phoneNumber,String leadID){
		
//		login();
		clickByLink("Leads");
		clickByLink("Find Leads");	
		clickByXpath("//span[text()='Phone']");
		clearTextByXpath("//input[@name='phoneCountryCode']");
		enterByXpath("//input[@name='phoneCountryCode']", "9");
		clearTextByXpath("//input[@name='phoneAreaCode']");
		enterByXpath("//input[@name='phoneAreaCode']", "1");
		clearTextByXpath("//input[@name='phoneNumber']");
		enterByXpath("//input[@name='phoneNumber']",phoneNumber);
		clickByXpath("//button[text()='Find Leads']");
		clickByLink(leadID);
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']",leadID);
		clickByXpathNoSnap("//Button[text()='Find Leads']");
		verifyTextByXpath("//*[text()='No records to display']","No records to display");
		
	}

		
		

}