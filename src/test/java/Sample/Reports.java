package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Reports extends BaseClass{
	@Test
	public void Reports() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		//WebDriverWait k = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	
		hp.ClickOnReportsLinkText();
		WebDriver_Utility w = new WebDriver_Utility();
		w.ImplicitlyWait(driver);
		w.maximizeTheBrowser(driver);
		w.ImplicitlyWait(driver);
		
		//stock
	//	driver.findElement(By.xpath("(//div[@class='grad-box card'])[1]")).click();
		//Thread.sleep(3000);
		//Inventory procurement
		//driver.findElement(By.xpath("(//div[@class='grad-box card'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grad-box card'])[14]")).click();
		//driver.findElement(By.xpath("(//div[@class='card-body'])[6]")).click();
Thread.sleep(3000);
	
//		driver.findElement(By.xpath("(//div[@class='grad-box card'])[2]")).click();
	driver.findElement(By.xpath("(//button[@id='custom'])[1]")).click();
//		Thread.sleep(3000);
//		//driver.findElement(By.xpath("//input[@placeholder='Asset Name']")).sendKeys("gvefcjhbdkn");
//		driver.findElement(By.xpath("//input[@placeholder='Vendor Name']")).sendKeys("fuegydhu");
//		driver.findElement(By.xpath("//Input[@placeholder='Part No.']")).sendKeys("51264");
		
//		
//		
//		
//		String month="Aug-2023";
//		String day="15";
//		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
//		Thread.sleep(3000);
//		while(true)
//		{
//			//Aug-2023(Month-Year) path
//			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//
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
//		
//		//input[@placeholder='To']
//		
//		
//		String end_month="Mar-2024";
//		String end_day="10";
//		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
//		while(true)
//		{
//			//(Month-Year) path
//			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//
//			if(text.equals(end_month))
//			{
//				break;
//			}
//			else
//			{
//				//Date scroll right icon
//				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
//
//			}
//
//		}
//		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	//	driver.findElement(By.xpath("//input[@placeholder='To']")).click();
	//	driver.findElement(By.xpath("//input[@placeholder='Asset Name']")).sendKeys("vufehbcdnjxk");
		//property
	driver.findElement(By.xpath("//span[normalize-space()='Select Property']")).click();
		driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("Xtreme Aqua");
		driver.findElement(By.xpath("//input[@placeholder='PM Name']")).sendKeys("fcgvjh");
		driver.findElement(By.xpath("//input[@placeholder='category']")).sendKeys("gvuj");
		
		driver.findElement(By.xpath("//span[@title='Select Status']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Completed']")).click();
		driver.findElement(By.xpath("//span[@title='Select Assigned To']")).click();
		driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("fguh");
//		driver.findElement(By.xpath("//span[.='Select Asset']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("xyfgkuhl");
		driver.findElement(By.xpath("//span[@title='Select Completed By']")).click();
		driver.findElement(By.xpath("(//input[@name='autocomplete'])[4]")).sendKeys("uygischlidj");
//		driver.findElement(By.xpath("//span[normalize-space()='Select Status']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='AMC']")).click();
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//a[normalize-space()='Xtreme Aqua']")).click();
//		
		//Location
//		driver.findElement(By.xpath("//span[normalize-space()='Select Location']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("Trampoline Zone");
//		driver.findElement(By.xpath("//a[normalize-space()='Trampoline Zone']")).click();
//		
		//Asset
//		driver.findElement(By.xpath("//span[normalize-space()='Select Asset']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[3]")).sendKeys("Diswasher");
//		driver.findElement(By.xpath("//a[normalize-space()='Diswasher']")).click();
//		
		//select part
//		driver.findElement(By.xpath("//span[normalize-space()='Select Part']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[4]")).sendKeys("Diswasher");
//		driver.findElement(By.xpath("//input[@placeholder='Part Number']")).sendKeys("dcfygvxushbkjn");
	//driver.findElement(By.xpath("//input[@placeholder='Part Name']")).sendKeys("gdvshkjb jcgvhbdkx");
		
//Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//img[@alt='Duplicate']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Asset Name']")).sendKeys("iuhodjlk");
//
//		driver.findElement(By.xpath("//span[normalize-space()='Select From Property']")).click();
	//	driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("Xtreme Aqua");
//		driver.findElement(By.xpath("(//a[contains(text(),'Xtreme Aqua')])[1]")).click();
		//span[normalize-space()='Select To Property']

	//	driver.findElement(By.xpath("(//button[@id='custom'])[6]")).click();
	//	driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("Xtreme zone");
//		driver.findElement(By.xpath("(//a[contains(text(),'Xtreme zone')])[2]")).click();
		
//		driver.findElement(By.xpath("//span[.='Select Part']")).click();
//		driver.findElement(By.xpath("(//input[@id='custom'])[5]")).sendKeys("Foam Ball");
//		driver.findElement(By.xpath("(//a[normalize-space()='Foam Ball'])[1]")).click();
//		WebElement t = driver.findElement(By.xpath("//select[@id='custom']"));
//		Select sel=new Select(t);
//		sel.selectByVisibleText("Permanent");
//		driver.findElement(By.xpath("//input[@placeholder='Part Number']")).sendKeys("vgafhdujlsnjvfc");
//		Thread.sleep(4000);
//		WebElement d = driver.findElement(By.xpath("//select[@id='custom']"));
//		Select sel=new Select(d);
//		sel.selectByVisibleText("Permanent");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Part Number']")).sendKeys("rsdyctfugihsj");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[normalize-space()='Select Property']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("Xtreme Aqua");
//		driver.findElement(By.xpath("//a[normalize-space()='Xtreme Aqua']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Transfer To']")).sendKeys("jhgcfxgfjh");
//		String month1="Aug-2023";
//		String day1="15";
//		driver.findElement(By.xpath("//input[@placeholder='Return Date']")).click();
//		Thread.sleep(3000);
//		while(true)
//		{
//			//Aug-2023(Month-Year) path
//			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//
//			if(text.equals(month1))
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
//		driver.findElement(By.xpath("//span[normalize-space()="+day1+"]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@placeholder='Overdue']")).sendKeys("8653222222");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Part Name']")).sendKeys("grvvfe");
//		driver.findElement(By.xpath("//span[normalize-space()='Select Property']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("bhnjd");
//		driver.findElement(By.xpath("//span[normalize-space()='Select Priority']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[3]")).sendKeys("uibdhjbfr");
//		driver.findElement(By.xpath("//span[normalize-space()='Select Status']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Close']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Select Department']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[4]")).sendKeys("vhbcjn");
//		driver.findElement(By.xpath("//span[normalize-space()='Select origin']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='QR Issue']")).click();
//		//ticket no
//		driver.findElement(By.xpath("//input[@placeholder='Ticket No']")).sendKeys("5234");
//		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("subjectttttttttt");
//		
				
//				String month="Aug-2023";
//				String day="15";
//				driver.findElement(By.xpath("(//input[@placeholder='Date'])[1]")).click();
//				Thread.sleep(3000);
//				while(true)
//				{
//					//Aug-2023(Month-Year) path
//					String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//		
//					if(text.equals(month))
//					{
//						break;
//					}
//					else
//					{
//						//date scroll left icon
//						driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
//		
//					}
//		
//				}
//		
//				driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
//				
//				//input[@placeholder='To']
//				
//				
//				String end_month="Mar-2024";
//				String end_day="10";
//				driver.findElement(By.xpath("(//input[@placeholder='Date'])[2]")).click();
//				while(true)
//				{
//					//(Month-Year) path
//					String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
//		
//					if(text.equals(end_month))
//					{
//						break;
//					}
//					else
//					{
//						//Date scroll right icon
//						driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
//		
//					}
//		
//				}
//				driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
 	//Thread.sleep(5000);
//		driver.findElement(By.xpath("//Input[@placeholder='Schedule Name']")).sendKeys("gfvehcdkjl");
//		driver.findElement(By.xpath("//Input[@placeholder='Checklist Name']")).sendKeys("fuygkhbjvyguh");
		
//		driver.findElement(By.xpath("//span[@title='Select location']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[3]")).sendKeys("LLLLLLLLLLLLocation");
//		driver.findElement(By.xpath("//span[normalize-space()='Select Completed By']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[4]")).sendKeys("jfgkhl");
	//	driver.findElement(By.xpath("(//Input[@placeholder='Date'])[1]"))
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Document Type']")).sendKeys("fchgj");
//		driver.findElement(By.xpath("//input[@placeholder='Document Provider']")).sendKeys("vchjls");
//		driver.findElement(By.xpath("//input[@placeholder='Document Number']")).sendKeys("653256");
//		driver.findElement(By.xpath("//span[.='Select Created by']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[3]")).sendKeys("hgfweuhdsj");
//		Thread.sleep(4000);
		
		
		
		String month="Aug-2023";
		String day="11";
		driver.findElement(By.xpath("(//input[@placeholder='Date'])[1]")).click();
		Thread.sleep(3000);
		while(true)
		{
			//Aug-2023(Month-Year) path
			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

			if(text.equals(month))
			{
				break;
			}
			else
			{
				//date scroll left icon
				driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
		
		//input[@placeholder='To']
		
		
		String end_month="Oct-2023";
		String end_day="10";
		driver.findElement(By.xpath("(//input[@placeholder='Date'])[2]")).click();
		while(true)
		{
			//(Month-Year) path
			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

			if(text.equals(end_month))
			{
				break;
			}
			else
			{
				//Date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='button btn-primary']")).click();
		Thread.sleep(4000);

	}
	

}
