package main_pkg;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Excel_Enterdata {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("src/main/resources/micro.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
			Sheet sh =book.getSheet("Sheet1");
		
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.amazon.in");
			Thread.sleep(5000);
		List<WebElement> allLink=	driver.findElements(By.xpath("//a"));
			

			 for(int i=0;i<allLink.size();i++)
			 {
				 Row r = sh.createRow(i);
				 Cell c= r.createCell(0);
					c.setCellValue(allLink.get(i).getAttribute("href"));
				
				DataFormatter fo = new DataFormatter();
				System.out.println(fo.formatCellValue(c));
				
		
		
				
				}
			 
				FileOutputStream fos = new FileOutputStream("src/main/resources/micro.xlsx");
				
				book.write(fos);
			 
		
		
			 
		book.close();
	
		

	}

}
