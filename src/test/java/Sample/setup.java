package Sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Properties1;

public class setup extends BaseClass{
	@Test
	public void Test4() throws Throwable
	{
	
		HomePage hp=new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
	//	Properties1 p = new Properties1(driver);
//	
//		driver.findElement(By.id("Departments")).click();
//		Thread.sleep(4000);
//		//p.ClickOnBackButton();
//		hp.ClickOnSetupLinkText();
//		driver.findElement(By.id("Properties")).click();
//		Thread.sleep(3000);
//	
//		hp.ClickOnSetupLinkText();
//
//		driver.findElement(By.id("Roles")).click();
//		Thread.sleep(3000);
//		//p.ClickOnBackButton();
//		driver.findElement(By.id("Users")).click();
//		Thread.sleep(2000);
		//driver.findElement(By.id("Checklists")).click();
//driver.findElement(By.id("Document")).click();
		//driver.findElement(By.id("Surveys")).click();
		driver.findElement(By.id("Settings")).click();
		Thread.sleep(2000);

	}

}
