package com.MetaaGrow.ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tickets {
	//Initialization
	public Tickets(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//button[@id='ticketListClosedTickets']")private WebElement Closed_Button;
	@FindBy(xpath = "//button[@id='ticketListParkedTickets']")private WebElement Parked_Button;
	@FindBy(xpath = "//button[@id='ticketListNotValidTickets']")private WebElement Not_Valid_Button;
	@FindBy(xpath = "//button[@id='ticketListOpenTickets']")private WebElement Open_Button;
	@FindBy(xpath = "//span[.='Filter']")private WebElement Filter_Icon;
	@FindBy(xpath = "//span[@title='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//a[.='Xtreme Arcade Zone']")private WebElement Filter_By_Dynamic_PropertyName;
	@FindBy(xpath = "//span[normalize-space()='Select priority']")private WebElement Filter_By_Priority;
	@FindBy(xpath = "//a[.='High']")private WebElement Filter_By_Select_High_Priority;
	@FindBy(xpath = "//a[.='Medium']")private WebElement Filter_By_Select_Medium_Priority;
	@FindBy(xpath = "//a[.='Low']")private WebElement Filter_By_Select_Low_Priority;
	@FindBy(xpath = "//span[@title='Select Department']")private WebElement Filter_By_Department;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Department_SearchBox;
	@FindBy(xpath = "//a[.='Housekeeping']")private WebElement Filter_By_Dynamic_Department_Name;
	@FindBy(xpath = "//span[normalize-space()='Select raised By']")private WebElement Filter_By_Raised_By;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Raised_By_SearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select assign to']")private WebElement Filter_By_AssignedTo;
	@FindBy(xpath = "(//input[@name='autocomplete'])[3]")private WebElement Filter_By_AssignedTo_SearchBox;
	@FindBy(xpath = "(//a[.='Jennifer Thompson'])[2]")private WebElement Filter_By_Dynamic_AssignedTo_Name;
	@FindBy(xpath = "//span[normalize-space()='Select origin']")private WebElement Filter_By_Select_Origin;
	@FindBy(xpath = "//a[.='Ad-Hoc Issue']")private WebElement Filter_By_Select_Origin_Ad_Hoc_Issue;
	@FindBy(xpath = "//a[.='QR Issue']")private WebElement Filter_By_Select_Origin_QR_Issue;
	@FindBy(xpath = "//a[.='Meter Issue']")private WebElement Filter_By_Select_Origin_Meter_Issue;
	@FindBy(xpath = "//a[.='Asset Issue']")private WebElement Filter_By_Select_Origin_Asset_Issue;
	@FindBy(xpath = "//a[.='PmChecklist']")private WebElement Filter_By_Select_Origin_PmChecklist;
	@FindBy(xpath = "//input[@placeholder='Ticket No.']")private WebElement Filter_By_Ticket_No_TextField;
	@FindBy(id = "addressInput")private WebElement Filter_By_Title_TextField;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement Filter_Clear_Button;
	@FindBy(xpath = "//span[@title='123']")private WebElement Dynamic_Click_On_Ticket_Name;
	@FindBy(xpath = "(//select[@id='selectUser'])[1]")private WebElement Select_Ticket_Status_Dropdown_On_Ticket_InfoPage;
	@FindBy(xpath = "(//select[@id='selectUser'])[2]")private WebElement Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage;
	@FindBy(xpath = "//a[@name='ticketViewUpdate']")private WebElement Update_Button_On_Ticket_InfoPage;
	@FindBy(xpath = "//div[@id='successPopUp']//button[@type='button'][normalize-space()='Ok']")private WebElement Ok_Button_On_Confirmation_Page;
	@FindBy(xpath = "//span[normalize-space()='Forward Ticket']")private WebElement Forward_Ticket_Button_On_InfoPage;
	@FindBy(xpath = "//select[@id='site']")private WebElement Department_Dropdown_On_Ticket_Forward_Page;
	@FindBy(xpath = "//div[@class='input-tag']//button[@id='custom']")private WebElement Select_User_Or_Team_DropdownOn_Ticket_Forward_Page;
	@FindBy(xpath = "(//button[@id='raiseNewTicketPriorityButton'])[3]")private WebElement Select_Priority_Low_Button;
	@FindBy(xpath = "(//button[@id='raiseNewTicketPriorityButton'])[1]")private WebElement Select_Priority_High_Button;
	@FindBy(xpath = "(//button[@id='raiseNewTicketPriorityButton'])[2]")private WebElement Select_Priority_Medium_Button;
	@FindBy(xpath = "//textarea[@id='location_reason']")private WebElement Location_Or_Reason_TextBox_On_Ticket_Forward_Page;
	@FindBy(xpath = "//label[@for='uploadProfile']//img[@alt='upload images']")private WebElement Attach_Image_Icon_On_Ticket_Forward_Page;
	@FindBy(xpath = "(//img[@class='uploadSection'])[2]")private WebElement Attach_Video_Icon_On_Ticket_Forward_Page;
	@FindBy(xpath = "//span[normalize-space()='Forward']")private WebElement Forward_Button;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_Button;
	@FindBy(xpath = "//textarea[@id='reply']")private WebElement Reply_TextField_On_Ticket_InfoPage;
	@FindBy(xpath = "//a[normalize-space()='Submit']")private WebElement Submit_Button;
	@FindBy(xpath = "//button[@id='ticketListNewTicket']")private WebElement New_Ticket_Button;
	@FindBy(xpath = "//select[@id='site']")private WebElement Property_Dropdown_On_New_Ticket_Page;
	@FindBy(xpath = "//span[.='Select Department']")private WebElement Select_Department_Dropdown_On_New_Ticket_Page;
	@FindBy(xpath = "//input[@formcontrolname='subject']")private WebElement ENter_text_Field_On_New_Ticket_Page;
	@FindBy(xpath = "//textarea[@id='location_reason']")private WebElement Decription_TextBox_On_New_Ticket_Page;
	@FindBy(xpath = "//select[@id='raiseNewTicketAsset']")private WebElement Select_Asset_Assign_To_drodown_On_New_Ticket_Page;
	@FindBy(id = "raiseNewTicketCreate")private WebElement Create_Ticket_Button_On_New_Ticket_Page;
	@FindBy(xpath = "//span[normalize-space()='Escalation Setup']")private WebElement Escalation_Setup_Button;
	@FindBy(xpath = "//select[@id='site']")private WebElement Property_Dropdown_On_Ticket_Escalation_Setup_Page;
	@FindBy(xpath = "//select[@id='Housekeeping']")private WebElement Department_Dropdown_On_Ticket_Escalation_Setup_Page;
	@FindBy(xpath = "//label[@for='check1']")private WebElement Select_Level1_Radio_Button;
	@FindBy(xpath = "//select[@formcontrolname='level1days']")private WebElement Level1_Days_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level1hours']")private WebElement Level1_Hours_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level1minute']")private WebElement Level1_Minute_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level1user']")private WebElement Select_Level1_User_DRopdown;
	@FindBy(xpath = "//label[@for='check2']")private WebElement Select_Level2_Radio_Button;
	@FindBy(xpath = "//select[@formcontrolname='level2days']")private WebElement Level2_Days_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level2hours']")private WebElement Level2_Hours_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level2minute']")private WebElement Level2_Minute_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level2user']")private WebElement Select_Level2_User_DRopdown;
	@FindBy(xpath = "//label[@for='check3']")private WebElement Select_Level3_Radio_Button;
	@FindBy(xpath = "//select[@formcontrolname='level3days']")private WebElement Level3_Days_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level3hours']")private WebElement Level3_Hours_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level3minute']")private WebElement Level3_Minute_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level3user']")private WebElement Select_Level3_User_DRopdown;
	@FindBy(xpath = "//label[@for='check4']")private WebElement Select_Level4_Radio_Button;
	@FindBy(xpath = "//select[@formcontrolname='level4days']")private WebElement Level4_Days_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level4hours']")private WebElement Level4_Hours_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level4minute']")private WebElement Level4_Minute_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level4user']")private WebElement Select_Level4_User_DRopdown;
	@FindBy(xpath = "//label[@for='check5']")private WebElement Select_Level5_Radio_Button;
	@FindBy(xpath = "//select[@formcontrolname='level5days']")private WebElement Level5_Days_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level5hours']")private WebElement Level5_Hours_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level5minute']")private WebElement Level5_Minute_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='level5user']")private WebElement Select_Level5_User_DRopdown;
	@FindBy(xpath = "//span[normalize-space()='Save']")private WebElement Save_Button_On_Ticket_Escalation_Setup_Page;
	@FindBy(xpath = "//span[normalize-space()='Cancel']" )private WebElement Cancel_Button_On_Ticket_Escalation_Setup_Page;
	@FindBy(xpath = "//span[.='Select User']")private WebElement User_Or_Team_DRopdown_On_New_Ticket_Page;
	@FindBy(xpath = "//select[@formcontrolname='isBreakdown']")private WebElement TicketTypeDropdown;
	@FindBy(xpath = "//input[@placeholder='Enter Remark']")private WebElement RemarkTextField;
	@FindBy(xpath = "//button[@id='submitEmailPopup']")private WebElement SubmitButton_OnRemarkField;
	@FindBy(xpath = "//button[@id='ticketViewOk']")private WebElement OkButton_onTicket_Status_changed_successfully;
	@FindBy(xpath = "//textarea[@id='location_reason']")private WebElement DescriptionBoxOnForwardTicketPage;
	
	public WebElement getDescriptionBoxOnForwardTicketPage() {
		return DescriptionBoxOnForwardTicketPage;
	}
	public WebElement getRemarkTextField() {
		return RemarkTextField;
	}
	public WebElement getSubmitButton_OnRemarkField() {
		return SubmitButton_OnRemarkField;
	}
	public WebElement getOkButton_onTicket_Status_changed_successfully() {
		return OkButton_onTicket_Status_changed_successfully;
	}
	public WebElement getTicketTypeDropdown() {
		return TicketTypeDropdown;
	}
	public WebElement getUser_Or_Team_DRopdown_On_New_Ticket_Page() {
		return User_Or_Team_DRopdown_On_New_Ticket_Page;
	}
	//Getters Methods
	public WebElement getClosed_Button() {
		return Closed_Button;
	}
	public WebElement getParked_Button() {
		return Parked_Button;
	}
	public WebElement getNot_Valid_Button() {
		return Not_Valid_Button;
	}
	public WebElement getOpen_Button() {
		return Open_Button;
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
	public WebElement getFilter_By_Dynamic_PropertyName() {
		return Filter_By_Dynamic_PropertyName;
	}
	public WebElement getFilter_By_Priority() {
		return Filter_By_Priority;
	}
	public WebElement getFilter_By_Select_High_Priority() {
		return Filter_By_Select_High_Priority;
	}
	public WebElement getFilter_By_Select_Medium_Priority() {
		return Filter_By_Select_Medium_Priority;
	}
	public WebElement getFilter_By_Select_Low_Priority() {
		return Filter_By_Select_Low_Priority;
	}
	public WebElement getFilter_By_Department() {
		return Filter_By_Department;
	}
	public WebElement getFilter_By_Department_SearchBox() {
		return Filter_By_Department_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_Department_Name() {
		return Filter_By_Dynamic_Department_Name;
	}
	public WebElement getFilter_By_Raised_By() {
		return Filter_By_Raised_By;
	}
	public WebElement getFilter_By_Raised_By_SearchBox() {
		return Filter_By_Raised_By_SearchBox;
	}
	public WebElement getFilter_By_AssignedTo() {
		return Filter_By_AssignedTo;
	}
	public WebElement getFilter_By_AssignedTo_SearchBox() {
		return Filter_By_AssignedTo_SearchBox;
	}
	public WebElement getFilter_By_Dynamic_AssignedTo_Name() {
		return Filter_By_Dynamic_AssignedTo_Name;
	}
	public WebElement getFilter_By_Select_Origin() {
		return Filter_By_Select_Origin;
	}
	public WebElement getFilter_By_Select_Origin_Ad_Hoc_Issue() {
		return Filter_By_Select_Origin_Ad_Hoc_Issue;
	}
	public WebElement getFilter_By_Select_Origin_QR_Issue() {
		return Filter_By_Select_Origin_QR_Issue;
	}
	public WebElement getFilter_By_Select_Origin_Meter_Issue() {
		return Filter_By_Select_Origin_Meter_Issue;
	}
	public WebElement getFilter_By_Select_Origin_Asset_Issue() {
		return Filter_By_Select_Origin_Asset_Issue;
	}
	public WebElement getFilter_By_Select_Origin_PmChecklist() {
		return Filter_By_Select_Origin_PmChecklist;
	}
	public WebElement getFilter_By_Ticket_No_TextField() {
		return Filter_By_Ticket_No_TextField;
	}
	public WebElement getFilter_By_Title_TextField() {
		return Filter_By_Title_TextField;
	}
	public WebElement getFilter_Apply_Button() {
		return Filter_Apply_Button;
	}
	public WebElement getFilter_Clear_Button() {
		return Filter_Clear_Button;
	}
	public WebElement getDynamic_Click_On_Ticket_Name() {
		return Dynamic_Click_On_Ticket_Name;
	}
	public WebElement getSelect_Ticket_Status_Dropdown_On_Ticket_InfoPage() {
		return Select_Ticket_Status_Dropdown_On_Ticket_InfoPage;
	}
	public WebElement getSelect_Ticket_Priority_Dropdown_On_Ticket_InfoPage() {
		return Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage;
	}
	public WebElement getUpdate_Button_On_Ticket_InfoPage() {
		return Update_Button_On_Ticket_InfoPage;
	}
	public WebElement getOk_Button_On_Confirmation_Page() {
		return Ok_Button_On_Confirmation_Page;
	}
	public WebElement getForward_Ticket_Button_On_InfoPage() {
		return Forward_Ticket_Button_On_InfoPage;
	}
	public WebElement getDepartment_Dropdown_On_Ticket_Forward_Page() {
		return Department_Dropdown_On_Ticket_Forward_Page;
	}
	public WebElement getSelect_User_Or_Team_DropdownOn_Ticket_Forward_Page() {
		return Select_User_Or_Team_DropdownOn_Ticket_Forward_Page;
	}
	public WebElement getSelect_Priority_Low_Button() {
		return Select_Priority_Low_Button;
	}
	public WebElement getSelect_Priority_High_Button() {
		return Select_Priority_High_Button;
	}
	public WebElement getSelect_Priority_Medium_Button() {
		return Select_Priority_Medium_Button;
	}
	public WebElement getLocation_Or_Reason_TextBox_On_Ticket_Forward_Page() {
		return Location_Or_Reason_TextBox_On_Ticket_Forward_Page;
	}
	public WebElement getAttach_Image_Icon_On_Ticket_Forward_Page() {
		return Attach_Image_Icon_On_Ticket_Forward_Page;
	}
	public WebElement getAttach_Video_Icon_On_Ticket_Forward_Page() {
		return Attach_Video_Icon_On_Ticket_Forward_Page;
	}
	public WebElement getForward_Button() {
		return Forward_Button;
	}
	public WebElement getCancel_Button() {
		return Cancel_Button;
	}
	public WebElement getReply_TextField_On_Ticket_InfoPage() {
		return Reply_TextField_On_Ticket_InfoPage;
	}
	public WebElement getSubmit_Button() {
		return Submit_Button;
	}
	public WebElement getNew_Ticket_Button() {
		return New_Ticket_Button;
	}
	public WebElement getProperty_Dropdown_On_New_Ticket_Page() {
		return Property_Dropdown_On_New_Ticket_Page;
	}
	public WebElement getSelect_Department_Dropdown_On_New_Ticket_Page() {
		return Select_Department_Dropdown_On_New_Ticket_Page;
	}
	public WebElement getENter_text_Field_On_New_Ticket_Page() {
		return ENter_text_Field_On_New_Ticket_Page;
	}
	public WebElement getDecription_TextBox_On_New_Ticket_Page() {
		return Decription_TextBox_On_New_Ticket_Page;
	}
	public WebElement getSelect_Asset_Assign_To_drodown_On_New_Ticket_Page() {
		return Select_Asset_Assign_To_drodown_On_New_Ticket_Page;
	}
	public WebElement getCreate_Ticket_Button_On_New_Ticket_Page() {
		return Create_Ticket_Button_On_New_Ticket_Page;
	}
	public WebElement getEscalation_Setup_Button() {
		return Escalation_Setup_Button;
	}
	public WebElement getProperty_Dropdown_On_Ticket_Escalation_Setup_Page() {
		return Property_Dropdown_On_Ticket_Escalation_Setup_Page;
	}
	public WebElement getDepartment_Dropdown_On_Ticket_Escalation_Setup_Page() {
		return Department_Dropdown_On_Ticket_Escalation_Setup_Page;
	}
	public WebElement getSelect_Level1_Radio_Button() {
		return Select_Level1_Radio_Button;
	}
	public WebElement getLevel1_Days_Dropdown() {
		return Level1_Days_Dropdown;
	}
	public WebElement getLevel1_Hours_Dropdown() {
		return Level1_Hours_Dropdown;
	}
	public WebElement getLevel1_Minute_Dropdown() {
		return Level1_Minute_Dropdown;
	}
	public WebElement getSelect_Level1_User_DRopdown() {
		return Select_Level1_User_DRopdown;
	}
	public WebElement getSelect_Level2_Radio_Button() {
		return Select_Level2_Radio_Button;
	}
	public WebElement getLevel2_Days_Dropdown() {
		return Level2_Days_Dropdown;
	}
	public WebElement getLevel2_Hours_Dropdown() {
		return Level2_Hours_Dropdown;
	}
	public WebElement getLevel2_Minute_Dropdown() {
		return Level2_Minute_Dropdown;
	}
	public WebElement getSelect_Level2_User_DRopdown() {
		return Select_Level2_User_DRopdown;
	}
	public WebElement getSelect_Level3_Radio_Button() {
		return Select_Level3_Radio_Button;
	}
	public WebElement getLevel3_Days_Dropdown() {
		return Level3_Days_Dropdown;
	}
	public WebElement getLevel3_Hours_Dropdown() {
		return Level3_Hours_Dropdown;
	}
	public WebElement getLevel3_Minute_Dropdown() {
		return Level3_Minute_Dropdown;
	}
	public WebElement getSelect_Level3_User_DRopdown() {
		return Select_Level3_User_DRopdown;
	}
	public WebElement getSelect_Level4_Radio_Button() {
		return Select_Level4_Radio_Button;
	}
	public WebElement getLevel4_Days_Dropdown() {
		return Level4_Days_Dropdown;
	}
	public WebElement getLevel4_Hours_Dropdown() {
		return Level4_Hours_Dropdown;
	}
	public WebElement getLevel4_Minute_Dropdown() {
		return Level4_Minute_Dropdown;
	}
	public WebElement getSelect_Level4_User_DRopdown() {
		return Select_Level4_User_DRopdown;
	}
	public WebElement getSelect_Level5_Radio_Button() {
		return Select_Level5_Radio_Button;
	}
	public WebElement getLevel5_Days_Dropdown() {
		return Level5_Days_Dropdown;
	}
	public WebElement getLevel5_Hours_Dropdown() {
		return Level5_Hours_Dropdown;
	}
	public WebElement getLevel5_Minute_Dropdown() {
		return Level5_Minute_Dropdown;
	}
	public WebElement getSelect_Level5_User_DRopdown() {
		return Select_Level5_User_DRopdown;
	}
	public WebElement getSave_Button_On_Ticket_Escalation_Setup_Page() {
		return Save_Button_On_Ticket_Escalation_Setup_Page;
	}
	public WebElement getCancel_Button_On_Ticket_Escalation_Setup_Page() {
		return Cancel_Button_On_Ticket_Escalation_Setup_Page;
	}
	
	//Business Logic
	public void ClickOn_Closed_Button()
	{
		Closed_Button.click();
	}
	public void ClickOn_Parked_Button()
	{
		Parked_Button.click();
	}
	public void ClickOn_Not_Valid_Button()
	{
		Not_Valid_Button.click();
	}
	public void ClickOn_Open_Button()
	{
		Open_Button.click();
	}
	public void CLockOn_Filter_Icon()
	{
		Filter_Icon.click();
	}
	public void ClickOn_Filter_By_Property()
	{
		Filter_By_Property.click();
	}
	public void ClickOn_Filter_By_Property_SearchBox(String search_property)
	{
		Filter_By_Property_SearchBox.sendKeys(search_property);
	}
	public void ClickOn_Filter_By_Dynamic_PropertyName()
	{
		Filter_By_Dynamic_PropertyName.click();
	}
	public void ClickOn_Filter_By_Priority()
	{
		Filter_By_Priority.click();
	}
	public void CLickOn_Filter_By_Select_High_Priority()
	{
		Filter_By_Select_High_Priority.click();
	}
	public void ClickOn_Filter_By_Select_Medium_Priority()
	{
		Filter_By_Select_Medium_Priority.click();
	}
	public void CLickOn_Filter_By_Select_Low_Priority()
	{
		Filter_By_Select_Low_Priority.click();
	}
	public void ClickOn_Filter_By_Department()
	{
		Filter_By_Department.click();
	}
	public void CLickOn_Filter_By_Department_SearchBox(String Search_Department)
	{
		Filter_By_Department_SearchBox.sendKeys(Search_Department);
	}
	public void ClickOn_Filter_By_Dynamic_Department_Name()
	{
		Filter_By_Dynamic_Department_Name.click();
	}
	public void ClickOn_Filter_By_Raised_By()
	{
		Filter_By_Raised_By.click();
	}
	public void ClickOn_Filter_By_Raised_By_SearchBox( String Search_Raised_By)
	{
		Filter_By_Raised_By_SearchBox.sendKeys(Search_Raised_By);
	}
	public void ClickoN_Filter_By_AssignedTo()
	{
		Filter_By_AssignedTo.click();
	}
	public void ClickoN_Filter_By_AssignedTo_SearchBox(String Search_AssignedTo)
	{
		Filter_By_AssignedTo_SearchBox.sendKeys(Search_AssignedTo);
	}
	public void ClickOn_Filter_By_Dynamic_AssignedTo_Name()
	{
		Filter_By_Dynamic_AssignedTo_Name.click();
	}
	public void ClickON_Filter_By_Select_Origin()
	{
		Filter_By_Select_Origin.click();
	}
	public void ClickOn_Filter_By_Select_Origin_Ad_Hoc_Issue()
	{
		Filter_By_Select_Origin_Ad_Hoc_Issue.click();
	}
	public void ClickON_Filter_By_Select_Origin_QR_Issue(){
		Filter_By_Select_Origin_QR_Issue.click();
	}
	public void ClickOn_Filter_By_Select_Origin_Meter_Issue()
	{
		Filter_By_Select_Origin_Meter_Issue.click();
	}
	public void Clickon_Filter_By_Select_Origin_Asset_Issue()
	{
		Filter_By_Select_Origin_Asset_Issue.click();
	}
	public void ClickOn_Filter_By_Select_Origin_PmChecklist()
	{
		
		Filter_By_Select_Origin_PmChecklist.click();
	}
	public void CLickOn_Filter_By_Ticket_No_TextField(String Enter_Ticket_No)
	{
		Filter_By_Ticket_No_TextField.sendKeys(Enter_Ticket_No);
	}
	public void ClickON_Filter_By_Title_TextField(String Enter_Title)
	{
		Filter_By_Title_TextField.sendKeys(Enter_Title);
	}
	public void ClickOn_Filter_Apply_Button()
	{
		Filter_Apply_Button.click();
		
	}
	public void CLickOn_Filter_Clear_Button()
	{
		Filter_Clear_Button.click();
	}
	public void ClickON_Dynamic_Click_On_Ticket_Name()
	{
		Dynamic_Click_On_Ticket_Name.click();
	}
	public void ClickOn_Select_Ticket_Status_Dropdown_On_Ticket_InfoPage_By_VisibleText(String Text)
	{
		Select sel=new Select(Select_Ticket_Status_Dropdown_On_Ticket_InfoPage);
		sel.selectByVisibleText(Text);
	}
	public String GetFirstSelectedValueFromDropdown()
	{
		
	        Select dropdown = new Select(Select_Ticket_Status_Dropdown_On_Ticket_InfoPage);
	        return dropdown.getFirstSelectedOption().getText();
	}
	public void ClickOn_Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage_By_VisibleText(String Text)
	{
		Select sel=new Select(Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Update_Button_On_Ticket_InfoPage()
	{
		Update_Button_On_Ticket_InfoPage.click();
	}
	public void ClickOn_Ok_Button_On_Confirmation_Page()
	{
		Ok_Button_On_Confirmation_Page.click();
	}
	public void ClickOn_Forward_Ticket_Button_On_InfoPage()
	{
		Forward_Ticket_Button_On_InfoPage.click();
	}
	public void ClickOn_Department_Dropdown_On_Ticket_Forward_Page_By_VisibleText(String Text)
	{
		Select sel=new Select(Department_Dropdown_On_Ticket_Forward_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_User_Or_Team_DropdownOn_Ticket_Forward_Page_By_VisibleText()
	{
		Select_User_Or_Team_DropdownOn_Ticket_Forward_Page.click();
	}
	public void ClickOn_Select_Priority_Low_Button()
	{
		Select_Priority_Low_Button.click();
	}
	public void ClickOn_Select_Priority_High_Button()
	{
		Select_Priority_High_Button.click();
	}
	public void ClickOn_Select_Priority_Medium_Button()
	{
		Select_Priority_Medium_Button.click();
	}
	public void ClickOn_Location_Or_Reason_TextBox_On_Ticket_Forward_Page(String Enter_Location_Or_Reason)
	{
		Location_Or_Reason_TextBox_On_Ticket_Forward_Page.sendKeys(Enter_Location_Or_Reason);
	}
	public void ClickOn_Attach_Image_Icon_On_Ticket_Forward_Page(String Enter_Path)
	{
		Attach_Image_Icon_On_Ticket_Forward_Page.sendKeys(Enter_Path);
	}
	public void ClickOn_Attach_Video_Icon_On_Ticket_Forward_Page(String ENter_Path)
	{
		Attach_Video_Icon_On_Ticket_Forward_Page.sendKeys(ENter_Path);
	}
	public void ClickOn_Forward_Button()
	{
		Forward_Button.click();
	}
	public void ClickOn_Cancel_Button()
	{
		Cancel_Button.click();
	}
	public void ClickOn_Reply_TextField_On_Ticket_InfoPage(String Reply)
	{
		Reply_TextField_On_Ticket_InfoPage.sendKeys(Reply);
	}
	public void ClickOn_Submit_Button()
	{
		Submit_Button.click();
	}
	public void ClickOn_New_Ticket_Button()
	{
		New_Ticket_Button.click();
	}
	public void Clickon_Property_Dropdown_On_New_Ticket_Page(String Text)
	{
		Select sel=new Select(Property_Dropdown_On_New_Ticket_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickON_Select_Department_Dropdown_On_New_Ticket_Page()
	{
		Select_Department_Dropdown_On_New_Ticket_Page.click();
	}
	public void ClickOn_ENter_text_Field_On_New_Ticket_Page(String Enter_Text)
	{
		ENter_text_Field_On_New_Ticket_Page.sendKeys(Enter_Text);
	}
	public void ClickOn_Decription_TextBox_On_New_Ticket_Page(String Description)
	{
		Decription_TextBox_On_New_Ticket_Page.sendKeys(Description);
	}
	public void ClickOn_Select_Asset_Assign_To_drodown_On_New_Ticket_Page(String Text)
	{
		Select sel=new Select(Select_Asset_Assign_To_drodown_On_New_Ticket_Page);
		sel.selectByVisibleText(Text);
	}
	public String getFirstValueOfAsset()
	{
		Select Assetdropdown = new Select(Select_Asset_Assign_To_drodown_On_New_Ticket_Page);

	// Get the first option
	WebElement firstOption = Assetdropdown.getOptions().get(1); // Index 0 for the first option

	// Store the value or text in a reference variable
	String firstAsset = firstOption.getText(); // Use getAttribute("value") if you need the value attribute
return firstAsset;
		
	}
	public void ClickOn_Create_Ticket_Button_On_New_Ticket_Page()
	{
		Create_Ticket_Button_On_New_Ticket_Page.click();
	}
	public void ClickOn_Escalation_Setup_Button()
	{
		Escalation_Setup_Button.click();
	}
	public void ClickOn_Property_Dropdown_On_Ticket_Escalation_Setup_Page(String Text)
	{
		Select sel=new Select(Property_Dropdown_On_Ticket_Escalation_Setup_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Department_Dropdown_On_Ticket_Escalation_Setup_Page(String Text)
	{
		Select sel=new Select(Department_Dropdown_On_Ticket_Escalation_Setup_Page);
		sel.selectByVisibleText(Text);
	}
	public void ClickON_Select_Level1_Radio_Button()
	{
		Select_Level1_Radio_Button.click();
	}
	public void ClickOn_Level1_Days_Dropdown(String Text)
	{
		Select sel=new Select(Level1_Days_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level1_Hours_Dropdown(String Text)
	{
		Select sel=new Select(Level1_Hours_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level1_Minute_Dropdown(String Text)
	{
		Select sel=new Select(Level1_Minute_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void Clickon_Select_Level1_User_DRopdown(String Text)
	{
		Select sel=new Select(Select_Level1_User_DRopdown);
		sel.selectByValue(Text);
	}
	public void ClickOn_Select_Level2_Radio_Button()
	{
		Select_Level2_Radio_Button.click();
	}
	public void clickOn_Level2_Days_Dropdown(String Text)
	{
Select sel=new Select(Level2_Days_Dropdown);
sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level2_Hours_Dropdown(String Text)
	{
		Select sel=new Select(Level2_Hours_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level2_Minute_Dropdown(String Text)
	{
		Select sel=new Select(Level2_Minute_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Level2_User_DRopdown(String Text)
	{
		Select sel=new Select(Select_Level2_User_DRopdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Level3_Radio_Button()
	{
		Select_Level3_Radio_Button.click();
	}
	public void ClickOn_Level3_Days_Dropdown(String Text)
	{
		Select sel=new Select(Level3_Days_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level3_Hours_Dropdown(String Text)
	{
		Select sel=new Select(Level3_Hours_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level3_Minute_Dropdown(String Text)
	{
		Select sel=new Select(Level3_Minute_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Level3_User_DRopdown(String Text)
	{
		Select sel=new Select(Select_Level3_User_DRopdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Level4_Radio_Button(String Text)
	{
		Select sel=new Select(Select_Level4_Radio_Button);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level4_Days_Dropdown(String Text)
	{
		Select sel=new Select(Level4_Days_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level4_Hours_Dropdown(String Text)
	{
		Select sel=new Select(Level4_Hours_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level4_Minute_Dropdown(String Text)
	{
		Select sel=new Select(Level4_Minute_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Level5_Radio_Button()
	{
		Select_Level5_Radio_Button.click();
	}
	public void ClickOn_Level5_Days_Dropdown(String Text)
	{
		Select sel=new Select(Level5_Days_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level5_Hours_Dropdown(String Text)
	{
		Select sel=new Select(Level5_Hours_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Level5_Minute_Dropdown(String Text)
	{
		Select sel=new Select(Level5_Minute_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Select_Level5_User_DRopdown(String Text)
	{
		Select sel=new Select(Select_Level5_User_DRopdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Save_Button_On_Ticket_Escalation_Setup_Page()
	{
		Save_Button_On_Ticket_Escalation_Setup_Page.click();
	}
	public void ClickOn_Cancel_Button_On_Ticket_Escalation_Setup_Page()
	{
		Cancel_Button_On_Ticket_Escalation_Setup_Page.click();
	}
	
	public void ClickOn_User_Or_Team_DRopdown_On_New_Ticket_Page_By_VisibleText()
	{
		User_Or_Team_DRopdown_On_New_Ticket_Page.click();
	}
	public void SelectTicketType(String Text)
	{
            Select sel = new Select(TicketTypeDropdown);
            sel.selectByVisibleText(Text);
	}
	public void ClickOn_RemarkTextField(String Enter_Remark)
	{
		RemarkTextField.sendKeys(Enter_Remark);
	}
	public void ClickOn_SubmitButton_OnRemarkField()
	{
		SubmitButton_OnRemarkField.click();
	}
	public void ClickOn_OkButton_onTicket_Status_changed_successfully()
	{
		OkButton_onTicket_Status_changed_successfully.click();
	}
	public String getSelectedTicketPriority() {
	    // Locate the dropdown element
	   
	    Select select = new Select(Select_Ticket_Priority_Dropdown_On_Ticket_InfoPage);
	    return select.getFirstSelectedOption().getText(); // Get the text of the selected option
	}
	public String getSelectedTicketStatus()
	{
		Select sel = new Select(Select_Ticket_Status_Dropdown_On_Ticket_InfoPage);
		 return sel.getFirstSelectedOption().getText(); // Get the text of the selected option
	}
	public void ClickOn_DescriptionBoxOnForwardTicketPage(String Enter_Description)
	{
		DescriptionBoxOnForwardTicketPage.sendKeys(Enter_Description);
	}
	
	public void End_Date(WebDriver driver, String targetMonth, String targetDay) {
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
	            // Check if the "Next month" button is enabled
	            WebElement nextMonthButton = driver.findElement(By.xpath("//button[@aria-label='Next month']"));
	            boolean isNextMonthEnabled = nextMonthButton.isEnabled() && nextMonthButton.isDisplayed();

	            // If "Next month" is enabled, click it. If not, keep clicking "Previous month"
	            if (isNextMonthEnabled) {
	                nextMonthButton.click();
	            } else {
	                // Continuously click the "Previous month" button until the target month is displayed
	                while (true) {
	                    driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
	                    
	                    // Update the displayed month after clicking
	                    displayedMonth = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).getText();
	                    
	                    // Break if the target month is reached
	                    if (displayedMonth.equals(targetMonth)) {
	                        break;
	                    }
	                    
	                    // Optional: Add a short wait to allow the UI to update
	                    try {
	                        Thread.sleep(500); // Adjust the duration as needed
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }

	        // Optional: Add a short wait to allow the UI to update
	        try {
	            Thread.sleep(500); // Adjust the duration as needed
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    System.out.println("before click");

	    // Click on the day in the date picker
	    driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
	    System.out.println("after click");
	}





}
