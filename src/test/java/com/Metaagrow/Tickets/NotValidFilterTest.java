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

public class NotValidFilterTest extends BaseClass {
	
	@Test()
	public void PriorityTest_TC_TKT32() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_Filter_By_Priority();
		tkt.CLickOn_Filter_By_Select_High_Priority();
		tkt.ClickOn_Filter_Apply_Button();
		 WebElement HighPriority = driver.findElement(By.xpath("(//ul[@class='tr'])[11]//li[.='High']"));


		// Assert that the element is displayed
	Assert.assertTrue(HighPriority.isDisplayed(),"High Priority is not displayed on the listing page.");

	}
	@Test()
	public void RaisedByTest_TC_TKT33() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_Filter_By_Raised_By();
		String RaisedBy ="Rishikesh";
		tkt.ClickOn_Filter_By_Raised_By_SearchBox(RaisedBy);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@id='custom']//a[.='"+RaisedBy+"'])[1]")).click();
		tkt.ClickOn_Filter_Apply_Button();

		WebElement RaisedByName = driver.findElement(By.xpath("//body[1]/app-root[1]/main[1]/div[1]/div[1]/div[2]/app-ticket-list[1]/section[3]/div[1]/ul[1]/li[12]/ul[1]/li[8]/span[1]"));


		// Assert that the element is displayed
		Assert.assertTrue(RaisedByName.isDisplayed(),"High Priority is not displayed on the listing page.");

	}
	
	@Test()
	public void AssignedToTest_TC_TKT34() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickoN_Filter_By_AssignedTo();
		String AssignedTo ="Ghassan Assi";
		tkt.ClickoN_Filter_By_AssignedTo_SearchBox(AssignedTo);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@id='custom']//a[.='"+AssignedTo+"'])[2]")));
		driver.findElement(By.xpath("(//li[@id='custom']//a[.='"+AssignedTo+"'])[2]")).click();
		tkt.ClickOn_Filter_Apply_Button();

		WebElement AssignedToNameName = driver.findElement(By.xpath("(//span[@title='Ghassan Assi'])[1]"));

		// Assert that the element is displayed
		Assert.assertTrue(AssignedToNameName.isDisplayed(),"Only Assigned To Siraj is not displayed on the listing page.");

	}
	@Test()
	public void OriginTest_TC_TKT35() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.ClickON_Filter_By_Select_Origin();
		tkt.ClickOn_Filter_By_Select_Origin_Ad_Hoc_Issue();
		tkt.ClickOn_Filter_Apply_Button();
		
		
				WebElement Adhoc_IssueName = driver.findElement(By.xpath("//body[1]/app-root[1]/main[1]/div[1]/div[1]/div[2]/app-ticket-list[1]/section[3]/div[1]/ul[1]/li[12]/ul[1]/li[7]/span[1]"));

				// Assert that the element is displayed
				Assert.assertTrue(Adhoc_IssueName.isDisplayed(),"Ad-hoc Issue is not displayed on the listing page.");
//		driver.navigate().refresh();

	}
	
	@Test()
	public void TicketNoTest_TC_TKT36() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
		tkt.CLockOn_Filter_Icon();
		tkt.CLickOn_Filter_By_Ticket_No_TextField("0081");
		tkt.ClickOn_Filter_Apply_Button();
		WebElement TicketNo = driver.findElement(By.xpath("//span[normalize-space()='0081']"));

		// Assert that the element is displayed
		Assert.assertTrue(TicketNo.isDisplayed(),"Ticket No 0081 is not displayed on the listing page.");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

	@Test()
	public void TicketTitleTest_TC_TKT37() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
	
		tkt.CLockOn_Filter_Icon();
		tkt.ClickOn_ClosedFilterByTitle("Sound issue of soft play");
		Thread.sleep(2000);
		tkt.ClickOn_Filter_Apply_Button();
		WebElement Ticket_title = driver.findElement(By.xpath("//span[@title=\"Sound issue of soft play\"]"));
		wait.until(ExpectedConditions.visibilityOf(Ticket_title));
		Assert.assertTrue(Ticket_title.isDisplayed(),"Ticket Title 'Sound issue of soft play' is not displayed on the listing page.");
//		driver.navigate().refresh();
		
	}
	@Test()
	public void StartDateEndDateTest_TC_TKT38() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		tkt.ClickOn_Not_Valid_Button();
		tkt.CLockOn_Filter_Icon();
	   Dates date = new Dates();
	   date.startDate(driver, "Sep-2024", "20");
	   tkt.End_Date(driver, "Sep-2024", "20");
	   tkt.ClickOn_Filter_Apply_Button();
//	    Locate the span element
	   WebElement Closed_On = driver.findElement(By.xpath("//span[contains(text(), '20 Sep, 2024 06:33 PM')]"));

	   // Assert that the element is displayed
       Assert.assertTrue(Closed_On.isDisplayed(),"The date is not displayed on the listing page.");
       
       // Optionally, check if the page has loaded correctly
//	    try {
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '13 Mar, 2024 12:35 PM')]"))); 
//	    } catch (TimeoutException e) {
//	        Assert.fail("13 March ticket is not showing after applying filter of that date");
//	    }
	  
	}


}
