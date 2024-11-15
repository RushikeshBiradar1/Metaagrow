package Properties;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.Footer_and_Header_Common;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Properties1;
import com.MetaaGrow.ObjectRepository.Setup;

public class Properties extends BaseClass {
	@Test(enabled = false)
	public void ActivePagePropertyFilterTest_TC_P1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		prop.ClickOnFilterIcon();
		prop.ClickOn_Filter_By_Property();
		prop.ClickOn_Filter_By_Property_SearchBox("ANDHERI");
		driver.findElement(By.partialLinkText("ANDHERI")).click();
		prop.ClickOn_ApplyButton();
		Assert.assertTrue(driver.findElement(By.partialLinkText("ANDHERI")).isDisplayed(), "Applied Filter is not showing on Active Page in this user account");

		
	}
	@Test(priority = 2)
	public void ActivePageSearchCodeFilterTest_TC_P2()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		prop.ClickOnFilterIcon();
		prop.ClickOn_Filter_By_Search_Code("2456");
		prop.ClickOn_ApplyButton();
//		String actual = driver.findElement(By.xpath("//span[@title='2456']")).getText();
//		String Expected = driver.findElement(By.xpath("//span[@title='2456']")).getText();

//		Assert.assertEquals(actual, Expected, "Applied Filter is not showing on Active Page in this user account");
		assertTrue(driver.findElement(By.partialLinkText("k1")).isDisplayed(), "Applied property filter is not showing");

	}
	@Test(enabled = false)
	public void InactivePropertyFilterTest_TC_P3()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		prop.ClickOnFilterIcon();
		prop.ClickOn_Filter_By_Property();
		prop.ClickOn_Filter_By_Property_SearchBox("Thana");
//		assertTrue(driver.findElement(By.xpath("(//a[normalize-space()='ANDHERI'])[1]")).isDisplayed(), "This Property is not in a list");
//        SoftAssert sa=new SoftAssert();
//        sa.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'ANDHERI')]")).isDisplayed(), "This Property is not in a list");
//	sa.assertAll();
		//a[contains(text(),'Thana')]
		 List<WebElement> matchingElements = driver.findElements(By.xpath("//a[contains(text(),'Thana')]"));

		    // Check if the list is empty, indicating that the element is not present
		    if (matchingElements.isEmpty()) {
		        System.out.println("The searched property is not showing in the filter.");
	
		    } else {
		        System.out.println("The searched property is still showing in the filter.");
		     
		    }
	
	}
	
	@Test(enabled = false)
	public void InActivePagePropertyFilterTest_TC_P4()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		prop.ClickOnInActiveButton();
		prop.ClickOnFilterIcon();
		prop.ClickOn_Filter_By_Property();
		prop.ClickOn_Filter_By_Property_SearchBox("JPNg1");
		driver.findElement(By.partialLinkText("JPNg1")).click();
		prop.ClickOn_ApplyButton();
		assertTrue(driver.findElement(By.partialLinkText("JPNg1")).isDisplayed(), "Applied property filter is not showing");
	}
	
	@Test(priority = 5)
	public void InActivePageSearchCodeFilterTest_TC_P5()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		prop.ClickOnInActiveButton();
		prop.ClickOnFilterIcon();
		prop.ClickOn_Filter_By_Search_Code("1477");
		prop.ClickOn_ApplyButton();
		assertTrue(driver.findElement(By.partialLinkText("JPNg1")).isDisplayed(), "Applied property filter is not showing");

	}
	@Test(enabled = false)
	public void ActivePropertyFiltertestOn_InactivePage_TC_P6()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		
		prop.ClickOnInActiveButton();
		prop.ClickOnFilterIcon();
		prop.ClickOn_Filter_By_Property();
		prop.ClickOn_Filter_By_Property_SearchBox("ANDHERI");

		String act = driver.findElement(By.xpath("(//div[@id='custom'])[7]")).getText();
		String exp = "ANDHERI";

	    if (act.contains(exp)) {
	        System.out.println("Test Failed: The expected property is present in the list.");
	    } else {
	        System.out.println("Test Passed: The expected property is not present in the list.");
	    }
//		SoftAssert soft = new SoftAssert();
//		
//		soft.assertAll();
	}

		// Function to check if element is present
		
		   
		
	
	
	@Test(priority = 7)
	public void DeactivatePropertyByActionButtonTest_TC_P7() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		driver.findElement(By.xpath("(//div[@id='changeBUton'])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Deactivate')])[1]")).click();
		Thread.sleep(2000);
		prop.ClickOn_OKButton_OnconfirmPopup();
	}
	
	@Test(priority = 9)
	public void ActivatePropertyByActionButtonTest_TC_P8() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
        prop.ClickOnInActiveButton();
        Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='changeBUton'])[11]")).click();
		Thread.sleep(2000);
driver.findElement(By.xpath("(//a[contains(text(),'Activate')])[1]")).click();
		Thread.sleep(2000);
		prop.ClickOn_OKButton_OnconfirmPopup();
	}
	
