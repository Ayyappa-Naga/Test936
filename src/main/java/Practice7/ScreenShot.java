package Practice7;

import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utility.WebDriver_Utility;

import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebDriver_Utility util = new WebDriver_Utility();
		util.takeScreenShot(driver, "D:\\Selenium_Project\\Practice_adv_sel\\target\\ScreenShot\\"+"flipkarthome.png");
		
	}

}
