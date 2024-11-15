package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Parts_Movement_Reports {
	//Initialization
		public Parts_Movement_Reports(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Declaration
		@FindBy(xpath = "//img[@alt='Duplicate']")private WebElement Filter_By_Download_Button;
		@FindBy(xpath = "(//button[@id='custom'])[1]")private WebElement Filter_Icon;
		@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
		@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Filter_By_Cancel_Button;
		@FindBy(xpath = "//span[normalize-space()='Select From Property']")private WebElement Filter_By_From_Property;
		@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_From_Property_searchBox;
		@FindBy(xpath = "(//a[contains(text(),'Xtreme Aqua')])[1]")private WebElement Filter_By_Dynamic_Name_From_Property;
		@FindBy(xpath = "//span[normalize-space()='Select To Property']")private WebElement Filter_By_To_Property;
		@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_To_Property_searchBox;
		@FindBy(xpath = "(//a[contains(text(),'Xtreme zone')])[2]")private WebElement Filter_By_Dynamic_Name_To_Property;
		@FindBy(xpath = "//span[.='Select Part']")private WebElement Filter_By_Select_Part;
	@FindBy(xpath = "(//input[@id='custom'])[5]")private WebElement Filter_By_Select_Part_SearchBox;
	@FindBy(xpath = "//select[@id='custom']")private WebElement Filter_By_Select_Type_Dropdown;
	@FindBy(xpath = "//input[@placeholder='Part Number']")private WebElement Filter_By_Part_Number;
	
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
	public WebElement getFilter_By_From_Property() {
		return Filter_By_From_Property;
	}
	public WebElement getFilter_By_From_Property_searchBox() {
		return Filter_By_From_Property_searchBox;
	}
	public WebElement getFilter_By_Dynamic_Name_From_Property() {
		return Filter_By_Dynamic_Name_From_Property;
	}
	public WebElement getFilter_By_To_Property() {
		return Filter_By_To_Property;
	}
	public WebElement getFilter_By_To_Property_searchBox() {
		return Filter_By_To_Property_searchBox;
	}
	public WebElement getFilter_By_Dynamic_Name_To_Property() {
		return Filter_By_Dynamic_Name_To_Property;
	}
	public WebElement getFilter_By_Select_Part() {
		return Filter_By_Select_Part;
	}
	public WebElement getFilter_By_Select_Part_SearchBox() {
		return Filter_By_Select_Part_SearchBox;
	}
	public WebElement getFilter_By_Select_Type_Dropdown() {
		return Filter_By_Select_Type_Dropdown;
	}
	public WebElement getFilter_By_Part_Number() {
		return Filter_By_Part_Number;
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
	public void ClickOn_Filter_By_From_Property()
	{
		Filter_By_From_Property.click();
	}
	public void CLickOn_Filter_By_From_Property_searchBox(String Sreach_From_Property)
	{
		Filter_By_From_Property_searchBox.sendKeys(Sreach_From_Property);
	}
	public void ClickOn_Filter_By_Dynamic_Name_From_Property()
	{
		Filter_By_Dynamic_Name_From_Property.click();
	}
	public void CLickOn_Filter_By_To_Property()
	{
		Filter_By_To_Property.click();
	}
	public void ClickOn_Filter_By_To_Property_searchBox(String Search_To_Property)
	{
		Filter_By_To_Property_searchBox.sendKeys(Search_To_Property);
	}
	public void ClickOn_Filter_By_Dynamic_Name_To_Property()
	{
		Filter_By_Dynamic_Name_To_Property.click();
	}
	public void ClickOn_Filter_By_Select_Part()
	{
		Filter_By_Select_Part.click();
	}
	public void ClickOn_Filter_By_Select_Part_SearchBox(String Search_Part)
	{
		Filter_By_Select_Part_SearchBox.sendKeys(Search_Part);
	}
	public void ClickOn_Filter_By_Select_Type_Dropdown(String Text)
	{
		Select sel=new Select(Filter_By_Select_Type_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Filter_By_Part_Number(String Part_Number)
	{
		Filter_By_Part_Number.sendKeys(Part_Number);
	}

}
