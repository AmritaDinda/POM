package com.qa.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.opencart.constants.AppConstant;
import com.qa.opencart.utils.ElementUtil;

public class ResultPage {

	private WebDriver driver;
	private ElementUtil eleUtil ;
	
	private By searchHeader = By.cssSelector("div#content h2");
	private By result = By.cssSelector("div.product-thumb");
	
	public ResultPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getSearchHeader() {
	String searchHeaderValue = eleUtil.waitForElementVisible(searchHeader, AppConstant.DEFULT_SHORT_TIMEOUT).getText();
		System.out.println(searchHeaderValue);
		return searchHeaderValue;
	}
	
	public int  getSearchResultCount() {
		int resultCount = eleUtil.waitForElementsVisible(result, AppConstant.DEFULT_SHORT_TIMEOUT).size();
	  System.out.println(resultCount);
	  return resultCount ;
		
	}	
	
	public ProductInfoPage SelectProduct(String productName) {
		  System.out.println("product name ==>"+productName);
		eleUtil.doClick(By.linkText(productName));  //Dynamic By locator where the locator depends on the parameters
	 return new ProductInfoPage(driver); //TDD
	}
	
	
	
	
	
	
	
}
