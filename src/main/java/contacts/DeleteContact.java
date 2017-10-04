package contacts;

import org.junit.Test;

public class DeleteContact extends ProjectSpecificWrapper {

	@Test
	public void deleteContact() {
		

		invokeApp("chrome", "http://leaftaps.com/opentaps");		
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");

	}

}
