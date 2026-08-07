//package com.MetaaGrow.ObjectRepository;
//
//import java.time.Duration;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
//
//public class LoginPage {
//	
//	//Initialization
//	public LoginPage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	//Declaration
//	@FindBy(id="email") private WebElement userNameTextField;
//	@FindBy(id="password-input") private WebElement passWordTextField;
//	@FindBy(xpath = "//button[@type='submit']") private WebElement SignButton;
//	@FindBy(xpath = "//button[@id='onesignal-slidedown-cancel-button']") private WebElement NotificationLaterButton;
//	@FindBy(xpath = "//a[normalize-space()='Forgot password?']")private WebElement Forgot_Password_Button;
//	@FindBy(xpath = "//input[@placeholder='Enter email']")private WebElement Email_TextBox_On_Forgot_Page;
//	@FindBy(xpath = "//button[normalize-space()='Send']")private WebElement Send_Button_On_Forgot_Page;
//	@FindBy(xpath = "//button[@id='cancelEmailPopup']")private WebElement Cnacel_Button_On_ForGot_Page;
//	
//	
//	
//	//Getters Methods
//	public WebElement getUserNameTextField() {
//		return userNameTextField;
//	}
//	public WebElement getPassWordTextField() {
//		return passWordTextField;
//	}
//	public WebElement getSignButton() {
//		return SignButton;
//	}
//	public WebElement getNotificationLaterButton() {
//		return NotificationLaterButton;
//	}
//	public WebElement getForgot_Password_Button() {
//		return Forgot_Password_Button;
//	}
//	public WebElement getEmail_TextBox_On_Forgot_Page() {
//		return Email_TextBox_On_Forgot_Page;
//	}
//	public WebElement getSend_Button_On_Forgot_Page() {
//		return Send_Button_On_Forgot_Page;
//	}
//	public WebElement getCnacel_Button_On_ForGot_Page() {
//		return Cnacel_Button_On_ForGot_Page;
//	}
//	
//	 //Operational Methods
//	
//	public void ClickOn_userNameTextField(String Username)
//	{
//		userNameTextField.sendKeys(Username);
//	}
//	public void ClickOn_passWordTextField(String Password)
//	{
//		passWordTextField.sendKeys(Password);
//	}
//	public void ClickOn_SignButton()
//	{
//		SignButton.click();
//	}
//	public void Login(String username, String Password)
//	{
//		WebDriver_Utility wb = new WebDriver_Utility();
//		
//		userNameTextField.clear();  
//		passWordTextField.clear(); 
//		userNameTextField.sendKeys(username);
//		passWordTextField.sendKeys(Password);
//		SignButton.click();
//		
//
//		
//	}
//	public void ClickOn_Forgot_Password_Button()
//	{
//		Forgot_Password_Button.click();
//	}
//	public void ClickOn_Email_TextBox_On_Forgot_Page(String Enter_Email)
//	{
//		Email_TextBox_On_Forgot_Page.sendKeys(Enter_Email);
//	}
//	public void ClickOn_Send_Button_On_Forgot_Page()
//	{
//		Send_Button_On_Forgot_Page.click();
//	}
//	public void ClickOn_Cnacel_Button_On_ForGot_Page()
//	{
//		Cnacel_Button_On_ForGot_Page.click();
//	}
//	public void ClickOn_LoginNotification_Icon(WebDriver driver)
//	{
//		// driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
////		Alert alert = driver.switchTo().alert();
////		alert.dismiss();
////		  ChromeOptions options = new ChromeOptions();
////	        options.addArguments("--disable-notifications");
//		   try {
//	            // Example: Wait for the custom notification to appear and close it
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	            WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("normal-slidedown")));
//
//	            // Perform actions on the notification (e.g., click a close button)
//	            WebElement closeButton = notification.findElement(By.id("onesignal-slidedown-cancel-button"));
//	            closeButton.click();
//
//	            // Continue with other actions...
//	        } catch (Exception e) {
//	            // Notification not present within the timeout
//	            System.out.println("Notification did not appear within the timeout. Continuing with other actions.");
//	        }
//	}
//	
//
//}

