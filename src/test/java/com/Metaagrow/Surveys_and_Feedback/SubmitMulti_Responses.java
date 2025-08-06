package com.Metaagrow.Surveys_and_Feedback;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;
import com.MetaaGrow.ObjectRepository.Surveys_And_Feedback;

public class SubmitMulti_Responses extends BaseClass {
	
	@Test
	public void Submit() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);

		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);
		     
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		        Surveys_And_Feedback survey = new Surveys_And_Feedback(driver);

		        // Wait for the specific survey link and click
		        WebElement surveyLink = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//a[.='https://myworld.metaagrow.com/customer-feedback-Questions-Overall/MzcxLTEzOTYtNjAx']")));
		        surveyLink.click();

		        wb.windowSwitch(driver); // Assuming this switches to the new tab/window
		        Java_Utility java = new Java_Utility();

		        // Repeat form submission 30 times
		        for (int i = 1; i <= 50; i++) {
		            System.out.println("Submitting form #" + i);

		            int ran = java.getRandomNum();

		            // Wait for form fields
		            WebElement userNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNameInput")));
		            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailInput")));
		            WebElement yesRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='yes']")));
		            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.submit-btn.sticky-bottom")));

		            // Fill the form
		            userNameInput.clear();
		            userNameInput.sendKeys("Rushi" + ran);

		            emailInput.clear();
		            emailInput.sendKeys("rushi" + ran + "@gmail.com");

		            yesRadio.click();
		            submitButton.click();

		            // Optional: wait for confirmation (e.g., success message)
		            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Thank')]")));

		            // Refresh for next submission
		            driver.navigate().refresh();

		            // Ensure form is loaded again before next loop
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNameInput")));
		        }

		        System.out.println("Successfully submitted 30 forms.");
		    
		

	}

	
}
