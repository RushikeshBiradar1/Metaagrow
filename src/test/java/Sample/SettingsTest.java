package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class SettingsTest extends BaseClass{
	@Test
	public void Setting() throws Throwable
	{
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnSettingsLInkText();
		Thread.sleep(3000);
		WebElement rg = driver.findElement(By.id("region"));
		Select sel=new Select(rg);
		sel.selectByVisibleText(" New York");
		Thread.sleep(3000);
		WebElement cr = driver.findElement(By.id("currency"));
		Select sel1=new Select(cr);
		sel1.selectByVisibleText(" SAR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Ok']")).click();

	}

}
