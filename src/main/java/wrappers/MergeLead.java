package wrappers;

import org.testng.annotations.Test;

public class MergeLead extends ProjectSpecificWrapper
 {

	//@Test(enabled=false)
//	@Test(testName="parallel",groups={"sanity"},dependsOnGroups={"smoke"},dataProvider="mergefetchdata")//,enabled=false)
	@Test(testName="parallel",dataProvider="mergefetchdata")
	public void Merge(String lead1,String lead2) {
		// TODO Auto-generated method stub

	
	
	//PractiseWrapper pw=new PractiseWrapper();
	
//	invokeApp("chrome", "http://leaftaps.com/opentaps");
//
//	enterById("username", "DemoSalesManager");
//	enterById("password", "crmsfa");
//	clickByClassName("decorativeSubmit");
//	clickByLink("CRM/SFA");
		
	clickByLink("Leads");
	clickByLink("Merge Leads");
	clickByXpathNoSnap("(//*[@alt='Lookup'])[1]");
	switchToLastWindow();
	enterByXpath("//*[@name='id']",lead1);
	clickByXpathNoSnap("//Button[text()='Find Leads']");
	sleep(2000);
	clickByLink(lead1);
	sleep(1000);
	switchToParentWindow();
	clickByXpathNoSnap("(//*[@alt='Lookup'])[2]");
	switchToLastWindow();
	enterByXpath("//*[@name='id']",lead2);
	clickByXpathNoSnap("//Button[text()='Find Leads']");
	sleep(2000);
	clickByLink(lead2);
	switchToParentWindow();
	clickByLink("Merge");
	acceptAlert();
	clickByLink("Find Leads");
	enterByXpath("//input[@name='id']","10263");
	clickByXpathNoSnap("//Button[text()='Find Leads']");
	verifyTextByXpath("//*[text()='No records to display']","No records to display");

}
}