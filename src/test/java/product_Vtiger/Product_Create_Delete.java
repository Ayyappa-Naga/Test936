package product_Vtiger;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.File_Utility;
import Generic_Utility.WebDriver_Utility;
import createProduct.Pom_CreateProduct;
import pom_package.Pom_Homepage;
import pom_package.Pom_Login;

public class Product_Create_Delete {
	@Test
	public static void create()throws Exception
	{
		File_Utility f1= new File_Utility();
		WebDriver_Utility wu = new WebDriver_Utility();
		String URL=f1.getStringKeyAndValue("url");
		String uname=f1.getStringKeyAndValue("username");
		String pass=f1.getStringKeyAndValue("password");
		
	
	String Pname=f1.getValeUsingDataformatter("Product", 0,0 );
		
		WebDriver driver = new ChromeDriver();
		Pom_Login pl = new Pom_Login(driver);
		Pom_Homepage ph = new Pom_Homepage(driver);
		Pom_CreateProduct pc = new Pom_CreateProduct(driver);
		
		driver.get(URL);
		wu.implicitwait(driver, 10);
		wu.maximizescreen(driver);
		
	
	pl.logto_app(uname, pass);
		ph.proClick();
		
		
		pc.getPropPlusCreate().click();
		pc.getProdName().sendKeys(Pname);
		
		
	
	
	wu.javScriptexecutor(driver, ph.getSaveButton());
ph.savebutton();
ph.proClick();
String prodtext=pc.getProdtable().getText();
if(prodtext.contains(Pname)) {
	System.out.println("Product ctreated successfully");
	
}
else {
	System.out.println("product not created ");
}
WebElement CheckBox = driver.findElement(By.xpath("//table[@class='lvt small']/tbody//td//a[text()='"+Pname+"']/../../td//input[@name='selected_id']"));

CheckBox.click();
pc.getDeleteButton().click();
Thread.sleep(1000);
wu.switchToAlertAndAccept(driver);
Thread.sleep(1000);
String s=pc.getProdtable().getText();
if(s.contains(Pname)) {
	System.out.println("product not Successfully");
}
else {
	System.out.println("product  deleted");
}

Thread.sleep(1000);
ph.signOut();
driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
