package com.paynet.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paynet.base.WebDriverWrapper;

public class LoginUITest extends WebDriverWrapper {
	
	@Test
	public void validateTitleTest()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

}
