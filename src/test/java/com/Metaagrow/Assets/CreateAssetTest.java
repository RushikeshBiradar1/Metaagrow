package com.Metaagrow.Assets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Assets;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

public class CreateAssetTest extends BaseClass{

	@Test(priority = 1)
	public void AddAssetwithMandatoryFieldTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_Add_Asset_Button();
		ast.Clickon_Add_Single_Asset_Button();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String AssetName = "Magic Arrow"+ran;
		ast.ClickOn_Asset_Name_TextBox(AssetName);
		ast.ClickOn_Category_Name_TextBox("Arcade");
		ast.SelectTodaysPurchaseDate(driver);
		ast.ClickOn_Property_Dropdown_By_VisibleText("Thane");
		ast.ClickOn_Location_Dropdown_By_VisibleText("First Floor");
		ast.ClickOn_Next_Button();
		ast.ClickOn_Create_Asset_Button();
		ast.ClickOn_Ok_Button_On_Confirmation_Page();
		WebElement CreatedAssetXpath = driver.findElement(By.xpath("//span[contains(@title, '"+AssetName+"')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.visibilityOf(CreatedAssetXpath));
			Assert.assertTrue(CreatedAssetXpath.isDisplayed(), "Created Asset Name is not Showing on Listing");
		} catch (TimeoutException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}
	}

	@Test(priority = 2)
	public void CreateAssetWithAllField() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_Add_Asset_Button();
		ast.Clickon_Add_Single_Asset_Button();

		// General Details

		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		String AssetName = "Magic Arrow"+ran;
		ast.ClickOn_Asset_Name_TextBox(AssetName);
		ast.ClickOn_Category_Name_TextBox("Arcade");
		ast.SelectTodaysPurchaseDate(driver);
		ast.ClickOn_Condition_Dropdown_By_VisibleText("New");
		ast.ClickOn_Spec_Rating_TextBox("5");
		ast.SelectTodaysPlacedInServiceDate(driver);
		ast.ClickOn_Vendor_Name_on_General_DetailsPage("Rushikesh");
		ast.ClickOn_PAT_Dropdown_By_VisibleText("Yes");
		ast.ClickOn_SrNo_TextBox("Magic654B7T89");
		ast.ClickOn_Manufacturer_TextBox("Biradar");
		ast.ClickOn_ManufacturerEmailId("rushikesh@metaagrow.com");
		ast.ClickAfterenteringManufacturerEmailId();
		ast.SelecctNotificationDropdown_OnAddAssetsForm("Yes");
		ast.ClickOn_Model_TExtBox("Magic1809");
		ast.ClickOn_Asset_Tag_No_TextBox("MAGIC3541");
		ast.ClickOn_Property_Dropdown_By_VisibleText("Thane");
		ast.ClickOn_Location_Dropdown_By_VisibleText("First Floor");
		ast.ClickOn_Ownership("First-Owner");
		ast.ClickOn_PurchasePrice_OnAddAssetsForm("29333");
		ast.Select_TPI_Dropdown_OnAddAssetsForm("Yes");

		//Scroll
		wb.scrolldown(driver, 500);
		// Warranty Details

		ast.ClickOn_Add_Warranty_Details_Icon();
		ast.ClickOn_Vendor_Name_On_Warranty_DetailsPage("Rock");
		ast.ClickOn_Contact_Person_TextBox_On_Warranty_DetailsPage("Buffet");
		ast.ClickOn_Contact_No_On_Warranty_DetailsPage("+1536842255");
		ast.ClickOn_Altername_No_On_Warranty_DetailsPage("+6325542545");
		ast.ClickOn_Email_On_Warranty_DetailsPage("rushikesh@metaagrow.com");
		ast.ClickOn_No_of_Services_On_Warranty_DetailsPage("15");
		ast.WarrantyStartDate(driver);
		ast.WarrantyEndDate(driver);

