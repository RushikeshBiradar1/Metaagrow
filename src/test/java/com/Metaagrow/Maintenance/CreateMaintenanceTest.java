package com.Metaagrow.Maintenance;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Excel_Utility;
import com.MetaaGrow.Generic_Utility.File_Utility;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.Generic_Utility.iPathConstant;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;
import com.MetaaGrow.ObjectRepository.Tickets;

import io.appium.java_client.functions.ExpectedCondition;

public class CreateMaintenanceTest extends BaseClass{


	@Test(priority = 1)
	public void createPMWithMndatoryField_PM28 () throws Throwable
	{
		int a=1;
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(hp.getMaintenanceLinkText()));
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Create_Template_Tab();
		pm.CLickOn_Create_Fresh_Template_Tab();
		Java_Utility java = new Java_Utility();
		String PM_Name ="General Maintenance" + java.getRandomNum();
		System.out.println(PM_Name);
		pm.ClickOn_Template_Name_TextField(PM_Name);
		Thread.sleep(2000);
		pm.CLickon_Select_Property_Dropdown("Thane");
		pm.selectTodayDate_OnStartDateOnCreatePMTemplate(driver);
		Thread.sleep(2000);
		pm.End_Date(driver);
		Thread.sleep(2000);
//		wb.EscapeMethod(driver);
//		Thread.sleep(4000);
		wait1.until(ExpectedConditions.elementToBeClickable(pm.getselect_Frequency_Dropdown()));
		pm.select_FrequencyByText("Daily");
		Thread.sleep(1000);
		
		 wait1.until(ExpectedConditions.elementToBeClickable(pm.getAssigned_UserOn_CreatePM()));
		pm.CLickOn_Assigned_UserOn_CreatePM(driver);
		wb.SelectMultiUserCheckBox(driver, "Ghassan Assi");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		pm.CLickOn_Assigned_UserOn_CreatePM(driver);
		
		driver.findElement(By.id("checklistSectionName")).sendKeys("First section Enterd");		Excel_Utility ex = new Excel_Utility();
		File_Utility file = new File_Utility();
		int rowcount = ex.getLastRowcountFromExcel("Sheet1", iPathConstant.ExcelFilePath);
		System.out.println(rowcount);
		for (int i = 2; i <= rowcount; i++) {
			String Questions = ex.ReadDataFromExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 0);

			//Wait
			try {
	            // Wait for up to 10 seconds for the web element to be visible
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Enter'])[" + i + "]")));
//	            (//li[@class='col-6']/descendant::div[@class='form-group']/descendant::input[@formcontrolname='name'])[" + i + "]
	            
	            WebElement inputField = driver.findElement(By.xpath("(//input[@placeholder='Enter'])[" + i + "]"));
				inputField.sendKeys(Questions);

	        } catch (Exception e) {
	            System.out.println("Element not found or not visible: " + e.getMessage());
	        } 
			
			// Use the correct XPath syntax to find the Questions field
			
			
			try {
	            // Wait for up to 10 seconds for the web element to be visible
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Select Response']")));
	            
	            driver.findElement(By.xpath("//span[.='Select Response']")).click();
	        } catch (Exception e) {
	            System.out.println("Element not found or not visible: " + e.getMessage());
	        } 
			
			

			try {
	            // Wait for up to 10 seconds for the web element to be visible
				 int mcIndex = i - 1;
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[.='Multiple Choice'])[" + mcIndex + "]")));
	            
