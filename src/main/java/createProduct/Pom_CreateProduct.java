package createProduct;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_CreateProduct {
	public Pom_CreateProduct(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//img[@alt='Create Product...']")
private WebElement PropPlusCreate;
@FindBy(xpath="//input[@name='productname']")
private WebElement ProdName;
 @FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
 private WebElement SaveButton;
 @FindBy (xpath="(//input[@value='Delete'])[1]")
 private WebElement deleteButton;
 @FindBy(xpath="//table[@class='lvt small']")
 private WebElement Prodtable;
 
 
 
 
public WebElement getProdtable() {
	return Prodtable;
}
public WebElement getPropPlusCreate() {
	return PropPlusCreate;
}
public WebElement getProdName() {
	return ProdName;
}
public WebElement getSaveButton() {
	return SaveButton;
}
public WebElement getDeleteButton() {
	return deleteButton;
}

 


	
	

}
