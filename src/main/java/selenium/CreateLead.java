package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {


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
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Raj");
	
		driver.findElementById("createLeadForm_lastName").sendKeys("vinoth");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		

		
	}	


	}


