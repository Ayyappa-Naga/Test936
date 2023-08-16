package Generic_Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
	File_Utility futil= new File_Utility();
	public static  WebDriver driver = null;
	
	@BeforeSuite 
	public void dataBaseConnection() {
		System.out.println("Db connection successful");
		
	}
	@BeforeClass
	public void browsrLaunch () throws Exception {
	driver= new ChromeDriver();
		String Url=futil.getStringKeyAndValue("url");
		
		driver.get(Url);
		
	}
	@BeforeMethod
	public void login()throws Exception {
		String Uname=futil.getStringKeyAndValue("username");
		String Pass= futil.getStringKeyAndValue("password");
		driver.findElement(By.name("user_name")).sendKeys(Uname,Keys.TAB,Pass,Keys.ENTER);
			}
	@AfterMethod
	public void logout() {
		
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@AfterSuite
	public void dataBaseClose() {
		System.out.println("db connection Close");
	}

}
