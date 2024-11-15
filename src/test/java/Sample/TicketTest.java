package Sample;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.File_Utility;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Inspections;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Tickets;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TicketTest{
	
	
	public void RaiseTicket() throws Throwable
	{
////		WebDriver driver;
////		LoginPage lp = new LoginPage(driver);
////		lp.ClickOn_LoginNotification_Icon(driver);
////		WebDriver_Utility wb = new WebDriver_Utility();
////		wb.ImplicitlyWait(driver);
////		wb.maximizeTheBrowser(driver);
////		HomePage hp = new HomePage(driver);
////		hp.ClickOnTicketsLinkText();
//		
//		 File_Utility flib = new File_Utility();
//		String BROWSER = flib.getpropertykeyvalue("browser");
//		String URL = flib.getpropertykeyvalue("url");
//		if (BROWSER.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//		WebDriver	driver=new ChromeDriver();
//			driver.get(URL);
//
//		}
//		
//		WebDriver driver;
//
//		String USERNAME = flib.getpropertykeyvalue("user");
//		String PASSWORD = flib.getpropertykeyvalue("pass");
//		WebDriver_Utility wb = new WebDriver_Utility();
////		wb.ImplicitlyWait(driver);
//		LoginPage lp = new LoginPage(driver);
//		lp.Login(USERNAME, PASSWORD);
//		Tickets ticket = new Tickets(driver);
////		ticket.ClickOn_New_Ticket_Button();
////		
////		
////		ticket.SelectTicketType("General");
////		ticket.Clickon_Property_Dropdown_On_New_Ticket_Page("ANDHERI");
////		Thread.sleep(3000);
////		ticket.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
////		wb.SelectMultiUserCheckBox(driver, "Testing");
////		ticket.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
////		ticket.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
////		wb.SelectMultiUserCheckBox(driver, "Rushi");
////		wb.SelectMultiUserCheckBox(driver, "Biradar");
////		Java_Utility java = new Java_Utility();
////		int ran = java.getRandomNum();
////		ticket.ClickON_Filter_By_Title_TextField("Switchboard issue"+ran);
////		ticket.ClickOn_Select_Priority_Medium_Button();
////		Thread.sleep(3000);
////		ticket.ClickOn_Create_Ticket_Button_On_New_Ticket_Page();
////		Thread.sleep(3000);
////		ticket.ClickOn_Ok_Button_On_Confirmation_Page();
//////		WebElement viewTicket = driver.findElement(By.xpath("(//span[contains(text(),'View Ticket')])[1]"));
//////		Assert.assertTrue(viewTicket.isDisplayed(), "Ticket is not raised for fisrt question");
////		Thread.sleep(3000);
//		
////		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Reports Add']")));
//		element.click();
////		driver.findElement(By.xpath("//img[@alt='issues selected']")).click();
////		Thread.sleep(3000);
//		
//
//		driver.findElement(By.xpath("//img[@alt='Reports Add']")).click();
//		
//		ticket.SelectTicketType("General");
//		ticket.Clickon_Property_Dropdown_On_New_Ticket_Page("ANDHERI");
//		Thread.sleep(3000);
//		ticket.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
//		wb.SelectMultiUserCheckBox(driver, "Testing");
//		ticket.ClickON_Select_Department_Dropdown_On_New_Ticket_Page();
//		ticket.ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText();
//		wb.SelectMultiUserCheckBox(driver, "Rushi");
//		wb.SelectMultiUserCheckBox(driver, "Biradar");
//		Java_Utility java = new Java_Utility();
//		int ran = java.getRandomNum();
//		ticket.ClickON_Filter_By_Title_TextField("Switchboard issue"+ran);
//		ticket.ClickOn_Select_Priority_Medium_Button();
//		Thread.sleep(3000);
//		ticket.ClickOn_Create_Ticket_Button_On_New_Ticket_Page();
//		Thread.sleep(3000);
//		ticket.ClickOn_Ok_Button_On_Confirmation_Page();
//		
//		
//		
	}

}
