package organisation;
import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;

public class Scenario_Vtiger_1_org {
	@Test
	public static void scenario_1()throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		
Java_Utility j1 = new Java_Utility();

	
		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
		driver.findElement(By.name("accountname")).sendKeys("techno sol"+j1.getRandomNum());
		Thread.sleep(12000);
		driver.findElement(By.id("phone")).sendKeys("5646987456");
		driver.findElement(By.id("email1")).sendKeys("email_AN@gmail.com");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(e1).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		
		
	
		
	
		
	}

}
