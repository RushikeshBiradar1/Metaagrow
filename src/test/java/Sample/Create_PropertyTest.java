package Sample;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Properties1;
import com.MetaaGrow.ObjectRepository.Setup;

public class Create_PropertyTest extends BaseClass {
	@Test
	public void testproperty() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup sp = new Setup(driver);
		sp.ClickOnProPropertiesLinkText();
		Thread.sleep(3000);
//        WebElement opt = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[1]"));
//       Select sel=new Select(opt);
//       sel.selectByValue("30");
//		driver.findElement(By.xpath("//section[@class='pagination']//li[6]//a[1]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//section[@class='pagination']//li[1]//a[1]")).click();

//		driver.findElement(By.xpath("(//span[@id='custom'])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[normalize-space()='Single']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter Property']")).sendKeys("Nashik");
//		driver.findElement(By.xpath("//input[@placeholder='Property Code']")).sendKeys("007");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Country']")).sendKeys("India");
//		driver.findElement(By.xpath("//input[@placeholder='Zone']")).sendKeys("West");
//		driver.findElement(By.xpath("//input[@placeholder='Enter city']")).sendKeys("NASHIK");
//		WebElement opt = driver.findElement(By.xpath("//select[@formcontrolname='defaultDepartment']"));
//		Select sel=new Select(opt);
//		sel.selectByIndex(15);
//		Thread.sleep(3000);
//		WebElement optUser = driver.findElement(By.xpath("//select[@class='form-control normalSelect ng-pristine ng-valid ng-touched']"));
//		Select sel2=new Select(optUser);
//		sel2.selectByValue("0");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("First Floor");
//		driver.findElement(By.xpath("//span[normalize-space()='Add Another Location']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Search Nearest Location']")).sendKeys("First Floor");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@placeholder='Enter Radius']")).sendKeys("120");
//        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
//       driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
//        Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[@class='button btn-primary']")).click();
	//driver.findElement(By.xpath("//span[normalize-space()='Back']")).click();
	//OK Popup after submit
	//driver.findElement(By.xpath("//button[@id='goBack']")).click();
		
		
//		driver.findElement(By.xpath("//main[@class='main']//div[@class='col-auto']//div[1]//img[1]")).click();
		Java_Utility jv = new Java_Utility();
		int ranNum = jv.getRandomNum();
		Properties1 p=new Properties1(driver);
		p.ClickOn_Add_Button();
		Thread.sleep(3000);
		p.ClickOnAddSinglePropertyButton();
		p.CreateProperty_Page("Vivo"+ranNum, "11", "India", "West", "Pune", "First Floor", "PCMC Pune", "60");
		Thread.sleep(3000);

p.ClickOn_Department_Assigned_Dropdown_Value("3: 602");
		p.clickOn_NextButton();
		p.ClickOn_SubmitButton();
		Thread.sleep(6000);
		p.ClickOn_OKButton_OnconfirmPopup();
Thread.sleep(6000);

	}

}
