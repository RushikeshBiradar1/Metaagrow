package com.Metaagrow.Inspetions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Inspections;
import com.MetaaGrow.ObjectRepository.LoginPage;

public class FilterTest extends BaseClass {
	
	@Test(priority = 1)
	public void ActiveSchedule_FilterByScheduleNameTest_TC_I14() throws Throwable
	{
		
		System.out.println("success");
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Schedule_Button();
		inspect.ClickOn_Filter_Icon();
		String schedule_Name ="Bowling Lane Checklist-Bowling Lane 1";
		inspect.ClickOn_Filter_By_Schdeule_Name__On_Manage_Schedule_Page("Bowling Lane Checklist-Bowling Lane 1");
		
		inspect.ClickOn_Filter_By_Apply_Button();
		
		String scheduleNameOnListing = "Bowling Lane Check";
//		WebElement Scheduled_NameOnToActive = driver.findElement(By.xpath("//span[contains(text(), '"+schedule_Name+"')]"));

//		Assert.assertTrue(Scheduled_NameOnToActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Scheduled_NameOnToActive = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//span[contains(text(), '" + scheduleNameOnListing + "')]")
		));

		Assert.assertTrue(Scheduled_NameOnToActive.isDisplayed(), "❌ Schedule name is not displayed in the listing.");

		
	}
	
	@Test(priority = 2)
	public void ActiveSchedule_FilterByChecklistNameTest_TC_I15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Schedule_Button();
		inspect.ClickOn_Filter_Icon();
		String checklist_Name ="Bowling Lane";
		inspect.CLickOn_Filter_By_Checklist_Name_On_Manage_Checklist_Page("Bowling Lane");
		
		inspect.ClickOn_Filter_By_Apply_Button();
		
		WebElement Checklist_NameOnToActive = driver.findElement(By.xpath("//span[contains(text(), '" + checklist_Name + "')]"));

		Assert.assertTrue(Checklist_NameOnToActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		
	}
	@Test(priority = 3)
	public void ActiveSchedule_FilterByAssignedToTest_TC_I16() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Schedule_Button();
		inspect.ClickOn_Filter_Icon();
		String Assigned_To ="Mikhail";
		inspect.ClickOn_Filter_By_Assigned_To_On_Manage_Schedule_Page();
		inspect.ClickOn_Filter_By_Assigned_To_SearchBox_On_Manage_Schedule_Page(Assigned_To);
		driver.findElement(By.xpath("(//a[normalize-space()='Mikhail'])[1]")).click();
		
		inspect.ClickOn_Filter_By_Apply_Button();
	
		WebElement Scheduled_NameOnToActive = driver.findElement(By.xpath("(//span[contains(text(), '"+Assigned_To+"')])[2]"));

		Assert.assertTrue(Scheduled_NameOnToActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		
	}
	
	@Test(priority = 4)
	public void ActiveChecklist_FilterByChecklistNameTest_TC_I17() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Checklist_Button();
		inspect.ClickOn_Filter_Icon();
		String Checklist_Name ="Bowling Lane";
		inspect.CLickOn_Filter_By_Checklist_Name_On_Manage_Checklist_Page(Checklist_Name);
	
		inspect.ClickOn_Filter_By_Apply_Button();

		WebElement Checklist_NameOnActive = driver.findElement(By.xpath("//span[contains(text(), '" + Checklist_Name + "')]"));

		Assert.assertTrue(Checklist_NameOnActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		
	}
	
	@Test(priority = 5)
	public void ActiveChecklist_FilterByDepartmentNameTest_TC_I18() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Checklist_Button();
		inspect.ClickOn_Filter_Icon();
		String Department="Operations";
		inspect.ClickOn_Filter_by_Department_Dropdown_On_Manage_Checklist_Page();
		inspect.ClickOn_Filter_by_Department_SearchBox_On_Manage_Checklist_Page(Department);
		driver.findElement(By.xpath("//a[.='"+Department+"']")).click();
		inspect.ClickOn_Filter_By_Apply_Button();
		WebElement Checklist_NameOnActive = driver.findElement(By.xpath("(//span[contains(text(), '"+Department+"')])[2]"));

		Assert.assertTrue(Checklist_NameOnActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		
		
	}
	
	@Test(priority = 6)
	public void ActiveChecklist_FilterByAll_And_ClearButtonTest_TC_I19() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Checklist_Button();
		inspect.ClickOn_Filter_Icon();
		String Checklist_Name ="Opening checklist";
		inspect.CLickOn_Filter_By_Checklist_Name_On_Manage_Checklist_Page(Checklist_Name);
		String Department="Operations";
		inspect.ClickOn_Filter_by_Department_Dropdown_On_Manage_Checklist_Page();
		inspect.ClickOn_Filter_by_Department_SearchBox_On_Manage_Checklist_Page(Department);
		driver.findElement(By.xpath("//a[.='"+Department+"']")).click();
		
		inspect.ClickOn_Filter_By_Apply_Button();
		
		WebElement Department_NameOnActive = driver.findElement(By.xpath("(//span[contains(text(), '"+Department+"')])[2]"));

		Assert.assertTrue(Department_NameOnActive.isDisplayed(), "Department Name is not showing in List");

		WebElement Checklist_NameOnActive = driver.findElement(By.xpath("//span[contains(text(), '" + Checklist_Name + "')]"));

		Assert.assertTrue(Checklist_NameOnActive.isDisplayed(), " Checklist Name is not showing in List");
		
