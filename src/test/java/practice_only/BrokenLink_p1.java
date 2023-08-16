package practice_only;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_p1 
{
 public static void main(String args[])
   {String eachLink=null;
      
   WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().timeouts().implicitlywait(10,TimeUnit.SECONDS);
List<WebElement> links=driver.findElements(By.xpath("//a"));
int Statuscode =0;
URL url= null;
System.out.println(links.size());
ArrayList<String> al = new ArrayList<String>();
try{
 for(int i=0;i<=links.size();i++)
{
   eachLink =links.get(i).getAttribute("href");
url= new URL(eachLink);
      HttpURLConnection httpu = (HttpURLConnection) url.openConnection();
Statuscode= httpu.getResponseCode();
	
if(Statuscode>=400)
{
   al.add(eachLink+"--->"+Statuscode);
}}}
catch(Exception e)
{
	al.add(eachLink+"--->"+Statuscode);

}
System.out.println(al);}
}
