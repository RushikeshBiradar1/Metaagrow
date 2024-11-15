package Sample;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Date_Formats;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class parts extends BaseClass{

	@Test
	public void Parts() throws Throwable
	{

		HomePage hp = new HomePage(driver);
		hp.ClickOnPartsandInventoryLinkText();
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		//		driver.findElement(By.xpath("//button[normalize-space()='Transferred']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='On Property']")).click();
		//		driver.findElement(By.xpath("//span[.='Filter']")).click();
		//		driver.findElement(By.xpath("//span[.='Select Property']")).click();
		//		driver.findElement(By.xpath("//div[@id='custom']//input[@id='custom']")).sendKeys("pune");
		//		

		//		driver.findElement(By.xpath("//a[.='Pune']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//input[@placeholder='Search Part No']")).sendKeys("2002");
		//		driver.findElement(By.xpath("//input[@placeholder='Search Part Name']")).sendKeys("part24");
		//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Clear']")).click();
		//	driver.findElement(By.xpath("//ancestor::ul[@class='tr']/descendant::b[contains(text(),'agn')]")).click();
		//driver.findElement(By.cssSelector("button.qr-bdr-btn")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
		//Thread.sleep(3000);


		//driver.findElement(By.xpath("//span[normalize-space()='View/Edit Location']")).click();

		//		wb.ExplicitlyWait(element);
		//		element.click();
		//		WebElement d = driver.findElement(By.xpath("//div[@id='duplicate12']//select[@id='selectUser']"));
		//		Select sel=new Select(d);
		//		sel.selectByVisibleText("Ground Level");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//button[@class='button btn-secondary']//span[.='View/Edit Location']")).click();
		//Ok Button On edit location
		//		driver.findElement(By.xpath("div[id='successPopUp1'] button[type='button']")).click();


		//		driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Update Quantity')]")).click();
		//		driver.findElement(By.id("orderPoId")).sendKeys("001");
		//		driver.findElement(By.xpath("//input[@placeholder='Quantity Ordered']")).sendKeys("10");
		//		driver.findElement(By.xpath("//input[@placeholder='Quantity Received']")).sendKeys("10");
		//		driver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys("200");
		//		WebElement d = driver.findElement(By.xpath("//select[@formcontrolname='partialId']"));
		//		Select sel=new Select(d);
		//		sel.selectByVisibleText("Complete");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		//		driver.findElement(By.cssSelector("div[id='successPopUp'] button[type='button']")).click();



		//		driver.findElement(By.xpath("//button[normalize-space()='Vendors']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Add a Vendor']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Enter Vendor Name']")).sendKeys("Rushi");
		//		driver.findElement(By.xpath("//input[@placeholder='Enter Email id']")).sendKeys("rushi@gmail.com");
		//		driver.findElement(By.xpath("//input[@placeholder='Enter mobile no']")).sendKeys("123456");
		//		driver.findElement(By.xpath("//input[@placeholder='Contact Person']")).sendKeys("Biradar");
		//		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();

		//		driver.findElement(By.xpath("//button[normalize-space()='Assets']")).click();


		//Done till POM

		//		driver.findElement(By.xpath("//button[normalize-space()='Logs']")).click();
		//		driver.findElement(By.xpath("//button[normalize-space()='Files']")).click();
		//		Thread.sleep(3000);

		//		driver.findElement(By.xpath("//button[normalize-space()='Activity Logs']")).click();
		//driver.findElement(By.xpath("//span[.='Filter']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Activity']")).sendKeys("RRRRR");
		//		driver.findElement(By.xpath("//button[@class='button select-button ']//span[.='Associate']")).click();
		//		driver.findElement(By.xpath("//a[.='ABC865']")).click();
		//		driver.findElement(By.xpath("//button[@class='button select-button ']//span[.='Type of log']")).click();
		//		driver.findElement(By.xpath("//a[.='Depreciation']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='File Name']")).sendKeys("RRRRRRR");
		//		driver.findElement(By.xpath("//button[@class='button select-button ']//span[.='Uploaded By']")).click();
		//		driver.findElement(By.xpath("//div[@class='input-group']//input[@id='custom']")).sendKeys("ABC865");
		//		driver.findElement(By.xpath("//a[.='ABC865']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
		//		driver.findElement(By.xpath("//span[normalize-space()='Clear']")).click();


		//driver.findElement(By.xpath("//button[normalize-space()='Reports']")).click();
		//		
		//		Date_Formats d = new Date_Formats();
		//		d.start_Date_ON_Parts_And_Inventory_Reports_Page(driver);
		//		d.End_Date_ON_Parts_And_Inventory_Reports_Page(driver);
		//		driver.findElement(By.xpath("//h2[@id='headerText']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//button[@class='button btn-primary']//span[.='Search']")).click();
		//		driver.findElement(By.xpath("//button[@class='button btn-primary']//span[.='Clear']")).click();
		//		driver.findElement(By.xpath("//button[@id='custom']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//a[normalize-space()='As PDF']")).click();
		//	Thread.sleep(3000);
		//	wb.doubleClick_On_Element(element);
		//		driver.findElement(By.xpath("//button[normalize-space()='Notify']")).click();
		//		WebElement d = driver.findElement(By.xpath("//select[@formcontrolname='notifyUser']"));
		//		Select sel=new Select(d);
		//		sel.selectByVisibleText(" Biradar");
		//		WebElement user = driver.findElement(By.cssSelector("form-control.normalSelect.ng-pristine.ng-valid.ng-touched"));
		//		Select sel2=new Select(user);
		//		sel.selectByVisibleText(" AA");
		//		
		//		WebElement periods = driver.findElement(By.cssSelector("form-control ng-pristine ng-valid ng-touched"));
		//    Select sel1=new Select(periods);
		//    sel.selectByVisibleText("days");
		//    

		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[normalize-space()='Transfer']")).click();
	//	driver.findElement(By.xpath("//span[normalize-space()='Add Parts']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Single']")).click();
//		driver.findElement(By.xpath("//input[@formcontrolname='partName']")).sendKeys("RRRRRRRRRRRR");
//		driver.findElement(By.xpath("//input[@formcontrolname='number']")).sendKeys("Parrrrrrrrrt Numberrrrrrrrr");
//		driver.findElement(By.xpath("//input[@formcontrolname='serialNo']")).sendKeys("12345555555555");
//		WebElement PD = driver.findElement(By.xpath("//select[@formcontrolname='propertyId']"));
//		Select sel=new Select(PD);
//		sel.selectByVisibleText("THE_DHARAVI");
//		WebElement LD = driver.findElement(By.xpath("//select[@formcontrolname='locationId']"));
//		Select sel1=new Select(LD);
//		sel1.selectByVisibleText("Ground Level");
//		driver.findElement(By.xpath("//input[@formcontrolname='unitOfMeasure']")).sendKeys("UOMMMMMMMM");
//		driver.findElement(By.xpath("//input[@formcontrolname='minimumQuentity']")).sendKeys("10");
//		driver.findElement(By.xpath("//input[@formcontrolname='quentityInHand']")).sendKeys("50");
//		driver.findElement(By.xpath("//input[@formcontrolname='pricePerPice']")).sendKeys("1500");
//		//driver.findElement(By.xpath(""))
//		Date_Formats d = new Date_Formats();
//		d.Date_Of_Purchase_On_Add_Single_Parts_Page(driver);
//		Thread.sleep(2000);
//		d.Expiry_Date_On_Add_Single_Parts_Page(driver);
//		Thread.sleep(2000);
//		d.Warranty_Expiry_Date_On_Add_Single_Parts_Page(driver);
//		//add part button on add part page
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		//cancel button on add part page 
//		//driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
//		//Ok button on add part confirmation page
//		driver.findElement(By.xpath("//button[@id='backClicked']")).click();
//
//
//		Thread.sleep(6000);
		
//		driver.findElement(By.xpath("//a[.='Bulk']")).click();
//		//driver.findElement(By.xpath("//span[normalize-space()='Download Sample Sheet']")).click();
//		WebElement fileInput = driver.findElement(By.xpath("//input[@class='addFileDragInner']"));
//		//Robot r = new Robot();
//		  // Set the local file path to be uploaded
//        String filePath = "C:\\Users\\SynccIT\\Downloads\\PartsMovement1701940724.csv";
//        fileInput.sendKeys(filePath);
//
//        // Wait for some time (you might need to wait for the file to be processed)
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		Thread.sleep(6000);
//		wb.ClickOn_RightSlide_Arrow(driver);
//		Thread.sleep(2000);
//		wb.ClickOn_LeftSlide_Arrow(driver);
	//	wb.JumpToPage_DropDown(driver, "6");
		wb.ShowRows_Dropdown(driver, "30");
		Thread.sleep(4000);
	}


}
