package com.Metaagrow.Notification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Notification;
import com.MetaaGrow.ObjectRepository.Setup;

public class NotificationTest extends BaseClass {
	@Test(enabled=false)
	public void FilterByPropertyTest_TC_N1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOn_NoticationLinkText();
		driver.findElement(By.xpath("(//div[@class='grad-box card'])[1]")).click();
		Notification notify = new Notification(driver);
		notify.ClickOn_FilterIcon();
		notify.ClickOn_SelectPropertyFilter();
		notify.ClickOn_PropertyFilterSearchBox("ANDHERI");
		notify.ClickOn_SelectDynamicPropertyFilter();
		notify.ClickOn_ApplyFilterButton();
	}
	
	@Test(priority = 2)
	public void FilterByAssetNameTest_TC_N2()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOn_NoticationLinkText();
		driver.findElement(By.xpath("(//div[@class='grad-box card'])[1]")).click();
		Notification notify = new Notification(driver);
		notify.ClickOn_FilterIcon();
		notify.ClickOn_SelectAssetFilter();
		notify.ClickOn_FilterByAssetSearchBox("Raptor");
		notify.clickOn_SelectDynamicAssetFilter();
		notify.ClickOn_ApplyFilterButton();
	}
	@Test(enabled=false)
	public void FilterByClearButtonTest_TC_N3()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOn_NoticationLinkText();
		Notification notify = new Notification(driver);
		notify.ClickOn_FilterIcon();
		notify.ClickOn_SelectPropertyFilter();
		notify.ClickOn_PropertyFilterSearchBox("ANDHERI");
		notify.ClickOn_SelectDynamicPropertyFilter();
		notify.ClickOn_ApplyFilterButton();
		notify.ClickOn_FilterIcon();
		notify.ClickOn_ClearFilterBtton();
	}
	
	@Test
	public void EditNotificationTest_TC_N4()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOn_NoticationLinkText();
		Notification notify = new Notification(driver);
		notify.ClickOn_EditButton();
		driver.findElement(By.xpath("(//img[@alt='close'])[3]")).click();
		notify.ClickOn_SelectDepartmentDropdown_OnEditPage("Housekeeping");
		notify.ClickOn_SelectUserDropdown_OnEditPage("Rushi");
        notify.ClickOn_SubmitButtonOnEditPage();
		
	}
	
	@Test
	public void EditNotificationCloseButtonTest_TC_N5()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOn_NoticationLinkText();
		Notification notify = new Notification(driver);
		notify.ClickOn_EditButton();
		notify.ClickOn_CloseButtonOn_EditPage();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Asset Notification']")).isDisplayed(), "Not reflrcted on listing page");
	}
	
	@Test(enabled = false)
	public void AddAssetNotificationTest_TC_N6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOn_NoticationLinkText();
		Notification notify = new Notification(driver);
		notify.ClickOn_Add_AssetNotificationButton();
		notify.SelectPropertyDropdown("ANDHERI");
		Thread.sleep(2000);
//        notify.ClickOn_SelectDepartmentDropdown_OnAddAssetPage("Housekeeping");
		wb.SelectMultiUserCheckBox(driver, "Housekeeping");
//        notify.ClickOn_SelectUserDropdown_OnAddAssetPage("Rushi");
		wb.SelectMultiUserCheckBox(driver, "Rushi");
//        driver.findElement(By.xpath("//label[normalize-space()='Select All']")).click();
        notify.clickOn_SubmitButton();
		
	}
	@Test
	public void AddAssetNotificationPageCloseButtonTest_TC_N7()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		
		sp.ClickOn_NoticationLinkText();
		Notification notify = new Notification(driver);
		driver.findElement(By.xpath("(//div[@class='grad-box card'])[1]")).click();
		notify.ClickOn_Add_AssetNotificationButton();
		notify.ClickOn_CloseButtonOn_AddPage();
	
		WebElement AssetList = driver.findElement(By.xpath("//h2[normalize-space()='Asset Notification']"));
		Assert.assertTrue(AssetList.isEnabled(), "not redirected to listing");
	}
	
	
	
}
