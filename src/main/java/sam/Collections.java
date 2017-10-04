package sam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("BCT", Keys.TAB);

		WebElement datacheck = driver.findElementById("chkSelectDateOnly");

		if (datacheck.isSelected()) {
			datacheck.click();
		}

		driver.findElementById("buttonFromTo").click();

		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");

		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		int a = tablerow.size();

		ArrayList<String> list1 = new ArrayList<String>();

		int i;

		for (i = 0; i <= 3; i++) {

			List<WebElement> tablecolumn = tablerow.get(i).findElements(By.tagName("td"));
			String trainName = tablecolumn.get(1).getText();
			list1.add(trainName);

		}

		list1.sort(null);

		System.out.println(list1);

		driver.findElementByLinkText("Train Name").click();

		WebElement table2 = driver.findElementByXPath("//table[@class='DataTable TrainList']");

		List<WebElement> tablerow2 = table2.findElements(By.tagName("tr"));

		ArrayList<String> list2 = new ArrayList<String>();

		int j;

		for (j = 0; j <= 3; j++) {

			List<WebElement> tablecolumn2 = tablerow2.get(j).findElements(By.tagName("td"));
			String trainName = tablecolumn2.get(1).getText();
			list2.add(trainName);

		}

		if (list1.equals(list2))

			System.out.println("The sorted list matches " + list2);
		else
			System.out.println("The sorted list does not match" + list1 + list2);

	}

}
