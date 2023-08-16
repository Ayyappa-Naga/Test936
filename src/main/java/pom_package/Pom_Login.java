package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {
	public Pom_Login(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (name="user_name")
	private WebElement userName_TextField;
	@FindBy (name="user_password")
	private WebElement password_TextField;
	@FindBys({@FindBy(id="submitButton"),@FindBy(xpath="(//input[@value='Login'])[2]")})
	private WebElement Login_Button;
	
	public WebElement getUserName_TextField() {
		return userName_TextField;
	}
	public WebElement getPassword_TextField() {
		return password_TextField;
	}
	public WebElement getPassword_Button() {
		return Login_Button;
	}
	
	public void logto_app(String uname,String pass) {
		userName_TextField.sendKeys(uname);
		password_TextField.sendKeys(pass);
		Login_Button.click();
	}
	
	

}
