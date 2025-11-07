package com.Metaagrow.Inspetions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
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
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Inspections;
import com.MetaaGrow.ObjectRepository.LoginPage;

public class CreateInspections extends BaseClass{

	@Test(priority = 1)
	public void CreatechecklistTestwithMandatoryField_TC_I1() throws Throwable
	{
		int a=1;
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Checklist_Button();

		inspect.ClickOn_AddButtonOnChecklistPage();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();

		inspect.ClickOn_SingleLinkText();
		String checklistName = "Rides Checklist"+ ran;
		inspect.CLickOn_CheckList_Name_On_Create_Checklist_Page(checklistName);
		inspect.ClickOn_Property_Dropdown_On_Create_Checklist_Page_By_VisibleText("Thane");
		inspect.ClickOn_Department_Dropdown_On_Create_Checklist_Page("Technical");Thread.sleep(3000);

		inspect.ClickON_Section_Name_TextBox_On_Create_Checklist_Page("Power Supply and Connections"+ran);
		Excel_Utility ex = new Excel_Utility();
		File_Utility file = new File_Utility();
		int rowcount = ex.getLastRowcountFromExcel("Sheet1", iPathConstant.ExcelFilePath);
		System.out.println(rowcount);
		for (int i = 1; i <= rowcount; i++) {
			String Questions = ex.ReadDataFromExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 0);

			// Use the correct XPath syntax to find the Questions field

			WebElement inputField = driver.findElement(By.xpath("(//input[@placeholder='Enter Question Name'])["+i+"]"));
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
				inspect.ClickOn_Add_Question_Icon_On_Create_Checklist_Page();
			}
		}
		inspect.ClickOn_Next_Button_On_Create_Checklist_Page();
		inspect.ClickOn_Create_Checklist_Button_On_Checklist_Summery_Page();
		inspect.CLiCKOn_Ok_Button_On_Create_Checklist_Confirmation_Page();
		driver.navigate().refresh();
		//		Thread.sleep(1000);
		//		WebElement Activechecklist = driver.findElement(By.xpath("//span[contains(text(), '" + checklistName + "')]"));
		//		System.out.println(Activechecklist);
		//		Assert.assertTrue(Activechecklist.isDisplayed(), "Created Checklist Name is not showing in List");
	}

	@Test(dependsOnMethods = "CreatechecklistTestwithMandatoryField_TC_I1")
	public void EditChecklistName_TC_I2() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
		inspect.ClickOn_Manage_Checklist_Button();

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		WebElement todaysDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(), 'Rides Checklist')])[1]")));

		driver.findElement(By.xpath("(//span[contains(text(), 'Rides Checklist')])[1]")).click();
		inspect.CLickOn_Edit_Checklist_Button_On_Manage_Checklist_Info_Page();
		//		WebDriver_Utility wb = new WebDriver_Utility();

		wait.until(ExpectedConditions.visibilityOf((inspect.getCheckList_Name_On_Create_Checklist_Page())));
		wb.BackSpaceMethod("//input[@placeholder='Enter text']", driver);
		String NewchecklistName = "Rides Checklist"+ ran;
		inspect.CLickOn_CheckList_Name_On_Create_Checklist_Page(NewchecklistName);
		inspect.ClickOn_Next_Button_On_Create_Checklist_Page();
		wait.until(ExpectedConditions.visibilityOf((inspect.getUpDateChecklistButton_OnChecklistSummeryPage())));

		inspect.ClickOn_UpDateChecklistButton_OnChecklistSummeryPage();
		inspect.CLiCKOn_Ok_Button_On_Create_Checklist_Confirmation_Page();

		WebElement EditedChecklist_Name = driver.findElement(By.xpath("//h6[contains(text(), '" + NewchecklistName + "')]"));
		System.out.println(EditedChecklist_Name);
		Assert.assertTrue(EditedChecklist_Name.isDisplayed(), "Edited Checklist Name is not showing in List");
	}

	@Test(priority = 3)
	public void ScheduleNew_InspectionTest_TC_I3() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");
		Thread.sleep(3000);  
		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Compliance Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		inspect.SelectTomorrowStartadte(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Once");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();;


		//Verify created scheduled on listing
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title: " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");


	}
	@Test(priority = 4)
	public void EditSCheduleNameTest_TC_I4() throws Throwable
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
		//		driver.findElement(By.xpath("(//span[contains(text(), 'Redemption Compliance Audit')])[1]")).click();
		inspect.ClickOn_Dynamic_Schedule_Name_On_Manage_Schedule_Page();
		inspect.ClickOn_Edit_Schedule_Button_On_Manage_Schedule_InfoPage();
		inspect.Clear_Schedule_Name_TextBox_On_Create_Schedule_Page(driver);

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String new_Schedule_Name = "Fire Safety Checklist"+ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(new_Schedule_Name);
		inspect.CLickOn_UpdateScheduleButton_OnEditSchdulePage();
		Thread.sleep(2000);		
		inspect.ClickOn_OkButton_OnSchedule_details_updated_successfully();
		//		WebElement UpdatedSchedule_Name = driver.findElement(By.xpath("//span[contains(text(), '" + new_Schedule_Name + "')]"));
		//		System.out.println(UpdatedSchedule_Name);
		//		Assert.assertTrue(UpdatedSchedule_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");

	}

	@Test(priority = 5)
	public void InactiveScheduleTest_TC_I5() throws Throwable
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

		// Get the schedule title attribute and trim whitespace
		WebElement scheduleElement = driver.findElement(By.xpath("(//span[starts-with(@title, 'Redemption')])[1]"));
		String fullTitle = scheduleElement.getAttribute("title").trim();

		System.out.println("Schedule Title: " + fullTitle);

		// Click status icon and mark inactive
		driver.findElement(By.xpath("(//img[@alt='Status'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Inactive')])[1]")).click();

		// Wait for modal dialog or confirmation (replace Thread.sleep with explicit wait if possible)
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Ok'])[1]")).click();

		// Click on Inactive button in manage checklist page
		inspect.ClickOn_Inactive_Button_On_Manage_Checklist_Page();
		
		wb.scrollLeft(driver, 500);

		// Wait explicitly until the inactivated schedule appears in the list
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement inactivatedScheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(normalize-space(text()), '" + fullTitle + "')]")
				));

		System.out.println("Found Inactive Schedule: " + inactivatedScheduleElement.getText());

