package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Disposed_Asset_Reports {
	//Initialization
			public Disposed_Asset_Reports(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			//Declarationc
			@FindBy(xpath = "//img[@alt='Duplicate']")private WebElement Filter_By_Download_Button;
			@FindBy(xpath = "(//button[@id='custom'])[1]")private WebElement Filter_Icon;
			@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
			@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Filter_By_Cancel_Button;
			@FindBy(xpath = "//span[normalize-space()='Select Property']")private WebElement Filter_By_Property;
			@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
			@FindBy(xpath = "//a[normalize-space()='Xtreme Aqua']")private WebElement Filter_By_Dynamic_Property;
			@FindBy(xpath = "//input[@placeholder='Asset Name']")private WebElement Filter_By_Asset_Name;
			
			//Getters methods
			public WebElement getFilter_By_Download_Button() {
				return Filter_By_Download_Button;
			}
			public WebElement getFilter_Icon() {
				return Filter_Icon;
			}
			public WebElement getFilter_By_Apply_Button() {
				return Filter_By_Apply_Button;
			}
			public WebElement getFilter_By_Cancel_Button() {
				return Filter_By_Cancel_Button;
			}
			public WebElement getFilter_By_Property() {
				return Filter_By_Property;
			}
			public WebElement getFilter_By_Property_SearchBox() {
				return Filter_By_Property_SearchBox;
			}
			public WebElement getFilter_By_Dynamic_Property() {
				return Filter_By_Dynamic_Property;
			}
			public WebElement getFilter_By_Asset_Name() {
				return Filter_By_Asset_Name;
			}
			
			//Business Logic
			public void ClickoN_Filter_By_Download_Button()
			{
				Filter_By_Download_Button.click();
			}
			public void ClickOn_Filter_Icon()
			{
				Filter_Icon.click();
			}
			public void ClickOn_Filter_By_Apply_Button()
			{
				Filter_By_Apply_Button.click();

			}
			public void ClickOn_Filter_By_Cancel_Button()
			{
				Filter_By_Cancel_Button.click();
			}
			public void ClickOn_Filter_By_Property()
			{
				Filter_By_Property.click();
			}
			public void ClickOn_Filter_By_Property_SearchBox(String Search_Property)
			{
				Filter_By_Property_SearchBox.sendKeys(Search_Property);
			}
			public void ClickOn_Filter_By_Dynamic_Property()
			{
				Filter_By_Dynamic_Property.click();
			}
			public void ClickON_Filter_By_Asset_Name(String Asset_Name)
			{
				Filter_By_Asset_Name.sendKeys(Asset_Name);
			}
}
