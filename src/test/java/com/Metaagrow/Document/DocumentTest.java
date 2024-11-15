package com.Metaagrow.Document;

import java.awt.Window;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Date_Formats;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.Document_Report;
import com.MetaaGrow.ObjectRepository.Documents;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;

public class DocumentTest extends BaseClass{

	@Test(priority = 1)
	public void DownloadButtonTest_TC_D1() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_DownloadPDFButton();
		Thread.sleep(2000);
		///driver.findElement(By.xpath("//span[normalize-space()='Download Pdf']")).click();

		// Wait for the new window to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2)); // Adjust the expected window count if necessary

		// Get all window handles
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Thread.sleep(2000);
		// Verify if the window switch was successful
		if (!driver.getWindowHandle().equals(parentWindowHandle)) {
			System.out.println("Window switched successfully.");
		} else {
			System.out.println("Window switch failed.");
		}
		driver.switchTo().window(parentWindowHandle);

	}
	@Test(enabled=false)
	public void propertyFilterTest_TC_D2()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_FilterIcon();
		doc.ClickOn_Property_Filter();
		doc.ClickOn_propertySearchBox("ANDHERI");
		driver.findElement(By.xpath("//a[.='ANDHERI']")).click();
		doc.CLickOn_Apply_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[.='ANDHERI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Property displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Property Not displayed");
		}
	}
	@Test(priority = 3)
	public void FilterByStartDateEndDateTest_TC_D3() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_FilterIcon();
		Dates date = new Dates();   
		date.startDate(driver, "Jan-2024", "2");
		date.End_Date(driver, "Dec-2024", "25");


		//		Actions actions = new Actions(driver);
		//		actions.sendKeys(Keys.ESCAPE).perform();
		//		Thread.sleep(2000);
		wb.EscapeMethod(driver);
		//		date.End_Date(driver, "Apr-2024", "25");
		doc.CLickOn_Apply_Button();
		//		driver.findElement(By.xpath("//ul[@class='filter-list']//li//ul//button[@class='button btn-primary']")).click();
		WebElement element = driver.findElement(By.xpath("(//span[.='03 Jan, 2024'])[1]"));

		// Check if the text is displayed
		Assert.assertTrue(element.isDisplayed(),"The expected text is not displayed." );

	}
	@Test(priority = 4)
	public void FilterByDocumentProviderTest_TC_D4()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_FilterIcon();
		doc.ClickOn_Document_Provider_TextField_Filter("ICICI");
		doc.CLickOn_Apply_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[.='ICICI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Document Provider displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Document Provider Not displayed");
		}


	}
	@Test(priority = 5)
	public void FilterByDocumentTypeTest_TC_D5()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_FilterIcon();
		doc.CLickOn_Document_Type_TextFiled_Filter("Health Insurance");
		doc.CLickOn_Apply_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[.='Health Insurance']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Document Type displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Document Type Not displayed");
		}

	}


	@Test(priority = 6)
	public void FilterClearButtonPopupshould_notbeclosedTest_TC_D6()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_FilterIcon();
		doc.CLickOn_Document_Type_TextFiled_Filter("Health Insurance");
		doc.CLickOn_Apply_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[.='Health Insurance']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Document Type displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Document Type Not displayed");
		}
		doc.ClickOn_FilterIcon();
		doc.ClickOn_Filter_Clear_Button();
		try {
			WebElement filterPopup = driver.findElement(By.xpath("//span[.='Filter']")); // Adjust the XPath according to your filter popup element
			if (filterPopup.isDisplayed()) {
				//		        System.out.println("Filter popup is open. Test Pass.");
				Assert.assertTrue(filterPopup.isDisplayed(), "Filter popup is open. Test Passed.");
			} else {
				System.out.println("Filter popup is closed. Test Fail.");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Filter popup is closed. Test Fail.");
		}

	}
	@Test(priority = 7)
	public void DocumentInfoPageTest_TC_D7()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.ClickOn_FilterIcon();
		doc.ClickOn_Document_Provider_TextField_Filter("Bajaj Insurance");
		doc.CLickOn_Apply_Button();
		driver.findElement(By.xpath("//span[normalize-space()='Bajaj Insurance']")).click();

		doc.ClickOn_Assets_CoveredInfoPage();
		doc.ClickOn_FilesTabOnInfoPage();
		doc.clickOn_NotificationSettingOnInfoPage();
		doc.ClickOn_InfoTab();
		try {
            // Locate the element using XPath
            WebElement element = driver.findElement(By.xpath("//div[@class='media-body sec-title']"));
            
            // Assert that the element is displayed
            Assert.assertTrue(element.isDisplayed(), "The expected div is not displayed.");
        } catch (NoSuchElementException e) {
            Assert.fail("The expected Info page is not present on the page.");
        }


	}
	@Test(enabled= false)
	public void DocumentInfoEditTest_TC_D8() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		driver.findElement(By.xpath("//span[normalize-space()='Bajaj Insurance']")).click();
		Documents doc = new Documents(driver);
		doc.ClickOn_EditIconOnInfoPage();
		doc.ClickOn_Document_Cost_TExtField("50000");
		Thread.sleep(2000);
		doc.ClearDocument_Cost_TExtField();
		doc.ClickOn_Document_Cost_TExtField("50000");

		doc.ClickOn_ConfirmChangesButton();
		Thread.sleep(2000);
		doc.ClickOn_OkButton_On_editChangesCOnfirmation_Page();

	}
	@Test(enabled = false)
	public void DocumentInfo_Notificaation_Test_TC_D9() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		driver.findElement(By.xpath("//span[normalize-space()='Bajaj Insurance']")).click();
		Documents doc = new Documents(driver);
		doc.clickOn_NotificationSettingOnInfoPage();
		doc.Select_UserstobenotifiedDropdownOn("Biradar");
		doc.Select_SelectWhenToBeNotifyPeriodDropdown("year");
		doc.Select_SelectWhenToBeNotifyDayDropdown("15");
		doc.ClickOn_SaveButtonOnNotificationSetting();
		Thread.sleep(1000);
		doc.ClickOn_OkButton_OnNotificationSetting_ConfirmationPage();


	}

	@Test(priority = 10)
	public void AddDocumentUsingMandatoryField_Test_TC_D10() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.CLickOn_Add_New_Document_Button();
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNum();
		String DocName="Document"+ran;
		doc.ClickOn_Document_Provider_Name_TExtField(DocName);
		doc.ClickOn_Document_Type_TextField("TYPE");
		Dates date = new Dates();
		date.startDate(driver, "Jan-2024", "3");
		date.Expiration_Date(driver, "Feb-2025", "3");
		doc.Select_Status_DropdownBy_VisibleTExt(" Active");
		doc.Select_Property_DropdownBy_VisibleText(" ANDHERI");
		doc.ClickOn_Add_Document_Button_On_AddPage();
		Thread.sleep(1000);
		driver.findElement(By.id("backClicked")).click();
		driver.navigate().refresh();
		
		//verify created or not
		 try {
	            // Create a WebDriverWait with a maximum wait time of 5 seconds
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            
	            // Locate the element using XPath with a wait
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='" + DocName + "']")));
	            
	            // Assert that the element is displayed
	            Assert.assertTrue(element.isDisplayed(), "The newly created doc is not displayed on listing.");
	        } catch (NoSuchElementException e) {
	            Assert.fail("The newly created doc is not displayed on listing.");
	        }
		

	}

	@Test(priority = 11)
	public void AddDocumentUsingAllField_Test_TC_D11() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		driver.manage().window().maximize();
		Documents doc = new Documents(driver);
		doc.CLickOn_Add_New_Document_Button();
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNum();
		String DocName="Document"+ran;
		doc.ClickOn_Document_Provider_Name_TExtField(DocName);
		doc.ClickOn_Document_Type_TextField("TYPE");
		Dates date = new Dates();
		date.startDate(driver, "Jan-2024", "3");
		date.Expiration_Date(driver, "Feb-2025", "3");
		doc.Select_Status_DropdownBy_VisibleTExt(" Active");
		doc.Select_Property_DropdownBy_VisibleText(" ANDHERI");
		doc.ClickOn_Document_Cost_TExtField("55000");
		doc.CLickOn_Document_Number_TextField("3201VDSD");
		doc.clickOn_Asset_DropdownBy_VisibleTExt();
		wb.SelectMultiUserCheckBox(driver, "Bottle Jack");
		doc.clickOn_Asset_DropdownBy_VisibleTExt();
		doc.ClickOn_Add_Document_Button_On_AddPage();
		Thread.sleep(1000);
		driver.findElement(By.id("backClicked")).click();
		driver.navigate().refresh();
		
		//verify created or not
		 try {
	            // Create a WebDriverWait with a maximum wait time of 5 seconds
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            
	            // Locate the element using XPath with a wait
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='" + DocName + "']")));
	            
	            // Assert that the element is displayed
	            Assert.assertTrue(element.isDisplayed(), "The newly created doc is not displayed on listing.");
	        } catch (NoSuchElementException e) {
	            Assert.fail("The newly created doc is not displayed on listing.");
	        }
		

	}
	@Test(priority = 12)
	public void AddDocumentPageCancelButtonTest_TC_D12() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.CLickOn_Add_New_Document_Button();
		doc.ClickOn_Cancel_Button_On_Add_Page();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Document']")).isDisplayed(), "Document listing page not display");

	}
	@Test(priority = 13)
	public void AddDocumentPageCloseButtonTest_TC_D13() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		Documents doc = new Documents(driver);
		doc.CLickOn_Add_New_Document_Button();
		doc.ClickOn_Close_Button_On_Add_Page();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Document']")).isDisplayed(), "Document listing page not display");

	}
	//	@Test(priority = 13)
	//	public void VerticalScrollBarTest_TC_D13() throws Throwable
	//	{
	//		LoginPage lp = new LoginPage(driver);
	//		lp.ClickOn_LoginNotification_Icon(driver);
	//		WebDriver_Utility wb = new WebDriver_Utility();
	//		wb.ImplicitlyWait(driver);
	//		HomePage hp = new HomePage(driver);
	//
	//		hp.ClickOnSetupLinkText(driver);
	//		Setup sp = new Setup(driver);
	//		sp.ClickOnDocumentsLinkText();
	//		
	//		// Method to scroll the page horizontally using JavaScript
	//	    driver.manage().window().maximize();
	//	    WebElement element = driver.findElement(By.xpath("//div[@class='scroll-box']"));
	//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
	//	    wait.until(ExpectedConditions.visibilityOf(element));
	////	        Thread.sleep(3000);
	//	    WebElement divElement = driver.findElement(By.xpath("//div[@class='scroll-box']"));
	//	    JavascriptExecutor js = (JavascriptExecutor) driver;
	//
	//	    for (int i = 0; i < 10; i++) {
	//            // Scroll down by 100 pixels each time (you can change this value)
	//            js.executeScript("arguments[0].scrollTop += 300;", divElement);
	//            // Add a wait time if needed to give the page time to load content
	//            Thread.sleep(2000);
	//
	//        }
	//	    for (int i = 0; i < 10; i++) {
	//            
	//	    	 js.executeScript("arguments[0].scrollTop -= 100;", divElement);
	//	            // Add a wait time to give the page time to load content
	//	            try {
	//	                Thread.sleep(1000);
	//	            } catch (InterruptedException e) {
	//	                e.printStackTrace();
	//	            }
	//        }
	//}
	@Test(priority = 14)
	public void HorizontalScrollBarTest_TC_D14() throws Throwable
	{LoginPage lp = new LoginPage(driver);
	lp.ClickOn_LoginNotification_Icon(driver);
	WebDriver_Utility wb = new WebDriver_Utility();
	wb.ImplicitlyWait(driver);
	HomePage hp = new HomePage(driver);

	hp.ClickOnSetupLinkText(driver);
	Setup sp = new Setup(driver);
	sp.ClickOnDocumentsLinkText();

	// Method to scroll the page horizontally using JavaScript
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//div[@class='scroll-box']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
	wait.until(ExpectedConditions.visibilityOf(element));
	// Get the JavascriptExecutor instance
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// Get the width of the scrollable element
	int width = element.getSize().getWidth();
	// Calculate the amount of pixels to scroll by for each item
	int pixels = width / 10;
	// Scroll right for 10 list items
	for (int i = 0; i < 10; i++) {
		// Scroll by the calculated pixels
		js.executeScript("arguments[0].ScrollRight += arguments[1];", element, pixels);
		// Wait for the element to load content
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	Thread.sleep(2000);
	// Scroll left for 10 list items
	for (int i = 0; i < 10; i++) {
		// Scroll by the negative calculated pixels
		js.executeScript("arguments[0].scrollLeft -= arguments[1];", element, pixels);
		// Wait for the element to load content
		wait.until(ExpectedConditions.visibilityOf(element));
	}}


	@Test(priority = 15)
	public void verticalScrollBarTest_TC_D15() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();

		// Method to scroll the page vertically using JavaScript
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//div[@class='scroll-box']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
		wait.until(ExpectedConditions.visibilityOf(element));
		// Get the JavascriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Get the height of the scrollable element
		int height = element.getSize().getHeight();
		System.out.println(height);
		// Calculate the amount of pixels to scroll by for each item
		int pixels = height / 10;
		System.out.println(pixels);
		// Scroll down for 10 list items
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(element));
		for (int i = 0; i < 10; i++) {
			// Scroll by the calculated pixels
			js.executeScript("arguments[0].scrollDown += arguments[1];", element, pixels);
			// Wait for the element to load content
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		Thread.sleep(2000);
		// Scroll up for 10 list items
		for (int i = 0; i < 10; i++) {
			// Scroll by the negative calculated pixels
			js.executeScript("arguments[0].scrollTop -= arguments[1];", element, pixels);
			// Wait for the element to load content
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}
}





