package com.MetaaGrow.ObjectRepository;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MetaaGrow.Generic_Utility.WebDriver_Utility;

public class Inspections {
	//Initialization
	public Inspections(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	
	@FindBy(id = "previous")private WebElement Previous_Button;
	@FindBy(xpath = "//button[normalize-space()='Today']")private WebElement Today_Button;
	@FindBy(id = "upcoming")private WebElement UpcomingButton;
	public WebElement getUpcomingButton() {
		return UpcomingButton;
	}

	@FindBy(xpath = "//label[@for='301669check']")private WebElement Dynamic_Radio_Button_Schedule_Name;
	@FindBy(xpath = "//button[contains(@class, 'downloadPermissionReport')]")private WebElement Download_PDF_Button;
	@FindBy(xpath = "//button[contains(@class, 'emailPermissionReport')]")private WebElement Email_Button;
	@FindBy(xpath = "//input[@placeholder='Enter email address']")private WebElement Email_Address_TextField;
	@FindBy(xpath = "//button[normalize-space()='Send']")private WebElement Send_Button_On_Email;
	@FindBy(xpath = "//button[@id='navigattohome']")private WebElement Ok_Button_On_Email_ConfirmationPage;
	@FindBy(xpath = "//button[@id='cancelEmailPopup']")private WebElement Cancel_Button_On_Email;
	@FindBy(xpath = "//span[.='Filter']")private WebElement Filter_Icon;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//a[.='CSML']")private WebElement Filter_By_Dynamic_Property_Name;
	@FindBy(xpath = "//input[@placeholder='Schedule Name']")private WebElement Filter_By_Schedule_Name;
	@FindBy(xpath = "//span[normalize-space()='Select User']")private WebElement Filter_By_Select_User_Button;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Select_User_SearchBox;
	@FindBy(xpath = "//a[.='Anil']")private WebElement Filter_By_Dynamic_User;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement Filter_By_Clear_Button;
	@FindBy(xpath = "(//li[@title='Wwe'])[1]")private WebElement Filter_By_Dynamic_Schedule_Name;
	@FindBy(xpath = "//span[@class='blue']")private WebElement Raise_Ticket_Icon_On_Info_Page;
	@FindBy(xpath = "//span[normalize-space()='Close']")private WebElement Close_Button_On_InfoPage;
	@FindBy(xpath = "(//img[@alt='Reports Add'])[2]")private WebElement Manage_Checklist_Button;
	@FindBy(xpath = "//label[@for='3355check']")private WebElement Dynamic_Radio_Button_Name_On_Checklist_Page;
	@FindBy(xpath = "//span[normalize-space()='Duplicate to another Property']")private WebElement Duplicate_To_Another_Property_Button;
	@FindBy(xpath = "//input[@type='text']")private WebElement Checklist_Name_TextField_On_Duplicate_Checklist_Page;
	@FindBy(xpath = "//select[@id='Housekeeping']")private WebElement Deparment_Dropdown_On_Duplicate_Checklist_Page;
	@FindBy(xpath = "//span[normalize-space()='Duplicate']")private WebElement Duplicate_On_Duplicate_Checklist_Page;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_On_Duplicate_Checklist_Page;
	@FindBy(xpath = "//button[contains(text(),'Inactive')]")private WebElement Inactive_Button_On_Manage_Checklist_Page;
	@FindBy(xpath = "//button[normalize-space()='Active']")private WebElement Active_Button_On_Manage_Checklist_Page;
	@FindBy(xpath = "//input[@placeholder='Checklist Name']")private WebElement Filter_By_Checklist_Name_On_Manage_Checklist_Page;
	@FindBy(xpath = "//span[.='Select department']")private WebElement Filter_by_Department_Dropdown_On_Manage_Checklist_Page;
	@FindBy(xpath = "//input[@name='autocomplete']")private WebElement Filter_by_Department_SearchBox_On_Manage_Checklist_Page;
	@FindBy(xpath = "//a[.='Operations']")private WebElement Filter_by_Dynamic_Department_name_On_Manage_Checklist_Page;
	@FindBy(xpath = "//span[normalize-space()='Create Checklist']")private WebElement Create_Checklist_Button_On_Manage_Checklist_Page;
	@FindBy(id = "createChecklistName")private WebElement CheckList_Name_On_Create_Checklist_Page;
	@FindBy(xpath = "(//select[@name='department'])[1]")private WebElement Property_Dropdown_On_Create_Checklist_Page;
	@FindBy(xpath = "(//select[@name='department'])[2]")private WebElement Department_Dropdown_On_Create_Checklist_Page;
	@FindBy(xpath = "//input[@name='Section Name']")private WebElement Section_Name_TextBox_On_Create_Checklist_Page;
	@FindBy(xpath = "//input[@placeholder='Enter Question Name']")private WebElement Question_Name_TextBox_On_Create_Checklist_Page;
	@FindBy(xpath = "//span[.='Select Response']")private WebElement Select_Response_On_Create_Checklist_Page;
	@FindBy(xpath = "//a[.='Text Field']")private WebElement Select_Response_TextField_On_Create_Checklist_Page;
	@FindBy(xpath = "//a[normalize-space()='Digital Signature']")private WebElement Select_Response_Digital_Signature_On_Create_Checklist_Page;
	@FindBy(xpath = "//a[.='Multiple Choice']")private WebElement Select_Response_Multiple_Choice_On_Create_Checklist_Page;
	@FindBy(xpath = "//img[@alt='checkbox check']")private WebElement Description_CheckBox_On_Create_Checklist_Page;
	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")private WebElement Description_TextBox_On_Create_Checklist_Page;
	@FindBy(xpath = "//div[@class='img-box']//img[@alt='Add button']")private WebElement Add_Question_Icon_On_Create_Checklist_Page;
	@FindBy(xpath = "//a[@title='Add new Section']//img[@alt='Add']")private WebElement Add_New_Section_Icon_On_Create_Checklist_Page;
	@FindBy(xpath = "//div[contains(@class,'full-modal modal')]//div[@class='modal-footer']//span[.='Next']")private WebElement Next_Button_On_Create_Checklist_Page;
	@FindBy(xpath = "//span[normalize-space()='Create Checklist']")private WebElement Create_Checklist_Button_On_Checklist_Summery_Page;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement Ok_Button_On_Create_Checklist_Confirmation_Page;
	@FindBy(xpath = "//span[@title='November Checklist Of Bowling Asset']")private WebElement Dynamic_Name_On_Manage_Checklist_Page;
	@FindBy(xpath = "//span[normalize-space()='Edit Checklist']")private WebElement Edit_Checklist_Button_On_Manage_Checklist_Info_Page;
	@FindBy(xpath = "//span[normalize-space()='Manage Schedules']")private WebElement Manage_Schedule_Button;
	@FindBy(xpath = "//label[@for='8658check']")private WebElement Dynamic_Radio_Button_On_Manage_Schedule_Page;
	@FindBy(xpath = "//span[normalize-space()='Print QR Code']")private WebElement Print_QR_Code_Button_On_Manage_Schedule;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement Ok_Button_On_Schedule_QR_Not_Mandatory;
	@FindBy(xpath = "(//span[contains(text(), 'Redemption Audit')])[1]")private WebElement Dynamic_Schedule_Name_On_Manage_Schedule_Page;
	@FindBy(xpath = "//span[normalize-space()='Edit Schedule']")private WebElement Edit_Schedule_Button_On_Manage_Schedule_InfoPage;
	@FindBy(xpath ="//span[normalize-space()='Select Property']")private WebElement Filter_By_Property_On_Manage_Schedule_Page;
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement Filter_By_Property_SearchBox_On_Manage_Schedule_Page;
	@FindBy(xpath = "//a[normalize-space()='Xtreme Arcade & Bowling Zone']")private WebElement Filter_By_Dynamic_Property_Name_On_Manage_Schedule_Page;
	@FindBy(xpath = "//input[@placeholder='Schedule Name']")private WebElement Filter_By_Schdeule_Name__On_Manage_Schedule_Page;
	@FindBy(xpath = "//input[@placeholder='Checklist Name']")private WebElement Filter_By_Checklist_Name_On_Manage_Schedule_Page;
	@FindBy(xpath = "//span[normalize-space()='Select Assigned To']")private WebElement Filter_By_Assigned_To_On_Manage_Schedule_Page;
	@FindBy(xpath = "(//input[@id='custom'])[3]")private WebElement Filter_By_Assigned_To_SearchBox_On_Manage_Schedule_Page;
	@FindBy(xpath = "//a[normalize-space()='Abdulla']")private WebElement Filter_By_Dynamic_Assigned_To_Name_On_Manage_Schedule_Page;
	@FindBy(xpath = "//span[normalize-space()='Create Schedule']")private WebElement Create_Schedule_Button_On_Manage_Schedule_Page;
	@FindBy(xpath = "//select[@formcontrolname='property']")private WebElement Property_Dropdown_On_Create_Schedule_Page;
	@FindBy(xpath = "//select[@formcontrolname='inspection']")private WebElement Inspection_Dropdown_On_Create_Schedule_Page;
	@FindBy(xpath = "//select[@formcontrolname='location']")private WebElement Location_Dropdown_On_Create_Schedule_Page;
	@FindBy(xpath = "//input[@formcontrolname='name']")private WebElement Schedule_Name_TextBox_On_Create_Schedule_Page;
	@FindBy(xpath = "//label[@for='transferType']//span[@class='slider']")private WebElement Schedule_Is_ENdles_Slider_On_Create_Schedule_Page;
	@FindBy(xpath = "//select[@class='form-control ng-valid ng-touched ng-dirty']")private WebElement Select_Frequency_Dropdown_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[normalize-space()='Daily']")private WebElement Select_Daily_Frequency__On_Create_Schedule_Page;
	@FindBy(xpath = "//a[normalize-space()='Once']")private WebElement Select_Once_Frequency_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[normalize-space()='Monthly']")private WebElement Select_Monthly_Frequency_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[normalize-space()='Monthly']")private WebElement Select_Custom_Frequency_On_Create_Schedule_Page;
	@FindBy(xpath = "//input[@formcontrolname='frequencyNumber']")private WebElement Select_Response_Type_Frequency_TextField_On_Create_Schedule_Page;
	@FindBy(xpath = "//span[.='Select Measurement']")private WebElement Select_Measurement_Button_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[.='Day']")private WebElement Select_Day_Measurement_Button_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[.='Week']")private WebElement Select_Week_Measurement_Button_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[.='Month']")private WebElement Select_Month_Measurement_Button_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[.='Year']")private WebElement Select_Year_Measurement_Button_On_Create_Schedule_Page;
	@FindBy(xpath = "//a[.='Custom (Days)']")private WebElement Select_Custom_Days_Frequency_On_Create_Schedule_Page;
	@FindBy(xpath = "//label[normalize-space()='Monday']")private WebElement Select_Dynamic_Day_Custom_Days_Frequency_On_Create_Schedule_Page;
	@FindBy(xpath = "//label[normalize-space()='QR Scan Mandatory']")private WebElement QR_Scan_Mandatory_CheckBox_On_Create_Schedule_Page;
	@FindBy(xpath = "//label[@for='check111']")private WebElement Random_Mandatory_Photo_CheckBox_On_Create_Schedule_Page;
	@FindBy(xpath = "//form[@name='scheduleAdd']//div[@class='row']//button[@id='custom']")private WebElement Assignee_Dropdown_On_Create_Schedule_Page;
	@FindBy(xpath = "//label[@for='transferType2']//span[@class='slider']")private WebElement Reminder_Slider_On_Create_Schedule_Page;
	@FindBy(xpath = "//select[@formcontrolname='reminderTime']")private WebElement Remind_Time_dropdown_On_Create_Schedule_Page;
	@FindBy(xpath = "//span[normalize-space()='Create Schedule']")private WebElement Create_Schedule_Button_On_Create_Schedule_Page;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement Ok_Button_On_Create_Schedule_Confirmation_Page;
	@FindBy(xpath = "//span[normalize-space()='Back']")private WebElement  Back_Button;
	@FindBy(xpath = "//button[@class='button btn-primary ']//span[.='Update Checklist']")private WebElement UpDateChecklistButton_OnChecklistSummeryPage;
