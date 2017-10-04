package contacts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper extends PractiseWrapper {

	@BeforeMethod(groups = { "common" })
	@Parameters({ "browser", "url", "username", "password" })

	public void login(String browser, String url, String username, String password) {

		invokeApp(browser, url);
		enterById("username", username);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");

	}

	@AfterMethod(groups = { "common" })

	public void close() {

		closeAllBrowsers();
	}

	@DataProvider(name = "createfetchdata")

	public Object[][] createGetData() {

		Object[][] data = new Object[1][3];

		data[0][0] = "accenture";
		data[0][1] = "vinoth";
		data[0][2] = "vel";

		// for 2nd iteration
		// data[1][0]="CTS";
		// data[1][1]="prabha";
		// data[1][2]="deventhran";

		return data;

	}

	@DataProvider(name = "deletefetchdata")
	public Object[][] deleteGetData() {

		Object[][] data = new Object[1][2];

		data[0][0] = "8148338817";
		data[0][1] = "10197";

		return data;

	}

	@DataProvider(name = "duplicatefetchdata")

	public Object[][] duplicateGetData() {

		Object[][] data = new Object[1][2];

		data[0][0] = "vijivinoth007@gmail.com";
		data[0][1] = "Duplicate Lead";
		return data;

	}

	@DataProvider(name = "editfetchdata")

	public Object[][] editData() {

		Object[][] data = new Object[1][2];

		data[0][0] = "10390";
		data[0][1] = "accenture";
		return data;

	}

	@DataProvider(name = "mergefetchdata")

	public Object[][] mergeData() {

		Object[][] data = new Object[1][2];

		data[0][0] = "10191";
		data[0][1] = "10192";

		return data;
	}

}
