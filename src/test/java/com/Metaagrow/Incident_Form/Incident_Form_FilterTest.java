package com.Metaagrow.Incident_Form;

import static org.testng.Assert.assertTrue;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Dates;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.IncidentForm;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Settings;
import com.MetaaGrow.ObjectRepository.Setup;


public class Incident_Form_FilterTest extends BaseClass{
	
	@Test(enabled = false)
	public void FilterbyPropertyTest_I1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	inc.ClickOn_FilterIcon();
	inc.ClickOn_FilterByProperty();
	inc.Clickon_FilterByPropertySearchBox("THE_DHARAVI");
      driver.findElement(By.xpath("(//a[normalize-space()='THE_DHARAVI'])[1]")).click();
     inc.ClickOn_ApplyFilterButton();
     Assert.assertTrue(driver.findElement(By.xpath("//span[@title='THE_DHARAVI']")).isDisplayed(), "searched property is listed on the page ");
	}
	
	@Test(priority = 2)
	public void FilterbyLocation_I2()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	inc.ClickOn_FilterIcon();
//	inc.ClickOn_FilterByProperty();
//	inc.Clickon_FilterByPropertySearchBox("THE_DHARAVI");
//	 driver.findElement(By.xpath("(//a[normalize-space()='THE_DHARAVI'])[1]")).click();
	inc.ClickOn_FilterByLocation();
	inc.ClickON_FilterByLocationSearchBox("Ground Level");
	driver.findElement(By.xpath("(//a[normalize-space()='Ground Level'])[1]")).click();
     
     inc.ClickOn_ApplyFilterButton();
     Assert.assertTrue(driver.findElement(By.xpath("//span[@title='THE_DHARAVI']")).isDisplayed(), "searched property is listed on the page ");
	}
	@Test(priority = 3)
	public void FilterByAttendiesTo_I3() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	inc.ClickOn_FilterIcon();
	inc.ClickOn_FilterbySelectAttendeesTo();
	Thread.sleep(2000);
	inc.ClickOn_FilterbySelectAttendeesToSearchBox("Biradar");
	driver.findElement(By.xpath("(//a[normalize-space()='Biradar'])[1]")).click();
	inc.ClickOn_ApplyFilterButton();
    Assert.assertTrue(driver.findElement(By.xpath("//span[@title='THE_DHARAVI']")).isDisplayed(), "searched property is listed on the page ");
	
	
	}
	
	@Test(priority = 4)
	public void FilterByStartandDateEndDate_I4() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	inc.ClickOn_FilterIcon();
	Dates date = new Dates();Thread.sleep(1000);
	date.startDate(driver, "Mar-2024", "6");
	Thread.sleep(1000);
//	date.End_Date(driver, "May-2024", "11");
	inc.End_Date(driver, "Mar-2024", "6");
	//wb.WebDriverWait_ElementToBeVisibleMethod("//ul[@class='filter-list']//li//ul//button[@class='button btn-primary']");
	Thread.sleep(1000);
	 inc.ClickOn_ApplyFilterButton();
//	 Thread.sleep(3000);
     Assert.assertTrue(driver.findElement(By.xpath("//span[@title='06 Mar, 2024 04:37 PM']")).isDisplayed(), "searched Date is not listed on the page ");
	
	
	}
	
	@Test(priority = 5)
	public void DownloadIncidentFromInfo_I5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	driver.findElement(By.xpath("//span[@title='INCRUS001']")).click();
	driver.findElement(By.xpath("//span[.='Download']")).click();
//	inc.ClickON_DownloadButton();
	   Footer_and_Header_Common f = new Footer_and_Header_Common(driver);
	   f.ClickOn_Back_Button();
	wb.windowSwitching(driver);
	
	}
	
	@Test(priority = 6)
	public void emailIncidentFrom_I6() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	driver.findElement(By.xpath("//span[@title='INCRUS001']")).click();
	inc.ClickoN_EmailIconOnViewIncidentPage();
