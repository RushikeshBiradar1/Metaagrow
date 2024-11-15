package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Date_Formats;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Maintenance extends BaseClass{
	@Test
	public void Meaintenance_Test() throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.maximizeTheBrowser(driver);
		wb.ImplicitlyWait(driver);
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		//driver.findElement(By.xpath("//span[normalize-space()='Maintenance']")).click();
	//	Thread.sleep(3000);
			//	driver.findElement(By.xpath("//button[.='Overdue']")).click();
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.xpath("//button[.='Upcoming']")).click();
		//		Thread.sleep(3000);
		//
			//	driver.findElement(By.xpath("//button[.='Completed']")).click();
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.xpath("//button[.='Today']")).click();
		//		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[.='Filter']")).click();
//		driver.findElement(By.xpath("//span[.='Select Asset']")).click();
//		String dynamic="Asset1";
//		driver.findElement(By.xpath("//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")).sendKeys(dynamic);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='PM Name']")).sendKeys("name Pm");
//		driver.findElement(By.xpath("//span[.='Select Assigned To']")).click();
//		Thread.sleep(4000);
//		Date_Formats d = new Date_Formats();
//		d.start_Date1(driver);
//		d.End_Date(driver);
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//body[1]/app-root[1]/main[1]/div[1]/div[1]/div[2]/app-pm-index[1]/section[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/button[1]")).click();
//		driver.findElement(By.xpath("//body[1]/app-root[1]/main[1]/div[1]/div[1]/div[2]/app-pm-index[1]/section[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/div[1]/input[1]")).sendKeys("Assignee");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Clear']")).click();
//				driver.findElement(By.xpath("//span[.='Select Completed By']")).click();
//				driver.findElement(By.xpath("//li[@class='ng-star-inserted']//ul[@id='custom']//li//input[@id='custom']")).sendKeys("RRRRRRRerer");
				
				
				
				
				
	driver.findElement(By.xpath("//span[.='PM Templates']")).click();
//		driver.findElement(By.xpath("//button[.='Inactive ']")).click();
//		driver.findElement(By.xpath("//button[.='Active ']")).click();
//		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[.='Filter']")).click();
		//driver.findElement(By.xpath("//span[.='Select Property']")).click();
		//driver.findElement(By.xpath("//section[@class='action-block']//li[1]//ul[1]//li[1]//div[1]//input[1]")).sendKeys("propertyname");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[.='ANDHERI']")).click();
//		driver.findElement(By.xpath("//span[.='Select Asset Name']")).click();
//		driver.findElement(By.xpath("//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")).sendKeys("Grillers");
//		driver.findElement(By.xpath("//a[.='Asset 11']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Template Name']")).sendKeys("rushi");
//		Date_Formats dd = new Date_Formats();
//		dd.start_Date1(driver);
//		dd.End_Date(driver);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[.='Select Assigned To']/ancestor::button[@class='button select-button ']")).click();
//		driver.findElement(By.xpath("(//input[@id='custom'])[8]")).sendKeys("Sunil");
//		driver.findElement(By.xpath("//a[.='Sunil']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[.='Apply']")).click();
//		driver.findElement(By.xpath("//span[.='Clear']")).click();
//    --------
		driver.findElement(By.xpath("//button[@class='button']/descendant::span[.='Create Template']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create Fresh Template']")).click();
		driver.findElement(By.xpath("//div[@class='col-4']/descendant::div[@class='form-group']/descendant::input[@formcontrolname='name']")).sendKeys("RRRRRRRRR");
//		driver.findElement(By.xpath("//span[.='Select']")).click();
//		driver.findElement(By.xpath("//a[.='Once']")).click();
		//Daily
		//Weekly
		//Monthly
		//Custom
		//Once
		
		//Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//input[@placeholder='Frequency']")).sendKeys("20");
//		driver.findElement(By.xpath("//span[.='Select Measurement']")).click();
//		
//		driver.findElement(By.xpath("//a[.='Day']")).click();
//		Thread.sleep(3000);
		////a[.='Week']
		//Month
		//Year
//		driver.findElement(By.xpath("//a[.='Custom (Days)']")).click();
//		driver.findElement(By.xpath("//label[normalize-space()='Monday']")).click();
//		driver.findElement(By.xpath("//label[normalize-space()='Saturday']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='scheduleFrequecyCustomDaysPop']//button[@type='button'][normalize-space()='Ok']")).click();
//		Thread.sleep(5000);
		WebElement property = driver.findElement(By.xpath("//select[@formcontrolname='propertyId']"));
		Select sel=new Select(property);
		sel.selectByVisibleText("ANDHERI");
		WebElement asset = driver.findElement(By.xpath("//select[@formcontrolname='assetId']"));
		Select sel1=new Select(asset);
		sel1.selectByVisibleText("XYZ ASSET");
		Date_Formats d = new Date_Formats();
//		d.start_Date_ON_create_PM_Template_page(driver);
//		d.End_Date_ON_create_PM_Template_page(driver);
		Thread.sleep(3000);
		WebElement AU = driver.findElement(By.xpath("//select[@formcontrolname='assignee']"));
         Select sel2=new Select(AU);
         sel2.selectByVisibleText("Rushi");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//li[@class='col-6']/descendant::div[@class='form-group']/descendant::input[@formcontrolname='name']")).sendKeys("checkList Name");
		driver.findElement(By.xpath("//span[.='Select Response']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[.='Digital Signature']")).click();
//		driver.findElement(By.xpath("//a[.='Text Field']")).click();
		driver.findElement(By.xpath("//a[.='Multiple Choice']")).click();
		//driver.findElement(By.xpath("//input[@formcontrolname='responceSearch']")).sendKeys("Hey");
		driver.findElement(By.xpath("//span[.='Add a Response']")).click();
		//driver.findElement(By.xpath("//span[.='Yes / No']")).click();
		
		
		
		// DOne Till POM Class
		
		
		driver.findElement(By.xpath("//input[@placeholder='Group Name']")).sendKeys("3 Icons");
		driver.findElement(By.xpath("//p[.='Failed']")).click();
		driver.findElement(By.xpath("//p[.='Unclean']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Status Name']")).click();
	//	driver.findElement(By.xpath("//div[@id='addNewCustonStatus']//li[1]//label[1]//span[1]")).click();
		//driver.findElement(By.xpath("//div[@class='modal-footer']//div[@class='modal-footer']//button[@type='button'][normalize-space()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Save'])[1]")).click();
		//OK button On group confirmation
		driver.findElement(By.xpath("//button[@id='backClick']")).click();
		
		


	}

}
