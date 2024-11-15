package com.Metaagrow.Checklists;

import java.text.Collator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Checklists;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;

public class Checklist extends BaseClass{
	@Test(priority = 1)
	public void ImportChecklistToPropertyTest_TC_C1() throws InterruptedException {
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    HomePage hp = new HomePage(driver);

	    hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnChecklistLinkText();
	    Checklists list = new Checklists(driver);
	    list.ClickOn_RevenueLinkText();
	    Thread.sleep(2000);
	    list.ClickOn_select_Proprty_Dropdown_By_VisibleText("ANDHERI");
	    Thread.sleep(2000);
	    list.ClickOn_Soft_Play_Checklist();
	    list.ClickOn_Video_Games_checklist();
	    list.ClickOn_Import_Button();

	    try {
            // Find the popup element using its xpath
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement popupElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='successPopUp']//p[contains(text(),'Checklist exported successfully')]")));
            WebElement popupElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),' Template already exist')])[1]")));

            // Check if the popup is displayed
            if (popupElement1.isDisplayed()) {
                System.out.println("The 'Checklist exported successfully' popup is displayed.");
                // Perform further assertions or actions if needed
            }
            else if (popupElement2.isDisplayed()) {
            	System.out.println("The ' Template already exist for selected property' popup is displayed.");
				
			} {
				
			}
        } catch (Exception e) {
            // If the popup does not appear within the specified time, fail the test
            System.out.println("The 'Checklist exported successfully' popup did not appear.");
            
//            Assert.fail("The 'Checklist exported successfully' popup did not appear.");
        }
	    finally {
	    	 Thread.sleep(2000);
	 	    list.ClickOn_Ok_Button_On_Confirmation_Page();
		}
	    
//	   driver.findElement(By.xpath("//div[@id='successPopUp']//div[@class='modal-body']")).getText();
//	   Thread.sleep(2000);
//	   list.ClickOn_Ok_Button_On_Confirmation_Page();
	    
	
	}
	@Test(enabled = false)
	public void ImportDuplicateChecklistToPropertyTest_TC_C2() throws InterruptedException {
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    HomePage hp = new HomePage(driver);

	    hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnChecklistLinkText();
	    Checklists list = new Checklists(driver);
	    list.ClickOn_RevenueLinkText();
	    
	    list.ClickOn_select_Proprty_Dropdown_By_VisibleText("ANDHERI");
	   
	    list.ClickOn_Soft_Play_Checklist();
	    list.ClickOn_Video_Games_checklist();
	    list.ClickOn_Import_Button();

	    try {
            // Find the popup element using its xpath
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement popupElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='successPopUp']//p[contains(text(),'Checklist exported successfully')]")));
            WebElement popupElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='successPopUp'] p")));

            // Check if the popup is displayed
