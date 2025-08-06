package com.Metaagrow.Tickets;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class TodaysFilterTest extends BaseClass {
	
	@Test()
	public void PriorityTest_TC_TKT11() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_Filter_By_Priority();
		tkt.CLickOn_Filter_By_Select_High_Priority();
		tkt.ClickOn_Filter_Apply_Button();
	
	}
	
	@Test()
	public void RaisedByTest_TC_TKT12() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_Filter_By_Raised_By();
		String RaisedBy ="Rishikesh";
		tkt.ClickOn_Filter_By_Raised_By_SearchBox(RaisedBy);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@id='custom']//a[.='"+RaisedBy+"'])[1]")).click();
		tkt.ClickOn_Filter_Apply_Button();
		
	}

	
	@Test()
	public void AssignedToTest_TC_TKT13() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
		tkt.ClickoN_Filter_By_AssignedTo();
		String AssignedTo ="Siraj";
		tkt.ClickoN_Filter_By_AssignedTo_SearchBox(AssignedTo);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@id='custom']//a[.='"+AssignedTo+"'])[2]")));
		driver.findElement(By.xpath("(//li[@id='custom']//a[.='"+AssignedTo+"'])[2]")).click();
		tkt.ClickOn_Filter_Apply_Button();
	
	}
	
	@Test()
	public void OriginTest_TC_TKT14() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
		tkt.ClickON_Filter_By_Select_Origin();
		tkt.Clickon_Filter_By_Select_Origin_Asset_Issue();
		tkt.ClickOn_Filter_Apply_Button();
		
	}
	
	@Test()
	public void TicketNoTest_TC_TKT15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
	tkt.CLickOn_Filter_By_Ticket_No_TextField("0003");
		tkt.ClickOn_Filter_Apply_Button();
	}
	
	@Test()
	public void TicketTitleTest_TC_TKT16() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
	tkt.ClickOn_ClosedFilterByTitle("Security cameras of Lane 3 not working");
		tkt.ClickOn_Filter_Apply_Button();
	}
	
	@Test()
	public void StartDateEndDateTest_TC_TKT17() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.CLockOn_Filter_Icon();
	   Dates date = new Dates();
	   date.startDate(driver, "Sep-2024", "19");
	   tkt.End_Date(driver, "Sep-2024", "19");
	   tkt.ClickOn_Filter_Apply_Button();
	   
//	    Locate the span element
	   WebElement span_element = driver.findElement(By.xpath("//span[contains(text(), '19 Sep, 2024 06:28 PM')]"));


	   // Assert that the element is displayed
       Assert.assertTrue(span_element.isDisplayed(),"The date is not displayed on the listing page.");
	}
	

}