//	Thread.sleep(2000);
//	wb.WebDriverWait_ElementToBeVisibleMethod("//input[@formcontrolname='emailid']");
	inc.Clickon_EmailTextFiled("rushi@gmail.com");
	inc.Clickon_EmailSendButton();
	// Create a WebDriverWait instance
	WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15)); // Wait for up to 5 seconds

	// Wait for the success popup to be visible
	WebElement successPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Incident report(s) mailed successfully']")));

	// Assert that the success popup is displayed
	Assert.assertTrue(successPopup.isDisplayed(), "Success pop is not displayed");
driver.findElement(By.xpath("(//button[normalize-space()='Ok'])[1]"));
//Assert.assertTrue(driver.findElement(By.xpath("//p[normalize-space()='Incident report(s) mailed successfully']")).isDisplayed(), "Success pop is not display");
	}
	
	@Test(enabled=false)
	public void emailcancelbuttonIncidentFrom_I7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	driver.findElement(By.xpath("//span[@title='INCRUS001']")).click();
	inc.ClickoN_EmailIconOnViewIncidentPage();
	inc.ClickOn_CancelEmailButton();
	
	}
	
	@Test(enabled=false)
	public void AddIncidentForm_I8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
	sp.ClickOn_IncidentForm();
	
	IncidentForm inc = new IncidentForm(driver);
	inc.ClickOn_AddIncidentIconButton();
//	inc.ClickoN_IncidentDateandTime();
	Thread.sleep(4000);
//	driver.findElement(By.xpath("//td[@aria-label='May 22, 2024']")).click();
//	inc.Select_startDate_and_Time(driver, "May-2024", "10");
//	inc.clickOn_setButtonOn_Incident_Date_Time();
//	Thread.sleep(8000);
	inc.Clickon_PropertyDropdownIncidentForm("THE_DHARAVI");
	Java_Utility ran = new Java_Utility();
	int random = ran.getRandomNum();
	inc.ClickoN_FullName("Rushi" + random);
	inc.ClickOn_phonenumber("123654789");
    inc.ClickOn_emailid("rushi@gmail.com");
    inc.Clickon_GenderDropdown("Male");
    inc.ClickOn_AgeTextField("26");
    inc.ClickON_AddressField("First Floor");
    inc.ClickoN_TypeOfInjury("Elbow Tendonitis."+ random);
    inc.ClickOn_BodyPartInjured("Elbow");
    inc.ClickOn_TreatementDurationTextBox(random+"min");
    inc.ClickOn_CustomerDicision("N/A");
    inc.ClickOn_wereTheFamilyInformed("no");
    inc.ClickOn_CauseOfIncidentTextBox("overuse strain");
    inc.ClickOn_LocationDropdownOnAddPage("Ground Level");
    Thread.sleep(4000);
    inc.CLickOn_AttendiesNameDropedown(" Biradar");
    inc.CLickOn_TeamLeaderDropdown(" Biradar");
    inc.ClickOn_Name_of_the_Ambulance_Caller("Jack"+random);
    inc.ClickON_Contact_details_of_the_Ambulance_Caller("875421"+random);
    inc.Clickon_Name_of_the_First_Aid_Provider_TextField("Martin"+random);
    inc.ClickOn_Contact_details_of_the_First_Aid_Provider_TextField("896523"+random);
    inc.ClickoN_WitnessNameTextBox("nepolean"+random);
    inc.ClickOn_WitnessContactDetailsTextBox("89745123"+random);
    inc.clickon_AdditionalRemark_EnterDetailsTextBox("NA");
    inc.Select_ReportedByDropdown(" Biradar");
    inc.Clickon_CheckedByDropdown("ADAMS");
    inc.ClickOn_ReviewedByDropdown("Biradar");
    inc.ClickOn_ActionTextField("Yes hospitalize");
   
	Thread.sleep(8000);
	inc.ClickOn_CancelButton();
	}

}
