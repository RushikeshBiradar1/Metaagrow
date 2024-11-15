package Sample;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class smplescrsht extends BaseClass{
	@Test
	public void onTestFailure() throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Thread.sleep(3000);
//	    driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[2]/a[1]/div[1]")).click();
//	    Thread.sleep(3000);
	 //   driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[8]/a[1]/div[1]")).click();
	//	Thread.sleep(3000);
		Setup sp=new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Thread.sleep(3000);
   //	driver.findElement(By.xpath("//button[normalize-space()='Inactive']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[normalize-space()='Active']")).click();
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[.='Add Property']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[normalize-space()='Single']")).click();
		driver.findElement(By.xpath("//img[@alt='down arrow']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@routerlink='/property-add']")).click();
         // driver.findElement(By.xpath("//a[.='Bulk']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Property']")).sendKeys("Ram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Property Code']")).sendKeys("56");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Country']")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Zone']")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter city']")).sendKeys("Pune");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Enter city']")).sendKeys("Pune");
	}
		
		
}
