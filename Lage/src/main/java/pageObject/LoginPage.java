package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	By signin = By.xpath("//a[@class='login']");
	By email1 = By.xpath("//*[@id='email']");
	By pass = By.xpath("//*[@type='password']");
	By submit = By.xpath("//*[@id='SubmitLogin']");

	public void clicksignin(WebDriver driver) {
		WebDriverWait wb = new WebDriverWait(driver, 30);
		wb.until(ExpectedConditions.elementToBeClickable(signin));
		driver.findElement(signin).click();
	}

	public void enterEmail(WebDriver driver, String emailVal) {
		driver.findElement(email1).sendKeys(emailVal);

	}

	public void entepass(WebDriver driver, String password) {
		driver.findElement(pass).sendKeys(password);
		driver.findElement(pass).click();
	}

	public void clicksubmit(WebDriver driver) {
		driver.findElement(submit).click();
	}
}
