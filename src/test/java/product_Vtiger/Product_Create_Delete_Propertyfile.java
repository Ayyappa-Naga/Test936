package product_Vtiger;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Product_Create_Delete_Propertyfile {
	@Test
	public static void propertyProduct() throws Throwable{
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/product.properties");
		pro.load(fis);
		String Pname = pro.getProperty("pname");
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);

	driver.findElement(By.xpath("//a[text()='Products']")).click();
	driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	
	
	driver.findElement(By.name("productname")).sendKeys(Pname);
Thread.sleep(2000);
driver.close();}

}
