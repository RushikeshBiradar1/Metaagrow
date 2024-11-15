package com.Metaagrow.Roles_and_Permissions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Roles_And_Permissions;
import com.MetaaGrow.ObjectRepository.Setup;

public class Roles_And_PermissionsTest extends BaseClass{
	
	@Test(priority = 1)
	public void ActiveInactivePageTest_TC_R1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOnInactiveButton();
	     rp.ClickOnActiveButton();
	}

	@Test(priority = 2)
	public void DeactivateRolesTest_TC_R2() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.ClickOn_DynamicDeactivateButton();
	     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
	}
	@Test(priority = 3)
	public void ActivateRoleTest_TC_R3() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOnInactiveButton();
	     Thread.sleep(2000);
	     rp.ClickOn_dynamicActionButton();
	     Thread.sleep(2000);
	     rp.ClickOn_dynamicActivateButton();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();

	}
	@Test(priority = 4)
	public void EditRoleTest_TC_R4() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.clickon_DynamicEditButton();
			
			Thread.sleep(2000);
	     rp.ClickOn_Original_Type_Dropdown_visibleText("Property Admin");
			Thread.sleep(2000);
	     wb.BackSpaceMethod("//input[@placeholder='Enter Role Name']", driver);
	     Thread.sleep(2000);
	     rp.ClickOnRoleName_TextField("RRR");
			
	     Thread.sleep(2000);
	     rp.ClickOn_Save_Button_On_Create_Role_Page();
	     Thread.sleep(2000);
	     rp.ClickOn_Ok_Button_On_Confirmation_Page();
	   String UpdatedRoleName = driver.findElement(By.xpath("//span[normalize-space()='RRR']")).getText();
	   String ExpectedROleName="RRR";
	   Assert.assertEquals(UpdatedRoleName, ExpectedROleName, "Role name is not updated as expected.");
	    
	     
	}
	@Test(enabled = false)
	public void EditRolecancelButtontest_TC_R5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.clickon_DynamicEditButton();
	     Thread.sleep(2000);
	     rp.ClickOn_CancelButton();
	     Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Roles & Permissions']")).isDisplayed(), "user is not reflected to Roles & Permissions Page");
	}
	@Test(enabled = false)
	public void EditRolecloseButtontest_TC_R6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.clickon_DynamicEditButton();
	     Thread.sleep(2000);
	   Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
	   footer.ClickOn_Close_Button();
	     Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Roles & Permissions']")).isDisplayed(), "user is not reflected to Roles & Permissions Page");
	}
	@Test(priority = 7)
	public void ViewPermissionPageTest_TC_R7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.ClickOn_DynamicViewPermission();
	     Assert.assertTrue(driver.findElement(By.xpath("//p[normalize-space()='You can configure permissions']")).isDisplayed(), "user is not reflected to Roles & Permissions Page");


	     Thread.sleep(2000);

	     Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
	     footer.ClickOn_Back_Button();
	}
	@Test(priority = 8)
	public void GiveandRemovePermissionTest_TC_R8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.ClickOn_DynamicViewPermission();
	     Thread.sleep(1000);
	     rp.ClickOn_InspectionPermissionTab();
	     Thread.sleep(1000);
	     rp.ClickOn_InspectionPermissionAllowTab();
	     rp.ClickOn_InspectionPermissionAllowTab();
	     rp.ClickOn_TicketsPermissionTab();
	     Thread.sleep(1000);
	     rp.ClickOn_TicketsPermissionAllowTab();
	     rp.ClickOn_TicketsPermissionAllowTab();
	     rp.ClickOn_AssetsPermissionTab();
	     Thread.sleep(1000);
	     rp.clickOn_AssetsPermissionAllowTab();
	     rp.clickOn_AssetsPermissionAllowTab();
	     rp.ClickOn_Preventive_MaintenanceTab_PermissionTab();
	     Thread.sleep(1000);
	     rp.ClickOn_Preventive_MaintenanceTab_PermissionAllowTab();
	     rp.ClickOn_Preventive_MaintenanceTab_PermissionAllowTab();
	     rp.ClickOn_Parts_and_Permission_PermissionTab();
	     Thread.sleep(1000);
	     rp.ClickON_Parts_and_Permission_PermissionAllowTab();
	     rp.ClickON_Parts_and_Permission_PermissionAllowTab();
	     rp.ClickOn_MeterPermissionTab();
	     Thread.sleep(1000);
	     rp.CLickOn_MeterPermissionAllowTab();
	     rp.CLickOn_MeterPermissionAllowTab();
	     rp.ClickOn_DashboardPermissionTab();
	     Thread.sleep(1000);
	     rp.ClickOn_DashboardPermissionAllowTab();
	     rp.ClickOn_DashboardPermissionAllowTab();
	     rp.ClickOn_ChatPermissionTab();
	     Thread.sleep(1000);
	     rp.ClickOn_ChatPermissionAllowTab();
	     rp.ClickOn_ChatPermissionAllowTab();
	     Thread.sleep(2000);
	     Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
	     footer.ClickOn_Back_Button();
	}
	@Test(enabled = false)
	public void BackButtonOn_ViewPermissionsPageTest_Tc_R9()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOn_dynamicActionButton();
	     rp.ClickOn_DynamicViewPermission();
	     rp.ClickOn_BackBUtton();
	}
	@Test(priority = 10)
	public void AddNewRoleTest_TC_R10() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOnAddRoleButton();
	    Java_Utility java = new Java_Utility();
	    int random = java.getRandomNum();
	    String ROlename = "Manager"+random;
	     rp.ClickOnRoleName_TextField(ROlename);
	     rp.ClickOn_Original_Type_Dropdown_visibleText("User");
	     rp.ClickOn_RoleType_Dropdown_visibleText("Mobile App");
	     rp.ClickOn_Save_Button_On_Create_Role_Page();
	     Thread.sleep(2000);
	     rp.ClickOn_Ok_Button_On_Confirmation_Page();
	     rp.ClickOnActiveButton();
	     String act = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
        String exp=ROlename;
	     Assert.assertTrue(act.contains(exp), "Role is not added");

	     
	}
	@Test(enabled = false)
	public void CancelButton_OnAddNewRolePageTest_TC_R11()
	{

		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOnAddRoleButton();
	     rp.ClickOn_CancelButton();
	     Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Roles & Permissions']")).isDisplayed(), "user is not reflected to Roles & Permissions Page");

	}
	@Test(enabled = false)
	public void CloseButton_OnAddNewRolePageTest_TC_R12()
	{

		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     rp.ClickOnAddRoleButton();
	     Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
	     footer.ClickOn_Close_Button();
	     Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Roles & Permissions']")).isDisplayed(), "user is not reflected to Roles & Permissions Page");

	}
	@Test(enabled = false)
	public void ShowRowsDropdownTest_TC_R13() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
	    Setup sp = new Setup(driver);
	    sp.ClickOnRoles_And_PermissionsLinkText();
