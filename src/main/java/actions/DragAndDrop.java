package actions;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/draggable/#sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		
		WebElement frame=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement element=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement element2=driver.findElementByXPath("//li[text()='Item 5']");
		Point a=element2.getLocation();
		
		int b=a.y+1;


		
		Actions act=new Actions(driver);
		
		act.clickAndHold(element).moveByOffset(0, b).build().perform();
			
		
		

	}

}
