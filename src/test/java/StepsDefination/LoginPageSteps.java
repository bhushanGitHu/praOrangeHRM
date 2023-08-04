package StepsDefination;

import BaseLayer.BaseLayer;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseLayer{
	
	
	private static LoginPage Lpage;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		initialization();
		
	}	
	@When("user enter firstname and last name")
	public void user_enter_firstname_and_last_name() {
		Lpage= new LoginPage();
		Lpage.LoginPageFunctionality("Admin", "admin123");
	}
	
	
	@Then("click on login button")
	public void click_on_login_button() {
		Lpage.clickOnLoginButton();
		}

}
