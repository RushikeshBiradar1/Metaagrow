package com.Metaagrow.Maintenance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class Upcoming_FiltersTest extends BaseClass{
	
	
	@Test(priority = 3)
	public void UpcomingPageTest_TC_PM3() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Upcoming_Button();


	}
	
	@Test(priority = 16)
	public void Upcoming_FilterByAsset_TC_PM16() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Upcoming_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();

		pm.Clickon_Filter_By_selectAsset();

		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();
		Thread.sleep(3000);
		pm.ClickOn_Apply_Button();
		Thread.sleep(4000);
		// Explicit wait to ensure element is present and visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Foos Ball'][normalize-space()='Foos Ball'])[11]")));

		// Assertion
		Assert.assertTrue(element.isDisplayed(), "PM is not showing in List");

	}
	@Test(priority = 17)
	public void Upcoming_FilterBy_PMName_TC_PM17() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Upcoming_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("(//span[@title='Bowling Maintenance'][normalize-space()='Bowling Ma...'])[11]")).isDisplayed(), "PM is not showing in List");
	}
	@Test(priority = 18)
	public void Upcoming_FilterByAssignedTo_TC_PM18() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Upcoming_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_Assigned_To();
		pm.ClickOn_FilterByAssignedToSearchBoxTodaysTab("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		Thread.sleep(3000);
		pm.ClickOn_Apply_Button();
		//		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Mikhail')]")).isDisplayed(), "PM is not showing in List");

		WebElement element = driver.findElement(By.xpath("(//li[@title='Rishikesh,Mikhail,Ghassan Assi,Agney'])[1]"));

		// Extract the value of the title attribute
		String titleAttributeValue = element.getAttribute("title");

		// Perform the assertion to check if "Mikhail" is present in the title attribute
		Assert.assertTrue(titleAttributeValue.contains("Mikhail"), "Mikhail is not present in the title attribute");

		System.out.println("Assertion passed: Mikhail is present in the title attribute.");

	}

	@Test(priority = 19)
	public void Upcoming_FilterByAllUpcomingPage_TC_PM19() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Upcoming_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.Clickon_Filter_By_selectAsset();
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Filter_By_Assigned_To();
		pm.ClickOn_FilterByAssignedToSearchBoxTodaysTab("Mikhail");
		driver.findElement(By.xpath("//a[.='Mikhail']")).click();
		pm.ClickOn_Apply_Button();
		//		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Foos Ball'][normalize-space()='Foos Ball'])[11]")));

		// Assertion to verify asset name
		Assert.assertTrue(element.isDisplayed(), "PM is not showing in List");

		// verify PM name
		Assert.assertTrue(driver.findElement(By.xpath("(//span[@title='Bowling Maintenance'][normalize-space()='Bowling Ma...'])[11]")).isDisplayed(), "PM is not showing in List");

		// verify assiged user
		WebElement element1 = driver.findElement(By.xpath("(//li[@title='Rishikesh,Mikhail,Ghassan Assi,Agney'])[1]"));

		// Extract the value of the title attribute
		String titleAttributeValue = element1.getAttribute("title");

		// Perform the assertion to check if "Mikhail" is present in the title attribute
		Assert.assertTrue(titleAttributeValue.contains("Mikhail"), "Mikhail is not present in the title attribute");

		System.out.println("Assertion passed: Mikhail is present in the title attribute.");



	}
	@Test(priority = 20)
	public void Upcoming_FilterByClearButtonTest_TC_PM20() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Overdue_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterbyClear_Button();
	}

	@Test(priority = 21)
	public void Upcoming_FilterByStartAndEndDate_TC_21() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Upcoming_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		Dates date = new Dates();

		
		pm.FilterByUpcomingStartDate(driver);

		// select 2nd next date from current date
		pm.End_DateOnUpcomingFilter(driver);
		
		
		Thread.sleep(5000);
		//	Actions actions = new Actions(driver);
		//	actions.sendKeys(Keys.ESCAPE).perform();

		pm.ClickOn_Apply_Button();
	
	}
}