		// AMC Details
		ast.ClickOn_Add_AMC_Drtais_ICON();
		ast.ClickOn_Vendor_Name_On_AMC_DetailsPage("John");
		ast.ClickOn_Contact_No_On_AMC_DetailsPage("Lichard");
		ast.ClickOn_Contact_No_On_AMC_DetailsPage("+65235351");
		ast.ClickOn_Altername_No_On_AMC_DetailsPage("+91365126545");
		ast.ClickOn_Email__On_AMC_DetailsPage("rushikesh@metaagrow.com");
		ast.ClickOn_AMC_Type_Dropdown_By_VisibleText("Comprehensive");
		ast.ClickOn_No_Of_Services_On_AMC_DetailsPage("5");
		ast.AMCStartDate(driver);
		ast.AMCEndDate(driver);
		Thread.sleep(9000);
		//confirmation process
		ast.ClickOn_Next_Button();
		ast.ClickOn_Create_Asset_Button();
		ast.ClickOn_Ok_Button_On_Confirmation_Page();
		WebElement CreatedAssetXpath = driver.findElement(By.xpath("//span[contains(@title, '"+AssetName+"')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.visibilityOf(CreatedAssetXpath));
			Assert.assertTrue(CreatedAssetXpath.isDisplayed(), "Created Asset Name is not Showing on Listing");
		} catch (TimeoutException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}

	}


	@Test(priority = 3)
	public void AssetQRTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_QR_Button();
		driver.findElement(By.xpath("//label[normalize-space()='Speed Driver 1']")).click();
		ast.ClickOn_Print_QR_Code();

		Thread.sleep(2000);


