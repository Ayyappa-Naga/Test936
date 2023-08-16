package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Homepage {
	 
	
	
	
	public Pom_Homepage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement OrgButton;
	
	@FindBy(xpath="//a[.='More']")
	private WebElement MoreButton;
	
	@FindBy(xpath="//a[@name='Campaigns']")
	private WebElement CampButton;
	
	@FindBy(xpath="//a[.='Products']")
	private WebElement ProductButton;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccButton;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement SignOutLink;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getOrgButton() {
		return OrgButton;
	}

	public WebElement getMoreButton() {
		return MoreButton;
	}

	public WebElement getCampButton() {
		return CampButton;
	}

	public WebElement getProductButton() {
		return ProductButton;
	}

	public WebElement getAccButton() {
		return AccButton;
	}

	public WebElement getSignOutLink() {
		return SignOutLink;
	}
	
	
	public void orgClick() {
		OrgButton.click();
	}
	public void proClick() {
		ProductButton.click();
	}
	public void campClick() {
		MoreButton.click();
		CampButton.click();
		
	}
	public void signOut() {
		AccButton.click();
		SignOutLink.click();
	}
	public void savebutton() {
		saveButton.click();
	}
	
	
}
