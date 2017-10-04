package week123;

import org.testng.annotations.Test;

public class DeleteLead1 extends ProjectSpecificWrapper1 {

	@Test
	public void main(){
		
		//login();
		clickByLink("Leads");
		clickByLink("Find Leads");	
		clickByXpath("//span[text()='Phone']");
		clearTextByXpath("//input[@name='phoneCountryCode']");
		enterByXpath("//input[@name='phoneCountryCode']", "9");
		clearTextByXpath("//input[@name='phoneAreaCode']");
		enterByXpath("//input[@name='phoneAreaCode']", "1");
		clearTextByXpath("//input[@name='phoneNumber']");
		enterByXpath("//input[@name='phoneNumber']", "8148338817");
		clickByXpath("//button[text()='Find Leads']");
		clickByLink("10662");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']","10662");
		clickByXpathNoSnap("//Button[text()='Find Leads']");
		verifyTextByXpath("//*[text()='No records to display']","No records to display");
		
	}

		
		

}