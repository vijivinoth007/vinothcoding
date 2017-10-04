package RailwayBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XLFetch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationTo").sendKeys("BCT", Keys.TAB);

		WebElement chkbox = driver.findElementById("chkSelectDateOnly");
		if (chkbox.isSelected()) {

			chkbox.click();
		}

		driver.findElementById("buttonFromTo").click();

		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");

		List<WebElement> tablerows = table.findElements(By.tagName("tr"));

		FileInputStream file = new FileInputStream("./data/xl.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sh = wb.getSheet("sheet1");

		int i, j;

		for (i = 0; i <=2 ; i++) {

			for (j = 0; j <= 6; j++) {

				List<WebElement> tablecol = tablerows.get(i).findElements(By.tagName("td"));
				String value = tablecol.get(j).getText();
				sh.getRow(i + 1).createCell(j).setCellValue(value);

			}
		}

		FileOutputStream output = new FileOutputStream("./data/output.xlsx");

		wb.write(output);

		driver.close();

	}
	

}
