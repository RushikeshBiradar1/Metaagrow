package com.Metaagrow.Parts_And_Inventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Parts_and_Inventory;

public class PartsTest extends BaseClass{

	@Test(priority = 1)
	public void AddSinglePartWithMandatoryField_TestTC_P1() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
		parts.ClickOn_Add_Parts_Tab();
		//		Thread.sleep(2000);
		parts.ClickOn_Add_Parts_SingleTab();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		parts.ClickOn_PartName_TextFiled_On_Add_SinglePart_page("Nut-SIze"+ran+"+mm");
		parts.ClickOn_Property_Id_Dropdown_On_Add_SinglePart_page_By_VisibleText("Thane");
		parts.ClickOn_Location_Id_Dropdown_On_Add_SinglePart_page("First Floor");
		parts.ClickOnUnitOfMeasure("Piece");
		parts.ClickOn_Quantity_In_Hand_TextFiled_On_Add_SinglePart_page("2000");
		parts.ClickOn_Add_Parts_Button_On_Add_SinglePart_page();
		Thread.sleep(2000);
		parts.ClickOn_Ok_button_on_add_part_confirmation_page();

	}

	@Test(priority = 2)
	public void AddSinglePartWithAllDetailTest_TCP2() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
		parts.ClickOn_Add_Parts_Tab();
		//		Thread.sleep(2000);
		parts.ClickOn_Add_Parts_SingleTab();
		Java_Utility java = new Java_Utility();
		int ran = java.getRandomNum();
		parts.ClickOn_PartName_TextFiled_On_Add_SinglePart_page("Nut-SIze"+ran+"+mm");
		parts.ClickOn_Part_No_TextFiled_On_Add_SinglePart_page("TPR6532UY4");
		Thread.sleep(2000); parts.SelectPurchaseDate(driver);

		Thread.sleep(2000);

		//	    driver.findElement(By.xpath("//input[@id='purchaseDate']")).click();

		parts.ClickOn_Property_Id_Dropdown_On_Add_SinglePart_page_By_VisibleText("Thane");
		parts.ClickOn_Location_Id_Dropdown_On_Add_SinglePart_page("First Floor");
		parts.ClickOnUnitOfMeasure("Piece");
		parts.ClickOn_MTQ_TextFiled_On_Add_SinglePart_page("25");

		parts.ClickOn_Quantity_In_Hand_TextFiled_On_Add_SinglePart_page("2000");
		parts.ClickOn_Price_per_Piece_TextFiled_On_Add_SinglePart_page("1500");
		parts.SelectUpcomingExpiryDate(driver);
		parts.SelectUpcomingWarrantyExpiryDate(driver);
		Thread.sleep(6000);
		parts.ClickOn_Add_Parts_Button_On_Add_SinglePart_page();
		Thread.sleep(2000);
		parts.ClickOn_Ok_button_on_add_part_confirmation_page();
	}

	@Test(enabled = false)
	public void PrintBarcodeTest_TC_P3() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
		parts.ClickOn_BarcodeButton();
		driver.findElement(By.xpath("//label[normalize-space()='Prize Counter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("1");
		parts.ClickOn_PrintButton_OnBarcodePrintPage();
		Thread.sleep(4000);
	}

	
	@Test(priority = 4)
	public void TranferPartTest_TC_P4() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
		driver.findElement(By.xpath("//label[@for='23639check']")).click();
		parts.ClickOn_Transfer_Button();
		Thread.sleep(2000);
		parts.DateOfTransfer(driver);
		
		parts.ClickOn_TransferToTextFieldOn_TransferPartPage("UAE");
		parts.ClickOn_ReasonOfTransferTextFieldOn_TransferPartPage("Maintenance");
		parts.ClickOn_RemarkTextFieldOn_TransferPartPage("NA");
		Thread.sleep(3000);
		parts.ExpectedDateOfReturn(driver);
		parts.ClickOn_EnterQuantityTextBoxOn_TransferPartPage("1");
		Thread.sleep(2000);
		parts.ClickOn_NextButtonOn_TransferPartPage();
		parts.ClickOn_TransferButtonOn_ConfirmPage();
		parts.Clickon_OKButton_OnPartsMovedSuccess_And_returnSuccess();
		
	}
	
	@Test(priority = 5)
	public void ReturnPartTest_TC_P5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
		parts.ClickOn_Transferred_Tab();
		wb.scrollRight(driver, 8000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Status'])[1]")).click();
		parts.ClickOn_ReturnFirstPartButton_OnTransferedPage();
		parts.ClickOn_ReturnQuantityTextField_OnReturnPartsPage("1");
		parts.ClickOn_UpdateButton_OnReturnPartsPage();
//		Thread.sleep(2000);
		WebElement OKButton = driver.findElement(By.xpath("(//div[@class='modal-content' and .//p[contains(text(),'Part(s) returned successfully')]]//button[normalize-space()='Ok'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(OKButton));
			OKButton.click();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail("OkButton is not visible or not clickable");
		}
		
	}
	
	@Test(priority = 6)
	public void UpdatePartQtyTest_TC_P6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
	 driver.findElement(By.xpath("(//ul[@class='tr']//li[contains(@title, 'Nut-SIze')])[1]")).click();
	 parts.CLickOn_Update_Quantity_Button_On_Part_InfoPage();
	 parts.ClickOn_orderPoId_Text_Filed_On_Update_quantity_Page("Metaa-Dec24-003568yB");
	 parts.CLickOn_Quantity_Ordered_TextField_On_Update_quantity_Page("10");
	 parts.CLickOn_Quantity_Received_TextField_On_Update_quantity_Page("10");
	 parts.CLickOn_Price_TextField_On_Update_quantity_Page("500");
	 parts.ClickOn_Select_Status_Dropdown_On_Update_quantity_Page_By_VisibleText("Complete");
	 parts.ClickOn_Update_Button_Update_quantity_Page();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement OkButton = driver.findElement(By.xpath("//button[@id='okpopup']"));
	try {
		wait.until(ExpectedConditions.elementToBeClickable(OkButton));
		OkButton.click();
		
	} catch ( Exception e) {
		// TODO: handle exception
		Assert.fail("OkButton is not visible or not clickable");
	}
	 
//	 parts.ClickOn_Ok_Button_parts_Update_Confirmation_Page();
	 
	 
	}
	
	@Test(priority = 7)
	public void EditPartNoTest_TC_P7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
	 driver.findElement(By.xpath("(//ul[@class='tr']//li[contains(@title, 'Nut-SIze')])[1]")).click();
	 parts.CLickOn_Edit_Button_On_Part_InfoPage();
	 parts.clearPart_No_TextFiled_On_Add_SinglePart_page();
	 parts.ClickOn_Part_No_TextFiled_On_Add_SinglePart_page("2001");
	 parts.ClickOn_ConfirmChangesButton_OnEditPartPage();
	WebElement Okbutton = driver.findElement(By.xpath("(//div[@class='modal-content' and .//p[contains(text(),'Part(s) details updated successfully')]]//button[normalize-space()='Ok'])[1]"));
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Okbutton));
			Okbutton.click();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail("OkButton is not visible or not clickable");
		}
		
	}
	
	@Test(enabled=false)
	public void ActiveToInactivePartStatusTest_TC_P8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
		WebElement StatusDropdown = driver.findElement(By.xpath("//select[@class='selectDropDown activeStatus ng-pristine ng-valid ng-touched']"));
		Select sel = new Select(StatusDropdown);
		sel.selectByVisibleText("Inactive");
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 11)
	public void PartInfoQRTest_TC_P11() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		Parts_and_Inventory parts = new Parts_and_Inventory(driver);
	 driver.findElement(By.xpath("(//ul[@class='tr']//li[contains(@title, 'Nut-SIze')])[1]")).click();
	 parts.ClickOn_QR_Button_On_Part_InfoPage();
	 parts.EnterQuantityTextField_OnBarcodePrintPage("5");
	 parts.ClickOn_PrintButton();
	
	 
	}
	
	


}