//	@Test(priority = 8)
	@Test(enabled = false)
	public void DeactivatePropertyByRadioButtonTest_TC_P9() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		driver.findElement(By.xpath("//label[@for='1005check']")).click();
		prop.ClickOnDeactivateButton();
		Thread.sleep(2000);
		prop.ClickOn_OKButton_OnconfirmPopup();
	}
	
	@Test(priority = 10)
	public void ProprtyInfoPageTest_TC_P10()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		WebElement propdrop = driver.findElement(By.xpath("//select[@id='language']"));
		Select sel=new Select(propdrop);
		sel.selectByVisibleText("ANDHERI");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='ANDHERI']")));
		
		driver.findElement(By.xpath("//span[@title='ANDHERI']")).click();
		prop.clickOn_InfoTab();
		prop.clickOn_LocationsTab();
		prop.clickOn_Assigned_UsersTab();
		
	}
	@Test(enabled = false)
	public void CreateSinglePropertyWith_All_Mandatory_Details_TC_P11() throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
        wb.ImplicitlyWait(driver);
        Java_Utility java = new Java_Utility();
       int random = java.getRandomNum();
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		driver.manage().window().maximize();
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		Thread.sleep(2000);
		prop.ClickOn_Add_Property_Button();
		Thread.sleep(2000);
		prop.ClickOnAddSinglePropertyButton();
		prop.ClickOn_PropertyNameTextField("Fun House"+random);
		prop.ClickOn_countryNameTextField("India");
		prop.ClickOn_CityNameTextField("Mumbai");
		prop.ClickOn_Location_Name_TextField("Third Floor");
		prop.ClickOn_RadiousTextField("1000");
		prop.clickOn_NextButton();
		prop.ClickOn_SubmitButton();
		Thread.sleep(2000);
		prop.ClickOn_OKButton_OnconfirmPopup();
		driver.navigate().refresh();
		
		
	}
	@Test(enabled = false)
	public void CreateSingleProperty_withAllDetails_TC_P12() throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
        wb.ImplicitlyWait(driver);
        Java_Utility java = new Java_Utility();
       int random = java.getRandomNum();
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		Thread.sleep(2000);
		prop.ClickOn_Add_Property_Button();
		Thread.sleep(2000);
		prop.ClickOnAddSinglePropertyButton();
		prop.CreateProperty_Page("Xtream House"+random, "007", "India", "East", "Mumbai", "Second Floor", "CSML, Andheri - Kurla Road, Chakala, Andheri East, Mumbai, Maharashtra, India", "1000");
		prop.clickOn_NextButton();
		prop.ClickOn_SubmitButton();
		Thread.sleep(2000);
		prop.ClickOn_OKButton_OnconfirmPopup();
		driver.navigate().refresh();
	}
	
	@Test(enabled = false)
	public void CancelButtonOnCreatepropertypage_TC_P14() throws Throwable
	{
			WebDriver_Utility wb = new WebDriver_Utility();
	        wb.ImplicitlyWait(driver);
	        Java_Utility java = new Java_Utility();
	       int random = java.getRandomNum();
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnProPropertiesLinkText();
			Properties1 prop = new Properties1(driver);
			Thread.sleep(2000);
			prop.ClickOn_Add_Property_Button();
			Thread.sleep(2000);
			prop.ClickOnAddSinglePropertyButton();
			prop.ClickOn_CancelButton();
			assertTrue(driver.findElement(By.xpath("//section[@class='section-header']")).isDisplayed(), "Create property page is not cancelled");

	}
	@Test(enabled = false)
	public void CloseButtonOnCreatepropertypageandOnconfirmPage_TC_P15() throws Throwable
	{
			WebDriver_Utility wb = new WebDriver_Utility();
	        wb.ImplicitlyWait(driver);
	        Java_Utility java = new Java_Utility();
	       int random = java.getRandomNum();
			LoginPage lp = new LoginPage(driver);
			lp.ClickOn_LoginNotification_Icon(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOnSetupLinkText(driver);
			Setup sp = new Setup(driver);
			sp.ClickOnProPropertiesLinkText();
			Properties1 prop = new Properties1(driver);
			Thread.sleep(2000);
			prop.ClickOn_Add_Property_Button();
			Thread.sleep(2000);
			prop.ClickOnAddSinglePropertyButton();
			prop.clickOn_CloseButton_ONConfirmPage();
			assertTrue(driver.findElement(By.xpath("//section[@class='section-header']")).isDisplayed(), "Create property page is not cancelled");
			Thread.sleep(2000);
			prop.ClickOn_Add_Property_Button();
			Thread.sleep(2000);
			prop.ClickOnAddSinglePropertyButton();
			prop.CreateProperty_Page("Xtream House"+random, "007", "India", "East", "Mumbai", "Second Floor", "CSML, Andheri - Kurla Road, Chakala, Andheri East, Mumbai, Maharashtra, India", "1000");
			prop.clickOn_NextButton();
			prop.clickOn_CloseButton_ONConfirmPage();
			assertTrue(driver.findElement(By.xpath("//section[@class='section-header']")).isDisplayed(), "Create property page is not cancelled");

	}
	
	@Test(priority = 1)
	public void ShowRowsDropdownTest_TC_P13()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Show_Rows_Dropdown("30");
		List<WebElement> row = driver.findElements(By.xpath("(//ul[@class='assets-list'])[1]"));
		
		System.out.println(row.size());
		
	}
	@Test(priority = 16)
	public void Right_and_LeftSLideArrowwTest() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		Thread.sleep(2000);
		footer.ClickOn_Right_Slide_Arrow();
		Thread.sleep(2000);
		footer.ClickOn_Left_Slide_Arrow();
		
	}
	@Test(priority = 17)
	public void JumToPageDropdownTest_TC_P17()
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Properties1 prop = new Properties1(driver);
		Footer_and_Header_Common footer = new Footer_and_Header_Common(driver);
		footer.ClickOn_Jump_To_Page_Dropdown_By_VisibleText("2");
	}

}
