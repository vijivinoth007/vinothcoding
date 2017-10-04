package week123;

public class MergeLead
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	PractiseWrapper1 pw=new PractiseWrapper1();
	
	pw.invokeApp("chrome", "http://leaftaps.com/opentaps");

	pw.enterById("username", "DemoSalesManager");
	pw.enterById("password", "crmsfa");
	pw.clickByClassName("decorativeSubmit");
	pw.clickByLink("CRM/SFA");
	pw.clickByLink("Leads");
	pw.clickByLink("Merge Leads");
	pw.clickByXpathNoSnap("(//*[@alt='Lookup'])[1]");
	pw.switchToLastWindow();
	pw.enterByXpath("//*[@name='id']", "10317");
	pw.clickByXpathNoSnap("//Button[text()='Find Leads']");
	pw.sleep(2000);
	pw.clickByLink("10317");
	pw.sleep(1000);
	pw.switchToParentWindow();
	pw.clickByXpathNoSnap("(//*[@alt='Lookup'])[2]");
	pw.switchToLastWindow();
	pw.enterByXpath("//*[@name='id']", "10318");
	pw.clickByXpathNoSnap("//Button[text()='Find Leads']");
	pw.sleep(2000);
	pw.clickByLink("10318");
	pw.switchToParentWindow();
	pw.clickByLink("Merge");
	pw.acceptAlert();
	pw.clickByLink("Find Leads");
	pw.enterByXpath("//input[@name='id']","10263");
	pw.clickByXpathNoSnap("//Button[text()='Find Leads']");
	pw.verifyTextByXpath("//*[text()='No records to display']","No records to display");


}
}