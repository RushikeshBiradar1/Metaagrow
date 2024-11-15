package com.MetaaGrow.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MetaaGrow.Generic_Utility.WebDriver_Utility;

public class LoginPage {
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id="username") private WebElement userNameTextField;
	@FindBy(id="password") private WebElement passWordTextField;
	@FindBy(xpath ="//button[@class='button btn-primary d-flex w-100']") private WebElement SignButton;
	@FindBy(xpath = "//button[@id='onesignal-slidedown-cancel-button']") private WebElement NotificationLaterButton;
	@FindBy(xpath = "//a[normalize-space()='Forgot Password']")private WebElement Forgot_Password_Button;
	@FindBy(xpath = "//input[@placeholder='Enter email address']")private WebElement Email_TextBox_On_Forgot_Page;
	@FindBy(xpath = "//button[normalize-space()='Send']")private WebElement Send_Button_On_Forgot_Page;
	@FindBy(xpath = "//button[@id='cancelEmailPopup']")private WebElement Cnacel_Button_On_ForGot_Page;
	
	
	
	//Getters Methods
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getPassWordTextField() {
		return passWordTextField;
	}
	public WebElement getSignButton() {
		return SignButton;
	}
	public WebElement getNotificationLaterButton() {
		return NotificationLaterButton;
	}
	public WebElement getForgot_Password_Button() {
		return Forgot_Password_Button;
	}
	public WebElement getEmail_TextBox_On_Forgot_Page() {
		return Email_TextBox_On_Forgot_Page;
	}
	public WebElement getSend_Button_On_Forgot_Page() {
		return Send_Button_On_Forgot_Page;
	}
	public WebElement getCnacel_Button_On_ForGot_Page() {
		return Cnacel_Button_On_ForGot_Page;
	}
	
	 //Operational Methods
	
	public void ClickOn_userNameTextField(String Username)
	{
		userNameTextField.sendKeys(Username);
	}
	public void ClickOn_passWordTextField(String Password)
	{
		passWordTextField.sendKeys(Password);
	}
	public void ClickOn_SignButton()
	{
		SignButton.click();
	}
	public void Login(String username, String Password)
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		
		userNameTextField.clear();  
		passWordTextField.clear(); 
		userNameTextField.sendKeys(username);
		passWordTextField.sendKeys(Password);
		SignButton.click();
		

		
	}
	public void ClickOn_Forgot_Password_Button()
	{
		Forgot_Password_Button.click();
	}
	public void ClickOn_Email_TextBox_On_Forgot_Page(String Enter_Email)
	{
		Email_TextBox_On_Forgot_Page.sendKeys(Enter_Email);
	}
	public void ClickOn_Send_Button_On_Forgot_Page()
	{
		Send_Button_On_Forgot_Page.click();
	}
	public void ClickOn_Cnacel_Button_On_ForGot_Page()
	{
		Cnacel_Button_On_ForGot_Page.click();
	}
	public void ClickOn_LoginNotification_Icon(WebDriver driver)
	{
		// driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		  ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--disable-notifications");
		   try {
	            // Example: Wait for the custom notification to appear and close it
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("normal-slidedown")));

	            // Perform actions on the notification (e.g., click a close button)
	            WebElement closeButton = notification.findElement(By.id("onesignal-slidedown-cancel-button"));
	            closeButton.click();

	            // Continue with other actions...
	        } catch (Exception e) {
	            // Notification not present within the timeout
	            System.out.println("Notification did not appear within the timeout. Continuing with other actions.");
	        }
	}
	

}
