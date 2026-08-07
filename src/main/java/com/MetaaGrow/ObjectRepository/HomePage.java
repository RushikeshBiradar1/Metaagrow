package com.MetaaGrow.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.github.dockerjava.api.model.Driver;

public class HomePage {

	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//
//	//Declaration
//
//	@FindBy(xpath = "//a[@id='dashboard']") private WebElement DashboardLinkText;
//	@FindBy(xpath = "//a[@id='reports']")private WebElement ReportsLinkText;
//	@FindBy(id = "inspection")private WebElement InspectionsLinkText;
//	@FindBy(xpath = "//a[@id='tickets']") private WebElement TicketsLinkText;
//	@FindBy(id = "asset") private WebElement AssetsLinkText;
//	@FindBy(xpath = "//a[@id='parts']") private WebElement PartsandInventoryLinkText;
//	@FindBy(xpath = "//a[@id='maintenance']")private WebElement MaintenanceLinkText;
//	@FindBy(xpath = "//a[@id='meters']") private WebElement MetersLinkText;
//	@FindBy(xpath = "//a[@id='setup']")private WebElement SetupLinkText;
//	@FindBy(xpath = "//span[@class='slider']") private WebElement DarkModeButton;
//	@FindBy(xpath = "//img[@alt='collapse.svg']")private WebElement CollapseButton;
//	@FindBy(id = "customLogout")private WebElement SignOutImgIcon;
//	
//	//a[normalize-space()='Logout']
//	@FindBy(xpath = "//ul[@id='customLogoutBox']//a[.='Logout']")private WebElement LogoutLinkText;
//	@FindBy(xpath = "//a[normalize-space()='Reset Password']")private WebElement ResetPasswordLinkText;
//	@FindBy(xpath = "//img[@src='../../assets/images/icons/bell.svg']") private WebElement NotificationButton;
//	@FindBy(xpath = "https://myworld.metaagrow.com/dashboard-checklist")private WebElement DashboardUrl;
//	@FindBy(id ="onesignal-slidedown-cancel-button")private WebElement LaterButtonOnNotification;
//
//	//Getters Methods
//
//	public WebElement getLaterButtonOnNotification() {
//		return LaterButtonOnNotification;
//	}
//	public WebElement getDashboardUrl() {
//		return DashboardUrl;
//	}
//	public WebElement getDashboardLinkText() {
//		return DashboardLinkText;
//	}
//	public WebElement getReportsLinkText() {
//		return ReportsLinkText;
//	}
//	public WebElement getInspectionsLinkText() {
//		return InspectionsLinkText;
//	}
//	public WebElement getTicketsLinkText() {
//		return TicketsLinkText;
//	}
//	public WebElement getAssetsLinkText() {
//		return AssetsLinkText;
//	}
//	public WebElement getPartsandInventoryLinkText() {
//		return PartsandInventoryLinkText;
//	}
//	public WebElement getMaintenanceLinkText() {
//		return MaintenanceLinkText;
//	}
//	public WebElement getMetersLinkText() {
//		return MetersLinkText;
//	}
//	public WebElement getSetupLinkText() {
//		return SetupLinkText;
//	}
//	public WebElement getDarkModeButton() {
//		return DarkModeButton;
//	}
//	public WebElement getCollapseButton() {
//		return CollapseButton;
//	}
//	public WebElement getSignOutImgIcon() {
//		return SignOutImgIcon;
//	}
//	public WebElement getLogoutLinkText() {
//		return LogoutLinkText;
//	}
//	public WebElement getResetPasswordLinkText() {
//		return ResetPasswordLinkText;
//	}
//
//	public WebElement getNotificationButton() {
//		return NotificationButton;
//	}
//	
//	//Business Logic
//	public void ClickOnDashboardLinkText()
//	{
//		DashboardLinkText.click();
//	}
//
//	public void ClickOnReportsLinkText()
//	{
//		ReportsLinkText.click();
//	}
//
//	public void ClickOnInspectionsLinkText()
//	{
//		
//		InspectionsLinkText.click();	
//	}
//
//	public void ClickOnTicketsLinkText()
//	{
//		TicketsLinkText.click();
//	}
//
//	public void ClickOnAssetsLinkText()
//	{
//		AssetsLinkText.click();
//	}
//
//	public void ClickOnPartsandInventoryLinkText()
//	{
//		PartsandInventoryLinkText.click();
//	}
//
//	public void ClickOnMaintenanceLinkText()
//	{
//		MaintenanceLinkText.click();
//	}
//
//	public void ClickOnMetersLinkText()
//	{
//		MetersLinkText.click();
//	}
//
//	public void ClickOnSetupLinkText(WebDriver driver)
//	{
//		WebDriver_Utility wb = new WebDriver_Utility();
//		wb.ImplicitlyWait(driver);
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		// Wait for the overlay to disappear
////		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("li.active div.backdrop")));
//	        WebElement setupElement = wait.until(ExpectedConditions.elementToBeClickable(SetupLinkText));
//
//	        // Perform click action
//	        if (setupElement != null) {
//	            setupElement.click();
//	        } else {
//	            System.out.println("Element with id 'setup' not found or not clickable within the specified timeout.");
//	        }
////		SetupLinkText.click();
//	}
//
//	public void ClickOnDarkModeButton()
//	{
//		DarkModeButton.click();
//	}
//	public void ClickOnCollapseButton()
//	{
//		CollapseButton.click();
//	}
//	
//	public void ClickOnSignOutImgIcon() {
//		
////	    // Check if the SignOutImgIcon is enabled
////	    if (SignOutImgIcon.isEnabled()) {
////	        SignOutImgIcon.click();
////	    } else {
////	        // If not, check if the LaterButtonOnNotification is enabled
////	        if (LaterButtonOnNotification.isEnabled()) {
////	            LaterButtonOnNotification.click();
////	            // After clicking LaterButtonOnNotification, attempt to click SignOutImgIcon again
////	            if (SignOutImgIcon.isEnabled()) {
////	                SignOutImgIcon.click();
////	            } else {
////	                System.out.println("SignOutImgIcon is still not enabled after clicking LaterButtonOnNotification.");
////	            }
////	        } else {
////	            System.out.println("Neither SignOutImgIcon nor LaterButtonOnNotification is enabled.");
////	        }
////	    }
//		 // Check if the SignOutImgIcon is enabled
//	    if (SignOutImgIcon.isEnabled()) {
//	        SignOutImgIcon.click();
//	    } else {
//	        // Check if the LaterButtonOnNotification is enabled
//	        if (LaterButtonOnNotification.isDisplayed()|| LaterButtonOnNotification.isEnabled()) {
//	            LaterButtonOnNotification.click();
//	            
//	            // After clicking, check if SignOutImgIcon is now enabled
//	            if (SignOutImgIcon.isEnabled()) {
//	                SignOutImgIcon.click();
//	            } else {
//	                
//	                System.out.println("SignOutImgIcon is still not enabled after clicking LaterButtonOnNotification.");
//	            }
//	        } else {
//	            System.out.println("Neither SignOutImgIcon nor LaterButtonOnNotification is enabled.");
//	        }
//	    }
//	}
//
////	public void ClickOnSignOutImgIcon()
////	{
////		if (SignOutImgIcon.isEnabled()) {
////			SignOutImgIcon.click();
////		}
////		else {
////			LaterButtonOnNotification.click();
////		}
////		
////	}
//	public void ClickOnLogoutLinkText(WebDriver driver)
//	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement LogoutLinkText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='customLogoutBox']//a[.='Logout']")));
//
//		LogoutLinkText.click();
//	}
//	public void ClickOnResetPasswordLinkText()
//	{
//		ResetPasswordLinkText.click();
//	}
//	public void ClickOnNotificationButton()
//	{
//		NotificationButton.click();
//	}
//	public void ClickOn_DashboardUrl()
//	{
//		
//	}

