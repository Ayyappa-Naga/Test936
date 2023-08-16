package create_Organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_CreateOrganization {
	public Pom_CreateOrganization(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement clickimg;
	@FindBy(name="accountname")
	private WebElement OrgName;
	@FindBy(id="phone")
	private WebElement OrgPhone;
	public WebElement getClickimg() {
		return clickimg;
	}
	public WebElement getOrgName() {
		return OrgName;
	}
	public WebElement getOrgPhone() {
		return OrgPhone;
	}
	public WebElement getOrgEmail() {
		return OrgPhone;
	}
	@FindBy(id="email1")
	private WebElement OrgEmail;
	
	
	public void clickOnImg() {
		clickimg.click();
	}
	public void orgData(String Orgname,String phoneNum,String email) {
		OrgName.sendKeys(Orgname);
		OrgPhone.sendKeys(phoneNum);
		OrgEmail.sendKeys(email);
	}
	
	
	
	
		

	

	

}
