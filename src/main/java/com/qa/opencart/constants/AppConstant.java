package com.qa.opencart.constants;

import java.util.List;

public class AppConstant {
	
	public static final int DEFULT_SHORT_TIMEOUT = 5;
	public static final int DEFULT_MEDIUM_TIMEOUT = 10;
	public static final int DEFULT_LONG_TIMEOUT = 20;

	public static final int ACCOUNTPAGE_HEADER_COUNT = 4;


	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final String ACCOUNT_PAGE_TITLE = "My Account";

	public static final String LOGIN_PAGE_FRACTION_URL = "route=account/login";
	
	public static final List<String> Expected_AccountPage_HederList = List.of("My Account","My Orders","My Affiliate Account","Newsletter");

}
