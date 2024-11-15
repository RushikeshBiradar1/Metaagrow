package com.Metaagrow.Settings;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Settings;
import com.MetaaGrow.ObjectRepository.Setup;
import com.mysql.cj.exceptions.AssertionFailedException;

public class SettingsTest extends BaseClass {
	@Test(priority = 1)
	public void SelectRegionCurrencyDropdownTest()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSettingsLInkText();
		Settings set = new Settings(driver);
		set.Select_Region_SettingBy_VisibleText("India");
		set.Select_currency_SettingBy_VisibleText("Rupees");
		set.ClickOn_Save_Button();
		set.ClickOn_Ok_Button_On_Confirmation_Page();
		
	}
	
	@Test(enabled = false)
	public void SelectRegionWithoutCurrency_SaveButtonTest()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSettingsLInkText();
		Settings set = new Settings(driver);
		set.Select_Region_SettingBy_VisibleText("India");
		WebElement save = driver.findElement(By.xpath("//span[.='Save']"));
		set.Select_currency_SettingBy_VisibleText("Select Currency");
//		save.isEnabled();
		// Check if the save button is enabled or disabled
		if (save.isEnabled()) {
		// Fail the script if the save button is enabled
			assert false : "Save button is enabled";
			
		} else {
		// Pass the script if the save button is disabled
			System.out.println("Test passed: Save button is disabled");
		
		}
		
		Footer_and_Header_Common header = new Footer_and_Header_Common(driver);
		header.ClickOn_Back_Button();
	}
	
	@Test(enabled = false)
	public void SelectCurrencyWithoutRegion_SaveButtonTest()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSettingsLInkText();
		Settings set = new Settings(driver);
		set.Select_Region_SettingBy_VisibleText("India");
		WebElement save = driver.findElement(By.xpath("//span[.='Save']"));
		set.Select_currency_SettingBy_VisibleText("Select Currency");
//		save.isEnabled();
		// Check if the save button is enabled or disabled
		if (save.isEnabled()) {
		// Fail the script if the save button is enabled
			assert false : "Save button is enabled";
			
		} else {
		// Pass the script if the save button is disabled
			System.out.println("Test passed: Save button is disabled");
		
		}
		
		Footer_and_Header_Common header = new Footer_and_Header_Common(driver);
		header.ClickOn_Back_Button();
	}
	

}
