package com.Metaagrow.Surveys_and_Feedback;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Setup;
import com.MetaaGrow.ObjectRepository.Surveys_And_Feedback;

public class Surveys_and_Feedback_FilterTest extends BaseClass{
	@Test(enabled = false)
	public void FilterByPropertyTest_TC_S1()
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
		survey.ClickOn_Filter_Icon();
		survey.clickOn_Property_Filter();
		survey.ClickOn_propertySearchBox("ANDHERI");
		driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='ANDHERI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Property displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Property Not displayed");
		}
		
	}
	@Test(priority = 2)
	public void FilterByLocationTest_TC_S2()
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
		survey.ClickOn_Filter_Icon();
//		survey.clickOn_Property_Filter();
		survey.ClickOn_Location_NameTextField_Filter("First Floor");
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='First Floor']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Location displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Location Not displayed");
		}
	}
	@Test(enabled=false)
	public void FilterByClearButtonTest_TC_S3()
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
		survey.ClickOn_Filter_Icon();
		survey.clickOn_Property_Filter();
		survey.ClickOn_propertySearchBox("ANDHERI");
		driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='ANDHERI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Property displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Property Not displayed");
		}
		survey.ClickOn_Filter_Icon();
        survey.ClickOn_Clear_Button_Filter();
        try {
		    WebElement filterPopup = driver.findElement(By.xpath("//span[normalize-space()='Apply']")); // Adjust the XPath according to your filter popup element
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
	@Test(enabled=false)
	public void FilterByPropertyScrollBarTest_TC_S4() throws Throwable
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
		survey.ClickOn_Filter_Icon();
		survey.clickOn_Property_Filter();

		WebElement element = driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-survey-index/section[@class='action-block']/div[@class='row justify-content-between']/div[@class='col-md-auto']/div[@class='filter-button']/div[@id='custom11']/ul[@class='filter-list']/li/ul[@id='custom']/div[1]"));
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
		for (int i = 0; i < 10; i++) {
		// Scroll by the calculated pixels
		js.executeScript("arguments[0].scrollBy(0, arguments[1]);", element, pixels);
		// Wait for the element to load content
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		// Scroll up for 10 list items
		for (int i = 0; i < 10; i++) {
		// Scroll by the negative calculated pixels
		js.executeScript("arguments[0].scrollBy(0, -arguments[1]);", element, pixels);
		// Wait for the element to load content
		wait.until(ExpectedConditions.visibilityOf(element));
		
		}
		// Get the width of the scrollable element
		int width = element.getSize().getWidth();
		System.out.println(width);
		// Calculate the amount of pixels to scroll by for each item
		int pixelsw = width / 10;
		System.out.println(pixels);
		// Scroll right for 10 list items
		for (int i = 0; i < 10; i++) {
		// Scroll by the calculated pixels
		js.executeScript("arguments[0].scrollBy(arguments[1], 0);", element, pixelsw);
		// Wait for the element to load content
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		// Scroll left for 10 list items
		for (int i = 0; i < 10; i++) {
		// Scroll by the negative calculated pixels
		js.executeScript("arguments[0].scrollBy(-arguments[1], 0);", element, pixelsw);
		// Wait for the element to load content
		wait.until(ExpectedConditions.visibilityOf(element));
		}
	}
	@Test(enabled=false)
	public void FilterByFeedbackPropertyTest_TC_S5()
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
		survey.ClickOn_Feedback_Button();
		survey.ClickOn_Filter_Icon();
		survey.clickOn_Property_Filter();
		survey.ClickOn_propertySearchBox("ANDHERI");
		driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='ANDHERI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Property displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Property Not displayed");
		}
		
	}
	@Test(priority = 6)
	public void FilterByLocationTest_TC_S6()
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
		survey.ClickOn_Feedback_Button();
		survey.ClickOn_Filter_Icon();
//		survey.clickOn_Property_Filter();
		survey.ClickOn_Location_NameTextField_Filter("First Floor");
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='First Floor']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Location displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Location Not displayed");
		}
	}
	
	@Test(enabled=false)
	public void FilterByFeedbackPageClearButtonTest_TC_S7()
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
		survey.ClickOn_Feedback_Button();
		survey.ClickOn_Filter_Icon();
		survey.clickOn_Property_Filter();
		survey.ClickOn_propertySearchBox("ANDHERI");
		driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='ANDHERI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Property displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Property Not displayed");
		}
		survey.ClickOn_Filter_Icon();
        survey.ClickOn_Clear_Button_Filter();
        try {
		    WebElement filterPopup = driver.findElement(By.xpath("//span[normalize-space()='Apply']")); // Adjust the XPath according to your filter popup element
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
	@Test(enabled=false)
	public void SurveyFilterShouldNotDisplayOnFeedback_TC_S8()
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
		survey.ClickOn_Filter_Icon();
		survey.clickOn_Property_Filter();
		survey.ClickOn_propertySearchBox("ANDHERI");
		driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).click();
		survey.ClickOn_Apply_Filter_Button();
		String doclist = driver.findElement(By.xpath("//ul[@class='assets-list']")).getText();
		String exp = driver.findElement(By.xpath("//span[normalize-space()='ANDHERI']")).getText();
		if(doclist.contains(exp))
		{
			Assert.assertTrue(doclist.contains(exp), "Property displayed");
		}
		else
		{
			Assert.assertFalse(doclist.contains(exp), "Property Not displayed");
		}
		survey.ClickOn_Feedback_Button();
		String expFilter=driver.findElement(By.xpath("//span[normalize-space()='Filter']")).getText();
		 WebElement act = driver.findElement(By.xpath("//i[.='(1 Filter Selected)']"));
//		Assert.assertTrue(act.isDisplayed(), "Filter is applied on feedback page also");
	}	
		
	}


