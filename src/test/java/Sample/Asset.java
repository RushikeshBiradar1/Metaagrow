package Sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Asset extends BaseClass{
	@Test
	public void test() throws Throwable
	{
		HomePage hp=new HomePage(driver);
	hp.ClickOnAssetsLinkText();
		driver.findElement(By.xpath("//span[.='Add']")).click();
		Thread.sleep(3000);
	}

}
