package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class checklistTest extends BaseClass{
	@Test
	public void test() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		
		Setup sp = new Setup(driver);
		sp.ClickOnChecklistLinkText();
		
		driver.findElement(By.xpath("//h4[.='Revenue ']")).click();
		//Thread.sleep(4000);
		
//	driver.findElement(By.xpath("//h4[.='F&B']")).click();
//	Thread.sleep(3000);
		//dropdown of property
	WebElement dp = driver.findElement(By.xpath("(//select[@id='selectUser'])[2]"));
	Select sel=new Select(dp);
	sel.selectByVisibleText("123");

	driver.findElement(By.xpath("//label[@for='116']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[.='Import']")).click();
	}

}
