package com.paynet.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paynet.base.WebDriverWrapper;
import com.paynet.pages.LoginPage;

public class LoginUITest extends WebDriverWrapper {
	
	@Test
	public void validateTitleTest()
	{
		Assert.assertEquals(LoginPage.getLoginPageTitle(driver), "OrangeHRM");
	}

}
