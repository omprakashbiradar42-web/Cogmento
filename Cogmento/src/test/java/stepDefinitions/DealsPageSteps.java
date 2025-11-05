package stepDefinitions;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageSteps extends BaseClass {
	DealsPage dealsPage;

	@When("user click on deals link")
	public void user_click_on_deals_link() {
		dealsPage = new DealsPage();
		dealsPage.user_click_on_deals_link();
	}

	@Then("verify user on deals page")
	public void verify_user_on_deals_page() {
		Assert.assertNotSame(dealsPage.verify_user_on_deals_page(), "Deals");
	}

	@Then("user click on create button in deals page")
	public void user_click_on_create_button_in_deals_page() {
		dealsPage.user_click_on_create_button_in_deals_page();
	}

	@Then("user enter title in deals page")
	public void user_enter_title_in_deals_page() {
		dealsPage.user_enter_title_in_deals_page();
	}

	@Then("user enter description in deals page")
	public void user_enter_description_in_deals_page() {
		dealsPage.user_enter_description_in_deals_page();
	}

	@Then("user click on save button in deals page")
	public void user_click_on_save_button_in_deals_page() {
		dealsPage.user_click_on_save_button_in_deals_page();
	}

	@Then("user click on delete button and confirm delete button in deals  page")
	public void user_click_on_delete_button_and_confirm_delete_button_in_deals_page() throws InterruptedException {
		Thread.sleep(4000);
		
		dealsPage.user_click_on_delete_button_and_confirm_delete_button_in_deals_page();
	}
}
