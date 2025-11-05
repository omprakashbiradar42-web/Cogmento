package stepDefinitions;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	HomePage homePage;

	@Then("validate home page logo")
	public void validate_home_page_logo() throws InterruptedException {
		Thread.sleep(4000);

		homePage = new HomePage();

		boolean logoStatus = homePage.validateHomePageLogo();
		Assert.assertEquals(logoStatus, true);
	}

	@Then("validate home page header")
	public void validate_home_page_header() {

		String actualHeaderText = homePage.validateHomePageHeader();

		Assert.assertEquals(actualHeaderText, "Soft Tech enterprises");
	}

	@When("user click on profile icon")
	public void user_click_on_profile_icon() {
		
		homePage = new HomePage();
		homePage.userClickOnProfileIcon();

	}

	@When("user click on logout button")
	public void user_click_on_logout_button() {

		homePage.userClickOnLogoutButton();

	}

}
