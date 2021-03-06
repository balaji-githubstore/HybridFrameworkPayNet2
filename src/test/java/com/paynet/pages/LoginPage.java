package com.paynet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private static By usernameLocator = By.id("txtUsername");
	private static By passwordLocator = By.xpath("//input[@id='txtPassword']");
	private static By loginLocator = By.name("Submit");
	private static By forgotPasswordLocator = By.partialLinkText("Forgot");
	private static By errorLocator = By.id("spanMessage");
	
	public static void loginIntoPortal(WebDriver driver,String username,String password)
	{
		driver.findElement(usernameLocator).sendKeys(username);
		driver.findElement(passwordLocator).sendKeys(password);
		driver.findElement(loginLocator).click();
	}

	public static void enterUsername(WebDriver driver, String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public static void clickOnLogin(WebDriver driver) {
		driver.findElement(loginLocator).click();
	}

	public static void clickOnForgotPassword(WebDriver driver) {
		driver.findElement(forgotPasswordLocator).click();
	}

	public static String getErrorMessage(WebDriver driver) {
		String msg = driver.findElement(errorLocator).getText();
		return msg;
	}

	public static String getLoginPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
}
