package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	WebElement logo;

	@FindBy(xpath = "//div[@class='header item']/following-sibling::b")
	WebElement headerText;

	@FindBy(xpath = "//div[@class='ui buttons']/descendant::div[@role='listbox']")
	WebElement profileIcon;

	@FindBy(xpath = "//div[@class='header item']/following-sibling::b")
	WebElement logout;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public boolean validateHomePageLogo() throws InterruptedException {
		return logo.isDisplayed();
	}

	public String validateHomePageHeader() {

		return headerText.getText();
	}

	public void userClickOnProfileIcon() {

		profileIcon.click();

	}

	public void userClickOnLogoutButton() {

		logout.click();

	}

}
