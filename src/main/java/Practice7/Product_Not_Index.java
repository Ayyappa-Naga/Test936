package Practice7;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Not_Index {

	public static void main(String[] args) throws Throwable {
	Random r = new Random(100);
		FileInputStream fis = new FileInputStream("src/main/resources/macro.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh1  = book.getSheet("Sheet1");
	Row row =	sh1.getRow(0);
Cell ce=row.getCell(0);
DataFormatter ds = new DataFormatter();
String s =ds.formatCellValue(ce);
	
	System.out.println(s);
		  WebDriver driver = new ChromeDriver(); driver.get("http://localhost:8888");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",
	  Keys.ENTER);
	  
	  driver.findElement(By.xpath("//a[text()='Products']")).click();
	  driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	  driver.findElement(By.name("productname")).sendKeys(s);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,600);");
	 
		

	}

}
