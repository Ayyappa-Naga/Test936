package campaign;



import org.openqa.selenium.By;

import org.testng.annotations.Test;


import Generic_Utility.Base_Class;

public class Campaign_Scenario_3vtiger extends Base_Class {
@Test 
public  void Scenario_3()throws Exception {
	

	driver.findElement(By.xpath("//a[.='More']")).click();
	driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.name("campaignname")).sendKeys("new Campaigns");
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
	
	
}@Test 
public void Scene() {
	driver.findElement(By.xpath("//a[.='More']")).click();
	driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.name("campaignname")).sendKeys("new Campaign123");
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
	
	
}
}
