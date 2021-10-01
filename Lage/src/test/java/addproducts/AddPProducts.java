package addproducts;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObject.LoginPage;
import pageObject.Productspage;
import utility.DriverUtiltiy;

public class AddPProducts {
	DriverUtiltiy driverutil;
	WebDriver driver;
	LoginPage login;
	Productspage prod;

	public AddPProducts() {
		driverutil = new DriverUtiltiy();
		login = new LoginPage();
		prod = new Productspage();
	}

	@BeforeTest()
	public void setup() throws IOException {
		driver = driverutil.getdriver("chrome");

	}

	@Test()
	public void addProducts() throws Exception {
//		Thread.sleep(4000);
		login.clicksignin(driver);
		login.enterEmail(driver, "vickyreddy0519@gmail.com");
		login.entepass(driver, "vicky123");
		login.clicksubmit(driver);
		prod.click_t_shirts(driver);
		prod.click_Size(driver);
		prod.click_Compositions(driver);
		prod.click_Style(driver);
		prod.click_Properties(driver);
		prod.click_Availability(driver);
		prod.click_Manufacturer(driver);
		prod.click_AddToCart(driver);
	}

	@AfterTest()
	public void tearDown() throws IOException {
		driver.quit();

	}

}
