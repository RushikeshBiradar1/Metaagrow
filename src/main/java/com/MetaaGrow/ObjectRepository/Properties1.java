package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Properties1 {
	//initialization
	public Properties1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//span[.='Add Propertys1']")private WebElement Add_Button;
	public WebElement getAdd_Button() {
		return Add_Button;
	}
	public void ClickOn_Add_Button()
	{
		Add_Button.click();
	}

	@FindBy(xpath = "//button[normalize-space()='Active']")private WebElement ActiveButton;
	@FindBy(xpath = "//button[normalize-space()='Inactive']")private WebElement InActiveButton;
	@FindBy(xpath = "//span[normalize-space()='Deactivate']")private WebElement DeactivateButton;
  @FindBy(xpath = "//span[.='Add Property']") private WebElement Add_Property_Button;
	@FindBy(xpath = "//a[normalize-space()='Single']")private WebElement AddSinglePropertyButton;
	@FindBy(xpath = "//a[.='Bulk']")private WebElement AddBulkPropertyButton;
	@FindBy(xpath = "//span[normalize-space()='Back']") private WebElement BackButton;
	@FindBy(xpath = "//span[normalize-space()='Filter']")private WebElement FilterIcon;
	@FindBy(xpath = "//span[text()='Select Property']")private WebElement selectPropertyDropdown;
	@FindBy(xpath = "//div[@id='custom']//input[@id='custom']")private WebElement SearchPropertyTextBox;
	@FindBy(xpath = "//input[@placeholder='Search Code']")private WebElement searchPropertyCodeTextBox;
	@FindBy(xpath = "//span[text()='Apply']")private WebElement ApplyButton;
	@FindBy(xpath = "//span[text()='Clear']")private WebElement ClearButton;
	@FindBy(xpath = "//input[@placeholder='Enter Property']")private WebElement PropertyNameTextField;
	@FindBy(xpath = "//input[@placeholder='Property Code']")private WebElement ProprtyCodeTextField;
	@FindBy(xpath = "//input[@placeholder='Enter Country']")private WebElement countryNameTextField;
	@FindBy(xpath = "//input[@placeholder='Zone']")private WebElement ZoneTextField;
	@FindBy(xpath = "//input[@placeholder='Enter city']")private WebElement CityNameTextField;
	@FindBy(xpath = "//select[@formcontrolname='defaultDepartment']")private WebElement DepartmentAssignedDropdown;
	@FindBy(xpath = "//select[@class='form-control normalSelect ng-pristine ng-valid ng-touched']")private WebElement Users_Assigned_Dropdown;
	@FindBy(xpath = "//input[@placeholder='Enter Location']")private WebElement Location_Name_TextField;
	@FindBy(xpath = "//span[normalize-space()='Add Another Location']")private WebElement AddAnotherLocationIcon;
	@FindBy(xpath = "//input[@placeholder='Search Nearest Location']")private WebElement AddressTextField;
	@FindBy(xpath = "//input[@placeholder='Enter Radius']")private WebElement RadiousTextField;
	@FindBy(xpath = "//span[normalize-space()='Next']")private WebElement NextButton;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement CancelButton;
	@FindBy(xpath = "//button[@class='button btn-primary']")private WebElement SubmitButton;
	@FindBy(xpath = "//span[normalize-space()='Back']")private WebElement BackButton_OnConfirmPage;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement OKButton_OnconfirmPopup;
	@FindBy(xpath = "//span[normalize-space()='Close']")private WebElement CloseButton_ONConfirmPage;
	@FindBy(xpath = "//button[normalize-space()='Info']")private WebElement InfoTab;
	@FindBy(xpath = "//button[normalize-space()='Locations']")private WebElement LocationsTab;
	@FindBy(xpath = "//button[normalize-space()='Assigned Users']")private WebElement Assigned_UsersTab;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[1]")private WebElement show_Rows_Dropdown;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[1]")private WebElement ShowRowsDropdown;
	@FindBy(xpath = "//section[@class='pagination']//li[6]//a[1]")private WebElement SlideRightIcon;
	@FindBy(xpath = "//section[@class='pagination']//li[1]//a[1]")private WebElement SlideLeftIcon;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[2]")private WebElement JumpToPageDropDown;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement Filter_By_Property_SearchBox;
