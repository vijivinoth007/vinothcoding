package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;

public class PractiseWrapper implements Wrappers {

	int i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	RemoteWebDriver driver;

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present to invoke");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementById(idValue).sendKeys(data);
		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByName(nameValue).sendKeys(data);
		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub

		boolean bReturn = false;

		try {
			String a = driver.getTitle();

			if (a.equals(title)) {
				System.out.println("title matches");
				bReturn = true;
			} else {
				System.out.println("title does not match");
			}
		} catch (NoSuchElementException e) {

			System.err.println("There is no such present to get title");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}
		return bReturn;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

		try {
			String a = driver.findElementById(id).getText();

			if (a.equals(text))

				System.out.println("verified" + text);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

		try {
			String a = driver.findElementByXPath(xpath).getText();

			if (a.equals(text))

				System.out.println("verified" + text);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

		try {
			String a = driver.findElementByXPath(xpath).getText();

			if (a.contains(text))

				System.out.println("verified" + text);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void clickById(String id) {
		// TODO Auto-generated method stub

		try {
			driver.findElementById(id).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByClassName(classVal).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByName(name).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void clickByLink(String name) {

		// TODO Auto-generated method stub

		try {
			driver.findElementByLinkText(name).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}

	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByLinkText(name).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}

	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByXPath(xpathVal).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void clickByXpathNoSnap(String xpathVal) {

		try {
			driver.findElementByXPath(xpathVal).click();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub

		try {
			driver.findElementById(idVal).getText();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByXPath(xpathVal).getText();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

		try {
			WebElement name = driver.findElementById(id);

			Select dropdown = new Select(name);

			dropdown.selectByValue(value);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void selectByVisibileText(String id, String text) {

		try {
			WebElement name = driver.findElementById(id);

			Select dropdown = new Select(name);
			dropdown.selectByVisibleText(text);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

		try {
			WebElement name = driver.findElementById(id);

			Select dropdown = new Select(name);

			dropdown.selectByIndex(value);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void switchToWindowByName(String name) {

		try {
			driver.switchTo().window(name);

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}

	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stu

		Set<String> handles = driver.getWindowHandles();

		for (String parentHandle : handles) {

			driver.switchTo().window(parentHandle);

			break;

		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

		try {
			Set<String> handles = driver.getWindowHandles();

			for (String handle : handles) {

				driver.switchTo().window(handle);

			}

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

		try {
			driver.switchTo().alert().dismiss();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}

	}

	public String getAlertText() {
		// TODO Auto-generated method stub

		try {
			driver.switchTo().alert().getText();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		}
		return null;

	}

	public void takeSnap() {
		// TODO Auto-generated method stub

		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snap" + i + ".jpg");

		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		i++;

	}

	public void checkBoxSelectedOrNot(String id) {

		try {
			driver.findElementById(id).isSelected();

		} catch (NoSuchElementException e) {

			System.err.println("There is no such element present");

		} catch (WebDriverException e) {

			System.err.println("browser unreachable");

		} finally {

			takeSnap();

		}

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub

		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

		driver.quit();

	}

	public void sleep(long value) {

		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clearTextByXpath(String xpathval) {

		driver.findElementByXPath(xpathval).clear();
	}

}
