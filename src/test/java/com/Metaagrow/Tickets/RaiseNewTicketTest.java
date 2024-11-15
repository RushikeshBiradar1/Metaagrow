package com.Metaagrow.Tickets;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

public class RaiseNewTicketTest extends BaseClass{

	@Test()
	public void GeneralTicketTest_TC_TKT1() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		Thread.sleep(3000);
		tkt.ClickOn_New_Ticket_Button();
		tkt.SelectTicketType("General");
		tkt.Clickon_Property_Dropdown_On_New_Ticket_Page("Thane");
		tkt.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		wb.SelectMultiUserCheckBox(driver, "Technical");
		wb.SelectMultiUserCheckBox(driver, "Operations");
		tkt.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		tkt.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		tkt.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		tkt.ClickOn_ENter_text_Field_On_New_Ticket_Page("Damage Bowling Ball No"+ran);
		tkt.ClickOn_Select_Priority_Medium_Button();
	
		tkt.ClickOn_Create_Ticket_Button_On_New_Ticket_Page();
		
		tkt.ClickOn_Ok_Button_On_Confirmation_Page();
	}
	@Test()
	public void BreakdownTicketAndCloseSameTicketTest_TC_TKT2() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		Thread.sleep(3000);
		tkt.ClickOn_New_Ticket_Button();
		tkt.SelectTicketType("Breakdown");
		wait.until(ExpectedConditions.elementToBeClickable(tkt.getProperty_Dropdown_On_New_Ticket_Page()));
		tkt.Clickon_Property_Dropdown_On_New_Ticket_Page("Thane");
		tkt.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		wb.SelectMultiUserCheckBox(driver, "Technical");
		wb.SelectMultiUserCheckBox(driver, "Operations");
		tkt.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		tkt.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		tkt.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String Ticket_Title="Damage Bowling Ball No"+ran;
		tkt.ClickOn_ENter_text_Field_On_New_Ticket_Page(Ticket_Title);
		  // Store the first value of asset
	    String firstAssetValue = tkt.getFirstValueOfAsset();
	    System.out.println("First Asset Value: " + firstAssetValue);
	    tkt.ClickOn_Select_Asset_Assign_To_drodown_On_New_Ticket_Page(firstAssetValue);
	    Thread.sleep(4000);
		tkt.ClickOn_Select_Priority_Medium_Button();
	
		tkt.ClickOn_Create_Ticket_Button_On_New_Ticket_Page();
		
		   WebElement okButton = tkt.getOk_Button_On_Confirmation_Page();
		    System.out.println("Button displayed: " + okButton.isDisplayed());
		    System.out.println("Button enabled: " + okButton.isEnabled());
		    wait.until(ExpectedConditions.elementToBeClickable(okButton));
		    Thread.sleep(3000);
		tkt.ClickOn_Ok_Button_On_Confirmation_Page();
		driver.navigate().refresh();
	

//		driver.findElement(By.xpath("//span[@title='"+Ticket_Title+"']")).click();

		  

//	    // Wait for the list items to be visible
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li")));
//
//	    // Locate all the list items containing ticket types
//	    List<WebElement> ticketTypes = driver.findElements(By.xpath("//h6[contains(@class, 'ng-star-inserted')]"));
//
//	    boolean isBreakdownPresent = false;
//
//	    // Loop through each element to check the text
//	    for (WebElement ticketType : ticketTypes) {
//	        String ticketText = ticketType.getText();
//	        System.out.println("Ticket Type Found: " + ticketText); // Print for debugging
//
//	        if (ticketText.equalsIgnoreCase("Breakdown")) {
//	            isBreakdownPresent = true;
//	            break; // Exit the loop if "Breakdown" is found
//	        }
//	    }
//
//	    // Assert that "Breakdown" is present
//	    Assert.assertTrue(isBreakdownPresent, "Breakdown ticket type is not found.");
	
		
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='" + Ticket_Title + "']"))).click();
//		 // Wait until the list of asset names is visible
//		
//		    List<WebElement> assetList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li/p[text()='Asset Name']/following-sibling::h6")));
//
//		    boolean isAssetPresent = false;
//
//		    // Check if the first selected asset is in the list
//		    for (WebElement asset : assetList) {
//		        if (asset.getText().equals(firstAssetValue)) { // Use the variable instead of "GoKart 1"
//		            isAssetPresent = true;
//		            break;
//		        }
//		    }
//
//		    // Assert the result
//		    Assert.assertTrue(isAssetPresent, "Asset Name '" + firstAssetValue + "' is not showing in the list.");
//		
//		    
//		    tkt.ClickOn_Select_Ticket_Status_Dropdown_On_Ticket_InfoPage_By_VisibleText("Closed");
//		    tkt.ClickOn_RemarkTextField("Closed");
//		    tkt.ClickOn_SubmitButton_OnRemarkField();
//		    Thread.sleep(2000);
//		    tkt.ClickOn_OkButton_onTicket_Status_changed_successfully();
		    
	}
	
	@Test()
	public void GeneralTicketwithAssetTest_TC_TKT3() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		hp.ClickOnTicketsLinkText();
		Tickets tkt = new Tickets(driver);
		
		tkt.ClickOn_New_Ticket_Button();
		tkt.SelectTicketType("General");
		wait.until(ExpectedConditions.elementToBeClickable(tkt.getProperty_Dropdown_On_New_Ticket_Page()));
		tkt.Clickon_Property_Dropdown_On_New_Ticket_Page("Thane");
		tkt.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		wb.SelectMultiUserCheckBox(driver, "Technical");
		wb.SelectMultiUserCheckBox(driver, "Operations");
		tkt.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		tkt.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		tkt.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String Ticket_Title="Damage Bowling Ball No"+ran;
		tkt.ClickOn_ENter_text_Field_On_New_Ticket_Page(Ticket_Title);
		  // Store the first value of asset
	    String firstAssetValue = tkt.getFirstValueOfAsset();
	    System.out.println("First Asset Value: " + firstAssetValue);
	    tkt.ClickOn_Select_Asset_Assign_To_drodown_On_New_Ticket_Page(firstAssetValue);
	    Thread.sleep(4000);
		tkt.ClickOn_Select_Priority_High_Button();
	
		tkt.ClickOn_Create_Ticket_Button_On_New_Ticket_Page();
		Thread.sleep(2000);
		tkt.ClickOn_Ok_Button_On_Confirmation_Page();
		driver.navigate().refresh();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='" + Ticket_Title + "']"))).click();

//		WebElement Title = driver.findElement(By.xpath("//span[.='"+Ticket_Title+"']"));
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(Title)).click();

		    
		 // Wait until the list of asset names is visible
		    List<WebElement> assetList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li/p[text()='Asset Name']/following-sibling::h6")));

		    boolean isAssetPresent = false;

		    // Check if the first selected asset is in the list
		    for (WebElement asset : assetList) {
		        if (asset.getText().equals(firstAssetValue)) { // Use the variable instead of "GoKart 1"
		            isAssetPresent = true;
		            break;
		        }
		    }

		    // Assert the result
		    Assert.assertTrue(isAssetPresent, "Asset Name '" + firstAssetValue + "' is not showing in the list.");
  
	}
	
	
	
	
}
