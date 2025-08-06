package Sample;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MetaaGrow.Generic_Utility.File_Utility;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SurveyD_BTest {
	static WebDriver driver;
	public static void main(String[]args) throws Throwable
	{
		File_Utility flib=new File_Utility();
		String BROWSER = flib.getpropertykeyvalue("browser");
		String URL = flib.getpropertykeyvalue("url");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://192.168.1.32:8085/customer-feedback-Questions/cHJvcGVydHktMTM4Mw");
			Thread.sleep(3000);
          Java_Utility j = new Java_Utility();
          int ran = j.getRandomNum();
          
			driver.findElement(By.xpath("//input[@placeholder=\"Full Name *\"]")).sendKeys("Agney"+ran);
			driver.findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("agney" + ran + "@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Mobile No.']")).sendKeys("4852"+ran+"523");
			
			  // Initialize WebDriverWait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       WebDriver_Utility wb = new WebDriver_Utility();
	       wb.scrolldown(driver, 8000);
		    // Wait for the "All Survey" element to be clickable and then click
	        WebElement surveyElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='car-image text-center'])[4]")));
	        surveyElement.click();
	        
	        // Wait for the "Next" button to be clickable and then click
	        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Next\"]")));
	        nextButton.click();
	        
	        // Wait for the question to be visible
	        WebElement questionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[contains(text(),'. Please rate your overall satisfaction with your ')])[1]")));

	        // Check if the question is displayed
	        if (questionElement.isDisplayed()) {
	            // Wait for the "Satisfied" radio button to be clickable and then click it
	            WebElement satisfiedOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space(text())='Satisfied']/preceding-sibling::span[@class='radio-button']")));
	            satisfiedOption.click();
	        }
	     
	        // Wait for the question to be visible
	        WebElement questionElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //label[contains(text(),\". Have you ordered the Food & Beverages in the Bow\")]")));

	        // Check if the question is displayed
	        if (questionElement2.isDisplayed()) {
	            // Wait for the "No" radio button to be clickable and then click it
	            WebElement satisfiedOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for=\"no\"]")));
	            satisfiedOption.click();
	        }
	      
	        // Create an instance of Random class
	        Random rand = new Random();
	        
	        // Generate a random number between 1 and 5
	        int randomNumber = rand.nextInt(5) + 1;  // nextInt(5) gives values from 0 to 4, so add 1 to get 1 to 5
	        
	        // Wait for the question to be visible
	        WebElement questionElement3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),\". Availability of bowling lanes (no long waiting t\")]")));

	        // Check if the question is displayed
	        if (questionElement3.isDisplayed()) {
	            // Wait for the "No" radio button to be clickable and then click it
	            WebElement satisfiedOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='rating-circle'][normalize-space()='"+randomNumber+"'])[1]")));
	            satisfiedOption.click();
	        }
	      
	        // Wait for the question to be visible
	        WebElement questionElement4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),' Quality and cleanliness of the bowling equipment')]")));

	        // Check if the question is displayed
	        if (questionElement4.isDisplayed()) {
	            // Wait for the "No" radio button to be clickable and then click it
	            WebElement satisfiedOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='rating-circle'][normalize-space()='"+randomNumber+"'])[2]")));
	            satisfiedOption.click();
	        }
	        // Wait for the question to be visible
	        WebElement questionElement5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" . The lane conditions (smoothness, pin reset). ")));

	        // Check if the question is displayed
	        if (questionElement4.isDisplayed()) {
	            // Wait for the "No" radio button to be clickable and then click it
	            WebElement satisfiedOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='rating-circle'][normalize-space()='"+randomNumber+"'])[3]")));
	            satisfiedOption.click();
	        }
		}}

}
