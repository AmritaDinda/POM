package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstant;

public class LoginPageTest extends BaseTest {


	@Test
	public void loginpageUrlTest() {
		String actualUrl = loginPage.loginpageUrl();
		Assert.assertTrue(actualUrl.contains(AppConstant.LOGIN_PAGE_FRACTION_URL));
	}
	
	@Test
	public void loginPageTitleTest() {
		String actualValue = loginPage.loginpageTitle();
		Assert.assertEquals(actualValue,AppConstant.LOGIN_PAGE_TITLE);
	}
	@Test
	public void isforgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isforgotPwdLinkExist());
	}
	
	@Test(priority = Integer.MAX_VALUE)
	public void loginTest() {
		accPage = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(accPage.accPagetitle(),AppConstant.ACCOUNT_PAGE_TITLE);

	}
	
}
