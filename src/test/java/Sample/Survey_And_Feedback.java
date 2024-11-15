package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class Survey_And_Feedback extends BaseClass {
	@Test
	public void CreateSurvey() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		
		Setup sp = new Setup(driver);
		sp.ClickOnSurveysLinkText();
		
//		driver.findElement(By.xpath("//button[.='Feedback']")).click();
//		driver.findElement(By.xpath("//button[@class='active button']")).click();
//		driver.findElement(By.xpath("//span[.='Filter']")).click();
//		driver.findElement(By.xpath("(//span[.='Property'])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Location Name']")).sendKeys("Nilanga");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[.='Apply']")).click();
//		driver.findElement(By.xpath("//span[.='Clear']")).click();
		driver.findElement(By.xpath("//span[.='Create Survey']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Survey Name']")).sendKeys("Survey23");
//		WebElement p = driver.findElement(By.xpath("//select[@formcontrolname='outletId']"));
//		Select sel=new Select(p);
//		sel.selectByVisibleText("Beast1");
//		driver.findElement(By.xpath("//input[@placeholder='Feedback Location']")).sendKeys("Datta_NAgar");
//		Thread.sleep(4000);
//		//email Mandatory checkbox
//		driver.findElement(By.xpath("//input[@formcontrolname='emailmandatory']")).click();
//		//mobile no mandtory check box
//		driver.findElement(By.xpath("//input[@formcontrolname='mobilemandatory']")).click();
		//Thread.sleep(3000);
		//slider
	//	driver.findElement(By.xpath("(//span[@class='slider'])[2]")).click();
//		WebDriver_Utility wb = new WebDriver_Utility();
//		wb.doubleClick_On_Element(slider);
//		Actions act=new Actions(driver);
//		act.doubleClick(slider).perform();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='groupName']")).sendKeys("He hi");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Question']")).sendKeys("Question 12");
//		Thread.sleep(3000);
driver.findElement(By.xpath("//span[.='Add new Section']")).click();	
	//	down arrow
	//	driver.findElement(By.xpath("//img[@alt='Down']")).click();
		driver.findElement(By.xpath("(//input[@style='width: 18px;height: 18px;'])[2]")).click();
		//cancel button on create survey page
		driver.findElement(By.xpath("//span[.='Cancel']")).click();
		driver.findElement(By.xpath("//span[.='Create']")).click();
		//single question text box
		driver.findElement(By.xpath("//input[@placeholder='Enter Question']")).sendKeys("q.21");
		driver.findElement(By.xpath("//span[.='Close']")).click();
		
	}

}
