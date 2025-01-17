package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public WebDriver driver;
	
	public WebDriver initDriver(String browsername) {
		
		System.out.println("browser name is :"+browsername);
		
		if(browsername.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if(browsername.trim().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		if(browsername.trim().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		if(browsername.trim().equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("plz pass the right browser");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
	}
}
