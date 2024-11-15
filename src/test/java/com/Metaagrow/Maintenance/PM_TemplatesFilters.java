package com.Metaagrow.Maintenance;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class PM_TemplatesFilters extends BaseClass {


	@Test(priority = 28)
	public void PMTemplateFilterByAssetTest_PM34() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickON_FilterByAssetNameOn_PMTemplatePage();
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();

		pm.ClickOn_Apply_Button();

		//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		//		WebElement assetName = driver.findElement(By.xpath("//span[contains(@title,'Foos Ball')]"));
		//		wait1.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[contains(@title,'Foos Ball')]"))));
		Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(@title,'Foos Ball')])[2]")).isDisplayed(), "PM is not showing in List");
	}
	@Test(priority = 29)
	public void PMTemplate_FilterByTemplateName_TC_PM35()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterByTemplateName_OnPMTemplate("Bowling Maintenance");
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
		
	}
	@Test(priority = 30)
	public void PMTemplate_FilterByAssignedTo_TC_PM36() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterByAssignedTo_OnPMTemplate();
		pm.ClickOn_FilterByAssignedToSearchBox_OnPMTemplate("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(@title,'Mikhail')])[2]")).isDisplayed(), "PM is not showing in List");

	}
	@Test(priority = 31)
	public void PMTemplate_FilterByStartAndEndDate_TC_PM37() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		Dates date = new Dates();

		date.startDate(driver, "Oct-2024", "7");

		pm.End_Date_OnCompletedFilter(driver, "Oct-2024", "16");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();

		pm.ClickOn_Apply_Button();
		 // Verify if the selected date range is reflected in the results
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	        WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[.=' 7 Oct, 2024 '])[1]"))); // Adjust XPath as needed
	        Assert.assertTrue(resultElement.isDisplayed(), "Selected date range filter is not showing in the list.");
	    } catch (TimeoutException e) {
	        Assert.fail("The selected date range filter is not visible in the list.");
	    } catch (NoSuchElementException e) {
	        Assert.fail("The element with the selected date range filter is not found.");
	    }
	}
	
	@Test(priority = 32)
	public void PMTemplate_FilterByClearButtonTest_TC_PM38()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterByTemplateName_OnPMTemplate("Bowling Maintenance");
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
	    pm.ClickOn_FilterbyClear_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(text(), 'General Maintenance')])[1]")).isDisplayed(), "PM is not showing in List");

	}
	@Test(priority = 33)
	public void PMTemplateInactivePage_FilterByAssetTest_PM39() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClikOn_Inactive_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickON_FilterByAssetNameOn_PMTemplatePage();
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Zombie Outbreak 1P']")).click();

		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("(//span[normalize-space()='Zombie Outbreak 1P'])[2]")).isDisplayed(), "PM is not showing for Zombie Outbreak 1P Asset in List");
	}
	@Test(priority = 34)
	public void PMTemplateInactivePage_FilterByTemplateName_TC_PM40()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClikOn_Inactive_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterByTemplateName_OnPMTemplate("General Maintenance");
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'General Maintenance')]")).isDisplayed(), "PM is not showing in List");
		
	}
	@Test(priority = 35)
	public void PMTemplateInactivePage_FilterByAssignedTo_TC_PM41() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClikOn_Inactive_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterByAssignedTo_OnPMTemplate();
		pm.ClickOn_FilterByAssignedToSearchBox_OnPMTemplate("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(@title,'Mikhail')])[2]")).isDisplayed(), "PM is not showing in List");

	}
	
	@Test(priority = 36)
	public void PMTemplateInactivePage_FilterByStartAndEndDate_TC_PM42() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClikOn_Inactive_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		Dates date = new Dates();

		date.startDate(driver, "Aug-2024", "23");

		pm.End_Date_OnCompletedFilter(driver, "Aug-2024", "25");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();

		pm.ClickOn_Apply_Button();
	Thread.sleep(3000);
	    // Verify if the selected date range is reflected in the results
	    try {

	        // Verify if the element is displayed
	        Assert.assertTrue(driver.findElement(By.xpath("(//span[normalize-space()='23 Aug, 2024'])[1]")).isDisplayed(), "Selected date range filter is not showing in the list.");
	    } catch (TimeoutException e) {
	        Assert.fail("The selected date range filter is not visible in the list due to timeout.");
	    } catch (NoSuchElementException e) {
	        Assert.fail("The element with the selected date range filter is not found.");
	    } catch (Exception e) {
	        Assert.fail("An unexpected error occurred: " + e.getMessage());
	    }
	}
	@Test(priority = 37)
	public void PMTemplateInactivePage_FilterByClearButtonTest_TC_PM43()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClikOn_Inactive_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterByTemplateName_OnPMTemplate("General Maintenance");
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'General Maintenance')]")).isDisplayed(), "PM is not showing in List");
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
	    pm.ClickOn_FilterbyClear_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[.='Zombie Animations and Rigging']")).isDisplayed(), "PM is not showing in List");

	}



	
}
