package Sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Meters extends BaseClass{
	@Test
	public void test() throws Throwable
	{
		WebDriver_Utility web = new WebDriver_Utility();
//		web.ImplicitlyWait();
//		web.maximizeTheBrowser();
		HomePage hp = new HomePage(driver);
		hp.ClickOnMetersLinkText();
//		driver.findElement(By.xpath("//button[.='Inactive ']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='active button']")).click();
//		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[.='Add New Meter']")).click();
//		driver.findElement(By.xpath("//input[@formcontrolname='meterName']")).sendKeys("meter1");
//		driver.findElement(By.xpath("//div[@class='form-group']//div[@class='form-group']//span[@id='custom']")).click();
//		driver.findElement(By.name("autocomplete")).sendKeys("Ram");
//		driver.findElement(By.xpath("//input[@placeholder='Add Custom Unit']")).sendKeys("Paskal");
//		Thread.sleep(5000);
//		// Use Robot class to simulate pressing the ENTER key
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-meter-add-new/div[@class='full-modal modal']/div[@role='document']/div[@class='modal-content']/div[@class='modal-body']/div[@class='tab-content transfer-type']/div[@role='tabpanel']/div/form[@name='meterDetailsForm']/ul[@class='row']/li[@class='col-6']/div[@class='form-group']/button[1]")).click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//a[.='Weekly']")).click();
//		//Once
//		//Daily
//		//Monthly
//		////a[.='Custom']
//		////a[.='Weekly']
//
//		//frequency
//		driver.findElement(By.xpath("//input[@placeholder='Frequency']")).sendKeys("2");
//		//select measurement
//		driver.findElement(By.xpath("//span[.='Select Measurement']")).click();
//		//evey day
//		driver.findElement(By.xpath("//a[.='Year']")).click();
//		//Week
//		//Month
//		//Year
//
//		//property dropdown
//		WebElement property = driver.findElement(By.xpath("//select[@formcontrolname='property']"));
//		Select sel=new Select(property);
//		sel.selectByVisibleText(" THE_DHARAVI");
//		Thread.sleep(3000);
//
//		//Location Dropdown
//		WebElement Location = driver.findElement(By.xpath("//select[@formcontrolname='location']"));
//		Select sel1=new Select(Location);
//		sel1.selectByVisibleText(" Ground Level");
//		Thread.sleep(3000);
//
//		//asset dropdown
//		WebElement asset = driver.findElement(By.xpath("//select[@formcontrolname='asset']"));
//		Select sel2=new Select(asset);
//		sel2.selectByVisibleText(" Bowling Lane");
//
//		//add assignee dropdown
//		WebElement assignee = driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-meter-add-new/div[@class='full-modal modal']/div[@role='document']/div[@class='modal-content']/div[@class='modal-body']/div[@class='tab-content transfer-type']/div[@role='tabpanel']/div/ul[@class='row']/li[@class='col-6']/div[@class='form-group']/select[1]"));
//		Select sel3=new Select(assignee);
//		sel3.selectByVisibleText(" Biradar");
//		Thread.sleep(3000);
//
//		//add another icon
//		driver.findElement(By.xpath("//div[@class='img-box text-wt-drk']")).click();
//		Thread.sleep(3000);
//
//		//remove icon
//		driver.findElement(By.xpath("//img[@src='../../assets/images/icons/close.svg']")).click();
//		driver.findElement(By.xpath("//span[.='Next']")).click();
//		//	driver.findElement(By.xpath("//span[.='Cancel']")).click();
//		//add meter button on confirmation page
//		driver.findElement(By.xpath("//span[.='Add Meter']")).click();
//		//OK button on confirmation page
//		driver.findElement(By.xpath("//button[@id='dismissOk']")).click();
//	driver.findElement(By.xpath("//SPAN[.='Filter']")).click();
//	driver.findElement(By.xpath("//SPAN[.='Select Property']")).click();
//	//property search box
//	driver.findElement(By.xpath("//li[1]//ul[1]//li[1]//div[1]//input[1]")).sendKeys("THE_DHARAVI");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//a[.='THE_DHARAVI']")).click();
//	Thread.sleep(3000);
//	//locationdropdown
//	driver.findElement(By.xpath("//span[.='Select Location']")).click();
//	//location search box
//	driver.findElement(By.xpath("//li[2]//ul[1]//li[1]//div[1]//input[1]")).sendKeys("Ground Level");
//	driver.findElement(By.xpath("//a[.='Ground Level']")).click();
//	//select asset dropdown
//	driver.findElement(By.xpath("//span[.='Select Asset']")).click();
//	//asset search box
//	driver.findElement(By.xpath("//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")).sendKeys("Sam");
//	driver.findElement(By.xpath("//a[.='Sam']")).click();
//	Thread.sleep(5000);
//	//meter name text field
//	driver.findElement(By.xpath("//input[@placeholder='Meter Name']")).sendKeys("Ram");
//	driver.findElement(By.xpath("//span[.='Apply']")).click();
//	driver.findElement(By.xpath("//span[.='Clear']")).click();
//		
//		driver.findElement(By.xpath("//span[.='QR Code']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[normalize-space()='meter1']")).click();
//		driver.findElement(By.xpath("//span[.='Print']")).click();
		web.ImplicitlyWait(driver);
	 com.MetaaGrow.ObjectRepository.Meters m = new com.MetaaGrow.ObjectRepository.Meters(driver);
	 m.ClickOn_QR_Code_Tab();
	 m.ClickOn_getQRWithDyanamic_Xpath(driver, "meter1 ");
	 Thread.sleep(4000);
	 m.ClickOn_Print_Button();
	
		
	}

}