//		 Go To Filter and Clear all 
		inspect.ClickOn_Filter_Icon();
		inspect.ClickOn_Filter_By_Clear_Button();
		
		
	}
	
	@Test(priority = 7)
	public void Todays_FilterByAssetNameTest_TC_I20() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Filter_Icon();
		inspect.CLickOn_FilterByAsset();
		String AssetName="Bowling Lane 1";
		String TodaysList_AssetName="Bowling Lane";
		inspect.ClickOn_FilterByAssetSearchBox(AssetName);
		driver.findElement(By.xpath("(//a[normalize-space()='"+AssetName+"'])[1]")).click();
		inspect.ClickOn_Filter_By_Apply_Button();
		WebElement Asset_NameOnTodays = driver.findElement(By.xpath("(//span[contains(text(), '"+TodaysList_AssetName+"')])[2]"));

		Assert.assertTrue(Asset_NameOnTodays.isDisplayed(), "Asset Name is not showing in List");
		
	}
	
	@Test(priority = 8)
	public void Todays_FilterByScheduleNameTest_TC_I21() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		
		inspect.ClickOn_Filter_Icon();
		String schedule_Name ="Bowling Lane Checklist-Bowling Lane 1";
		inspect.ClickOn_Filter_By_Schdeule_Name__On_Manage_Schedule_Page("Bowling Lane Checklist-Bowling Lane 1");
		
		inspect.ClickOn_Filter_By_Apply_Button();
		WebElement Scheduled_NameOnToActive = driver.findElement(By.xpath("//li[contains(@title, '"+schedule_Name+"')]"));

		Assert.assertTrue(Scheduled_NameOnToActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		
	}
	
	@Test(priority = 9)
	public void Todays_FilterByUserTest_TC_I22() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		
		inspect.ClickOn_Filter_Icon();
		String User_Name ="Rishikesh";
		inspect.CLickOn_FilterByUser();
		inspect.CLickOn_FilterByUserSearchBox_OnTodays(User_Name);
		driver.findElement(By.xpath("(//a[.='"+User_Name+"'])[2]")).click();
		inspect.ClickOn_Filter_By_Apply_Button();
		WebElement User_NameOnActive = driver.findElement(By.xpath("//span[contains(@title, '"+User_Name+"')]"));

		Assert.assertTrue(User_NameOnActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

	}
	
//	----------------------------------------- Previous Page Filters Test ---------------------------------------------------------------------------------------------

	@Test(priority = 10)
	public void Previous_FilterByAssetNameTest_TC_I23() throws Throwable
	{
		 LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    wb.maximizeTheBrowser(driver);
		    
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnInspectionsLinkText();
		    
		    Inspections inspect = new Inspections(driver);
		    inspect.ClickOn_Previous_Button();

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		    // Wait for any loading indicator (like a spinner) to disappear
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("backdrop"))); // Adjust the selector based on the actual loading element

		    inspect.ClickOn_Filter_Icon();
		  
		    

		    
		    inspect.CLickOn_FilterByAsset();
		    String AssetName = "Bowling Lane 1";
		    String Searched_AssetName = "Bowling Lane";
		    inspect.ClickOn_FilterByAssetSearchBox(AssetName);
		    
		    // Wait until the asset link is visible and clickable
		    WebElement assetLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='" + AssetName + "'])[1]")));
		    assetLink.click();
		    
		    inspect.ClickOn_Filter_By_Apply_Button();
		    
		    // Wait for the asset name to be displayed on today's list
		    WebElement Asset_NameOnTodays = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), '" + Searched_AssetName + "')])[3]")));

		    // Assert that the asset name is displayed
		    Assert.assertTrue(Asset_NameOnTodays.isDisplayed(), "Asset Name is not showing in List");
		
	}
	
	@Test(priority = 11)
	public void Previous_FilterByScheduleNameTest_TC_I24() throws Throwable
	{
		 LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    wb.maximizeTheBrowser(driver);
		    
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnInspectionsLinkText();
		    
		    Inspections inspect = new Inspections(driver);
		    inspect.ClickOn_Previous_Button();

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		    // Wait for any loading indicator (like a spinner) to disappear
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("backdrop"))); // Adjust the selector based on the actual loading element

		    inspect.ClickOn_Filter_Icon();
		  
		    
		    inspect.CLickOn_FilterByAsset();
		    String schedule_Name ="Bowling Lane Checklist-Bowling Lane 1";
			inspect.ClickOn_Filter_By_Schdeule_Name__On_Manage_Schedule_Page(schedule_Name);
		    
		    
		    inspect.ClickOn_Filter_By_Apply_Button();
		    
		    // Wait for the asset name to be displayed on today's list
		 //   WebElement Schedule_NameOnPrevious = driver.findElement(By.xpath("(//li[contains(@title, '"+schedule_Name+"')])[2]"));
		    // Assert that the asset name is displayed
		//    Assert.assertTrue(Schedule_NameOnPrevious.isDisplayed(), "Schedule Name is not showing in List");
		
		    // Explicitly wait until at least one element with the correct user appears
		    WebElement filteredUser = wait.until(ExpectedConditions.presenceOfElementLocated(
		        By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
		    ));

		    // Optionally check if user is in the title
		    String title = filteredUser.getAttribute("title");
		    Assert.assertTrue(title.contains(schedule_Name),
		        "Filtered user '" + schedule_Name + "' not found in title: " + title);
		    
		    
		    
	}
	
	@Test(priority = 12)
	public void Previous_FilterByUserTest_TC_I25() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);
	    
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);
	    
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();
	    
	    Inspections inspect = new Inspections(driver);
	    inspect.ClickOn_Previous_Button();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	    // Wait for any loading indicator (like a spinner) to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("backdrop"))); // Adjust the selector based on the actual loading element

	    inspect.ClickOn_Filter_Icon();
		String User_Name ="Ghassan";
		inspect.CLickOn_FilterByUser();
		inspect.CLickOn_FilterByUserSearchBox_OnTodays(User_Name);
		
		inspect.ClickOn_Filter_By_Apply_Button();
