package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class AccountPage {

	private WebDriver driver;
	private ElementUtil eleutil;
	

	private By logoutLink = By.linkText("Logout");
	private By AccsHeader = By.cssSelector("div #content h2");
	private By search = By.name("search");
	private By searchIcon = By.cssSelector("div#search button");
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}

	                                                            //public called the private "Encapsulation"	
	public String accPagetitle() { 
		String title = eleutil.waitForTitleContainsAndReturn(AppConstant.ACCOUNT_PAGE_TITLE,AppConstant.DEFULT_SHORT_TIMEOUT);        
		System.out.println(title);
		return title;
	}
	
	public boolean isLogoutLinkExist() {
		return eleutil.isElementDisplayed(logoutLink);
	}
	
	public int accPageHeaderCount() {
		return eleutil.waitForElementsVisible(AccsHeader, AppConstant.DEFULT_SHORT_TIMEOUT).size();
	}
	
	public List<String> getAccPageHeader() {
		List<WebElement> accountheder = eleutil.waitForElementsVisible(AccsHeader,AppConstant.DEFULT_SHORT_TIMEOUT );
		List<String>accountHeaderList = new ArrayList<String>();
		
		for(WebElement e: accountheder) {
			String gt =  e.getText();
			accountHeaderList.add(gt);
		}
		return accountHeaderList ;
	}
	
	
	public ResultPage doSearch(String sekey) {
	System.out.println("Search Key ==>"+sekey);
	WebElement searchEle = eleutil.waitForElementVisible(search, AppConstant.DEFULT_SHORT_TIMEOUT);
     eleutil.doSendKeys(searchEle, sekey);
	eleutil.doClick(searchIcon);
	return new ResultPage(driver); //TDD (Test Driven Development) - first write test cases on the basses of this you should go for the development
	
	}
	
	
	
	
	
	
	
	
	
}
