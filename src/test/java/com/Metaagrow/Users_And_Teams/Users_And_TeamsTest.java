package com.Metaagrow.Users_And_Teams;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;
import com.MetaaGrow.ObjectRepository.Users_And_Teams;

public class Users_And_TeamsTest extends BaseClass{

	@Test(priority = 1)
	public void ActiveInactivePageTest_TC_U1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOnDeactivePageButton();
		user.ClickOnActive_Button();
	}

	@Test(priority = 2 )
	public void UserDownloadButtonTest_TC_U2() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_User_Download_Button();
		Thread.sleep(4000);
	}

	@Test(priority = 3)
	public void SubUserDownloadButtonTest_TC_U3()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.CLickOn_Sub_Users_Download_Button();
	}
	@Test(priority = 4)
	public void DeactivateUserTest_TC_U4() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicDeactivateButton();
		Thread.sleep(2000);
				user.Clickon_OkButtonOn_DeactivateUser_ConfirmationPage();
//		user.ClickOn_Ok_ButtonOn_AddUser_Confirmation_Page();
	}

	@Test(priority = 5)
	public void EditUserTest_TC_U5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicEditButton();
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.BackSpaceMethod("//input[@placeholder='Enter Full Name']", driver);
		//		Thread.sleep(2000);
		//		WebElement FullName = driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']"));
		//		String existingText = FullName.getAttribute("value");
		//		int length = existingText.length();
		//		for (int i = 0; i < length; i++) {
		//			FullName.sendKeys(Keys.BACK_SPACE);
		//		}
		Thread.sleep(2000);
		user.ClickOn_Full_Name_TextField("RUSHI");
		Thread.sleep(5000);
		user.CLickON_Save_Button();
		Thread.sleep(2000);
		
		boolean ClickOn_OkButtonOn_EditUser_ConfirmationPage=false;
		try {
			user.ClickOn_OkButtonOn_EditUser_ConfirmationPage();
			ClickOn_OkButtonOn_EditUser_ConfirmationPage=true;

		} catch (Exception e) {
			// TODO: handle exception
			 Alert al = driver.switchTo().alert();
	          al.dismiss();
		}
		

		String UpdatedUserName = driver.findElement(By.xpath("//SPAN[contains(text(),'RUSHI')]")).getText();
		System.out.println(UpdatedUserName);
		String ExpectedUpdatedDepartmentName="RUSHI";
		Assert.assertEquals(UpdatedUserName, ExpectedUpdatedDepartmentName, "User name is not updated as expected.");


	}
	@Test(priority = 6)
	public void ResetPasswordTest_TC_U6() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicResetPasswordButton();
		user.ClickOn_NewPasswordTextBox("Rushi@123");	
		user.ClickOn_Confirm_Password_TextField("Rushi@123");
		user.ClickOn_SaveButtonOnResetPasswordPage();
		Thread.sleep(2000);
		user.ClickOn_OkButtonOnResetPassword_ConfirmationPage();
	}
	@Test(enabled = false)
	public void CancelButton_OnResetPassword_TC_U7() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicResetPasswordButton();
		user.CLickOn_Cancel_Butoon();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Users & Teams']")).isDisplayed(), "System is not redirect us to Users & Teams main page");
	}

	@Test(enabled = false)
	public void CloseButton_OnResetPassword_TC_U8() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicResetPasswordButton();
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Close_Button();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Users & Teams']")).isDisplayed(), "System is not redirect us to Users & Teams main page");
	}
	@Test(enabled = false)
	public void SubScriptionButtonTest_TC_U9() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubscriptionlinkText();

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='User Subscription']")).isDisplayed(), "System is not redirect us to SubScription page");
	}
	@Test(enabled = false)
	public void DeactivateSubUserTest_TC_U10() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_SubUsersDynamic_ActionButton();
		user.ClickOn_DeactivateSubuserlinkText();
		Thread.sleep(2000);
		user.ClickOn_YesDeactivateButton();
		Thread.sleep(2000);

		user.Clickon_OkButtonOn_DeactivateUser_ConfirmationPage();

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//SPAN[contains(text(),'Inactive')]")).isDisplayed(), "System is not redirect us to SubScription page");
	}
	@Test(enabled = false)
	public void ActivateSubUserTest_TC_U11() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_SubUsersDynamic_ActionButton();
		user.ClickOn_ActivateSubuserlinkText();
		Thread.sleep(2000);
		user.ClickOn_YesActivateButton();
		Thread.sleep(2000);
		boolean Clickon_OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully=false;
         try {
        	 Thread.sleep(2000);
        	 user.Clickon_OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully();
        	 Clickon_OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully=true;
		} catch (Exception e) {
			 Alert al = driver.switchTo().alert();
	          al.dismiss();
		}
		

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//SPAN[contains(text(),'Active')]")).isDisplayed(), "System is not redirect us to SubScription page");
	} 
	@Test(enabled = false)
	public void EditSubUserTest_TC_U12() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_SubUsersDynamic_ActionButton();
		user.ClickOn_DynamicEditButton();
		wb.BackSpaceMethod("//input[@formcontrolname='fullName']", driver);
		user.ClickOn_Full_Name_TextField("RRRR");
		user.CLickON_Save_Button();
		Thread.sleep(2000);
		boolean ClickOn_OkButtonOn_EditUser_ConfirmationPage=false;
        try {
        	Thread.sleep(2000);
//        	driver.findElement(By.id("//button[@id='dismissOk']")).click();
        	user.ClickOn_OkButtonOn_EditUser_ConfirmationPage();
        	ClickOn_OkButtonOn_EditUser_ConfirmationPage=true;
		} catch (Exception e) {
			// TODO: handle exception
			 Alert al = driver.switchTo().alert();
	          al.dismiss();
		}
		
