package com.Metaagrow.Inspetions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Inspections;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

public class Inspection_ReportsAndGeneralTest extends BaseClass{
	
	@Test
	public void downloadPdfAndVerifyInNewWindow() throws Throwable {
		  // Login
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);

	    // Utility setup
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);

	    // Navigate to Inspections
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();

	    Inspections inspect = new Inspections(driver);

	    // Store parent window handle
	    String parentWindow = driver.getWindowHandle();

	    // Wait setup
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Click on checkbox
	    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//img[@alt='unchecked']/ancestor::label")));
	    Thread.sleep(5000);
	    checkbox.click();

	    // Click on "Download Pdf" button

	    inspect.ClickOn_Download_PDF_Button();

	   driver.findElement(By.xpath("(//button[contains(., 'Ok')])[6]")).click();
	    // Wait for new window to appear
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));

	    // Switch to the new window
	    Set<String> allWindows = driver.getWindowHandles();
	    for (String window : allWindows) {
	        if (!window.equals(parentWindow)) {
	            driver.switchTo().window(window);
	            break;
	        }
	    }

	    // Verify PDF URL
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("PDF URL: " + currentUrl);

	    Assert.assertTrue(currentUrl.endsWith(".pdf"), "URL does not end with .pdf");

	    // Close only the child window
	    driver.close();

	    // Switch back to the parent window
	    driver.switchTo().window(parentWindow);
}
	
	@Test
	public void SendEmail() throws Throwable {
	    // Login
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);

	    // Utility setup
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);

	    // Navigate to Inspections
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();

	    Inspections inspect = new Inspections(driver);

	    // Wait setup
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Step 1: Click on the checkbox
	    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//img[@alt='unchecked']/ancestor::label")));
	    Thread.sleep(5000);
	    checkbox.click();

	    // Step 2: Click on "Email" button

	    inspect.ClickOn_Email_Button();

	    // Step 3: Wait for modal popup and enter email

	    inspect.ClickOn_Email_Address_TextField("rushikesh@metaagrow.com");

	 // 3. Click "Send"

	    inspect.ClickOn_Send_Button_On_Email();

	    Thread.sleep(3000);

