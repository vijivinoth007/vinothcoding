package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement dropDown=driver.findElementById("userRegistrationForm:countries");
		
		Select country = new Select(dropDown);
		
		String text=driver.findElementByXPath("//select[@id='userRegistrationForm:countries']/option[contains(text(),'E')][3]").getText();
		
		country.selectByVisibleText(text);
		
		

	}

}
