package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Date_Formats;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class DocumentTest extends BaseClass{
	@Test
	public void DocumentCreate() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		
		Setup sp = new Setup(driver);
		sp.ClickOnDocumentsLinkText();
		  
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Filter']")).click();
	//	Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[.='Select Property']")).click();
		
//        driver.findElement(By.xpath("//input[@placeholder='Document Provider']")).sendKeys("text");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Document Type']")).sendKeys("Type");
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[.='Apply']")).click();
	
//	driver.findElement(By.xpath("//span[.='Clear']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//img[@src='../../assets/images/icons/right.svg']")).click();
//	driver.findElement(By.xpath("//img[@src='../../assets/images/icons/left.svg']")).click();
//		driver.findElement(By.xpath("//span[text()='Back']")).click();
//		driver.findElement(By.xpath("//span[text()='Add New Document']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Document Provider Name']")).sendKeys("Rushi");
//		driver.findElement(By.xpath("//input[@placeholder='Document Type']")).sendKeys("helth insu");
//		driver.findElement(By.xpath("//input[@placeholder='Document Cost']")).sendKeys("522");
//		driver.findElement(By.xpath("//input[@placeholder='Document Number']")).sendKeys("kkkl5266235");
//		WebElement sts = driver.findElement(By.xpath("//select[@formcontrolname='status']"));
//		Select sel=new Select(sts);
//		sel.selectByVisibleText(" Inactive");
//		Thread.sleep(4000);
//		
//		
//		WebElement prpty = driver.findElement(By.xpath("//select[@formcontrolname='outletId']"));
//		Select sel2=new Select(prpty);
//		sel2.selectByVisibleText(" THE_DHARAVI");
//		
//		WebElement asset = driver.findElement(By.xpath("//select[@formcontrolname='assetId']"));
//		Select sel3=new Select(asset);
//		sel3.selectByVisibleText(" as2");
		
		//start date filter
		//WebElement enter_start_Date = driver.findElement(By.xpath("//td[@aria-label='August 3, 2023']"));
//		String month="Aug-2023";
//		String day="15";
//		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
//		Thread.sleep(3000);
//		while(true)
//		{
//			//Aug-2023(Month-Year) path
//			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//			System.out.println(text);
//			if(text.equals(month))
//			{
//				break;
//			}
//			else
//			{
//				//date scroll left icon
//				driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
//				
//			}
//
//		}
//		
//		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
//		Thread.sleep(5000);
//		
//		String end_month="Jan-2024";
//		String end_day="10";
//		driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();
//        //driver.findElement(By.xpath("//input[@placeholder='Expiration Date']")).click();
//Thread.sleep(3000);
//while(true)
//{
//		//(Month-Year) path
//	String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//	System.out.println(text);
//	if(text.equals(end_month))
//	{
//		break;
//	}
//	else
//	{
//		//Date scroll right icon
//		driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
//		
//	}
//
//}
//driver.findElement(By.xpath("//span[normalize-space()='20']")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//span[.='Cancel']")).click();
//	driver.findElement(By.xpath("//span[.='Add Document']")).click();
		
	Date_Formats df = new Date_Formats();
	df.start_Date1(driver);
		df.End_Date(driver);
		
//		WebDriver_Utility wb = new WebDriver_Utility();
//		wb.start_Date1();
//		 WebDriver_Utility wb = new WebDriver_Utility();
//		// wb.ShowRows_Dropdown(driver, "30");
//		wb.JumpToPage_DropDown(driver, "2");
//		 Thread.sleep(5000);

		
	}

}
