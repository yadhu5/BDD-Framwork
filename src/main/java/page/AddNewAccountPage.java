package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;



public class AddNewAccountPage extends BasePage {
	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement ACCOUNT_TITTLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='description']")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='balance']")
	WebElement INITIALBALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	WebElement PHONE_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='ib_url']")
	WebElement INTERNET_URL_FIELD;
	@FindBy(how=How.XPATH,using = "//button[@class='btn btn-primary']") 
	WebElement SUBMIT_BUTTON;

	public void insertaccounttitlefield(String accountTittle) {
		waitForElement(driver,3,ACCOUNT_TITTLE_FIELD);
		ACCOUNT_TITTLE_FIELD.sendKeys(accountTittle);
	}

	public void insertdescriptionfield(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
	}

	public void insertinitialbalancefield(String initialBalance) {
		INITIALBALANCE_FIELD.sendKeys(initialBalance);
	}

	public void insertaccountnumberfield(String accountNumber) {

	int generatenumber = RandomGenerator(999);

		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber + generatenumber);	

	}

	public void insertcontactpersonfield(String contactPerson) {
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
	}

	public void insertphonenumberfield(String phone) {
		int generatenumber = RandomGenerator(999);
		PHONE_NUMBER_FIELD.sendKeys(phone + generatenumber);
	}

	public void insertinterneturl(String internetBanking) {
		INTERNET_URL_FIELD.sendKeys(internetBanking);
	}
	public void clicksubmitbutton() {
		 SUBMIT_BUTTON.click();
	}
}
