package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Date_Formats;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Assets extends BaseClass{
	@Test
	public void createAsset() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnAssetsLinkText();
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);

		//	driver.findElement(By.xpath("//button[normalize-space()='In Transit']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Lost & Discard']")).click();
		//	Thread.sleep(2000);
		//
		//	driver.findElement(By.xpath("//button[normalize-space()='All Assets']")).click();
		//	Thread.sleep(3000);
		//		driver.findElement(By.xpath("//ul[@class='assets-list']//span[contains(text(),'Ast')]")).click();
		//		Thread.sleep(3000);
		//	driver.findElement(By.xpath("//button[normalize-space()='Preventive Maintenance']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Tickets']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Parts']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Depreciation']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Logs']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Reports']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='Notify']")).click();
		//	driver.findElement(By.xpath("//button[normalize-space()='PAT']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Print QR Code']")).click();
		//	driver.findElement(By.xpath("//button[@data-target='#duplicate12']//span[.='View/Edit Location']")).click();
		//	WebElement s = driver.findElement(By.xpath("//div[@id='duplicate12']//select[@id='selectUser']"));
		//	Select sel=new Select(s);
		//	sel.selectByVisibleText("Ground Level");
		//	driver.findElement(By.xpath("//button[@data-dismiss='modal']//span[contains(text(),'Set New Location')]")).click();
		//	Thread.sleep(2000);
		//	driver.findElement(By.xpath("//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")).click();
		//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@data-target='#duplicate']//span[contains(text(),'Edit')]")).click();
		//driver.findElement(By.xpath("//button[@id='dismissPopUp']")).click();
		//driver.findElement(By.xpath("//div[@id='duplicate']//button[@type='button'][normalize-space()='Confirm Changes']")).click();
		//driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Ok'])[1]")).click();
		//	

		//	driver.findElement(By.xpath("//button[@data-target='#duplicate223']//span[.='Edit']")).click();
		//	driver.findElement(By.xpath("//div[@id='duplicate223']//button[@type='button'][normalize-space()='Confirm Changes']")).click();
		//   driver.findElement(By.id("dismissPopUp223")).click();
		//Thread.sleep(4000);

		////DONE TILL POM CLASS

		//driver.findElement(By.xpath("//span[normalize-space()='Warranty Support History']")).click();
		// driver.findElement(By.xpath("//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='AMC History']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Add New Service']")).click();

		//		Thread.sleep(4000);
		//		//
		//		driver.findElement(By.xpath("//span[normalize-space()='Add New Service']/ancestor::button[@class='button btn-primary']")).click();
		//		   driver.findElement(By.xpath("//input[@formcontrolname='reason']")).sendKeys("RRRRRRRRRRRRR");
		//		  WebElement s = driver.findElement(By.xpath("//select[@formcontrolname='ticket']"));
		//		  Select sel=new Select(s);
		//		  sel.selectByVisibleText("ffr");
		//		  driver.findElement(By.xpath("//label[@for='serviceMode']//span[@class='slider']")).click();
		//		  Date_Formats d = new Date_Formats();
		//		  d.Service_Start_Date_On_Add_New_Warranty_Service_Page(driver);
		//		  d.Service_End_Date_On_Add_New_Warranty_Service_Page(driver);
		//  driver.findElement(By.xpath("//input[@formcontrolname='startTime']")).click();
		//		  for(int i=1;i<5;i++)
		//		  {
		//		driver.findElement(By.xpath("//input[@hour12timer='true']")).click();
		//		 
		//		  }
		//		  Thread.sleep(4000);
		//		  for(int i=1;i<5;i++)
		//		  {
		//		  driver.findElement(By.xpath("//button[@aria-label='Minus a hour']")).click();
		//		  }
		//		  WebElement time = driver.findElement(By.xpath("(//input[@class='owl-dt-timer-input'])[1]"));
		//		  time.click();
		//		  time.clear();
		//		  time.sendKeys("05");
		//		  Thread.sleep(4000);
		//		  WebElement etime = driver.findElement(By.xpath("(//input[@class='owl-dt-timer-input'])[2]"));
		//		  etime.click();
		//		  etime.clear();
		//		  etime.sendKeys("05");
		//		  driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		//	//	driver.findElement(By.xpath("//span[@class='owl-dt-control-content owl-dt-control-button-content'][normalize-space()='Cancel']")).click();
		//		driver.findElement(By.xpath("//input[@formcontrolname='endTime']")).click();
		//		WebElement time1 = driver.findElement(By.xpath("(//input[@class='owl-dt-timer-input'])[1]"));
		//		time1.click();
		//		time1.clear();
		//		time1.sendKeys("05");
		//		Thread.sleep(4000);
		//		WebElement etime1 = driver.findElement(By.xpath("(//input[@class='owl-dt-timer-input'])[2]"));
		//		etime1.click();
		//		etime1.clear();
		//		etime1.sendKeys("05");
		//		driver.findElement(By.xpath("//input[@formcontrolname='userId']")).sendKeys("RRRRRRTttTTTTT");
		//		driver.findElement(By.xpath("//input[@formcontrolname='partRepairedName']")).sendKeys("ParTTTTTTTTTT4546");
		//		
		//		WebElement Spart = driver.findElement(By.xpath("//select[@formcontrolname='partId']"));
		//		Select sel1=new Select(Spart);
		//		sel1.selectByVisibleText("agn");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//input[@formcontrolname='quentity']")).sendKeys("45");
		//		driver.findElement(By.xpath("//input[@formcontrolname='additionalReason']")).sendKeys("PPPPPPPPPPPPPPPPerso");
		//		driver.findElement(By.xpath("//input[@formcontrolname='additionalCost']")).sendKeys("56");
		//		driver.findElement(By.xpath("//span[normalize-space()='Attach Files']")).click();
		//		//driver.findElement(By.xpath("//input[@class='addFileDragInner']")).sendKeys("\"C:\\Users\\SynccIT\\parts&inventory (36).xls\"");
		//		
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='comments']")).sendKeys("HHHHHHIIIIIIIIIIIII");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//span[normalize-space()='Add Service']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();

		//		driver.findElement(By.id("warrantyattach")).click();
		//		driver.findElement(By.id("warrattachimg")).sendKeys("C:\\Users\\SynccIT\\Downloads\\PartsMovement1701940489.csv");
		//	driver.findElement(By.xpath("//button[@data-target='#attachFile']//div[@class='img-box']")).click();
		//	driver.findElement(By.xpath("//label[@for='uploadFile']//input[@type='file']")).sendKeys("C:\\Users\\SynccIT\\Downloads\\parts&inventory (36).xls");
		//		Thread.sleep(3000);

		//	driver.findElement(By.xpath("//button[normalize-space()='Overdue']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Upcoming']")).click();
		//		Thread.sleep(1000);
		//
		//		driver.findElement(By.xpath("//button[normalize-space()='Upcoming']")).click();
		//		Thread.sleep(1000);
		//
		//		driver.findElement(By.xpath("//button[normalize-space()='Today']")).click();
		//		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//span[.='Filter']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("HIIII");
		//		driver.findElement(By.xpath("//ul[@class='filter-list']//button[@id='custom']")).click();
		//		driver.findElement(By.xpath("//ul[@class='filter-list']//div[@class='input-group']")).sendKeys("AA");
		//		driver.findElement(By.xpath("//a[.='AA']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Clear']")).click();
		//		driver.findElement(By.xpath("//button[normalize-space()='Parked Tickets']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Closed Tickets']")).click();
		//		Thread.sleep(1000);
		//	
		//		driver.findElement(By.xpath("//button[normalize-space()='Not Valid']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Open Tickets']")).click();
		////		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//span[.='Filter']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Ticket No.']")).sendKeys("RRRRRRRRRR");
		//		driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys("TTTTTTTTTTitle");
		//		driver.findElement(By.name("prioritybutton")).click();
		//		driver.findElement(By.xpath("//a[.='Low']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Select assign to']")).click();
		//	driver.findElement(By.xpath("//input[@class='autocomplete-input-list ticketassignto ng-pristine ng-valid ng-touched']")).sendKeys("sky");

		//		driver.findElement(By.xpath("//span[normalize-space()='Select raised By']")).click();
		//		//driver.findElement(By.xpath("//input[@class='autocomplete-input-list raiseby ng-pristine ng-valid ng-touched']")).sendKeys("RRRRRRRRRRRRRTTTTTTTTTTTt");
		//		Date_Formats d = new Date_Formats();
		//		d.start_Date1(driver);
		//		d.End_Date(driver);
		//		Thread.sleep(5000);
		//	driver.findElement(By.xpath("//span[normalize-space()='Raise a Ticket']")).click();
		//			WebElement p = driver.findElement(By.xpath("//select[@id='site']"));
		//			Select sel=new Select(p);
		//			sel.selectByVisibleText(" Nashik");



		//			driver.findElement(By.xpath("//input[@formcontrolname='subject']")).sendKeys("RRRRRRRRRRRTTTTTTTTTTTTitle");
		//			driver.findElement(By.id("location_reason")).sendKeys("FDEXXXXXXXXXXXXXXXXXC");
		//			driver.findElement(By.xpath("//label[@for='transferType']//span[@class='slider']")).click();
		//			driver.findElement(By.xpath("//div[normalize-space()='Low']")).click();
		//	WebElement a = driver.findElement(By.xpath("//label[@for='uploadProfile']//img[@class='uploadSection']"));
		//	a.click();
		//			a.sendKeys("C:\\Users\\SynccIT\\Downloads\\download(3).jpg");
		//			Thread.sleep(2000);
		//			WebElement b = driver.findElement(By.xpath("//label[@for='uploadProfileVedio']//img[@class='uploadSection']"));
		//			//b.click();
		//			b.sendKeys("C:\\Users\\SynccIT\\OneDrive\\Documents\\20221201_171313.mp4");
		//			
		//			WebElement d = driver.findElement(By.xpath("//select[@formcontrolname='departmentId']"));
		//			Select sel1=new Select(d);
		//			sel1.selectByVisibleText("Operations");
		//			
		//			WebElement u = driver.findElement(By.xpath("//select[@formcontrolname='userId']"));
		//			Select sel2=new Select(u);
		//			sel2.selectByVisibleText("SSA");
		//			driver.findElement(By.xpath("//span[normalize-space()='Create Ticket']")).click();
		//			driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		//			
		//			Thread.sleep(4000);
		//			driver.findElement(By.xpath("//button[normalize-space()='Used']")).click();
		//			driver.findElement(By.xpath("//button[normalize-space()='All Associated']")).click();
		//			Thread.sleep(2000);
		//	driver.findElement(By.xpath("//span[.='Filter']")).click();
		//			driver.findElement(By.xpath("//span[.='Select Part Name']")).click();
		//	driver.findElement(By.xpath("(//input[@id='custom'])[1]")).sendKeys("agn");
		//	driver.findElement(By.xpath("//a[.='agn']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("123");
		//	driver.findElement(By.xpath("//span[.='Select Part No']")).click();
		//	driver.findElement(By.xpath("(//input[@id='custom'])[3]")).sendKeys("510");

		//Thread.sleep(3000);	
		//			driver.findElement(By.xpath("//span[normalize-space()='Associate a Part']")).click();
		//			WebElement p = driver.findElement(By.xpath("//select[@id='selectedPart']"));
		//			Select sel=new Select(p);
		//			sel.selectByVisibleText("RRRRRRRRRRRR");
		//			Thread.sleep(2000);
		//			driver.findElement(By.xpath("//span[normalize-space()='Attach Part']")).click();
		//			driver.findElement(By.xpath("//button[.='Ok']")).click();
		//			driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
		//			driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("123");
		//			driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("12");
		//			driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("789");
		//			Thread.sleep(1000);
		//			driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		//	
		//			driver.findElement(By.xpath("//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")).click();

		//			driver.findElement(By.xpath("//button[normalize-space()='Files']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Activity Logs']")).click();
		//		driver.findElement(By.xpath("//span[.='Filter']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Activity']")).sendKeys("dtfyghu");
		//		driver.findElement(By.xpath("//button[@class='button select-button ']//span[.='Associate']")).click();
		//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("AA");
		//		driver.findElement(By.xpath("//button[@class='button select-button ']//span[.='Type of log']")).click();
		//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("Type of log searchn box");
		//		Thread.sleep(4000);
		//			driver.findElement(By.xpath("//img[@alt='Delete']")).click();
		//			
		//			driver.findElement(By.xpath("//input[@placeholder='Warranty Expiration']")).click();
		//			
		//			String month="Aug-2023";
		//			String day="15";
		//			while(true)
		//			{
		//				//Aug-2023(Month-Year) path
		//				String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
		//
		//				if(text.equals(month))
		//				{
		//					break;
		//				}
		//				else
		//				{
		//					//date scroll left icon
		//					driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
		//					
		//				}
		//
		//			}
		//			
		//			driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
		//			
		//		
		//			String end_month="Dec-2023";
		//			String end_day="10";
		//			//driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();
		//			while(true)
		//			{
		//					//(Month-Year) path
		//				String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
		//			
		//				if(text.equals(end_month))
		//				{
		//					break;
		//				}
		//				else
		//				{
		//					//Date scroll right icon
		//					driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
		//					
		//				}
		//			
		//			}
		//			driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
		//		
		//		Thread.sleep(5000);

		//			driver.findElement(By.xpath("//span[.='Export']")).click();
		//			driver.findElement(By.xpath("//a[normalize-space()='As PDF']")).click();
		//			Thread.sleep(3000);
		//			//		driver.findElement(By.xpath("//span[.='Filter']")).click();
		//		driver.findElement(By.xpath("//span[.='Select Property']")).click();
		//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("Pune");
		//		driver.findElement(By.xpath("//a[normalize-space()='Pune']")).click();
		//		driver.findElement(By.xpath("//span[.='Select Asset']")).click();
		//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("Asset 11");
		//		
		//		driver.findElement(By.xpath("//a[normalize-space()='Asset 11']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Manufacturer']")).sendKeys("RRRRRRRRRRRRRT");
		//		driver.findElement(By.xpath("//span[.='Select Status']")).click();
		//		driver.findElement(By.xpath("//a[normalize-space()='Breakdown']")).click();
		//a[normalize-space()='Inactive']
		//a[normalize-space()='Active']
		//		driver.findElement(By.xpath("//span[.='Select Transfer Type']")).click();
		//		driver.findElement(By.xpath("//a[.='Temporary']")).click();
		//		driver.findElement(By.xpath("//a[.='Permanent']")).click();
		//Thread.sleep(6000);
		//	driver.findElement(By.xpath("//label[@for='11002check']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Duplicate']")).click();
		//		driver.findElement(By.xpath("//button[normalize-space()='Yes Duplicate']")).click();

		//Ok_Button_On_Duplicate_assetConfirmation page
		//		driver.findElement(By.xpath("//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//span[normalize-space()='Move']")).click();
		//		Date_Formats d = new Date_Formats();
		//		d.Asset_Transfer_Date_Of_Transfer(driver);
		//		d.Asset_Transfer_Date_Of_Return(driver);
		//	   driver.findElement(By.xpath("//textarea[@id='location_reason']")).sendKeys("RRRRRRRRTTTTTTTTTTHGF");
		//	   driver.findElement(By.xpath("//img[@alt='checkbox check']")).click();
		//	   WebElement ud = driver.findElement(By.xpath("//select[@formcontrolname='userSelected']"));
		//	   Select sel=new Select(ud);
		//	   sel.selectByVisibleText(" Ahmed");
		//	   Thread.sleep(3000);
		//	   driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		//	   driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		//	   driver.findElement(By.xpath("//span[normalize-space()='Back']")).click();
		//   Thread.sleep(4000);
		//	   driver.findElement(By.xpath("//label[@for='transferType']//span[@class='slider']")).click();
		//	 WebElement d = driver.findElement(By.xpath("(//select[@placeholder='select'])[2]"));
		//	 Select sel2=new Select(d);
		//	 sel2.selectByVisibleText(" Xtreme Aqua");
		//	 Thread.sleep(4000);
		//	 driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		//		driver.findElement(By.xpath("//span[normalize-space()='QR Code']")).click();
		//		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Single']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='assetName']")).sendKeys("Bowling Lane 88");
		driver.findElement(By.xpath("//input[@formcontrolname='categoryName']")).sendKeys("Arcade");
		WebElement c = driver.findElement(By.xpath("//select[@formcontrolname='conditions']"));
		Select sel=new Select(c);
		sel.selectByVisibleText("New");
		driver.findElement(By.xpath("//input[@formcontrolname='specRating']")).sendKeys("1234544");
		driver.findElement(By.xpath("(//input[@formcontrolname='vendorName'])[1]")).sendKeys("Rushikesh");
		WebElement pat = driver.findElement(By.xpath("//select[@formcontrolname='portable']"));
		Select sel1=new Select(pat);
		sel1.selectByVisibleText("No");
		driver.findElement(By.xpath("//input[@formcontrolname='srNo']")).sendKeys("12");
		//manufacturer
		driver.findElement(By.xpath("//input[@formcontrolname='make']")).sendKeys("Honda");
		//model
		driver.findElement(By.xpath("//input[@formcontrolname='model']")).sendKeys("Bugatti23");
		//asset tag no
		driver.findElement(By.xpath("//input[@formcontrolname='assetTagNo']")).sendKeys("562");
		//property dropdown
		WebElement p = driver.findElement(By.xpath("//select[@formcontrolname='propertyId']"));
		Select sel2=new Select(p);
		sel2.selectByVisibleText("Xtreme house");
		//location dropdown
		WebElement l = driver.findElement(By.xpath("//select[@formcontrolname='locationId']"));
		Select sel3=new Select(l);
		sel3.selectByVisibleText("Resto Zone");
		driver.findElement(By.xpath("//input[@formcontrolname='ownership']")).sendKeys("Rush");
		Date_Formats d = new Date_Formats();
		d.Date_Of_Purchase_On_Add_Single_Parts_and_Asset_Page(driver);
		d.Asset_Placed_In_ServiceDate_On_Add_AssetPage(driver);
	
		driver.findElement(By.xpath("//span[normalize-space()='Add Warranty Details']")).click();
		driver.findElement(By.xpath("(//input[@formcontrolname='vendorName'])[2]")).sendKeys("YRTHFJGKYH");
		driver.findElement(By.xpath("(//input[@formcontrolname='contactPerson'])[1]")).sendKeys("RTYU");
		driver.findElement(By.xpath("(//input[@formcontrolname='contactNo'])[1]")).sendKeys("84521");
		driver.findElement(By.xpath("(//input[@formcontrolname='alternetNo'])[1]")).sendKeys("86532");
		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[1]")).sendKeys("fgjh@gmail.com");
		driver.findElement(By.xpath("(//input[@formcontrolname='scheduledService'])[1]")).sendKeys("2");
		d.Warranty_start_Date_On_Add_Asset_Page(driver);
		d.Warranty_End_Date_On_Add_Asset_Page(driver);
		driver.findElement(By.xpath("//span[normalize-space()='Add AMC Details']")).click();
		driver.findElement(By.xpath("(//input[@formcontrolname='vendorName'])[3]")).sendKeys("AGn");
		driver.findElement(By.xpath("(//input[@formcontrolname='contactPerson'])[2]")).sendKeys("RTYU");
		driver.findElement(By.xpath("(//input[@formcontrolname='contactNo'])[2]")).sendKeys("84521");
		driver.findElement(By.xpath("(//input[@formcontrolname='alternetNo'])[2]")).sendKeys("86532");
		driver.findElement(By.xpath("(//input[@formcontrolname='email'])[2]")).sendKeys("fgjh@gmail.com");
driver.findElement(By.xpath("(//input[@formcontrolname='scheduledService'])[2]")).sendKeys("5");
		WebElement amc = driver.findElement(By.xpath("//select[@formcontrolname='amcType']"));
		Select sel4=new Select(amc);
		sel4.selectByVisibleText("Non-Comprehensive");
		d.AMC_start_Date_On_Add_Asset_Page(driver);
		d.AMC_End_Date_On_Add_Asset_Page(driver);
		
		Thread.sleep(8000);
	}
}