//		if (driver.findElement(By.xpath("//button[@id='dismissOk']")).isDisplayed()) {
//			
//			driver.findElement(By.xpath("//button[@id='dismissOk']")).click();
//		}
//		else {
//		user.ClickOn_OkButtonOn_EditUser_ConfirmationPage();
//		}


	}
	@Test(enabled = false)
	public void CancelButton_On_EditSubUserTest_TC_U13() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_SubUsersDynamic_ActionButton();
		user.ClickOn_DynamicEditButton();
		user.CLickOn_Cancel_Butoon();

	}
	@Test(enabled = false)
	public void CloseButton_On_EditSubUserTest_TC_U14() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_SubUsersDynamic_ActionButton();
		user.ClickOn_DynamicEditButton();
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Close_Button();

	}
	@Test(enabled = false)
	public void AddSubUserTest_TC_U15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_Add_Sub_User_Icon();
		user.ClickOn_SubUserFullNameTextBox("Rushikesh1");
		user.ClickoN_SubUserMobileNoTextBox("123654");
		user.ClickOn_SubUserDesignationTextBox("Technical");
		user.ClickOn_AddUserButton_Sub_Users_DetailsPage();
		Thread.sleep(3000);
		user.ClickOn_Ok_ButtonOn_AddUser_Confirmation_Page();
