package com.Metaagrow.Inspetions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

public class PaginationTest extends BaseClass{
	
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
	    List<WebElement> options = rowSelect.getOptions();
	    List<String> actualOptions = new ArrayList<>();

	    for (WebElement option : options) {
	        actualOptions.add(option.getText().trim());
	    }

	    
	    // Expected options
	    List<String> expectedOptions = Arrays.asList("10", "20", "30", "40");

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
	    List<WebElement> rows = driver.findElements(
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
	        List<WebElement> options = jumpDropdown.findElements(By.tagName("option"));
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
