package Practice7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip_Hover {

	public static void main(String[] args)throws Throwable {
	WebDriver  driver = new ChromeDriver();
	driver.get("http://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@class='_1_3w1N']"))).perform();
	
	WebElement e1 = driver.findElement(By.xpath("//div[.='Flipkart Plus Zone']"));
	act.moveToElement(e1).click().perform();            
System.out.println("done");
	}

}
