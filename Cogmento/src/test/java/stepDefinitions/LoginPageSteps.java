package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
	LoginPage loginPage;

	@Given("user open application in {string} browser")
	public void user_open_application_in_browser(String driverName) {
		initialization(driverName);
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {

		loginPage = new LoginPage();
		loginPage.userEnterAalidUsernameandPassword();

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		loginPage.userClickOnLoginButton();

	}

	@AfterStep
	public void screenshot(Scenario scenario) throws InterruptedException {
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) getDriver();

		byte[] sourceScreenshot = ts.getScreenshotAs(OutputType.BYTES);

		scenario.attach(sourceScreenshot, "image/png", scenario.getName());

	}

}
