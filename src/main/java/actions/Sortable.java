package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				
		
		driver.get("http://jqueryui.com/sortable/");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement frame=driver.findElementByClassName("demo-frame");		
		driver.switchTo().frame(frame);
		
		WebElement item1 =driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 =driver.findElementByXPath("//li[text()='Item 5']");
		
		int a=item2.getLocation().getX();
		int b=item2.getLocation().getY();
		
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(item1,a,b)
		.build()
		.perform();
		

		

	}

}