	         // Select "Multiple Choice" from the dropdown
				WebElement multipleChoiceOption = driver.findElement(By.xpath("(//a[.='Multiple Choice'])[" + mcIndex + "]"));
				multipleChoiceOption.click();

	        } catch (Exception e) {
	            System.out.println("Element not found or not visible: " + e.getMessage());
	        } 
			
			
			try {
	            // Wait for up to 10 seconds for the web element to be visible
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[.='Yes / No'])[" + a + "]")));
	         // Select "Yes / No" option

				WebElement yesNoOption = driver.findElement(By.xpath("(//span[.='Yes / No'])[" + a + "]"));
				yesNoOption.click();
				a += 2;

				// Only click on the "Add Another" icon if this is not the last row
				if (i < rowcount) {
					pm.CLickOn_Add_anotherIcon();
				}
	           
	        } catch (Exception e) {
	            System.out.println("Element not found or not visible: " + e.getMessage());
	        }
			
			
		}
		pm.CLickOn_NextButton_On_CreatePM_Page();
		pm.ClickOn_SubmitButtonOnTemplate_SummeryPage();
		pm.ClickOn_OKButton_OnPMCreatedSuccessPopup();
		driver.navigate().refresh();
		Thread.sleep(4000);
		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PM_Name + "')]"));
		System.out.println(ActivePM);
		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");


	}


	@Test(enabled = false)
	public void createPmwithallfields_PM29() throws Throwable
	{
		int a=1;
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Create_Template_Tab();
		pm.CLickOn_Create_Fresh_Template_Tab();
		Java_Utility java = new Java_Utility();
		String PM_Name ="General Maintenance" + java.getRandomNum();
		System.out.println(PM_Name);
		pm.ClickOn_Template_Name_TextField(PM_Name);
		Thread.sleep(2000);
		
		pm.selectTodayDate_OnStartDateOnCreatePMTemplate(driver);
		pm.End_Date(driver);
		pm.CLickon_Select_Property_Dropdown("THE_DHARAVI");
		pm.select_FrequencyByText("Daily");
		pm.CLickOn_Assigned_UserOn_CreatePM(driver);
		wb.SelectMultiUserCheckBox(driver, "Biradar");
		wb.SelectMultiUserCheckBox(driver, "Mahesh");
		Excel_Utility ex = new Excel_Utility();
		File_Utility file = new File_Utility();
		int rowcount = ex.getLastRowcountFromExcel("Sheet1", iPathConstant.ExcelFilePath);
		System.out.println(rowcount);
		for (int i = 1; i <= rowcount; i++) {
			String Questions = ex.ReadDataFromExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 0);

			// Use the correct XPath syntax to find the Questions field
			WebElement inputField = driver.findElement(By.xpath("(//li[@class='col-6']/descendant::div[@class='form-group']/descendant::input[@formcontrolname='name'])[" + i + "]"));
			inputField.sendKeys(Questions);


			driver.findElement(By.xpath("//span[.='Select Response']")).click();


			// Select "Multiple Choice" from the dropdown
			WebElement multipleChoiceOption = driver.findElement(By.xpath("(//a[.='Multiple Choice'])[" + i + "]"));
			multipleChoiceOption.click();

			// Select "Yes / No" option

			WebElement yesNoOption = driver.findElement(By.xpath("(//span[.='Yes / No'])[" + a + "]"));
			yesNoOption.click();
			a += 2;

			// Only click on the "Add Another" icon if this is not the last row
			if (i < rowcount) {
				pm.CLickOn_Add_anotherIcon();
			}
		}
		pm.CLickOn_NextButton_On_CreatePM_Page();
		pm.ClickOn_SubmitButtonOnTemplate_SummeryPage();
		pm.ClickOn_OKButton_OnPMCreatedSuccessPopup();
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PM_Name + "')]"));
		System.out.println(ActivePM);
		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");
	}	

	@Test(priority = 3)
	public void EditPMTemplateNameTest_PM30() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_ActionButton();
		pm.ClickOn_Editbutton_OnAction();
		Java_Utility java = new Java_Utility();
		String PM_Name ="General Maintenance" + java.getRandomNum();

		wb.BackSpaceMethod("(//input[@formcontrolname='name'])[1]", driver);
		Thread.sleep(3000);
		pm.ClickOn_Template_Name_TextField(PM_Name);
		pm.CLickOn_SubmitButton_OnEditPmTemplate();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		By buttonLocator = By.xpath("(//button[@type='button'][normalize-space()='Ok'])[1]");
		WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		pm.clickOn_OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage();
		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PM_Name + "')]"));
		System.out.println(ActivePM);
		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void EditPMStartDate_EndDateTest_PM31() throws Throwable
	{
		// Assuming this is within a method in your test class
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		HomePage hp = new HomePage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(hp.getMaintenanceLinkText()));	
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_ActionButton();
		pm.ClickOn_Editbutton_OnAction();
		Thread.sleep(1000);
		pm.selectTodayStartDate_OnEditPMTemplate(driver);
		Thread.sleep(2000);
		 wb.EscapeMethod(driver);
		pm.End_Date(driver);
		Thread.sleep(2000);
		 wb.EscapeMethod(driver);
