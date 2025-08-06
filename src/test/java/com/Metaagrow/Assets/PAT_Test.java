package com.Metaagrow.Assets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Assets;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;

public class PAT_Test extends BaseClass{
	
	@Test()
	public void Schedule_PAT_TodaysTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_PAT_Button();
		ast.clickOn_CReateScheduleBUtton_OnPAT();
		ast.Select_PropertyDropwnOn_ScheduleYourPAT_TestingPage("Thane");
		ast.Click_SelectAssetbuttonOn_ScheduleYourPAT_TestingPage();
		Thread.sleep(2000);
		wb.SelectMultiUserCheckBox(driver, "Magic Arrow424");
		wb.SelectMultiUserCheckBox(driver, "Transformer No. 1");
		ast.Click_SelectAssetbuttonOn_ScheduleYourPAT_TestingPage();
		ast.Tenure_StartDate_OnSchedulePATPage(driver);
		ast.Tenure_EndDate_OnSchedulePATPage(driver);
		ast.TodaysScheduledDate_OnSchedulePATPage(driver);
		ast.ClickOn_SelectUserButton_On_ScheduleYourPAT_TestingPage();
		Thread.sleep(2000);
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		ast.ClickOn_SelectUserButton_On_ScheduleYourPAT_TestingPage();
		ast.Select_FrequencyDropdown_On_ScheduleYourPAT_TestingPage("Quarterly");
		ast.ClickOn_CreateScheduleButton_On_ScheduleYourPAT_TestingPage();
		Thread.sleep(2000);
		ast.CLickOn_NoButton_OnPATSCheduledSuccess();
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement AssetNameListing = driver.findElement(By.xpath("(//span[normalize-space()='Magic Arrow424'])[1]"));
				
				try {
					wait.until(ExpectedConditions.visibilityOf(AssetNameListing));
					Assert.assertTrue(AssetNameListing.isDisplayed(), "Transfered Asset"
							+ " Name is not Showing on Listing");
				} catch (TimeoutException e) {
					// TODO: handle exception
					Assert.fail("Assertion Failed: Asset Name is not Showing on Listing");
				}
				catch (NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Assertion Failed: Asset Name is not Showing on Listing");
				}
		
	}
	
	@Test()
	public void Schedule_PAT_ToUpcomingTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_PAT_Button();
		ast.clickOn_CReateScheduleBUtton_OnPAT();
		ast.Select_PropertyDropwnOn_ScheduleYourPAT_TestingPage("Thane");
		ast.Click_SelectAssetbuttonOn_ScheduleYourPAT_TestingPage();
		Thread.sleep(2000);
		wb.SelectMultiUserCheckBox(driver, "Magic Arrow424");
		wb.SelectMultiUserCheckBox(driver, "Transformer No. 1");
		ast.Click_SelectAssetbuttonOn_ScheduleYourPAT_TestingPage();
		ast.Tenure_StartDate_OnSchedulePATPage(driver);
		ast.Tenure_EndDate_OnSchedulePATPage(driver);
		ast.UpcomingScheduledDate_OnSchedulePATPage(driver);
		ast.ClickOn_SelectUserButton_On_ScheduleYourPAT_TestingPage();
		Thread.sleep(2000);
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		ast.ClickOn_SelectUserButton_On_ScheduleYourPAT_TestingPage();
		ast.Select_FrequencyDropdown_On_ScheduleYourPAT_TestingPage("Quarterly");
		ast.ClickOn_CreateScheduleButton_On_ScheduleYourPAT_TestingPage();
		Thread.sleep(2000);
		ast.CLickOn_NoButton_OnPATSCheduledSuccess();
		ast.ClickOn_Upcoming_Button();
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement AssetNameListing = driver.findElement(By.xpath("(//span[contains(text(), 'Transformer No. 1')])[2]"));
				
				try {
					wait.until(ExpectedConditions.visibilityOf(AssetNameListing));
					Assert.assertTrue(AssetNameListing.isDisplayed(), "Transfered Asset"
							+ " Name is not Showing on Listing");
				} catch (TimeoutException e) {
					// TODO: handle exception
					Assert.fail("Assertion Failed: Asset Name is not Showing on Listing");
				}
				catch (NoSuchElementException e) {
					// TODO: handle exception
					Assert.fail("Assertion Failed: Asset Name is not Showing on Listing");
				}
	}

}