inspect.ClickOn_Ok_Button_On_Email_ConfirmationPage();
	}
	
	
	
	@Test
	public void TC_InspectionReport_Email_EmptyEmailValidation() throws Throwable {
	    // Login
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);

	    // Utility setup
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);

	    // Navigate to Inspections
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();

	    Inspections inspect = new Inspections(driver);

	    // Wait setup
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Step 1: Click on the checkbox
	    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("(//img[@alt='unchecked'])[1]")));
	    Thread.sleep(5000);
	    checkbox.click();

	    // Step 2: Click on "Email" button
	    inspect.ClickOn_Email_Button();

	    // Step 3: Leave email field empty
	    inspect.ClickOn_Email_Address_TextField(""); // <-- Empty string for negative test

	    // Step 4: Click "Send"
	    inspect.ClickOn_Send_Button_On_Email();

	    // Step 5: Verify error message
	    WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//span[normalize-space()='Enter Valid email']")));

	    Assert.assertEquals(errorMsg.getText().trim(), "Enter Valid email", "❌ Error message not displayed as expected");

	    System.out.println("✅ Validation message displayed: " + errorMsg.getText());
	}
	
	@Test
	public void verifyInvalidEmailValidationMessage() throws Throwable {
	    // Login
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);

	    // Setup utilities
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);

	    // Navigate to Inspections
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();

	    Inspections inspect = new Inspections(driver);

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Select a report
	    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//img[@alt='unchecked']/ancestor::label")));
	    Thread.sleep(5000);
	    checkbox.click();

	    // Click on Email button
	    inspect.ClickOn_Email_Button();

	    // Enter invalid email
	    inspect.ClickOn_Email_Address_TextField("test@");

	    // Click Send
	    inspect.ClickOn_Send_Button_On_Email();

	    // Verify error message is displayed
	    WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//span[text()='Enter Valid email']")));

	    Assert.assertTrue(errorMsg.isDisplayed(), "Validation message not shown for invalid email");
	}

	@Test
	public void verifyEmailPopupCancelFunctionality() throws Throwable {
	    // Login
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);

	    // Setup utilities
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);

	    // Navigate to Inspections
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();

	    Inspections inspect = new Inspections(driver);

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Select a report
	    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//img[@alt='unchecked']/ancestor::label")));
	    Thread.sleep(3000);
	    checkbox.click();

	    // Click on Email button
	    inspect.ClickOn_Email_Button();

	    // Wait for popup
	    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//div[@id=\"emailReport\"]//div[@class=\"modal-content\"]")));

	    // Click Cancel button
	    WebElement cancelBtn = driver.findElement(By.id("cancelEmailPopup"));
	    cancelBtn.click();

	    // Assert modal is no longer visible
	    boolean isClosed;
	    try {
	        wait.until(ExpectedConditions.invisibilityOf(popup));
	        isClosed = true;
	    } catch (TimeoutException e) {
	        isClosed = false;
	    }

	    Assert.assertTrue(isClosed, "Email popup did not close after clicking Cancel");
	}


	@Test
	public void testDownloadPdfButtonDisabledWithoutSelection() {
	    // Step 1: Login
	    LoginPage lp = new LoginPage(driver);
	    lp.ClickOn_LoginNotification_Icon(driver);

	    // Step 2: Browser setup
	    WebDriver_Utility wb = new WebDriver_Utility();
	    wb.ImplicitlyWait(driver);
	    wb.maximizeTheBrowser(driver);

	    // Step 3: Navigate to Inspections
	    HomePage hp = new HomePage(driver);
	    hp.ClickOnInspectionsLinkText();

	    // Step 4: Initialize page object
	    Inspections inspect = new Inspections(driver);

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Step 5: Try clicking on "Download PDF" without selecting any report
	    WebElement downloadBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
	            By.xpath("//button[contains(@class, 'downloadPermissionReport')]")));

	    // Step 6: Verify button is disabled or non-clickable
	    boolean isEnabled = downloadBtn.isEnabled();
	    
	    if (!isEnabled) {
	        System.out.println("✅ Download PDF button is disabled as expected when no report is selected.");
	        Assert.assertFalse(isEnabled, "Button should be disabled without selection.");
	    } else {
	        // Optional: Try clicking and check if error message appears
	        downloadBtn.click();

	        try {
	            WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//*[contains(text(),'Please select a report')]")));
	            Assert.assertTrue(errorMsg.isDisplayed(), "Error message not displayed.");
	            System.out.println("✅ Error message displayed: " + errorMsg.getText());
	        } catch (TimeoutException e) {
	            Assert.fail("❌ Download PDF button is enabled without selecting a report and no message is shown.");
	        }
	    }
	}
	
	
	  @Test(priority = 1)
	    public void verifyAllColumnHeadersAreVisible() {
	        // TC-DISPLAY-001: Verify All Column Headers are Visible
		  
		  // Step 1: Login
		    LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);

		    // Step 2: Browser setup
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    wb.maximizeTheBrowser(driver);

		    // Step 3: Navigate to Inspections
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnInspectionsLinkText();

		    // Step 4: Initialize page object
		    Inspections inspect = new Inspections(driver);

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Locate the header row
	        WebElement headerRow = wait.until(ExpectedConditions.presenceOfElementLocated(
	            By.cssSelector("ul.th")
	        ));
	        
	        // Expected column headers
	        String[] expectedHeaders = {
	            "", // Checkbox column (empty text)
	            "Schedule Name",
	            "Checklist Name",
	            "Property",
	            "Department",
	            "Asset Name",
	            "Associate",
	            "Supervised Status",
	            "Due Date & Time",
	            "Start Time",
	            "End Time",
	            "Duration",
	            "Completion Status",
	            "Reports",
	            "Action"
	        };
	        
	        // Get all header elements
	         java.util.List<WebElement> headerElements = headerRow.findElements(By.tagName("li"));
	        
	        // Verify all headers are present and visible
	        Assert.assertEquals(headerElements.size(), expectedHeaders.length, 
	            "Number of headers doesn't match expected count");
	        
	        for (int i = 0; i < expectedHeaders.length; i++) {
	            WebElement header = headerElements.get(i);
	            Assert.assertTrue(header.isDisplayed(), "Header '" + expectedHeaders[i] + "' is not visible");
	            
	            if (!expectedHeaders[i].isEmpty()) {
	                String actualHeaderText = header.findElement(By.tagName("span")).getText();
	                Assert.assertEquals(actualHeaderText, expectedHeaders[i], 
	                    "Header text doesn't match for index " + i);
	            }
	        }
	    }
	  
	  @Test(enabled=false)
	    public void verifyScheduleNameChecklistNamePropertyAreDisplayed() {
	        // TC-DISPLAY-002: Verify Data is Populated in All Columns
		  
		  // Step 1: Login
		    LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);

		    // Step 2: Browser setup
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    wb.maximizeTheBrowser(driver);

		    // Step 3: Navigate to Inspections
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnInspectionsLinkText();

		    // Step 4: Initialize page object
		    Inspections inspect = new Inspections(driver);

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
		    // Wait for and verify header row
	        WebElement headerRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.th")));
	        Assert.assertTrue(headerRow.isDisplayed(), "Header row is not visible");
	        
	        // Verify Schedule Name header
	        WebElement scheduleNameHeader = headerRow.findElement(By.xpath(".//span[text()='Schedule Name']"));
	        Assert.assertTrue(scheduleNameHeader.isDisplayed(), "Schedule Name header is not visible");
	        
	        // Verify Checklist Name header
	        WebElement checklistNameHeader = headerRow.findElement(By.xpath(".//span[text()='Checklist Name']"));
	        Assert.assertTrue(checklistNameHeader.isDisplayed(), "Checklist Name header is not visible");
	        
	        // Verify Property header
	        WebElement propertyHeader = headerRow.findElement(By.xpath(".//span[text()='Property']"));
	        Assert.assertTrue(propertyHeader.isDisplayed(), "Property header is not visible");
	        
	        // Wait for and verify data row
	        WebElement dataRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.tr")));
	        Assert.assertTrue(dataRow.isDisplayed(), "Data row is not visible");
	        
	        // Get all data cells
	        java.util.List<WebElement> dataCells = dataRow.findElements(By.cssSelector("li"));
	        Assert.assertTrue(dataCells.size() > 3, "Not enough data columns found");
	        
	        // Verify Schedule Name data cell (index 1)
	        WebElement scheduleNameCell = dataCells.get(1);
	        Assert.assertTrue(scheduleNameCell.isDisplayed(), "Schedule Name data cell is not visible");
	        Assert.assertEquals(scheduleNameCell.getText().trim(), "Bowling Lane Checkli..", 
	            "Schedule Name data doesn't match expected");
	        
	        // Verify Checklist Name data cell (index 2)
	        WebElement checklistNameCell = dataCells.get(2);
	        Assert.assertTrue(checklistNameCell.isDisplayed(), "Checklist Name data cell is not visible");
	        Assert.assertEquals(checklistNameCell.getText().trim(), "Bowling Lane", 
	            "Checklist Name data doesn't match expected");
	        
	        // Verify Property data cell (index 3)
	        WebElement propertyCell = dataCells.get(3);
	        Assert.assertTrue(propertyCell.isDisplayed(), "Property data cell is not visible");
	        Assert.assertEquals(propertyCell.getText().trim(), "Murouj", 
	            "Property data doesn't match expected");
	        
	        System.out.println("All three columns verified successfully:");
	        System.out.println("✓ Schedule Name: " + scheduleNameCell.getText().trim());
	        System.out.println("✓ Checklist Name: " + checklistNameCell.getText().trim());
	        System.out.println("✓ Property: " + propertyCell.getText().trim());
	    }
	    
	  
	  @Test
	  public void TC_DISPLAY_007_VerifyHorizontalScrollFunctionality_Simple() {
		  
		  // Step 1: Login
		    LoginPage lp = new LoginPage(driver);
		    lp.ClickOn_LoginNotification_Icon(driver);

		    // Step 2: Browser setup
		    WebDriver_Utility wb = new WebDriver_Utility();
		    wb.ImplicitlyWait(driver);
		    wb.maximizeTheBrowser(driver);

		    // Step 3: Navigate to Inspections
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnInspectionsLinkText();

		    // Step 4: Initialize page object
		    Inspections inspect = new Inspections(driver);

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      WebElement scrollContainer = driver.findElement(By.cssSelector("div.scroll-box"));
	      
	      // Check if horizontal scroll exists
	      boolean canScroll = (Boolean) ((org.openqa.selenium.JavascriptExecutor) driver)
	          .executeScript("return arguments[0].scrollWidth > arguments[0].clientWidth", scrollContainer);
	      
	      Assert.assertTrue(canScroll, "No horizontal scroll available");
	      
	      // Scroll to right and verify Action column becomes visible
	      ((org.openqa.selenium.JavascriptExecutor) driver)
	          .executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", scrollContainer);
	      
	      WebElement actionColumn = scrollContainer.findElement(By.xpath(".//span[text()='Action']"));
	      Assert.assertTrue(actionColumn.isDisplayed(), "Action column not visible after scroll");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  // Pagination Test
	  
	  
	  @Test
		public void TC_038_Default_ShowRows_Value() throws Throwable
		{
			LoginPage lp = new LoginPage(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			hp.ClickOnTicketsLinkText();
			Tickets tkt = new Tickets(driver);
			

			    // Wait until the Show Rows dropdown is visible
			    WebElement showRowsDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//div[contains(@class, 'show-rows')]/select[@id='RowPerPage']")));

			    // Create Select object
			    Select rowSelect = new Select(showRowsDropdown);

			    // Get default selected value
			    String selectedValue = rowSelect.getFirstSelectedOption().getText();
			    System.out.println("Default selected value: " + selectedValue);

			    // Assert that the default is "10"
			    Assert.assertEquals(selectedValue, "10", "Default selected value should be 10");

		}
			
		@Test
		public void TC_039_verifyAvailableOptionsInShowRowsDropdown() {
			
			LoginPage lp = new LoginPage(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			hp.ClickOnTicketsLinkText();
			Tickets tkt = new Tickets(driver);
		

		    // Wait for the Show Rows dropdown to be visible
		    WebElement showRowsDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//div[contains(@class, 'show-rows')]/select[@id='RowPerPage']")));

		    // Create Select object
		    Select rowSelect = new Select(showRowsDropdown);

		    // Get all dropdown options
		   java.util.List<WebElement> options = rowSelect.getOptions();
		     ArrayList actualOptions = new ArrayList<>();

		    for (WebElement option : options) {
		        actualOptions.add(option.getText().trim());
		    }

		    // Expected options
		     java.util.List<String> expectedOptions = Arrays.asList("10", "20", "30", "40");

		    // Log actual options
		    System.out.println("Dropdown options: " + actualOptions);

		    // Assertion
		    Assert.assertEquals(actualOptions, expectedOptions, "Dropdown options should match expected values.");
		}
			
		@Test
		public void verifyRowCountUpdatesWhenDifferentValueSelected_TC_TKT41() {
			
			LoginPage lp = new LoginPage(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			hp.ClickOnTicketsLinkText();
			Tickets tkt = new Tickets(driver);
		
		  
			// Select “20” in the Show Rows dropdown
			WebElement showRowsDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("(//select[@id='RowPerPage'])[1]")));

			Select select = new Select(showRowsDropdown);
			select.selectByValue("20");

			// Verify "20" is selected
			String selectedOption = select.getFirstSelectedOption().getText().trim();
			System.out.println("Selected option: " + selectedOption);

			// Assert that the selected option is "20"
			Assert.assertEquals(selectedOption, "20", "Expected selected option to be '20' but was '" + selectedOption + "'");

			// Optional: also verify dropdown is displayed and enabled
			Assert.assertTrue(showRowsDropdown.isDisplayed(), "Dropdown should be visible");
		}
		
		@Test
		public void TC_041_Pagination_Numbers_Visible() {
			LoginPage lp = new LoginPage(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			hp.ClickOnTicketsLinkText();
			Tickets tkt = new Tickets(driver);

		    // Wait until pagination section is visible
		    WebElement paginationSection = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.cssSelector("section.pagination")));

		    // Verify page numbers 1 to 5 are visible
		    for (int i = 1; i <= 5; i++) {
		        WebElement pageNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//ul/li/a[text()='" + i + "']")));
		        Assert.assertTrue(pageNumber.isDisplayed(), "Page number " + i + " should be visible");
		    }

		    // Verify Prev button
		    WebElement prevButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//ul/li/a/div/img[@alt='Prev']")));
		    Assert.assertTrue(prevButton.isDisplayed(), "Prev button should be visible");

		    // Verify Next button
		    WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//ul/li/a/div/img[@alt='Next']")));
		    Assert.assertTrue(nextButton.isDisplayed(), "Next button should be visible");

		    // Verify Jump to Page dropdown
		    WebElement jumpToPageDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//ul[@class='jump-to']//select")));
		    Assert.assertTrue(jumpToPageDropdown.isDisplayed(), "'Jump to page' dropdown should be visible");

		    System.out.println("Pagination controls 1 to 5 and navigation buttons are visible.");
		}

		
		@Test
		public void TC_042_Pagination_Page2_LoadsCorrectly() {
			LoginPage lp = new LoginPage(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			hp.ClickOnTicketsLinkText();
			Tickets tkt = new Tickets(driver);

			   // Click page 2 button in pagination
		    WebElement page2Button = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//ul/li/a[text()='2']")
		    ));
		    page2Button.click();

		    // Wait until page 2 is marked active (the <li> containing the <a> with text '2' has class 'active')
		    wait.until(driver1 -> {
		        WebElement activePage2Li = driver1.findElement(By.xpath("//ul/li[a/text()='2']"));
		        String classes = activePage2Li.getAttribute("class");
		        System.out.println("Current active class for page 2 <li>: " + classes);
		        return classes != null && classes.contains("active");
		    });

		    // Verify that rows/items exist on page 2 (change xpath to match your rows)
		     java.util.List<WebElement> rows = driver.findElements(
		        By.xpath("//ul[contains(@class, 'assets-list')]//ul[contains(@class, 'tr')]")
		    );
		    Assert.assertFalse(rows.isEmpty(), "Expected rows to be present on page 2");

		    System.out.println("Rows found on page 2: " + rows.size());
		}

		@Test
		public void TC_043_JumpToPage_Dropdown_Options() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    HomePage hp = new HomePage(driver);
		    hp.ClickOnTicketsLinkText();

		    WebElement jumpDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.cssSelector("ul.jump-to select")
		    ));

		    if (jumpDropdown.isDisplayed()) {
		         java.util.List<WebElement> options = jumpDropdown.findElements(By.tagName("option"));
		        System.out.println("Jump to Page options:");

		        for (WebElement option : options) {
		            System.out.println(option.getText());
		        }
		    } else {
		        System.out.println("Jump to Page dropdown is not displayed.");
		    }
		}
		
		@Test
		public void jumpToPage4AndVerify_TC_TKT45() {

			LoginPage lp = new LoginPage(driver);
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			hp.ClickOnTicketsLinkText();

			// Wait for jump-to dropdown to be present
		    WebElement jumpDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@id='RowPerPage'])[2]")));
		    Select select = new Select(jumpDropdown);
		    select.selectByVisibleText("4"); // Jump to page 4

		 // Verify if "4" is selected
		    String selectedOption = select.getFirstSelectedOption().getText();

		    if (selectedOption.equals("4")) {
		        System.out.println("✅ Option '4' is successfully selected.");
		    } else {
		        System.out.println("❌ Option '4' is not selected. Current selection: " + selectedOption);
		    }


			      
		}

}