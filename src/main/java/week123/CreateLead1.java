package week123;


import org.testng.annotations.Test;

import wrappers.PractiseWrapper;

public class CreateLead1 extends PractiseWrapper {
	
	@Test
	
	public void createLead(){
		
		
		invokeApp("chrome", "http://leaftaps.com/opentaps");
	
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "TestLeaf");
		enterById("createLeadForm_firstName", "vinothkumar");
		enterById("createLeadForm_lastName","velu");
		//enterById("createLeadForm_parentPartyId","10013");
		selectByVisibileText("createLeadForm_dataSourceId", "Conference");
		selectByVisibileText("createLeadForm_marketingCampaignId", "Automobile");
		enterById("createLeadForm_firstNameLocal", "vinothkumar");
		enterById("createLeadForm_lastNameLocal", "velu");
		enterById("createLeadForm_generalProfTitle","selenium expert");
		enterById("createLeadForm_departmentName","selenium");
		enterById("createLeadForm_annualRevenue", "10000");
		selectByVisibileText("createLeadForm_industryEnumId", "Computer Software");
		selectByVisibileText("createLeadForm_ownershipEnumId", "Sole Proprietorship");
		selectByVisibileText("createLeadForm_currencyUomId", "DZD - Algerian Dinar");
		enterById("createLeadForm_sicCode", "ABC");
		enterById("createLeadForm_tickerSymbol", "12321");
		
		enterById("createLeadForm_primaryPhoneCountryCode", "91");
		enterById("createLeadForm_primaryPhoneAreaCode", "632103");
		enterById("createLeadForm_primaryPhoneExtension", "68330");
		enterById("createLeadForm_primaryEmail", "Vijivinoth007@gmail.com");
		enterById("createLeadForm_generalToName", "vinoth");
		enterById("createLeadForm_generalAddress1", "vanigar street");
		enterById("createLeadForm_generalCity", "chennai");
		enterById("createLeadForm_generalPostalCode", "600023");
		enterById("createLeadForm_generalPostalCodeExt", "56");
		enterById("createLeadForm_primaryPhoneNumber", "8148338817");
		enterById("createLeadForm_primaryPhoneAskForName", "vinoth");
		enterById("createLeadForm_generalAttnName", "prabha");
		enterById("createLeadForm_generalAddress2", "5th cross street");
		selectByVisibileText("createLeadForm_generalStateProvinceGeoId", "Alabama");
		selectByVisibileText("createLeadForm_generalCountryGeoId", "India");
		selectByVisibileText("createLeadForm_generalStateProvinceGeoId", "HARYANA");
		clickByClassName("smallSubmit");


						
		
	}

}
