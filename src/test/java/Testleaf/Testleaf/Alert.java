package Testleaf.Testleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		open the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

//		open the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

//		switch into frame-iframeResult
	//	WebElement demo =driver.findElementByClassName("iframeResult");
		
		driver.switchTo().frame("iframeResult");
		
		
//		click on try it  xpath-/html/body/button
		
		driver.findElementByXPath("/html/body/button").click();
		
//		swith to alert class
		driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("vinoth");
		driver.switchTo().alert().accept();

		String text=driver.findElementById("demo").getText();
		
		//System.out.println(text);
		
//
//
//		compare the value contains the name
//
		if (text.contains("vinoth"))
				
		System.out.println("pass");
//
		else
//
		System.out.println("fail");

		
	}

	private static String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
