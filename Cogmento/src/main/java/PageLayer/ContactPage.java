package PageLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Then;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contactLink;

	@FindBy(xpath = "//span[@class='selectable ']")
	WebElement contactPage;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	WebElement createbutton;

	@FindBy(name = "first_name")
	WebElement firstname;

	@FindBy(name = "last_name")
	WebElement lastName;

	@FindBy(name = "value")
	WebElement email;

	@FindBy(name = "description")
	WebElement description;

	@FindBy(name = "status")
	WebElement status;

	@FindBys(@FindBy(name = "//div[@name='status']/child::span"))
	List<WebElement> listStatus;

	@FindBy(name = "address")
	WebElement address;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "zip")
	WebElement zip;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//button[@class='ui button icon']")
	WebElement deleteButton;

	@FindBy(xpath = "//button[text()='Delete']")
	WebElement confirmDelete;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void userClickOnContactLink() {

		contactLink.click();
	}

	public String verify_user_on_contact_page() {
		return contactPage.getText();
	}

	public void user_click_on_create_button() {
		createbutton.click();
	}

	public void user_enter_first_name_and_last_name_and_email() {

		firstname.sendKeys("Manasi");
		lastName.sendKeys("Patil");
		email.sendKeys("manasi@gmail.com");

	}

	public void user_enter_description_and_select_status() {

		description.sendKeys("Automation Test Engineer");

//		status.click();
//
//		for (WebElement value : listStatus) {
//			String actualValue = value.getText();
//
//			if (actualValue.equalsIgnoreCase("Active")) {
//				value.click();
//				break;
//			}
//		}

	}

	public void user_enter_address_and_city_and_country_and_pincode() {

		address.sendKeys("Pune");

		city.sendKeys("Pune");

		state.sendKeys("India");

		zip.sendKeys("112211");
	}

	public void user_click_on_save_button() throws InterruptedException {

		saveButton.click();
	}

	public void user_click_on_delete_button_and_confirm_delete_button() throws InterruptedException {


		deleteButton.click();

		confirmDelete.click();


	}
}
