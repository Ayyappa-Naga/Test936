package Generic_Utility;

import java.io.File;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class WebDriver_Utility {
	/**
	 * window maximize
	 * @param driver
	 */
	public void maximizescreen(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
	
	
	public void minimizescreen(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void implicitwait(WebDriver driver,int timein_ms ) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timein_ms));
		
	}

	
	public void windowswitch(WebDriver driver,String partialwindowtitle ) {
	Set<String> all_ids	=driver.getWindowHandles();
	
	
	Iterator <String> i1 = all_ids.iterator();
	while(i1.hasNext()) {
		String wid =i1.next();
		driver.switchTo().window(wid);
		if(driver.getTitle().contains(partialwindowtitle)) {
			break;
		}}
	}
	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
	}
	
		public void fluentWait(WebDriver driver,WebElement element,int pollingTime) {
			FluentWait wait = new FluentWait(driver);
			wait.pollingEvery(Duration.ofSeconds(pollingTime));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
		public void switchToAlertAndAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		public void switchToAlertAndDismiss(WebDriver driver) {
			driver.switchTo().alert().dismiss();		}
		
		
		public void switchToFrame(WebDriver driver ,int ind) {
			driver.switchTo().frame(ind);
			
		}
		public void switchToFrame(WebDriver driver ,String AttributeName) {
			driver.switchTo().frame(AttributeName);
			
		}
		public void switchToMainFrame(WebDriver driver) {
			driver.switchTo().defaultContent();
			
			
		}
		public void select(WebElement element,int index) {
		Select sel = new Select(element);
			
			sel.selectByIndex(index);
		}
		
		public void select(WebElement element,String text) {
			Select sel = new Select(element);
				
				sel.selectByVisibleText(text);
			}
		public void rightclick(WebDriver Driver,WebElement element ) {
			Actions act = new Actions(Driver);
			act.contextClick(element);
			
		}
	
	
	public void takeScreenShot(WebDriver driver,String path) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File Dest =new File(path);
		Files.copy(src, Dest);
		
	}
	
	
	public WebDriver  runDriver() throws Exception {
	
		File_Utility fi = new File_Utility();
		String Browser=fi.getStringKeyAndValue("browser");
		WebDriver driver;
		
		if(Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();			
		}
		
		else if(Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(Browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();	
		}
			else {
				driver = new ChromeDriver();	
				
			}
		return driver;}
	public void javScriptexecutor(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
		
			
			
	
		
		
	
	}
	


