package com.Metaagrow.LoginPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;

public class VefiryLoginWithValidCredentials extends BaseClass  {
	@Test
	public void VerifyLoginTest()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Dashboard")).isDisplayed(), "Dashboard is not opened");
	}
	
	

}
