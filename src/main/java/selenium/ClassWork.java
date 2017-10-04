package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import wrappers.GenericWrappers;

public class ClassWork extends GenericWrappers  {

RemoteWebDriver driver;

	public WebElement getObject(String locatorType,String locatorValue) {
		
		WebElement element = null;
		
		switch (locatorType) {
		case "id":
			element = driver.findElementById(locatorValue);
			break;
			
		case "name":
			element = driver.findElementByName(locatorValue);
			break;
		
		case "linkText":
			element =driver.findElementByLinkText(locatorValue);
			break;
		case "className":
			element=driver.findElementByClassName(locatorValue);
			break;
			
		case "xpath" :
			element=driver.findElementByXPath(locatorValue);
			break;
		}
		return element;

		}
		
		public void enterText(String locatorType,String locatorValue, String data) {
			WebElement localElement = getObject(locatorType, locatorValue);
			localElement.clear();
			localElement.sendKeys(data);
		}
		
		public void clickElement(String locatorType,String locatorValue){
			
			WebElement localElement = getObject(locatorType, locatorValue);
			localElement.click();
			
			
		
			
			
			
		}
						

		}



