package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("xxcvvljfkg");
		driver.findElementById("userRegistrationForm:password").sendKeys("Vinoth@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Vinoth@123");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?" );
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Jimme");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("vinoth");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("kumar");
		driver.findElementByXPath("//label[text()=' Male']").click();
		driver.findElementByXPath("//label[text()=' Unmarried']").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("9");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("NOV");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1994");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("2763478234892");
		driver.findElementById("userRegistrationForm:idno").sendKeys("098907987");
		driver.findElementById("userRegistrationForm:email").sendKeys("Vijivinoth007@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8148338817");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("india");
		driver.findElementById("userRegistrationForm:address").sendKeys("2nd vvansdfnjlaskflsk");
		driver.findElementById("userRegistrationForm:street").sendKeys("asksjhflashfhsalkfhk");
		driver.findElementById("userRegistrationForm:area").sendKeys("Oduganthur");
		driver.findElementById("userRegistrationForm:countries").sendKeys("india");
		driver.quit();
		

		
		
				
		
		
		
	}

}
