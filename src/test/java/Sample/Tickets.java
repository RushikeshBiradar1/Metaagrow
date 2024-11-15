package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;

public class Tickets extends BaseClass {
	@Test
	public void Tecket() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnTicketsLinkText();
		//		driver.findElement(By.xpath("//button[normalize-space()='Closed']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Parked']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Not Valid']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Open']")).click();
		//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='Filter']")).click();
//		driver.findElement(By.xpath("//span[@title='Select Property']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[1]")).sendKeys("Xtreme Arcade Zone");
//		driver.findElement(By.xpath("//a[.='Xtreme Arcade Zone']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Select priority']")).click();
//		driver.findElement(By.xpath("//a[.='High']")).click();
//		driver.findElement(By.xpath("//span[@title='Select Department']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[2]")).sendKeys("Housekeeping");
//		driver.findElement(By.xpath("//a[.='Housekeeping']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Select raised By']")).click();
//		driver.findElement(By.xpath("(//input[@name='autocomplete'])[3]")).sendKeys("Hassan");
//		driver.findElement(By.xpath("//span[normalize-space()='Select assign to']")).click();
		//driver.findElement(By.xpath("(//input[@name='autocomplete'])[4]")).sendKeys("Jennifer Thompson");
		//driver.findElement(By.xpath("(//a[.='Jennifer Thompson'])[2]")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Select origin']")).click();
//		driver.findElement(By.xpath("//a[.='Ad-Hoc Issue']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Ticket No.']")).sendKeys("45");
//		driver.findElement(By.xpath("//input[@placeholder='Title']")).sendKeys("udhekjn");
//		Thread.sleep(9000);
//		driver.findElement(By.xpath("//span[normalize-space()='Apply']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Clear']")).click();
	//	driver.findElement(By.xpath("//span[@title='123']")).click();
//		WebElement r = driver.findElement(By.xpath("(//select[@id='selectUser'])[1]"));
//		Select sel=new Select(r);
//		sel.selectByVisibleText("Not Valid ");
//		
//		Thread.sleep(4000);
//		WebElement u = driver.findElement(By.xpath("(//select[@id='selectUser'])[2]"));
//		Select sel1=new Select(u);
//		sel1.selectByVisibleText(" Medium");
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Forward Ticket']")).click();
//		WebElement t = driver.findElement(By.xpath("//select[@id='site']"));
//		Select sel3=new Select(t);
//		sel3.selectByVisibleText(" Operations");
//		Thread.sleep(2000);
//		WebElement su = driver.findElement(By.xpath("//select[@formcontrolname='forwarUser']"));
//		Select sel4=new Select(su);
//		sel4.selectByVisibleText(" Rushi");
//		driver.findElement(By.xpath("//div[normalize-space()='Low']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//textarea[@id='location_reason']")).sendKeys("RRRRRRRRRRRRRRTTTTTT");
//		driver.findElement(By.xpath("//label[@for='uploadProfile']//img[@alt='upload images']")).sendKeys("C:\\Users\\SynccIT\\Downloads\\pxfuel.jpg");
//		driver.findElement(By.xpath("(//img[@class='uploadSection'])[2]")).sendKeys("C:\\Users\\SynccIT\\Videos\\Captures\\inspection.mp4");
//		Thread.sleep(40000);
//		driver.findElement(By.xpath("//span[normalize-space()='Forward']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		
//		driver.findElement(By.xpath("//textarea[@id='reply']")).sendKeys("RRRRRRRRRRRRRRRRRRTYUJ");
//		driver.findElement(By.xpath("//a[normalize-space()='Submit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='New Ticket']")).click();
		//select property_Dropdown
		//select[@formcontrolname='outletId']
//		WebElement p = driver.findElement(By.xpath("//select[@id='site']"));
//		Select sel=new  Select(p);
//		sel.selectByVisibleText(" THE_DHARAVI");
//		Thread.sleep(2000);
//		WebElement d = driver.findElement(By.xpath("//select[@formcontrolname='departmentId']"));
//		Select sel1=new Select(d);
//		sel1.selectByVisibleText(" Housekeeping");
//		Thread.sleep(2000);
//		WebElement ut = driver.findElement(By.xpath("//select[@formcontrolname='userId']"));
//		Select sel2=new Select(ut);
//		sel2.selectByVisibleText(" SSA");
//		driver.findElement(By.xpath("//input[@formcontrolname='subject']")).sendKeys("feijl");
//		driver.findElement(By.xpath("//textarea[@id='location_reason']")).sendKeys("YTFUGHYTUYGJHVHCFUYG");
//		WebElement asset = driver.findElement(By.xpath("//select[@formcontrolname='assetId']"));
//		Select sel3=new Select(asset);
//		sel3.selectByVisibleText(" Bowling Lane ");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[normalize-space()='Low']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[normalize-space()='Create Ticket']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Escalation Setup']")).click();
		WebElement p = driver.findElement(By.xpath("//select[@id='site']"));
		Select sel=new Select(p);
		sel.selectByVisibleText(" THE_DHARAVI");
		WebElement d = driver.findElement(By.xpath("//select[@id='Housekeeping']"));
		Select sel1=new Select(d);
		sel1.selectByVisibleText(" Operations");
		driver.findElement(By.xpath("//label[@for='check1']")).click()	;
		WebElement days = driver.findElement(By.xpath("//select[@formcontrolname='level1days']"));
		Select sel2=new Select(days);
		sel2.selectByVisibleText(" 4");
		WebElement hrs = driver.findElement(By.xpath("//select[@formcontrolname='level1hours']"));
		Select sel3=new Select(hrs);
		sel3.selectByVisibleText(" 5");
		WebElement minute = driver.findElement(By.xpath("//select[@formcontrolname='level1minute']"));
		Select sel4=new Select(minute);
		sel4.selectByVisibleText(" 7");
		
		WebElement user = driver.findElement(By.xpath("//select[@formcontrolname='level1user']"));
		Select sel5=new Select(user);
		sel5.selectByVisibleText(" Biradar");
		Thread.sleep(5000);
		
	}

}
