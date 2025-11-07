package com.Metaagrow.Maintenance;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.Excel_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class EditTest  extends com.MetaaGrow.Generic_Utility.BaseClass{
	
	@Test
	public void editTest() throws Throwable
	{

		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		WebElement prpdwn = driver.findElement(By.xpath("//select[@id=\"language\"]"));
		Select sel = new Select(prpdwn);
		sel.selectByVisibleText("Murouj");
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		driver.findElement(By.xpath("//span[@title='Asset 1']/ancestor::li//button[@id='changeBUton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit' and not(ancestor::*[contains(@style, 'display: none')])]")).click();
		Excel_Utility ex = new Excel_Utility();
		
		
		  // Click on the End Date input field to open the date picker
	    LocalDate today = LocalDate.now();
	    LocalDate endDate = today.plusDays(9);

	    String targetMonthYear = endDate.format(DateTimeFormatter.ofPattern("MMM-yyyy"));
	    String targetDay = String.valueOf(endDate.getDayOfMonth());

	    System.out.println("Target Day: " + targetDay);
	    System.out.println("Target Month-Year: " + targetMonthYear);

	    // Click on the End Date input field to open the date picker
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement endDateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='endDate']")));
	    endDateInput.click();

	    // Loop until the target month-year is displayed
	    boolean monthYearFound = false;
	    while (!monthYearFound) {
	        // Extract the text of the currently displayed month-year in the date picker
	        WebElement monthYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]"))); 
	        String displayedMonthYear = monthYearElement.getText().trim(); // Format should be "Aug-2024"
	        System.out.println("Displayed Month-Year: " + displayedMonthYear);

	        // Check if the displayed month-year matches the target month-year
	        if (displayedMonthYear.equals(targetMonthYear)) {
	            monthYearFound = true; // Exit the loop if the target month-year is reached
	        } else {
	            // Click on the right arrow to navigate to the next month
	            WebElement nextMonthButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Next month']")));
	            nextMonthButton.click();

	            // Wait for the month-year to change (use WebDriverWait to handle timing better)
	            wait.until(ExpectedConditions.stalenessOf(monthYearElement)); // Wait for the element to go stale (ensure it's refreshed)
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//spani8[@class='owl-dt-control-content owl-dt-control-button-content'])[2]"))); // Wait until the new month-year is displayed
	        }
	    }

	    // Click on the target day in the calendar
	    WebElement targetDayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space(text())='" + targetDay + "']")));
	    targetDayElement.click();
	    System.out.println("Selected Day: " + targetDay);

		//a[text()='Edit' and not(ancestor::*[contains(@style, 'display: none')])]

//		pm.ClickOn_ActionButton();
//		pm.ClickOn_Editbutton_OnAction();
//		Java_Utility java = new Java_Utility();
//		String PM_Name ="General Maintenance" + java.getRandomNum();
//
//		wb.BackSpaceMethod("(//input[@formcontrolname='name'])[1]", driver);
//		Thread.sleep(3000);
//		pm.ClickOn_Template_Name_TextField(PM_Name);
//		pm.CLickOn_SubmitButton_OnEditPmTemplate();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		By buttonLocator = By.xpath("(//button[@type='button'][normalize-space()='Ok'])[1]");
//		WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
//		pm.clickOn_OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage();
//		WebElement ActivePM = driver.findElement(By.xpath("//span[contains(text(), '" + PM_Name + "')]"));
//		System.out.println(ActivePM);
//		Assert.assertTrue(ActivePM.isDisplayed(), "Active PM is not showing in List");
//		Thread.sleep(3000);
	}

}
