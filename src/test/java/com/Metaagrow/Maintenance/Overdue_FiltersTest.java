package com.Metaagrow.Maintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class Overdue_FiltersTest extends BaseClass {
	
	@Test(priority = 2)
	public void OverduePageTest_TC_PM2() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();

	}
	
	
	@Test(priority = 10)
	public void Overdue_FilterByAsset_TC_PM10() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();

		pm.Clickon_Filter_By_selectAsset();


		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();

		pm.ClickOn_Apply_Button();


		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Foos Ball')]")).isDisplayed(), "PM is not showing in List");
	}

	@Test(priority = 11)
	public void Overdue_FilterBy_PMName_TC_PM11() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
	}

	@Test(priority = 12)
	public void Overdue_FilterByAssignedTo_TC_PM12() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_Assigned_To();
		pm.ClickOn_FilterByAssignedToSearchBoxTodaysTab("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		Thread.sleep(3000);
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Mikhail')]")).isDisplayed(), "PM is not showing in List");

	}
	@Test(priority = 13)
	public void Overdeu_FilterByAllTodaysPage_TC_PM13() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.Clickon_Filter_By_selectAsset();
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();

		pm.ClickOn_Filter_By_Assigned_To();
		pm.ClickOn_FilterByAssignedToSearchBoxTodaysTab("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
	}
	@Test(priority = 14)
	public void Overdue_FilterByClearButtonTest_TC_PM14() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("(//span[@title='Bowling Maintenance'][normalize-space()='Bowling Ma...'])[1]")).isDisplayed(), "PM is not showing in List");
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterbyClear_Button();
	}
	@Test(priority = 15)
	public void Overdue_FilterByStartAndEndDate_TC_15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		Dates date = new Dates();

		date.startDate(driver, "Aug-2024", "8");

		pm.Filetr_OverdueBy_End_Date(driver, "Aug-2024", "15");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();

		pm.ClickOn_Apply_Button();
		Thread.sleep(3000);
	}

}
