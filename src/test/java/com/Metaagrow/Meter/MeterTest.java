package com.Metaagrow.Meter;

import static org.testng.Assert.assertTrue;

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
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Meters;

public class MeterTest extends BaseClass{
	@Test(priority = 1)
	public void ActiveMeterTest_TC_M1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[.='Active'])[1]")).isDisplayed(), "Meter is not Active");
	}

	@Test(priority = 2)
	public void InactiveMeterTest_TC_M2()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		meter.ClickOn_InactivePage_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[.='Inactive'])[1]")).isDisplayed(), "Meter is not inactive");
	}

	@Test(enabled=false)
	public void ActiverPageFilterByPropertyTest_TC_M3() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		meter.ClickOn_Filter_Icon();
		meter.ClickOn_Filter_by_Property();
		meter.ClickOn_Filter_By_property_searchBox("THE_DHARAVI");
		driver.findElement(By.xpath("//A[.='THE_DHARAVI']")).click();
		meter.ClickOn_Filter_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[.='THE_DHARAVI'])[2]")).isDisplayed(), "THE_DHARAVI property is not Display");

//		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void ActiverPageFilterByPropertyAndLocationTest_TC_M4() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		meter.ClickOn_Filter_Icon();
		meter.ClickOn_Filter_by_Property();
		meter.ClickOn_Filter_By_property_searchBox("THE_DHARAVI");
		driver.findElement(By.xpath("//A[.='THE_DHARAVI']")).click();
		meter.ClickOn_Filter_By_Location();
		meter.ClickOn_Location_SearchBox("Ground Level");
		driver.findElement(By.xpath("//a[.='Ground Level']")).click();
		meter.ClickOn_Filter_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("(//span[.='Ground Level'])[2]")).isDisplayed(), "selected Property & location is not showing on listing page");
	}
	
	@Test(priority = 5)
	public void ActiverPageFilterByAssetTest_TC_M5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		meter.ClickOn_Filter_Icon();
		meter.ClickOn_Filter_By_Asset();
		meter.CLickOn_Filter_By_Asset_SearchBox("Ticket Carnival");
		driver.findElement(By.xpath("//a[.='Ticket Carnival']")).click();
		meter.ClickOn_Filter_Apply_Button();

		// Wait for the filter results to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		    // Wait until the filtered element is visible
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[.='Ticket Carnival'])[2]")));
		    
		    // Assertion to check if the asset name is displayed
		    Assert.assertTrue(driver.findElement(By.xpath("(//span[.='Ticket Carnival'])[2]")).isDisplayed(), 
		        "Selected Property & location is not showing on the listing page");
		    
		    System.out.println("Assertion passed: 'Ticket Carnival' is visible on the listing page.");
		} catch (TimeoutException e) {
		    // If the element is not visible after waiting, the assertion will fail
		    Assert.fail("Assertion failed: 'Ticket Carnival' is not visible on the listing page.");
		} catch (NoSuchElementException e) {
		    // If the element is not found, fail the test
		    Assert.fail("Assertion failed: 'Ticket Carnival' element is not found on the listing page.");
		}

