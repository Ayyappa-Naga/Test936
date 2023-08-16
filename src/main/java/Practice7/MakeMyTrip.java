package Practice7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		
		driver.switchTo().frame(2);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement e1 =driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));
	
		wait.until(ExpectedConditions.elementToBeClickable(e1));
		e1.click();
		driver.switchTo().defaultContent();

	}

}
