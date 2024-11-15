package com.MetaaGrow.ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.MetaaGrow.Generic_Utility.WebDriver_Utility;

public class Departments {
	//Initialization
	public Departments(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//img[@src='../../assets/images/icons/setup_logo.svg']")private WebElement SetupLinkText;
	@FindBy(xpath = "//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/setup/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='setup-main']/div[@class='container']/div[@class='row']/div[1]/a[1]/div[1]") private WebElement Departments;
	@FindBy(xpath = "//span[normalize-space()='Add Department']") private WebElement AddDepartmentsLinkText;
	@FindBy(xpath = "//input[@formcontrolname='name']")private WebElement DepartmentNameTextField;
	@FindBy(xpath = "//button[@class='form-control selectFreq']")private WebElement StatusDropdown;
	@FindBy(xpath = "//a[text()='Active']") private WebElement ActiveDepartment;
	@FindBy(xpath = "//a[text()='Inactive']")private WebElement InactiveDepartment;
	@FindBy(xpath = "//button[@class='button btn-primary next-step']") private WebElement AddDepartmentsButton_On_Create_Department_Page;
	@FindBy(xpath = "//button[@class='button btn-secondary prev-step']") private WebElement CancelButton;
	@FindBy(xpath = "//span[text()='Close']")private WebElement CloseButton;
	@FindBy(xpath = "//button[normalize-space()='Inactive']")private WebElement InactiveButton;
	@FindBy(xpath = "//span[text()='Filter']")private WebElement FilterIcon;
	@FindBy(xpath = "//span[.='Select Department']")private WebElement Filter_By_Department;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement Ok_Button_On_Add_Department_Confirmation_Page;
	@FindBy(xpath = "//button[normalize-space()='Yes Inactive']")private WebElement YesInactive_Button;
	@FindBy(xpath = "//button[normalize-space()='Yes Active']")private WebElement Yes_Active_Button;

    
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement Filter_By_Department_SearchBox;
	@FindBy(xpath = "(//a[normalize-space()='Housekeeping'])[1]")private WebElement Filter_By_Dynamic_Department;
	@FindBy(xpath = "//span[text()='Apply']")private WebElement ApplyButtonOnFilter;
	@FindBy(xpath = "//span[text()='Clear']")private WebElement ClearButtonOnFilter;
	@FindBy(xpath = "//span[text()='Back']") private WebElement BackButtonOnDepartmentsPage;
	@FindBy(xpath = "//img[@src='../../assets/images/icons/right.svg']")private WebElement slideRightIcon;
	@FindBy(xpath = "//img[@src='../../assets/images/icons/left.svg']")private WebElement slideLeftIcon;
	@FindBy(xpath = "//span[normalize-space()='Update Department']")private WebElement Update_Department_Button;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement Ok_Button_Update_Confirmation_Page;
	@FindBy(xpath = "(//label[@for='926check'])[1]")private WebElement dynamicRadioButtonsOn_ActivePage;
	@FindBy(xpath = "(//label[@for='926check'])[2]")private WebElement dynamicRadioButtonsOn_DeactivePage;


	@FindBy(xpath = "//span[normalize-space()='Deactivate']")private WebElement Deactivate_Button;
	@FindBy(xpath = "//span[normalize-space()='Activate']")private WebElement Activate_Button;

	//Getters Method
	public WebElement getYes_Active_Button() {
		return Yes_Active_Button;
	}
	public WebElement getYesInactive_Button() {
		return YesInactive_Button;
	}

	 
	
	
	public WebElement getActivate_Button() {
		return Activate_Button;
	}
	public WebElement getDeactivate_Button() {
		return Deactivate_Button;
	}
	public WebElement getDynamicRadioButtonsOn_DeactivePage() {
		return dynamicRadioButtonsOn_DeactivePage;
	}
	public WebElement getdynamicRadioButtonsOn_ActivePage() {
		return dynamicRadioButtonsOn_ActivePage;
	}
	public WebElement getUpdate_Department_Button() {
		return Update_Department_Button;
	}
	public WebElement getOk_Button_Update_Confirmation_Page() {
		return Ok_Button_Update_Confirmation_Page;
	}
	public WebElement getSetupLinkText() {
		return SetupLinkText;
	}
	public WebElement getDepartments() {
		return Departments;
	}
	public WebElement getAddDepartmentsLinkText() {
		return AddDepartmentsLinkText;
	}
	public String getDepartmentNameTextField() {
		return DepartmentNameTextField.getAttribute("value");

	}
	public WebElement getStatusDropdown() {
		return StatusDropdown;
	}
	public WebElement getActiveDepartment() {
		return ActiveDepartment;
	}
	public WebElement getInactiveDepartment() {
		return InactiveDepartment;
	}
	public WebElement getAddDepartmentsButton_On_Create_Department_Page() {
		return AddDepartmentsButton_On_Create_Department_Page;
	}
	public WebElement getCancelButton() {
		return CancelButton;
	}
	public WebElement getCloseButton() {
		return CloseButton;
	}
	public WebElement getInactiveButton() {
		return InactiveButton;
	}
	public WebElement getFilterIcon() {
		return FilterIcon;
	}

	public WebElement getApplyButtonOnFilter() {
		return ApplyButtonOnFilter;
	}
	public WebElement getClearButtonOnFilter() {
		return ClearButtonOnFilter;
	}
	public WebElement getBackButtonOnDepartmentsPage() {
		return BackButtonOnDepartmentsPage;
	}
	public WebElement getSlideRightIcon() {
		return slideRightIcon;
	}
	public WebElement getSlideLeftIcon() {
		return slideLeftIcon;
	}
	public WebElement getFilter_By_Department() {
		return Filter_By_Department;
	}
	public WebElement getFilter_By_Department_SearchBox() {
		return Filter_By_Department_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_Department() {
		return Filter_By_Dynamic_Department;
	}
	public WebElement getOk_Button_On_Add_Department_Confirmation_Page() {
		return Ok_Button_On_Add_Department_Confirmation_Page;
	}
	// Business Logic
	public void ClickOnSetupLinkText()
	{
		SetupLinkText.click();
	}

	public void ClickOnDepartments()
	{
		Departments.click();
	}
	public void ClickOnAddDepartmentsLinkText()
	{
		AddDepartmentsLinkText.click();
	}
	public void ClickOnDepartmentNameTextField(String Enter_Depart_Name)
	{
		DepartmentNameTextField.sendKeys(Enter_Depart_Name);
	}
	public void ClickOnStatusDropdown()
	{
		StatusDropdown.click();
	}
	public void ClickOnActiveDepartmentPage()
	{
		ActiveDepartment.click();
	}
	public void ClickOnInactiveDepartment()
	{
		InactiveDepartment.click();
	}
	public void ClickAddDepartmentsButton_On_Create_Department_Page()
	{
		AddDepartmentsButton_On_Create_Department_Page.click();
	}
	public void ClickOnCancelButton()
	{
		CancelButton.click();
	}
	public void ClickOnCloseButton()
	{
		CloseButton.click();
	}
	public void ClickOnInactivePage()
	{
		InactiveButton.click();
	}
	public void ClickOnFilterIcon()
	{
		FilterIcon.click();
	}

	public void ClickOnApplyButtonOnFilter()
	{
		ApplyButtonOnFilter.click();
	}
	public void ClickOnClearButtonOnFilter()
	{
		ClearButtonOnFilter.click();
	}
	public void ClickOnBackButtonOnDepartmentsPage()
	{
		BackButtonOnDepartmentsPage.click();
	}
	public void ClickOnslideRightIcon()
	{
		slideRightIcon.click();
	}
	public void ClickOnslideLeftIcon()
	{
		slideLeftIcon.click();
	}
	public void ClickOn_Filter_By_Department()
	{
		Filter_By_Department.click();
	}
	public void ClickOn_Filter_By_Department_SearchBox(String Search_Department)
	{
		Filter_By_Department_SearchBox.sendKeys(Search_Department);
	}
	public void ClickOn_Filter_By_Dynamic_Department()
	{
		Filter_By_Dynamic_Department.click();
	}

	public void CLickOn_Ok_Button_On_Add_Department_Confirmation_Page()
	{
		Ok_Button_On_Add_Department_Confirmation_Page.click();
	}
	public void ClickOn_Update_Department_Button()
	{
		Update_Department_Button.click();
	}
	public void ClickOn_Ok_Button_Update_Confirmation_Page()
	{
		Ok_Button_Update_Confirmation_Page.click();
	}
	public void ClearDepartmentName()
	{
		DepartmentNameTextField.click();
		DepartmentNameTextField.clear();
	}
	public void ClickOnDepartmentNameTextField()
	{
		DepartmentNameTextField.click();
	}

	public void ClickOn_dynamicRadioButtonsOn_ActivePage()
	{
		dynamicRadioButtonsOn_ActivePage.click();
	}
	public void ClickOn_Deactivate_Button()
	{
		Deactivate_Button.click();
	}
	public void ClickOn_YesInactive_Button()
	{
		YesInactive_Button.click();
	}
	public void ClickOn_Yes_Active_Button()
	{
		Yes_Active_Button.click();
	}

	public void ClickOn_Department_Activate_Button()
	{
		Activate_Button.click();
	}
	public void Clickon_dynamicRadioButtonsOn_DeactivePage()
	{
		dynamicRadioButtonsOn_DeactivePage.click();
	}
	

}
