package week123;

public class EditLead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PractiseWrapper1 pw=new PractiseWrapper1();
		
		pw.invokeApp("firefox", "http://leaftaps.com/opentaps");

		pw.enterById("username", "DemoSalesManager");
		pw.enterById("password", "crmsfa");
		pw.clickByClassName("decorativeSubmit");
		pw.clickByLink("CRM/SFA");
		pw.clickByLink("Leads");
		pw.clickByLink("Find Leads");
		pw.enterByXpath("//input[@name='id']","10546");
		//pw.clickByXpath("//input[@name='id']");
		pw.clickByXpath("//button[text()='Find Leads']");
		pw.sleep(2000);
		pw.clickByXpath("//a[text()='10546']");
		pw.clickByLink("Edit");
		pw.verifyTitle("Edit Lead");
		pw.clearTextByXpath("//*[@id='updateLeadForm_companyName']");
		pw.enterById("updateLeadForm_companyName", "accenture");
		pw.clickByXpath("//input[@type='submit']");
		pw.verifyTextContainsByXpath("//*[@id='viewLead_companyName_sp']","accenture");
		pw.closeAllBrowsers();
		
		
		
		
		
			
	}

}