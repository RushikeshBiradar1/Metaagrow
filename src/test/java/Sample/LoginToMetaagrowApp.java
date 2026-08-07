package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToMetaagrowApp {
	@Test
	public static void main(String[] args) throws Throwable {
		
			WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://myworld.metaagrow.com/login-view");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
			driver.findElement(By.id("email")).sendKeys("dhoni07@gmail.com");
			driver.findElement(By.id("password-input")).sendKeys("Metaa@123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//Reports
//			driver.findElement(By.xpath("//span[text()='Reports']")).click();
			Thread.sleep(2000);
			driver.close();
//			//DashBoard
//			driver.findElement(By.xpath("//img[@alt='dashboard']")).click();
//			Thread.sleep(2000);
//			//Inspect
//			driver.findElement(By.xpath("//img[@alt='inspect']")).click();
//			Thread.sleep(2000);
//			//Tickets
//			driver.findElement(By.xpath("//img[@alt='issues']")).click();
//			Thread.sleep(2000);
//			//Assets
//			driver.findElement(By.xpath("//img[@alt='assets']")).click();
//			Thread.sleep(2000);
//			//Parts & Inventory
//			driver.findElement(By.xpath("//img[@alt='parts']")).click();
//			Thread.sleep(2000);
//			//MAintenance
//			driver.findElement(By.xpath("//img[@alt='maintenance']")).click();
//			Thread.sleep(2000);
//			//Meter
//			driver.findElement(By.xpath("//img[@alt='meter']")).click();
//			Thread.sleep(3000);
//			//setup
//			driver.findElement(By.xpath("//img[@src='../../assets/images/icons/setup_logo.svg']")).click();
//			Thread.sleep(3000);
//			//Dark Mode
//			driver.findElement(By.xpath("//span[@class='slider']")).click();
//			Thread.sleep(2000);
//			//Collapse Button
//			driver.findElement(By.xpath("//img[@alt='collapse.svg']")).click();
//			Thread.sleep(2000);
//			//signOutImg
//			driver.findElement(By.id("customLogout")).click();
//			//Logout
//	        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	        //reset password
//        driver.findElement(By.xpath("//a[normalize-space()='Reset Password']")).click();
//	        driver.close();
//			//Departments
//			driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[1]/a[1]/div[1]")).click();
//      //Add Departments
//			//driver.findElement(By.xpath("//span[text()='Add Department']")).click();
//			//Departments Name
//			driver.findElement(By.xpath("//input[@placeholder='Department Name']")).sendKeys("RAM");
//			driver.findElement(By.xpath("//button[@class='form-control selectFreq']")).click();
//			driver.findElement(By.xpath("//a[text()='Inactive']")).click();
//			driver.findElement(By.xpath("//button[@class='form-control selectFreq']")).click();
//
//			driver.findElement(By.xpath("//a[text()='Active']")).click();
//			//driver.findElement(By.xpath("//button[@class='button btn-primary next-step']")).click();
//			Thread.sleep(2000);
//		//	driver.findElement(By.xpath("//button[@class='button btn-secondary prev-step']")).click();
//		     driver.findElement(By.xpath("//span[text()='Close']")).click();
			//driver.findElement(By.xpath("//img[@alt='Back']")).click();
     // driver.findElement(By.xpath("//button[normalize-space()='Inactive']")).click();
//      driver.findElement(By.xpath("//span[text()='Filter']")).click();
//      driver.findElement(By.xpath("//input[@id='custom']")).sendKeys("Hello");
//      Thread.sleep(2000);
//     // driver.findElement(By.xpath("//span[text()='Apply']")).click();
//      driver.findElement(By.xpath("//span[text()='Clear']")).click();
	}

}
