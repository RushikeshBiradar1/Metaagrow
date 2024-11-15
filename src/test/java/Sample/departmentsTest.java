package Sample;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class departmentsTest {
	@Test
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup(); 
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myworld.metaagrow.com/login-view");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Rushi@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sky@123");
		driver.findElement(By.xpath("//button[@class='button btn-primary d-flex w-100']")).click();
		//setup

		driver.findElement(By.xpath("//img[@src='../../assets/images/icons/setup_logo.svg']")).click();
		//Departments
	    driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[1]/a[1]/div[1]")).click();
Thread.sleep(2000);

     //	driver.findElement(By.xpath("//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[1]/a[1]/div[1]")).click();
	   // driver.findElement(By.xpath("//span[text()='Back']")).click();
driver.findElement(By.xpath("//img[@src='../../assets/images/icons/right.svg']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src='../../assets/images/icons/left.svg']")).click();

	}

}
