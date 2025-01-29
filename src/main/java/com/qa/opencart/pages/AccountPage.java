package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	private WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	private By logoutLink = By.linkText("Logout");
	private By AccsHeader = By.cssSelector("div #content h2");
	private By search = By.name("search");
	
	public String accPagetitle() {                                 //public called the private "Encapsulation"
		String title = driver.getTitle();
		System.out.println(title);
		return accPagetitle();
	}
	
	public void accPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public boolean isLogoutLinkExist() {
		return driver.findElement(logoutLink).isDisplayed();
	}
	
	public boolean issearchExist() {
		return driver.findElement(search).isDisplayed();
	}
	
	public List<String> accHeaderExist() {
		List<WebElement> accountheder = driver.findElements(AccsHeader);
		List<String>accountHeaderList = new ArrayList<String>();
		
		for(WebElement e: accountheder) {
			String gt =  e.getText();
			accountHeaderList.add(gt);
		}
		return accountHeaderList ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