//		driver.navigate().refresh();
	}
	@Test(enabled = false)
	public void CancelButton_OnAddSubUserTest_TC_U16() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOn_DynamicActionButton();
		user.ClickOn_DynamicSubUserLinkText();
		user.ClickOn_Add_Sub_User_Icon();
		Thread.sleep(2000);
		user.Clickon_CancelButtonOn_Sub_Users_DetailsPage();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Sub-Users']")).isDisplayed(),  "System is not redirect us to Sub Users Page");
	}
	@Test(priority = 17)
	public void FilterByUserTest_TC_U17() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.CLickOnFilter_Tab();
		user.ClickOn_Select_UserName_filter();
		user.ClickOn_FilterBy_UserName_SearchBox("Biradar");
		driver.findElement(By.xpath("//a[normalize-space()='Biradar']")).click();
		user.ClickOn_Filter_Apply_Button();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(text(),'Biradar')])[2]")).isDisplayed(), "Filtered User is not Displayed");


	}
	@Test(enabled = false)
	public void FilterByPropertyTest_TC_U18() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.CLickOnFilter_Tab();
		user.ClickOn_Select_UserName_filter();
		user.CLickOn_propertyFilter();
		driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
		user.ClickOn_Filter_Apply_Button();
		Thread.sleep(2000);
		String propertylist = driver.findElement(By.xpath("(//span[@title='ANDHERI'][normalize-space()='ANDHERI'])[1]")).getText();
		String expprpty="ANDHERI";
		Assert.assertTrue(propertylist.contains(expprpty), "Filtered User is not Displayed");
	}
	@Test(priority = 19)
	public void FilterByUserRoleTest_TC_U19() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.CLickOnFilter_Tab();
		user.CLickOn_User_Role_Filter();
		driver.findElement(By.xpath("//a[.='User']")).click();
		user.ClickOn_Filter_Apply_Button();
		String rolelist = driver.findElement(By.xpath("//span[contains(text(),'User')]")).getText();
		System.out.println(rolelist);
		String exprole="User";
		Assert.assertTrue(rolelist.contains(exprole), "Filtered User is not Displayed");

	}
	@Test(enabled = false)
	public void ActivePageClearFilterTest_TC_U20() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.CLickOnFilter_Tab();
		user.CLickOn_User_Role_Filter();
		driver.findElement(By.xpath("//a[.='User']")).click();
		user.ClickOn_Filter_Apply_Button();
		String rolelist = driver.findElement(By.xpath("//span[contains(text(),'User')]")).getText();
		System.out.println(rolelist);
		String exprole="User";
		Assert.assertTrue(rolelist.contains(exprole), "Filtered User is not Displayed");
		user.CLickOnFilter_Tab();
		user.ClickOn_Filter_Clear_Button();
	}
	@Test(priority = 21)
	public void ActivePageInactiveUserFilterTest_TC_U21() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();
		Users_And_Teams user = new Users_And_Teams(driver);
		user.CLickOnFilter_Tab();
		user.ClickOn_Select_UserName_filter();
		user.ClickOn_FilterBy_UserName_SearchBox("Ravan");
		List<WebElement> matchingElements = driver.findElements(By.xpath("//a[contains(text(),'Ravan')]"));

		// Check if the list is empty, indicating that the element is not present
		if (matchingElements.isEmpty()) {
			System.out.println("The searched User is not showing in the filter.");

		} else {
			System.out.println("The searched User is still showing in the filter.");

		}
	}
	@Test(priority = 22)
	public void DeactivePageActiveUserFilterTest_TC_U22() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();

		Users_And_Teams user = new Users_And_Teams(driver);
		user.ClickOnDeactivePageButton();
		user.CLickOnFilter_Tab();
		user.ClickOn_Select_UserName_filter();
		user.ClickOn_FilterBy_UserName_SearchBox("Rushi");
		List<WebElement> matchingElements = driver.findElements(By.xpath("//a[contains(text(),'Rushi')]"));

		// Check if the list is empty, indicating that the element is not present
		if (matchingElements.isEmpty()) {
			System.out.println("The searched User is not showing in the filter.");

		} else {
			System.out.println("The searched User is still showing in the filter.");

		}
	}
		@Test(priority = 23)
		public void DeactiavtePageUserNameFilterTest_TC_U23()
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();

			Users_And_Teams user = new Users_And_Teams(driver);
			user.ClickOnDeactivePageButton();
			user.CLickOnFilter_Tab();
			user.ClickOn_Select_UserName_filter();
			user.ClickOn_FilterBy_UserName_SearchBox("Ravan");	
					driver.findElement(By.xpath("(//a[normalize-space()='Ravan'])[1]")).click();
					user.ClickOn_Filter_Apply_Button();
			Assert.assertTrue(driver.findElement(By.xpath("(//span[contains(text(),'Ravan')])[2]")).isDisplayed(), "Filtered User is not Displayed");

		}

		@Test(priority = 24)
		public void DeactivatePropertyFilterTest_TC_U24()
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();

			Users_And_Teams user = new Users_And_Teams(driver);
			user.ClickOnDeactivePageButton();
			user.CLickOnFilter_Tab();
			user.CLickOn_propertyFilter();
			driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
			user.ClickOn_Filter_Apply_Button();
			 List<WebElement> matchingElements = driver.findElements(By.xpath("//span[contains(text(),'ANDHERI')]"));

			    // Check if the list is empty, indicating that the element is not present
			    if (matchingElements.isEmpty()) {
			        System.out.println("The searched property is not showing in the filter.");
		
			    } else {
			        System.out.println("The searched property is still showing in the filter.");
			     
			    }
