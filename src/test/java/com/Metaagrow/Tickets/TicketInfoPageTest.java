package com.Metaagrow.Tickets;

import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

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
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

public class TicketInfoPageTest extends BaseClass {
	
	@Test(priority = 1)
	public void TicketReplyTest_TC_TKT9() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
		String ReplyText="Actions Taken: [We have inspected the item and verified the damage...Resolution Plan: [We recommend replacing the item We will initiate a refund proces.]";
		tkt.ClickOn_Reply_TextField_On_Ticket_InfoPage(ReplyText);
		tkt.ClickOn_Submit_Button();
		Thread.sleep(3000);
		tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		
	

	}
	
	@Test(priority = 2)
	public void ForwardTicketTest_TC_TKT10() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		WebElement Ticket_Title = driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(Ticket_Title)).click();
//		driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
//		Ticket_Title.click();
		tkt.ClickOn_Forward_Ticket_Button_On_InfoPage();
		tkt.ClickOn_Select_User_Or_Team_DropdownOn_Ticket_Forward_Page_By_VisibleText();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		tkt.ClickOn_Select_User_Or_Team_DropdownOn_Ticket_Forward_Page_By_VisibleText();
		String Description="I am forwarding the ticket titled Damage Bowling Ball No16 for your review and action.";
		tkt.ClickOn_DescriptionBoxOnForwardTicketPage(Description);
		tkt.ClickOn_Forward_Button();
		
		
		 WebElement OkButton = driver.findElement(By.xpath("//button[@id='ticketViewOk']"));
		 // Optionally, check if the page has loaded correctly
		    try {
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ticketViewOk']"))); // Replace with an element that indicates successful loading
		    } catch (TimeoutException e) {
		        Assert.fail("The expected element did not become visible after clicking OK.");
		    }
		    Thread.sleep(2000);
		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
	}
	
//	@Test()
//	public void ChnageTicketStatusCloseToOpenTest() throws Throwable 
//	{
//		LoginPage lp = new LoginPage(driver);
//		WebDriver_Utility wb = new WebDriver_Utility();
//		wb.ImplicitlyWait(driver);
//		lp.ClickOn_LoginNotification_Icon(driver);
//		HomePage hp = new HomePage(driver);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		hp.ClickOnTicketsLinkText();
//		Tickets tkt = new Tickets(driver);
//		tkt.ClickOn_Closed_Button();
////		String Ticket_Title="Damage Bowling Ball No";
////	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')])[1]"))));
//
////		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')])[1]"));
////		wait.until(ExpectedConditions.elementToBeClickable(e)).click();
//
////		e.click();
//		
//
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(), 'Damage Bowling Ball No')])[1]"))).click();
//		
//
//		 tkt.ClickOn_Select_Ticket_Status_Dropdown_On_Ticket_InfoPage_By_VisibleText("Open");
//		 Thread.sleep(2000);
//		    tkt.ClickOn_RemarkTextField("Ticket status changed to Open ");
//		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getSubmitButton_OnRemarkField()));
//
//		    tkt.ClickOn_SubmitButton_OnRemarkField();
//
//		    System.out.println("Checking if Ok button is clickable...");
//		    WebElement okButton = tkt.getOkButton_onTicket_Status_changed_successfully();
//		    System.out.println("Button displayed: " + okButton.isDisplayed());
//		    System.out.println("Button enabled: " + okButton.isEnabled());
//		    wait.until(ExpectedConditions.elementToBeClickable(okButton));
//		    Thread.sleep(2000);
//		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully())).click();
//
////		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
//		   driver.navigate().refresh();
//		   
//	}
	
	@Test(priority = 3)
	public void ChnageTicketStatusOpenToCloseTest_TC_TKT4() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
//		String Ticket_Title="Damage Bowling Ball No";
//	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')])[1]"))));

//		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')])[1]"));
//		wait.until(ExpectedConditions.elementToBeClickable(e)).click();

//		e.click();
		driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
		 tkt.ClickOn_Select_Ticket_Status_Dropdown_On_Ticket_InfoPage_By_VisibleText("Closed");
		 Thread.sleep(2000);
		    tkt.ClickOn_RemarkTextField("Ticket status changed to Closed ");
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getSubmitButton_OnRemarkField()));

		    tkt.ClickOn_SubmitButton_OnRemarkField();

		    System.out.println("Checking if Ok button is clickable...");
		    WebElement okButton = tkt.getOkButton_onTicket_Status_changed_successfully();
		    System.out.println("Button displayed: " + okButton.isDisplayed());
		    System.out.println("Button enabled: " + okButton.isEnabled());
		    wait.until(ExpectedConditions.elementToBeClickable(okButton));
		    Thread.sleep(2000);
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully())).click();

//		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		   driver.navigate().refresh();
//		 String selected_Status = tkt.GetFirstSelectedValueFromDropdown();
		// Wait for the dropdown to be visible
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(tkt.getSelect_Ticket_Status_Dropdown_On_Ticket_InfoPage()));
//		    Assert.assertEquals(selected_Status, "Closed");
		
	}
	@Test(priority = 4)
	public void ChnageTicketStatusOpenToParkedTest_TC_TKT5() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