	//Declaration - Side nav menu (updated to match actual href attributes, no ids present)
		@FindBy(xpath = "//a[@href='/dashboard']") private WebElement DashboardLinkText;
		@FindBy(xpath = "//a[@href='/Report-page/Report-page']") private WebElement ReportsLinkText;
		@FindBy(xpath = "//a[@href='/Inspection/Inspection-list']") private WebElement InspectionsLinkText;
		@FindBy(xpath = "//a[@href='/new-Tickets/new-Tickets']") private WebElement TicketsLinkText;
		@FindBy(xpath = "//a[@href='/Assets/Asset-list']") private WebElement AssetsLinkText;
		@FindBy(xpath = "//a[@href='/Parts/parts-inventory']") private WebElement PartsandInventoryLinkText;
		@FindBy(xpath = "//a[@href='/Maintenance/maintenance-list']") private WebElement MaintenanceLinkText;
		@FindBy(xpath = "//a[@href='/Meters/meters-list']") private WebElement MetersLinkText;
		@FindBy(xpath = "//a[@href='/Setup/Setup']") private WebElement SetupLinkText;
	 
		// Kept from old class - no new HTML provided for these
		@FindBy(xpath = "//span[@class='slider']") private WebElement DarkModeButton;
		@FindBy(xpath = "//img[@alt='collapse.svg']") private WebElement CollapseButton;
		@FindBy(xpath = "//img[@src='../../assets/images/icons/bell.svg']") private WebElement NotificationButton;
		@FindBy(id = "onesignal-slidedown-cancel-button") private WebElement LaterButtonOnNotification;
	 
