package com.Metaagrow.Surveys_and_Feedback;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;
import com.MetaaGrow.ObjectRepository.Surveys_And_Feedback;

public class Survey_and_FeedbackTest extends BaseClass {
	@Test(priority = 9)
	public void EditSurveyAllFieldsTest_TC_S9() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);
		survey.ClickOn_ActionButton();
		survey.ClickOn_EditSurveyLinkText();
		survey.Clear_Survey_Name_Text_Field();


		wb.BackSpaceMethod("//input[@placeholder='Survey Name']", driver);
		Thread.sleep(2000);
		survey.ClickOn_Survey_Name_Text_Field("Auto Test");
		survey.ClickOn_UpdateSurveyButton();
//		survey.ClickOn_Create_button_on_create_survey_page();
		Thread.sleep(1000);
		survey.Clickon_OkButton_OnEditSurveyConfirmationPage();
	}
	@Test(priority = 10)
	public void CancelButtonOnEditPageTest_TC_S10() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);
		//		survey.ClickOn_Create_Survey_Button();
		survey.ClickOn_ActionButton();
		survey.ClickOn_EditSurveyLinkText();
		//		WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space()='Cancel']"));
		//		wb.scrollTillAParticularWebElement(driver, cancelButton);
		Thread.sleep(1000);
		survey.ClickOn_cancel_button_on_create_survey_page();

		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");



	}
	@Test(priority = 11)
	public void CloseButtonOnEditPageTest_TC_S11() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);

		survey.ClickOn_ActionButton();
		survey.ClickOn_EditSurveyLinkText();

		survey.ClickOn_Close_Button_On_Create_SurveyPage();
		Thread.sleep(1000);
		//		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']")).isDisplayed(), "User not reflected on Survey listing page");
		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");


	}
	@Test(enabled=false)
	public void ViewQuestionEditPageTest_TC_S12() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);

		survey.ClickOn_ActionButton();
		survey.ClickOn_surveyViewQuestionLinkText();


	}
	//This functionoilty is removed of view question from action button
	@Test(enabled =false)
	public void CancelButtonOn_ViewQuestionEditPageTest_TC_S13() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);

		survey.ClickOn_ActionButton();
		survey.ClickOn_surveyViewQuestionLinkText();
		survey.ClickOn_cancel_button_on_create_survey_page();
		//    AssertJUnit.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']")).isDisplayed(), "User not reflected to Main Page");
		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
	}
	//This functionoilty is removed of view question from action button
		@Test(enabled =false)
	public void CloseButtonOn_ViewQuestionEditPageTest_TC_S14() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);

		survey.ClickOn_ActionButton();
		survey.ClickOn_surveyViewQuestionLinkText();
		survey.ClickOn_Close_Button_On_Create_SurveyPage();
		//    AssertJUnit.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']")).isDisplayed(), "User not reflected to Main Page");
		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
	}

		//This functionoilty is removed of view question from action button
				@Test(enabled =false)
	public void ViewResponseDownloadAsPDFButtonTest_TC_S15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);

		survey.ClickOn_ActionButton();
		survey.ClickON_SurveyViewResponsesLinkText();
		survey.ClickOn_DownloadButtonOnViewResponsesPage();
		survey.ClickOn_AsPdfButton();
		wb.windowSwitching(driver);
	}

	@Test(priority = 16)
	public void ViewQRPageTest_TC_S16() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);

		survey.ClickOn_ActionButton();
		survey.ClickOn_surveyViewQRCodeLinkText();
		survey.ClickOn_Close_Button_On_Create_SurveyPage();
		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
	}

	@Test(priority = 17)
	public void CreateSurveyTest_TC_S17() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);
		survey.ClickOn_Create_Survey_Button();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String SurveyName="Survey"+ran;
		survey.ClickOn_Survey_Name_Text_Field(SurveyName);
		survey.Select_property_dropdown_ByVisibleText("Thane");

		survey.ClickOn_Section_Name_TextField("Arcade Zone");

	

	    // -------- Question 1 --------
	    survey.ClickOn_Question_Text_Field("Q 1");
	    survey.selectResponseTypeByIndex(0, "Rating 1 to 5");
	    survey.ClickOn_Add_Question_Icon();

	    // -------- Question 2 --------
	    survey.ClickOn_Question2_TextField("Q 2");
	    survey.selectResponseTypeByIndex(1, "Description Box");
	    survey.ClickOn_Add_Question_Icon();

	    // -------- Question 3 --------
	 //   survey.ClickOn_Question_Text_Field("Q 3");
	    driver.findElement(By.xpath("(//input[@placeholder='Question'])[3]")).sendKeys("q3");
	    survey.selectResponseTypeByIndex(2, "Yes/No");
	    survey.ClickOn_Add_Question_Icon();

	    // -------- Question 4 --------