//		WebElement User_NameOnActive = driver.findElement(By.xpath("(//span[contains(@title, '"+User_Name+"')])[2]"));
//
//		Assert.assertTrue(User_NameOnActive.isDisplayed(), "User Name is not showing in List");
		
		
		  // Explicitly wait until at least one element with the correct user appears
	    WebElement filteredUser = wait.until(ExpectedConditions.presenceOfElementLocated(
	        By.xpath("//span[contains(@title, '" + User_Name + "')]")
	    ));

	    // Optionally check if user is in the title
	    String title = filteredUser.getAttribute("title");
	    Assert.assertTrue(title.contains(User_Name),
	        "Filtered user '" + User_Name + "' not found in title: " + title);
	}
	
	//------------------------------- Upcoming Filters  -------------------------------------------------------------------------------------------------------------------------
	
	
	@Test(priority = 13)
	public void Upcoming_FilterByAssetNameTest_TC_I26() throws Throwable
	{
		 LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    wb.maximizeTheBrowser(driver);
		    
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnInspectionsLinkText();
		    
		    Inspections inspect = new Inspections(driver);
		    inspect.CLickOn_UpcomingButton();

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		    // Wait for any loading indicator (like a spinner) to disappear
//		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("backdrop"))); // Adjust the selector based on the actual loading element

		    inspect.ClickOn_Filter_Icon();
		  
	
		    inspect.CLickOn_FilterByAsset();
		    String AssetName = "Bowling Lane 1";
		    String Upcoming_AssetName = "Bowling Lane";
		    inspect.ClickOn_FilterByAssetSearchBox(AssetName);
		    
		    // Wait until the asset link is visible and clickable
		    WebElement assetLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='" + AssetName + "'])[1]")));
		    assetLink.click();
		    
		    inspect.ClickOn_Filter_By_Apply_Button();
		    
		    // Wait for the asset name to be displayed on today's list
		    WebElement Asset_NameOnTodays = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'"+Upcoming_AssetName+"')])[5]")));

		    // Assert that the asset name is displayed
		    Assert.assertTrue(Asset_NameOnTodays.isDisplayed(), "Asset Name is not showing in List");
		
	}
	
	@Test(priority = 14)
	public void Upcoming_FilterByScheduleNameTest_TC_I27() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.CLickOn_UpcomingButton();
		inspect.ClickOn_Filter_Icon();
		String schedule_Name ="Bowling Lane Checklist-Bowling Lane 1";
		inspect.ClickOn_Filter_By_Schdeule_Name__On_Manage_Schedule_Page("Bowling Lane Checklist-Bowling Lane 1");
		
		inspect.ClickOn_Filter_By_Apply_Button();
		WebElement Scheduled_NameOnToActive = driver.findElement(By.xpath("(//li[contains(@title, '"+schedule_Name+"')])[5]"));

		Assert.assertTrue(Scheduled_NameOnToActive.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		
	}
	@Test(priority = 15)
	public void Upcoming_FilterByUserTest_TC_I28() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.CLickOn_UpcomingButton();
		inspect.ClickOn_Filter_Icon();
		String User_Name ="Rishikesh";
		inspect.CLickOn_FilterByUser();
		inspect.CLickOn_FilterByUserSearchBox_OnTodays(User_Name);
		driver.findElement(By.xpath("(//a[normalize-space()='"+User_Name+"'])[1]")).click();
		Thread.sleep(4000);
		inspect.ClickOn_Filter_By_Apply_Button();
		Thread.sleep(4000);
		WebElement User_NameOnActive = driver.findElement(By.xpath("(//span[contains(@title, '"+User_Name+"')])[1]"));

		Assert.assertTrue(User_NameOnActive.isEnabled(), "User Name is not showing in List");

	}
	
	
}
