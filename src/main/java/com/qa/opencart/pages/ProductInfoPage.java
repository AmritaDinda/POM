package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class ProductInfoPage {


	private WebDriver driver;
	private ElementUtil eleUtil ;
	
	private By productHeader = By.cssSelector("div#content div h1");

	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getProductHeader() {
	String productHeaderValue = eleUtil.waitForElementVisible(productHeader, AppConstant.DEFULT_SHORT_TIMEOUT).getText();
	  System.out.println("product Header ===>"+productHeader);
	  return productHeaderValue;

	}
}
