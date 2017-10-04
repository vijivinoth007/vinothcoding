package RailwayBook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDepartureTime2WithXLWrite {

	public static void main(String[] args)  {

		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			driver.get("https://erail.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElementById("txtStationFrom").clear();
			driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

			driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("BCT", Keys.TAB);

			WebElement datacheck = driver.findElementById("chkSelectDateOnly");

			if (datacheck.isSelected()) {
				datacheck.click();
			}

			driver.findElementById("buttonFromTo").click();

			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");

			List<WebElement> tablerow = table.findElements(By.tagName("tr"));
			int a = tablerow.size();
			System.out.println(a);

			FileInputStream vin = new FileInputStream("./data/login.xlsx");

			XSSFWorkbook wb = new XSSFWorkbook(vin);

			XSSFSheet sh = wb.getSheet("sheet1");

			XSSFRow row = sh.getRow(1);

			System.out.println(row.getCell(0));

			int i;

			for (i = 0; i <= 3; i++) {

				List<WebElement> tablecolumn = tablerow.get(i).findElements(By.tagName("td"));
				String arraivalTime = tablecolumn.get(1).getText();
				row.createCell(i+2).setCellValue(arraivalTime);

				System.out.println("The" + i + "st train's arrival time is" + arraivalTime);

			}
			
			FileOutputStream out = new FileOutputStream("./data/login1.xlsx");

			wb.write(out);

			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

//XL code used for writing it
/*FileInputStream vin = new FileInputStream("./data/login.xlsx");
XSSFWorkbook wb = new XSSFWorkbook(vin);
XSSFSheet sh = wb.getSheet("sheet1");
XSSFRow row = sh.getRow(1);
System.out.println(row.getCell(0));
row.createCell(i+2).setCellValue(arraivalTime);
FileOutputStream out = new FileOutputStream("./data/login1.xlsx");
wb.write(out);*/







