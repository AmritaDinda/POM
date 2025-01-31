package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.error.AppError;
import com.qa.opencart.exception.BrowserException;

public class DriverFactory {

	public static String isHighlight;
	public WebDriver driver;
	Properties prop;
	
	/**
	 * This method is used to init the driver on the basis of given browsername.
	 * @param prop2
	 * @return it return driver
	 */
	
	public WebDriver initDriver(Properties prop) {
		
		String browsername = prop.getProperty("browser");
			
		System.out.println("browser name is :"+browsername);
		
		switch(browsername.toLowerCase().trim()) {
		case "chrome":
		   driver = new ChromeDriver();
		break;
		case "firefox":
			   driver = new FirefoxDriver();
			break;
		case "edge":
			   driver = new EdgeDriver();
			break;
		case "safari":
			   driver = new SafariDriver();
			break;
	    default:
	    	System.out.println(AppError.INVALID_BROWSER_MESG+browsername);
	    	throw new BrowserException(AppError.INVALID_BROWSER_MESG+browsername);	
	    }		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		return driver;
		
   }
	
	/**
	 * This method is used to init the properties from the config file
	 * @return
	 */
	public Properties initProp() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(".\\src\\test\\resources\\Config\\Config.propertise");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
