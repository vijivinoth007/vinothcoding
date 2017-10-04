package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");

		WebElement checkbox = driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]");
		checkbox.click();

		if (checkbox.isSelected())

			System.out.println("the check box is selected");

		else

			System.out.println("the check box is not selected");

		driver.close();

	}

}
