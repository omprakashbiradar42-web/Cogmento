package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class DealsPage extends BaseClass {
	@FindBy(xpath="//a[@href='/deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[@class='selectable ']")
	WebElement dealsPage;
	
	
	@FindBy(xpath="//a[@href='/deals/new']")
	WebElement createbutton;
	
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(name="description")
	WebElement descriptions;
	
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//button[@class='ui button icon']")
	WebElement deletebutton;
	
	@FindBy(xpath="//button[text()='Delete']")
	WebElement confirmDelete;
	
	public DealsPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void user_click_on_deals_link() {
		dealsLink.click();
	}

	public String verify_user_on_deals_page() {
		return dealsPage.getText();
	}

	public void user_click_on_create_button_in_deals_page() {
		createbutton.click();
	}

	public void user_enter_title_in_deals_page() {
		title.sendKeys("Automation Deals");
	}

	public void user_enter_description_in_deals_page() {
		descriptions.sendKeys("Deals On Testing Course");
	}

	public void user_click_on_save_button_in_deals_page() {
		saveButton.click();
	}

	public void user_click_on_delete_button_and_confirm_delete_button_in_deals_page() {
		deletebutton.click();
		confirmDelete.click();
	}

}
