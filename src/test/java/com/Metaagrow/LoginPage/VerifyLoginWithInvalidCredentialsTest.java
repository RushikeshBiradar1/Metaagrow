package com.Metaagrow.LoginPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Reports;
import com.aventstack.extentreports.model.Report;

public class VerifyLoginWithInvalidCredentialsTest extends BaseClass {
	
	@Test(priority = 1)
	public void VerifyLoginWithInValidCredintails() throws Throwable
	{


		String ActualInvalidCredmsg=driver.findElement(By.xpath("//span[@class='invalidCred']")).getText();
		String ExpInvalidCredmsg="Invalid login details.";
		Assert.assertTrue(ActualInvalidCredmsg.contains(ExpInvalidCredmsg), "Error massege is not showing proper");
		System.out.println("M1");
		
    }
	
	@Test(priority = 2)
	public void VerifyForgotPageErrorMassege() throws Throwable
	{
		Thread.sleep(3000);
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_Forgot_Password_Button();
		lp.ClickOn_Email_TextBox_On_Forgot_Page("7522");
		lp.ClickOn_Send_Button_On_Forgot_Page();
		String WarningMessege = driver.findElement(By.xpath("//span[normalize-space()='Enter Valid email']")).getText();
		String ExpectWarningMassege="Enter Valid email22";
		Assert.assertTrue(WarningMessege.contains(ExpectWarningMassege),"Expected warning massage is not matching");
		System.out.println("M2");
	}

}
