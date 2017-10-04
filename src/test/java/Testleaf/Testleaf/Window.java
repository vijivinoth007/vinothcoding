package Testleaf.Testleaf;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		
		Set <String> handles = driver.getWindowHandles();
		int i=0;
		for (String handle:handles ){
		
			driver.switchTo().window(handle);
			
			if (i==0){
				driver.close();
			}
			
			i=i+1;
		}
		System.out.println("the title for the second window"+driver.getTitle());
		
			

			}
		
		
			
		
	}


