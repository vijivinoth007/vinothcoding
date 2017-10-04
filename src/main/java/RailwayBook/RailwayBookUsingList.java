package RailwayBook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailwayBookUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("BCT",Keys.TAB);

		driver.findElementById("buttonFromTo").click();
		
		WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List <WebElement> totalrow=table.findElements(By.tagName("tr"));
		System.out.println(totalrow.size());
		
		
		List <WebElement> totalcol=totalrow.get(0).findElements(By.tagName("td"));
		System.out.println(totalcol.size());
		
		String name=totalcol.get(7).getText();
		
		System.out.println("The arraival time for first express is :"+name);
		
		
	}

}