//		Assert.assertTrue(inactivatedScheduleElement.isDisplayed(), "Scheduled Checklist Name is not showing in List");
	}


	@Test(priority = 6)
	public void CreatescheduleWithAllFieldsWithDailyFrequencyTest_TC_I6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);

		inspect.ClickOn_Manage_Schedule_Button();
		Thread.sleep(3000);
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");
		inspect.CLickOn_AssetDropdownOn_CreateSchedulePage();
		wb.SelectMultiUserCheckBox(driver, "Foos Ball");
		inspect.CLickOn_AssetDropdownOn_CreateSchedulePage();
		Thread.sleep(3000);


		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Compliance Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		Thread.sleep(3000); 
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Daily");
		inspect.ClickOn_Random_Mandatory_Photo_CheckBox_On_Create_Schedule_Page();
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();




		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();
		driver.navigate().refresh();


		//Verify created scheduled on listing
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title: " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");
	}



	@Test(priority = 7)
	public void ScheduleNew_InspectionToWeeklyFrequencyTest_TC_I7() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");
		Thread.sleep(3000);  
		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Compliance Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Weekly");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();;
		driver.navigate().refresh();
		//		WebElement ScheduledChecklist_Name = driver.findElement(By.xpath("//span[contains(text(), '" + schedule_Name + "')]"));
		//		WebElement frequency = driver.findElement(By.xpath("(//ul[@class='tr']//li//span[@title='Every week'])[1]"));
		//		Assert.assertTrue(frequency.isDisplayed(), "Weekly Frequency is not showing in List");
		//
		//		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");


	}

	@Test(priority = 8)
	public void ScheduleNew_InspectionToMonthlyFrequencyTest_TC_I8() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");
		Thread.sleep(3000);  
		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Compliance Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Monthly");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();;
		driver.navigate().refresh();
		//		WebElement ScheduledChecklist_Name = driver.findElement(By.xpath("//span[contains(text(), '" + schedule_Name + "')]"));
		//		WebElement frequency = driver.findElement(By.xpath("(//ul[@class='tr']//li//span[@title='Every month'])[1]"));
		//		Assert.assertTrue(frequency.isDisplayed(), "Weekly Frequency is not showing in List");
		//
		//		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");


	}

	@Test(priority = 9)
	public void ScheduleNew_InspectionToCustomTwoDayFrequencyTest_TC_I9() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");
		Thread.sleep(3000);  
		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Compliance Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		Thread.sleep(2000);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Custom");
		inspect.ClickOn_FrequencyTextField("2");
		inspect.SelectMeasurementDropdown("Day");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();;
		driver.navigate().refresh();
		//		WebElement ScheduledChecklist_Name = driver.findElement(By.xpath("//span[contains(text(), '" + schedule_Name + "')]"));
		//		WebElement frequency = driver.findElement(By.xpath("(//ul[@class='tr']//li//span[@title='Every 2 Days'])[1]"));
		//		Assert.assertTrue(frequency.isDisplayed(), "Every 2 Days Frequency is not showing in List");
		//
		//		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");


		//Verify created scheduled on listing
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title: " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		// ✅ Wait and assert the frequency label is visible and correct
		WebElement frequencyLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//ul[@class='tr']//li//span[@title='Every 2 Days'])[1]")
				));
		Assert.assertEquals(frequencyLabel.getAttribute("title").trim(), "Every 2 Days", "❌ Frequency is incorrect or missing");



	}

	@Test(priority = 10)
	public void ScheduleNew_InspectionToCustomOneWeekFrequencyTest_TC_I10() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		// Perform actions to create a new schedule
		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");

		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Custom");
		inspect.ClickOn_FrequencyTextField("1");
		inspect.SelectMeasurementDropdown("Week");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();

		// Refresh the page and verify the schedule
		driver.navigate().refresh();
		//		Thread.sleep(3000);
		//		WebElement ScheduledChecklist_Name = driver.findElement(By.xpath("//span[contains(text(), '" + schedule_Name + "')]"));
		//		WebElement frequencyOnManageChecklist = driver.findElement(By.xpath("(//ul[@class='tr']//li//span[@title='Every 1 Week'])[1]"));
		//
		//		// Assertions
		//		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");
		//		Assert.assertTrue(frequencyOnManageChecklist.isDisplayed(), "Every 1 Week Frequency is not showing in List");
		//
		//		// Go back and verify it is scheduled for Today
		//		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		//		footer.ClickOn_Back_Button();
		//		WebElement ScheduledChecklist_NameOnTodays = driver.findElement(By.xpath("//span[contains(text(), '" + schedule_Name + "')]"));
		//
		//		Assert.assertTrue(ScheduledChecklist_NameOnTodays.isDisplayed(), "Scheduled Checklist Name is not showing in List");




		//Verify created scheduled on listing
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title: " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		// ✅ Wait and assert the frequency label is visible and correct
		WebElement frequencyLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//ul[@class='tr']//li//span[@title='Every 1 Week'])[1]")
				));
		Assert.assertEquals(frequencyLabel.getAttribute("title").trim(), "Every 1 Week", "❌ Frequency is incorrect or missing");



	}

	@Test(priority = 11)
	public void ScheduleNew_InspectionToCustomOneMonthFrequencyTest_TC_I11() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		// Perform actions to create a new schedule
		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");

		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		Thread.sleep(2000);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Custom");
		inspect.ClickOn_FrequencyTextField("1");
		inspect.SelectMeasurementDropdown("Month");
		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();

		// Refresh the page and verify the schedule
		driver.navigate().refresh();
		//Verify created scheduled on listing
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title: " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		// ✅ Wait and assert the frequency label is visible and correct
		WebElement frequencyLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//ul[@class='tr']//li//span[@title='Every 1 Month'])[1]")
				));
		Assert.assertEquals(frequencyLabel.getAttribute("title").trim(), "Every 1 Month", "❌ Frequency is incorrect or missing");



	}

	@Test(priority = 12)
	public void ScheduleNew_InspectionToCustomDatesFrequencyTest_TC_I12() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		// Perform actions to create a new schedule
		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");

		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Custom Dates");
		inspect.ClickOn_EnterCustomDateCalendar(driver);

		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();
	
		driver.navigate().refresh();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title Verified : " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");

	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM, yyyy");
		String tomorrowDate = LocalDate.now().plusDays(1).format(formatter);
		System.out.println("Tomorrow's Date: " + tomorrowDate);
		// 2. Wait for the element whose title contains today's date
		
		WebElement frequencyLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//span[contains(@title, '" + tomorrowDate + "')]")
		));

		// 3. Verify the title actually contains today's date
		String actualTitle = frequencyLabel.getAttribute("title").trim();
		Assert.assertTrue(actualTitle.contains(tomorrowDate), "❌ Today's date (" + tomorrowDate + ") is not present in the title");
		
		
		// Go back and verify it is scheduled for Today