//	     Roles_And_Permissions rp = new Roles_And_Permissions(driver);
	     Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
			footer.ClickOn_Show_Rows_Dropdown("20");
			
			String selectedOption = footer.getselectedOptionsFromDropdown();
		    Assert.assertEquals(selectedOption, "20", "Expected Option is Not selected from the Show Rows dropdown");
	}
	@Test(enabled = false)
	public void Right_and_Left_SlideArrowTest_TC_R14() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
        lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
         sp.ClickOnRoles_And_PermissionsLinkText();
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		Thread.sleep(2000);
		footer.ClickOn_Right_Slide_Arrow();
		Thread.sleep(2000);
		footer.ClickOn_Left_Slide_Arrow();

	}
	@Test(enabled = false)
	public void JumpToDropdownTest_TC_R15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);;
		HomePage hp = new HomePage(driver);
		driver.manage().window().maximize();
		hp.ClickOnSetupLinkText(driver);
		
		Setup sp = new Setup(driver);
		sp.ClickOnRoles_And_PermissionsLinkText();

		Footer_and_Header_Common foote = new Footer_and_Header_Common(driver);
	    foote.ClickOn_Jump_To_Page_Dropdown_By_VisibleText("2");
	    WebElement drpElement = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[2]"));
	    Select drp = new Select(drpElement);
	    WebElement selectedOption = drp.getFirstSelectedOption();
	    String selectedText = selectedOption.getText();
        Thread.sleep(1000);
        Assert.assertEquals( "2",selectedText,  "Expected Option is Not selected from the Show Rows dropdown");

	}
	
}
