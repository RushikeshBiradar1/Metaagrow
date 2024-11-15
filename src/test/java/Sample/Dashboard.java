package Sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Date_Formats;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Dashboard extends BaseClass {
	@Test
	public void DashboardTest() throws Throwable
	{
                HomePage hp = new HomePage(driver);
//                hp.ClickOnMetersLinkText();
//                hp.ClickOnDashboardLinkText();
                Thread.sleep(3000);
                WebDriver_Utility e = new WebDriver_Utility();
                e.ImplicitlyWait(driver);
                
          //   driver.findElement(By.xpath("//button[normalize-space()='Inspections']")).click();
//                Thread.sleep(2000);
////                driver.findElement(By.xpath("(//*[name()='rect'])[8]")).click();
////                Thread.sleep(5000);
           //    driver.findElement(By.xpath("//button[normalize-space()='Tickets']")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//button[normalize-space()='Assets']")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//button[normalize-space()='Maintenance']")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//button[normalize-space()='Parts']")).click();
//                Thread.sleep(2000);
//                driver.findElement(By.xpath("//button[normalize-space()='Feedback & Surveys']")).click();
////                Thread.sleep(2000);
//                driver.findElement(By.xpath("//img[@alt='Delete']")).click();
//                driver.findElement(By.xpath("//span[normalize-space()='Select Property']")).click();
//                driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("yretyrte");
////                Thread.sleep(4000);
//               driver.findElement(By.xpath("//input[@placeholder='Survey / Feedback Name']")).sendKeys("cvghu");
//               driver.findElement(By.xpath("//span[.='Select Survey type']")).click();
//               driver.findElement(By.xpath("//a[normalize-space()='Feedback']")).click();
////                driver.findElement(By.xpath("//span[.='Select Asset']")).click();
//                driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("gvfcdxefrg");
//                driver.findElement(By.xpath("//span[normalize-space()='Select department']")).click();
//                driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("tneentttttt");
//                driver.findElement(By.xpath("//span[.='Select Part']")).click();
//                driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("hjefcbk");
                
//              Date_Formats d = new Date_Formats();
//              d.start_Date1(driver);
//              Thread.sleep(2000);
//              d.End_Date(driver);
////              Thread.sleep(6000);
//              driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
             // driver.findElement(By.xpath("//span[normalize-space()='Clear']")).click();
//             driver.findElement(By.xpath("//img[@alt='Duplicate']")).click();
//             Thread.sleep(4000);
//             driver.findElement(By.xpath("//span[.='Select origin']")).click();
//             driver.findElement(By.xpath("//a[.='Ad-Hoc Issue']")).click();
               
                
             Thread.sleep(4000);
               WebDriver_Utility w = new WebDriver_Utility();
               w.scrolldown(driver, 200);
//               Thread.sleep(6000);

	}
}
