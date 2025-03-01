package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.ResultPage;

public class BaseTest {

	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	
	protected LoginPage loginPage; 
	protected AccountPage accPage; 
	protected ResultPage resultPage; 
	protected ProductInfoPage productInfoPage; 


	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.initProp();
		
		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