//		String Ticket_Title="Damage Bowling Ball No";
//	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')])[1]"))));
//
//		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')])[1]"));
//		String TicketTitle = e.getText();
//		e.click();
//		 Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
		 tkt.ClickOn_Select_Ticket_Status_Dropdown_On_Ticket_InfoPage_By_VisibleText("Parked");
		 Thread.sleep(2000);
		    tkt.ClickOn_RemarkTextField("Ticket status changed to Parked ");
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getSubmitButton_OnRemarkField()));

		    tkt.ClickOn_SubmitButton_OnRemarkField();
//		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully()));
		    System.out.println("Checking if Ok button is clickable...");
		    WebElement okButton = tkt.getOkButton_onTicket_Status_changed_successfully();
		    System.out.println("Button displayed: " + okButton.isDisplayed());
		    System.out.println("Button enabled: " + okButton.isEnabled());
		    wait.until(ExpectedConditions.elementToBeClickable(okButton));
		    Thread.sleep(1000);
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully())).click();

//tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		   driver.navigate().refresh();
		   
//		 Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
//		 footer.ClickOn_Back_Button();
//		 tkt.ClickOn_Parked_Button();
////		    wait.until(ExpectedConditions.elementToBeClickable(e));
//
//		 try {
//			    // Wait for the element to be visible
//			    WebElement element = wait.until(ExpectedConditions.visibilityOf(e));
//			    
//			    // Assert that the element is displayed
//			    Assert.assertTrue(element.isDisplayed(), "Element is not visible.");
//			    System.out.println("Test Passed: Element is visible.");
//			} catch (TimeoutException te) {
//			    // Specific catch for timeout
//			    Assert.fail("Test Failed: Element not visible after waiting. Exception: " + te.getMessage());
//			} catch (Exception e1) {
//			    // General catch for other exceptions
//			    Assert.fail("Test Failed: Element is not visible. Exception: " + e1.getMessage());
//			}
	}
	
	@Test(priority = 5)
	public void ChnageTicketStatusOpenToNotValidTest_TC_TKT6() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);

		driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
		 tkt.ClickOn_Select_Ticket_Status_Dropdown_On_Ticket_InfoPage_By_VisibleText("Not Valid");
		 Thread.sleep(2000);
		 
		    tkt.ClickOn_RemarkTextField("Ticket status changed to Not Valid ");
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getSubmitButton_OnRemarkField()));

		    tkt.ClickOn_SubmitButton_OnRemarkField();
//		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully()));
		    System.out.println("Checking if Ok button is clickable...");
		    WebElement okButton = tkt.getOkButton_onTicket_Status_changed_successfully();
		    System.out.println("Button displayed: " + okButton.isDisplayed());
		    System.out.println("Button enabled: " + okButton.isEnabled());
		    wait.until(ExpectedConditions.elementToBeClickable(okButton));
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully())).click();

		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		   driver.navigate().refresh();
//		   String selectedStatus = tkt.getSelectedTicketStatus(); // Get the selected Status
//		    Assert.assertEquals(selectedStatus, "Not Valid", "Status is not Chnaged to Not Valid.");
	}
	
	@Test(priority = 6)
	public void ChnageTicketHighPriorityTest_TC_TKT7() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
//		String Ticket_Title="Damage Bowling Ball No";
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')and(@title='"+Ticket_Title+"')])[1]"))));
//
//
//	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')and(@title='"+Ticket_Title+"')])[1]")))).click();
//
//		WebElement e = driver.findElement(By.xpath("(//span[contains(text(),'"+Ticket_Title+"')and(@title='"+Ticket_Title+"')])[1]"));
//		String TicketTitle = e.getText();
//		e.click();
driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
		 
		 tkt.ClickOn_Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage_By_VisibleText("High");
		 Thread.sleep(2000);
		 
		// Assertion to verify the selected priority
//		   WebElement selectedPriority = tkt.getSelect_Ticket_Priority_Dropdown_On_Ticket_InfoPage(); // Implement this method in your Tickets class
//		   String selectedPriorityText = selectedPriority.getText();
//		   Assert.assertEquals(selectedPriorityText, "High", "Priority is not set to High.");
		 String selectedPriority = tkt.getSelectedTicketPriority(); // Get the selected priority
		    Assert.assertEquals(selectedPriority, "High", "Priority is not set to High.");
		    tkt.ClickOn_Update_Button_On_Ticket_InfoPage();
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully())).click();

//		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		    Assert.assertEquals(selectedPriority, "High", "Priority is not set to High.");

	}
	
	
	@Test(priority = 7)
	public void ChnageTicketLowPriorityTest_TC_TKT8() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
//		
		driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[1]")).click();
		 
		 tkt.ClickOn_Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage_By_VisibleText("Low");
		 Thread.sleep(2000);
		 
		// Assertion to verify the selected priority
		 String selectedPriority = tkt.getSelectedTicketPriority(); // Get the selected priority
		    Assert.assertEquals(selectedPriority, "Low", "Priority is not set to High.");
		    tkt.ClickOn_Update_Button_On_Ticket_InfoPage();
		    wait.until(ExpectedConditions.elementToBeClickable(tkt.getOkButton_onTicket_Status_changed_successfully())).click();

		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		   

	}
	

}
