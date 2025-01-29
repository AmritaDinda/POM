package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	//1. private By locators...
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginId = By.xpath("//div//input[@value='Login']");
	private By forgotpwd = By.linkText("Forgotten Password");
	private By logo = By.cssSelector("//div[@id='logo']//a//img[@class='img-responsive']");
	
	//2.page const....
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3.page actions/method:
	public String loginpageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public String loginpageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public boolean isforgotPwdLinkExist() {
		boolean display = driver.findElement(forgotpwd).isDisplayed();
		return display;
	}
	public boolean isLogoExist() {
		boolean display = driver.findElement(logo).isDisplayed();
		return display;
	}
	
	public String doLogin(String username,String pwd) {
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginId).click();
		String accPageTitle = driver.getTitle();
		System.out.println("Acc page title :"+ accPageTitle);
		return accPageTitle;

	}

	
}







