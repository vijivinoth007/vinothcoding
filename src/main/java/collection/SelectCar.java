package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fromcity = driver.findElementByXPath("//input[@id='from_city']");
		
		fromcity.click();

		Select sel = new Select(fromcity);
		sel.selectByIndex(4);

		WebElement tocity = driver.findElementByXPath("(//input[@id='to_city_0'])[1]");
		tocity.click();

		Select selto = new Select(tocity);
		selto.selectByIndex(3);

		driver.findElementByXPath("//*[@value='Select Car']").click();
		
		

	}

}
