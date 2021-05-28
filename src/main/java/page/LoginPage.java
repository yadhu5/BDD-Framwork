package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.util.Asserts;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USER_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement USER_PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement USER_SIGNIN_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_PAGE;

	public void insertusername(String username) {
		USER_NAME_FIELD.sendKeys(username);

	}

	public void insertpassword(String password) {
		USER_PASSWORD_FIELD.sendKeys(password);
	}

	public void clickonSigninField() {
		USER_SIGNIN_BUTTON.click();
	}

	public void enterCredentials(String username, String password) {
		USER_NAME_FIELD.sendKeys(username);
		USER_PASSWORD_FIELD.sendKeys(password);
		

	}

	public void verifyingthedashboarpage() {

		Assert.assertEquals("Dashboard", DASHBOARD_PAGE.getText());

	}
	public void takeScreenshotAtEndofTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot)driver);	
		SimpleDateFormat dateformatter  = new SimpleDateFormat("MMDDYY_HHmmss");
		Date date = new Date();
		String label = dateformatter.format(date);
		File soucreFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(soucreFile, new File(currentDirectory + "/screenshots/"+label+ ".png"));
		

	}

}
