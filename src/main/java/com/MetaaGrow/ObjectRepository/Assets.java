package com.MetaaGrow.ObjectRepository;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.math3.random.Well1024a;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Assets {
	//Initialization
	public Assets(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//button[normalize-space()='In Transit']")private WebElement In_Transit_Button;
	@FindBy(xpath = "//button[normalize-space()='Lost & Discard']")private WebElement Lost_and_Discard_Button;
	@FindBy(xpath = "//button[normalize-space()='All Assets']")private WebElement All_Assets_Button;
	@FindBy(xpath = "//ul[@class='assets-list']//span[contains(text(),'Ast')]")private WebElement dynamic_Click_On_AssetName;
	@FindBy(xpath = "//button[normalize-space()='Preventive Maintenance']")private WebElement Preventive_Maintenance_Button;
	@FindBy(xpath = "//button[normalize-space()='Tickets']")private WebElement Tickets_Button;
	@FindBy(xpath = "//button[normalize-space()='Parts']")private WebElement Parts_Button;
	@FindBy(xpath = "//button[normalize-space()='Depreciation']")private WebElement Depreciation_Button;
	@FindBy(xpath = "//button[normalize-space()='Logs']")private WebElement Logs_Button;

	@FindBy(xpath = "//button[normalize-space()='Notify']")private WebElement Notify_Button;
	@FindBy(xpath = "//button[normalize-space()='PAT']")private WebElement PAT_Button;
	@FindBy(xpath = "//span[normalize-space()='Print']")private WebElement Print_QR_Code;

	@FindBy(id = "infovieweditlocation")private WebElement View_Or_Edit_Location_Button_On_InfoPage;
	@FindBy(xpath = "//div[@id='duplicate12']//select[@id='selectUser']")private WebElement Select_Location_Dropdown_On_View_Or_Edit_Page;
	@FindBy(xpath = "//button[@data-dismiss='modal']//span[contains(text(),'Set New Location')]")private WebElement Set_New_Location_Button_On_View_Or_Edit_Page;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_View_Or_Edit_Confirmation_Page;

	@FindBy(id = "editasset")private WebElement General_Details_Edit_ButtonOn_Infopage;
	@FindBy(xpath = "//button[@name='cancelbutton']")private WebElement Cancel_Button_On_Edit_General_details_page;
	@FindBy(id = "confirmchanges")private WebElement Confirm_Changes_Button_On_Edit_General_details_page;
	//Need to change path after diploy points on live changes are done take id attribute
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_Edit_Asset_details_Confirmation_page;
	@FindBy(id = "editwarr")private WebElement Warranty_Edit_Button_On_info_Page;
	//Need to change path after diploy points on live changes are done take id attribute
	@FindBy(xpath = "//div[@id='duplicate223']//button[@type='button'][normalize-space()='Confirm Changes']")private WebElement Confirm_Changes_Button_On_Warranty_edit_Page;
	//Need to change path after diploy points on live changes are done take id attribute
	@FindBy(id = "dismissPopUp223")private WebElement Cancel_Button_On_Warranty_edit_Page;

	@FindBy(xpath = "//span[normalize-space()='Warranty Support History']" )private WebElement Warranty_Support_History_Button;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_Confirmation_Page;
	

	@FindBy(xpath = "//span[normalize-space()='Add New Service']/ancestor::button[@class='button btn-primary']")private WebElement Add_New_Service_Button_On_Warranty_Support_History_Page;
	@FindBy(xpath = "//input[@formcontrolname='reason']")private WebElement Reason_for_Servicing_TextField;
	@FindBy(xpath = "//select[@formcontrolname='ticket']")private WebElement Select_ticket_Dropdown;
	@FindBy(xpath = "//label[@for='serviceMode']//span[@class='slider']")private WebElement SLider;
	@FindBy(xpath = "//input[@hour12timer='true']")private WebElement Select_Service_Start_Time_Button;
	@FindBy(xpath = "(//input[@class='owl-dt-timer-input'])[1]")private WebElement Service_Start_And_End_Time_Hours_TextBox;
	@FindBy(xpath = "(//input[@class='owl-dt-timer-input'])[2]")private WebElement Service_Start_And_End_Time_Minutes_TextBox;
	@FindBy(xpath = "//span[normalize-space()='Set']")private WebElement Set_Button_On_StartTime_Hours_TextBox;
	@FindBy(xpath = "//span[@class='owl-dt-control-content owl-dt-control-button-content'][normalize-space()='Cancel']")private WebElement Cancel_Button_On_Service_End_Time_TextBox;
	@FindBy(xpath = "//input[@formcontrolname='endTime']")private WebElement Service_EndTime_Button;
	@FindBy(xpath = "//input[@formcontrolname='userId']")private WebElement Service_Persons_Name_TextBox;
	@FindBy(xpath = "//input[@formcontrolname='partRepairedName']")private WebElement Parts_Repaired_NameText_Box;
	@FindBy(xpath = "//select[@formcontrolname='partId']")private WebElement Select_Part_Dropdown;
	@FindBy(xpath = "//input[@formcontrolname='quentity']")private WebElement Quantity_TExtBox_On_Add_New_Warranty_Service_Page;
	@FindBy(xpath = "//input[@formcontrolname='additionalReason']")private WebElement Details_TExt_Field;
	@FindBy(xpath = "//input[@formcontrolname='additionalCost']")private WebElement AdditionalCost_TextField;
	@FindBy(xpath = "//span[normalize-space()='Attach Files']")private WebElement AttachFile_icon;
	@FindBy(xpath = "//input[@class='addFileDragInner']")private WebElement Upload_File_Icon;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")private WebElement Comments_TextField;
	@FindBy(xpath = "//span[normalize-space()='Add Service']")private WebElement Add_Services_Button;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_Button_On_Add_New_Warranty_Service;
	@FindBy(xpath = "//span[normalize-space()='AMC History']")private WebElement AMC_History_Button;
	@FindBy(id  = "editamc")private WebElement Edit_AMC_Button;
	@FindBy(id = "warrantyattach")private WebElement Warranty_Attach_File_Icon;
	@FindBy(id = "warrattachimg")private WebElement Warranty_upload_Icon;
	@FindBy(id = "warrattachbutton")private WebElement Warranty_Upload_Button;
	@FindBy(xpath = "//button[@data-target='#attachFile']//div[@class='img-box']")private WebElement AMC_Attach_File_Icon;
	@FindBy(xpath = "//label[@for='uploadFile']//input[@type='file']")private WebElement AMC__upload_Icon;
	@FindBy(xpath = "//div[@id='attachFile']//button[@type='button'][normalize-space()='Upload']")private WebElement AMC_Upload_Button;
	@FindBy(xpath = "//button[normalize-space()='Overdue']")private WebElement Overdue_Button;
	@FindBy(xpath = "//button[normalize-space()='Upcoming']")private WebElement Upcoming_Button;
	@FindBy(xpath = "//button[normalize-space()='Completed']")private WebElement Completed_Button;
	@FindBy(xpath = "//button[normalize-space()='Today']")private WebElement Today_Button;
	@FindBy(xpath = "//span[.='Filter']")private WebElement  Filter_Icon;
	@FindBy(xpath = "//input[@placeholder='Name']")private WebElement Filter_By_Name;
	@FindBy(xpath = "//ul[@class='filter-list']//button[@id='custom']")private WebElement Filter_By_AssignedTo;
	@FindBy(xpath = "//ul[@class='filter-list']//div[@class='input-group']")private WebElement Filter_By_AssignedTo_SearchBox_OnPm;
	@FindBy(xpath = "//a[.='AA']")private WebElement Filter_By_AssignedTo_DynamicText;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement Filter_By_Clear_Button;
	@FindBy(xpath = "//button[normalize-space()='Parked Tickets']")private WebElement Parked_Ticket_Button_On_Tickets_Page;;
	@FindBy(xpath = "//button[normalize-space()='Not Valid']")private WebElement Not_Valid_Button_On_Tickets_Page;
	@FindBy(xpath = "//button[normalize-space()='Closed Tickets']")private WebElement Closed_Button_On_Tickets_Page;
	@FindBy(xpath = "//button[normalize-space()='Open Tickets']")private WebElement Open_Tickets_On_Tickets_Page;
	@FindBy(xpath = "//input[@placeholder='Ticket No.']")private WebElement Filter_By_Ticket_No_TExtField;
	@FindBy(xpath = "//input[@placeholder='Title']")private WebElement Filter_By_Title_TExtField;
	@FindBy(name = "prioritybutton")private WebElement Filter_By_select_Priority_Button;
	@FindBy(xpath = "//a[.='Low']")private WebElement Filter_By_Low_Priority;
	@FindBy(xpath = "//a[.='High']")private WebElement Filter_By_High_Priority;
	@FindBy(xpath = "//a[.='Medium']")private WebElement Filter_By_Medium_Priority;
	@FindBy(xpath = "//span[normalize-space()='Select assign to']")private WebElement Filter_By_Select_AssignedTo;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_AssignedTo_SearchBox_OnTickets;
	@FindBy(xpath = "//span[normalize-space()='Select raised By']")private WebElement Filter_By_Select_Raised_By;
	@FindBy(xpath = "//span[normalize-space()='Raise a Ticket']")private WebElement Raise_a_Ticket_Button_On_Asset_TicketsPage;
	@FindBy(xpath = "//select[@id='site']")private WebElement Select_Property_Dropdown;
	@FindBy(xpath = "//input[@formcontrolname='subject']")private WebElement Enter_TextField_On_Raise_a_TicketPage;
	@FindBy(id = "location_reason")private WebElement Description_TextBox_On_Raise_a_TicketPage;
	@FindBy(xpath = "//label[@for='transferType']//span[@class='slider']")private WebElement Slider_On_Raise_a_TicketPage;
	@FindBy(xpath = "//div[normalize-space()='Low']")private WebElement Select_Priority_Low_On_Raise_a_TicketPage;
	@FindBy(xpath = "//div[normalize-space()='High']")private WebElement Select_Priority_High_On_Raise_a_TicketPage;
	@FindBy(xpath = "//div[normalize-space()='Medium']")private WebElement Select_Priority_Medium_On_Raise_a_TicketPage;
	@FindBy(xpath = "//label[@for='uploadProfile']//img[@class='uploadSection']")private WebElement Image_Upload_Icon_On_Raise_a_TicketPage;
	@FindBy(xpath = "//label[@for='uploadProfileVedio']//img[@class='uploadSection']")private WebElement Video_Upload_Icon_On_Raise_a_TicketPage;
	@FindBy(xpath = "//div[@class='row align-items-center']//button[@id='custom']")private WebElement Select_Department_Dropdown_On_Raise_a_TicketPage;
	@FindBy(xpath = "//div[@class='grad-box border']//div[@class='row']//button[@id='custom']")private WebElement Select_User_Dropdown_On_Raise_a_TicketPage;
	@FindBy(xpath = "//span[normalize-space()='Create Ticket']")private WebElement Create_Button_On_Raise_a_TicketPage;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_Button_On_Raise_a_TicketPage;
	@FindBy(xpath = "//button[normalize-space()='Used']")private WebElement Used_Button_On_Asset_PartsPage;
	@FindBy(xpath = "//button[normalize-space()='All Associated']")private WebElement All_Associated_Button_On_Asset_PartsPage;
	@FindBy(xpath = "//span[.='Select Part Name']")private WebElement Filter_By_PartName_Button_On_InfoPartsPage;
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement Filter_By_PartName_SearchBox_On_InfoPartsPage;
	@FindBy(xpath = "//a[.='agn']")private WebElement Filter_By_Dynamic_PartName_On_InfoPartsPage;
	@FindBy(xpath = "//input[@placeholder='Quantity']")private WebElement Filter_By_Quantity_TextFiled_On_InfoPartsPage;
	@FindBy(xpath = "//span[.='Select Part No']")private WebElement Filter_By_Part_No_Button_On_InfoPartsPage;
	@FindBy(xpath = "(//input[@id='custom'])[3]")private WebElement Filter_By_PartNo_SearchBox_On_InfoPartsPage;
	@FindBy(xpath = "//span[normalize-space()='Associate a Part']")private WebElement Associate_a_Part_Button;
	@FindBy(xpath = "//select[@id='selectedPart']")private WebElement Select_Part_Dropdown_On_Associate_a_PartPage;
	@FindBy(xpath = "//span[normalize-space()='Attach Part']")private WebElement Attach_Part_Button_On_Associate_a_PartPage;
	@FindBy(xpath = "//button[.='Ok']")private WebElement Ok_Button_On_Associate_a_Part_ConfirmationPage;
	@FindBy(xpath = "//span[normalize-space()='Edit']")private WebElement Edit_Button_On_Depreciation_Page;
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement Purchase_Price_TextField_On_Edit_Depreciation;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement Residual_Price_TextField_On_Edit_Depreciation;
	@FindBy(xpath = "(//input[@type='number'])[3]")private WebElement Usefull_Life_Yrs_TextField_On_Edit_Depreciation;
	@FindBy(xpath = "//span[normalize-space()='Update']")private WebElement Update_Button_On_Edit_Depreciation;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_Confirmation_Edit_Depreciation;
	@FindBy(xpath = "//input[@placeholder='Activity']")private WebElement Filter_By_Acitivity_TextFiled_OnLogs_Page;
	@FindBy(xpath = "//button[@class='button select-button ']//span[.='Associate']")private WebElement Filter_By_Associate_TextFiled_OnLogs_Page;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Associate_SearchBox_OnLogs_Page;
	@FindBy(xpath = "//button[@class='button select-button ']//span[.='Type of log']")private WebElement Filter_By_Type_Of_Log_OnLogs_Page;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Type_Of_Log_SearchBox_OnLogs_Page;
	@FindBy(xpath = "//input[@placeholder='File Name']")private WebElement Filter_By_File_Name_On_LOgs_Files_Page;
	@FindBy(xpath = "//span[.='Uploaded By']")private WebElement Filter_By_Uploaded_By_On_LOgs_Files_Page;
	@FindBy(xpath = "(//input[@id='custom'])[4]")private WebElement Filter_By_Uploaded_By_SearchBox_On_LOgs_Files_Page;
	@FindBy(xpath = "//button[normalize-space()='Reports']")private WebElement Reports_Button;
	@FindBy(xpath = "//img[@alt='Delete']")private WebElement Filter_Icon_On_Asset_Reports_Page;
	@FindBy(xpath = "//span[.='Export']")private WebElement Export_Button_On_Asset_Reports_Page;
	@FindBy(xpath = "//a[normalize-space()='As PDF']")private WebElement Download_As_PDF_Tab_In_Export_Button_Asset_Reports_Page;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement Filter_By_Property_On_All_AssetPage;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox_On_All_AssetPage;
	@FindBy(xpath = "//a[normalize-space()='Pune']")private WebElement Filter_By_Dyanamic_PropertyName_On_All_AssetPage;
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement Filter_By_Asset_On_All_AssetPage;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Asset_SearchBox_On_All_AssetPage;
	@FindBy(xpath = "//a[normalize-space()='Asset 11']")private WebElement Filter_By_Dyanamic_AssetName_On_All_AssetPage;
	@FindBy(xpath = "//input[@placeholder='Manufacturer']")private WebElement Filter_By_Manufacturer_TextBox_On_All_AssetPage;
	@FindBy(xpath = "//span[.='Select Status']")private WebElement Filter_By_Status_On_All_AssetPage;
	@FindBy(xpath = "//a[normalize-space()='Breakdown']")private WebElement Filter_By_Status_Breakdown_On_All_AssetPage;
	@FindBy(xpath = "//a[normalize-space()='Inactive']")private WebElement Filter_By_Status_Inactive_On_All_AssetPage;
	@FindBy(xpath = "//a[normalize-space()='Active']")private WebElement Filter_By_Status_Active_On_All_AssetPage;
	@FindBy(xpath = "//span[.='Select Transfer Type']")private WebElement Filter_By_Transfer_Type_On_In_TransitPage;
	@FindBy(xpath = "//a[.='Temporary']")private WebElement Filter_By_Transfer_Type_Temporary_On_In_TransitPage;
	@FindBy(xpath = "//a[.='Permanent']")private WebElement Filter_By_Transfer_Type_Permanent_On_In_TransitPage;
	@FindBy(xpath = "//label[@for='11002check']")private WebElement Dynamic_Radio_Button_On_Asset;
	@FindBy(xpath = "//span[normalize-space()='Duplicate']")private WebElement Duplicate_Button_on_All_AssetPage;
	@FindBy(xpath = "//button[normalize-space()='Yes Duplicate']")private WebElement Yes_Duplicate_Button_Permission_Page;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_Duplicate_assetConfirmation_page;
	@FindBy(xpath = "//span[normalize-space()='Move']")private WebElement Move_Button_On_All_AssetPage;
	@FindBy(xpath = "//textarea[@id='location_reason']")private WebElement Location_Reason_TExtBox_On_Transfer_AssetPage;
	@FindBy(xpath = "//img[@alt='checkbox check']")private WebElement CheckBox_Notify_if_not_returned_in_Time;
	@FindBy(xpath = "//select[@formcontrolname='userSelected']")private WebElement Notify_User_Dropdown_On_Transfer_Asset_Page;
	@FindBy(xpath = "//span[normalize-space()='Next']")private WebElement Next_Button;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_Button;
	@FindBy(xpath = "//span[normalize-space()='Back']")private WebElement Back_Button;
	@FindBy(xpath = "//label[@for='transferType']//span[@class='slider']")private WebElement Slider_On_Transfer_Asset_Page;
	@FindBy(xpath = "(//select[@placeholder='select'])[2]")private WebElement select_property_Dropdown_On_Permanent_TransferPage;
	@FindBy(xpath = "//span[normalize-space()='QR Code']")private WebElement QR_Button;
	@FindBy(xpath = "//span[normalize-space()='Add']")private WebElement Add_Asset_Button;
	@FindBy(xpath = "//a[normalize-space()='Single']")private WebElement Add_Single_Asset_Button;
	@FindBy(xpath = "//input[@formcontrolname='assetName']")private WebElement Asset_Name_TextBox;
	@FindBy(xpath = "//input[@formcontrolname='categoryName']")private WebElement Category_Name_TextBox;
	@FindBy(xpath = "//select[@formcontrolname='conditions']")private WebElement Condition_Dropdown;
	@FindBy(xpath = "//input[@formcontrolname='specRating']")private WebElement Spec_Rating_TextBox;
	@FindBy(xpath = "(//input[@formcontrolname='vendorName'])[1]")private WebElement Vendor_Name_on_General_DetailsPage;
	@FindBy(xpath = "//select[@formcontrolname='portable']")private WebElement PAT_Dropdown;
	@FindBy(xpath = "//input[@formcontrolname='srNo']")private WebElement SrNo_TextBox;
	@FindBy(xpath = "//input[@formcontrolname='make']")private WebElement Manufacturer_TextBox;
	@FindBy(xpath = "//input[@formcontrolname='model']")private WebElement Model_TExtBox;
	@FindBy(xpath = "//input[@formcontrolname='assetTagNo']")private WebElement Asset_Tag_No_TextBox;
	@FindBy(xpath = "//select[@formcontrolname='propertyId']")private WebElement Property_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='locationId']")private WebElement Location_Dropdown;
	@FindBy(xpath = "//input[@formcontrolname='ownership']")private WebElement Ownership_TextBox;
	@FindBy(xpath = "//span[normalize-space()='Add Warranty Details']")private WebElement Add_Warranty_Details_Icon;
	@FindBy(xpath = "//form[@name='warrantyDetailsForm']//li[1]//div[1]//input[1]")private WebElement Vendor_Name_On_Warranty_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='contactPerson'])[1]")private WebElement Contact_Person_TextBox_On_Warranty_DetailsPage;;
	@FindBy(xpath = "(//input[@formcontrolname='contactNo'])[1]")private WebElement Contact_No_On_Warranty_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='alternetNo'])[1]")private WebElement Altername_No_On_Warranty_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='email'])[1]")private WebElement Email_On_Warranty_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='scheduledService'])[1]")private WebElement No_of_Services_On_Warranty_DetailsPage;
	@FindBy(xpath = "//span[normalize-space()='Add AMC Details']")private WebElement Add_AMC_Drtais_ICON;
	@FindBy(xpath = "(//input[@formcontrolname='vendorName'])[3]")private WebElement Vendor_Name_On_AMC_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='contactPerson'])[2]")private WebElement ContactPerson_On_AMC_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='contactNo'])[2]")private WebElement Contact_No_On_AMC_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='alternetNo'])[2]")private WebElement Altername_No_On_AMC_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='email'])[2]")private WebElement Email__On_AMC_DetailsPage;
	@FindBy(xpath = "(//input[@formcontrolname='scheduledService'])[2]")private WebElement No_Of_Services_On_AMC_DetailsPage;
	@FindBy(xpath = "//select[@formcontrolname='amcType']")private WebElement AMC_Type_Dropdown;
	@FindBy(xpath = "//span[normalize-space()='Create Asset']")private WebElement Create_Asset_Button;
	@FindBy(xpath = "//input[@id='emailInput']")private WebElement ManufacturerEmailId;
	@FindBy(xpath = "(//select[@formcontrolname='isnotify'])[1]")private WebElement NotificationDropdown_OnAddAssetsForm;
	@FindBy(xpath = "//input[@placeholder='Purchase Price']")private WebElement PurchasePrice_OnAddAssetsForm;
	@FindBy(xpath = "(//select[@formcontrolname='is_tpi'])[1]")private WebElement TPI_Dropdown_OnAddAssetsForm;
	@FindBy(xpath = "//button[normalize-space()='View Ticket']")private WebElement ViewTicketButton;
	@FindBy(xpath = "(//select[@id='selectUser'])[1]")private WebElement TicketStatusDropdown;
	@FindBy(xpath = "//input[@placeholder='Enter Remark']")private WebElement TicketRemark;
	@FindBy(xpath = "//button[@id='submitEmailPopup']")private WebElement RemarkSubmitButton;
	@FindBy(xpath = "//button[@id='ticketViewOk']")private WebElement OkButton_OnTicketClosed;
	@FindBy(xpath = "(//input[@placeholder='Remark'])[1]")private WebElement RemarkTextFieldOnAssetStatus;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Save'])[1]")private WebElement SaveButtonOnRemark;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement OkButton_LostSuccess;
	@FindBy(xpath = "//select[@id='raiseNewTicketTicketType']")private WebElement TicketType;
	@FindBy(xpath = "//button[@id='custom']//span[.='Select parts']")private WebElement  PartsDropdownOn_AttachPartsPage;
	@FindBy(xpath = "//button[@class='button btn-primary']//span[.='Save']")private WebElement SaveButton_OnAttachPartsPage;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement OkButton_OnAsset_part_associated_successfully;
	@FindBy(xpath = "//span[.='Create Schedule']")private WebElement CReateScheduleBUtton_OnPAT;
	@FindBy(xpath = "//select[@formcontrolname='property']")private WebElement PropertyDropwnOn_ScheduleYourPAT_TestingPage;
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement SelectAssetbuttonOn_ScheduleYourPAT_TestingPage;
	@FindBy(xpath = "//span[.='Select User']")private WebElement SelectUserButton_On_ScheduleYourPAT_TestingPage;
	@FindBy(xpath = "//select[@formcontrolname='frequency']")private WebElement FrequencyDropdown_On_ScheduleYourPAT_TestingPage;
	@FindBy(xpath = "//span[.='Create Schedule']")private WebElement CreateScheduleButton_On_ScheduleYourPAT_TestingPage;;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement NoButton_OnPATSCheduledSuccess;
	
	
	public WebElement getCReateScheduleBUtton_OnPAT() {
		return CReateScheduleBUtton_OnPAT;
	}
	public WebElement getPropertyDropwnOn_ScheduleYourPAT_TestingPage() {
		return PropertyDropwnOn_ScheduleYourPAT_TestingPage;
	}
	public WebElement getSelectAssetbuttonOn_ScheduleYourPAT_TestingPage() {
		return SelectAssetbuttonOn_ScheduleYourPAT_TestingPage;
	}
	public WebElement getSelectUserButton_On_ScheduleYourPAT_TestingPage() {
		return SelectUserButton_On_ScheduleYourPAT_TestingPage;
	}
	public WebElement getFrequencyDropdown_On_ScheduleYourPAT_TestingPage() {
		return FrequencyDropdown_On_ScheduleYourPAT_TestingPage;
	}
	public WebElement getCreateScheduleButton_On_ScheduleYourPAT_TestingPage() {
		return CreateScheduleButton_On_ScheduleYourPAT_TestingPage;
	}
	public WebElement getNoButton_OnPATSCheduledSuccess() {
		return NoButton_OnPATSCheduledSuccess;
	}
	public WebElement getPartsDropdownOn_AttachPartsPage() {
		return PartsDropdownOn_AttachPartsPage;
	}
	public WebElement getSaveButton_OnAttachPartsPage() {
		return SaveButton_OnAttachPartsPage;
	}
	public WebElement getOkButton_OnAsset_part_associated_successfully() {
		return OkButton_OnAsset_part_associated_successfully;
	}
	public WebElement getTicketType() {
		return TicketType;
	}
	public WebElement getSaveButtonOnRemark() {
		return SaveButtonOnRemark;
	}
	public WebElement getOkButton_LostSuccess() {
		return OkButton_LostSuccess;
	}
	public WebElement getRemarkTextFieldOnAssetStatus() {
		return RemarkTextFieldOnAssetStatus;
	}
	public WebElement getOkButton_OnTicketClosed() {
		return OkButton_OnTicketClosed;
	}
	//Getters Method
	public WebElement getTicketStatusDropdown() {
		return TicketStatusDropdown;
	}
	public WebElement getTicketRemark() {
		return TicketRemark;
	}
	public WebElement getRemarkSubmitButton() {
		return RemarkSubmitButton;
	}
	
	public WebElement getViewTicketButton() {
		return ViewTicketButton;
	}
	public WebElement getTPI_Dropdown_OnAddAssetsForm() {
		return TPI_Dropdown_OnAddAssetsForm;
	}
	public WebElement getPurchasePrice_OnAddAssetsForm() {
		return PurchasePrice_OnAddAssetsForm;
	}
	public WebElement getNotificationDropdown_OnAddAssetsForm() {
		return NotificationDropdown_OnAddAssetsForm;
	}
	public WebElement getFilter_By_AssignedTo_SearchBox_OnTickets() {
		return Filter_By_AssignedTo_SearchBox_OnTickets;
	}
	public WebElement getFilter_By_PartNo_SearchBox_On_InfoPartsPage() {
		return Filter_By_PartNo_SearchBox_On_InfoPartsPage;
	}
	public WebElement getManufacturerEmailId() {
		return ManufacturerEmailId;
	}
	public WebElement getIn_Transit_Button() {
		return In_Transit_Button;
	}
	public WebElement getLost_and_Discard_Button() {
		return Lost_and_Discard_Button;
	}
	public WebElement getAll_Assets_Button() {
		return All_Assets_Button;
	}
	public WebElement getDynamic_Click_On_AssetName() {
		return dynamic_Click_On_AssetName;
	}
	public WebElement getPreventive_Maintenance_Button() {
		return Preventive_Maintenance_Button;
	}
	public WebElement getTickets_Button() {
		return Tickets_Button;
	}
	public WebElement getParts_Button() {
		return Parts_Button;
	}
	public WebElement getDepreciation_Button() {
		return Depreciation_Button;
	}
	public WebElement getLogs_Button() {
		return Logs_Button;
	}
	public WebElement getNotify_Button() {
		return Notify_Button;
	}
	public WebElement getPAT_Button() {
		return PAT_Button;
	}
	public WebElement getPrint_QR_Code() {
		return Print_QR_Code;
	}
	public WebElement getView_Or_Edit_Location_Button_On_InfoPage() {
		return View_Or_Edit_Location_Button_On_InfoPage;
	}
	public WebElement getSelect_Location_Dropdown_On_View_Or_Edit_Page() {
		return Select_Location_Dropdown_On_View_Or_Edit_Page;
	}
	public WebElement getSet_New_Location_Button_On_View_Or_Edit_Page() {
		return Set_New_Location_Button_On_View_Or_Edit_Page;
	}
	public WebElement getOk_Button_On_View_Or_Edit_Confirmation_Page() {
		return Ok_Button_On_View_Or_Edit_Confirmation_Page;
	}
	public WebElement getGeneral_Details_Edit_ButtonOn_Infopage() {
		return General_Details_Edit_ButtonOn_Infopage;
	}
	public WebElement getCancel_Button_On_Edit_General_details_page() {
		return Cancel_Button_On_Edit_General_details_page;
	}
	public WebElement getConfirm_Changes_Button_On_Edit_General_details_page() {
		return Confirm_Changes_Button_On_Edit_General_details_page;
	}
	public WebElement getOk_Button_On_Edit_Asset_details_Confirmation_page() {
		return Ok_Button_On_Edit_Asset_details_Confirmation_page;
	}
	public WebElement getWarranty_Edit_Button_On_info_Page() {
		return Warranty_Edit_Button_On_info_Page;
	}
	public WebElement getConfirm_Changes_Button_On_Warranty_edit_Page() {
		return Confirm_Changes_Button_On_Warranty_edit_Page;
	}
	public WebElement getCancel_Button_On_Warranty_edit_Page() {
		return Cancel_Button_On_Warranty_edit_Page;
	}
	public WebElement getWarranty_Support_History_Button() {
		return Warranty_Support_History_Button;
	}
	public WebElement getOk_Button_On_Confirmation_Page() {
		return Ok_Button_On_Confirmation_Page;
	}
	public WebElement getAdd_New_Service_Button_On_Warranty_Support_History_Page() {
		return Add_New_Service_Button_On_Warranty_Support_History_Page;
	}
	public WebElement getReason_for_Servicing_TextField() {
		return Reason_for_Servicing_TextField;
	}
	public WebElement getSelect_ticket_Dropdown() {
		return Select_ticket_Dropdown;
	}
	public WebElement getSLider() {
		return SLider;
	}
	public WebElement getSelect_Service_Start_Time_Button() {
		return Select_Service_Start_Time_Button;
	}
	public WebElement getService_Start_And_End_Time_Hours_TextBox() {
		return Service_Start_And_End_Time_Hours_TextBox;
	}
	public WebElement getService_Start_And_End_Time_Minutes_TextBox() {
		return Service_Start_And_End_Time_Minutes_TextBox;
	}
	public WebElement getSet_Button_On_StartTime_Hours_TextBox() {
		return Set_Button_On_StartTime_Hours_TextBox;
	}
	public WebElement getCancel_Button_On_Service_End_Time_TextBox() {
		return Cancel_Button_On_Service_End_Time_TextBox;
	}
	public WebElement getService_EndTime_Button() {
		return Service_EndTime_Button;
	}
	public WebElement getService_Persons_Name_TextBox() {
		return Service_Persons_Name_TextBox;
	}
	public WebElement getParts_Repaired_NameText_Box() {
		return Parts_Repaired_NameText_Box;
	}
	public WebElement getSelect_Part_Dropdown() {
		return Select_Part_Dropdown;
	}
	public WebElement getQuantity_TExtBox_On_Add_New_Warranty_Service_Page() {
		return Quantity_TExtBox_On_Add_New_Warranty_Service_Page;
	}
	public WebElement getDetails_TExt_Field() {
		return Details_TExt_Field;
	}
	public WebElement getAdditionalCost_TextField() {
		return AdditionalCost_TextField;
	}
	public WebElement getAttachFile_icon() {
		return AttachFile_icon;
	}
	public WebElement getUpload_File_Icon() {
		return Upload_File_Icon;
	}
	public WebElement getComments_TextField() {
		return Comments_TextField;
	}
	public WebElement getAdd_Services_Button() {
		return Add_Services_Button;
	}
	public WebElement getCancel_Button_On_Add_New_Warranty_Service() {
		return Cancel_Button_On_Add_New_Warranty_Service;
	}
	public WebElement getAMC_History_Button() {
		return AMC_History_Button;
	}
	public WebElement getEdit_AMC_Button() {
		return Edit_AMC_Button;
	}
	public WebElement getWarranty_Attach_File_Icon() {
		return Warranty_Attach_File_Icon;
	}
	public WebElement getWarranty_upload_Icon() {
		return Warranty_upload_Icon;
	}
	public WebElement getWarranty_Upload_Button() {
		return Warranty_Upload_Button;
	}
	public WebElement getAMC_Attach_File_Icon() {
		return AMC_Attach_File_Icon;
	}
	public WebElement getAMC__upload_Icon() {
		return AMC__upload_Icon;
	}
	public WebElement getAMC_Upload_Button() {
		return AMC_Upload_Button;
	}
	public WebElement getOverdue_Button() {
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
	public WebElement getFilter_Icon() {
		return Filter_Icon;
	}
	public WebElement getFilter_By_Name() {
		return Filter_By_Name;
	}
	public WebElement getFilter_By_AssignedTo() {
		return Filter_By_AssignedTo;
	}
	public WebElement getFilter_By_AssignedTo_SearchBox_OnPm() {
		return Filter_By_AssignedTo_SearchBox_OnPm;
	}
	public WebElement getFilter_By_AssignedTo_DynamicText() {
		return Filter_By_AssignedTo_DynamicText;
	}
	public WebElement getFilter_By_Apply_Button() {
		return Filter_By_Apply_Button;
	}
	public WebElement getFilter_By_Clear_Button() {
		return Filter_By_Clear_Button;
	}
	public WebElement getParked_Ticket_Button_On_Tickets_Page() {
		return Parked_Ticket_Button_On_Tickets_Page;
	}
	public WebElement getNot_Valid_Button_On_Tickets_Page() {
		return Not_Valid_Button_On_Tickets_Page;
	}
	public WebElement getClosed_Button_On_Tickets_Page() {
		return Closed_Button_On_Tickets_Page;
	}
	public WebElement getOpen_Tickets_On_Tickets_Page() {
		return Open_Tickets_On_Tickets_Page;
	}
	public WebElement getFilter_By_Ticket_No_TExtField() {
		return Filter_By_Ticket_No_TExtField;
	}
	public WebElement getFilter_By_Title_TExtField() {
		return Filter_By_Title_TExtField;
	}
	public WebElement getFilter_By_select_Priority_Button() {
		return Filter_By_select_Priority_Button;
	}
	public WebElement getFilter_By_Low_Priority() {
		return Filter_By_Low_Priority;
	}
	public WebElement getFilter_By_High_Priority() {
		return Filter_By_High_Priority;
	}
	public WebElement getFilter_By_Medium_Priority() {
		return Filter_By_Medium_Priority;
	}
	public WebElement getFilter_By_Select_AssignedTo() {
		return Filter_By_Select_AssignedTo;
	}
	public WebElement getFilter_By_AssignedTo_SearchBox_On_Tickets()
	{
		return Filter_By_AssignedTo_SearchBox_OnTickets;
	}
	
	public WebElement getFilter_By_Select_Raised_By() {
		return Filter_By_Select_Raised_By;
	}
	public WebElement getRaise_a_Ticket_Button_On_Asset_TicketsPage() {
		return Raise_a_Ticket_Button_On_Asset_TicketsPage;
	}
	public WebElement getSelect_Property_Dropdown() {
		return Select_Property_Dropdown;
	}
	public WebElement getEnter_TextField_On_Raise_a_TicketPage() {
		return Enter_TextField_On_Raise_a_TicketPage;
	}
	public WebElement getDescription_TextBox_On_Raise_a_TicketPage() {
		return Description_TextBox_On_Raise_a_TicketPage;
	}
	public WebElement getSlider_On_Raise_a_TicketPage() {
		return Slider_On_Raise_a_TicketPage;
	}
	public WebElement getSelect_Priority_Low_On_Raise_a_TicketPage() {
		return Select_Priority_Low_On_Raise_a_TicketPage;
	}
	public WebElement getSelect_Priority_High_On_Raise_a_TicketPage() {
		return Select_Priority_High_On_Raise_a_TicketPage;
	}
	public WebElement getSelect_Priority_Medium_On_Raise_a_TicketPage() {
		return Select_Priority_Medium_On_Raise_a_TicketPage;
	}
	public WebElement getImage_Upload_Icon_On_Raise_a_TicketPage() {
		return Image_Upload_Icon_On_Raise_a_TicketPage;
	}
	public WebElement getVideo_Upload_Icon_On_Raise_a_TicketPage() {
		return Video_Upload_Icon_On_Raise_a_TicketPage;
	}
	public WebElement getSelect_Department_Dropdown_On_Raise_a_TicketPage() {
		return Select_Department_Dropdown_On_Raise_a_TicketPage;
	}
	public WebElement getSelect_User_Dropdown_On_Raise_a_TicketPage() {
		return Select_User_Dropdown_On_Raise_a_TicketPage;
	}
	public WebElement getCreate_Button_On_Raise_a_TicketPage() {
		return Create_Button_On_Raise_a_TicketPage;
	}
	public WebElement getCancel_Button_On_Raise_a_TicketPage() {
		return Cancel_Button_On_Raise_a_TicketPage;
	}
	public WebElement getUsed_Button_On_Asset_PartsPage() {
		return Used_Button_On_Asset_PartsPage;
	}
	public WebElement getAll_Associated_Button_On_Asset_PartsPage() {
		return All_Associated_Button_On_Asset_PartsPage;
	}
	public WebElement getFilter_By_PartName_Button_On_InfoPartsPage() {
		return Filter_By_PartName_Button_On_InfoPartsPage;
	}
	public WebElement getFilter_By_PartName_SearchBox_On_InfoPartsPage() {
		return Filter_By_PartName_SearchBox_On_InfoPartsPage;
	}
	public WebElement getFilter_By_Dynamic_PartName_On_InfoPartsPage() {
		return Filter_By_Dynamic_PartName_On_InfoPartsPage;
	}
	public WebElement getFilter_By_Quantity_TextFiled_On_InfoPartsPage() {
		return Filter_By_Quantity_TextFiled_On_InfoPartsPage;
	}
	public WebElement getFilter_By_Part_No_Button_On_InfoPartsPage() {
		return Filter_By_Part_No_Button_On_InfoPartsPage;
	}
	public WebElement getFilter_By_PartNo_SearchBox() {
		return Filter_By_PartNo_SearchBox_On_InfoPartsPage;
	}
	public WebElement getAssociate_a_Part_Button() {
		return Associate_a_Part_Button;
	}
	public WebElement getSelect_Part_Dropdown_On_Associate_a_PartPage() {
		return Select_Part_Dropdown_On_Associate_a_PartPage;
	}
	public WebElement getAttach_Part_Button_On_Associate_a_PartPage() {
		return Attach_Part_Button_On_Associate_a_PartPage;
	}
	public WebElement getOk_Button_On_Associate_a_Part_ConfirmationPage() {
		return Ok_Button_On_Associate_a_Part_ConfirmationPage;
	}
	public WebElement getEdit_Button_On_Depreciation_Page() {
		return Edit_Button_On_Depreciation_Page;
	}
	public WebElement getPurchase_Price_TextField_On_Edit_Depreciation() {
		return Purchase_Price_TextField_On_Edit_Depreciation;
	}
	public WebElement getResidual_Price_TextField_On_Edit_Depreciation() {
		return Residual_Price_TextField_On_Edit_Depreciation;
	}
	public WebElement getUsefull_Life_Yrs_TextField_On_Edit_Depreciation() {
		return Usefull_Life_Yrs_TextField_On_Edit_Depreciation;
	}
	public WebElement getUpdate_Button_On_Edit_Depreciation() {
		return Update_Button_On_Edit_Depreciation;
	}
	public WebElement getOk_Button_On_Confirmation_Edit_Depreciation() {
		return Ok_Button_On_Confirmation_Edit_Depreciation;
	}
	public WebElement getFilter_By_Acitivity_TextFiled_OnLogs_Page() {
		return Filter_By_Acitivity_TextFiled_OnLogs_Page;
	}
	public WebElement getFilter_By_Associate_TextFiled_OnLogs_Page() {
		return Filter_By_Associate_TextFiled_OnLogs_Page;
	}
	public WebElement getFilter_By_Associate_SearchBox_OnLogs_Page() {
		return Filter_By_Associate_SearchBox_OnLogs_Page;
	}
	public WebElement getFilter_By_Type_Of_Log_OnLogs_Page() {
		return Filter_By_Type_Of_Log_OnLogs_Page;
	}
	public WebElement getFilter_By_Type_Of_Log_SearchBox_OnLogs_Page() {
		return Filter_By_Type_Of_Log_SearchBox_OnLogs_Page;
	}
	public WebElement getFilter_By_File_Name_On_LOgs_Files_Page() {
		return Filter_By_File_Name_On_LOgs_Files_Page;
	}
	public WebElement getFilter_By_Uploaded_By_On_LOgs_Files_Page() {
		return Filter_By_Uploaded_By_On_LOgs_Files_Page;
	}
	public WebElement getFilter_By_Uploaded_By_SearchBox_On_LOgs_Files_Page() {
		return Filter_By_Uploaded_By_SearchBox_On_LOgs_Files_Page;
	}
	public WebElement getReports_Button() {
		return Reports_Button;
	}
	public WebElement getFilter_Icon_On_Asset_Reports_Page() {
		return Filter_Icon_On_Asset_Reports_Page;
	}
	public WebElement getExport_Button_On_Asset_Reports_Page() {
		return Export_Button_On_Asset_Reports_Page;
	}
	public WebElement getDownload_As_PDF_Tab_In_Export_Button_Asset_Reports_Page() {
		return Download_As_PDF_Tab_In_Export_Button_Asset_Reports_Page;
	}
	public WebElement getFilter_By_Property_On_All_AssetPage() {
		return Filter_By_Property_On_All_AssetPage;
	}
	public WebElement getFilter_By_Property_SearchBox_On_All_AssetPage() {
		return Filter_By_Property_SearchBox_On_All_AssetPage;
	}
	public WebElement getFilter_By_Dyanamic_PropertyName_On_All_AssetPage() {
		return Filter_By_Dyanamic_PropertyName_On_All_AssetPage;
	}
	public WebElement getFilter_By_Asset_On_All_AssetPage() {
		return Filter_By_Asset_On_All_AssetPage;
	}
	public WebElement getFilter_By_Asset_SearchBox_On_All_AssetPage() {
		return Filter_By_Asset_SearchBox_On_All_AssetPage;
	}
	public WebElement getFilter_By_Dyanamic_AssetName_On_All_AssetPage() {
		return Filter_By_Dyanamic_AssetName_On_All_AssetPage;
	}
	public WebElement getFilter_By_Manufacturer_TextBox_On_All_AssetPage() {
		return Filter_By_Manufacturer_TextBox_On_All_AssetPage;
	}
	public WebElement getFilter_By_Status_On_All_AssetPage() {
		return Filter_By_Status_On_All_AssetPage;
	}
	public WebElement getFilter_By_Status_Breakdown_On_All_AssetPage() {
		return Filter_By_Status_Breakdown_On_All_AssetPage;
	}
	public WebElement getFilter_By_Status_Inactive_On_All_AssetPage() {
		return Filter_By_Status_Inactive_On_All_AssetPage;
	}
	public WebElement getFilter_By_Status_Active_On_All_AssetPage() {
		return Filter_By_Status_Active_On_All_AssetPage;
	}
	public WebElement getFilter_By_Transfer_Type_On_In_TransitPage() {
		return Filter_By_Transfer_Type_On_In_TransitPage;
	}
	public WebElement getFilter_By_Transfer_Type_Temporary_On_In_TransitPage() {
		return Filter_By_Transfer_Type_Temporary_On_In_TransitPage;
	}
	public WebElement getFilter_By_Transfer_Type_Permanent_On_In_TransitPage() {
		return Filter_By_Transfer_Type_Permanent_On_In_TransitPage;
	}
	public WebElement getDynamic_Radio_Button_On_Asset() {
		return Dynamic_Radio_Button_On_Asset;
	}
	public WebElement getDuplicate_Button_on_All_AssetPage() {
		return Duplicate_Button_on_All_AssetPage;
	}
	public WebElement getYes_Duplicate_Button_Permission_Page() {
		return Yes_Duplicate_Button_Permission_Page;
	}
	public WebElement getOk_Button_On_Duplicate_assetConfirmation_page() {
		return Ok_Button_On_Duplicate_assetConfirmation_page;
	}
	public WebElement getMove_Button_On_All_AssetPage() {
		return Move_Button_On_All_AssetPage;
	}
	public WebElement getLocation_Reason_TExtBox_On_Transfer_AssetPage() {
		return Location_Reason_TExtBox_On_Transfer_AssetPage;
	}
	public WebElement getCheckBox_Notify_if_not_returned_in_Time() {
		return CheckBox_Notify_if_not_returned_in_Time;
	}
	public WebElement getNotify_User_Dropdown_On_Transfer_Asset_Page() {
		return Notify_User_Dropdown_On_Transfer_Asset_Page;
	}
	public WebElement getNext_Button() {
		return Next_Button;
	}
	public WebElement getCancel_Button() {
		return Cancel_Button;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}
	public WebElement getSlider_On_Transfer_Asset_Page() {
		return Slider_On_Transfer_Asset_Page;
	}
	public WebElement getSelect_property_Dropdown_On_Permanent_TransferPage() {
		return select_property_Dropdown_On_Permanent_TransferPage;
	}
	public WebElement getQR_Button() {
		return QR_Button;
	}
	public WebElement getAdd_Asset_Button() {
		return Add_Asset_Button;
	}
	public WebElement getAdd_Single_Asset_Button() {
		return Add_Single_Asset_Button;
	}
	public WebElement getAsset_Name_TextBox() {
		return Asset_Name_TextBox;
	}
	public WebElement getCategory_Name_TextBox() {
		return Category_Name_TextBox;
	}
	public WebElement getCondition_Dropdown() {
		return Condition_Dropdown;
	}
	public WebElement getSpec_Rating_TextBox() {
		return Spec_Rating_TextBox;
	}
	public WebElement getVendor_Name_on_General_DetailsPage() {
		return Vendor_Name_on_General_DetailsPage;
	}
	public WebElement getPAT_Dropdown() {
		return PAT_Dropdown;
	}
	public WebElement getSrNo_TextBox() {
		return SrNo_TextBox;
	}
	public WebElement getManufacturer_TextBox() {
		return Manufacturer_TextBox;
	}
	public WebElement getModel_TExtBox() {
		return Model_TExtBox;
	}
	public WebElement getAsset_Tag_No_TextBox() {
		return Asset_Tag_No_TextBox;
	}
	public WebElement getProperty_Dropdown() {
		return Property_Dropdown;
	}
	public WebElement getLocation_Dropdown() {
		return Location_Dropdown;
	}
	public WebElement getOwnership_TextBox() {
		return Ownership_TextBox;
	}
	public WebElement getAdd_Warranty_Details_Icon() {
		return Add_Warranty_Details_Icon;
	}
	public WebElement getVendor_Name_On_Warranty_DetailsPage() {
		return Vendor_Name_On_Warranty_DetailsPage;
	}
	public WebElement getContact_Person_TextBox_On_Warranty_DetailsPage() {
		return Contact_Person_TextBox_On_Warranty_DetailsPage;
	}
	public WebElement getContact_No_On_Warranty_DetailsPage() {
		return Contact_No_On_Warranty_DetailsPage;
	}
	public WebElement getAltername_No_On_Warranty_DetailsPage() {
		return Altername_No_On_Warranty_DetailsPage;
	}
	public WebElement getEmail_On_Warranty_DetailsPage() {
		return Email_On_Warranty_DetailsPage;
	}
	public WebElement getNo_of_Services_On_Warranty_DetailsPage() {
		return No_of_Services_On_Warranty_DetailsPage;
	}
	public WebElement getAdd_AMC_Drtais_ICON() {
		return Add_AMC_Drtais_ICON;
	}
	public WebElement getVendor_Name_On_AMC_DetailsPage() {
		return Vendor_Name_On_AMC_DetailsPage;
	}
	public WebElement getContactPerson_On_AMC_DetailsPage() {
		return ContactPerson_On_AMC_DetailsPage;
	}
	public WebElement getContact_No_On_AMC_DetailsPage() {
		return Contact_No_On_AMC_DetailsPage;
	}
	public WebElement getAltername_No_On_AMC_DetailsPage() {
		return Altername_No_On_AMC_DetailsPage;
	}
	public WebElement getEmail__On_AMC_DetailsPage() {
		return Email__On_AMC_DetailsPage;
	}
	public WebElement getNo_Of_Services_On_AMC_DetailsPage() {
		return No_Of_Services_On_AMC_DetailsPage;
	}
	public WebElement getAMC_Type_Dropdown() {
		return AMC_Type_Dropdown;
	}
	public WebElement getCreate_Asset_Button() {
		return Create_Asset_Button;
	}


    //Business Logic
	public void ClickOn_In_Transit_Button()
	{
		In_Transit_Button.click();
	}
	public void ClickOn_Lost_and_Discard_Button()
	{
		Lost_and_Discard_Button.click();
	}
	public void ClickOn_All_Assets_Button()
	{
		All_Assets_Button.click();
	}
	public void ClickOn_dynamic_Click_On_AssetName()
	{
		dynamic_Click_On_AssetName.click();
	}
	public void ClickOn_Preventive_Maintenance_Button()
	{
		Preventive_Maintenance_Button.click();
	}
	public void ClickOn_Tickets_Button()
	{
		Tickets_Button.click();
	}
	public void ClickOn_Parts_Button()
	{
		Parts_Button.click();
	}
	public void ClickOn_Depreciation_Button()
	{
		Depreciation_Button.click();
	}
	public void ClickOn_Logs_Button()
	{
		Logs_Button.click();
	}
	public void ClickOn_Notify_Button()
	{
		Notify_Button.click();
	}
	public void ClickOn_PAT_Button()
	{
		PAT_Button.click();
	}
	public void ClickOn_Print_QR_Code()
	{
		Print_QR_Code.click();
	}
	public void ClickOn_View_Or_Edit_Location_Button_On_InfoPage()
	{
		View_Or_Edit_Location_Button_On_InfoPage.click();
	}
	public void ClickOn_Select_Location_Dropdown_On_View_Or_Edit_Page_visibleText(String Text)
	{
		Select sel=new Select(Select_Location_Dropdown_On_View_Or_Edit_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Location_Dropdown_On_View_Or_Edit_Page_Index(int Index)
	{
		Select sel=new Select(Select_Location_Dropdown_On_View_Or_Edit_Page);
		sel.selectByIndex(Index);
	}
	public void ClickOn_Select_Location_Dropdown_On_View_Or_Edit_Page_ByValue(String Value)
	{
		Select sel=new Select(Select_Location_Dropdown_On_View_Or_Edit_Page);
		sel.selectByValue(Value);
	}
	public void ClickON_Set_New_Location_Button_On_View_Or_Edit_Page()
	{
		Set_New_Location_Button_On_View_Or_Edit_Page.click();
	}
	public void ClickOn_Ok_Button_On_View_Or_Edit_Confirmation_Page()
	{
		Ok_Button_On_View_Or_Edit_Confirmation_Page.click();
	}
	public void ClickOn_General_Details_Edit_ButtonOn_Infopage()
	{
		General_Details_Edit_ButtonOn_Infopage.click();
	}
	public void ClickOn_Cancel_Button_On_Edit_General_details_page()
	{
		Cancel_Button_On_Edit_General_details_page.click();
	}
	public void ClickOn_Confirm_Changes_Button_On_Edit_General_details_page()
	{
		Confirm_Changes_Button_On_Edit_General_details_page.click();
	}
	public void ClickOn_Ok_Button_On_Edit_Asset_details_Confirmation_page()
	{
		Ok_Button_On_Edit_Asset_details_Confirmation_page.click();
	}
	public void ClickOn_Warranty_Edit_Button_On_info_Page()
	{
		Warranty_Edit_Button_On_info_Page.click();
	}
	public void ClickOn_Confirm_Changes_Button_On_Warranty_edit_Page()
	{
		Confirm_Changes_Button_On_Warranty_edit_Page.click();
	}
	public void ClickOn_Cancel_Button_On_Warranty_edit_Page()
	{
		Cancel_Button_On_Warranty_edit_Page.click();
	}
	public void CLickOn_Warranty_Support_History_Button()
	{
		Warranty_Support_History_Button.click();
	}
	public void ClickOn_Ok_Button_On_Confirmation_Page()
	{
		Ok_Button_On_Confirmation_Page.click();
	}
	public void ClickOn_Add_New_Service_Button_On_Warranty_Support_History_Page()
	{
		Add_New_Service_Button_On_Warranty_Support_History_Page.click();
	}
	public void ClickOn_Reason_for_Servicing_TextField(String Enter_Reason)
	{
		Reason_for_Servicing_TextField.sendKeys(Enter_Reason);
	}
	public void ClickOn_Select_ticket_Dropdown_By_VisibleText(String Text)
	{
		Select sel=new Select(Select_ticket_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_ticket_Dropdown_By_Value(String Value)
	{
		Select sel=new Select(Select_ticket_Dropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_Select_ticket_Dropdown_By_Index(int Index)
	{
		Select sel=new Select(Select_ticket_Dropdown);
		sel.selectByIndex(Index);
	}
	public void ClickOn_SLider()
	{
			SLider.click();
	}
	public void Select_Service_Start_Time_Button()
	{
		Select_Service_Start_Time_Button.click();
	}
	public void ClickON_Service_Start_And_End_Time_Hours_TextBox(String Enter_Start_Hours_Time)
	{
		WebElement htime = Service_Start_And_End_Time_Hours_TextBox;
		htime.click();
		htime.clear();
		htime.sendKeys(Enter_Start_Hours_Time);
	}
	public void Service_Start_And_End_Time_Minutes_TextBox(String Enter_Start_Minute_Time)
	{
        WebElement mtime = Service_Start_And_End_Time_Minutes_TextBox;
        mtime.click();
        mtime.clear();
        mtime.sendKeys(Enter_Start_Minute_Time);
	}
	public void ClickOn_Set_Button_On_StartTime_Hours_TextBox()
	{
		Set_Button_On_StartTime_Hours_TextBox.click();
	}
	public void ClickOn_Cancel_Button_On_Service_End_Time_TextBox()
	{
		Cancel_Button_On_Service_End_Time_TextBox.click();
	}
	public void CLickOn_Service_EndTime_Button()
	{
		Service_EndTime_Button.click();
	}
	public void CLickOn_Service_Persons_Name_TextBox(String Enter_Service_Person_Name)
	{
		Service_Persons_Name_TextBox.sendKeys(Enter_Service_Person_Name);
	}
	public void ClickOn_Parts_Repaired_NameText_Box(String Part_Repaired_Name)
	{
		Parts_Repaired_NameText_Box.sendKeys(Part_Repaired_Name);
	}
	public void ClickOn_Select_Part_DropdownBy_VisibleText(String Text)
	{
		Select sel=new Select(Select_Part_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Part_DropdownBy_Value(String Value)
	{
		Select sel=new Select(Select_Part_Dropdown);
		sel.selectByValue(Value);
	}
	public void CLickOn_Select_Part_Dropdown_ByIndex(int Index)
	{
		Select sel=new Select(Select_Part_Dropdown);
		sel.selectByIndex(Index);
	}
	public void CLickOn_Quantity_TExtBox_On_Add_New_Warranty_Service_Page(CharSequence ENter_Quantity)
	{
		Quantity_TExtBox_On_Add_New_Warranty_Service_Page.sendKeys(ENter_Quantity);
	}
	public void CLickOn_Details_TExt_Field(String Details)
	{
		Details_TExt_Field.sendKeys(Details);
	}
	public void ClickOn_AdditionalCost_TextField(String Additional_Cost)
	{
		AdditionalCost_TextField.sendKeys(Additional_Cost);
	}
	public void ClickOn_AttachFile_icon()
	{
		AttachFile_icon.click();
	}
	public void ClickOn_Upload_File_Icon(String ENter_Path)
	{
		Upload_File_Icon.sendKeys(ENter_Path);
	}
	public void ClickOn_Comments_TextField(String ENter_Comments)
	{
		Comments_TextField.sendKeys(ENter_Comments);
	}
	public void ClickOn_Add_Services_Button()
	{
		Add_Services_Button.click();
	}
	public void CLickOn_Cancel_Button_On_Add_New_Warranty_Service()
	{
		Cancel_Button_On_Add_New_Warranty_Service.click();
	}
	public void CLickOn_AMC_History_Button()
	{
		AMC_History_Button.click();
	}
	public void CLickOn_Edit_AMC_Button()
	{
		Edit_AMC_Button.click();
	}
	public void ClickOn_Warranty_Attach_File_Icon()
	{
		Warranty_Attach_File_Icon.click();
	}
	public void ClickOn_Warranty_upload_Icon(String ENter_Path)
	{
		Warranty_upload_Icon.sendKeys(ENter_Path);
	}
	public void ClickOn_Warranty_Upload_Button()
	{
		Warranty_Upload_Button.click();
	}
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
	public void ClickOn_Today_Button()
	{
		Today_Button.click();
	}
	public void CLickOn_Filter_Icon()
	{
		Filter_Icon.click();
	}
	public void ClickOn_Filter_By_Name(String Name)
	{
		Filter_By_Name.sendKeys(Name);
	}
	public void ClickOn_Filter_By_AssignedTo()
	{
		Filter_By_AssignedTo.click();
	}
	public void ClickOn_Filter_By_AssignedTo_SearchBox_OnPm(String Search_Assigned_To)
	{
		Filter_By_AssignedTo_SearchBox_OnPm.sendKeys(Search_Assigned_To);
	}
	public void ClickOn_Filter_By_AssignedTo_DynamicText()
	{
		Filter_By_AssignedTo_DynamicText.click();
	}
	public void ClickOn_Filter_By_Apply_Button()
	{
		Filter_By_Apply_Button.click();
	}
	public void clickon_Filter_By_Clear_Button()
	{
		Filter_By_Clear_Button.click();
	}
	public void ClickOn_Parked_Ticket_Button_On_Tickets_Page()
	{
		Parked_Ticket_Button_On_Tickets_Page.click();
	}
	public void ClickOn_Not_Valid_Button_On_Tickets_Page()
	{
		Not_Valid_Button_On_Tickets_Page.click();
	}
	public void ClickOn_Closed_Button_On_Tickets_Page()
	{
		Closed_Button_On_Tickets_Page.click();
	}
	public void CLickOn_Open_Tickets_On_Tickets_Page()
	{
		Open_Tickets_On_Tickets_Page.click();
	}
	public void CLickOn_Filter_By_Ticket_No_TExtField(String ENter_Ticket_No)
	{
		Filter_By_Ticket_No_TExtField.sendKeys(ENter_Ticket_No);
	}
	public void ClickOn_Filter_By_Title_TExtField(String ENter_Title)
	{
		Filter_By_Title_TExtField.sendKeys(ENter_Title);
	}
	public void ClickOn_Filter_By_select_Priority_Button()
	{
		Filter_By_select_Priority_Button.click();
	}
	public void ClickOn_Filter_By_Low_Priority()
	{
		Filter_By_Low_Priority.click();
	}
	public void ClickOn_Filter_By_High_Priority()
	{
		Filter_By_High_Priority.click();
	}
	public void ClickOn_Filter_By_Medium_Priority()
	{
		Filter_By_Medium_Priority.click();
	}
   public void ClickOn_Filter_By_Select_AssignedTo()
   {
	   Filter_By_Select_AssignedTo.click();
   }
   public void ClickOn_Filter_By_AssignedTo_SearchBox_OnTickets(String Search_AssignedTo)
   {
	   Filter_By_AssignedTo_SearchBox_OnTickets.sendKeys(Search_AssignedTo);
   }
   public void Filter_By_Select_Raised_By()
   {
	   Filter_By_Select_Raised_By.click();
   }
   public void ClickOn_Raise_a_Ticket_Button_On_Asset_TicketsPage()
   {
	   Raise_a_Ticket_Button_On_Asset_TicketsPage.click();
   }
   public void ClickOn_Select_Property_Dropdown_ByVisibleText(String Text)
   {
       Select sel=new Select(Select_Property_Dropdown);
       sel.selectByVisibleText(Text);
   }
   public void ClickOn__Select_Property_Dropdown_By_Value(String Value)
   {
	   Select sel=new Select(Select_Property_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Select_Property_Dropdown_By_Index(int Index)
   {
	   Select sel=new Select(Select_Property_Dropdown);
       sel.selectByIndex(Index);
   }
   public void ClickOn_Enter_TextField_On_Raise_a_TicketPage(String Enter_Text)
   {
	   Enter_TextField_On_Raise_a_TicketPage.sendKeys(Enter_Text);
   }
   public void ClickOn_Description_TextBox_On_Raise_a_TicketPage(String Description)
   {
	   Description_TextBox_On_Raise_a_TicketPage.sendKeys(Description);
   }
   public void ClickOn_Slider_On_Raise_a_TicketPage()
   {
	   Slider_On_Raise_a_TicketPage.click();
   }
   public void ClickOn_Select_Priority_Low_On_Raise_a_TicketPage()
   {
	   Select_Priority_Low_On_Raise_a_TicketPage.click();
   }
   public void ClickOn_Select_Priority_High_On_Raise_a_TicketPage()
   {
	   Select_Priority_High_On_Raise_a_TicketPage.click();
   }
   public void ClickOn_Select_Priority_Medium_On_Raise_a_TicketPage()
   {
	   Select_Priority_Medium_On_Raise_a_TicketPage.click();
   }
   public void ClickOn_Image_Upload_Icon_On_Raise_a_TicketPage(String Enter_path)
   {
	   Image_Upload_Icon_On_Raise_a_TicketPage.sendKeys(Enter_path);
   }
   public void ClickOn_Video_Upload_Icon_On_Raise_a_TicketPage(String Enter_path)
   {
	   Video_Upload_Icon_On_Raise_a_TicketPage.sendKeys(Enter_path);
   }
   public void ClickOn_Select_Department_Dropdown_On_Raise_a_TicketPage()
   {
	   Select_Department_Dropdown_On_Raise_a_TicketPage.click();
   }
//   public void ClickOn_Select_Department_Dropdown_On_Raise_a_TicketPage_By_Value(String Value)
//   {
//	   Select sel=new Select(Select_Department_Dropdown_On_Raise_a_TicketPage);
//	   sel.selectByValue(Value);
//   }
//   public void ClickOn_Select_Department_Dropdown_On_Raise_a_TicketPage_By_Index(int Index)
//   {
//	   Select sel=new Select(Select_Department_Dropdown_On_Raise_a_TicketPage);
//	   sel.selectByIndex(Index);
//   }
   public void ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage()
   {
	   Select_User_Dropdown_On_Raise_a_TicketPage.click();
   }
//   public void ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage_ByValue(String Value)
//   {
//	   Select sel=new Select(Select_User_Dropdown_On_Raise_a_TicketPage);
//	   sel.selectByValue(Value);
//   }
//   public void ClickOn_Select_User_Dropdown_On_Raise_a_TicketPage_ByIndex(int Index)
//   {
//	   Select sel=new Select(Select_User_Dropdown_On_Raise_a_TicketPage);
//	   sel.selectByIndex(Index);
//   }
   public void ClickOn_Create_Button_On_Raise_a_TicketPage()
   {
	   Create_Button_On_Raise_a_TicketPage.click();
   }
   public void ClickOn_Cancel_Button_On_Raise_a_TicketPage()
   {
	   Cancel_Button_On_Raise_a_TicketPage.click();
   }
   public void CLickOn_Used_Button_On_Asset_PartsPage()
   {
	   Used_Button_On_Asset_PartsPage.click();
   }
   public void CLickOn_All_Associated_Button_On_Asset_PartsPage()
   {
	   All_Associated_Button_On_Asset_PartsPage.click();
   }
   public void CLickOn_Filter_By_PartName_Button_On_InfoPartsPage()
   {
	   Filter_By_PartName_Button_On_InfoPartsPage.click();
   }
   public void ClickOn_Filter_By_PartName_SearchBox_On_InfoPartsPage(String Search_Part_No)
   {
	   Filter_By_PartName_SearchBox_On_InfoPartsPage.sendKeys(Search_Part_No);
   }
   public void ClickOn_Filter_By_Dynamic_PartName_On_InfoPartsPage()
   {
	   Filter_By_Dynamic_PartName_On_InfoPartsPage.click();
   }
   public void ClickOn_Filter_By_Quantity_TextFiled_On_InfoPartsPage(String Enter_Quantity)
   {
	   Filter_By_Quantity_TextFiled_On_InfoPartsPage.sendKeys(Enter_Quantity);
   }
   public void ClickOn_Filter_By_Part_No_Button_On_InfoPartsPage()
   {
	   Filter_By_Part_No_Button_On_InfoPartsPage.click();
   }
   public void ClickOn_Filter_By_PartNo_SearchBox(String Search_PartNo)
   {
	   Filter_By_PartNo_SearchBox_On_InfoPartsPage.sendKeys(Search_PartNo);
   }
   public void ClickOn_Associate_a_Part_Button()
   {
	   Associate_a_Part_Button.click();
   }
   public void ClickOn_Select_Part_Dropdown_On_Associate_a_PartPage_By_VisibleText(String Text)
   {
	   Select sel=new Select(Select_Part_Dropdown_On_Associate_a_PartPage);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Select_Part_Dropdown_On_Associate_a_PartPage_By_Value(String Value)
   {
	   Select sel=new Select(Select_Part_Dropdown_On_Associate_a_PartPage);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Select_Part_Dropdown_On_Associate_a_PartPage_By_Index(int Index)
   {
	   Select sel=new Select(Select_Part_Dropdown_On_Associate_a_PartPage);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Attach_Part_Button_On_Associate_a_PartPage()
   {
	   Attach_Part_Button_On_Associate_a_PartPage.click();
   }
   public void ClickOn_Ok_Button_On_Associate_a_Part_ConfirmationPage()
   {
	   Ok_Button_On_Associate_a_Part_ConfirmationPage.click();
   }
   public void ClickOn_Edit_Button_On_Depreciation_Page()
   {
	   Edit_Button_On_Depreciation_Page.click();
   }
   public void ClickOn_Purchase_Price_TextField_On_Edit_Depreciation(String Enter_Purchase_Price)
   {
	   Purchase_Price_TextField_On_Edit_Depreciation.sendKeys(Enter_Purchase_Price);
   }
   public void ClicOn_Residual_Price_TextField_On_Edit_Depreciation(String Enter_Residual_Price)
   {
	   Residual_Price_TextField_On_Edit_Depreciation.sendKeys(Enter_Residual_Price);
   }
   public void ClickOn_Usefull_Life_Yrs_TextField_On_Edit_Depreciation(String Usefull_Life_Yrs)
   {
	   Usefull_Life_Yrs_TextField_On_Edit_Depreciation.sendKeys(Usefull_Life_Yrs);
   }
   public void ClickOn_Update_Button_On_Edit_Depreciation()
   {
	   Update_Button_On_Edit_Depreciation.click();
   }
   public void ClickOn_Ok_Button_On_Confirmation_Edit_Depreciation()
   {
	   Ok_Button_On_Confirmation_Edit_Depreciation.click();
   }
   public void ClickOn_Filter_By_Acitivity_TextFiled_OnLogs_Page(String Enter_Activity)
   {
	   Filter_By_Acitivity_TextFiled_OnLogs_Page.sendKeys(Enter_Activity);
   }
   public void ClickOn_Filter_By_Associate_TextFiled_OnLogs_Page(String Associate)
   {
	   Filter_By_Associate_TextFiled_OnLogs_Page.sendKeys(Associate);
   }
   public void ClickOn_Filter_By_Type_Of_Log_OnLogs_Page()
   {
	   Filter_By_Type_Of_Log_OnLogs_Page.click();
   }
   public void ClickOn_Filter_By_Type_Of_Log_SearchBox_OnLogs_Page(String Seardch_Type_Of_Log)
   {
	   Filter_By_Type_Of_Log_SearchBox_OnLogs_Page.sendKeys(Seardch_Type_Of_Log);
   }
   public void ClickOn_Filter_By_File_Name_On_LOgs_Files_Page(String Enter_File_Name)
   {
	   Filter_By_File_Name_On_LOgs_Files_Page.sendKeys(Enter_File_Name);
   }
   public void ClickOn_Filter_By_Uploaded_By_On_LOgs_Files_Page()
   {
	   Filter_By_Uploaded_By_On_LOgs_Files_Page.click();
   }
   public void CLickOn_Filter_By_Uploaded_By_SearchBox_On_LOgs_Files_Page(String Search_Uploaded_By)
   {
	   Filter_By_Uploaded_By_SearchBox_On_LOgs_Files_Page.sendKeys(Search_Uploaded_By);
   }
   public void ClickOn_Reports_Button()
   {
	   Reports_Button.click();
   }
   public void ClickOn_Filter_Icon_On_Asset_Reports_Page()
   {
	   Filter_Icon_On_Asset_Reports_Page.click();
   }
   public void ClickOn_Export_Button_On_Asset_Reports_Page()
   {
	   Export_Button_On_Asset_Reports_Page.click();
   }
   public void ClickOn_Download_As_PDF_Tab_In_Export_Button_Asset_Reports_Page()
   {
	   Download_As_PDF_Tab_In_Export_Button_Asset_Reports_Page.click();
   }
   public void ClickOn_Filter_By_Property_On_All_AssetPage()
   {
	   Filter_By_Property_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Property_SearchBox_On_All_AssetPage(String Search_Property)
   {
	   Filter_By_Property_SearchBox_On_All_AssetPage.sendKeys(Search_Property);
   }
   public void ClickOn_Filter_By_Dyanamic_PropertyName_On_All_AssetPage()
   {
	   Filter_By_Dyanamic_PropertyName_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Asset_On_All_AssetPage()
   {
	   Filter_By_Asset_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Asset_SearchBox_On_All_AssetPage(String Quantity)
   {
	   Filter_By_Asset_SearchBox_On_All_AssetPage.sendKeys(Quantity);
   }
   public void ClickOn_Filter_By_Dyanamic_AssetName_On_All_AssetPage()
   {
	   Filter_By_Dyanamic_AssetName_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Manufacturer_TextBox_On_All_AssetPage(String Manufacturer)
   {
	   Filter_By_Manufacturer_TextBox_On_All_AssetPage.sendKeys(Manufacturer);
   }
   public void ClickOn_Filter_By_Status_On_All_AssetPage()
   {
	   Filter_By_Status_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Status_Breakdown_On_All_AssetPage()
   {
	   Filter_By_Status_Breakdown_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Status_Inactive_On_All_AssetPage()
   {
	   Filter_By_Status_Inactive_On_All_AssetPage.click();
   }
   public void CLickOn_Filter_By_Status_Active_On_All_AssetPage()
   {
	   Filter_By_Status_Active_On_All_AssetPage.click();
   }
   public void ClickOn_Filter_By_Transfer_Type_On_In_TransitPage()
   {
	   Filter_By_Transfer_Type_On_In_TransitPage.click();
   }
   public void ClickOn_Filter_By_Transfer_Type_Temporary_On_In_TransitPage()
   {
	   Filter_By_Transfer_Type_Temporary_On_In_TransitPage.click();
   }
   public void ClickOn_Filter_By_Transfer_Type_Permanent_On_In_TransitPage()
   {
	   Filter_By_Transfer_Type_Permanent_On_In_TransitPage.click();
   }
   public void ClickOn_Dynamic_Radio_Button_On_Asset()
   {
	   Dynamic_Radio_Button_On_Asset.click();
   }
   public void ClickOn_Duplicate_Button_on_All_AssetPage()
   {
	   Duplicate_Button_on_All_AssetPage.click();
   }
   public void ClickOn_Yes_Duplicate_Button_Permission_Page()
   {
	   Yes_Duplicate_Button_Permission_Page.click();
   }
   public void ClickOn_Ok_Button_On_Duplicate_assetConfirmation_page()
   {
	   Ok_Button_On_Duplicate_assetConfirmation_page.click();
   }
   public void ClickOn_Move_Button_On_All_AssetPage()
   {
	   Move_Button_On_All_AssetPage.click();
   }
   public void ClickOn_Location_Reason_TExtBox_On_Transfer_AssetPage(String Loaction_Reason)
   {
	   Location_Reason_TExtBox_On_Transfer_AssetPage.sendKeys(Loaction_Reason);
   }
   public void ClickOn_CheckBox_Notify_if_not_returned_in_Time()
   {
	   CheckBox_Notify_if_not_returned_in_Time.click();
   }
   public void ClickOn_Notify_User_Dropdown_On_Transfer_Asset_Page_By_VisibleText(String Text)
   {
	   Select sel=new Select(Notify_User_Dropdown_On_Transfer_Asset_Page);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Notify_User_Dropdown_On_Transfer_Asset_Page_ByValue(String Value)
   {
           Select sel=new Select(Notify_User_Dropdown_On_Transfer_Asset_Page);
           sel.selectByValue(Value);
   }
   public void ClickOn_Notify_User_Dropdown_On_Transfer_Asset_Page_By_Index(int Index)
   {
	   Select sel=new Select(Notify_User_Dropdown_On_Transfer_Asset_Page);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Next_Button()
   {
	   Next_Button.click();
   }
   public void ClickOn_Cancel_Button()
   {
	   Cancel_Button.click();
   }
   public void ClickOn_Back_Button()
   {
	   Back_Button.click();
   }
   public void ClickOn_Slider_On_Transfer_Asset_Page()
   {
	   Slider_On_Transfer_Asset_Page.click();
   }
   public void ClickOn_select_property_Dropdown_On_Permanent_TransferPage_By_VisibleText(String Text)
   {
	   Select sel=new Select(select_property_Dropdown_On_Permanent_TransferPage);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_select_property_Dropdown_On_Permanent_TransferPage_By_Value(String Value)
   {
	   Select sel=new Select(select_property_Dropdown_On_Permanent_TransferPage);
	   sel.selectByValue(Value);
   }
   public void ClickOn_select_property_Dropdown_On_Permanent_TransferPage_By_Index(int Index)
   {
	   Select sel=new Select(select_property_Dropdown_On_Permanent_TransferPage);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_QR_Button()
   {
	   QR_Button.click();
   }
   public void ClickOn_Add_Asset_Button()
   {
	   Add_Asset_Button.click();
   }
   public void Clickon_Add_Single_Asset_Button()
   {
	   Add_Single_Asset_Button.click();
   }
   public void ClickOn_Asset_Name_TextBox(String Asset_Name)
   {
	   Asset_Name_TextBox.sendKeys(Asset_Name);
   }
   public void ClickOn_Category_Name_TextBox(String Category_Name)
   {
	   Category_Name_TextBox.sendKeys(Category_Name);
   }
   public void ClickOn_Condition_Dropdown_By_VisibleText(String Text)
   {
        Select sel=new Select(Condition_Dropdown);
        sel.selectByVisibleText(Text);
   }
   public void ClickOn_Condition_Dropdown_ByValue(String Value)
   {
	   Select sel=new Select(Condition_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Condition_Dropdown_By_Index(int Index)
   {
	   Select sel=new Select(Condition_Dropdown);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Spec_Rating_TextBox(String Enter_Spec_Rating)
   {
	   Spec_Rating_TextBox.sendKeys(Enter_Spec_Rating);
   }
   public void ClickOn_Vendor_Name_on_General_DetailsPage(String Enter_Vendor_Name)
   {
	   Vendor_Name_on_General_DetailsPage.sendKeys(Enter_Vendor_Name);
   }
   public void ClickOn_PAT_Dropdown_By_VisibleText(String Text)
   {
      Select sel=new Select(PAT_Dropdown);
      sel.selectByVisibleText(Text);
   }
   public void ClickOn_PAT_Dropdown_By_Index(int Index)
   {
	   Select sel=new Select(PAT_Dropdown);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_PAT_Dropdown_By_Value(String Value)
   {
	   Select sel=new Select(PAT_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_SrNo_TextBox(String SrNo)
   {
	   SrNo_TextBox.sendKeys(SrNo);
   }
   public void ClickOn_Manufacturer_TextBox(String Manufacturer)
   {
	   Manufacturer_TextBox.sendKeys(Manufacturer);
   }
   public void ClickOn_Model_TExtBox(String Model)
   {
	   Model_TExtBox.sendKeys(Model);
   }
   public void ClickOn_Asset_Tag_No_TextBox(String Asset_Tag_No)
   {
	   Asset_Tag_No_TextBox.sendKeys(Asset_Tag_No);
   }
   public void ClickOn_Property_Dropdown_By_VisibleText(String Text)
   {
	   Select sel=new Select(Property_Dropdown);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Property_Dropdown_By_Value(String Value)
   {
	   Select sel=new Select(Property_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Property_Dropdown_By_Index(int Index)
   {
	   Select sel=new Select(Property_Dropdown);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Location_Dropdown_By_VisibleText(String Text)
   {
	   Select sel=new Select(Location_Dropdown);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Location_Dropdown_By_Value(String Value)
   {
	   Select sel=new Select(Location_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Location_Dropdown_By_Index(int Index)
   {
	   Select sel=new Select(Location_Dropdown);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Ownership(String OwnerShip)
   {
	   Ownership_TextBox.sendKeys(OwnerShip);
   }
   public void ClickckOnFilter_By_AssignedTo_SearchBox_OnTickets(String AssignedTo)
   {
	   Filter_By_AssignedTo_SearchBox_OnTickets.sendKeys(AssignedTo);
   }
//   public void ClickOn_Ownership_Dropdown_By_VisibleText(String Text)
//   {
//	   Select sel=new Select(Ownership_Dropdown);
//	   sel.selectByVisibleText(Text);
//   }
//   public void ClickOn_Ownership_Dropdown_By_Value(String Value)
//   {
//	   Select sel=new Select(Ownership_Dropdown);
//	   sel.selectByValue(Value);
//   }
   public void ClickOn_Add_Warranty_Details_Icon()
   {
	   Add_Warranty_Details_Icon.click();
   }
   public void ClickOn_Vendor_Name_On_Warranty_DetailsPage(String Vendor_Name)
   {
	   Vendor_Name_On_Warranty_DetailsPage.sendKeys(Vendor_Name);
   }
   public void ClickOn_Contact_Person_TextBox_On_Warranty_DetailsPage(String Contact_Person)
   {
	   Contact_Person_TextBox_On_Warranty_DetailsPage.sendKeys(Contact_Person);
   }
   public void ClickOn_Contact_No_On_Warranty_DetailsPage(String Contact_No)
   {
	   Contact_No_On_Warranty_DetailsPage.sendKeys(Contact_No);
   }
   public void ClickOn_Altername_No_On_Warranty_DetailsPage(String Alternate_No)
   {
	   Altername_No_On_Warranty_DetailsPage.sendKeys(Alternate_No);
   }
   public void ClickOn_Email_On_Warranty_DetailsPage(String Enter_Email)
   {
	   Email_On_Warranty_DetailsPage.sendKeys(Enter_Email);
   }
   public void ClickOn_No_of_Services_On_Warranty_DetailsPage(String No_Of_Services)
   {
	   No_of_Services_On_Warranty_DetailsPage.sendKeys(No_Of_Services);
   }
   public void ClickOn_Add_AMC_Drtais_ICON()
   {
	   Add_AMC_Drtais_ICON.click();
   }
   public void ClickOn_Vendor_Name_On_AMC_DetailsPage(String AMC_Vendor_Name)
   {
	   Vendor_Name_On_AMC_DetailsPage.sendKeys(AMC_Vendor_Name);
   }
   public void ClickOn_ContactPerson_On_AMC_DetailsPage(String Contact_Person)
   {
	   ContactPerson_On_AMC_DetailsPage.sendKeys(Contact_Person);
   }
   public void ClickOn_Contact_No_On_AMC_DetailsPage(String Contact_No)
   {
	   Contact_No_On_AMC_DetailsPage.sendKeys(Contact_No);
   }
   public void ClickOn_Altername_No_On_AMC_DetailsPage(String Alternate_No)
   {
	   Altername_No_On_AMC_DetailsPage.sendKeys(Alternate_No);
   }
   public void ClickOn_Email__On_AMC_DetailsPage(String AMC_Email)
   {
	   Email__On_AMC_DetailsPage.sendKeys(AMC_Email);
   }
   public void ClickOn_No_Of_Services_On_AMC_DetailsPage(String No_Of_Services)
   {
	   No_Of_Services_On_AMC_DetailsPage.sendKeys(No_Of_Services);
   }
   public void ClickOn_AMC_Type_Dropdown_By_VisibleText(String Text)
   {
	   Select sel=new Select(AMC_Type_Dropdown);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_AMC_Type_Dropdown_By_Value(String Value)
   {
	   Select sel=new Select(AMC_Type_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_AMC_Type_Dropdown_By_Index(int Index)
   {
       Select sel=new Select(AMC_Type_Dropdown);
       sel.selectByIndex(Index);
   }
   public void ClickOn_Create_Asset_Button()
   {
	   Create_Asset_Button.click();
   }
   public void ClickOn_Filter_By_PartNo_SearchBox_On_InfoPartsPage(String PartNo)
   {
	   Filter_By_PartNo_SearchBox_On_InfoPartsPage.sendKeys(PartNo);
   }
   public void ClickOn_ManufacturerEmailId(String Enter_EmailId)
   {
	   ManufacturerEmailId.sendKeys(Enter_EmailId);
   }
   public void ClickAfterenteringManufacturerEmailId()
   {
	   ManufacturerEmailId.click();
   }
   public void SelecctNotificationDropdown_OnAddAssetsForm(String Enter_Yes_No)
   {
	   Select sel=new Select(NotificationDropdown_OnAddAssetsForm);
	   sel.selectByVisibleText(Enter_Yes_No);
   }
   public void ClickOn_PurchasePrice_OnAddAssetsForm(String Enter_Price)
   {
	   PurchasePrice_OnAddAssetsForm.sendKeys(Enter_Price);
   }
   public void Select_TPI_Dropdown_OnAddAssetsForm(String Text)
   {
	   Select sel=new Select(TPI_Dropdown_OnAddAssetsForm);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_ViewTicketButton()
   {
	   ViewTicketButton.click();
   }
   public void SelectTicketStatusDropdown_byVisibleText(String TExt)
   {
	   Select sel=new Select(TicketStatusDropdown);
			   sel.selectByVisibleText(TExt);
   }
   public void ClickOn_TicketRemark(String Enter_Remark)
   {
	   TicketRemark.sendKeys(Enter_Remark);
   }
   public void ClickOn_RemarkSubmitButton()
   {
	   RemarkSubmitButton.click();
   }
   public void ClicKOn_OkButton_OnTicketClosed()
   {
	   OkButton_OnTicketClosed.click();
   }
   public void ClickOn_RemarkTextFieldOnAssetStatus(String ENter_Remark)
   {
	   RemarkTextFieldOnAssetStatus.sendKeys(ENter_Remark);
   }
   public void ClickOn_SaveButtonOnRemark()
   {
	   SaveButtonOnRemark.click();
	   
   }
   public void ClickOn_OkButton_LostSuccess()
   {
	   OkButton_LostSuccess.click();
   }
   public void SelectTicketType(String Text)
   {
	  Select sel=new Select(TicketType);
	  sel.selectByVisibleText(Text);
   }
   public void ClickOn_PartsDropdownOn_AttachPartsPage()
   {
	   PartsDropdownOn_AttachPartsPage.click();
   }
   public void ClickoN_SaveButton_OnAttachPartsPage()
   {
	   SaveButton_OnAttachPartsPage.click();
   }
   public void ClickOn_OkButton_OnAsset_part_associated_successfully()
   {
	   OkButton_OnAsset_part_associated_successfully.click();
   }
   public void clickOn_CReateScheduleBUtton_OnPAT()
   {
	   CReateScheduleBUtton_OnPAT.click();
   }
   public void Select_PropertyDropwnOn_ScheduleYourPAT_TestingPage(String Enter_PropertyName)
   {
	   Select sel=new Select(PropertyDropwnOn_ScheduleYourPAT_TestingPage);
	   sel.selectByVisibleText(Enter_PropertyName);
   }
   public void Click_SelectAssetbuttonOn_ScheduleYourPAT_TestingPage()
   {
	   SelectAssetbuttonOn_ScheduleYourPAT_TestingPage.click();
   }
   public void ClickOn_SelectUserButton_On_ScheduleYourPAT_TestingPage()
   {
	   SelectUserButton_On_ScheduleYourPAT_TestingPage.click();
   }
   public void Select_FrequencyDropdown_On_ScheduleYourPAT_TestingPage(String Enter_Frequency)
   {
	   Select sel=new Select(FrequencyDropdown_On_ScheduleYourPAT_TestingPage);
	   sel.selectByVisibleText(Enter_Frequency);
   }
   public void ClickOn_CreateScheduleButton_On_ScheduleYourPAT_TestingPage()
   {
	   CreateScheduleButton_On_ScheduleYourPAT_TestingPage.click();
   }
   public void CLickOn_NoButton_OnPATSCheduledSuccess()
   {
	   NoButton_OnPATSCheduledSuccess.click();
   }
   
   public void SelectTodaysPurchaseDate(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(0);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']")).click();
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
   
   public void SelectTodaysPlacedInServiceDate(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(1);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='Placed in Service']")).click();
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
   
   public void WarrantyStartDate(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(1);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("(//input[@formcontrolname='startDate'])[1]")).click();
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
   
   public void WarrantyEndDate(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(365);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("(//input[@formcontrolname='endDate'])[1]")).click();
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
   
   public void AMCStartDate(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(366);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("(//input[@formcontrolname='startDate'])[2]")).click();
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
   
   public void AMCEndDate(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(700);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("(//input[@formcontrolname='endDate'])[2]")).click();
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
   
   public void DateOfTransfer_OnAssetTransfer(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(0);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]")).click();
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
   
   public void ExpectedReturnDate_OnAssetTransfer(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(0);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[2]")).click();
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
   
   public void Tenure_StartDate_OnSchedulePATPage(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(0);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='Enter Start Date']")).click();
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
   
   public void Tenure_EndDate_OnSchedulePATPage(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(365);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='Enter End Date']")).click();
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
   
   public void TodaysScheduledDate_OnSchedulePATPage(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(0);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='Enter Scheduled Date']")).click();
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
   
   public void UpcomingScheduledDate_OnSchedulePATPage(WebDriver driver) throws Throwable
   {
	   LocalDate targetDate = LocalDate.now().plusDays(5);
	    
	    // Format the target month and day
	    String targetMonth = targetDate.format(DateTimeFormatter.ofPattern("MMM-yyyy")); // e.g., "Feb-2024"
	    String targetDay = String.valueOf(targetDate.getDayOfMonth()); // Get the day as a string

	    // Click on the Start Date input field to open the date picker
	    driver.findElement(By.xpath("//input[@placeholder='Enter Scheduled Date']")).click();
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
   
   
   
}
