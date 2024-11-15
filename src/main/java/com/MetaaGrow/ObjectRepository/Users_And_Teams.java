package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Users_And_Teams {

	//Initialization
	public Users_And_Teams(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//button[normalize-space()='Deactive']") private WebElement DeactivePageButton;
	@FindBy(xpath = "//button[normalize-space()='Active']")private WebElement Active_Button;
	@FindBy(xpath = "//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-user-index/div[@class='col-lg']/section[@class='action-block']/div[@class='row justify-content-between']/div[@class='col-md-auto']/div[@class='filter-button']/button[@id='custom']/span[1]")private WebElement Filter_Tab;
	@FindBy(xpath = "//li[1]//button[1]")private WebElement Select_UserName_filter;
@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement FilterBy_UserName_SearchBox;
	public WebElement getFilterBy_UserName_SearchBox() {
	return FilterBy_UserName_SearchBox;
}

	@FindBy(xpath = "//li[2]//button[1]//span[1]")private WebElement propertyFilter;
	@FindBy(xpath = "//span[.='User Role']")private WebElement User_Role_Filter;
	@FindBy(xpath = "//span[.='Apply']")private WebElement Filter_Apply_Button;
	@FindBy(xpath = "//span[.='Clear']")private WebElement Filter_Clear_Button;
	@FindBy(xpath = "//span[.='Back']")private WebElement Back_Button;
	@FindBy(xpath = "//span[.='Users Download']")private WebElement User_Download_Button;
	@FindBy(xpath = "//span[.='Sub Users Download']")private WebElement Sub_Users_Download_Button;
	@FindBy(xpath = "//span[.='Add User']")private WebElement AddUser_Button;
	@FindBy(xpath = "//a[.='Single']")private WebElement Single_Tab;
	@FindBy(xpath = "//input[@placeholder='Enter Full Name']")private WebElement Full_Name_TextField;
	@FindBy(xpath = "//input[@placeholder='Email']")private WebElement Email_TextField;
	@FindBy(xpath = "//input[@placeholder='Enter Mobile No']")private WebElement Mobile_No_TextField;
	@FindBy(xpath = "//input[@placeholder='Enter Password']")private WebElement Password_TextField;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")private WebElement Confirm_Password_TextField;
	@FindBy(xpath = "//input[@placeholder='Designation']")private WebElement  Designation_TextField;
	@FindBy(xpath = "//select[@formcontrolname='outletId']")private WebElement property_Dropdown;
	@FindBy(xpath = "(//select[@id='selectUser'])[1]")private WebElement ROle_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='options']")private WebElement Department_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='userTypeMobile']")private WebElement UserType_Dropdown;
