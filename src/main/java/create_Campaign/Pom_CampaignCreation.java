package create_Campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_CampaignCreation {

	public Pom_CampaignCreation(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement plusCampButton;
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campName;
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement plusPrdButton;

	@FindBy(id="1")
	private WebElement selectPro;

	public WebElement getPlusCampButton() {
		return plusCampButton;
	}

	public WebElement getCampName() {
		return campName;
	}

	public WebElement getPlusPrdButton() {
		return plusPrdButton;
	}

	public WebElement getSelectPro() {
		return selectPro;
	}

	public void createCampPlus() {
		plusCampButton.click();}
	
		public void prodPlusButton() {
			plusPrdButton.click();
			
		}
		
	}
	

