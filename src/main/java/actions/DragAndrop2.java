package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		WebElement frame=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		
		WebElement item1=driver.findElementById("draggable");
		WebElement item2=driver.findElementById("droppable");	
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(item1, item2)
		.build()
		.perform();
				
			

	}

}
