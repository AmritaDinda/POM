package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstant;

public class AccountPageTest extends BaseTest{

	@BeforeClass
	public void accSetUp() {
		accPage = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	  
	
	@Test
	public void accPageTitleTest() {
		String actTitle = accPage.accPagetitle();
		Assert.assertEquals(actTitle, AppConstant.ACCOUNT_PAGE_TITLE);
	}
	
	@Test
	public void isLogoutLinkExits() {
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}
	
	@Test
	public void accpageHeaderCountTest() {
		int acch = accPage.accPageHeaderCount();
		Assert.assertEquals(acch, AppConstant.ACCOUNTPAGE_HEADER_COUNT);
	}
	
	@Test
	public void getAccPageHeaderTest() {
		List<String> HeaderList = accPage.getAccPageHeader();
		Assert.assertEquals(HeaderList,AppConstant.Expected_AccountPage_HederList);
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	

