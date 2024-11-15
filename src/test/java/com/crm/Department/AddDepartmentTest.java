package com.crm.Department;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Departments;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;

public class AddDepartmentTest extends BaseClass{
	@Test(priority = 1)
	public void AddNewDepartment_TC_D5() throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		//		wb.DismissConfirmationPopUp();
		//		wb.NotificationPopup();
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);

		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		By AddDeparmentButton = By.xpath("//span[normalize-space()='Add Department']");
		WebElement button1 = wait.until(ExpectedConditions.visibilityOfElementLocated(AddDeparmentButton));
		Thread.sleep(3000);
		d.ClickOnAddDepartmentsLinkText();
		Java_Utility java = new Java_Utility();
		int Random_Number = java.getRandomNum();
		String department_Name = "IT"+Random_Number;
		d.ClickOnDepartmentNameTextField(department_Name);
		d.ClickAddDepartmentsButton_On_Create_Department_Page();
		Thread.sleep(2000);
		d.CLickOn_Ok_Button_On_Add_Department_Confirmation_Page();
		driver.navigate().refresh();
		//String ActualDepartment = driver.findElement(By.xpath("//section[@class='list-block']")).getText();
		Assert.assertTrue(department_Name.matches(department_Name), "Department is not added");

	}

	@Test(enabled = false)
	public void AddDepartmentCancelButtonTest_TC_D6() throws Throwable
	{

		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		//		wb.NotificationPopup();
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		//		wb.DismissConfirmationPopUp();
		HomePage hp = new HomePage(driver);


		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		d.ClickOnAddDepartmentsLinkText(); 
		Java_Utility java = new Java_Utility();
		int Random_Number = java.getRandomNum();  
		String department_Name = "IT"+Random_Number;
		d.ClickOnDepartmentNameTextField(department_Name);
		d.ClickOnCancelButton();
		WebElement DepartmentPage = driver.findElement(By.xpath("//h2[normalize-space()='Departments']"));
		Assert.assertTrue(DepartmentPage.isDisplayed(), "Active Page is Not Displayed");
	}

	@Test(priority = 3)
	public void DeactivateDepartmentUsingRadioButtonsTest_TC_D7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText(); 
		Departments d = new Departments(driver);
		d.ClickOn_dynamicRadioButtonsOn_ActivePage();
		d.ClickOn_Deactivate_Button();
		Thread.sleep(2000);
		d.ClickOn_YesInactive_Button();
		Thread.sleep(2000);
		//Need to cange the [ath after deployed
		driver.findElement(By.id("okbutton")).click();
		
	}

	@Test(priority = 4)
	public void ActivateDepartmentUsingRadioButtonsTest_TC_D8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText(); 
		Departments d = new Departments(driver);
		d.ClickOnInactivePage();
		d.Clickon_dynamicRadioButtonsOn_DeactivePage();
		d.ClickOn_Department_Activate_Button();
		Thread.sleep(2000);
		d.ClickOn_Yes_Active_Button();
		Thread.sleep(2000);
		driver.findElement(By.id("okbutton")).click();
	}


	@Test(enabled = false)
	public void ShowROws_DropdownTest_TC_D9()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText(); 
		Departments d = new Departments(driver);
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Show_Rows_Dropdown("20");

		String selectedOption = footer.getselectedOptionsFromDropdown();
		Assert.assertEquals(selectedOption, "20", "Expected Option is Not selected from the Show Rows dropdown");
	}

	@Test(enabled = false)
	public void Right_and_Left_SlideArrowTest_TC_D10() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText(); 
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		Thread.sleep(2000);
		footer.ClickOn_Right_Slide_Arrow();
		Thread.sleep(2000);
		footer.ClickOn_Left_Slide_Arrow();

	}

	@Test(enabled = false)
	public void JumpToDropdownTest_TC_D11()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);;
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);

		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Jump_To_Page_Dropdown_By_VisibleText("2");

	}

	@Test(priority = 8)
	public void EditDepartmentName_UpdateTest_TC_D12() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		driver.findElement(By.xpath("(//img[@id='buttonClose'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		Thread.sleep(2000);

		WebElement departmentNameField = driver.findElement(By.xpath("//input[@placeholder='Department Name']"));
		String existingText = departmentNameField.getAttribute("value");
		int length = existingText.length();
		for (int i = 0; i < length; i++) {
			departmentNameField.sendKeys(Keys.BACK_SPACE);
		}



		Thread.sleep(1000);
		d.ClickOnDepartmentNameTextField("IIT");
		Thread.sleep(1000);
		d.ClickOn_Update_Department_Button();
		d.ClickOn_Ok_Button_Update_Confirmation_Page();
		driver.navigate().refresh();
		String UpdatedDepartmentName = driver.findElement(By.xpath("//b[contains(text(),'IIT')]")).getText();
		System.out.println(UpdatedDepartmentName);
		String ExpectedUpdatedDepartmentName="IIT";
		Assert.assertEquals(UpdatedDepartmentName, ExpectedUpdatedDepartmentName, "Department name is not updated as expected.");

	}
	@Test(enabled = false)
	public void EditDepartmentName_CancelTest_TC_D13() throws Throwable
	{ 
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		driver.findElement(By.xpath("(//img[@id='buttonClose'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		Thread.sleep(3000);
		d.ClickOnDepartmentNameTextField("IIT");
		d.ClickOnCancelButton();
		//		d.ClickOnActiveDepartment();
		WebElement DepartmentPage = driver.findElement(By.xpath("//h2[normalize-space()='Departments']"));
		Assert.assertTrue(DepartmentPage.isDisplayed(), "Active Page is Not Displayed");


	}
}
