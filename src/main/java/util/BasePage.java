package util;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public int RandomGenerator(int value1) {
		Random rnd = new Random();
		int value = rnd.nextInt(999);
		return value;

	}

	public void waitForElement(WebDriver driver, int timeInSecond, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecond);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
}