package Sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class prptyex extends BaseClass {
	@Test
	public void prpty() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp=new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		
//		driver.findElement(By.xpath("//span[normalize-space()='Filter']")).click();
		//Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[text()='Select Property']")).click();
		//driver.findElement(By.xpath("//div[@id='custom']//input[@id='cusstom']")).sendKeys("Abc");
		//Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Search Code']")).sendKeys("HEy");
//		driver.findElement(By.xpath("//span[text()='Apply5']")).click();
		//span[text()='Clear']
//		driver.findElement(By.xpath("//ul[@class='reports-block']//span[@id='custom']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@routerlink='/property-add']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@alt='Reports Add']")).click();
		Thread.sleep(3000);
		
	}

}
