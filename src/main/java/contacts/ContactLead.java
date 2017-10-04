package contacts;

import org.testng.annotations.Test;

public class ContactLead extends ProjectSpecificWrapper {

	@Test
	public void contactLead() {
		// TODO Auto-generated method stub

		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");

	}

}
