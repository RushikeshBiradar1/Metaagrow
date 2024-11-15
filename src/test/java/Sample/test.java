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
import com.MetaaGrow.ObjectRepository.Properties1;
import com.MetaaGrow.ObjectRepository.Setup;

public class test extends BaseClass {
	@Test
	
	public void Todays_FilterByAsset_TC_PM5() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_Filter_Tab_Maintenance_HomePage();
		pm.Clickon_Filter_By_selectAsset();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")));		
		pm.ClickOn_Filter_By_Asset_SearchBox("Foos Ball");
		driver.findElement(By.xpath("//a[normalize-space()='Foos Ball']")).click();

		pm.ClickOn_Apply_Button();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@title,'Foos Ball')]")).isDisplayed(), "PM is not showing in List");
	}

}