//	@FindBy(xpath = "//input[@placeholder='Enter Name']")private WebElement SubUser_Name_textField;
//	@FindBy(xpath = "//input[@placeholder='Enter Mobile']")private WebElement SubUser_MobileNo_TextField;
//	@FindBy(xpath = "//input[@placeholder='Enter Designation']")private WebElement SubUser_Designation_TextField;
	@FindBy(xpath = "//button[@class='button btn-primary']")private WebElement Save_Button;
	@FindBy(xpath = "//button[.='Reset']")private WebElement Reset_button;
	@FindBy(xpath = "//span[.='Cancel']")private WebElement Cancel_Butoon;
	@FindBy(xpath = "//span[.='Add Member']")private WebElement Add_Member_Icon;
	@FindBy(xpath = "//span[.='Close']")private WebElement CLoseButton_OnCreatePage;
	@FindBy(xpath = "//img[@alt='Next']/ancestor::div[@class='img-box']")private WebElement RightSlide_Arrow;
	@FindBy(xpath = "//img[@alt='Prev']/ancestor::div[@class='img-box']")private WebElement LeftSlifde_Arrow;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[1]")private WebElement show_Rows_Dropdown;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[2]")private WebElement JumpToPageDropDown;
	@FindBy(xpath = "//button[.='Ok']")private WebElement Ok_ButtonOn_AddUser_Confirmation_Page;
	@FindBy(xpath = "(//img[@id='changeButton'])[1]")private WebElement DynamicActionButton;
	@FindBy(xpath = "//button[@id='deactivatepopup']")private WebElement OkButtonOn_DeactivateUser_ConfirmationPage;
	@FindBy(xpath = "(//button[.='Ok'])[1]")private WebElement OkButtonOn_EditUser_ConfirmationPage;
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")private WebElement DynamicEditButton;
	@FindBy(xpath = "(//a[contains(text(),'Deactive')])[1]")private WebElement DynamicDeactivateButton;
	@FindBy(xpath = "(//a[contains(text(),'Reset Password')])[2]")private WebElement DynamicResetPasswordButton;
	@FindBy(xpath = "//input[@placeholder='Enter Password']")private WebElement NewPasswordTextBox;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")private WebElement ConfirmPasswordTextBox;
	@FindBy(xpath = "//span[normalize-space()='Save']")private WebElement SaveButtonOnResetPasswordPage;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement OkButtonOnResetPassword_ConfirmationPage;
	@FindBy(xpath = "(//a[contains(text(),'Subscriptions')])[1]")private WebElement DynamicSubscriptionlinkText;
	@FindBy(xpath = "(//a[contains(text(),'Sub-Users')])[1]")private WebElement DynamicSubUserLinkText;

	@FindBy(xpath = "(//img[@alt='Status'])[1]")private WebElement SubUsersDynamic_ActionButton;
	@FindBy(xpath = "(//a[normalize-space()='Deactivate'])[1]")private WebElement DeactivateSubuserlinkText;
	@FindBy(xpath = "(//button[normalize-space()='Yes Deactivate'])[1]")private WebElement YesDeactivateButton;
	@FindBy(xpath = "//div[@id='deletePopup']//button[@type='button'][normalize-space()='Cancel']")private WebElement CancelButton_OnYesDeactivatePage;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully;
	@FindBy(xpath = "(//a[normalize-space()='Activate'])[1]")private WebElement ActivateSubuserlinkText;
	@FindBy(xpath = "(//button[normalize-space()='Yes Activate'])[1]")private WebElement YesActivateButton;
	@FindBy(xpath = "//div[@id='activatePopup']//button[@type='button'][normalize-space()='Cancel']")private WebElement CancelButton_On_YesActivatePage;
	@FindBy(xpath = "//span[normalize-space()='Add Sub User']")private WebElement Add_Sub_User_Icon;
	@FindBy(xpath = "//input[@formcontrolname='fullName']")private WebElement SubUserFullNameTextBox;
	@FindBy(xpath = "//input[@formcontrolname='mobile']")private WebElement SubUserMobileNoTextBox;
	@FindBy(xpath = "//input[@placeholder='Designation']")private WebElement SubUserDesignationTextBox;
	@FindBy(xpath = "//span[normalize-space()='Add user']")private WebElement AddUserButton_Sub_Users_DetailsPage;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement CancelButtonOn_Sub_Users_DetailsPage;
	



	public WebElement getSubUsersDynamic_ActionButton() {
		return SubUsersDynamic_ActionButton;
	}
	public WebElement getDeactivateSubuserlinkText() {
		return DeactivateSubuserlinkText;
	}
	public WebElement getYesDeactivateButton() {
		return YesDeactivateButton;
	}
	public WebElement getCancelButton_OnYesDeactivatePage() {
		return CancelButton_OnYesDeactivatePage;
	}
	public WebElement getOkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully() {
		return OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully;
	}
	public WebElement getActivateSubuserlinkText() {
		return ActivateSubuserlinkText;
	}
	public WebElement getYesActivateButton() {
		return YesActivateButton;
	}
	public WebElement getCancelButton_On_YesActivatePage() {
		return CancelButton_On_YesActivatePage;
	}
	public WebElement getAdd_Sub_User_Icon() {
		return Add_Sub_User_Icon;
	}
	public WebElement getSubUserFullNameTextBox() {
		return SubUserFullNameTextBox;
	}
	public WebElement getSubUserMobileNoTextBox() {
		return SubUserMobileNoTextBox;
	}
	public WebElement getSubUserDesignationTextBox() {
		return SubUserDesignationTextBox;
	}
	public WebElement getAddUserButton_Sub_Users_DetailsPage() {
		return AddUserButton_Sub_Users_DetailsPage;
	}
	public WebElement getCancelButtonOn_Sub_Users_DetailsPage() {
		return CancelButtonOn_Sub_Users_DetailsPage;
	}
	//Getters and Setters
	public WebElement getOkButtonOn_EditUser_ConfirmationPage() {
		return OkButtonOn_EditUser_ConfirmationPage;
	}
	public WebElement getOkButtonOn_DeactivateUser_ConfirmationPage() {
		return OkButtonOn_DeactivateUser_ConfirmationPage;
	}
	public WebElement getDynamicActionButton() {
		return DynamicActionButton;
	}
	public WebElement getDynamicEditButton() {
		return DynamicEditButton;
	}
	public WebElement getDynamicDeactivateButton() {
		return DynamicDeactivateButton;
	}
	public WebElement getDynamicResetPasswordButton() {
		return DynamicResetPasswordButton;
	}
	public WebElement getNewPasswordTextBox() {
		return NewPasswordTextBox;
	}
	public WebElement getConfirmPasswordTextBox() {
		return ConfirmPasswordTextBox;
	}
	public WebElement getSaveButtonOnResetPasswordPage() {
		return SaveButtonOnResetPasswordPage;
	}
	public WebElement getOkButtonOnResetPassword_ConfirmationPage() {
		return OkButtonOnResetPassword_ConfirmationPage;
	}
	public WebElement getDynamicSubscriptionlinkText() {
		return DynamicSubscriptionlinkText;
	}
	public WebElement getDynamicSubUserLinkText() {
		return DynamicSubUserLinkText;
	}
	public WebElement getDeactivePageButton() {
		return DeactivePageButton;
	}
	public WebElement getActive_Button() {
		return Active_Button;
	}
	public WebElement getFilter_Tab() {
		return Filter_Tab;
	}
	public WebElement getSelect_UserName_filter() {
		return Select_UserName_filter;
	}
	public WebElement getPropertyFilter() {
		return propertyFilter;
	}
	public WebElement getUser_Role_Filter() {
		return User_Role_Filter;
	}
	public WebElement getFilter_Apply_Button() {
		return Filter_Apply_Button;
	}
	public WebElement getFilter_Clear_Button() {
		return Filter_Clear_Button;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}
	public WebElement getUser_Download_Button() {
		return User_Download_Button;
	}
	public WebElement getSub_Users_Download_Button() {
		return Sub_Users_Download_Button;
	}
	public WebElement getAddUser_Button() {
		return AddUser_Button;
	}
	public WebElement getSingle_Tab() {
		return Single_Tab;
	}
	public WebElement getFull_Name_TextField() {
		return Full_Name_TextField;
	}
	public WebElement getEmail_TextField() {
		return Email_TextField;
	}
	public WebElement getMobile_No_TextField() {
		return Mobile_No_TextField;
	}
	public WebElement getPassword_TextField() {
		return Password_TextField;
	}
	public WebElement getConfirm_Password_TextField() {
		return Confirm_Password_TextField;
	}
	public WebElement getDesignation_TextField() {
		return Designation_TextField;
	}
	public WebElement getProperty_Dropdown() {
		return property_Dropdown;
	}
	public WebElement getROle_Dropdown() {
		return ROle_Dropdown;
	}
	public WebElement getDepartment_Dropdown() {
		return Department_Dropdown;
	}
	public WebElement getUserType_Dropdown() {
		return UserType_Dropdown;
	}
