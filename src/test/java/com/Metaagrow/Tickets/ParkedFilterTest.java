package com.Metaagrow.Tickets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

public class ParkedFilterTest extends BaseClass{
	
	@Test()
	public void PriorityTest_TC_TKT25() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Parked_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_Filter_By_Priority();
		tkt.CLickOn_Filter_By_Select_High_Priority();
		tkt.ClickOn_Filter_Apply_Button();
		 WebElement HighPriority = driver.findElement(By.xpath("(//ul[@class='tr'])[11]//li[.='High']"));


		// Assert that the element is displayed
	Assert.assertTrue(HighPriority.isDisplayed(),"High Priority is not displayed on the listing page.");

	}
	@Test()
	public void FilterRaisedByTest_TC_TKT26() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Parked_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_Filter_By_Raised_By();
		String RaisedBy ="Rishikesh";
		tkt.ClickOn_Filter_By_Raised_By_SearchBox(RaisedBy);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@id='custom']//a[.='"+RaisedBy+"'])[1]")).click();
		tkt.ClickOn_Filter_Apply_Button();

		WebElement RaisedByName = driver.findElement(By.xpath("((//ul[@class='tr'])[19]//li[.='Rishikesh'])[1]"));


		// Assert that the element is displayed
		Assert.assertTrue(RaisedByName.isDisplayed(),"High Priority is not displayed on the listing page.");

	}
	
	@Test()
	public void AssignedToTest_TC_TKT27() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Parked_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickoN_Filter_By_AssignedTo();
		String AssignedTo ="Siraj";
		tkt.ClickoN_Filter_By_AssignedTo_SearchBox(AssignedTo);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@id='custom']//a[.='"+AssignedTo+"'])[2]")));
		driver.findElement(By.xpath("(//li[@id='custom']//a[.='"+AssignedTo+"'])[2]")).click();
		tkt.ClickOn_Filter_Apply_Button();

		
		WebElement AssignedToNameName = driver.findElement(By.xpath("//span[@title=\"Siraj\"]"));
		wait.until(ExpectedConditions.visibilityOf(AssignedToNameName));
		
		// Assert that the element is displayed
		Assert.assertTrue(AssignedToNameName.isDisplayed(),"High Priority is not displayed on the listing page.");

	}
	@Test()
	public void FilterOriginTest_TC_TKT28() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Parked_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickON_Filter_By_Select_Origin();
		tkt.Clickon_Filter_By_Select_Origin_Asset_Issue();
		tkt.ClickOn_Filter_Apply_Button();
		driver.navigate().refresh();

	}
	
	@Test()
	public void TicketNoTest_TC_TKT29() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Parked_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.CLickOn_Filter_By_Ticket_No_TextField("0080");
		tkt.ClickOn_Filter_Apply_Button();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test()
	public void TicketTitleTest_TC_TKT30() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Parked_Button();
	
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_ClosedFilterByTitle("Damage Bowling Ball No680");
		Thread.sleep(2000);
		tkt.ClickOn_Filter_Apply_Button();
		
		WebElement tktTitle = driver.findElement(By.xpath("//span[@title=\"Damage Bowling Ball No680\"]"));
		Assert.assertTrue(tktTitle.isDisplayed(), "Searched Tikit Title is not showing in the list");
//		driver.navigate().refresh();
		
	}
	@Test()
	public void StartDateEndDateTest_TC_TKT31() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
tkt.ClickOn_Parked_Button();
		tkt.CLockOn_Filter_Icon();
	   Dates date = new Dates();
	   date.startDate(driver, "Sep-2024", "20");
	   tkt.End_Date(driver, "Sep-2024", "20");
	   tkt.ClickOn_Filter_Apply_Button();
//	    Locate the span element
	   WebElement Closed_On = driver.findElement(By.xpath("//span[normalize-space()=\"20 Sep, 2024 06:45 PM\"]"));

	   // Assert that the element is displayed
       Assert.assertTrue(Closed_On.isDisplayed(),"The date is not displayed on the listing page.");
       
//       // Optionally, check if the page has loaded correctly
//	    try {
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '13 Mar, 2024 12:35 PM')]"))); 
//	    } catch (TimeoutException e) {
//	        Assert.fail("13 March ticket is not showing after applying filter of that date");
//	    }
//	    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
	}

}
