package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {


	@Test
	public void loginpageUrlTest() {
		String actualUrl = loginPage.loginpageUrl();
		Assert.assertTrue(actualUrl.contains("route=account/login"));
	}
	
	@Test
	public void loginPageTileTest() {
		String actualValue = loginPage.loginpageTitle();
		Assert.assertEquals(actualValue, "Account Login");
	}
	@Test
	public void isforgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isforgotPwdLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginPage.doLogin("naveen@gmail.com","test@123");
	}
	
}
