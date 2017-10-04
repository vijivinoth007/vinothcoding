package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

	public static String[][] dataProvider(String dataSheetName) throws IOException {
		// TODO Auto-generated method stub
		
		
		File obj=new File("./data/"+dataSheetName+".xlsx");
		FileInputStream file=new FileInputStream(obj);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(0);
		
		int rowlength=sheet.getLastRowNum();
		int collength=row.getLastCellNum();
		String[][] data=new String[rowlength][collength];

		
		int i,j;
		
		for (i=1;i<=rowlength;i++){
			
			XSSFRow row1=sheet.getRow(i);
			
			for (j=1;j<collength;j++){
				
			XSSFCell cell=row.getCell(j);
			
			data[i-1][j]=cell.getStringCellValue();
			
			}
	
		}
		
		return data;

	}

}
