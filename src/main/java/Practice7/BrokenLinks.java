package Practice7;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	
	
	

		public static void main(String[] args) 
		{
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.flipkart.com");
		List<WebElement> linkList = driver.findElements(By.xpath("//a"));
		int num=linkList.size();
		System.out.println(num);
		List<String> brokenLink = new ArrayList<String>();
		for(int i=0;i<linkList.size();i++)
		{
			String link = linkList.get(i).getAttribute("href");
			URL url;
			int statusCode=0;
			try {
				url=new URL(link);
				URLConnection urlConnect = url.openConnection();
				HttpURLConnection HttpURLConnection = (HttpURLConnection)urlConnect;
				statusCode=HttpURLConnection.getResponseCode();
				if(statusCode>=400)
				{
					brokenLink.add(link+"--->"+statusCode);
				}
			} catch (Exception e) {
			brokenLink.add(link);
			continue;	
			}
		}
		System.out.println(brokenLink);
		}
	}




