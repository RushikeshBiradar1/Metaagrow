package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class pminactivetest extends BaseClass{
	@Test
	public void CreatePMWithMandatoryField() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		By PMTemplate = By.xpath("//span[.='PM Templates']");
		WebElement button = wait1.until(ExpectedConditions.elementToBeClickable(PMTemplate));
		pm.ClickOn_PM_Template_Tab();
		 pm.ClickOn_ActionButton();
//		 By InactiveButton = By.xpath("(//a[contains(text(),'Inactive')])[1]");
		 pm.CLickOn_InactiveButton_OnAction();
			Thread.sleep(2000);

			By YesDeactive = By.xpath("//button[.='Yes Deactive']");
			pm.CLickON_YesDeactive_ButtonOnConfirmationPopup();
			
		Thread.sleep(2000);
pm.CLickOn_OkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup();


	     WebElement InactivePM = driver.findElement(By.xpath("//span[contains(text(), 'General Mainten')]"));
	     Assert.assertTrue(InactivePM.isDisplayed(), "Inactive PM is not showing in List");
	     Thread.sleep(3000);
	}
}
