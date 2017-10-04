package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");		

	int i;
	for (i=2;i<=254;i++){
	
		String StringToFind = "//select[@id='userRegistrationForm:countries']/option["+i+"]";
				String text=driver.findElementByXPath(StringToFind).getText();
		
		System.out.println(text);
	}
		
		
	
		
		driver.close();


}}