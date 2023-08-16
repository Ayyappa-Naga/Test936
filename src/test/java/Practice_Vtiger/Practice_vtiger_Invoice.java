package Practice_Vtiger;

import java.awt.Window;
import java.time.Duration;
import java.util.*;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.WebDriver_Utility;

public class Practice_vtiger_Invoice {
	@Test
	public static void scenario_practice_invoice()throws Throwable {
		Random r  = new Random(110);
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("//a[.='More']"));
		Actions act = new Actions(driver);
		act.moveToElement(e2).click().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Invoice')]"))).click().perform();
		
		driver.findElement(By.xpath("//img[@title='Create Invoice...']")).click();
		driver.findElement(By.name("subject")).sendKeys("cookies");
		driver.findElement(By.xpath("(//img[@title='Select'])[3]")).click();
		
		String pID = driver.getWindowHandle();
		
		WebDriver_Utility ut = new WebDriver_Utility();
		ut.windowswitch(driver,"module=Accounts&action");
		driver.findElement(By.xpath("//a[.='techno sol']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().window(pID);
		driver.findElement(By.name("bill_street")).sendKeys("road No.5"+r);
		driver.findElement(By.xpath("(//input[@name='cpy'])[2]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600);");
		driver.findElement(By.id("searchIcon1")).click();
		
		Set<String> Child = driver.getWindowHandles();
		Iterator<String> i2 = Child.iterator();
		while(i2.hasNext())
		{ String iD= i2.next();
		
		
		if(iD.equals(pID)==false) {
			driver.switchTo().window(iD);
			driver.findElement(By.id("popup_product_5")).click();
		
			driver.switchTo().window(pID);
			
		}
			
			
		}
		driver.findElement(By.id("qty1")).sendKeys("12");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
	}

}
