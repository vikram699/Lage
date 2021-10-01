package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtiltiy {

	public WebDriver getdriver(String browserName) {
		WebDriver driver = null;
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("http://automationpractice.com/index.php");
		}
		return driver;
	}

}