		// Updated - profile/logout dropdown toggle (new HTML)
		@FindBy(id = "page-header-user-dropdown") private WebElement SignOutImgIcon;
	 
		// Updated - dropdown menu items (new HTML)
		@FindBy(xpath = "//a[@href='/Setup/reset-password']") private WebElement ResetPasswordLinkText;
		@FindBy(xpath = "//a[contains(@class,'dropdown-item') and .//span[normalize-space()='Logout']]") private WebElement LogoutLinkText;
	 
		//Getters Methods
	 
		public WebElement getLaterButtonOnNotification() {
			return LaterButtonOnNotification;
		}
		public WebElement getDashboardLinkText() {
			return DashboardLinkText;
		}
		public WebElement getReportsLinkText() {
			return ReportsLinkText;
		}
		public WebElement getInspectionsLinkText() {
			return InspectionsLinkText;
		}
		public WebElement getTicketsLinkText() {
			return TicketsLinkText;
		}
		public WebElement getAssetsLinkText() {
			return AssetsLinkText;
		}
		public WebElement getPartsandInventoryLinkText() {
			return PartsandInventoryLinkText;
		}
		public WebElement getMaintenanceLinkText() {
			return MaintenanceLinkText;
		}
		public WebElement getMetersLinkText() {
			return MetersLinkText;
		}
		public WebElement getSetupLinkText() {
			return SetupLinkText;
		}
		public WebElement getDarkModeButton() {
			return DarkModeButton;
		}
		public WebElement getCollapseButton() {
			return CollapseButton;
		}
		public WebElement getSignOutImgIcon() {
			return SignOutImgIcon;
		}
		public WebElement getLogoutLinkText() {
			return LogoutLinkText;
		}
		public WebElement getResetPasswordLinkText() {
			return ResetPasswordLinkText;
		}
		public WebElement getNotificationButton() {
			return NotificationButton;
		}
	 
		//Business Logic
		public void ClickOnDashboardLinkText()
		{
			DashboardLinkText.click();
		}
	 
		public void ClickOnReportsLinkText()
		{
			ReportsLinkText.click();
		}
	 
		public void ClickOnInspectionsLinkText()
		{
			InspectionsLinkText.click();
		}
	 
		public void ClickOnTicketsLinkText()
		{
			TicketsLinkText.click();
		}
	 
		public void ClickOnAssetsLinkText()
		{
			AssetsLinkText.click();
		}
	 
		public void ClickOnPartsandInventoryLinkText()
		{
			PartsandInventoryLinkText.click();
		}
	 
		public void ClickOnMaintenanceLinkText()
		{
			MaintenanceLinkText.click();
		}
	 
		public void ClickOnMetersLinkText()
		{
			MetersLinkText.click();
		}
	 
		public void ClickOnSetupLinkText(WebDriver driver)
		{
			WebDriver_Utility wb = new WebDriver_Utility();
			wb.ImplicitlyWait(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement setupElement = wait.until(ExpectedConditions.elementToBeClickable(SetupLinkText));
	 
			if (setupElement != null) {
				setupElement.click();
			} else {
				System.out.println("Setup link not found or not clickable within the specified timeout.");
			}
		}
	 
		public void ClickOnDarkModeButton()
		{
			DarkModeButton.click();
		}
		public void ClickOnCollapseButton()
		{
			CollapseButton.click();
		}
	 
		// Opens the profile dropdown (page-header-user-dropdown), then clicks Logout
		public void ClickOnSignOutImgIcon(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement dropdownToggle = wait.until(ExpectedConditions.elementToBeClickable(SignOutImgIcon));
			dropdownToggle.click();
		}
	 
		public void ClickOnLogoutLinkText(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//a[contains(@class,'dropdown-item') and .//span[normalize-space()='Logout']]")));
			logoutLink.click();
		}
	 
		public void ClickOnResetPasswordLinkText()
		{
			ResetPasswordLinkText.click();
		}
		public void ClickOnNotificationButton()
		{
			NotificationButton.click();
		}
	 
		// Convenience: opens dropdown then clicks Logout in one call
		public void Logout(WebDriver driver)
		{
			ClickOnSignOutImgIcon(driver);
			ClickOnLogoutLinkText(driver);
		}
	


}
