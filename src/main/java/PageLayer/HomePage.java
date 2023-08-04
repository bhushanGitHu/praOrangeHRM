package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseLayer;

public class HomePage extends BaseLayer{
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement logo;
	

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String geturl() {
		return driver.getCurrentUrl();
	}
	
	public boolean checklogostatus()
	{
		return logo.isDisplayed();
	}
	
	
}
