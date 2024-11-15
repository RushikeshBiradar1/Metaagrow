package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tickets_Reports {
	//Initialization
	public Tickets_Reports(WebDriver driver)
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
	@FindBy(xpath = "//span[normalize-space()='Ticke Raised By']")private WebElement Filter_By_Raised_By;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Raised_By_SearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select Priority']")private WebElement Filter_By_Priority;
	@FindBy(xpath = "(//input[@name='autocomplete'])[3]")private WebElement Filter_By_Priority_SearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select Status']")private WebElement Filter_By_Status;
	@FindBy(xpath = "//a[normalize-space()='Close']")private WebElement Filter_By_Close_Status;
	@FindBy(xpath = "//a[normalize-space()='Open']")private WebElement Filter_By_Open_Status;
	@FindBy(xpath = "//a[normalize-space()='Parked']")private WebElement Filter_By_Parked_Status;
	@FindBy(xpath = "//a[normalize-space()='NotValid']")private WebElement Filter_By_NotValid_Status;
	@FindBy(xpath = "//span[normalize-space()='Select Department']")private WebElement Filter_By_Department;
	@FindBy(xpath = "(//input[@name='autocomplete'])[4]")private WebElement Filter_By_Department_SearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select origin']")private WebElement Filter_By_Origin;
	@FindBy(xpath = "//a[normalize-space()='QR Issue']")private WebElement Filter_By_QR_Issue_Origin;
	@FindBy(xpath = "//a[normalize-space()='Ad-Hoc Issue']")private WebElement Filter_By_Ad_Hoc_Issue_Origin;
	@FindBy(xpath = "//a[normalize-space()='Meter Issue']")private WebElement Filter_By_Meter_Issue_Origin;
	@FindBy(xpath = "//a[normalize-space()='Asset Issue']")private WebElement Filter_By_Asset_Issue_Origin;
	@FindBy(xpath = "//a[normalize-space()='PmChecklist']")private WebElement Filter_By_PmChecklist_Origin;
	@FindBy(xpath = "//a[normalize-space()='Checklist Issue']")private WebElement Filter_By_Checklist_Issue_Origin;
	@FindBy(xpath = "//input[@placeholder='Ticket No']")private WebElement Filter_By_Ticket_No;
	@FindBy(xpath = "//input[@placeholder='Subject']")private WebElement Filter_By_Subject;
	
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
	public WebElement getFilter_By_Raised_By() {
		return Filter_By_Raised_By;
	}
	public WebElement getFilter_By_Raised_By_SearchBox() {
		return Filter_By_Raised_By_SearchBox;
	}
	public WebElement getFilter_By_Priority() {
		return Filter_By_Priority;
	}
	public WebElement getFilter_By_Priority_SearchBox() {
		return Filter_By_Priority_SearchBox;
	}
	public WebElement getFilter_By_Status() {
		return Filter_By_Status;
	}
	public WebElement getFilter_By_Close_Status() {
		return Filter_By_Close_Status;
	}
	public WebElement getFilter_By_Open_Status() {
		return Filter_By_Open_Status;
	}
	public WebElement getFilter_By_Parked_Status() {
		return Filter_By_Parked_Status;
	}
	public WebElement getFilter_By_NotValid_Status() {
		return Filter_By_NotValid_Status;
	}
	public WebElement getFilter_By_Department() {
		return Filter_By_Department;
	}
	public WebElement getFilter_By_Department_SearchBox() {
		return Filter_By_Department_SearchBox;
	}
	public WebElement getFilter_By_Origin() {
		return Filter_By_Origin;
	}
	public WebElement getFilter_By_QR_Issue_Origin() {
		return Filter_By_QR_Issue_Origin;
	}
	public WebElement getFilter_By_Ad_Hoc_Issue_Origin() {
		return Filter_By_Ad_Hoc_Issue_Origin;
	}
	public WebElement getFilter_By_Meter_Issue_Origin() {
		return Filter_By_Meter_Issue_Origin;
	}
	public WebElement getFilter_By_Asset_Issue_Origin() {
		return Filter_By_Asset_Issue_Origin;
	}
	public WebElement getFilter_By_PmChecklist_Origin() {
		return Filter_By_PmChecklist_Origin;
	}
	public WebElement getFilter_By_Checklist_Issue_Origin() {
		return Filter_By_Checklist_Issue_Origin;
	}
	public WebElement getFilter_By_Ticket_No() {
		return Filter_By_Ticket_No;
	}
	public WebElement getFilter_By_Subject() {
		return Filter_By_Subject;
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
	public void ClickOn_Filter_By_Raised_By()
	{
		Filter_By_Raised_By.click();
	}
	public void ClickOn_Filter_By_Raised_By_SearchBox(String Search_Raise_By)
	{
		Filter_By_Raised_By_SearchBox.sendKeys(Search_Raise_By);
	}
	public void ClickOn_Filter_By_Priority()
	{
		Filter_By_Priority.click();
	}
	public void Clickon_Filter_By_Priority_SearchBox(String Search_Priority)
	{
		Filter_By_Priority_SearchBox.sendKeys(Search_Priority);
	}
	public void ClickOn_Filter_By_Status()
	{
		Filter_By_Status.click();
	}
	public void ClickoN_Filter_By_Close_Status()
	{
		Filter_By_Close_Status.click();
		
	}
	public void ClickOn_Filter_By_Open_Status()
	{
		Filter_By_Open_Status.click();
	}
	public void ClickOn_Filter_By_Parked_Status()
	{
		Filter_By_Parked_Status.click();
	}
	public void ClickOn_Filter_By_NotValid_Status()
	{
		Filter_By_NotValid_Status.click();
	}
	public void ClickOn_Filter_By_Department()
	{
		Filter_By_Department.click();
		
	}
	public void ClickOn_Filter_By_Department_SearchBox(String Search_Department)
	{
		Filter_By_Department_SearchBox.sendKeys(Search_Department);
	}
	public void ClickOn_Filter_By_Origin()
	{
		Filter_By_Origin.click();
	}
	public void ClickOn_Filter_By_QR_Issue_Origin()
	{
		Filter_By_QR_Issue_Origin.click();
	}
	public void CLickOn_Filter_By_Ad_Hoc_Issue_Origin()
	{
		Filter_By_Ad_Hoc_Issue_Origin.click();
	}
	public void ClickON_Filter_By_Meter_Issue_Origin()
	{
		Filter_By_Meter_Issue_Origin.click();
	}
	public void ClickOn_Filter_By_Asset_Issue_Origin()
	{
		Filter_By_Asset_Issue_Origin.click();
	}
	public void ClickON_Filter_By_PmChecklist_Origin()
	{
		Filter_By_PmChecklist_Origin.click();
	}
	public void ClickON_Filter_By_Checklist_Issue_Origin()
	{
		Filter_By_Checklist_Issue_Origin.click();
	}
	public void CLicKOn_Filter_By_Ticket_No(String Enter_Ticket_No)
	{
		Filter_By_Ticket_No.sendKeys(Enter_Ticket_No);
	}
	public void ClickOn_Filter_By_Subject(String Subject)
	{
		Filter_By_Subject.sendKeys(Subject);
	}



	

}
