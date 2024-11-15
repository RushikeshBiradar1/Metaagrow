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

public class Completed_FiltersTest extends BaseClass {
	
	@Test(priority = 4)
	public void CompletedPageTest_TC_PM4() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Completed_Button();


	}
	
	
	@Test(priority = 22)
	public void Completed_FilterByAsset_TC_PM22() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		By buttonLocator = By.xpath("//section[@class='action-block']//button[4]");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		        button.click();
//		pm.ClickOn_Completed_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();

		pm.Clickon_Filter_By_selectAsset();


		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();
		Thread.sleep(3000);
		pm.ClickOn_Apply_Button();
		Thread.sleep(4000);
		// Explicit wait to ensure element is present and visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Foos Ball'][normalize-space()='Foos Ball'])[1]")));

		// Assertion
		Assert.assertTrue(element.isDisplayed(), "PM is not showing in List");

	}
	@Test(priority = 23)
	public void Completed_FilterBy_PMName_TC_PM23() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		By buttonLocator = By.xpath("//section[@class='action-block']//button[4]");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(buttonLocator));
button.click();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("(//span[@title='Bowling Maintenance'][normalize-space()='Bowling Ma...'])[1]")).isDisplayed(), "PM is not showing in List");
	}
	@Test(priority = 24)
	public void Completed_FilterByAssignedTo_TC_PM24() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		By buttonLocator = By.xpath("//section[@class='action-block']//button[4]");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(buttonLocator));
	button.click();
//		pm.ClickOn_Completed_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.CLickOn_Filter_By_Completed_By();
		pm.ClickOn_CompletedBySearchBox("Olga");
		driver.findElement(By.xpath("(//a[normalize-space()='Olga'])[1]")).click();
		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@title='Olga']")).isDisplayed(), "Completed by user is not in the List");

	}
	@Test(priority = 25)
	public void Completed_FilterByAllTest_TC_PM25() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		By buttonLocator = By.xpath("//section[@class='action-block']//button[4]");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		pm.ClickOn_Completed_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.Clickon_Filter_By_selectAsset();
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.CLickOn_Filter_By_Completed_By();
		pm.ClickOn_CompletedBySearchBox("Olga");
		driver.findElement(By.xpath("(//a[normalize-space()='Olga'])[1]")).click();
		pm.ClickOn_Apply_Button();
		//		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Foos Ball'][normalize-space()='Foos Ball'])[1]")));

		// Assertion to verify asset name
		Assert.assertTrue(element.isDisplayed(), "PM is not showing in List");

		// verify PM name
		Assert.assertTrue(driver.findElement(By.xpath("(//span[@title='Bowling Maintenance'][normalize-space()='Bowling Ma...'])[1]")).isDisplayed(), "PM is not showing in List");

		// verify Completed By user


		// Perform the assertion to check if "Mikhail" is present in the title attribute
		Assert.assertTrue(driver.findElement(By.xpath("//span[@title='Olga']")).isDisplayed(), "Completed by user is not in the List");

		System.out.println("Assertion passed: Olga is present in the Completed By Column");



	}
	@Test(priority = 26)
	public void Completed_FilterByClearButtonTest_TC_PM26() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		By buttonLocator = By.xpath("//section[@class='action-block']//button[4]");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		pm.ClickOn_Completed_Button();

		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_Filter_By_PM_Name_TextField("Bowling Maintenance");
		pm.ClickOn_Apply_Button();

		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Bowling')]")).isDisplayed(), "PM is not showing in List");
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.ClickOn_FilterbyClear_Button();
	}
	@Test(priority = 27)
	public void Completed_FilterByStartAndEndDate_TC_27() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		By buttonLocator = By.xpath("//section[@class='action-block']//button[4]");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		pm.ClickOn_Completed_Button();
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		Dates date = new Dates();

		date.startDate(driver, "Aug-2024", "2");

		pm.End_Date_OnCompletedFilter(driver, "Aug-2024", "2");
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).perform();

		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='02 Aug, 2024']")).isDisplayed(), "2 Aug PM is not showing in List");


	}
}
