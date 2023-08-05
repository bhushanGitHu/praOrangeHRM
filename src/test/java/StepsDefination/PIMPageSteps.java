package StepsDefination;

import BaseLayer.BaseLayer;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageSteps extends BaseLayer {
	
	private static PIMPage PPage;
	@When("User on PIM page")
	public void user_on_pim_page() {
		PPage = new PIMPage();
		PPage.ClickonPIMLink();
	}
	@Then("Validate Url and Title")
	public void validate_url_and_title() {
		PPage.getTitle();
		PPage.getCurrentUrl();
	}
	@Then("Add employee details")
	public void add_employee_details() {
		PPage.enterUserDetails("Abc", "hhh", "jjj");
	
	}
	@Then("Click on save button")
	public void click_on_save_button() {
		PPage.ClickOnSave();
	}

}