wait.until(ExpectedConditions.elementToBeClickable(pm.getSubmitButton_OnEditPmTemplate()));
		pm.CLickOn_SubmitButton_OnEditPmTemplate();

	
		By buttonLocator = By.xpath("(//button[@type='button'][normalize-space()='Ok'])[1]");
		WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		Thread.sleep(2000);
		pm.clickOn_OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage();

		String PMName = driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[11]")).getText();
		System.out.println(PMName);

		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PMName + "')]"));
		System.out.println(ActivePM);
		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");

		// Verify that the start and end dates are displayed correctly
		WebElement startDateElement = driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[16]"));
		String displayedStartDate = startDateElement.getText();
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1); // Calculate tomorrow's date
		String expectedStartDate = tomorrow.format(DateTimeFormatter.ofPattern("d MMM, yyyy"));
		Assert.assertEquals(displayedStartDate, expectedStartDate, "The selected start date is incorrect.");

		Thread.sleep(3000);
		WebElement endDateElement = driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[17]"));
		String displayedEndDate = endDateElement.getText();

		// Calculate the expected end date
		LocalDate endDate = today.plusDays(8);

		// Format the expected end date
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
		        .appendPattern("d MMM, yyyy")
		        .toFormatter();
		String expectedEndDate = endDate.format(formatter);

		// Assert that the displayed end date matches the expected format
		Assert.assertEquals(displayedEndDate, expectedEndDate, "The selected End date is incorrect.");
	}

	@Test(priority = 5)
	public void InactivePMTemplateTest_PM32() throws Throwable
	{	
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		String PMName = driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[11]")).getText();
		pm.ClickOn_ActionButton();
		pm.CLickOn_InactiveButton_OnAction();
		Thread.sleep(3000);

		pm.CLickON_YesDeactive_ButtonOnConfirmationPopup();
		Thread.sleep(3000);
		pm.CLickOn_OkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup();
		pm.ClikOn_Inactive_Button();

		// Verify PM in Inactived or not

		System.out.println(PMName);
		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PMName + "')]"));
		System.out.println(ActivePM);
		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");
		
		
	}
	@Test(priority = 6)
	public void ActivePMTemplaeTest_PM33() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		Thread.sleep(3000);
		pm.ClikOn_Inactive_Button();
		Thread.sleep(3000);
		String PMName = driver.findElement(By.xpath("(//span[@class='emailEllapsis'])[11]")).getText();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		By actionInactiveBtn = By.xpath("(//img[@id='changeBUton'])[1]");
		WebElement actionbutton = wait.until(ExpectedConditions.elementToBeClickable(actionInactiveBtn));
		actionbutton.click();
//		pm.CLickOn_ActionButton_InactivePage();
		Thread.sleep(3000);
		pm.CLickOn_activeButton_OnAction();
		Thread.sleep(3000);
		pm.CLickOn_Ok_ButtonOn_Preventive_Maintainance_Templates_activated_successfullyPopup();
		
		
		pm.ClickOn_Active_Button();
		// Verify PM is Activated Or Not
		System.out.println(PMName);
		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PMName + "')]"));
		System.out.println(ActivePM);
		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");

		
	}
	@Test(priority = 7)
	public void RaiseTicketFromTodaysPMQuestions_TCPM44() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		driver.findElement(By.xpath("(//span[contains(@title, 'Super MVP3 Maintenance')])[1]")).click();
//		driver.findElement(By.xpath("(//span[@class='blue'][normalize-space()='Raise Ticket'])[1]")).click();
		pm.CLickon_RaiseTicketIcon_OnFirstQuestion();
		Tickets ticket = new Tickets(driver);
		ticket.SelectTicketType("General");
		Thread.sleep(3000);
		ticket.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		wb.SelectMultiUserCheckBox(driver, "Technical");
		ticket.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
		ticket.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		ticket.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		ticket.ClickON_Filter_By_Title_TextField("Switchboard issue"+ran);
		ticket.ClickOn_Select_Priority_Medium_Button();
		Thread.sleep(3000);
		ticket.ClickOn_Create_Ticket_Button_On_New_Ticket_Page();
		Thread.sleep(3000);
		ticket.ClickOn_Ok_Button_On_Confirmation_Page();
		WebElement viewTicket = driver.findElement(By.xpath("(//span[contains(text(),'View Ticket')])[1]"));
		Assert.assertTrue(viewTicket.isDisplayed(), "Ticket is not raised for fisrt question");
		Thread.sleep(3000);
	}
	
	


}