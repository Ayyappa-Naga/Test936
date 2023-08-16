package main_pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Property_data {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	Properties pro = new Properties();
FileInputStream fis = new FileInputStream("src/main/resources/Propertyfile10.properties");
	pro.load(fis);
	String Url = pro.getProperty("url");
	String Username =pro.getProperty("username");
	String pass= pro.getProperty("password");
	
	driver.get(Url);
	driver.findElement(By.id("username")).sendKeys(Username,Keys.TAB,pass,Keys.ENTER);

	}

}
