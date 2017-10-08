package RailwayBook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDepartureTime {


//vinoth

	public static void main(String[] args) {

		try {
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
			System.out.println(a);

			int i;

			for (i = 0; i <= 3; i++) {

				List<WebElement> tablecolumn = tablerow.get(i).findElements(By.tagName("td"));
				String arraivalTime = tablecolumn.get(1).getText();

				System.out.println("The" + i + "st train's arrival time is" + arraivalTime);

			}

			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
