package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void userEnterAalidUsernameandPassword() {
		username.sendKeys("prafulp1010@gmail.com");
		password.sendKeys("Pr@ful0812");
	}

	public void userClickOnLoginButton() {
		loginButton.click();

	}

}
