package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	//Initialization
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//button[normalize-space()='Inspections']")private WebElement Inspection;
	@FindBy(xpath = "//button[normalize-space()='Tickets']")private WebElement Tickets;
	@FindBy(xpath = "//button[normalize-space()='Assets']")private WebElement Assets;
	@FindBy(xpath = "//button[normalize-space()='Maintenance']")private WebElement Maintenance;
	@FindBy(xpath = "//button[normalize-space()='Parts']")private WebElement Parts;
	@FindBy(xpath = "//button[normalize-space()='Feedback & Surveys']")private WebElement Feedback_And_Surveys;
	@FindBy(xpath = "//button[normalize-space()='Consolidated']")private WebElement Consolidated;
	@FindBy(xpath = "//img[@alt='Duplicate']")private WebElement Download_Icon;
	@FindBy(xpath = "//img[@alt='Delete']")private WebElement Filter_Icon;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement Filter_By_Clear_Button;
	@FindBy(xpath = "//span[normalize-space()='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//input[@placeholder='Survey / Feedback Name']")private WebElement Filter_By_Survey_Feedback_Name;
	@FindBy(xpath = "//span[.='Select Survey type']")private WebElement Filter_By_Survey_Type;
	@FindBy(xpath = "//a[normalize-space()='Feedback']")private WebElement Filter_By_Survey_Type_Feedback;
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement Filter_By_Asset;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Asset_SearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select department']")private WebElement Filter_By_Department;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Department_SearchBox;
	@FindBy(xpath = "//span[.='Select Part']")private WebElement Filter_By_Select_Part;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Select_Part_SearchBox;
	@FindBy(xpath = "//span[.='Select origin']")private WebElement Filter_By_Select_Origin;
	@FindBy(xpath = "//a[.='Ad-Hoc Issue']")private WebElement Filter_By_Origin_Ad_Hoc_Issue;

	//Getters Methods
	public WebElement getInspection() {
		return Inspection;
	}
	public WebElement getTickets() {
		return Tickets;
	}
	public WebElement getAssets() {
		return Assets;
	}
	public WebElement getMaintenance() {
		return Maintenance;
	}
	public WebElement getParts() {
		return Parts;
	}
	public WebElement getFeedback_And_Surveys() {
		return Feedback_And_Surveys;
	}
	public WebElement getConsolidated() {
		return Consolidated;
	}
	public WebElement getDownload_Icon() {
		return Download_Icon;
	}
	public WebElement getFilter_Icon() {
		return Filter_Icon;
	}
	public WebElement getFilter_Apply_Button() {
		return Filter_Apply_Button;
	}
	public WebElement getFilter_By_Clear_Button() {
		return Filter_By_Clear_Button;
	}
	public WebElement getFilter_By_Property() {
		return Filter_By_Property;
	}
	public WebElement getFilter_By_Property_SearchBox() {
		return Filter_By_Property_SearchBox;
	}
	public WebElement getFilter_By_Survey_Feedback_Name() {
		return Filter_By_Survey_Feedback_Name;
	}
	public WebElement getFilter_By_Survey_Type() {
		return Filter_By_Survey_Type;
	}
	public WebElement getFilter_By_Survey_Type_Feedback() {
		return Filter_By_Survey_Type_Feedback;
	}
	public WebElement getFilter_By_Asset() {
		return Filter_By_Asset;
	}
	public WebElement getFilter_By_Asset_SearchBox() {
		return Filter_By_Asset_SearchBox;
	}
	public WebElement getFilter_By_Department() {
		return Filter_By_Department;
	}
	public WebElement getFilter_By_Department_SearchBox() {
		return Filter_By_Department_SearchBox;
	}
	public WebElement getFilter_By_Select_Part() {
		return Filter_By_Select_Part;
	}
	public WebElement getFilter_By_Select_Part_SearchBox() {
		return Filter_By_Select_Part_SearchBox;
	}
	public WebElement getFilter_By_Select_Origin() {
		return Filter_By_Select_Origin;
	}
	public WebElement getFilter_By_Origin_Ad_Hoc_Issue() {
		return Filter_By_Origin_Ad_Hoc_Issue;
	}

	//Business Logic
	public void ClickOn_Inspection()
	{
		Inspection.click();
	}
	public void ClickOn_Tickets()
	{
		Tickets.click();
	}

	public void ClickON_Assets()
	{
		Assets.click();
	}
	public void CLickOn_Maintenance()
	{
		Maintenance.click();
	}
	public void ClickOn_Parts()
	{
		Parts.click();
	}
	public void ClickOn_Feedback_And_Surveys()
	{
		Feedback_And_Surveys.click();
	}
	public void ClickOn_Consolidated()
	{
		Consolidated.click();
	}
	public void ClickOn_Download_Icon()
	{
		Download_Icon.click();
		
	}
	public void ClickOn_Filter_Icon()
	{
		Filter_Icon.click();
	}
	public void ClickOn_Filter_Apply_Button()
	{
		Filter_Apply_Button.click();
	}
	public void ClickOn_Filter_By_Clear_Button()
	{
		Filter_By_Clear_Button.click();
	}
	public void ClickON_Filter_By_Property()
	{
		Filter_By_Property.click();
	}
	public void CLickOn_Filter_By_Property_SearchBox(String Search_property)
	{
		Filter_By_Property_SearchBox.sendKeys(Search_property);
	}
	public void CLickON_Filter_By_Survey_Feedback_Name(String ENter_Feedback_Survey)
	{
		Filter_By_Survey_Feedback_Name.sendKeys(ENter_Feedback_Survey);
	}
	public void CLickOn_Filter_By_Survey_Type()
	{
		Filter_By_Survey_Type.click();
	}
	public void ClickOn_Filter_By_Survey_Type_Feedback()
	{
		Filter_By_Survey_Type_Feedback.click();
	}
	public void CliCKon_Filter_By_Asset()
	{
		Filter_By_Asset.click();
	}
	public void CLickOn_Filter_By_Asset_SearchBox(String Search_Asset)
	{
		Filter_By_Asset_SearchBox.sendKeys(Search_Asset);
	}
	public void ClickOn_Filter_By_Department()
	{
		Filter_By_Department.click();
	}
	public void ClickOn_Filter_By_Department_SearchBox(String Search_Department)
	{
		Filter_By_Department_SearchBox.sendKeys(Search_Department);
	}
	public void ClickOn_Filter_By_Select_Part()
	{
		Filter_By_Select_Part.click();
	}
	public void ClickOn_Filter_By_Select_Part_SearchBox(String Select_Part)
	{
		Filter_By_Select_Part_SearchBox.sendKeys(Select_Part);
	}
	public void ClickOn_Filter_By_Select_Origin()
	{
		Filter_By_Select_Origin.click();
	}
	public void ClickON_Filter_By_Origin_Ad_Hoc_Issue()
	{
		Filter_By_Origin_Ad_Hoc_Issue.click();
		
	}



}
