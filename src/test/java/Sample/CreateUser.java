package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class CreateUser extends BaseClass {
	@Test
	public void createusertest() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnUsers_And_TeamsLinkText();


//		driver.findElement(By.xpath("//button[normalize-space()='Deactive']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Active']")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-user-index/div[@class='col-lg']/section[@class='action-block']/div[@class='row justify-content-between']/div[@class='col-md-auto']/div[@class='filter-button']/button[@id='custom']/span[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[1]//button[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[2]//button[1]//span[1]")).click();
//		driver.findElement(By.xpath("//span[.='User Role']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[.='Users Download']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='Sub Users Download']")).click();

		//driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[2]/a[1]/div[1]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[.='Add User']")).click();
//		driver.findElement(By.xpath("//a[.='Single']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("TR");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rsm@gmail.com");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("8532");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Ram@123");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Ram@123");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Designation']")).sendKeys("OK");
//		Thread.sleep(3000);
//
//
//		//proprty
//		WebElement lt = driver.findElement(By.xpath("//select[@formcontrolname='outletId']"));
//		Select sel1=new Select(lt);
//		sel1.selectByVisibleText(" ANDHERI");
//		//
//		//
//		WebElement sUser = driver.findElement(By.xpath("(//select[@id='selectUser'])[1]"));
//		Select sel=new Select(sUser);
//		sel.selectByVisibleText("User");
//
//		Thread.sleep(2000);
//		WebElement department = driver.findElement(By.xpath("//select[@formcontrolname='options']"));
//		Select sel5=new Select(department);
//		sel5.selectByVisibleText(" Housekeeping");
//
//		//UserType
//		WebElement UType = driver.findElement(By.xpath("//select[@formcontrolname='userTypeMobile']"));
//		Select sel3=new Select(UType);
//		sel3.selectByVisibleText("All Permissions (Mobile)");
//
//
//		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("YTR");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile']")).sendKeys("12345");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter Designation']")).sendKeys("Chief");
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//button[@class='button btn-primary']")).click();
     //  driver.findElement(By.xpath("//span[.='Cancel']")).click();
//		driver.findElement(By.xpath("//img[@alt='Next']/ancestor::div[@class='img-box']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@alt='Prev']/ancestor::div[@class='img-box']")).click();
//		Thread.sleep(3000);
		WebElement dp = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[1]"));
		Select sel=new Select(dp);
		sel.selectByVisibleText("30");
		Thread.sleep(5000);
		//sel.deselectAll();
		//driver.findElement(By.xpath(""))
   

	}


}