//	public WebElement getSubUser_Name_textField() {
//		return SubUser_Name_textField;
//	}
//	public WebElement getSubUser_MobileNo_TextField() {
//		return SubUser_MobileNo_TextField;
//	}
//	public WebElement getSubUser_Designation_TextField() {
//		return SubUser_Designation_TextField;
//	}
	public WebElement getSave_Button() {
		return Save_Button;
	}
	public WebElement getReset_button() {
		return Reset_button;
	}
	public WebElement getCancel_Butoon() {
		return Cancel_Butoon;
	}
	public WebElement getAdd_Member_Icon() {
		return Add_Member_Icon;
	}
	public WebElement getCLoseButton_OnCreatePage() {
		return CLoseButton_OnCreatePage;
	}
	public WebElement getRightSlide_Arrow() {
		return RightSlide_Arrow;
	}
	public WebElement getLeftSlifde_Arrow() {
		return LeftSlifde_Arrow;
	}
	public WebElement getShow_Rows_Dropdown() {
		return show_Rows_Dropdown;
	}
	public WebElement getJumpToPageDropDown() {
		return JumpToPageDropDown;
	}
	public WebElement getOk_ButtonOn_AddUser_Confirmation_Page() {
		return Ok_ButtonOn_AddUser_Confirmation_Page;
	}

	///BUsiness Logic 

	public void ClickOnDeactivePageButton()
	{
		DeactivePageButton.click();
	}
	public void ClickOnActive_Button()
	{
		Active_Button.click();
	}
	public void CLickOnFilter_Tab()
	{
		Filter_Tab.click();
	}
	public void ClickOn_Select_UserName_filter()
	{
		Select_UserName_filter.click();
	}
	public void CLickOn_propertyFilter()
	{
		propertyFilter.click();

	}
	public void CLickOn_User_Role_Filter()
	{
		User_Role_Filter.click();
	}
	public void ClickOn_Filter_Apply_Button()
	{
		Filter_Apply_Button.click();
	}
	public void ClickOn_Filter_Clear_Button()
	{
		Filter_Clear_Button.click();
	}
	public void ClickOn_Back_Button()
	{
		Back_Button.click();
	}
	public void ClickOn_User_Download_Button()
	{
		User_Download_Button.click();
	}
	public void CLickOn_Sub_Users_Download_Button()
	{
		Sub_Users_Download_Button.click();
	}
	public void ClickOn_AddUser_Button()
	{
		AddUser_Button.click();
	}
	public void CLickOn_Single_Tab()
	{
		Single_Tab.click();
	}
	public void ClickOn_Full_Name_TextField(String Full_Name)
	{
		Full_Name_TextField.sendKeys(Full_Name);
	}
	public void ClickOn_Email_TextField(String Email)
	{
		Email_TextField.sendKeys(Email);
	}
	public void ClickOn_Mobile_No_TextField(String Mobile_No)
	{
		Mobile_No_TextField.sendKeys(Mobile_No);
	}
	public void ClickOn_Password_TextField(String Password)
	{
		Password_TextField.sendKeys(Password);
	}
	public void ClickOn_Confirm_Password_TextField(String Confirm_Password)
	{
		Confirm_Password_TextField.sendKeys(Confirm_Password);
	}
	public void ClickOn_Designation(String Designation)
	{
		Designation_TextField.sendKeys(Designation);
	}
	public void Selectproperty_DropdownBy_VisibleText(String Text)
	{
		Select sel=new Select(property_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void Selectproperty_DropdownBy_Value(String Value)
	{
		Select sel=new Select(property_Dropdown);
		sel.selectByValue(Value);
	}
	public void Selectproperty_Dropdown_ByIndex(int Index)
	{
		Select sel=new Select(property_Dropdown);
		sel.selectByIndex(Index);
	}
	public void SelectROle_DropdownBy_VisibleText(String Text)
	{
		Select sel=new Select(ROle_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void SelectROle_DropdownBy_Value(String Vaue)
	{
		Select sel=new Select(ROle_Dropdown);
		sel.selectByValue(Vaue);
	}
	public void SelectROle_DropdownBy_Index(int Index)
	{
		Select sel=new Select(ROle_Dropdown);
		sel.selectByIndex(Index);
	}
	public void SelectUserType_DropdownBY_VisibleText(String Text)
	{
		Select sel=new Select(UserType_Dropdown);
		sel.deselectByVisibleText(Text);
	}
	public void SelectUserType_DropdownBy_Value(String Value)
	{
		Select sel=new Select(UserType_Dropdown);
		sel.selectByValue(Value);
	}
	public void SelectUserType_DropdownBy_Index(int Index)
	{
		Select sel=new Select(UserType_Dropdown);
		sel.selectByIndex(Index);
	}
//	public void ClickOn_SubUser_Name_textField(String SubUserName){
//		SubUser_Name_textField.sendKeys(SubUserName);
//	}
//	public void ClickOn_SubUser_MobileNo_TextField(String Mobile_NO)
//	{
//		SubUser_MobileNo_TextField.sendKeys(Mobile_NO);
//	}
//	public void ClickOn_SubUser_Designation_TextField(String SubUser_Designation)
//	{
//		SubUser_Designation_TextField.sendKeys(SubUser_Designation);
//	}
	public void CLickON_Save_Button()
	{
		Save_Button.click();
	}
	public void ClickOn_Ok_ButtonOn_AddUser_Confirmation_Page()
	{
		Ok_ButtonOn_AddUser_Confirmation_Page.click();
	}
	public void ClickOn_Reset_button()
	{
		Reset_button.click();
	}
	public void CLickOn_Cancel_Butoon()
	{
		Cancel_Butoon.click();
	}
	public void ClickOn_Add_Member_Icon()
	{
		Add_Member_Icon.click();
	}
	public void ClickOn_CLoseButton_OnCreatePage() {
		CLoseButton_OnCreatePage.click();
	}
	public void ClickOn_RightSlide_Arrow()
	{
		RightSlide_Arrow.click();
	}
	public void ClickOn_LeftSlifde_Arrow()
	{
		LeftSlifde_Arrow.click();
	}
	public void Select_show_Rows_DropdownBy_VisibeText(String Text)
	{
		Select sel=new Select(show_Rows_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void Select_show_Rows_DropdownBy_Value(String Value)
	{
		Select sel=new Select(show_Rows_Dropdown);
		sel.selectByValue(Value);
	}
	public void Select_show_Rows_DropdownBy_Index(int Index)
	{
		Select sel=new Select(show_Rows_Dropdown);
		sel.selectByIndex(Index);
	}
	public void Select_JumpToPage_DropDownBy_VisibleText(String Text)
	{
		Select sel=new Select(JumpToPageDropDown);
		sel.selectByVisibleText(Text);

	}
	public void Select_JumpToPage_DropDownBy_Index(int Index)
	{
		Select sel=new Select(JumpToPageDropDown);
		sel.selectByIndex(Index);
	}
	public void Select_JumpToPage_DropDownBy_Value(String Value)
	{
		Select sel=new Select(JumpToPageDropDown);
		sel.selectByValue(Value);
	}
	public void ClickOn_DynamicActionButton()
	{
		DynamicActionButton.click();
	}
	public void ClickOn_DynamicEditButton()
	{
		DynamicEditButton.click();
	}
	public void ClickOn_DynamicDeactivateButton()
	{
		DynamicDeactivateButton.click();
	}
	public void ClickOn_DynamicResetPasswordButton()
	{
		DynamicResetPasswordButton.click();
	}
	public void ClickOn_NewPasswordTextBox(String Enter_New_Password)
	{
		NewPasswordTextBox.sendKeys(Enter_New_Password);
	}
	public void Clickon_ConfirmPasswordTextBox(String ENter_Confirm_Password)
	{
		ConfirmPasswordTextBox.sendKeys(ENter_Confirm_Password);
	}
	public void ClickOn_SaveButtonOnResetPasswordPage()
	{
		SaveButtonOnResetPasswordPage.click();
	}
	public void ClickOn_OkButtonOnResetPassword_ConfirmationPage()
	{
		OkButtonOnResetPassword_ConfirmationPage.click();
	}
	public void ClickOn_DynamicSubscriptionlinkText()
	{
		DynamicSubscriptionlinkText.click();
	}
	public void ClickOn_DynamicSubUserLinkText()
	{
		DynamicSubUserLinkText.click();
	}
	public void Clickon_OkButtonOn_DeactivateUser_ConfirmationPage()
	{
		OkButtonOn_DeactivateUser_ConfirmationPage.click();
	}
	public void ClickOn_OkButtonOn_EditUser_ConfirmationPage()
	{
		OkButtonOn_EditUser_ConfirmationPage.click();
	}
	public void ClickOn_SubUsersDynamic_ActionButton()
	{
		SubUsersDynamic_ActionButton.click();
	}
	public void ClickOn_DeactivateSubuserlinkText()
	{
		DeactivateSubuserlinkText.click();
	}
	public void ClickOn_YesDeactivateButton()
	{
		YesDeactivateButton.click();
	}
	public void ClickOn_CancelButton_OnYesDeactivatePage()
	{
		CancelButton_OnYesDeactivatePage.click();
	}
	public void Clickon_OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully()
	{
		OkButton_on_Sub_users_account_deactivated_and_Activated_and_SUbUserAdded_successfully.click();
	}
	public void ClickOn_ActivateSubuserlinkText()
	{
		ActivateSubuserlinkText.click();
	}
	public void ClickOn_YesActivateButton()
	{
		YesActivateButton.click();
	}
	public void ClickOn_CancelButton_On_YesActivatePage()
	{
		CancelButton_On_YesActivatePage.click();
	}
	public void ClickOn_Add_Sub_User_Icon()
	{
		Add_Sub_User_Icon.click();
	}
	public void ClickOn_SubUserFullNameTextBox(String SubUser_Full_Name)
	{
		SubUserFullNameTextBox.sendKeys(SubUser_Full_Name);
	}
	public void ClickoN_SubUserMobileNoTextBox(String Mobile_No)
	{
		SubUserMobileNoTextBox.sendKeys(Mobile_No);
	}
	public void ClickOn_SubUserDesignationTextBox(String Desgination)
	{
		SubUserDesignationTextBox.sendKeys(Desgination);
	}
	public void ClickOn_AddUserButton_Sub_Users_DetailsPage()
	{
		AddUserButton_Sub_Users_DetailsPage.click();
	}
	public void Clickon_CancelButtonOn_Sub_Users_DetailsPage()
	{
		CancelButtonOn_Sub_Users_DetailsPage.click();
	}
	public void ClickOn_FilterBy_UserName_SearchBox(String Search_UserName)
	{
		FilterBy_UserName_SearchBox.sendKeys(Search_UserName);
	}


}
