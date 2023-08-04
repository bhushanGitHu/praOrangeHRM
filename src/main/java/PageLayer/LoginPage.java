package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseLayer;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseLayer {
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginPageFunctionality(String user, String pass) {
		UtilsClass.sendkeys(Username, user);
		UtilsClass.sendkeys(Password, pass);
		
	}
	
	public void clickOnLoginButton() {
		
		UtilsClass.click(login);
	}
	
	
	
	

}
