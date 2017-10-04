package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLread {

	public static String[][] excelData() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi=new FileInputStream(new File("./data/login.xlsx"));
				
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(0);
		
		
		int rowcount=sheet.getLastRowNum();
		int colcount=row.getLastCellNum();
		
		String[][] data=new String[rowcount][colcount];
		
		
		
		int i,j;
		
		for (i=1;i<=rowcount;i++){
			
			XSSFRow row1=sheet.getRow(i);
			
			for (j=0;j<colcount;j++){
				
			XSSFCell cell=row1.getCell(j);
			
			cell.getStringCellValue();
			
			//System.out.println(cell.getStringCellValue());
			
			data[i-1][j]=cell.getStringCellValue();
			
		}
		
		

		
}
		return data;

		
		

}
}