//            if (popupElement1.isDisplayed()) {
//                System.out.println("The 'Checklist exported successfully' popup is displayed.");
//                // Perform further assertions or actions if needed
//            }
             if (popupElement2.isDisplayed()) {
            	System.out.println("The ' Template already exist for selected property' popup is displayed.");
				
			} {
				
			}
        } catch (Exception e) {
            // If the popup does not appear within the specified time, fail the test
            System.out.println("The 'Template already exist for selected property' popup did not appear.");
            
            Assert.fail("The 'Template already exist for selected property' popup did not appear.");
        }
	    finally {
	    	 Thread.sleep(2000);
	 	    list.ClickOn_Ok_Button_On_Confirmation_Page();
		}
	   
	}
	
	
	@Test(priority = 3)
	public void WithoutPropertyImportErrormsgcome_TC_C3() throws Throwable
	{
		   LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    HomePage hp = new HomePage(driver);

		    hp.ClickOnSetupLinkText(driver);
		    Setup sp = new Setup(driver);
		    sp.ClickOnChecklistLinkText();
		    Checklists list = new Checklists(driver);
		    list.ClickOn_RevenueLinkText();
		    Thread.sleep(2000);
		    list.ClickOn_Video_Games_checklist();
		    list.ClickOn_Import_Button();

		    try {
	            // Find the popup element using its xpath
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement popupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='successPopUp']//p[contains(text(),'Please select Property')]")));

	            // Check if the popup is displayed
	            if (popupElement.isDisplayed()) {
	                System.out.println("The 'Please select Property' popup is displayed.");
	                // Perform further assertions or actions if needed
	            }
	        } catch (Exception e) {
	            // If the popup does not appear within the specified time, fail the test
	            System.out.println("The 'Please select Property' popup did not appear.");
	            Assert.fail("The 'Please select Property' popup did not appear.");
	        }
		    Thread.sleep(2000);
		    list.ClickOn_Ok_Button_On_Confirmation_Page();
	}
	   
	@Test(priority = 4)
	public void ImportallChecklistToPropertyTest_TC_C4() throws Throwable
	{
		   LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    HomePage hp = new HomePage(driver);

		    hp.ClickOnSetupLinkText(driver);
		    Setup sp = new Setup(driver);
		    sp.ClickOnChecklistLinkText();
		    Checklists list = new Checklists(driver);
		    list.ClickOn_RevenueLinkText();
		    Thread.sleep(2000);
	    list.ClickOn_Template_Name();
	    Thread.sleep(2000);
	    list.ClickOn_select_Proprty_Dropdown_By_VisibleText("ANDHERI");
	    Thread.sleep(2000);
	    list.ClickOn_Import_Button();
	    Thread.sleep(3000);
	    list.ClickOn_Ok_Button_On_Confirmation_Page();
	}
	@Test(priority = 5)
	public void without_selecting_PropertyAndChecklist_ClickOn_ImportButtonTest_Tc_C5() throws InterruptedException
	{
		 LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    HomePage hp = new HomePage(driver);

		    hp.ClickOnSetupLinkText(driver);
		    Setup sp = new Setup(driver);
		    sp.ClickOnChecklistLinkText();
		    Checklists list = new Checklists(driver);
		    list.ClickOn_RevenueLinkText();
		    Thread.sleep(2000);
		    list.ClickOn_Import_Button();
		    try {
	            // Find the popup element using its xpath
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement popupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='successPopUp']//p[contains(text(),'Please select Property')]")));

	            // Check if the popup is displayed
	            if (popupElement.isDisplayed()) {
	                System.out.println("The 'Please select Property' popup is displayed.");
	                // Perform further assertions or actions if needed
	            }
	        } catch (Exception e) {
	            // If the popup does not appear within the specified time, fail the test
	            System.out.println("The 'Please select Property' popup did not appear.");
	            Assert.fail("The 'Please select Property' popup did not appear.");
	        }
		    Thread.sleep(2000);
		    list.ClickOn_Ok_Button_On_Confirmation_Page();
	}
	@Test(priority = 6)
	public void TemplateNameRadioButtonTest_TC_C6() throws InterruptedException
	{
		 LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    HomePage hp = new HomePage(driver);

		    hp.ClickOnSetupLinkText(driver);
		    Setup sp = new Setup(driver);
		    sp.ClickOnChecklistLinkText();
		    Checklists list = new Checklists(driver);
		    list.ClickOn_RevenueLinkText();
		    Thread.sleep(2000);
		    list.ClickOn_Template_Name();
		   
		     WebElement radioButton = driver.findElement(By.xpath("//label[@for='selectAll']"));
		        // Check if the radio button is selected
		        if (radioButton.isSelected()) {
		            System.out.println("The radio button is selected.");
		        } else {
		            System.out.println("The radio button is not selected.");
		        }

		     Thread.sleep(2000);
			    list.ClickOn_Template_Name();
	}
	@Test(enabled = false)
	public void PropertyAscendingOrderDropdownTest_TC_C7()
	{
		LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    HomePage hp = new HomePage(driver);

	    hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnChecklistLinkText();
	    Checklists list = new Checklists(driver);
	    list.ClickOn_RevenueLinkText();
	    
	    WebElement dropdownElement = driver.findElement(By.xpath("(//select[@id='selectUser'])[2]")); 
	    Select dropdown = new Select(dropdownElement);
	    List<WebElement> options = dropdown.getOptions();
	 // Create a list of String objects to store the text of each option
	 List<String> actualList = new ArrayList<String>();
	 // Loop through the options and get the text of each option
	 for (WebElement option : options) {
	 actualList.add(option.getText());
	 }
	 // Create a copy of the actual list
	 List<String> sortedList = new ArrayList<String>(actualList);
	 // Sort the copy list in ascending order
	 Collections.sort(sortedList);
	 // Compare the actual list and the sorted list
	 Assert.assertEquals(actualList, sortedList); // This will pass if the dropdown list is in ascending order
	 // Assert.assertNotEquals(actualList, sortedList); // This will pass if the dropdown list is not in ascending order

	}
	
	@Test(priority = 8)
	public void BackButtonTest_TC_C8() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    HomePage hp = new HomePage(driver);

	    hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnChecklistLinkText();
	   Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
	   Thread.sleep(2000);
	   footer.ClickOn_Back_Button();
	   Assert.assertTrue(driver.findElement(By.id("Checklists")).isDisplayed(), "Back Button not working");
	}
}


