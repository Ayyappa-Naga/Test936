package Practice7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dynamicxpath {
	
public static void main(String[] args) throws AWTException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.goibibo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	driver.findElement(By.xpath("(//p[@class='sc-12foipm-18 dxLXYg fswWidgetTitle'])[1]")).click();
	String month= "June 2023";
	String Date = "25";
	driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+Date+"']")).click();
	
}
}
