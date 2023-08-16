package campaign;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic_Utility.File_Utility;
import Generic_Utility.WebDriver_Utility;
import create_Campaign.Pom_CampaignCreation;
import pom_package.Pom_Homepage;
import pom_package.Pom_Login;

public class Campaign_Scenario_4vtiger {
	
	@Test 
	public static void scenario_4()throws Throwable{
		
	
		WebDriver_Utility wu = new WebDriver_Utility();
		File_Utility fu = new File_Utility();
		
		String URL=fu.getStringKeyAndValue("url");
		String uname=fu.getStringKeyAndValue("username");
		String pass=fu.getStringKeyAndValue("password");
	String productName=	fu.getValeUsingDataformatter("Product", 0, 0);
	WebDriver driver=	wu.runDriver();
	driver.get(URL);
		Pom_Login po = new Pom_Login(driver);
		po.logto_app(uname, pass);
    Pom_Homepage ph = new Pom_Homepage(driver);
    
     ph.campClick();
     Pom_CampaignCreation pc = new Pom_CampaignCreation(driver);
     pc.createCampPlus();
     pc.getCampName().sendKeys(productName);
    String Pid= driver.getWindowHandle();
     pc.prodPlusButton();
     wu.windowswitch(driver, "module=Products");
     pc.getSelectPro().click();
     driver.switchTo().window(Pid);
     ph.savebutton();
     ph.signOut();
	

	
	

}
}