//	    survey.ClickOn_Question_Text_Field("Q 4");
	    driver.findElement(By.xpath("(//input[@placeholder='Question'])[4]")).sendKeys("q4");

	    survey.selectResponseTypeByIndex(3, "Multiple Choice");
	    
	 // ---------- Add options for Multiple Choice ----------
	    WebElement optionsTextArea = driver.findElement(By.xpath("//textarea[@placeholder='Enter Options']"));
	    WebElement addResponseButton = driver.findElement(By.xpath("//div[contains(@class,'img-box') and contains(.,'Add Response')]"));

	    // Add "Yes"
	    optionsTextArea.clear();
	    optionsTextArea.sendKeys("Yes");
	    addResponseButton.click();

	    // Add "No"
	    optionsTextArea.clear();
	    optionsTextArea.sendKeys("No");
	    addResponseButton.click();
	    survey.ClickOn_Add_Question_Icon();

	    // -------- Question 5 --------
	 //  survey.ClickOn_Question_Text_Field("Q 5");
	    driver.findElement(By.xpath("(//input[@placeholder='Question'])[5]")).sendKeys("q3");

	  survey.selectResponseTypeByIndex(4, "Star ratings");
		
		
		survey.ClickOn_Create_button_on_create_survey_page();

		survey.Clickon_OkButton_OnEditSurveyConfirmationPage();
		driver.navigate().refresh();

		//Verify it survey is created or not
		try {
			// Create a WebDriverWait with a maximum wait time of 5 seconds
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

			// Wait until the element is visible
			WebElement Textsurvey = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='" + SurveyName + "']")));

			// Assert that the element is displayed
			Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
		} catch (NoSuchElementException e) {
			Assert.fail("The survey is not present on the page.");
		}
	}

	@Test(enabled=false)
	public void CreateFeedbackTest_TC_S18() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		Thread.sleep(1000);
		survey.ClickOn_Create_Survey_Button();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String FeedbackName="Feedback"+ran;
		survey.ClickOn_Survey_Name_Text_Field(FeedbackName);
		survey.Select_property_dropdown_ByVisibleText("Thane");
		survey.ClickOn_Location_Text_Field("First Floor");
		survey.ClickOn_email_Mandatory_CheckBox();
		survey.ClickOn_Mobile_Mandatory_CheckBox();
		survey.ClickOn_Slider_Of_Single_And_Multiple_Question();
		survey.ClickOn_Single_Question_TExtField_For_Feedback("Question Test 1");
		survey.ClickOn_Create_button_on_create_survey_page();

		survey.Clickon_OkButton_OnEditSurveyConfirmationPage();
		driver.navigate().refresh();
		survey.ClickOn_Feedback_Button();

		//Verify it Feedback is created or not
		try {
			// Create a WebDriverWait with a maximum wait time of 5 seconds
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

			// Wait until the element is visible
			WebElement Textsurvey = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@title='" + FeedbackName + "']")));

			// Assert that the element is displayed
			Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
		} catch (NoSuchElementException e) {
			Assert.fail("The survey is not present on the page.");
		}
	}
	@Test(priority = 19)
	public void CreateFeedback_and_FeedbackPage_CancelButtonTest_TC_S19() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		survey.ClickOn_Create_Survey_Button();
		survey.ClickOn_cancel_button_on_create_survey_page();
		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
	}
	@Test(priority = 20)
	public void CreateFeedback_and_FeedbackPage_CloseButtonTest_TC_S20() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		survey.ClickOn_Create_Survey_Button();
		survey.ClickOn_Close_Button_On_Create_SurveyPage();
		WebElement Textsurvey = driver.findElement(By.xpath("//h2[normalize-space()='Surveys & Feedback']"));
		Assert.assertTrue(Textsurvey.isDisplayed(), "User not reflected on Survey listing page");
	}
	
	@Test(enabled=false)
	public void ShowRowsDropdownTest_TC_S21()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Show_Rows_Dropdown("20");

		String selectedOption = footer.getselectedOptionsFromDropdown();
		AssertJUnit.assertEquals(selectedOption, "20", "Expected Option is Not selected from the Show Rows dropdown");

	}

	@Test(priority = 22)
	public void Right_and_Left_SlideArrowTest_TC_U22() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		Thread.sleep(2000);
		//		WebElement r = driver.findElement(By.xpath("(//img[@alt='Next'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		try {
			WebElement r = driver.findElement(By.xpath("(//img[@alt='Next'])[1]"));

			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(r));

			// Scroll to the element if needed
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", r);

			// Click the element
			r.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
		}
		//		footer.ClickOn_Right_Slide_Arrow();
		//		Thread.sleep(2000);
		footer.ClickOn_Left_Slide_Arrow();
		Thread.sleep(2000);

	}

	@Test(enabled = false)
	public void JumpToDropdownTest_TC_U23() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();

		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);

		footer.ClickOn_Jump_To_Page_Dropdown_By_VisibleText("2");
		WebElement drpElement = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[2]"));
		Select drp = new Select(drpElement);
		WebElement selectedOption = drp.getFirstSelectedOption();
		String selectedText = selectedOption.getText();
		Thread.sleep(1000);
		AssertJUnit.assertEquals( "2",selectedText,  "Expected Option is Not selected from the Show Rows dropdown");



	}
	
	@Test()
	public void FilterByTitle() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		survey.ClickOn_Filter_Icon();
		survey.clickOn_FilterByTitle("Center Survey");
		survey.ClickOn_Apply_Filter_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@title='Center Survey']")).isDisplayed(), "Center Survey is not showing after applying filter");

		
		
	}

}
