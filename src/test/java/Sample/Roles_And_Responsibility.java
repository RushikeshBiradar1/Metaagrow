package Sample;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Roles_And_Permissions;
import com.MetaaGrow.ObjectRepository.Setup;

public class Roles_And_Responsibility extends BaseClass{
	@Test
	public void Roles_And_Responsibility1() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnRoles_And_PermissionsLinkText();
//		driver.findElement(By.xpath("//button[.='Inactive']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[.='Active']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()=\"Add Role\"]")).click();
//		Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@placeholder='Enter Role Name']")).sendKeys("T1");
//        Thread.sleep(3000);
//        //Original Type Dropdown
//        WebElement dd = driver.findElement(By.xpath("//select[@name=\"origionalType\"]"));
//        Select sel =new Select(dd);
//        sel.selectByVisibleText("Property Admin");
//        Thread.sleep(3000);
//        //RoleTYpe Dropdown
//        WebElement roleType_dd = driver.findElement(By.xpath("//select[@name='type']"));
//        Select sel1=new Select(roleType_dd);
//        sel1.selectByVisibleText("Web App");
//        Thread.sleep(3000);
//        //Select Status Dropdown
//        WebElement status_dd = driver.findElement(By.xpath("//select[@name='isActive']"));
//        Select sel2=new Select(status_dd);
//        sel2.selectByVisibleText("Active");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.findElement(By.xpath("//span[.='Cancel']")).click();
//        //BAck Button
//        driver.findElement(By.xpath("//span[.='Back']")).click();
        //Right Slide Button
//        driver.findElement(By.xpath("//div[@class='col-lg px-0 overflow-auto main-box']//li[5]//a[1]//div[1]")).click();
//        Thread.sleep(3000);
//		driver.findElement(By.xpath("//section[@class='pagination']//li[1]//a[1]")).click();
		
//		WebElement dr = driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-roles-index[@class='ng-star-inserted']/section[@class='pagination']/div[@class='container-fluid']/div[@class='row justify-content-between']/div[@class='col-md-auto']/div[@class='show-rows']/select[1]"));
//	     Select sel=new Select(dr);
//	     sel.selectByVisibleText("20");
//	Thread.sleep(3000);
		//Jump to dropdown
//		WebElement dp = driver.findElement(By.xpath("//ul[@class='jump-to']//select[@id='RowPerPage']"));
//		Select sel=new Select(dp);
//		sel.selectByVisibleText("2");
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='jump-to']//li//a")).click();
		Thread.sleep(2000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0, 1000);");
		  Thread.sleep(5000);
		
	}
	

}