package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AddNewAccountPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDefination {
	WebDriver driver;
	LoginPage loginpage;
	DashboardPage dashboardpage;
	AddNewAccountPage addnewaccountpage;

	@Before
	public void before_run() {
		driver = BrowserFactory.init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		addnewaccountpage = PageFactory.initElements(driver, AddNewAccountPage.class);
	}

	@Given("^User should be techfios login page$")
	public void User_should_be_techfios_loginpage() throws Exception {
		driver.get("https://techfios.com/billing/?ng=admin/");
		Thread.sleep(2000);
	}

	@When("^User enter user as \"([^\"]*)\"$")
	public void user_enter_user_as(String username) {
		loginpage.insertusername(username);
	}

	@When("^User enter password \"([^\"]*)\"$")
	public void user_enter_password(String password) {
		loginpage.insertpassword(password);
	}

	@And("^User click on SignInbutton$")
	public void user_click_on_SignInbutton() {
		loginpage.clickonSigninField();
	}

	// AddBank part
	@When("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String username, String password) {
		loginpage.enterCredentials(username, password);
	}

	@Then("^User land on the dashboard page$")
	public void user_land_on_the_dashboard_page() throws Exception {
		loginpage.verifyingthedashboarpage();
		loginpage.takeScreenshotAtEndofTest(driver);
	}

	@Then("^User click on Bank and Cash$")
	public void user_click_on_Bank_and_Cash() {
		dashboardpage.ClickBankandCash();
	}

	@Then("^User click on Add New Account$")
	public void user_click_on_Add_New_Account() {
		dashboardpage.ClickNewAccount();
	}

	@Then("^User enter the information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_information_and_and_and_and_and(String accountTittle, String description,
			String initialBalance, String accountNumber, String contactPerson, String phoneNumber) {
		addnewaccountpage.insertaccounttitlefield(accountTittle);
		addnewaccountpage.insertdescriptionfield(description);
		addnewaccountpage.insertinitialbalancefield(initialBalance);
		addnewaccountpage.insertaccountnumberfield(accountNumber);
		addnewaccountpage.insertcontactpersonfield(contactPerson);
		addnewaccountpage.insertphonenumberfield(phoneNumber);

	}

	@Then("^User click on submit button$")
	public void User_click_on_submit_button() {
		addnewaccountpage.clicksubmitbutton();
	}

}
