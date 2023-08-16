package product_Vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class Product_Vtiger_Scene_2 {
	
	public static void main(String args[])
	throws Throwable{
		
		Random r = new Random(100);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
	
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys("Glasses01"+r);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600);");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
		
		
		
	}
	

}
