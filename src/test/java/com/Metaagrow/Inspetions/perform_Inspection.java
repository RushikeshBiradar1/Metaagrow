package com.Metaagrow.Inspetions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Inspections;
import com.MetaaGrow.ObjectRepository.LoginPage;

public class perform_Inspection extends BaseClass{
	@Test
	public void testEditAndSubmitResponse() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnInspectionsLinkText();
		Inspections inspect = new Inspections(driver);
	    // Step 1: Find all three-dot menu buttons
	    List<WebElement> menuButtons = driver.findElements(By.cssSelector("button.more#changeBUton"));
	    
	    // Example: click on the first menu (index 0)
	    int index = 0;
	    WebElement menuBtn = menuButtons.get(index);
	    menuBtn.click();
	    Thread.sleep(500);

	    // Step 2: Click on "Edit" from dropdown
	    // Assuming "Edit" is inside <li><a> tag
	    List<WebElement> editOptions = driver.findElements(By.xpath("//a[contains(text(),'Edit')]"));
	    editOptions.get(index).click();
	    Thread.sleep(500);


	 // get all question response groups
	    List<WebElement> allQuestions = driver.findElements(
	            By.xpath("//div[contains(@class,'dropContentDiv')]")
	    );

	    Random random = new Random();

	    for (int i = 0; i < allQuestions.size(); i++) {

	        WebElement qBlock = allQuestions.get(i);

	        // Find Yes / No / Not Applicable inside this question block
	        List<WebElement> responseButtons = qBlock.findElements(
	                By.xpath(".//button[contains(@class,'nonActionButton')]")
	        );

	        // Random selection for this question
	        int randomIndex = random.nextInt(responseButtons.size());
	        responseButtons.get(randomIndex).click();

	        Thread.sleep(400);
	    }

	    // --------------------------------------------
	    // Step 4: Enter reason in textarea
	    // --------------------------------------------
	    WebElement reasonText = driver.findElement(By.xpath("//textarea[@placeholder='Enter Reason* ']"));
	    reasonText.sendKeys("Automated test reason entry.");

	    Thread.sleep(500);

	    // --------------------------------------------
	    // Step 5: Click on Update button
	    // --------------------------------------------
	    WebElement updateBtn = driver.findElement(By.xpath("//button[span[text()='Update']]"));

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(updateBtn));

	    updateBtn.click();
	 // Step 6: Click final OK button (modal close)
	 // --------------------------------------------
	 WebElement okBtn = driver.findElement(By.xpath("(//button[@id='backClicked'])[3]"));
	 wait.until(ExpectedConditions.elementToBeClickable(okBtn));

	 okBtn.click();
	 
	// Step 7: Verify "4/4" is displayed on listing page
	// --------------------------------------------

	WebDriverWait waitVerify = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement responseCount = waitVerify.until(
	        ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//span[@title='4/4' or text()='4/4']")
	        )
	);

	// Validation
	String actualText = responseCount.getText().trim();
	Assert.assertEquals(actualText, "4/4", "Verification Failed: Not all responses were submitted.");

	System.out.println("✔ Verification Passed — Listing shows: " + actualText);
	}


}
