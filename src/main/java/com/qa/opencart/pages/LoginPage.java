package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;

	//1. private By locators...
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginId = By.xpath("//div//input[@value='Login']");
	private By forgotpwd = By.linkText("Forgotten Password");
	private By logo = By.cssSelector("//div[@id='logo']//a//img[@class='img-responsive']");
	
	//2.page const....
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		
	}
	
	//3.page actions/method:
	public String loginpageTitle() {
		String title = eleutil.waitForTitleContainsAndReturn(AppConstant.LOGIN_PAGE_TITLE,AppConstant.DEFULT_SHORT_TIMEOUT);
		System.out.println(title);
		return title;

	}
	public String loginpageUrl() {
        String url = eleutil.waitForURLContainsAndReturn(AppConstant.LOGIN_PAGE_FRACTION_URL, AppConstant.DEFULT_SHORT_TIMEOUT);
		System.out.println(url);
		return url;
	}
	
	public boolean isforgotPwdLinkExist() {
		boolean display = eleutil.isElementDisplayed(forgotpwd);
		return display;
	}
	
	public boolean isLogoExist() {
		boolean display = eleutil.isElementDisplayed(logo);
		return display;
	}
	
	public AccountPage doLogin(String username,String pwd) {
		
		eleutil.waitForElementVisible(emailId, AppConstant.DEFULT_SHORT_TIMEOUT).sendKeys(username);;
		eleutil.doSendKeys(password, pwd);
		eleutil.doClick(loginId);
		return new AccountPage(driver);

	}

	
}







