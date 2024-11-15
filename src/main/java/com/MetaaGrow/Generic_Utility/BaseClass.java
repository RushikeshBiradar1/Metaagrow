package com.MetaaGrow.Generic_Utility;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {

	public static WebDriver sDriver;
	public WebDriver driver;


	@BeforeMethod
	public void beforeMethod() throws Throwable {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



		File_Utility flib=new File_Utility();

		String USERNAME = flib.getpropertykeyvalue("user");
		String PASSWORD = flib.getpropertykeyvalue("pass");
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		LoginPage lp = new LoginPage(driver);
		lp.Login(USERNAME, PASSWORD);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Throwable {

		if(ITestResult.FAILURE==result.getStatus())
		{
			
			Listeners lt=new Listeners();
			lt.onTestFailure(driver, result.getName());
		}

		HomePage hp = new HomePage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		
//		 // Create a WebDriverWait instance with a timeout of 5 seconds
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//	    try {
//	        // Wait for the sign-out image to be visible
//	        WebElement signOutImgIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customLogout"))); // Update with the actual ID
//
//	        // If the sign-out image is displayed and clickable, click it
//	        if (signOutImgIcon.isDisplayed() && signOutImgIcon.isEnabled()) {
//	            signOutImgIcon.click();
//	            hp.ClickOnLogoutLinkText(driver);
//	        } else {
//	            // If not clickable, navigate to the specified URL
//	            driver.get("https://myworld.metaagrow.com/dashboard-checklist");
//	            // Attempt to re-find the sign-out image and click it
//	            signOutImgIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customLogout")));
//	            if (signOutImgIcon.isDisplayed() && signOutImgIcon.isEnabled()) {
//	                signOutImgIcon.click();
//	                hp.ClickOnLogoutLinkText(driver);
//	            }
//	        }
//	    } catch (TimeoutException e) {
//	        // If the sign-out image is not visible within 5 seconds, check for the notification
//	        System.out.println("Sign-out image not visible within 5 seconds. Checking for notification...");
//
//	        try {
//	            WebElement notificationIcon = driver.findElement(By.id("onesignal-slidedown-cancel-button")); // Update with the actual ID
//
//	            // Check if the notification icon is displayed and enabled
//	            if (notificationIcon.isDisplayed() && notificationIcon.isEnabled()) {
//	                notificationIcon.click();
//	                // Optionally, add a wait here if the notification requires some time to load
//	                Thread.sleep(2000); // Adjust as necessary, or use WebDriverWait for a specific element
//
//	                // After handling the notification, try to click the sign-out image again
//	                try {
//	                    WebElement signOutImgIcon1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customLogout"))); // Re-check for the sign-out icon
//	                    if (signOutImgIcon1.isDisplayed() && signOutImgIcon1.isEnabled()) {
//	                        signOutImgIcon1.click();
//	                        hp.ClickOnLogoutLinkText(driver);
//	                    }
//	                } catch (TimeoutException ex) {
//	                    System.out.println("Sign-out image not visible after clicking notification.");
//	                }
//	            } else {
//	                System.out.println("Notification icon is not displayed or enabled.");
//	            }
//	        } catch (NoSuchElementException ex) {
//	            System.out.println("Notification icon not found.");
//	        }
//	    } catch (NoSuchElementException e) {
//	        System.out.println("Sign-out image not found.");
//	    } catch (Exception e) {
//	        System.out.println("An unexpected error occurred: " + e.getMessage());
//	    }

		//--------------------------------------------------------------------------------------
		
//		// Create a WebDriverWait instance with a timeout of 5 seconds
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//		try {
//		    // Wait for the sign-out image to be visible
//		    WebElement signOutImgIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customLogout"))); // Update with the actual ID
//
//		    // If the sign-out image is displayed, click it
//		    if (signOutImgIcon.isDisplayed() || signOutImgIcon.isEnabled()) {
//		        signOutImgIcon.click();
//		        hp.ClickOnLogoutLinkText(driver);
//		    }
//		   
//		} catch (TimeoutException e) {
//		    // If the sign-out image is not visible within 5 seconds, check for the notification
//		    System.out.println("Sign-out image not visible within 5 seconds. Checking for notification...");
//
//		    try {
//		        WebElement notificationIcon = driver.findElement(By.id("onesignal-slidedown-cancel-button")); // Update with the actual ID
//
//		        // Check if the notification icon is displayed and enabled
//		        if (notificationIcon.isDisplayed() && notificationIcon.isEnabled()) {
//		            notificationIcon.click();
//		            // Optionally, add a wait here if the notification requires some time to load
//		            Thread.sleep(2000); // Adjust as necessary, or use WebDriverWait for a specific element
//
//		            // After handling the notification, try to click the sign-out image again
//		            try {
//		            	WebElement signOutImgIcon1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customLogout"))); // Re-check for the sign-out icon
//		                if (signOutImgIcon1.isDisplayed() || signOutImgIcon1.isEnabled()) {
//		                	signOutImgIcon1.click();
//		                	hp.ClickOnLogoutLinkText(driver);
//		                }
//		            } catch (TimeoutException ex) {
//		                System.out.println("Sign-out image not visible after clicking notification.");
//		            }
//		        } else {
//		        	
//		            System.out.println("Notification icon is not displayed or enabled.");
//		        }
//		    } catch (NoSuchElementException ex) {
//		        System.out.println("Notification icon not found.");
//		    }
//		} catch (NoSuchElementException e) {
//		    System.out.println("Sign-out image not found.");
//		} catch (Exception e) {
//		    System.out.println("An unexpected error occurred: " + e.getMessage());
//		}
		
//		-------------------------------------------
//		 Wait for the sign-out image to be clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // adjust the timeout as per your need

		boolean signOutClicked = false; // Initialize the boolean variable to false

		try {
			WebElement signOutImgIcon = wait.until(ExpectedConditions.elementToBeClickable(By.id("customLogout")));

			// Check if the element is clickable but not clicked
			if (signOutImgIcon.isEnabled() && !signOutClicked) {
				// Click the element to mark it as clicked
				driver.get("https://myworld.metaagrow.com/dashboard-checklist");

				// Update the boolean variable to true
				signOutClicked = true;
			} else {
				// Navigate to the URL if the sign-out image is not clickable or already clicked
				driver.get("https://myworld.metaagrow.com/dashboard-checklist");

				// Verify navigation success before proceeding
				// Add code here to verify navigation success if needed
			}
		} catch (TimeoutException e) {
			// Handle the case when the element is not clickable within the specified timeout
			System.out.println("Sign-out image is not clickable within the specified time.");
			//	      driver.get("https://myworld.metaagrow.com/dashboard-checklist");
			// You may choose to take alternative actions here
		}

		// Implicitly wait for the page to load
		wb.ImplicitlyWait(driver);

		// Proceed with sign-out
		hp.ClickOnSignOutImgIcon();
		hp.ClickOnLogoutLinkText(driver);
	}


	//*******************************************************************************	
	
		
		
//		-----------------------
		//	  HomePage hp = new HomePage(driver);
		//	  HomePage hp = new HomePage(driver);
		//	  boolean signOutIconClicked = false;
		//	  String parentWindowHandle = driver.getWindowHandle();
		//
		//	  try {
		//	      hp.ClickOnSignOutImgIcon(); // Attempt to click on sign-out icon
		//	      signOutIconClicked = true;
		//	  } catch (NoSuchElementException e) {
		//	      // If the sign-out icon is not clickable or not found, navigate to the URL
		//	      driver.get("https://myworld.metaagrow.com/dashboard-checklist");
		//	  }
		//
		//	  if (!signOutIconClicked) {
		//	      // Perform wait after navigation
		//	      WebDriver_Utility wb = new WebDriver_Utility();
		//	      wb.ImplicitlyWait(driver);
		//	      driver.get("https://myworld.metaagrow.com/dashboard-checklist");
		//
		//	    
		//	      // Attempt to click on sign-out icon again after navigation
		//	      hp.ClickOnSignOutImgIcon();
		//	  }
		//
		//	  // Proceed with sign-out
		//	  hp.ClickOnLogoutLinkText();


		//	  driver.get("https://myworld.metaagrow.com/dashboard-checklist");
		//	 
		//	  hp.ClickOnSignOutImgIcon(); 
		//	  hp.ClickOnLogoutLinkText();

		//	  driver.quit();

		// driver.close();
	

	@BeforeClass
	public void beforeClass() throws Throwable {
		File_Utility flib=new File_Utility();
		String BROWSER = flib.getpropertykeyvalue("browser");
		String URL = flib.getpropertykeyvalue("url");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(URL);

		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(URL);

		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(URL);


		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(URL);
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	} 

	@BeforeTest
	public void beforeTest() {


	}

	@AfterTest
	public void afterTest() {

	}

	@BeforeSuite
	public void setExtent() {

	}

	@AfterSuite
	public void afterSuite() {
	}

	//  public void onTestFailure(WebDriver driver, String tname) throws Throwable
	//  {
	//		
	//	  TakesScreenshot ts=(TakesScreenshot) driver;
	//	  File src = ts.getScreenshotAs(OutputType.FILE);
	//	  File dest=new File("./screenshot/"+tname+".png");
	//	  Files.copy(src, dest);
	//	  System.out.println("Screenshot Taken");
	//  }




}


