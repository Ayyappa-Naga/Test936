package practice_only;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Popups {

	public static void main(String[] args) throws Throwable {
 ChromeOptions options = new ChromeOptions();
//	options.addArguments("--disable-media-stream");
			HashMap<String , Integer>  contentSett = new HashMap<String , Integer> ();
			HashMap< String, Object> profile  = new HashMap< String, Object>();
			HashMap<String , Object> prefs= new HashMap< String, Object>();
		
		contentSett.put("notifications", 2);
		profile.put("managed_default_content_settings", contentSett);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		   options.addArguments("--headless");
		WebDriver driver = new  ChromeDriver(options);
	
		 driver.get("https://youtube.com");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[3]")).click();
		 Thread.sleep(2000);
		
			
		 
	}

}
