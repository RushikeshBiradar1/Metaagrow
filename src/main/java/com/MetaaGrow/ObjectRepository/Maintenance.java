package com.MetaaGrow.ObjectRepository;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Maintenance {
	//Initialiazation
	public Maintenance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Declaration
	@FindBy(id = "overdue")private WebElement Overdue_Button;
	@FindBy(xpath = "//button[@id='upcoming']")private WebElement Upcoming_Button;
	@FindBy(id = "finished")private WebElement Completed_Button;
	@FindBy(xpath = "//section[@class='action-block']//button[1]")private WebElement Today_Button;
	@FindBy(xpath = "//span[.='Filter']")private WebElement Filter_Tab_Maintenance_HomePage;
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement Filter_By_selectAsset;
	@FindBy(xpath = "//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")private WebElement Filter_By_Asset_SearchBox;
	@FindBy(xpath = "//input[@placeholder='PM Name']")private WebElement Filter_By_PM_Name_TextField;
	@FindBy(xpath = "//span[.='Select Assigned To']")private WebElement Filter_By_Assigned_To;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement FilterbyClear_Button;
	@FindBy(xpath = "//span[.='Select Completed By']")private WebElement Filter_By_Completed_By;
	public WebElement getCompletedBySearchBox() {
		return CompletedBySearchBox;
	}


	@FindBy(xpath = "(//input[@id='custom'])[6]")private WebElement CompletedBySearchBox;
	@FindBy(xpath = "//span[.='PM Templates']")private WebElement PM_Template_Tab;
	@FindBy(xpath = "//button[.='Inactive ']")private WebElement Inactive_Button;
	@FindBy(xpath = "//button[.='Active ']")private WebElement Active_Button;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "//section[@class='action-block']//li[1]//ul[1]//li[1]//div[1]//input[1]")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//span[.='Create Template']")private WebElement Create_Template_Tab;
	@FindBy(xpath = "(//span[normalize-space()='Create Fresh Template'])[1]")private WebElement Create_Fresh_Template_Tab;
	@FindBy(xpath = "(//input[@formcontrolname='name'])[1]")private WebElement Template_Name_TextField;
	@FindBy(xpath = "(//select[contains(@class, 'form-control')])[4]")private WebElement select_Frequency_Dropdown;
	@FindBy(xpath = "//a[.='Custom']")private WebElement Select_Frequency_By_Costom;
	@FindBy(xpath = "//a[.='Daily']")private WebElement Frequency_Daily;
	@FindBy(xpath = "//a[.='Weekly']")private WebElement weekly_Frequency;
	@FindBy(xpath = "//a[.='Monthly']")private WebElement Monthly_Frequency;
	@FindBy(xpath = "//a[.='Once']")private WebElement Once_Frequency;
	@FindBy(xpath = "//input[@placeholder='Frequency']")private WebElement Custom_Frequency_TextField;
	@FindBy(xpath = "//span[.='Select Measurement']")private WebElement Select_Measurement_Icon;
	@FindBy(xpath = "//a[.='Day']")private WebElement Day_Measurement;
	@FindBy(xpath = "//a[.='Week']")private WebElement Week_Measurement;
	@FindBy(xpath = "//a[.='Month']")private WebElement Month_Measurement;
	@FindBy(xpath = "//a[.='Year']")private WebElement Year_Measurement;
	@FindBy(xpath = "//a[.='Custom (Days)']")private WebElement Custom_Days_select_Frequency;
	@FindBy(xpath = "//label[normalize-space()='Monday']")private WebElement Monday_Custom_Days;
	@FindBy(xpath = "//label[normalize-space()='Tuesday']")private WebElement Tuesday_Custom_Days;
	@FindBy(xpath = "//label[normalize-space()='Wednesday']")private WebElement Wednesday_Custom_Days;
	@FindBy(xpath = "//label[normalize-space()='Thursday']")private WebElement Thursday_Custom_Days;
	@FindBy(xpath = "//label[normalize-space()='Friday']")private WebElement Friday_Custom_Days;
	@FindBy(xpath = "//label[normalize-space()='Saturday']")private WebElement Saturday_Custom_Days;
	@FindBy(xpath = "//label[normalize-space()='Sunday']")private WebElement Sunday_Custom_Days;
	@FindBy(xpath = "//div[@id='scheduleFrequecyCustomDaysPop']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_Custom_Frequency;
	@FindBy(id = "selectUser")private WebElement Select_Property_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='assetId']")private WebElement Select_Asset_Dropdown;
	@FindBy(xpath = "//div[@class='select-container']//span[@id='custom']")private WebElement Assigned_UserOn_CreatePM;
	@FindBy(xpath = "//a[normalize-space()='Select All']")private WebElement SelectAllLinkText;
	public WebElement getSelectAllLinkText() {
		return SelectAllLinkText;
	}
	public WebElement getClearAllLinkText() {
		return ClearAllLinkText;
	}

	//@FindBy(xpath = "//li[span[normalize-space()='" + targetDay + "']]/preceding-sibling::li//input[@type='checkbox']")private WebElement AssignedUsersCheckBox;
	@FindBy(xpath = "//a[normalize-space()='Clear All']")private WebElement ClearAllLinkText;
	@FindBy(xpath = "//li[@class='col-6']/descendant::div[@class='form-group']/descendant::input[@formcontrolname='name']")private WebElement Maintenance_Checklist_Question;
	@FindBy(xpath = "//span[.='Select Response']")private WebElement Select_Response_Dropdown;
	@FindBy(xpath = "//a[.='Digital Signature']")private WebElement Response_Digital_Signature;
	@FindBy(xpath = "//a[.='Text Field']")private WebElement Response_TextField;
	@FindBy(xpath = "//a[.='Multiple Choice']")private WebElement Response_Multiple_Choice;
	@FindBy(xpath = "//input[@formcontrolname='responceSearch']")private WebElement response_SearchBox;
	@FindBy(xpath = "//span[.='Add a Response']")private WebElement Add_a_Response_Icon;
	@FindBy(xpath = "//span[.='Yes / No']")private WebElement Yes_No_Response;
	@FindBy(xpath="//img[@alt=\"Add button\"]")private WebElement Add_anotherIcon;
	@FindBy(xpath = "//form[@class='ng-dirty ng-touched ng-valid']//button[@type='submit']")private WebElement NextButton_On_CreatePM_Page;
	@FindBy(xpath = "(//span[normalize-space()='Submit'])[1]")private WebElement SubimtButton_OnTemplateSummeryPage;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Ok'])[2]")private WebElement OkButton_On_MaintenanceCreatedSuccessfully_Popup;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement FilterByProperty;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement FilterByPropertySearchBox;
	@FindBy(xpath = "//span[.='Select Asset Name']") private WebElement FilterByAssetNameOn_PMTemplatePage;
	@FindBy(xpath = "(//button[@id='changeBUton'])[1]")private WebElement ActionButton;
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")private WebElement Editbutton_OnAction;
	@FindBy(xpath = "(//a[contains(text(),'Inactive')])[1]")private WebElement InactiveButton_OnAction;
	@FindBy(xpath = "//button[@type='submit']")private WebElement SubmitButton_OnEditPmTemplate;
	@FindBy(xpath = "//button[@class='button btn-primary ng-star-inserted' and .//span[text()='Submit']]")private WebElement SubmitButtonOnTemplate_SummeryPage;
	public WebElement getSubmitButtonOnTemplate_SummeryPage() {
		return SubmitButtonOnTemplate_SummeryPage;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Ok'])[1]")private WebElement  OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage;
	@FindBy(xpath = "//button[.='Yes Deactive']")private WebElement YesDeactive_ButtonOnConfirmationPopup;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Ok'])[1]")private WebElement OkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup;
	@FindBy(xpath = "(//img[@id='changeBUton'])[1]")private WebElement ActionButton_InactivePage;
	@FindBy(xpath = "(//a[contains(text(),'Active')])[1]")private WebElement activeButton_OnAction;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Ok'])[1]")private WebElement Ok_ButtonOn_Preventive_Maintainance_Templates_activated_successfullyPopup;
	@FindBy(xpath = "(//span[@title='Bowling Lane 2'][normalize-space()='Bowling Lane 2'])[1]")private WebElement BowlingLane2_PM;
	@FindBy(xpath = "//button[@data-target='#emailReport']")private WebElement EmailButton_OnPMInfo;
	@FindBy(xpath = "//input[@placeholder='Enter Email Address']")private WebElement EmailTextFiled_OnPMInfo;
	@FindBy(xpath = "//button[normalize-space()='Send']")private WebElement SendEmailButton;
	@FindBy(xpath = "//button[@id='cancelEmailPopup']")private WebElement CancelEmailPopup;
	@FindBy(xpath = "//span[.='Download']")private WebElement DownloadButton_OnPMInfo;
	@FindBy(xpath = "//a[normalize-space()='As PDF']")private WebElement ASPDFButton;
	@FindBy(xpath = "(//span[contains(text(),'Raise Ticket')])[1]")private WebElement RaiseTicketIcon_OnFirstQuestion;
	@FindBy(xpath = "(//span[@class='red'])[1]")private WebElement ViewTicketIcon_OnFirstQuestion;
	@FindBy(xpath = "(//input[@id='custom'])[3]")private WebElement FilterByAssignedToSearchBoxTodaysTab;
	@FindBy(xpath = "//div[@id=\"successPopUp11111111\"]//button[@type=\"button\"][normalize-space()=\"Ok\"]") private WebElement OKButton_OnPMCreatedSuccessPopup;
	@FindBy(xpath = "//input[@placeholder='HH:MM']")private WebElement ChecklistDueTime;
    @FindBy(xpath = "//span[@title='Select Asset Name']")private WebElement FilterByAssetOnPMTemplate;
    public WebElement getFilterByAssetOnPMTemplate() {
		return FilterByAssetOnPMTemplate;
	}
	public WebElement getFilterByTemplateName_OnPMTemplate() {
		return FilterByTemplateName_OnPMTemplate;
	}
	public WebElement getFilterByAssignedTo_OnPMTemplate() {
		return FilterByAssignedTo_OnPMTemplate;
	}
	public WebElement getFilterByAssignedToSearchBox_OnPMTemplate() {
		return FilterByAssignedToSearchBox_OnPMTemplate;
	}


	@FindBy(xpath = "//input[@placeholder='Template Name']")private WebElement FilterByTemplateName_OnPMTemplate;
    @FindBy(xpath = "//span[.='Select Assigned To']")private WebElement FilterByAssignedTo_OnPMTemplate;
    @FindBy(xpath = "(//input[@id='custom'])[11]")private WebElement FilterByAssignedToSearchBox_OnPMTemplate;
	//Gatters Methods

	public WebElement getChecklistDueTime() {
		return ChecklistDueTime;
	}
	public WebElement getOKButton_OnPMCreatedSuccessPopup() {
		return OKButton_OnPMCreatedSuccessPopup;
	}
	public WebElement getFilterByAssignedToSearchBoxTodaysTab() {
		return FilterByAssignedToSearchBoxTodaysTab;
	}
	public WebElement getOverdue_Buttom() {
		return Overdue_Button;
	}
	public WebElement getUpcoming_Button() {
		return Upcoming_Button;
	}
	public WebElement getCompleted_Button() {
		return Completed_Button;
	}
	public WebElement getToday_Button() {
		return Today_Button;
	}
	public WebElement getFilter_Tab_Maintenance_HomePage() {
		return Filter_Tab_Maintenance_HomePage;
	}
	public WebElement getFilter_By_selectAsset() {
		return Filter_By_selectAsset;
	}
	public WebElement getFilter_By_Asset_SearchBox() {
		return Filter_By_Asset_SearchBox;
	}
	public WebElement getFilter_By_PM_Name_TextField() {
		return Filter_By_PM_Name_TextField;
	}
	public WebElement getFilter_By_Assigned_To() {
		return Filter_By_Assigned_To;
	}
	public WebElement getApply_Button() {
		return Apply_Button;
	}
	public WebElement getCancel_Button() {
		return FilterbyClear_Button;
	}
	public WebElement getFilter_By_Completed_By() {
		return Filter_By_Completed_By;
	}
	public WebElement getPM_Template_Tab() {
		return PM_Template_Tab;
	}
	public WebElement getInactive_Button() {
		return Inactive_Button;
	}
	public WebElement getActive_Button() {
		return Active_Button;
	}
	public WebElement getFilter_By_Property() {
		return Filter_By_Property;
	}
	public WebElement getFilter_By_Property_SearchBox() {
		return Filter_By_Property_SearchBox;
	}
	public WebElement getCreate_Template_Tab() {
		return Create_Template_Tab;
	}
	public WebElement getCreate_Fresh_Template_Tab() {
		return Create_Fresh_Template_Tab;
	}
	public WebElement getTemplate_Name_TextField() {
		return Template_Name_TextField;
	}
	public WebElement getselect_Frequency_Dropdown() {
		return select_Frequency_Dropdown;
	}
	public WebElement getSelect_Frequency_By_Costom() {
		return Select_Frequency_By_Costom;
	}
	public WebElement getFrequency_Daily() {
		return Frequency_Daily;
	}
	public WebElement getWeekly_Frequency() {
		return weekly_Frequency;
	}
	public WebElement getMonthly_Frequency() {
		return Monthly_Frequency;
	}
	public WebElement getOnce_Frequency() {
		return Once_Frequency;
	}
	public WebElement getCustom_Frequency_TextField() {
		return Custom_Frequency_TextField;
	}
	public WebElement getSelect_Measurement_Icon() {
		return Select_Measurement_Icon;
	}
	public WebElement getDay_Measurement() {
		return Day_Measurement;
	}
	public WebElement getWeek_Measurement() {
		return Week_Measurement;
	}
	public WebElement getMonth_Measurement() {
		return Month_Measurement;
	}
	public WebElement getYear_Measurement() {
		return Year_Measurement;
	}
	public WebElement getCustom_Days_select_Frequency() {
		return Custom_Days_select_Frequency;
	}
	public WebElement getMonday_Custom_Days() {
		return Monday_Custom_Days;
	}
	public WebElement getTuesday_Custom_Days() {
		return Tuesday_Custom_Days;
	}
	public WebElement getWednesday_Custom_Days() {
		return Wednesday_Custom_Days;
	}
	public WebElement getThursday_Custom_Days() {
		return Thursday_Custom_Days;
	}
	public WebElement getFriday_Custom_Days() {
		return Friday_Custom_Days;
	}
	public WebElement getSaturday_Custom_Days() {
		return Saturday_Custom_Days;
	}
	public WebElement getSunday_Custom_Days() {
		return Sunday_Custom_Days;
	}
	public WebElement getOk_Button_On_Custom_Frequency() {
		return Ok_Button_On_Custom_Frequency;
	}
	public WebElement getSelect_Property_Dropdown() {
		return Select_Property_Dropdown;
	}
	public WebElement getSelect_Asset_Dropdown() {
		return Select_Asset_Dropdown;
	}
	public WebElement getAssigned_UserOn_CreatePM() {
		return Assigned_UserOn_CreatePM;
	}
	public WebElement getMaintenance_Checklist_Name() {
		return Maintenance_Checklist_Question;
	}
	public WebElement getSelect_Response_Dropdown() {
		return Select_Response_Dropdown;
	}
	public WebElement getResponse_Digital_Signature() {
		return Response_Digital_Signature;
	}
	public WebElement getResponse_TextField() {
		return Response_TextField;
	}
	public WebElement getResponse_Multiple_Choice() {
		return Response_Multiple_Choice;
	}
	public WebElement getResponse_SearchBox() {
		return response_SearchBox;
	}
	public WebElement getAdd_a_Response_Icon() {
		return Add_a_Response_Icon;
	}
	public WebElement getYes_No_Response() {
		return Yes_No_Response;
	}
	public WebElement getAdd_anotherIcon() {
		return Add_anotherIcon;
	}
	public WebElement getNextButton_On_CreatePM_Page() {
		return NextButton_On_CreatePM_Page;
	}
	public WebElement getSubimtButton_OnTemplateSummeryPage() {
		return SubimtButton_OnTemplateSummeryPage;
	}
	public WebElement getOkButton_On_MaintenanceCreatedSuccessfully_Popup() {
		return OkButton_On_MaintenanceCreatedSuccessfully_Popup;
	}
	public WebElement getFilterByProperty() {
		return FilterByProperty;
	}
	public WebElement getFilterByPropertySearchBox() {
		return FilterByPropertySearchBox;
	}
	public WebElement getFilterByAssetNameOn_PMTemplatePage() {
		return FilterByAssetNameOn_PMTemplatePage;
	}
	public WebElement getActionButton() {
		return ActionButton;
	}
	public WebElement getEditbutton_OnAction() {
		return Editbutton_OnAction;
	}
	public WebElement getInactiveButton_OnAction() {
		return InactiveButton_OnAction;
	}
	public WebElement getSubmitButton_OnEditPmTemplate() {
		return SubmitButton_OnEditPmTemplate;
	}
	public WebElement getOkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage() {
		return OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage;
	}
	public WebElement getYesDeactive_ButtonOnConfirmationPopup() {
		return YesDeactive_ButtonOnConfirmationPopup;
	}
	public WebElement getOkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup() {
		return OkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup;
	}
	public WebElement getActionButton_InactivePage() {
		return ActionButton_InactivePage;
	}
	public WebElement getActiveButton_OnAction() {
		return activeButton_OnAction;
	}
	public WebElement getOk_ButtonOn_Preventive_Maintainance_Templates_activated_successfullyPopup() {
		return Ok_ButtonOn_Preventive_Maintainance_Templates_activated_successfullyPopup;
	}
	public WebElement getBowlingLane2_PM() {
		return BowlingLane2_PM;
	}
	public WebElement getEmailButton_OnPMInfo() {
		return EmailButton_OnPMInfo;
	}
	public WebElement getEmailTextFiled_OnPMInfo() {
		return EmailTextFiled_OnPMInfo;
	}
	public WebElement getSendEmailButton() {
		return SendEmailButton;
	}
	public WebElement getCancelEmailPopup() {
		return CancelEmailPopup;
	}
	public WebElement getDownloadButton_OnPMInfo() {
		return DownloadButton_OnPMInfo;
	}
	public WebElement getASPDFButton() {
		return ASPDFButton;
	}
	public WebElement getRaiseTicketIcon_OnFirstQuestion() {
		return RaiseTicketIcon_OnFirstQuestion;
	}
	public WebElement getViewTicketIcon_OnFirstQuestion() {
		return ViewTicketIcon_OnFirstQuestion;
	}


	//Business Logic
	public void ClickOn_Overdue_Button()
	{
		Overdue_Button.click();

	}
	public void ClickOn_Upcoming_Button()
	{
		Upcoming_Button.click();
	}
	public void ClickOn_Completed_Button()
	{
		
		Completed_Button.click();
	}
	public void Clickon_Today_Button()
	{
		Today_Button.click();
	}
	public void ClickOn_Filter_Tab_Maintenance_HomePage()
	{
		Filter_Tab_Maintenance_HomePage.click();

	}
	public void Clickon_Filter_By_selectAsset()
	{
		Filter_By_selectAsset.click();

	}
	public void ClickOn_Filter_By_Asset_SearchBox(String Enter_Asset_Name)
	{
		Filter_By_Asset_SearchBox.sendKeys(Enter_Asset_Name);
	}
	public void ClickOn_Filter_By_PM_Name_TextField(String Enter_PM_Name)
	{
		Filter_By_PM_Name_TextField.sendKeys(Enter_PM_Name);
	}
	public void ClickOn_Filter_By_Assigned_To()
	{
		Filter_By_Assigned_To.click();
	}
	public void ClickOn_Apply_Button()
	{
		Apply_Button.click();
	}
	public void ClickOn_FilterByAssignedToSearchBoxTodaysTab(String Enter_Asset_Name)
	{
		FilterByAssignedToSearchBoxTodaysTab.sendKeys(Enter_Asset_Name);
	}
	public void ClickOn_FilterbyClear_Button()
	{
		FilterbyClear_Button.click();
	}
	public void CLickOn_Filter_By_Completed_By()
	{
		Filter_By_Completed_By.click();
	}
	public void ClickOn_PM_Template_Tab()
	{
		PM_Template_Tab.click();
	}
	public void ClikOn_Inactive_Button() {
		Inactive_Button.click();
	}
	public void ClickOn_Active_Button() {
		Active_Button.click();
	}
	public void ClickOn_Filter_By_Property()
	{
		Filter_By_Property.click();
	}
	public void CLickOn_Filter_By_Property_SearchBox(String Search_Property)
	{
		Filter_By_Property_SearchBox.sendKeys(Search_Property);
	}
	public void ClickOn_Create_Template_Tab()
	{
		Create_Template_Tab.click();
	}
	public void CLickOn_Create_Fresh_Template_Tab()
	{
		Create_Fresh_Template_Tab.click();
	}
	public void ClickOn_Template_Name_TextField(String Enter_Template_Name)
	{
		Template_Name_TextField.sendKeys(Enter_Template_Name);
	}
	public void select_FrequencyByText(String Text)
	{
		Select sel = new Select(select_Frequency_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Frequency_By_Costom()
	{
		Select_Frequency_By_Costom.click();
	}
	public void CLickOn_Frequency_Daily()
	{
		Frequency_Daily.click();
	}
	public void CLickon_weekly_Frequency()
	{
		weekly_Frequency.click();
	}
	public void CLickOn_Monthly_Frequency()
	{
		Monthly_Frequency.click();
	}
	public void ClickOn_Once_Frequency()
	{
		Once_Frequency.click();
	}
	public void ClickOn_Custom_Frequency_TextField()
	{
		Custom_Frequency_TextField.click();
	}
	public void Clickon_Select_Measurement_Icon()
	{
		Select_Measurement_Icon.click();

	}
	public void ClickOn_Day_Measurement()
	{
		Day_Measurement.click();
	}
	public void ClickOn_Week_Measurement()
	{
		Week_Measurement.click();
	}
	public void CLickOn_Month_Measurement()
	{
		Month_Measurement.click();
	}
	public void ClickOn_Year_Measurement()
	{
		Year_Measurement.click();
	}

	public void ClickOn_Custom_Days_select_Frequency()
	{
		Custom_Days_select_Frequency.click();
	}
	public void clickOn_Monday_Custom_Days()
	{
		Monday_Custom_Days.click();
	}
	public void CLickOn_Tuesday_Custom_Days()
	{
		Tuesday_Custom_Days.click();
	}
	public void Clickon_Wednesday_Custom_Days()
	{
		Wednesday_Custom_Days.click();
	}
	public void ClickOn_Thursday_Custom_Days()
	{
		Thursday_Custom_Days.click();
	}
	public void CLickOn_Friday_Custom_Days()
	{
		Friday_Custom_Days.click();
	}
	public void ClickOn_Saturday_Custom_Days()
	{
		Saturday_Custom_Days.click();
	}
	public void ClickOn_Sunday_Custom_Days()
	{
		Sunday_Custom_Days.click();
	}

	public void CLickOn_Ok_Button_On_Custom_Frequency()
	{
		Ok_Button_On_Custom_Frequency.click();
	}
	public void CLickon_Select_Property_Dropdown(String Enter_PropertyName)
	{
		Select select = new Select(Select_Property_Dropdown);
		select.selectByVisibleText(Enter_PropertyName);

	}
	public void CLickOn_Select_Asset_Dropdown(String Text)
	{
		Select sel = new Select(Select_Asset_Dropdown);
		sel.deselectByVisibleText(Text);
	}
	public void CLickOn_Assigned_UserOn_CreatePM(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		By buttonLocator = By.xpath("//span[.='Select User']");
		WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
		button1.click();
//		Assigned_UserOn_CreatePM.click();
	}
	public void ClickOn_Maintenance_Checklist_Question(String Enter_Question)
	{
		Maintenance_Checklist_Question.sendKeys(Enter_Question);
	}
	public void CLickOn_Select_Response_Dropdown()
	{
		Select_Response_Dropdown.click();
	}
	public void CLickOn_Response_Digital_Signature()
	{
		Response_Digital_Signature.click();
	}
	public void CLickOn_Response_TextField()
	{
		Response_TextField.click();
	}
	public void CLickONResponse_Multiple_Choice()
	{
		Response_Multiple_Choice.click();

	}
	public void CLickOn_response_SearchBox(String Search_Response_Type)
	{
		response_SearchBox.sendKeys(Search_Response_Type);
	}
	public void CLickON_Add_a_Response_Icon()
	{
		Add_a_Response_Icon.click();
	}
	public void CLickOn_Yes_No_Response()
	{
		Yes_No_Response.click();
	}
	public void CLickOn_Add_anotherIcon()
	{
		Add_anotherIcon.click();
	}
	public void CLickOn_NextButton_On_CreatePM_Page()
	{
		NextButton_On_CreatePM_Page.click();
	}
	public void CLickOn_SubimtButton_OnTemplateSummeryPage()
	{
		SubimtButton_OnTemplateSummeryPage.click();
	}
	public void ClickOn_OkButton_On_MaintenanceCreatedSuccessfully_Popup()
	{
		OkButton_On_MaintenanceCreatedSuccessfully_Popup.click();
	}
	public void CLickOn_FilterByProperty() {
		FilterByProperty.click();
	}
	public void CLickON_FilterByPropertySearchBox(String Search_Proprty) {
		FilterByPropertySearchBox.sendKeys(Search_Proprty);
	}
	public void ClickON_FilterByAssetNameOn_PMTemplatePage()
	{
		FilterByAssetNameOn_PMTemplatePage.click();
	}
	public void ClickOn_ActionButton()
	{
		ActionButton.click();
	}
	public void ClickOn_Editbutton_OnAction()
	{
		Editbutton_OnAction.click();
	}
	public void CLickOn_InactiveButton_OnAction()
	{
		InactiveButton_OnAction.click();

	}
	public void CLickOn_SubmitButton_OnEditPmTemplate()
	{
		SubmitButton_OnEditPmTemplate.click();
	}
	public void clickOn_OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage()
	{
		OkButton_OnMaintenanceChecklistUpdated_SuccessfullyPage.click();
	}
	public void CLickON_YesDeactive_ButtonOnConfirmationPopup()
	{
		YesDeactive_ButtonOnConfirmationPopup.click();
	}
	public void CLickOn_OkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup()
	{
		OkButton_OnPreventive_Maintainance_Templates_deactivated_successfullyPopup.click();
	}
	public void CLickOn_ActionButton_InactivePage()
	{
		ActionButton_InactivePage.click();
	}
	public void CLickOn_activeButton_OnAction()
	{
		activeButton_OnAction.click();
	}
	public void CLickOn_Ok_ButtonOn_Preventive_Maintainance_Templates_activated_successfullyPopup()
	{
		Ok_ButtonOn_Preventive_Maintainance_Templates_activated_successfullyPopup.click();
	}
	public void CLickOn_BowlingLane2_PM()
	{
		BowlingLane2_PM.click();
	}
	public void CLickON_EmailButton_OnPMInfo()
	{
		EmailButton_OnPMInfo.click();
	}
	public void CLickon_EmailTextFiled_OnPMInfo(String ENter_Email)
	{
		EmailTextFiled_OnPMInfo.sendKeys(ENter_Email);
	}
	public void CLickOn_SendEmailButton()
	{
		SendEmailButton.click();

	}
	public void ClickON_CancelEmailPopup()
	{
		CancelEmailPopup.click();
	}
	public void CLickOn_DownloadButton_OnPMInfo()
	{
		DownloadButton_OnPMInfo.click();
	}
	public void CLickOn_ASPDFButton()
	{
		ASPDFButton.click();
	}
	public void CLickon_RaiseTicketIcon_OnFirstQuestion()
	{
		RaiseTicketIcon_OnFirstQuestion.click();
	}
	public void ClickON_ViewTicketIcon_OnFirstQuestion()
	{
		ViewTicketIcon_OnFirstQuestion.click();

	}
	public void ClickOn_CompletedBySearchBox(String Enter_name)
	{
		CompletedBySearchBox.sendKeys(Enter_name);
	}
	public void Clickon_SelectAllLinkText()
	{
		SelectAllLinkText.click();
	}
	public void ClickOn_ClearAllLinkText()
	{
		ClearAllLinkText.click();
	}
	public void SelectAssignedUsersCheckBox()
	{

	}
	public void ClickOn_SubmitButtonOnTemplate_SummeryPage()
	{
		SubmitButtonOnTemplate_SummeryPage.click();
	}
	public void ClickOn_OKButton_OnPMCreatedSuccessPopup()
	{
		OKButton_OnPMCreatedSuccessPopup.click();
	}
	public void ClearTemplate_Name_TextField()
	{
		Template_Name_TextField.click();
		Template_Name_TextField.clear();
	}
	public String Gettext_Template_Name_TextField()
	{
		String PM_Name = Template_Name_TextField.getText();
		return PM_Name;
	}
	public void ClickON_FilterByAssetOnPMTemplate()
	{
		FilterByAssetOnPMTemplate.click();
	}
	public void ClickOn_FilterByTemplateName_OnPMTemplate(String Enter_TemplateName)
	{
		FilterByTemplateName_OnPMTemplate.sendKeys(Enter_TemplateName);
	}
	public void ClickOn_FilterByAssignedTo_OnPMTemplate()
	{
		FilterByAssignedTo_OnPMTemplate.click();
	}
	public void ClickOn_FilterByAssignedToSearchBox_OnPMTemplate(String Enter_Assignee_Name)
	{
		FilterByAssignedToSearchBox_OnPMTemplate.sendKeys(Enter_Assignee_Name);
	}


	public void FilterByUpcomingStartDate(WebDriver driver) throws InterruptedException {
	    // Calculate the date one day from the current date
	    LocalDate targetDate = LocalDate.now().plusDays(1);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
	    Thread.sleep(3000);

	    // Loop until the target month is displayed
	    while (true) {
	        // Extract the text of the currently displayed month in the date picker
	        String displayedMonth = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

	        // Check if the displayed month matches the target month
	        if (displayedMonth.equals(targetMonth)) {
	            break; // Exit the loop if the target month is reached
	        } else {
	            // Click on the right arrow to navigate to the next month
	            driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
	        }
	    }

	    // Select the day
	    driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
	}

	public void selectTodayDate_OnStartDateOnCreatePMTemplate(WebDriver driver) throws InterruptedException {
		LocalDate today = LocalDate.now();
		String targetMonthYear = today.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Aug-2024"
		String targetDay = String.valueOf(today.getDayOfMonth()); // e.g., "21"
		System.out.println(targetDay);
		System.out.println(targetMonthYear);
		// Click on the Start Date input field to open the date picker
		driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Loop until the target month-year is displayed
		boolean monthYearFound = false;
		while (!monthYearFound) {
			// Extract the text of the currently displayed month-year in the date picker
			WebElement monthYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]"))); // Adjust the XPath as needed
			String displayedMonthYear = monthYearElement.getText().trim(); // Format should be "Aug-2024"
			System.out.println(displayedMonthYear);
			// Check if the displayed month-year matches the target month-year
			if (displayedMonthYear.equals(targetMonthYear)) {
				monthYearFound = true; // Exit the loop if the target month-year is reached
			} else {
				// Click on the right arrow to navigate to the next month (adjust if using left arrow)
				WebElement nextMonthButton = driver.findElement(By.xpath("//button[@aria-label='Next month']")); // Adjust the XPath as needed
				nextMonthButton.click();
				Thread.sleep(1000); // Wait for the month-year to change
			}
		}
		// Click on the day in the date picker
		driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();

		// Click on the day in the date picker
		//		    WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space(text())='" + targetDay + "']")));
		//		    dayElement.click();
	}
	public void selectTodayDate_OnStartDateOnEditPMTemplate(WebDriver driver) throws InterruptedException {
		LocalDate today = LocalDate.now();
		String targetMonthYear = today.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Aug-2024"
		String targetDay = String.valueOf(today.getDayOfMonth()); // e.g., "21"
		System.out.println(targetDay);
		System.out.println(targetMonthYear);
		// Click on the Start Date input field to open the date picker
		driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Loop until the target month-year is displayed
		boolean monthYearFound = false;
		while (!monthYearFound) {
			// Extract the text of the currently displayed month-year in the date picker
			WebElement monthYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]"))); // Adjust the XPath as needed
			String displayedMonthYear = monthYearElement.getText().trim(); // Format should be "Aug-2024"
			System.out.println(displayedMonthYear);
			// Check if the displayed month-year matches the target month-year
			if (displayedMonthYear.equals(targetMonthYear)) {
				monthYearFound = true; // Exit the loop if the target month-year is reached
			} else {
				// Click on the right arrow to navigate to the next month (adjust if using left arrow)
				WebElement nextMonthButton = driver.findElement(By.xpath("//button[@aria-label='Next month']")); // Adjust the XPath as needed
				nextMonthButton.click();
				Thread.sleep(1000); // Wait for the month-year to change
			}
		}
		// Click on the day in the date picker
		driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();

		// Click on the day in the date picker
		//		    WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space(text())='" + targetDay + "']")));
		//		    dayElement.click();
	}
	public void End_Date(WebDriver driver) throws Throwable {
		// Click on the End Date input field to open the date picker
		LocalDate today = LocalDate.now();
		LocalDate endDate = today.plusDays(8);

		String targetMonthYear = endDate.format(DateTimeFormatter.ofPattern("MMM-yyyy"));
		String targetDay = String.valueOf(endDate.getDayOfMonth());

		System.out.println("Target Day: " +targetDay);
		System.out.println("Target Month-Year: " + targetMonthYear);

		// Click on the End Date input field to open the date picker
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement endDateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='endDate']")));
		endDateInput.click();
//		WebElement endDateInput = driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[2]"));
//		endDateInput.click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Loop until the target month-year is displayed
		boolean monthYearFound = false;
		while (!monthYearFound) {
			// Extract the text of the currently displayed month-year in the date picker
			WebElement monthYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]"))); // Adjust the XPath as needed
			String displayedMonthYear = monthYearElement.getText().trim(); // Format should be "Aug-2024"
			System.out.println("Displayed Month-Year: " +displayedMonthYear);

			// Check if the displayed month-year matches the target month-year
			if (displayedMonthYear.equals(targetMonthYear)) {
				monthYearFound = true; // Exit the loop if the target month-year is reached
			} else {
				// Click on the right arrow to navigate to the next month
				WebElement nextMonthButton = driver.findElement(By.xpath("//button[@aria-label='Next month']")); // Adjust the XPath as needed
				nextMonthButton.click();
				Thread.sleep(1000); // Wait for the month-year to change
			}
		}

		// Click on the day in the date picker
		//		    WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space(text())='" + targetDay + "']")));
		//		    dayElement.click();
		driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
		System.out.println("Day " + targetDay + " selected.");
	}
	 public void Filetr_OverdueBy_End_Date(WebDriver driver, String targetMonth, String targetDay) {
         // Click on the End Date input field to open the date picker
         driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();

         // Loop until the target month is displayed
         while (true) {
             // Extract the text of the currently displayed month in the date picker
             String displayedMonth = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).getText();

             // Check if the displayed month matches the target month
             if (displayedMonth.equals(targetMonth)) {
                 break; // Exit the loop if the target month is reached
             } else {
                 // Click on the Left arrow to navigate to the next month
                 driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
             }
         }
         System.out.println("before click");

         // Click on the day in the date picker
         driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
         System.out.println("after click");

     }
	 
	 public void End_DateOnUpcomingFilter(WebDriver driver) {
		    // Calculate the date two days from the current date
		    LocalDate targetDate = LocalDate.now().plusDays(2);
		    
		    // Format the target date to extract month and day
		    String end_month = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Oct-2024"
		    String end_day = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

		    // Click on the End Date input field to open the date picker
		    driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set a 10-second wait

		    // Loop until the target month is displayed
		    while (true) {
		        // Wait for the month element to be visible
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")));

		        // Get the currently displayed month and year in the date picker
		        String displayedMonth = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

		        // Check if the displayed month matches the target month
		        if (displayedMonth.equals(end_month)) {
		            break; // Exit the loop if the target month is reached
		        } else {
		            // Click on the right arrow to navigate to the next month
		            driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
		        }
		    }

		    // Wait for the day element to be clickable
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='" + end_day + "']")));
		    
		    // Select the day from the calendar
		    driver.findElement(By.xpath("//span[normalize-space()='" + end_day + "']")).click();
		}

	 
	 public void End_Date_OnCompletedFilter(WebDriver driver, String targetMonth, String targetDay) {
         // Click on the End Date input field to open the date picker
         driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();

         // Loop until the target month is displayed
         while (true) {
             // Extract the text of the currently displayed month in the date picker
             String displayedMonth = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).getText();

             // Check if the displayed month matches the target month
             if (displayedMonth.equals(targetMonth)) {
                 break; // Exit the loop if the target month is reached
             } else {
                 // Click on the left arrow to navigate to the previous month
                 driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
             }
         }
         System.out.println("before click");

         // Click on the day in the date picker
         driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
         System.out.println("after click");

     }
	 
	 public void selectTodayStartDate_OnEditPMTemplate(WebDriver driver) throws InterruptedException {
		 LocalDate today = LocalDate.now();
		 LocalDate tomorrow = today.plusDays(1); // Calculate tomorrow's date
		 String targetMonthYear = tomorrow.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2025"
		 String targetDay = String.valueOf(tomorrow.getDayOfMonth()); // e.g., "1"

		 System.out.println(targetDay);
		 System.out.println(targetMonthYear);

		 // Click on the Start Date input field to open the date picker
		 driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).click();

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		 // Loop until the target month-year is displayed
		 boolean monthYearFound = false;
		 while (!monthYearFound) {
		     // Extract the text of the currently displayed month-year in the date picker
		     WebElement monthYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]"))); // Adjust the XPath as needed
		     String displayedMonthYear = monthYearElement.getText().trim(); // Format should be "Feb-2025"
		     System.out.println(displayedMonthYear);
		     
		     // Check if the displayed month-year matches the target month-year
		     if (displayedMonthYear.equals(targetMonthYear)) {
		         monthYearFound = true; // Exit the loop if the target month-year is reached
		     } else {
		         // Click on the right arrow to navigate to the next month (adjust if using left arrow)
		         WebElement nextMonthButton = driver.findElement(By.xpath("//button[@aria-label='Next month']")); // Adjust the XPath as needed
		         nextMonthButton.click();
		         Thread.sleep(1000); // Wait for the month-year to change
		     }
		 }

		 // Click on the day in the date picker
		 driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
		}


		    public void addQuestion(WebDriverWait w, JavascriptExecutor js, WebElement sectionCard){
		        WebElement btn = sectionCard.findElement(By.cssSelector("a.addChecklistQuestion"));
		        js.executeScript("arguments[0].scrollIntoView(true);", btn);
		        w.until(ExpectedConditions.elementToBeClickable(btn)).click();
		    }
		    public  void addSection(WebDriverWait w, JavascriptExecutor js){
		        WebElement btn = w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.addChecklistSection")));
		        js.executeScript("arguments[0].scrollIntoView(true);", btn);
		        btn.click();
		    }
		    
	 }


