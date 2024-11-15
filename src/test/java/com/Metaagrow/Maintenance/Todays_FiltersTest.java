package com.Metaagrow.Maintenance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class Todays_FiltersTest extends BaseClass{


	@Test(priority = 4)
	public void TodaysPageTest_TC_PM1() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.Clickon_Today_Button();
        driver.navigate().refresh();

	}
	
	@Test(priority = 5)
	public void Todays_FilterByAsset_TC_PM5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.Clickon_Filter_By_selectAsset();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")));		
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();

		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Foos Ball')]")).isDisplayed(), "PM is not showing in List");
	}
	@Test(priority = 6)
	public void Todays_FilterPM_Name_TC_PM6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
	}

	@Test(priority = 7)
	public void Todays_FilterByAssignedTo_TC_PM7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_Assigned_To();
		pm.ClickOn_FilterByAssignedToSearchBoxTodaysTab("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Mikhail')]")).isDisplayed(), "PM is not showing in List");

	}

	@Test(priority = 8)
	public void Todays_FilterByAllTodaysPage_TC_PM8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.Clickon_Filter_By_selectAsset();
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		pm.ClickOn_Filter_By_Assigned_To();
		pm.ClickOn_FilterByAssignedToSearchBoxTodaysTab("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(@title,'Bowling')])[1]")).isDisplayed(), "PM is not showing in List");
	}

	@Test(priority = 9)
	public void Todays_FilterByClearButtonTest_TC_PM9() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterbyClear_Button();
	}

	
}
