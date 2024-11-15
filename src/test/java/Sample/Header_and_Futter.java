package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Header_and_Futter extends BaseClass {
	@Test
	public void FooterCheck() throws Throwable
	{
      HomePage hp = new HomePage(driver);
      hp.ClickOnMetersLinkText();
      WebDriver_Utility w = new WebDriver_Utility();
      w.maximizeTheBrowser(driver);
      
//      driver.findElement(By.xpath("//img[@src='../../assets/images/icons/right.svg']")).click();
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("//img[@src='../../assets/images/icons/left.svg']")).click();
//     WebElement j = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[2]"));
//     Select sel=new Select(j);
//     sel.selectByVisibleText("2");
//     Thread.sleep(5000);
 //   driver.findElement(By.xpath("//ul[@class='jump-to']//div[@class='img-box']")).click();
//    WebElement d = driver.findElement(By.xpath("(//select[@id='RowPerPage'])[1]"));
//    Select sel1=new Select(d);
//    sel1.selectByVisibleText("40");
//      driver.findElement(By.xpath("//span[normalize-space()='Bowling Meter']")).click();
//      Thread.sleep(5000);
//      driver.findElement(By.xpath("//span[normalize-space()='Back']")).click();
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("//span[normalize-space()='Add New Meter']")).click();
//      Thread.sleep(5000);
//      driver.findElement(By.xpath("//span[normalize-space()='Close']")).click();
      driver.findElement(By.xpath("//span[normalize-space()='Dark Mode']")).click();
      driver.findElement(By.xpath("//img[@alt='collapse.svg']")).click();
    Thread.sleep(5000);
    }
}