//	@FindBy(className = "form-control ng-pristine ng-valid ng-touched")private WebElement SelectFrequencyDropdown;
	@FindBy(xpath = "//select[@formcontrolname='selectFrequency']")private WebElement FrequencyDropdown;
	@FindBy(xpath = "//button[@class='button btn-primary']//span[.='Update Schedule']")private WebElement UpdateScheduleButton_OnEditSchdulePage;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement OkButton_OnSchedule_details_updated_successfully;
	@FindBy(xpath = "//ul[@class='row']//button[@id='custom']")private WebElement AssetDropdownOn_CreateSchedulePage;
	@FindBy(xpath = "//input[@placeholder='HH:MM']")private WebElement ChecklistDueTime;
	@FindBy(xpath = "//button[@aria-label='Add a hour']")private WebElement AddHourIcon_InChecklistDueTime;
	@FindBy(xpath = "//button[@aria-label='Minus a hour']")private WebElement MinusHourIcon_InChecklistDueTime;
	@FindBy(xpath = "//button[@aria-label='Add a minute']")private WebElement AddMinuteIcon_InChecklistDueTime;
	@FindBy(xpath = "//button[@aria-label='Minus a minute']")private WebElement MinusMinuteIcon_InChecklistDueTime;
	@FindBy(xpath = "//span[normalize-space()='Set']")private WebElement SetButton_InChecklistDueTime;
	@FindBy(xpath = "//span[@class='owl-dt-control-content owl-dt-control-button-content'][normalize-space()='Cancel']")private WebElement CancelButton_InChecklistDueTime;
	@FindBy(xpath = "(//input[@class='owl-dt-timer-input'])[1]")private WebElement HourInboxField;
	@FindBy(xpath = "(//input[@class='owl-dt-timer-input'])[2]")private WebElement MinuteInboxField;
	@FindBy(xpath = "//label[@for='check1111']")private WebElement NotifyIfNotCompletedOnTime_Checkbox;
	@FindBy(xpath = "//select[@formcontrolname='notifyUser']")private WebElement UsersDropdown_OnNotifyIfNotCompletedOnTime;
	@FindBy(xpath = "//input[@placeholder=\"Frequency (Days)\"]")private WebElement FrequencyTextField;
	@FindBy(xpath = "//select[@formcontrolname='frequencyUnit']")private WebElement SelectMeasurementDropdown;
	@FindBy(xpath = "//input[@placeholder='Enter Custom Date']")private WebElement EnterCustomDateCalendar;
	@FindBy(xpath = "//label[@for='check12']")private WebElement MonDayCheckbox;
	@FindBy(xpath = "//label[@for='check13']")private WebElement TuesdayCheckbox;
	@FindBy(xpath = "//label[@for='check14']")private WebElement WenesdayCheckbox;
	@FindBy(xpath = "//label[@for='check15']")private WebElement ThrusdayCheckbox;
	@FindBy(xpath = "//label[@for='check16']")private WebElement FridayCheckbox;
	@FindBy(xpath = "//label[@for='check17']")private WebElement SaturdayCheckbox;
	@FindBy(xpath = "//label[@for='check18']")private WebElement SundayCheckbox;
	@FindBy(xpath = "//div[@class='filter-button']//li[1]//button[1]")private WebElement FilterByAsset;
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement FilterByAssetSearchBox;
	@FindBy(xpath = "//span[.='Select User']")private WebElement FilterByUser;
	@FindBy(xpath = "(//input[@id='custom'])[3]")private WebElement FilterByUserSearchBox_OnTodays;
	@FindBy(xpath = "(//input[@id='custom'])[5]")private WebElement FilterByUserSearchBox_OnPrevious;
	@FindBy(xpath = "(//input[@id='custom'])[3]")private WebElement FilterByUserSearchBox_OnUpcoming;
	@FindBy(xpath = "//span[.='Filter']")private WebElement FilterButton_OnPrevious;
	
	public WebElement getFilterButton_OnPrevious() {
		return FilterButton_OnPrevious;
	}
	public WebElement getFilterByAsset() {
		return FilterByAsset;
	}
	public WebElement getFilterByAssetSearchBox() {
		return FilterByAssetSearchBox;
	}
	public WebElement getFilterByUser() {
		return FilterByUser;
	}
	public WebElement getFilterByUserSearchBox_OnTodays() {
		return FilterByUserSearchBox_OnTodays;
	}
	public WebElement getFilterByUserSearchBox_OnPrevious() {
		return FilterByUserSearchBox_OnPrevious;
	}
	public WebElement getFilterByUserSearchBox_OnUpcoming() {
		return FilterByUserSearchBox_OnUpcoming;
	}
	public WebElement getMonDayCheckbox() {
		return MonDayCheckbox;
	}
	public WebElement getTuesdayCheckbox() {
		return TuesdayCheckbox;
	}
	public WebElement getWenesdayCheckbox() {
		return WenesdayCheckbox;
	}
	public WebElement getThrusdayCheckbox() {
		return ThrusdayCheckbox;
	}
	public WebElement getFridayCheckbox() {
		return FridayCheckbox;
	}
	public WebElement getSaturdayCheckbox() {
		return SaturdayCheckbox;
	}
	public WebElement getSundayCheckbox() {
		return SundayCheckbox;
	}
	public WebElement getEnterCustomDateCalendar() {
		return EnterCustomDateCalendar;
	}
	public WebElement getNotifyIfNotCompletedOnTime_Checkbox() {
		return NotifyIfNotCompletedOnTime_Checkbox;
	}
	public WebElement getFrequencyTextField() {
		return FrequencyTextField;
	}
	public WebElement getSelectMeasurementDropdown() {
		return SelectMeasurementDropdown;
	}
	public WebElement getUsersDropdown_OnNotifyIfNotCompletedOnTime() {
		return UsersDropdown_OnNotifyIfNotCompletedOnTime;
	}
	public WebElement getHourInboxField() {
		return HourInboxField;
	}
	public WebElement getMinuteInboxField() {
		return MinuteInboxField;
	}
	public WebElement getChecklistDueTime() {
		return ChecklistDueTime;
	}
	public WebElement getAddHourIcon_InChecklistDueTime() {
		return AddHourIcon_InChecklistDueTime;
	}
	public WebElement getMinusHourIcon_InChecklistDueTime() {
		return MinusHourIcon_InChecklistDueTime;
	}
	public WebElement getAddMinuteIcon_InChecklistDueTime() {
		return AddMinuteIcon_InChecklistDueTime;
	}
	public WebElement getMinusMinuteIcon_InChecklistDueTime() {
		return MinusMinuteIcon_InChecklistDueTime;
	}
	public WebElement getSetButton_InChecklistDueTime() {
		return SetButton_InChecklistDueTime;
	}
	public WebElement getCancelButton_InChecklistDueTime() {
		return CancelButton_InChecklistDueTime;
	}
	public WebElement getAssetDropdownOn_CreateSchedulePage() {
		return AssetDropdownOn_CreateSchedulePage;
	}
	public WebElement getOkButton_OnSchedule_details_updated_successfully() {
		return OkButton_OnSchedule_details_updated_successfully;
	}
	public WebElement getUpdateScheduleButton_OnEditSchdulePage() {
		return UpdateScheduleButton_OnEditSchdulePage;
	}
	public WebElement getFrequencyDropdown() {
		return FrequencyDropdown;
	}
	public WebElement getUpDateChecklistButton_OnChecklistSummeryPage() {
		return UpDateChecklistButton_OnChecklistSummeryPage;
	}
	public WebElement getAddButtonOnChecklistPage() {
		return AddButtonOnChecklistPage;
	}
	public WebElement getSingleLinkText() {
		return SingleLinkText;
	}
	public WebElement getBulkOption() {
		return BulkOption;
	}
	public WebElement getDownloadBulkchecklistLinkText() {
		return DownloadBulkchecklistLinkText;
	}

	@FindBy(xpath = "//ul[@class='reports-block']//button[@id='custom']")private WebElement AddButtonOnChecklistPage;
	@FindBy(xpath = "//a[normalize-space()='Single']") private WebElement SingleLinkText;
	@FindBy(xpath = "//ul[@class='reports-block']//a[@id='custom']")private WebElement BulkOption;
	@FindBy(xpath = "//span[normalize-space()='Download Bulk Checklist Template']")private WebElement DownloadBulkchecklistLinkText;
	
	//Getters Methods
	public WebElement getPrevious_Button() {
		return Previous_Button;
	}
	public WebElement getToday_Button() {
		return Today_Button;
	}
	public WebElement getDynamic_Radio_Button_Schedule_Name() {
		return Dynamic_Radio_Button_Schedule_Name;
	}
	public WebElement getDownload_PDF_Button() {
		return Download_PDF_Button;
	}
	public WebElement getEmail_Button() {
		return Email_Button;
	}
	public WebElement getEmail_Address_TextField() {
		return Email_Address_TextField;
	}
	public WebElement getSend_Button_On_Email() {
		return Send_Button_On_Email;
	}
	public WebElement getOk_Button_On_Email_ConfirmationPage() {
		return Ok_Button_On_Email_ConfirmationPage;
	}
	public WebElement getCancel_Button_On_Email() {
		return Cancel_Button_On_Email;
	}
	public WebElement getFilter_Icon() {
		return Filter_Icon;
	}
	public WebElement getFilter_By_Property() {
		return Filter_By_Property;
	}
	public WebElement getFilter_By_Property_SearchBox() {
		return Filter_By_Property_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_Property_Name() {
		return Filter_By_Dynamic_Property_Name;
	}
	public WebElement getFilter_By_Schedule_Name() {
		return Filter_By_Schedule_Name;
	}
	public WebElement getFilter_By_Select_User_Button() {
		return Filter_By_Select_User_Button;
	}
	public WebElement getFilter_By_Select_User_SearchBox() {
		return Filter_By_Select_User_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_User() {
		return Filter_By_Dynamic_User;
	}
	public WebElement getFilter_By_Apply_Button() {
		return Filter_By_Apply_Button;
	}
	public WebElement getFilter_By_Clear_Button() {
		return Filter_By_Clear_Button;
	}
	public WebElement getFilter_By_Dynamic_Schedule_Name() {
		return Filter_By_Dynamic_Schedule_Name;
	}
	public WebElement getRaise_Ticket_Icon_On_Info_Page() {
		return Raise_Ticket_Icon_On_Info_Page;
	}
	public WebElement getClose_Button_On_InfoPage() {
		return Close_Button_On_InfoPage;
	}
	public WebElement getManage_Checklist_Button() {
		return Manage_Checklist_Button;
	}
	public WebElement getDynamic_Radio_Button_Name_On_Checklist_Page() {
		return Dynamic_Radio_Button_Name_On_Checklist_Page;
	}
	public WebElement getDuplicate_To_Another_Property_Button() {
		return Duplicate_To_Another_Property_Button;
	}
	public WebElement getChecklist_Name_TextField_On_Duplicate_Checklist_Page() {
		return Checklist_Name_TextField_On_Duplicate_Checklist_Page;
	}
	public WebElement getDeparment_Dropdown_On_Duplicate_Checklist_Page() {
		return Deparment_Dropdown_On_Duplicate_Checklist_Page;
	}
	public WebElement getDuplicate_On_Duplicate_Checklist_Page() {
		return Duplicate_On_Duplicate_Checklist_Page;
	}
	public WebElement getCancel_On_Duplicate_Checklist_Page() {
		return Cancel_On_Duplicate_Checklist_Page;
	}
	public WebElement getInactive_Button_On_Manage_Checklist_Page() {
		return Inactive_Button_On_Manage_Checklist_Page;
	}
	public WebElement getActive_Button_On_Manage_Checklist_Page() {
		return Active_Button_On_Manage_Checklist_Page;
	}
	public WebElement getFilter_By_Checklist_Name_On_Manage_Checklist_Page() {
		return Filter_By_Checklist_Name_On_Manage_Checklist_Page;
	}
	public WebElement getFilter_by_Department_Dropdown_On_Manage_Checklist_Page() {
		return Filter_by_Department_Dropdown_On_Manage_Checklist_Page;
	}
	public WebElement getFilter_by_Department_SearchBox_On_Manage_Checklist_Page() {
		return Filter_by_Department_SearchBox_On_Manage_Checklist_Page;
	}
	public WebElement getFilter_by_Dynamic_Department_name_On_Manage_Checklist_Page() {
		return Filter_by_Dynamic_Department_name_On_Manage_Checklist_Page;
	}
	public WebElement getCreate_Checklist_Button_On_Manage_Checklist_Page() {
		return Create_Checklist_Button_On_Manage_Checklist_Page;
	}
	public WebElement getCheckList_Name_On_Create_Checklist_Page() {
		return CheckList_Name_On_Create_Checklist_Page;
	}
	public WebElement getProperty_Dropdown_On_Create_Checklist_Page() {
		return Property_Dropdown_On_Create_Checklist_Page;
	}
	public WebElement getDepartment_Dropdown_On_Create_Checklist_Page() {
		return Department_Dropdown_On_Create_Checklist_Page;
	}
	public WebElement getSection_Name_TextBox_On_Create_Checklist_Page() {
		return Section_Name_TextBox_On_Create_Checklist_Page;
	}
	public WebElement getQuestion_Name_TextBox_On_Create_Checklist_Page() {
		return Question_Name_TextBox_On_Create_Checklist_Page;
	}
	public WebElement getSelect_Response_On_Create_Checklist_Page() {
		return Select_Response_On_Create_Checklist_Page;
	}
	public WebElement getSelect_Response_TextField_On_Create_Checklist_Page() {
		return Select_Response_TextField_On_Create_Checklist_Page;
	}
	public WebElement getSelect_Response_Digital_Signature_On_Create_Checklist_Page() {
		return Select_Response_Digital_Signature_On_Create_Checklist_Page;
	}
	public WebElement getSelect_Response_Multiple_Choice_On_Create_Checklist_Page() {
		return Select_Response_Multiple_Choice_On_Create_Checklist_Page;
	}
	public WebElement getDescription_CheckBox_On_Create_Checklist_Page() {
		return Description_CheckBox_On_Create_Checklist_Page;
	}
	public WebElement getDescription_TextBox_On_Create_Checklist_Page() {
		return Description_TextBox_On_Create_Checklist_Page;
	}
	public WebElement getAdd_Question_Icon_On_Create_Checklist_Page() {
		return Add_Question_Icon_On_Create_Checklist_Page;
	}
	public WebElement getAdd_New_Section_Icon_On_Create_Checklist_Page() {
		return Add_New_Section_Icon_On_Create_Checklist_Page;
	}
	public WebElement getNext_Button_On_Create_Checklist_Page() {
		return Next_Button_On_Create_Checklist_Page;
	}
	public WebElement getCreate_Checklist_Button_On_Checklist_Summery_Page() {
		return Create_Checklist_Button_On_Checklist_Summery_Page;
	}
	public WebElement getOk_Button_On_Create_Checklist_Confirmation_Page() {
		return Ok_Button_On_Create_Checklist_Confirmation_Page;
	}
	public WebElement getDynamic_Name_On_Manage_Checklist_Page() {
		return Dynamic_Name_On_Manage_Checklist_Page;
	}
	public WebElement getEdit_Checklist_Button_On_Manage_Checklist_Info_Page() {
		return Edit_Checklist_Button_On_Manage_Checklist_Info_Page;
	}
	public WebElement getManage_Schedule_Button() {
		return Manage_Schedule_Button;
	}
	public WebElement getDynamic_Radio_Button_On_Manage_Schedule_Page() {
		return Dynamic_Radio_Button_On_Manage_Schedule_Page;
	}
	public WebElement getPrint_QR_Code_Button_On_Manage_Schedule() {
		return Print_QR_Code_Button_On_Manage_Schedule;
	}
	public WebElement getOk_Button_On_Schedule_QR_Not_Mandatory() {
		return Ok_Button_On_Schedule_QR_Not_Mandatory;
	}
	public WebElement getDynamic_Schedule_Name_On_Manage_Schedule_Page() {
		return Dynamic_Schedule_Name_On_Manage_Schedule_Page;
	}
	public WebElement getEdit_Schedule_Button_On_Manage_Schedule_InfoPage() {
		return Edit_Schedule_Button_On_Manage_Schedule_InfoPage;
	}
	public WebElement getFilter_By_Property_On_Manage_Schedule_Page() {
		return Filter_By_Property_On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Property_SearchBox_On_Manage_Schedule_Page() {
		return Filter_By_Property_SearchBox_On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Dynamic_Property_Name_On_Manage_Schedule_Page() {
		return Filter_By_Dynamic_Property_Name_On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Schdeule_Name__On_Manage_Schedule_Page() {
		return Filter_By_Schdeule_Name__On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Checklist_Name_On_Manage_Schedule_Page() {
		return Filter_By_Checklist_Name_On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Assigned_To_On_Manage_Schedule_Page() {
		return Filter_By_Assigned_To_On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Assigned_To_SearchBox_On_Manage_Schedule_Page() {
		return Filter_By_Assigned_To_SearchBox_On_Manage_Schedule_Page;
	}
	public WebElement getFilter_By_Dynamic_Assigned_To_Name_On_Manage_Schedule_Page() {
		return Filter_By_Dynamic_Assigned_To_Name_On_Manage_Schedule_Page;
	}
	public WebElement getCreate_Schedule_Button_On_Manage_Schedule_Page() {
		return Create_Schedule_Button_On_Manage_Schedule_Page;
	}
	public WebElement getProperty_Dropdown_On_Create_Schedule_Page() {
		return Property_Dropdown_On_Create_Schedule_Page;
	}
	public WebElement getInspection_Dropdown_On_Create_Schedule_Page() {
		return Inspection_Dropdown_On_Create_Schedule_Page;
	}
	public WebElement getLocation_Dropdown_On_Create_Schedule_Page() {
		return Location_Dropdown_On_Create_Schedule_Page;
	}
	public WebElement getSchedule_Name_TextBox_On_Create_Schedule_Page() {
		return Schedule_Name_TextBox_On_Create_Schedule_Page;
	}
	public WebElement getSchedule_Is_ENdles_Slider_On_Create_Schedule_Page() {
		return Schedule_Is_ENdles_Slider_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Frequency_Dropdown_On_Create_Schedule_Page() {
		return Select_Frequency_Dropdown_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Daily_Frequency__On_Create_Schedule_Page() {
		return Select_Daily_Frequency__On_Create_Schedule_Page;
	}
	public WebElement getSelect_Once_Frequency_On_Create_Schedule_Page() {
		return Select_Once_Frequency_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Monthly_Frequency_On_Create_Schedule_Page() {
		return Select_Monthly_Frequency_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Custom_Frequency_On_Create_Schedule_Page() {
		return Select_Custom_Frequency_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Response_Type_Frequency_TextField_On_Create_Schedule_Page() {
		return Select_Response_Type_Frequency_TextField_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Measurement_Button_On_Create_Schedule_Page() {
		return Select_Measurement_Button_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Day_Measurement_Button_On_Create_Schedule_Page() {
		return Select_Day_Measurement_Button_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Week_Measurement_Button_On_Create_Schedule_Page() {
		return Select_Week_Measurement_Button_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Month_Measurement_Button_On_Create_Schedule_Page() {
		return Select_Month_Measurement_Button_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Year_Measurement_Button_On_Create_Schedule_Page() {
		return Select_Year_Measurement_Button_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Custom_Days_Frequency_On_Create_Schedule_Page() {
		return Select_Custom_Days_Frequency_On_Create_Schedule_Page;
	}
	public WebElement getSelect_Dynamic_Day_Custom_Days_Frequency_On_Create_Schedule_Page() {
		return Select_Dynamic_Day_Custom_Days_Frequency_On_Create_Schedule_Page;
	}
	public WebElement getQR_Scan_Mandatory_CheckBox_On_Create_Schedule_Page() {
		return QR_Scan_Mandatory_CheckBox_On_Create_Schedule_Page;
	}
	public WebElement getRandom_Mandatory_Photo_CheckBox_On_Create_Schedule_Page() {
		return Random_Mandatory_Photo_CheckBox_On_Create_Schedule_Page;
	}
	public WebElement getAssignee_Dropdown_On_Create_Schedule_Page() {
		return Assignee_Dropdown_On_Create_Schedule_Page;
	}
	public WebElement getReminder_Slider_On_Create_Schedule_Page() {
		return Reminder_Slider_On_Create_Schedule_Page;
	}
	public WebElement getRemind_Time_dropdown_On_Create_Schedule_Page() {
		return Remind_Time_dropdown_On_Create_Schedule_Page;
	}
	public WebElement getCreate_Schedule_Button_On_Create_Schedule_Page() {
		return Create_Schedule_Button_On_Create_Schedule_Page;
	}
	public WebElement getOk_Button_On_Create_Schedule_Confirmation_Page() {
		return Ok_Button_On_Create_Schedule_Confirmation_Page;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}
	
	
	//Business Logic
	public void ClickOn_Previous_Button()
	{
		Previous_Button.click();
	}
	public void ClickOn_Today_Button()
	{
		Today_Button.click();
	}
	public void ClickOn_Dynamic_Radio_Button_Schedule_Name()
	{
		Dynamic_Radio_Button_Schedule_Name.click();
	}
	public void ClickOn_Download_PDF_Button()
	{
		Download_PDF_Button.click();
	}
	public void ClickOn_Email_Button()
	{
		Email_Button.click();
	}
	public void ClickOn_Email_Address_TextField(String Enter_Email)
	{
		Email_Address_TextField.sendKeys(Enter_Email);
	}
	public void ClickOn_Send_Button_On_Email()
	{
		Send_Button_On_Email.click();
	}
	public void ClickOn_Ok_Button_On_Email_ConfirmationPage()
	{
		Ok_Button_On_Email_ConfirmationPage.click();
	}
	public void clickOn_Cancel_Button_On_Email()
	{
		Cancel_Button_On_Email.click();
	}
	public void ClickOn_Filter_Icon()
	{
		Filter_Icon.click();
	}
	public void ClickOn_Filter_By_Property()
	{
		Filter_By_Property.click();
	}
	public void ClickOn_Filter_By_Property_SearchBox(String Search_Property)
	{
		Filter_By_Property_SearchBox.sendKeys(Search_Property);
	}
	
	public void ClickOn_Filter_By_Dynamic_Property_Name()
	{
		Filter_By_Dynamic_Property_Name.click();
	}
	public void clickOn_Filter_By_Schedule_Name(String Schedule_Name)
	{
		Filter_By_Schedule_Name.sendKeys(Schedule_Name);
	}
	public void ClickOn_Filter_By_Select_User_Button()
	{
		Filter_By_Select_User_Button.click();
	}
	public void ClickOn_Filter_By_Select_User_SearchBox(String Search_Assgined_User)
	{
		Filter_By_Select_User_SearchBox.sendKeys(Search_Assgined_User);
	}
	public void ClickOn_Filter_By_Dynamic_User()
	{
		Filter_By_Dynamic_User.click();
	}
	public void ClickOn_Filter_By_Apply_Button()
	{
		Filter_By_Apply_Button.click();
	}
	public void ClickOn_Filter_By_Clear_Button()
	{
		Filter_By_Clear_Button.click();
	}
	public void ClickOn_Raise_Ticket_Icon_On_Info_Page()
	{
		Raise_Ticket_Icon_On_Info_Page.click();
	}
	public void ClickOn_Close_Button_On_InfoPage()
	{
		Close_Button_On_InfoPage.click();
	}
	public void ClickOn_Manage_Checklist_Button()
	{
		Manage_Checklist_Button.click();
	}
	public void ClickOn_Dynamic_Radio_Button_Name_On_Checklist_Page()
	{
		Dynamic_Radio_Button_Name_On_Checklist_Page.click();
	}
	public void ClickOn_Duplicate_To_Another_Property_Button()
	{
		Duplicate_To_Another_Property_Button.click();
	}
	public void ClickOn_Checklist_Name_TextField_On_Duplicate_Checklist_Page(String CheckList_Name)
	{
		Checklist_Name_TextField_On_Duplicate_Checklist_Page.sendKeys(CheckList_Name);
	}
	public void ClickOn_Deparment_Dropdown_On_Duplicate_Checklist_Page(String Text)
	{
		Select sel=new Select(Deparment_Dropdown_On_Duplicate_Checklist_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Duplicate_On_Duplicate_Checklist_Page()
	{
		Duplicate_On_Duplicate_Checklist_Page.click();
	}
	public void ClickOn_Cancel_On_Duplicate_Checklist_Page()
	{
		Cancel_On_Duplicate_Checklist_Page.click();
	}
	public void ClickOn_Inactive_Button_On_Manage_Checklist_Page()
	{
		Inactive_Button_On_Manage_Checklist_Page.click();
		
	}
	public void ClickOn_Active_Button_On_Manage_Checklist_Page()
	{
		Active_Button_On_Manage_Checklist_Page.click();
	}
	public void CLickOn_Filter_By_Checklist_Name_On_Manage_Checklist_Page(String Checklist_Name)
	{
		Filter_By_Checklist_Name_On_Manage_Checklist_Page.sendKeys(Checklist_Name);
	}
	public void ClickOn_Filter_by_Department_Dropdown_On_Manage_Checklist_Page()
	{
		Filter_by_Department_Dropdown_On_Manage_Checklist_Page.click();
	}
	public void ClickOn_Filter_by_Department_SearchBox_On_Manage_Checklist_Page(String Search_Department)
	{
		Filter_by_Department_SearchBox_On_Manage_Checklist_Page.sendKeys(Search_Department);
	}
	public void ClickOn_Filter_by_Dynamic_Department_name_On_Manage_Checklist_Page()
	{
		Filter_by_Dynamic_Department_name_On_Manage_Checklist_Page.click();
	}
	public void CLickOn_Create_Checklist_Button_On_Manage_Checklist_Page()
	{
		Create_Checklist_Button_On_Manage_Checklist_Page.click();
	}
	public void CLickOn_CheckList_Name_On_Create_Checklist_Page(String Checklist_Name)
	{
		CheckList_Name_On_Create_Checklist_Page.sendKeys(Checklist_Name);
	}
//	public void VisibilityOfCheckList_Name_On_Create_Checklist_Page(WebDriver driver)
//	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement todaysDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CheckList_Name_On_Create_Checklist_Page)));
////		CheckList_Name_On_Create_Checklist_Page
//	}
//	public void ClearChecklistName()
//	{
//		CheckList_Name_On_Create_Checklist_Page.click();
//		
//	}
	public void ClickOn_Property_Dropdown_On_Create_Checklist_Page_By_VisibleText(String Text)
	{
		Select sel=new Select(Property_Dropdown_On_Create_Checklist_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Department_Dropdown_On_Create_Checklist_Page(String Text)
	{
		Select sel=new Select(Department_Dropdown_On_Create_Checklist_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickON_Section_Name_TextBox_On_Create_Checklist_Page(String Enter_Section_Name)
	{
		Section_Name_TextBox_On_Create_Checklist_Page.sendKeys(Enter_Section_Name);
	}
	public void ClickOn_Question_Name_TextBox_On_Create_Checklist_Page(String Enter_Question)
	{
		Question_Name_TextBox_On_Create_Checklist_Page.sendKeys(Enter_Question);
	}
	public void ClickOn_Select_Response_On_Create_Checklist_Page()
	{
		Select_Response_On_Create_Checklist_Page.click();
	}
	public void Clickon_Select_Response_TextField_On_Create_Checklist_Page()
	{
		Select_Response_TextField_On_Create_Checklist_Page.click();
	}
	public void ClickOn_Select_Response_Digital_Signature_On_Create_Checklist_Page()
	{
		Select_Response_Digital_Signature_On_Create_Checklist_Page.click();
	}
	public void ClickOn_Select_Response_Multiple_Choice_On_Create_Checklist_Page()
	{
		Select_Response_Multiple_Choice_On_Create_Checklist_Page.click();
	}
	public void ClickOn_Description_CheckBox_On_Create_Checklist_Page()
	{
		Description_CheckBox_On_Create_Checklist_Page.click();
	}
	public void ClickOn_Description_TextBox_On_Create_Checklist_Page(String Description)
	{
		Description_TextBox_On_Create_Checklist_Page.sendKeys(Description);
	}
	public void ClickOn_Add_Question_Icon_On_Create_Checklist_Page()
	{
		Add_Question_Icon_On_Create_Checklist_Page.click();
	}
	public void ClickOn_Add_New_Section_Icon_On_Create_Checklist_Page()
	{
		Add_New_Section_Icon_On_Create_Checklist_Page.click();
		
	}
	public void ClickOn_Next_Button_On_Create_Checklist_Page()
	{
		Next_Button_On_Create_Checklist_Page.click();
	}
	public void ClickOn_Create_Checklist_Button_On_Checklist_Summery_Page()
	{
		Create_Checklist_Button_On_Checklist_Summery_Page.click();
	}
	public void CLiCKOn_Ok_Button_On_Create_Checklist_Confirmation_Page()
	{
		Ok_Button_On_Create_Checklist_Confirmation_Page.click();
	}
	public void ClickOn_Dynamic_Name_On_Manage_Checklist_Page()
	{
		Dynamic_Name_On_Manage_Checklist_Page.click();
	}
	public void CLickOn_Edit_Checklist_Button_On_Manage_Checklist_Info_Page()
	{
		Edit_Checklist_Button_On_Manage_Checklist_Info_Page.click();
	}
	public void ClickOn_Manage_Schedule_Button()
	{
		Manage_Schedule_Button.click();
	}
	public void ClickOn_Dynamic_Radio_Button_On_Manage_Schedule_Page()
	{
		Dynamic_Radio_Button_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Print_QR_Code_Button_On_Manage_Schedule()
	{
		Print_QR_Code_Button_On_Manage_Schedule.click();
	}
	public void ClickOn_Ok_Button_On_Schedule_QR_Not_Mandatory()
	{
		Ok_Button_On_Schedule_QR_Not_Mandatory.click();
	}
	public void ClickOn_Dynamic_Schedule_Name_On_Manage_Schedule_Page()
	{
		Dynamic_Schedule_Name_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Edit_Schedule_Button_On_Manage_Schedule_InfoPage()
	{
		Edit_Schedule_Button_On_Manage_Schedule_InfoPage.click();
	}
	public void ClickOn_Filter_By_Property_On_Manage_Schedule_Page()
	{
		Filter_By_Property_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Filter_By_Property_SearchBox_On_Manage_Schedule_Page(String Search_Property)
	{
		Filter_By_Property_SearchBox_On_Manage_Schedule_Page.sendKeys(Search_Property);
	}
	public void ClickOn_Filter_By_Dynamic_Property_Name_On_Manage_Schedule_Page()
	{
		Filter_By_Dynamic_Property_Name_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Filter_By_Schdeule_Name__On_Manage_Schedule_Page(String Schedule_name)
	{
		Filter_By_Schdeule_Name__On_Manage_Schedule_Page.sendKeys(Schedule_name);
	}
	public void ClickOn_Filter_By_Checklist_Name_On_Manage_Schedule_Page(String Checklist_Name)
	{
		Filter_By_Checklist_Name_On_Manage_Schedule_Page.sendKeys(Checklist_Name);
	}
	public void ClickOn_Filter_By_Assigned_To_On_Manage_Schedule_Page()
	{
		Filter_By_Assigned_To_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Filter_By_Assigned_To_SearchBox_On_Manage_Schedule_Page(String Search_Assigned_To)
	{
		Filter_By_Assigned_To_SearchBox_On_Manage_Schedule_Page.sendKeys(Search_Assigned_To);
	}
	public void ClickOn_Filter_By_Dynamic_Assigned_To_Name_On_Manage_Schedule_Page()
	{
		Filter_By_Dynamic_Assigned_To_Name_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Create_Schedule_Button_On_Manage_Schedule_Page()
	{
		Create_Schedule_Button_On_Manage_Schedule_Page.click();
	}
	public void ClickOn_Property_Dropdown_On_Create_Schedule_Page(String Text)
	{
		Select sel=new Select(Property_Dropdown_On_Create_Schedule_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Inspection_Dropdown_On_Create_Schedule_Page(String Text)
	{
		Select sel=new Select(Inspection_Dropdown_On_Create_Schedule_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Location_Dropdown_On_Create_Schedule_Page(String Text)
	{
		Select sel=new Select(Location_Dropdown_On_Create_Schedule_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickON_Schedule_Name_TextBox_On_Create_Schedule_Page(String Schedule_Name)
	{
		Schedule_Name_TextBox_On_Create_Schedule_Page.sendKeys(Schedule_Name);
	}
	public void Clear_Schedule_Name_TextBox_On_Create_Schedule_Page(WebDriver driver) throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.BackSpaceMethod("//input[@formcontrolname='name']", driver);
	}
	public void ClickOn_Schedule_Is_ENdles_Slider_On_Create_Schedule_Page()
	{
		Schedule_Is_ENdles_Slider_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Select_Frequency_Dropdown_On_Create_Schedule_Page(String Text)
	{
		Select sel = new Select(Select_Day_Measurement_Button_On_Create_Schedule_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Daily_Frequency__On_Create_Schedule_Page()
	{
		Select_Daily_Frequency__On_Create_Schedule_Page.click();
	}
	public void ClickOn_Select_Once_Frequency_On_Create_Schedule_Page()
	{
		Select_Once_Frequency_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Select_Monthly_Frequency_On_Create_Schedule_Page()
	{
		Select_Monthly_Frequency_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Select_Custom_Frequency_On_Create_Schedule_Page()
	{
		Select_Custom_Frequency_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Select_Response_Type_Frequency_TextField_On_Create_Schedule_Page(String Response_Type_Frequency)
	{
		Select_Response_Type_Frequency_TextField_On_Create_Schedule_Page.sendKeys(Response_Type_Frequency);
	}
	public void ClickOn_Select_Measurement_Button_On_Create_Schedule_Page()
	{
		Select_Measurement_Button_On_Create_Schedule_Page.click();
	}
//	public void ClickOn_Select_Day_Measurement_Button_On_Create_Schedule_Page()
//	{
//		Select_Day_Measurement_Button_On_Create_Schedule_Page.click();
//	}
	public void Select_Frequency_Dropdown_On_Create_Schedule_Page(String Text)
	{
		Select sel = new Select(Select_Frequency_Dropdown_On_Create_Schedule_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Week_Measurement_Button_On_Create_Schedule_Page()
	{
		Select_Week_Measurement_Button_On_Create_Schedule_Page.click();
	}
	public void ClickON_Select_Month_Measurement_Button_On_Create_Schedule_Page()
	{
		Select_Month_Measurement_Button_On_Create_Schedule_Page.click();
	}
	public void ClickON_Select_Year_Measurement_Button_On_Create_Schedule_Page()
	{
		Select_Year_Measurement_Button_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Select_Custom_Days_Frequency_On_Create_Schedule_Page()
	{
		Select_Custom_Days_Frequency_On_Create_Schedule_Page.click();
	}
	public void CLickOn_Select_Dynamic_Day_Custom_Days_Frequency_On_Create_Schedule_Page()
	{
		Select_Dynamic_Day_Custom_Days_Frequency_On_Create_Schedule_Page.click();
	}
	public void ClickOn_QR_Scan_Mandatory_CheckBox_On_Create_Schedule_Page()
	{
		QR_Scan_Mandatory_CheckBox_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Random_Mandatory_Photo_CheckBox_On_Create_Schedule_Page()
	{
		Random_Mandatory_Photo_CheckBox_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Assignee_Dropdown_On_Create_Schedule_Page()
	{
		Assignee_Dropdown_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Reminder_Slider_On_Create_Schedule_Page()
	{
		Reminder_Slider_On_Create_Schedule_Page.click();
	}
	public void ClickON_Remind_Time_dropdown_On_Create_Schedule_Page(String Text)
	{
		Select sel=new Select(Remind_Time_dropdown_On_Create_Schedule_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickON_Create_Schedule_Button_On_Create_Schedule_Page()
	{
		Create_Schedule_Button_On_Create_Schedule_Page.click();
	}
	public void ClickOn_Ok_Button_On_Create_Schedule_Confirmation_Page()
	{
		Ok_Button_On_Create_Schedule_Confirmation_Page.click();
	}
	public void ClickOn_Back_Button()
	{
		Back_Button.click();
	}
	public void ClickOn_AddButtonOnChecklistPage()
	{
		AddButtonOnChecklistPage.click();
	}
	public void ClickOn_SingleLinkText()
	{
		SingleLinkText.click();
	}
	public void ClickOn_BulkOption()
	{
		BulkOption.click();
	}
	public void CLickOn_DownloadBulkchecklistLinkText()
	{
		DownloadBulkchecklistLinkText.click();
	}
	public void ClickOn_UpDateChecklistButton_OnChecklistSummeryPage()
	{
		UpDateChecklistButton_OnChecklistSummeryPage.click();
	}
	public void selectTodayDate_OnStartDateOnCreateSchedule(WebDriver driver) throws InterruptedException {
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
	
	public void End_Date_OnCreateSchedulePage(WebDriver driver) throws Throwable {
		// Click on the End Date input field to open the date picker
		LocalDate today = LocalDate.now();
		LocalDate endDate = today.plusDays(3);

		String targetMonthYear = endDate.format(DateTimeFormatter.ofPattern("MMM-yyyy"));
		String targetDay = String.valueOf(endDate.getDayOfMonth());

		System.out.println("Target Day: " +targetDay);
		System.out.println("Target Month-Year: " + targetMonthYear);

		// Click on the End Date input field to open the date picker
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement endDateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter End Date']")));
		endDateInput.click();

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

		driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
		System.out.println("Day " + targetDay + " selected.");
	}
	public void SelectFrequencyDropdown(String Text)
	{
		Select sel = new Select(FrequencyDropdown);
		sel.selectByVisibleText(Text);
	}
	public void CLickOn_UpdateScheduleButton_OnEditSchdulePage()
	{
		UpdateScheduleButton_OnEditSchdulePage.click();
	}
	public void ClickOn_OkButton_OnSchedule_details_updated_successfully()
	{
		OkButton_OnSchedule_details_updated_successfully.click();
	}
	public void CLickOn_AssetDropdownOn_CreateSchedulePage()
	{
		AssetDropdownOn_CreateSchedulePage.click();
	}
	public void CLickOn_ChecklistDueTime()
	{
		ChecklistDueTime.click();
	}
	public void ClickOn_AddHourIcon_InChecklistDueTime()
	{
		AddHourIcon_InChecklistDueTime.click();
	}
	public void ClickOn_MinusHourIcon_InChecklistDueTime()
	{
		MinusHourIcon_InChecklistDueTime.click();
	}
	public void ClickOn_AddMinuteIcon_InChecklistDueTime()
	{
		AddMinuteIcon_InChecklistDueTime.click();
	}
	public void ClickOn_MinusMinuteIcon_InChecklistDueTime()
	{
		MinusMinuteIcon_InChecklistDueTime.click();
	}
	public void CLickOn_SetButton_InChecklistDueTime()
	{
		SetButton_InChecklistDueTime.click();
	}
	public void ClickOn_CancelButton_InChecklistDueTime()
	{
		CancelButton_InChecklistDueTime.click();
	}
	public void ClearAndSend_HourInboxField(WebDriver driver, String Enter_Hour) throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.BackSpaceMethod("(//input[@class='owl-dt-timer-input'])[1]", driver);
		HourInboxField.sendKeys(Enter_Hour);
		
	}
	public void ClearAndSend_MinuteInboxField(WebDriver driver, String Enter_Minute) throws Throwable
	{
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.BackSpaceMethod("(//input[@class='owl-dt-timer-input'])[2]", driver);
		MinuteInboxField.sendKeys(Enter_Minute);
	}
	public void ClickOn_HourInboxField(String Enter_Hour)
	{
		HourInboxField.sendKeys(Enter_Hour);
	}
	public void ClickOn_MinuteInboxField(String Enter_Minute)
	{
		MinuteInboxField.sendKeys(Enter_Minute);
	}
	public void ClickOn_NotifyIfNotCompletedOnTime_Checkbox()
	{
		NotifyIfNotCompletedOnTime_Checkbox.click();
	}
	public void SelectUsers_OnNotifyIfNotCompletedOnTime(String Enter_UserName)
	{
		Select sel = new Select(UsersDropdown_OnNotifyIfNotCompletedOnTime);
		sel.selectByVisibleText(Enter_UserName);
	}
	public void ClickOn_FrequencyTextField(String Enter_Number)
	{
		FrequencyTextField.sendKeys(Enter_Number);
	}
	public void SelectMeasurementDropdown(String Text)
	{
		Select sel = new Select(SelectMeasurementDropdown);
		sel.selectByVisibleText(Text);
	}
	
	public void ClickOn_EnterCustomDateCalendar(WebDriver driver) throws Throwable
	{
		 LocalDate today = LocalDate.now();
		 LocalDate tomorrow = today.plusDays(1); // Calculate tomorrow's date
		 String targetMonthYear = tomorrow.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2025"
		 String targetDay = String.valueOf(tomorrow.getDayOfMonth()); // e.g., "1"

		 System.out.println(targetDay);
		 System.out.println(targetMonthYear);

		 // Click on the Start Date input field to open the date picker
		 driver.findElement(By.xpath("//input[@formcontrolname='selectCustomDate']")).click();

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
	public void ClickOn_MonDayCheckbox()
	{
		MonDayCheckbox.click();
	}
	public void ClickOn_TuesdayCheckbox()
	{
		TuesdayCheckbox.click();
	}
	public void ClickOn_WenesdayCheckbox()
	{
		WenesdayCheckbox.click();
	}
	public void CLickOn_ThrusdayCheckbox()
	{
		ThrusdayCheckbox.click();
	}
	public void ClickOn_FridayCheckbox()
	{
		FridayCheckbox.click();
	}
	public void ClickOn_SaturdayCheckbox()
	{
		SaturdayCheckbox.click();
	}
	public void ClickOn_SundayCheckbox()
	{
		SundayCheckbox.click();
	}
	public void CLickOn_FilterByAsset()
	{
		FilterByAsset.click();
	}
	public void ClickOn_FilterByAssetSearchBox(String Search_Asset)
	{
		FilterByAssetSearchBox.sendKeys(Search_Asset);
	}
	public void CLickOn_FilterByUser()
	{
		FilterByUser.click();
	}
	public void CLickOn_FilterByUserSearchBox_OnTodays(String Search_User)
	{
		FilterByUserSearchBox_OnTodays.sendKeys(Search_User);
	}
	public void ClickOn_FilterByUserSearchBox_OnPrevious(String Search_User)
	{
		FilterByUserSearchBox_OnPrevious.sendKeys(Search_User);
	}
	public void CLickOn_FilterByUserSearchBox_OnUpcoming(String Search_User)
	{
		FilterByUserSearchBox_OnUpcoming.sendKeys(Search_User);
	}
	public void Clickon_FilterButton_OnPrevious()
	{
		FilterButton_OnPrevious.click();
	}
	public void CLickOn_UpcomingButton()
	{
		UpcomingButton.click();
	}
	
	public void SelectTomorrowStartadte(WebDriver driver) throws Throwable
	{
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
}