		wb.windowSwitching(driver);
		//		WebElement QRName = driver.findElement(By.xpath("//h4[text()='Speed Driver 1']"));
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//		try {
		//			wait.until(ExpectedConditions.visibilityOf(QRName));
		//		    Assert.assertTrue(QRName.isDisplayed(), " Asset QR Name is not Showing Printing Page");
		//		} catch (TimeoutException e) {
		//			// TODO: handle exception
		//			Assert.fail("Assertion Failed:  Asset QR Name is not Showing Printing Page");
		//		}
		//		catch (NoSuchElementException e) {
		//			// TODO: handle exception
		//			Assert.fail("Assertion Failed:  Asset QR Name is not Showing Printing Page");
		//		}
	}

	@Test(priority = 4)
	public void EditAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		driver.findElement(By.xpath("(//*[contains(@class, 'emailEllapsis') and contains(@title, 'Magic Arrow')])[1]")).click();

		WebElement departmentNotification = driver.findElement(By.xpath("//button[normalize-space()='Skip']"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			WebElement skipbutton = wait .until(ExpectedConditions.elementToBeClickable(departmentNotification));

			// Check if the element is clickable but not clicked
			if (departmentNotification.isEnabled()) {
				// Click the element to mark it as clicked
				departmentNotification.click();


			} else {

				departmentNotification.click();

			}}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}

		ast.ClickOn_General_Details_Edit_ButtonOn_Infopage();
		ast.ClickOn_Category_Name_TextBox("Soft Play");
		ast.ClickOn_PurchasePrice_OnAddAssetsForm("50000");
		ast.ClickOn_Confirm_Changes_Button_On_Edit_General_details_page();
		ast.ClickOn_Ok_Button_On_Edit_Asset_details_Confirmation_page();
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h6[normalize-space()='50000']"))));
			Assert.assertTrue(driver.findElement(By.xpath("//h6[normalize-space()='50000']")).isDisplayed(), "Purchase Price is not updated");

		} catch (TimeoutException e) {
			// TODO: handle exception
			Assert.fail("Assertion failed : Purchase Price is not updated");

		}

	}

	@Test(priority = 5)
	public void BreakdownAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		//driver.findElement(By.xpath("(//*[contains(@class, 'emailEllapsis') and contains(@title, 'Magic Arrow')])[1]")).click();

		//WebElement departmentNotification = driver.findElement(By.xpath("//button[normalize-space()='Skip']"));
		//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ActiveAsset = driver.findElement(By.xpath("(//select[contains(@class, 'activeStatus')])[1]"));
		Select sel=new Select(ActiveAsset);
		sel.selectByVisibleText("Breakdown");
		ast.ClickOn_Select_Department_Dropdown_On_Raise_a_TicketPage();
		Thread.sleep(2000);
		wb.SelectMultiUserCheckBox(driver, "Technical");
		wb.SelectMultiUserCheckBox(driver, "Operations");
		ast.ClickOn_Select_Department_Dropdown_On_Raise_a_TicketPage();
		ast.ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		ast.ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		ast.ClickOn_Enter_TextField_On_Raise_a_TicketPage("Switch Boaed Issue"+ran);
		ast.ClickOn_Create_Button_On_Raise_a_TicketPage();
		ast.ClickOn_Ok_Button_On_Confirmation_Page();


	}
	@Test(priority = 6)
	public void BreakdownToActiveAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		WebElement ActiveAsset = driver.findElement(By.xpath("(//span[@data-target='#ticketclosepopup'][normalize-space()='Breakdown'])[1]"));
		ActiveAsset.click();
		ast.ClickOn_ViewTicketButton();
		ast.SelectTicketStatusDropdown_byVisibleText("Closed");
		ast.ClickOn_TicketRemark("Closed");
		Thread.sleep(2000);
		ast.ClickOn_RemarkSubmitButton();
		Thread.sleep(2000);
		ast.ClickOn_Ok_Button_On_Confirmation_Page();



	}

	@Test(priority = 7)
	public void InactiveAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		WebElement ActiveAsset = driver.findElement(By.xpath("(//select[contains(@class, 'activeStatus')])[1]"));
		Select sel=new Select(ActiveAsset);
		sel.selectByVisibleText("Inactive");
		Thread.sleep(2000);
		ast.ClickOn_Ok_Button_On_Confirmation_Page();


	}

	@Test(dependsOnMethods = "InactiveAssetTest")
	public void InactiveToActiveAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		WebElement ActiveAsset = driver.findElement(By.xpath("(//select[contains(@class, 'activeStatus')])[1]"));
		Select sel=new Select(ActiveAsset);
		sel.selectByVisibleText("Active");
		Thread.sleep(2000);
		ast.ClickOn_Ok_Button_On_Confirmation_Page();

	}


	@Test
	public void ActiveToLostAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		wb.scrollRight(driver, 800);
		WebElement ActiveAsset = driver.findElement(By.xpath("(//select[contains(@class, 'activeStatus')])[1]"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ActiveAsset));

		Select sel=new Select(ActiveAsset);
		sel.selectByVisibleText("Lost");
		ast.ClickOn_RemarkTextFieldOnAssetStatus("Lost");
		ast.ClickOn_SaveButtonOnRemark();
		Thread.sleep(2000);
		ast.ClickOn_OkButton_LostSuccess();

	}

	@Test
	public void LostToActiveAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_Lost_and_Discard_Button();
		wb.scrollRight(driver, 900);

		WebElement LostAsset = driver.findElement(By.xpath("(//select[contains(@class, 'inactiveStatus selectDropDown ng-untouched ng-pristine ng-valid')])[1]"));
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(LostAsset));
			Select sel=new Select(LostAsset);

			Thread.sleep(2000);
			sel.selectByVisibleText("Active");
			Thread.sleep(2000);
			ast.ClickOn_OkButton_LostSuccess();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not visible");
		}


	}
	
	@Test
	public void RaiseTicketFromAssetTicketSubTabTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		driver.findElement(By.xpath("(//li[@class='wdth-150 flex-1 text-wt-drk'])[1]")).click();
		WebElement departmentNotification = driver.findElement(By.xpath("//button[normalize-space()='Skip']"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			WebElement skipbutton = wait .until(ExpectedConditions.elementToBeClickable(departmentNotification));

			// Check if the element is clickable but not clicked
			if (departmentNotification.isEnabled()) {
				// Click the element to mark it as clicked
				departmentNotification.click();


			} else {

				departmentNotification.click();

			}
			}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}
		ast.ClickOn_Tickets_Button();
		ast.ClickOn_Raise_a_Ticket_Button_On_Asset_TicketsPage();
		ast.SelectTicketType("General");

		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Select Department']")).click();
          
		Thread.sleep(2000);
		wb.SelectMultiUserCheckBox(driver, "Technical");
		wb.SelectMultiUserCheckBox(driver, "Operations");
        driver.findElement(By.xpath("//span[.='Select Department']")).click();
		ast.ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage();
		wb.SelectMultiUserCheckBox(driver, "Rishikesh");
		wb.SelectMultiUserCheckBox(driver, "Mikhail");
		ast.ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		ast.ClickOn_Enter_TextField_On_Raise_a_TicketPage("Switch Boaed Issue"+ran);
		ast.ClickOn_Create_Button_On_Raise_a_TicketPage();
		ast.ClickOn_Ok_Button_On_Confirmation_Page();
		
	}
	
	@Test
	public void PartsAssociateTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		driver.findElement(By.xpath("(//li[@class='wdth-150 flex-1 text-wt-drk'])[1]")).click();
		WebElement departmentNotification = driver.findElement(By.xpath("//button[normalize-space()='Skip']"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			WebElement skipbutton = wait .until(ExpectedConditions.elementToBeClickable(departmentNotification));

			// Check if the element is clickable but not clicked
			if (departmentNotification.isEnabled()) {
				// Click the element to mark it as clicked
				departmentNotification.click();


			} else {

				departmentNotification.click();

			}
			}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Created Asset Name is not Showing on Listing");
		}
		ast.ClickOn_Parts_Button();
		ast.ClickOn_Associate_a_Part_Button();
		ast.ClickOn_PartsDropdownOn_AttachPartsPage();
		wb.SelectMultiUserCheckBox(driver, "Foul Line (74746)");
		wb.SelectMultiUserCheckBox(driver, "Gears and belts");
		ast.ClickoN_SaveButton_OnAttachPartsPage();
		Thread.sleep(2000);
		ast.ClickOn_OkButton_OnAsset_part_associated_successfully();
		
		WebElement PartName = driver.findElement(By.xpath("//span[.='Gears and belts']"));
		
		try {
			wait.until(ExpectedConditions.visibilityOf(PartName));
			Assert.assertTrue(PartName.isDisplayed(), "Associated Part Name is not Showing on Listing");
		} catch (TimeoutException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Associated Part Name is not Showing on Listing");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Associated Part Name is not Showing on Listing");
		}
		
	}
	
	@Test
	public void AssetTranferTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		driver.findElement(By.xpath("//label[@for='15718check']//img[1]")).click();
		ast.ClickOn_Move_Button_On_All_AssetPage();
		ast.DateOfTransfer_OnAssetTransfer(driver);
		ast.ExpectedReturnDate_OnAssetTransfer(driver);
		ast.ClickOn_Location_Reason_TExtBox_On_Transfer_AssetPage("Pune");
		ast.ClickOn_Next_Button();
		driver.findElement(By.xpath("//span[normalize-space()='Transfer']")).click();
		Thread.sleep(2000);
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
WebElement TransferSuccesMessege = driver.findElement(By.xpath("//div[@id='successPopUp']//p[contains(text(),'Asset(s) moved successfully')]"));
		
		try {
			wait.until(ExpectedConditions.visibilityOf(TransferSuccesMessege));
			Assert.assertTrue(TransferSuccesMessege.isDisplayed(), "Transfered Asset"
					+ " Name is not Showing on Listing");
		} catch (TimeoutException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Associated Part Name is not Showing on Listing");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Associated Part Name is not Showing on Listing");
		}
		ast.ClickOn_Ok_Button_On_Confirmation_Page();
	
		
	}
	
	@Test(dependsOnMethods = "AssetTranferTest")
	public void ReturnTranferAssetTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		Assets ast = new Assets(driver);
		ast.ClickOn_In_Transit_Button();
		wb.scrollRight(driver, 5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@id='changBtn'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Mark as Return')])[1]")).click();
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
WebElement AssetReturnSuccesMessege = driver.findElement(By.xpath("//div[@id='successPopUp']//p[contains(text(),'Asset(s) returned successfully')]"));
		
		try {
			wait.until(ExpectedConditions.visibilityOf(AssetReturnSuccesMessege));
			Assert.assertTrue(AssetReturnSuccesMessege.isDisplayed(), "Transfered Asset"
					+ " Name is not Showing on Listing");
		} catch (TimeoutException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Associated Part Name is not Showing on Listing");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Assert.fail("Assertion Failed: Associated Part Name is not Showing on Listing");
		}
		ast.ClickOn_Ok_Button_On_Confirmation_Page();
	
		
	}
	
}
	


