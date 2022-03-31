package com.paynet.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Balaji
 * this class handles all the menu in the orange hrm
 *
 */
public class MainPage {
	private static By welcomeLocator=By.id("welcome");
	
	public static void waitForPresenceOfWelcome(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(welcomeLocator));
	}
	
	public static String getMainPageUrl(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}

	public static void clickOnWelcome(WebDriver driver)
	{
		driver.findElement(welcomeLocator).click();
	}
}







