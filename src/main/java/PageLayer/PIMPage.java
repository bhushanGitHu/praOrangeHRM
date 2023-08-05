package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseLayer;
import UtilsLayer.UtilsClass;

public class PIMPage extends BaseLayer{
	
	@FindBy(xpath="//li[@class='oxd-main-menu-item-wrapper'][2]")
	private WebElement PIMLink;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement AddEmp;
	
	@FindBy(name="firstName")
	private WebElement FirstName;
	
	@FindBy(name="middleName")
	private WebElement MiddleName;
	
	@FindBy(name="lastName")
	private WebElement LastName;
	
	//@FindBy(xpath="//label[@class='oxd-label']//following::div[1]")
//	private WebElement EmpId;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveB;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	private WebElement SaveBtn;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonPIMLink() {
		UtilsClass.click(PIMLink);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void enterUserDetails(String fname, String Mname, String Lname) {
		UtilsClass.click(AddEmp);
		UtilsClass.sendkeys(FirstName, fname);
		UtilsClass.sendkeys(MiddleName, Mname);
		UtilsClass.sendkeys(LastName, Lname);
		UtilsClass.click(SaveB);
	}
	
	public void ClickOnSave() {
		UtilsClass.click(SaveBtn);
	}
}
















