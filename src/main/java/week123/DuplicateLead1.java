package week123;

public class DuplicateLead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PractiseWrapper1 pw=new PractiseWrapper1();
		
		pw.invokeApp("chrome", "http://leaftaps.com/opentaps");
		
		pw.enterById("username", "DemoSalesManager");
		pw.enterById("password", "crmsfa");
		pw.clickByClassName("decorativeSubmit");
		pw.clickByLink("CRM/SFA");
		pw.clickByLink("Leads");
		pw.clickByLink("Find Leads");
		pw.clickByXpath("//span[text()='Email']");
		pw.enterByXpath("//*[@name='emailAddress']","vijivinoth007");
		pw.clickByXpath("//button[text()='Find Leads']");
		String name=pw.getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		pw.clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		pw.clickByLink("Duplicate Lead");
		pw.verifyTitle("Duplicate Lead");
		pw.clickByXpath("//input[@value='Create Lead']");
		
		String name2=pw.getTextById("viewLead_firstName_sp");
		
		if (name == name2)
		
			System.out.println("The duplicated name matches"); 
		
		else			
			
			System.out.println("The duplicated name does not match");
		
	
		
		
					
		
		
		
		}

}
