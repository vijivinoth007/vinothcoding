package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("raj");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		//driver.findElementByXPath("(//a[text(),'Leads'])[2]").click();
		
				
		
		

		
		
	

	}

}