package com.MetaaGrow.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private final WebDriver driver;
	private final WebDriverWait wait;

	// Locators (kept from old class, converted to By so they work with WebDriverWait)
	private final By emailInput = By.id("email");
	private final By passwordInput = By.id("password-input");
	private final By loginButton = By.xpath("//button[@type='submit']");
	private final By notificationLaterButton = By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
	private final By forgotPasswordButton = By.xpath("//a[normalize-space()='Forgot password?']");
	private final By emailTextBoxOnForgotPage = By.xpath("//input[@placeholder='Enter email']");
	private final By sendButtonOnForgotPage = By.xpath("//button[normalize-space()='Send']");
	private final By cancelButtonOnForgotPage = By.xpath("//button[@id='cancelEmailPopup']");
	private final By notificationSlidedown = By.id("normal-slidedown");

	// Initialization
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	// Getters (now wait until clickable, like the template pattern)
	public WebElement getUserNameTextField() {
		return wait.until(ExpectedConditions.elementToBeClickable(emailInput));
	}

	public WebElement getPassWordTextField() {
		return wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
	}

	public WebElement getSignButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	}

	public WebElement getNotificationLaterButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(notificationLaterButton));
	}

	public WebElement getForgot_Password_Button() {
		return wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordButton));
	}

	public WebElement getEmail_TextBox_On_Forgot_Page() {
		return wait.until(ExpectedConditions.elementToBeClickable(emailTextBoxOnForgotPage));
	}

	public WebElement getSend_Button_On_Forgot_Page() {
		return wait.until(ExpectedConditions.elementToBeClickable(sendButtonOnForgotPage));
	}

	public WebElement getCnacel_Button_On_ForGot_Page() {
		return wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnForgotPage));
	}

	// Operational Methods

	public void ClickOn_userNameTextField(String Username) {
		getUserNameTextField().sendKeys(Username);
	}

	public void ClickOn_passWordTextField(String Password) {
		getPassWordTextField().sendKeys(Password);
	}

	public void ClickOn_SignButton() {
		getSignButton().click();
	}

	// Kept from old class (custom method name/signature)
	public void Login(String username, String Password) {
		getUserNameTextField().clear();
		getPassWordTextField().clear();
		getUserNameTextField().sendKeys(username);
		getPassWordTextField().sendKeys(Password);
		getSignButton().click();
	}

	// Added: convenience methods mirroring template's naming style
	public void enterEmail(String email) {
		getUserNameTextField().clear();
		getUserNameTextField().sendKeys(email);
	}

	public void enterPassword(String password) {
		getPassWordTextField().clear();
		getPassWordTextField().sendKeys(password);
	}

	public void clickLogin() {
		getSignButton().click();
	}

	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLogin();
	}

	public void ClickOn_Forgot_Password_Button() {
		getForgot_Password_Button().click();
	}

	public void ClickOn_Email_TextBox_On_Forgot_Page(String Enter_Email) {
		getEmail_TextBox_On_Forgot_Page().sendKeys(Enter_Email);
	}

	public void ClickOn_Send_Button_On_Forgot_Page() {
		getSend_Button_On_Forgot_Page().click();
	}

	public void ClickOn_Cnacel_Button_On_ForGot_Page() {
		getCnacel_Button_On_ForGot_Page().click();
	}

	public void ClickOn_LoginNotification_Icon(WebDriver driver) {
		try {
			WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(notificationSlidedown));
			WebElement closeButton = notification.findElement(notificationLaterButton);
			closeButton.click();
		} catch (Exception e) {
			System.out.println("Notification did not appear within the timeout. Continuing with other actions.");
		}
	}

}