@FindBy(xpath = "//input[@placeholder='Search Code']")	private WebElement Filter_By_Search_Code;

	

	//Getters Methods
	public WebElement getActiveButton() {
		return ActiveButton;
	}
	public WebElement getInActiveButton() {
		return InActiveButton;
	}
	public WebElement getDeactivateButton() {
		return DeactivateButton;
	}
	public WebElement getAdd_Property_Button() {
	   return Add_Property_Button;
    }
	public WebElement getAddSinglePropertyButton() {
		return AddSinglePropertyButton;
	}
	public WebElement getAddBulkPropertyButton() {
		return AddBulkPropertyButton;
	}
	public WebElement getBackButton() {
		return BackButton;
	}
	public WebElement getFilterIcon() {
		return FilterIcon;
	}
	public WebElement getSelectPropertyDropdown() {
		return selectPropertyDropdown;
	}
	public WebElement getSearchPropertyTextBox() {
		return SearchPropertyTextBox;
	}
	public WebElement getSearchPropertyCodeTextBox() {
		return searchPropertyCodeTextBox;
	}
	public WebElement getApplyButton() {
		return ApplyButton;
	}
	public WebElement getClearButton() {
		return ClearButton;
	}
	public WebElement getPropertyNameTextField() {
		return PropertyNameTextField;
	}
	public WebElement getProprtyCodeTextField() {
		return ProprtyCodeTextField;
	}
	public WebElement getCountryNameTextField() {
		return countryNameTextField;
	}
	public WebElement getZoneTextField() {
		return ZoneTextField;
	}
	public WebElement getCityNameTextField() {
		return CityNameTextField;
	}
	public WebElement getDepartmentAssignedDropdown() {
		return DepartmentAssignedDropdown;
	}
	public WebElement getUsers_Assigned_Dropdown() {
		return Users_Assigned_Dropdown;
	}
	public WebElement getLocation_Name_TextField() {
		return Location_Name_TextField;
	}
	public WebElement getAddAnotherLocationIcon() {
		return AddAnotherLocationIcon;
	}
	public WebElement getAddressTextField() {
		return AddressTextField;
	}
	public WebElement getRadiousTextField() {
		return RadiousTextField;
	}
	public WebElement getNextButton() {
		return NextButton;
	}
	public WebElement getCancelButton() {
		return CancelButton;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public WebElement getBackButton_OnConfirmPage() {
		return BackButton_OnConfirmPage;
	}
	public WebElement getOKButton_OnconfirmPopup() {
		return OKButton_OnconfirmPopup;
	}
	public WebElement getCloseButton_ONConfirmPage() {
		return CloseButton_ONConfirmPage;
	}
	public WebElement getInfoTab() {
		return InfoTab;
	}
	public WebElement getLocationsTab() {
		return LocationsTab;
	}
	public WebElement getAssigned_UsersTab() {
		return Assigned_UsersTab;
	}
	public WebElement getShow_Rows_Dropdown() {
		return show_Rows_Dropdown;
	}
	public WebElement getShowRowsDropdown() {
		return ShowRowsDropdown;
	}
	public WebElement getSlideRightIcon() {
		return SlideRightIcon;
	}
	public WebElement getSlideLeftIcon() {
		return SlideLeftIcon;
	}
	public WebElement getJumpToPageDropDown() {
		return JumpToPageDropDown;
	}
	public WebElement getFilter_By_Property() {
	return Filter_By_Property;
}
public WebElement getFilter_By_Property_SearchBox() {
	return Filter_By_Property_SearchBox;
}
public WebElement getFilter_By_Search_Code() {
	return Filter_By_Search_Code;
}
	
	//Business Logic
	 public void ClickOn_Filter_By_Property()
	 {
		 Filter_By_Property.click();
	 }
	 public void ClickOn_Filter_By_Property_SearchBox(String Search_Property)
	 {
		 Filter_By_Property_SearchBox.sendKeys(Search_Property);
	 }
	 public void ClickOn_Filter_By_Search_Code(String Search_Code)
	 {
		 Filter_By_Search_Code.sendKeys(Search_Code);
	 }
	public void ClickOnActiveButton()
	{
		ActiveButton.click();
		
	}
	public void ClickOn_Add_Property_Button()
	{
		Add_Property_Button.click();
	}
	
	public void ClickOnInActiveButton()
	{
		InActiveButton.click();
	}
	public void ClickOnDeactivateButton()
	{
		DeactivateButton.click();
	}
	
	public void ClickOnAddSinglePropertyButton()
	{
		AddSinglePropertyButton.click();
	}
	public void ClickOnAddBulkPropertyButton()
	{
		AddBulkPropertyButton.click();
	}
	public void ClickOnBackButton()
	{

		BackButton.click();
	}
	public void ClickOnFilterIcon()
	{
		FilterIcon.click();
	}
	public void ClickOn_select_PropertyDropdown()
	{
		selectPropertyDropdown.click();
	}
	public void ClickOn_SearchProperty_TextBox()
	{
		SearchPropertyTextBox.click();
	}
	public void ClickOn_searchPropertyCode_TextBox()
	{
		searchPropertyCodeTextBox.click();
	}
	public void ClickOn_ApplyButton()
	{
		ApplyButton.click();
	}
	public void ClickOn_ClearButton()
	{
		ClearButton.click();
	}
	public void CreateProperty_Page(String Property_Name, String Proprty_Code, String country_Name, String Zone, String City_Name, String Location_Name, String Address, String Radious)
	{
		PropertyNameTextField.sendKeys(Property_Name);
		ProprtyCodeTextField.sendKeys(Proprty_Code);
		countryNameTextField.sendKeys(country_Name);
		ZoneTextField.sendKeys(Zone);
		CityNameTextField.sendKeys(City_Name);
		Location_Name_TextField.sendKeys(Location_Name);
		AddressTextField.sendKeys(Address);
		RadiousTextField.sendKeys(Radious);
	}
	
	public void ClickOn_Department_Assigned_Dropdown_VisibleText(String text)
	{
		Select sel=new Select(DepartmentAssignedDropdown);
		sel.selectByVisibleText(text);
	}
	public void ClickOn_Department_Assigned_Dropdown_Value(String Value)
	{
		Select sel=new Select(DepartmentAssignedDropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_Department_Assigned_Dropdown_Index(int index)
	{
		Select sel=new Select(DepartmentAssignedDropdown);
		sel.selectByIndex(index);
	}
	public void clickOn_Users_Assigned_Dropdown_VisibleText(String text)
	{
		Select sel = new Select(Users_Assigned_Dropdown);
		sel.selectByVisibleText(text);
	}
	public void clickOn_Users_Assigned_Dropdown_Value(String Value)
	{
		Select sel = new Select(Users_Assigned_Dropdown);
		sel.selectByVisibleText(Value);
	}
	public void clickOn_Users_Assigned_Dropdown_Index(int index)
	{
		Select sel = new Select(Users_Assigned_Dropdown);
		sel.selectByIndex(index);
	}

	
	public void clickOn_NextButton()
	{
		NextButton.click();
	}
	
   public void ClickOn_SubmitButton()
   {
	   SubmitButton.click();
   }
   public void ClickOn_CancelButton()
   {
	   CancelButton.click();
   }
   public void ClickOn_BackButton_OnConfirmPage()
   {
	   BackButton_OnConfirmPage.click();
   }
   public void ClickOn_OKButton_OnconfirmPopup()
   {
	   OKButton_OnconfirmPopup.click();
   }
   public void clickOn_CloseButton_ONConfirmPage()
   {
	   CloseButton_ONConfirmPage.click();
   }
   public void clickOn_InfoTab()
   {
	   InfoTab.click();
   }
   public void clickOn_LocationsTab()
   {
	   LocationsTab.click();
   }
   public void clickOn_Assigned_UsersTab()
   {
	   Assigned_UsersTab.click();
   }
   public void clickOnshow_Rows_Dropdown()
   {
	   show_Rows_Dropdown.click();
   }
   public void clickOn_SlideRightIcon()
   {
	   SlideRightIcon.click();
   }
   public void SlideLeftIcon()
   {
	   SlideLeftIcon.click();
   }
   public void ClickOn_JumpToPageDropDown_visibletext(String text)
   {
	   Select sel=new Select(JumpToPageDropDown);
	   sel.selectByVisibleText(text);
   }
   public void ClickOn_JumpToPageDropDown_value(String value)
   {
	   Select sel=new Select(JumpToPageDropDown);
	   sel.selectByValue(value);
   }
   public void CLickOn_JumpToPageDropDown_Index(int index)
   {
	   Select sel=new Select(JumpToPageDropDown);
	   sel.selectByIndex(index);
   }
   public void ClickOn_PropertyNameTextField(String Enter_Property_Name)
   {
	   PropertyNameTextField.sendKeys(Enter_Property_Name);
   }
   public void ClickOn_ProprtyCodeTextField(String Enter_ProprtyCodeTextField)
   {
	   ProprtyCodeTextField.sendKeys(Enter_ProprtyCodeTextField);
   }
   public void ClickOn_countryNameTextField(String Entere_CountryName)
   {
	   countryNameTextField.sendKeys(Entere_CountryName);
   }
   public void ClickOn_ZoneTextField(CharSequence ZOne)
   {
	   ZoneTextField.sendKeys(ZOne);
   }
   public void ClickOn_Location_Name_TextField(String Location)
   {
	   Location_Name_TextField.sendKeys(Location);
   }
   public void ClickOn_AddressTextField(String Enter_Address)
   {
	   AddressTextField.sendKeys(Enter_Address);
   }
   public void ClickOn_RadiousTextField(String Enter_Radious)
   {
	   RadiousTextField.sendKeys(Enter_Radious);
   }
   public void ClickOn_CityNameTextField(String Enter_City_Name)
   {
	   CityNameTextField.sendKeys(Enter_City_Name);
   }
   
}
