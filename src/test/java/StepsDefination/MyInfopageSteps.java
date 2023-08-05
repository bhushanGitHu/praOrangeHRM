package StepsDefination;

import BaseLayer.BaseLayer;
import PageLayer.MyInfoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyInfopageSteps extends BaseLayer{
	private static MyInfoPage page;
	@When("User Click on myinfo link")
	public void user_click_on_myinfo_link() {
	    page=new MyInfoPage();
	    page.clickbutton();
	    
	}

	@Then("User Enter nickname")
	public void user_enter_nickname() {
	    
	    page.EnterNick("sam");
	}

	@Then("click on save button")
	public void click_on_save_button() {
	    page.clicksave();
	}
}
