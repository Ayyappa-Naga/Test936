package Generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	public String getvalue1(String sheetName,int rowNum,int cellNum) throws Exception {
		FileInputStream fxcel =new  FileInputStream("src/test/resources/V_Tiger.xlsx");
		Workbook book = WorkbookFactory.create(fxcel);
		Sheet sheet=book.getSheet(sheetName);
		Row row =sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value1 =cell.getStringCellValue();
		
		
	return value1;
		
		
	}
	
	public String getValeUsingDataformatter(String sheetName,int rowNum,int cellNum) throws Exception {
		FileInputStream fxcel =new  FileInputStream("src/test/resources/V_Tiger.xlsx");
		Workbook book = WorkbookFactory.create(fxcel);
		Sheet sheet=book.getSheet(sheetName);
		Row row =sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		DataFormatter dd=new DataFormatter();
		String value1 = dd.formatCellValue(cell);
		
		
	return value1;
		
		
	}
	
	
	
	
	
	public String getStringKeyAndValue(String key) throws Exception {
		FileInputStream fpro =new  FileInputStream("D:\\Selenium_Project\\Practice_adv_sel\\src\\main\\resources\\Propertyfile10.properties");
		Properties pro = new Properties();
		pro.load(fpro);
		String value1 = pro.getProperty(key);
		return value1;
		
		
	
		
		
	}
}
