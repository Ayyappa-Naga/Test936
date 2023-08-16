package organisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.File_Utility;
import Generic_Utility.WebDriver_Utility;
import pom_package.Pom_Homepage;
import pom_package.Pom_Login;
import create_Organization.Pom_CreateOrganization;

public class Create_Org {
	@Test
	public void Create_Org() throws Exception {
		
		WebDriver_Utility wu = new WebDriver_Utility();
		File_Utility fu = new File_Utility();
		String name=fu.getValeUsingDataformatter("Organization", 0, 0);
		String phone=fu.getValeUsingDataformatter("Organization", 1, 0);
		String email=fu.getValeUsingDataformatter("Organization", 2, 0);
		String URL=fu.getStringKeyAndValue("url");
		String uname=fu.getStringKeyAndValue("username");
		String pass=fu.getStringKeyAndValue("password");
	WebDriver driver1=	wu.runDriver();
	driver1.get(URL);
	Pom_Login po = new Pom_Login(driver1);
		po.logto_app(uname, pass);
		Pom_Homepage ph = new Pom_Homepage(driver1);
		ph.orgClick();
		
		Pom_CreateOrganization cp = new Pom_CreateOrganization(driver1);
		cp.clickOnImg();
		cp.orgData(name, phone, email);
		ph.orgClick();
		Thread.sleep(3000);
		ph.signOut();
		
	}

}
