package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockReport {
	//Initialization
	public StockReport(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//img[@alt='Duplicate']")private WebElement Filter_By_Download_Button;
	@FindBy(xpath = "(//button[@id='custom'])[1]")private WebElement Filter_Icon;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Filter_By_Cancel_Button;
	@FindBy(xpath = "//span[normalize-space()='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//a[normalize-space()='Xtreme Aqua']")private WebElement Filter_By_Dynamic_Property;
	@FindBy(xpath = "//span[normalize-space()='Select Location']")private WebElement Filter_By_Location;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Location_SearchBox;
	@FindBy(xpath = "//a[normalize-space()='Trampoline Zone']")private WebElement Filter_By_Dynamic_Location;
	@FindBy(xpath = "//span[normalize-space()='Select Asset']")private WebElement Filter_By_Asset;
	@FindBy(xpath = "(//input[@name='autocomplete'])[3]")private WebElement Filter_By_Asset_SearchBox;
	@FindBy(xpath = "//a[normalize-space()='Diswasher']")private WebElement Filter_By_Dynamic_Asset;
	@FindBy(xpath = "//span[normalize-space()='Select Part']" )private WebElement Filter_By_Select_Part;
	@FindBy(xpath = "(//input[@name='autocomplete'])[4]")private WebElement Filter_By_Select_Part_SearchBox;
	@FindBy(xpath = "//input[@placeholder='Part Number']" )private WebElement Filter_By_Part_Number_TextBox;


	//Getters Methods
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
	public WebElement getFilter_By_Location() {
		return Filter_By_Location;
	}
	public WebElement getFilter_By_Location_SearchBox() {
		return Filter_By_Location_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_Location() {
		return Filter_By_Dynamic_Location;
	}
	public WebElement getFilter_By_Asset() {
		return Filter_By_Asset;
	}
	public WebElement getFilter_By_Asset_SearchBox() {
		return Filter_By_Asset_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_Asset() {
		return Filter_By_Dynamic_Asset;
	}
	public WebElement getFilter_By_Select_Part() {
		return Filter_By_Select_Part;
	}
	public WebElement getFilter_By_Select_Part_SearchBox() {
		return Filter_By_Select_Part_SearchBox;
	}
	public WebElement getFilter_By_Part_Number_TextBox() {
		return Filter_By_Part_Number_TextBox;
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
	public void ClickOn_Filter_By_Location()
	{
		Filter_By_Location.click();
	}
	public void ClickOn_Filter_By_Location_SearchBox(String Search_Location)
	{
		Filter_By_Location_SearchBox.sendKeys(Search_Location);
	}
	public void CLickOn_Filter_By_Dynamic_Location()
	{
		Filter_By_Dynamic_Location.click();
	}
	public void CLickOn_Filter_By_Asset()
	{
		Filter_By_Asset.click();
	}

	public void ClickOn_Filter_By_Asset_SearchBox(String Search_Asset)
	{
		Filter_By_Asset_SearchBox.sendKeys(Search_Asset);
	}
	public void ClickOn_Filter_By_Dynamic_Asset()
	{
		Filter_By_Dynamic_Asset.click();
	}
	public void ClickOn_Filter_By_Select_Part()
	{
		Filter_By_Select_Part.click();
	}
	public void ClickOn_Filter_By_Select_Part_SearchBox(String Search_part)
	{
		Filter_By_Select_Part_SearchBox.sendKeys(Search_part);
	}
	public void ClickOn_Filter_By_Part_Number_TextBox()
	{
		Filter_By_Part_Number_TextBox.click();
	}
}