//			Assert.assertTrue(driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).isDisplayed(), "Property is not display");
		}
		
		@Test(priority = 25)
		public void DeactivateUserRoleFilterTest_TC_U25()
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();

			Users_And_Teams user = new Users_And_Teams(driver);
			user.ClickOnDeactivePageButton();
			user.CLickOnFilter_Tab();
			user.CLickOn_User_Role_Filter();
			user.ClickOn_Filter_Apply_Button();
			String rolelist = driver.findElement(By.xpath("//span[contains(text(),'User')]")).getText();
			System.out.println(rolelist);
			String exprole="User";
			Assert.assertTrue(rolelist.contains(exprole), "Filtered User is not Displayed");
			user.CLickOnFilter_Tab();
			
		}
		@Test(enabled = false)
		public void ShowRowsDropdownTest_TC_U26()
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();
		     Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		     footer.ClickOn_Show_Rows_Dropdown("30");
		     
		 	String selectedOption = footer.getselectedOptionsFromDropdown();
		    Assert.assertEquals(selectedOption, "30", "Expected Option is Not selected from the Show Rows dropdown");
		
		}
		
		@Test(enabled = false)
		public void Right_and_Left_SlideArrowTest_TC_U27() throws Throwable
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();
			Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
			Thread.sleep(2000);
			footer.ClickOn_Right_Slide_Arrow();
			Thread.sleep(2000);
			footer.ClickOn_Left_Slide_Arrow();
			Thread.sleep(2000);
			
		}

		@Test(enabled = false)
		public void JumpToDropdownTest_TC_U28() throws Throwable
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();

			Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);

			footer.ClickOn_Jump_To_Page_Dropdown_By_VisibleText("2");
			WebElement drpElement = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[2]"));
			Select drp = new Select(drpElement);
			WebElement selectedOption = drp.getFirstSelectedOption();
			String selectedText = selectedOption.getText();
		Thread.sleep(1000);
		Assert.assertEquals( "2",selectedText,  "Expected Option is Not selected from the Show Rows dropdown");
		}
		
		@Test
		public void CeateSingleUserTest() throws Throwable
		{
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
					    
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
					    
			Setup sp = new Setup(driver);
			sp.ClickOnUsers_And_TeamsLinkText();

			// Locate and click the "Add User" button
			By addUserButton = By.xpath("//img[@alt='Reports Add']");
			WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addUserButton));
			Thread.sleep(3000);
			addButton.click();

			// Wait for the dropdown to be visible
			By singleUserOption = By.xpath("//ul[contains(@class, 'status-menu') and contains(@style, 'display: block')]//a[text()='Single']");

			// Retry mechanism for stale element exception
			int retries = 3;
			for (int i = 0; i < retries; i++) {
			    try {
			        WebElement singleOption = wait.until(
			            ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(singleUserOption))
			        );
			        singleOption.click();
			        System.out.println("Successfully clicked on 'Single' option.");
			        break; // Exit loop if click succeeds
			    } catch (StaleElementReferenceException e) {
			        System.out.println("Retry " + (i + 1) + ": StaleElementReferenceException occurred. Retrying...");
			    }}}
		

}
		
	
