package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Roles_And_Permissions {

	//Initialization
	public Roles_And_Permissions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//button[normalize-space()='Inactive']")private WebElement InactiveButton;
	@FindBy(xpath = "//button[.='Active']") private WebElement ActiveButton;
	@FindBy(xpath = "//span[.='Add Role']")private WebElement AddRoleButton;
	@FindBy(xpath = "//input[@placeholder='Enter Role Name']")private WebElement RoleName_TextField;
	@FindBy(xpath = "//select[@formcontrolname='origionalType']")private WebElement Original_Type_Dropdown;
	@FindBy(xpath = "//select[@name='type']")private WebElement RoleType_Dropdown;
	@FindBy(xpath = "//select[@name='isActive']")private WebElement SelectStatus_Dropdown;
	@FindBy(xpath = "//button[@type='submit']")private WebElement SubmitButton;
	@FindBy(xpath = "//span[.='Cancel']")private WebElement CancelButton;
	@FindBy(xpath = "//span[.='Back']")private WebElement BackBUtton;
	@FindBy(xpath = "//div[@class='col-lg px-0 overflow-auto main-box']//li[5]//a[1]//div[1]")private WebElement RightSlide_Arrow;
	@FindBy(xpath = "//ul[@class='jump-to']//li//a")private WebElement JumpToPage_Dropdown;
	@FindBy(xpath = "//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-roles-index[@class='ng-star-inserted']/section[@class='pagination']/div[@class='container-fluid']/div[@class='row justify-content-between']/div[@class='col-md-auto']/div[@class='show-rows']/select[1]")private WebElement ShowRows_Dropdown;
	@FindBy(xpath = "//ul[@class='jump-to']//li//a")private WebElement JumpToPage_RightSlide_Arrow;
	@FindBy(xpath = "//span[normalize-space()='Save']")private WebElement Save_Button_On_Create_Role_Page;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement Ok_Button_On_Confirmation_Page;
	@FindBy(xpath = "(//img[@alt='Status'])[1]")private WebElement dynamicActionButton;
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")private WebElement DynamicEditButton;
	@FindBy(xpath = "(//a[contains(text(),'View Permissions')])[1]")private WebElement DynamicViewPermission;
	@FindBy(xpath = "(//a[contains(text(),'Deactivate')])[1]")private WebElement DynamicDeactivateButton;
	@FindBy(xpath = "(//a[contains(text(),'Activate')])[1]")private WebElement dynamicActivateButton;
	//	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement Ok_Button_OnConfirmationPage;
	@FindBy(xpath = "//h4[normalize-space()='Inspection']")private WebElement InspectionPermissionTab;
	public WebElement getInspectionPermissionTab() {
		return InspectionPermissionTab;
	}
	public WebElement getInspectionPermissionAllowTab() {
		return InspectionPermissionAllowTab;
	}
	public WebElement getTicketsPermissionTab() {
		return TicketsPermissionTab;
	}
	public WebElement getTicketsPermissionAllowTab() {
		return TicketsPermissionAllowTab;
	}
	public WebElement getAssetsPermissionTab() {
		return AssetsPermissionTab;
	}
	public WebElement getAssetsPermissionAllowTab() {
		return AssetsPermissionAllowTab;
	}
	public WebElement getPreventive_MaintenanceTab_PermissionTab() {
		return Preventive_MaintenanceTab_PermissionTab;
	}
	public WebElement getPreventive_MaintenanceTab_PermissionAllowTab() {
		return Preventive_MaintenanceTab_PermissionAllowTab;
	}
	public WebElement getParts_and_Permission_PermissionTab() {
		return Parts_and_Permission_PermissionTab;
	}
	public WebElement getParts_and_Permission_PermissionAllowTab() {
		return Parts_and_Permission_PermissionAllowTab;
	}
	public WebElement getMeterPermissionTab() {
		return MeterPermissionTab;
	}
	public WebElement getMeterPermissionAllowTab() {
		return MeterPermissionAllowTab;
	}
	public WebElement getDashboardPermissionTab() {
		return DashboardPermissionTab;
	}
	public WebElement getDashboardPermissionAllowTab() {
		return DashboardPermissionAllowTab;
	}
	public WebElement getChatPermissionTab() {
		return ChatPermissionTab;
	}
	public WebElement getChatPermissionAllowTab() {
		return ChatPermissionAllowTab;
	}

	@FindBy(xpath = "(//span[@class='checkmark'])[1]")private WebElement InspectionPermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Tickets']")private WebElement TicketsPermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[2]")private WebElement TicketsPermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Assets']")private WebElement AssetsPermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[3]")private WebElement AssetsPermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Preventive Maintenance']")private WebElement Preventive_MaintenanceTab_PermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[4]")private WebElement Preventive_MaintenanceTab_PermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Parts & Inventory']")private WebElement Parts_and_Permission_PermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[5]")private WebElement Parts_and_Permission_PermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Meter']")private WebElement MeterPermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[6]")private WebElement MeterPermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Dashboard']")private WebElement DashboardPermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[7]")private WebElement DashboardPermissionAllowTab;
	@FindBy(xpath = "//h4[normalize-space()='Chat']")private WebElement ChatPermissionTab;
	@FindBy(xpath = "(//span[@class='checkmark'])[8]")private WebElement ChatPermissionAllowTab;





	//Getters and Setters
	public WebElement getDynamicActionButton() {
		return dynamicActionButton;
	}
	public WebElement getDynamicEditButton() {
		return DynamicEditButton;
	}
	public WebElement getDynamicViewPermission() {
		return DynamicViewPermission;
	}
	public WebElement getDynamicDeactivateButton() {
		return DynamicDeactivateButton;
	}
	public WebElement getDynamicActivateButton() {
		return dynamicActivateButton;
	}
	public WebElement getOk_Button_On_Confirmation_Page() {
		return Ok_Button_On_Confirmation_Page;
	}
	public WebElement getInactiveButton() {
		return InactiveButton;
	}
	public WebElement getActiveButton() {
		return ActiveButton;
	}
	public WebElement getAddRoleButton() {
		return AddRoleButton;
	}
	public WebElement getRoleName_TextField() {
		return RoleName_TextField;
	}
	public WebElement getOriginal_Type_Dropdown() {
		return Original_Type_Dropdown;
	}
	public WebElement getRoleType_Dropdown() {
		return RoleType_Dropdown;
	}
	public WebElement getSelectStatus_Dropdown() {
		return SelectStatus_Dropdown;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public WebElement getCancelButton() {
		return CancelButton;
	}
	public WebElement getBackBUtton() {
		return BackBUtton;
	}
	public WebElement getRightSlide_Arrow() {
		return RightSlide_Arrow;
	}
	public WebElement getJumpToPage_Dropdown() {
		return JumpToPage_Dropdown;
	}
	public WebElement getShowRows_Dropdown() {
		return ShowRows_Dropdown;
	}
	public WebElement getJumpToPage_RightSlide_Arrow() {
		return JumpToPage_RightSlide_Arrow;
	}
	public WebElement getSave_Button_On_Create_Role_Page() {
		return Save_Button_On_Create_Role_Page;
	}
	//Business Logic
	public void ClickOnInactiveButton()
	{
		InactiveButton.click();
	}
	public void ClickOnActiveButton()
	{
		ActiveButton.click();
	}
	public void ClickOnAddRoleButton()
	{
		AddRoleButton.click();
	}
	public void ClickOnRoleName_TextField(String Enter_Role_Name)
	{
		RoleName_TextField.sendKeys(Enter_Role_Name);
	}
	public void ClickOn_Original_Type_Dropdown_visibleText(String text)
	{
		Select sel=new Select(Original_Type_Dropdown);
		sel.selectByVisibleText(text);
	}
	public void ClickOn_Original_Type_Dropdown_value(String Value)
	{
		Select sel=new Select(Original_Type_Dropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_Original_Type_Dropdown_Index(int Index)
	{
		Select sel=new Select(Original_Type_Dropdown);
		sel.selectByIndex(Index);
	}
	public void ClickOn_RoleType_Dropdown_visibleText(String text)
	{
		Select sel=new Select(RoleType_Dropdown);
		sel.selectByVisibleText(text);
	}
	public void ClickOn_RoleType_Dropdown_Value(String Value)
	{
		Select sel=new Select(RoleType_Dropdown);
		sel.selectByValue(Value);
	}
	public void CLickOn_RoleType_Dropdown_Index(int Index)
	{
		Select sel=new Select(RoleType_Dropdown);
		sel.selectByIndex(Index);
	}
	public void ClickOn_SelectStatus_Dropdown_visibleText(String text)
	{
		Select sel=new Select(SelectStatus_Dropdown);
		sel.selectByVisibleText(text);
	}
	public void CLickOn_SelectStatus_Dropdown(String Value)
	{
		Select sel=new Select(SelectStatus_Dropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_SelectStatus_Dropdown_Index(int Index)
	{
		Select sel=new Select(SelectStatus_Dropdown);
		sel.selectByIndex(Index);
	}
	public void ClickOn_JumpToPage_Dropdown_visibleText(String text)
	{
		Select sel=new Select(JumpToPage_Dropdown);
		sel.selectByVisibleText(text);
	}
	public void ClickOn_JumpToPage_Dropdown_Value(String Value)
	{
		Select sel=new Select(JumpToPage_Dropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_JumpToPage_Dropdown_Index(int Index)
	{
		Select sel=new Select(JumpToPage_Dropdown);
		sel.selectByIndex(Index);
	}
	public void ClickOn_ShowRows_Dropdown_VisibleText(String text)
	{
		Select sel=new Select(ShowRows_Dropdown);
		sel.selectByVisibleText(text);

	}
	public void ClickOn_ShowRows_Dropdown_Value(String value)
	{
		Select sel=new Select(ShowRows_Dropdown);
		sel.selectByValue(value);

	}
	public void ClickOn_ShowRows_Dropdown_Index(int Index)
	{
		Select sel=new Select(ShowRows_Dropdown);
		sel.selectByIndex(Index);

	}
	public void ClickOn_SubmitButton()
	{
		SubmitButton.click();
	}
	public void ClickOn_CancelButton()
	{
		CancelButton.click();
	}
	public void ClickOn_BackBUtton()
	{
		BackBUtton.click();
	}
	public void ClickOn_RightSlide_Arrow()
	{
		RightSlide_Arrow.click();
	}
	public void ClickOn_JumpToPage_RightSlide_Arrow()
	{
		JumpToPage_RightSlide_Arrow.click();
	}
	public void ClickOn_Save_Button_On_Create_Role_Page()
	{
		Save_Button_On_Create_Role_Page.click();
	}
	public void ClickOn_Ok_Button_On_Confirmation_Page()
	{
		Ok_Button_On_Confirmation_Page.click();
	}
	public void ClickOn_dynamicActionButton()
	{
		dynamicActionButton.click();
	}
	public void clickon_DynamicEditButton()
	{
		DynamicEditButton.click();
	}
	public void ClickOn_DynamicViewPermission()
	{
		DynamicViewPermission.click();
	}
	public void ClickOn_DynamicDeactivateButton()
	{
		DynamicDeactivateButton.click();
	}
	public void ClickOn_dynamicActivateButton()
	{
		dynamicActivateButton.click();
	}
	public void Clickon_EditRoleName_TextField(String RoleName)
	{
		RoleName_TextField.clear();
		RoleName_TextField.sendKeys(RoleName);
	}
	public void ClickOn_InspectionPermissionTab()
	{
		InspectionPermissionTab.click();
	}
	public void ClickOn_InspectionPermissionAllowTab()
	{
		InspectionPermissionAllowTab.click();
	}
	public void ClickOn_TicketsPermissionTab()
	{
		TicketsPermissionTab.click();
	}
	public void ClickOn_TicketsPermissionAllowTab()
	{
		TicketsPermissionAllowTab.click();
	}
	public void ClickOn_AssetsPermissionTab()
	{
		AssetsPermissionTab.click();
	}
	public void clickOn_AssetsPermissionAllowTab()
	{
		AssetsPermissionAllowTab.click();
	}
	public void ClickOn_Preventive_MaintenanceTab_PermissionTab()
	{
		Preventive_MaintenanceTab_PermissionTab.click();
		
	}
	public void ClickOn_Preventive_MaintenanceTab_PermissionAllowTab()
	{
		Preventive_MaintenanceTab_PermissionAllowTab.click();
	}
	public void ClickOn_Parts_and_Permission_PermissionTab()
	{
		Parts_and_Permission_PermissionTab.click();
		
	}
	public void ClickON_Parts_and_Permission_PermissionAllowTab()
	{
		Parts_and_Permission_PermissionAllowTab.click();
	}
	public void ClickOn_MeterPermissionTab()
	{
		MeterPermissionTab.click();
	}
	public void CLickOn_MeterPermissionAllowTab()
	{
		MeterPermissionAllowTab.click();
		
	}
	public void ClickOn_DashboardPermissionTab()
	{
		DashboardPermissionTab.click();
	}
	public void ClickOn_DashboardPermissionAllowTab()
	{
		DashboardPermissionAllowTab.click();
	}
	public void ClickOn_ChatPermissionTab()
	{
		ChatPermissionTab.click();
		
	}
	public void ClickOn_ChatPermissionAllowTab()
	{
		ChatPermissionAllowTab.click();
	}
	

}
