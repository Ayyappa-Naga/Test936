package Practice7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locl_Hover {

	public static void main(String[] args) 
	throws Exception{
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8888");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
			driver.manage().window().maximize();
			String s=driver.findElement(By.xpath("//a[.='More']")).getAttribute("title");
			System.out.println(s);

	}

}