//				Assert.assertTrue(driver.findElement(By.xpath("(//span[.='Ticket Carnival'])[2]")).isDisplayed(), "selected Property & location is not showing on listing page");
//		meter.CLickOn_Filter_By_Asset_SearchBox("Ticket Carnival");

	}
	
	@Test(priority = 6)
	public void ActiverPageFilterByMeterNameTest_TC_M6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		meter.ClickOn_Filter_Icon();
		meter.ClickOn_Filter_By_Asset();
		meter.ClickOn_Filter_By_Meter_Name_TextField("26 Check Lane 4");
		meter.ClickOn_Filter_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[.='26 Check Lane 4']")).isDisplayed(), "selected meter is not showing on listing page");

		
	}
	
	@Test(enabled=false)
	public void ActiverPageClearFilterTest_TC_M7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		meter.ClickOn_Filter_Icon();
		meter.ClickOn_Filter_By_Asset();
		meter.ClickOn_Filter_By_Meter_Name_TextField("26 Check Lane 4");
		meter.ClickOn_Filter_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[.='26 Check Lane 4']")).isDisplayed(), "selected meter is not showing on listing page");

		meter.ClickOn_Filter_Icon();
		meter.ClickOn_Clear_Filter_Button();
	}
	
	@Test(priority = 8)
	public void AddReadingTest_TC_M8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		
		meter.ClickOn_EnterReadingtextField("2005");Thread.sleep(6000);
		meter.Clickon_AddreadingButton();
		Thread.sleep(6000);
		
		
	}
	
	@Test(priority = 9)
	public void PrintQRTest_TC_M9() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		meter.ClickOn_PrintQRButtonOnInfo();
	Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
	footer.ClickOn_Close_Button();
	
	}
	
	@Test(priority = 10)
	public void EditMeterTest_TC_M10() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		meter.ClickOn_EditMeter();
		Thread.sleep(3000);
		meter.ClickOn_FrequencyOfMeasurementOnEditmeter();
		Thread.sleep(3000);
		meter.ClickOn_WeeklyFrequency();
		meter.clickon_ConfirmChangesButtonOnEditMeterPage();
		Thread.sleep(3000);
		meter.ClickOn_OkButton_OnEditedConfirmation();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		    // Wait until the filtered element is visible
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//app-root//div[@class='row']//div[@class='row']//div[@class='row']//li[3]//h6[.='Weekly']")));
		    
		    // Assertion to check if the asset name is displayed
		    Assert.assertTrue(driver.findElement(By.xpath("//body//app-root//div[@class='row']//div[@class='row']//div[@class='row']//li[3]//h6[.='Weekly']")).isDisplayed(), 
		        "Weekly Frequency is not showing on the Info page");
		    
		    System.out.println("Assertion passed: 'Weekly Frequency' is visible on the Info page.");
		} catch (TimeoutException e) {
		    // If the element is not visible after waiting, the assertion will fail
		    Assert.fail("Assertion failed: 'Weekly Frequency' is not visible on the Info page.");
		} catch (NoSuchElementException e) {
		    // If the element is not found, fail the test
		    Assert.fail("Assertion failed: 'Weekly Frequency' element is not found on the Info page.");
		}
		//body//app-root//div[@class="row"]//div[@class="row"]//div[@class="row"]//li[3]//h6[.='Weekly']
	}
	@Test(priority = 11)
	public void HistoryTabTest_TC_M11() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
	
		meter.ClickOn_HistoryTab();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='History']")).isDisplayed(), "History page not opened");
		
	}
	
	@Test(enabled=false)
	public void HistoryPageFilterTest_TC_M12() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		meter.ClickOn_HistoryTab();
		meter.ClickOn_FilterIconOnHistoryPage();
		Thread.sleep(5000);
//		meter.CLickOn_FilterBystartDateInHistoryPage("Mar-2024 ", "05");
//		meter.ClickOn_FilterByEndDateInHistoryPage("Jun-2024 ", "20");
//		meter.ClickOn_Filter_Apply_Button();
		
		Dates date = new Dates();
		date.startDate(driver, "Mar-2024", "5");
		Thread.sleep(2000);
		date.End_Date(driver, "Jan-2025", "22");
//		wb.EscapeMethod(driver);
		Thread.sleep(5000);
		meter.ClickOn_Filter_Apply_Button();
		Thread.sleep(2000);
		
	}
	@Test(enabled=false)
	public void HistoryPageFilterClearTest_TC_M13() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		Meters meter = new Meters(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		meter.ClickOn_HistoryTab();
		meter.ClickOn_FilterIconOnHistoryPage();
		Thread.sleep(5000);
//		meter.CLickOn_FilterBystartDateInHistoryPage("Mar-2024 ", "05");
//		meter.ClickOn_FilterByEndDateInHistoryPage("Jun-2024 ", "20");
//		meter.ClickOn_Filter_Apply_Button();
		
		Dates date = new Dates();
		date.startDate(driver, "Mar-2024", "5");
		Thread.sleep(2000);
		date.End_Date(driver, "Jun-2024", "27");
		Thread.sleep(2000);
		meter.ClickOn_Filter_Apply_Button();
		Thread.sleep(5000);
		meter.ClickOn_Clear_Filter_Button();	
	}
	
	
	@Test(priority = 14)
	public void MeterHistoryDownload_14()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		Meters meter = new Meters(driver);
		meter.ClickOn_HistoryTab();
		meter.ClickOn_ExportButton();
		driver.findElement(By.xpath("//a[normalize-space()='As PDF']")).click();
		
	}
	
	@Test(priority = 15)
	public void MeterTriggerpage_15()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
		driver.findElement(By.xpath("//span[normalize-space()='Testing']")).click();
		Meters meter = new Meters(driver);
		meter.CLickOn_TriggerButtonOnInfo();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		    // Wait until the filtered element is visible
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Triggers']")));
		    
		    // Assertion to check if the asset name is displayed
		    Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Triggers']")).isDisplayed(), 
		        "Trigger page is not showing on the Info page");
		    
		    System.out.println("Assertion passed: 'Trigger page' is visible on the Info page.");
		} catch (TimeoutException e) {
		    // If the element is not visible after waiting, the assertion will fail
		    Assert.fail("Assertion failed: 'Trigger page' is not visible on the Info page.");
		} catch (NoSuchElementException e) {
		    // If the element is not found, fail the test
		    Assert.fail("Assertion failed: 'Trigger page' element is not found on the Info page.");
		}
//		assert.assertTrue(By.xpath("//h2[normalize-space()='Triggers']").isDisplayed(),"trigger page is not opened");
		
	}
	
	
}
