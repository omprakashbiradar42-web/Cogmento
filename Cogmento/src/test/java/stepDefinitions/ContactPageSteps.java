package stepDefinitions;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageSteps extends BaseClass {

	ContactPage contactPage;

	@When("user click on contact link")
	public void user_click_on_contact_link() {
		contactPage = new ContactPage();
		contactPage.userClickOnContactLink();
	}

	@Then("verify user on contact page")
	public void verify_user_on_contact_page() {
		String actualContactPageText = contactPage.verify_user_on_contact_page();

		Assert.assertEquals(actualContactPageText, "Contacts");
	}

	@Then("user click on create button")
	public void user_click_on_create_button() {
		contactPage.user_click_on_create_button();

	}

	@Then("user enter first name and last name and email")
	public void user_enter_first_name_and_last_name_and_email() {

		contactPage.user_enter_first_name_and_last_name_and_email();

	}

	@Then("user enter description and select status")
	public void user_enter_description_and_select_status() {

		contactPage.user_enter_description_and_select_status();
	}

	@Then("user enter address and city and country and pincode")
	public void user_enter_address_and_city_and_country_and_pincode() {

		contactPage.user_enter_address_and_city_and_country_and_pincode();
	}

	@Then("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {

		contactPage.user_click_on_save_button();
	}

	@Then("user click on delete button and confirm delete button")
	public void user_click_on_delete_button_and_confirm_delete_button() throws InterruptedException {
		Thread.sleep(4000);

		
		contactPage.user_click_on_delete_button_and_confirm_delete_button();

	}
}
