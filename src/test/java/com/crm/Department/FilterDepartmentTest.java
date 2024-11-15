package com.crm.Department;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Departments;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;
import com.aventstack.extentreports.ExtentTest;

public class FilterDepartmentTest extends BaseClass  {
	@Test(priority = 1)
	
	public void ActivePageFilterTest_TC_D1()
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver); 
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		d.ClickOnFilterIcon();
		d.ClickOn_Filter_By_Department();
		d.ClickOn_Filter_By_Department_SearchBox("Housekeeping");
		d.ClickOn_Filter_By_Dynamic_Department();
		d.ClickOnApplyButtonOnFilter();
		Assert.assertTrue(driver.findElement(By.xpath("(//b[contains(text(),'Housekeeping')])[1]")).isDisplayed(), "Applied Filter is not showing on Active Page");
	}
	
	@Test(dependsOnMethods = "ActivePageFilterTest_TC_D1")
	public void ActivePageClearFilterTest_TC_D2()
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		d.ClickOnFilterIcon();
		d.ClickOn_Filter_By_Department();
		d.ClickOn_Filter_By_Department_SearchBox("Housekeeping");
		d.ClickOn_Filter_By_Dynamic_Department();
		d.ClickOnApplyButtonOnFilter();
		Assert.assertTrue(driver.findElement(By.xpath("(//b[contains(text(),'Housekeeping')])[1]")).isDisplayed(), "Applied Filter is not showing on Active Page");
		d.ClickOnFilterIcon();
		d.ClickOnClearButtonOnFilter();
		Assert.assertTrue(driver.findElement(By.xpath("(//ul[@class='assets-list'])[1]")).isDisplayed(), "Displyed");
	}
	
	@Test(priority = 3)
	public void InactivePageFilterTest_TC_D3()
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		d.ClickOnInactivePage();
		d.ClickOnFilterIcon();
		d.ClickOn_Filter_By_Department();
		d.ClickOn_Filter_By_Department_SearchBox("Cook");
		driver.findElement(By.xpath("Cook")).click();
		d.ClickOnApplyButtonOnFilter();
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Cook')]")).isDisplayed(), "Applied Filter is not showing on InActive Page");
	}
	
	@Test(dependsOnMethods = "InactivePageFilterTest_TC_D3")
	public void InactivePageClearFilterTest_TC_D4()
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		d.ClickOnInactivePage();
		d.ClickOnFilterIcon();
		d.ClickOn_Filter_By_Department();
		d.ClickOn_Filter_By_Department_SearchBox("Cook");
		driver.findElement(By.xpath("Cook")).click();
		d.ClickOnApplyButtonOnFilter();
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Cook')]")).isDisplayed(), "Applied Filter is not showing on InActive Page");
		d.ClickOnFilterIcon();
		d.ClickOnClearButtonOnFilter();
	}
	


}
