package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class selectClass extends BaseClass{
	@Test
	public void selectmethod() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
	Setup st=new Setup(driver);
	st.ClickOnChecklistLinkText();	Thread.sleep(3000);

	driver.findElement(By.xpath("//h4[normalize-space()='Revenue']")).click();
	Thread.sleep(3000);
	WebDriver_Utility wb=new WebDriver_Utility();
	WebElement d = driver.findElement(By.xpath("(//select[@id='selectUser'])[2]"));
	
//	Select sl=new Select(d);
//	sl.selectByValue("951");
	

wb.selectByValue(d, "951");
	Thread.sleep(3000);
	
	}
	

}
