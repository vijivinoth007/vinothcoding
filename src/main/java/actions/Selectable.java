package actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				
		
		driver.get("http://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement frame=driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);
		
		WebElement item1 =driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 =driver.findElementByXPath("//li[text()='Item 5']");
		
		
		act.clickAndHold(item1)
		.pause(Duration.ofSeconds(3));
		act.clickAndHold(item2)
		.release()
		.build()
		.perform();

		
		
		

	}

}