//				Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
//				footer.ClickOn_Back_Button();
//				WebElement ScheduledChecklist_NameOnTodays = driver.findElement(By.xpath("//span[contains(text(), '" + schedule_Name + "')]"));
//		
//				Assert.assertTrue(ScheduledChecklist_NameOnTodays.isDisplayed(), "Scheduled Checklist Name is not showing in List");


	}

	@Test(priority = 13)
	public void ScheduleNew_InspectionToCustomDaysFrequencyTest_TC_I13() throws Throwable
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
		inspect.ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page();

		// Perform actions to create a new schedule
		inspect.ClickOn_Property_Dropdown_On_Create_Schedule_Page("Thane");

		inspect.ClickOn_Inspection_Dropdown_On_Create_Schedule_Page("Ticket Redemption Checklist");
		inspect.ClickOn_Location_Dropdown_On_Create_Schedule_Page("First Floor");

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String schedule_Name = "Redemption Audit" +ran;
		inspect.ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(schedule_Name);
		//		inspect.selectTodayDate_OnStartDateOnCreateSchedule(driver);
		inspect.SelectTomorrowStartadte(driver);
		inspect.End_Date_OnCreateSchedulePage(driver);
		inspect.SelectFrequencyDropdown("Custom(Days)");
		inspect.ClickOn_MonDayCheckbox();
		inspect.ClickOn_FridayCheckbox();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((inspect.getAssignee_Dropdown_On_Create_Schedule_Page())));

		inspect.ClickOn_Assignee_Dropdown_On_Create_Schedule_Page();
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		inspect.ClickON_Create_Schedule_Button_On_Create_Schedule_Page();
		inspect.ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page();



		driver.navigate().refresh();
		
		
		//Verify created scheduled on listing
		
		WebElement scheduleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//span[starts-with(@title, 'Redemption')])[1]")
				));
		String fullTitle = scheduleElement.getAttribute("title").trim();
		System.out.println("Schedule Title: " + fullTitle);

		// Use partial match to improve reliability
		WebElement ScheduledChecklist_Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@title, '" + schedule_Name + "')]")
				));

		Assert.assertTrue(ScheduledChecklist_Name.isDisplayed(), "Scheduled Checklist Name is not showing in List");

		// ✅ Wait and assert the frequency label is visible and correct
		WebElement frequencyLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//ul[@class='tr']//li//span[@title='Monday,Friday'])[1]")
				));
		Assert.assertEquals(frequencyLabel.getAttribute("title").trim(), "Monday,Friday", "❌ Frequency is incorrect or missing");


		
		
		
		
		
		
	}




}
