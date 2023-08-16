package create_Campaign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utility.WebDriver_Utility;

public class makemy {
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriver_Utility wu = new WebDriver_Utility();
	wu.maximizescreen(driver);
	driver.switchTo().frame(3);
	driver.findElement(By.xpath("//a[@class='close']")).click()
	;
	}
	

}
