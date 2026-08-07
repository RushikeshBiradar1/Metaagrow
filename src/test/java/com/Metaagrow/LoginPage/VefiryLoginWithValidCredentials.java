package com.Metaagrow.LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;

public class VefiryLoginWithValidCredentials extends BaseClass  {
	@Test
	public void VerifyLoginTest()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		// Verify Welcome popup is displayed (waits for it to render, Angular renders async)
		WebElement welcomeTitle = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='welcome-title']")));
		Assert.assertTrue(welcomeTitle.isDisplayed(), "Welcome popup is not displayed");
 
		// Verify Successful Login badge
		WebElement successBadge = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='welcome-badge']")));
		Assert.assertTrue(successBadge.isDisplayed(), "Login success badge is not displayed");
 
		// Click Continue button
		WebElement continueBtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-continue']")));
		continueBtn.click();
 
		// Verify Dashboard page after clicking Continue
		WebElement dashboardLink = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.linkText("Dashboard")));
		Assert.assertTrue(dashboardLink.isDisplayed(), "Dashboard is not displayed after login");
	
	}
	
	

}


