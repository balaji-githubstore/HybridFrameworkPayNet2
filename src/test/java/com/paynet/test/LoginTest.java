package com.paynet.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paynet.base.WebDriverWrapper;	

public class LoginTest extends WebDriverWrapper {
	
	@Test
	public void validCredentialTest()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), 
				"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	
	//create a dataprovider - invalidCredentialData()
	
	//(john,john123,Invalid credentials)
	//(mark,mark123,Invalid credentials)
	
	@DataProvider
	public String[][] invalidCredentialData()
	{
		String[][] main=new String[2][3];
		
		main[0][0]="john";
		main[0][1]="john123";
		main[0][2]="Invalid credentials";
		
		main[1][0]="mark";
		main[1][1]="mark123";
		main[1][2]="Invalid credentials";
		
		return main;
	}
	
	
	
	@Test(dataProvider = "invalidCredentialData")
	public void invalidCredentialTest(String username,String password,String expectedError)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		
		String actualError=driver.findElement(By.id("spanMessage")).getText();
		
		Assert.assertEquals(actualError, expectedError);
	}
}
