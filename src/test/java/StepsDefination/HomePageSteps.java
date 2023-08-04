package StepsDefination;

import org.testng.Assert;

import BaseLayer.BaseLayer;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageSteps extends BaseLayer{

	HomePage home;
	@Then("user validate Title")
	public void user_validate_title() {
	   home = new HomePage();
	   String title = home.getTitle();
	   Assert.assertEquals(title, "OrangeHRM");
	   
		
		
	}
	@Then("validate url")
	public void validate_url() {
	    String Url = home.geturl();
	    Assert.assertEquals(Url.contains("orangehrmlive.com"), true);
	    
		
	}
	@Then("validate Logo")
	public void validate_logo() {
	    home.checklogostatus();
		
	}
}
