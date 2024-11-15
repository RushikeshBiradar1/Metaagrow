package Sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;
import com.google.common.io.Files;

public class scrnsht extends BaseClass{
	@Test
	public void Scrnsht() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp=new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		driver.findElement(By.xpath("//span[normalize-space()='Filter']")).click();
		Thread.sleep(3000);
		
		
	}

	

}
