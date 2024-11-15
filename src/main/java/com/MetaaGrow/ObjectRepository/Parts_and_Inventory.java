package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.MetaaGrow.Generic_Utility.BaseClass;

public class Parts_and_Inventory extends BaseClass{
	//Initiazation
	public Parts_and_Inventory()
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//button[normalize-space()='Transferred']")private WebElement Transferred_Tab;
	@FindBy(xpath = "//button[normalize-space()='On Property']")private WebElement On_Property_Tab;
	@FindBy(xpath = "//span[.='Filter']")private WebElement Filter_Tab;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "//div[@id='custom']//input[@id='custom']")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//a[.='Pune']")private WebElement Filter_By_Select_Property_By_dynamic_Text;
	@FindBy(xpath = "//input[@placeholder='Search Part No']")private WebElement Filter_By_Search_Part_No;
	@FindBy(xpath = "//input[@placeholder='Search Part Name']")private WebElement Filter_By_Search_Part_Name;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement Clear_Button;
	@FindBy(xpath = "//ancestor::ul[@class='tr']/descendant::b[contains(text(),'agn')]")private WebElement dynamic_Click_On_partname;
	@FindBy(css = "button.qr-bdr-btn")private WebElement QR_Button_On_Part_InfoPage;
	@FindBy(xpath = "//span[normalize-space()='Edit']")private WebElement Edit_Button_On_Part_InfoPage;
	@FindBy(xpath = "//span[normalize-space()='View/Edit Location']")private WebElement View_OR_Edit_Location_Button_On_Part_InfoPage;
	@FindBy(xpath = "//div[@id='duplicate12']//select[@id='selectUser']")private WebElement Select_Location_Dropdown;
	@FindBy(xpath = "//span[normalize-space()='Set New Location']")private WebElement Set_New_Location_Button;
	@FindBy(xpath = "div[id='successPopUp1'] button[type='button']")private WebElement Ok_Button_On_edit_location_Confirmation_Page;
	@FindBy(xpath = "//button[@type='button']//span[contains(text(),'Update Quantity')]")private WebElement Update_Quantity_Button_On_Part_InfoPage;
	@FindBy(id    = "orderPoId")private WebElement orderPoId_Text_Filed_On_Update_quantity_Page;
	@FindBy(xpath = "//input[@placeholder='Quantity Ordered']")private WebElement Quantity_Ordered_TextField_On_Update_quantity_Page;
	@FindBy(xpath = "//input[@placeholder='Quantity Received']")private WebElement Quantity_Received_TextField_On_Update_quantity_Page;
	@FindBy(xpath = "//input[@placeholder='Price']")private WebElement Price_TextField_On_Update_quantity_Page;
	@FindBy(xpath = "//select[@formcontrolname='partialId']")private WebElement Select_Status_Dropdown_On_Update_quantity_Page;
	@FindBy(xpath = "//span[normalize-space()='Update']")private WebElement Update_Button_Update_quantity_Page;
	@FindBy(css  = "div[id='successPopUp'] button[type='button']")private WebElement Ok_Button_parts_Update_Confirmation_Page;
	@FindBy(xpath = "//label[@for='updateType']//span[@class='slider']")private WebElement Slider_On_Update_quantity_Page;
	@FindBy(xpath = "//form[@class='ng-touched ng-invalid ng-dirty']//select[@id='selectUser']")private WebElement Select_Status_Dropdown_On_Decrease_quantity_Page;
	@FindBy(xpath = "//input[@placeholder='Quantity']")private WebElement Quantity_TextBox_On_Decrease_quantity_Page;
	@FindBy(xpath = "//form[@class='ng-touched ng-invalid ng-dirty']//button[@type='submit']")private WebElement Decrease_Button_Update_quantity_Page;
	@FindBy(xpath = "div[id='successPopUp'] button[type='button']")private WebElement Ok_Button_parts_Decrease_Confirmation_Page;
	@FindBy(xpath = "//button[normalize-space()='Vendors']")private WebElement Vendors_Tab_On_Info_Page;
	@FindBy(xpath = "//span[normalize-space()='Add a Vendor']")private WebElement Add_a_Vendor_Button_On_Vendors_Page;
	@FindBy(xpath = "//input[@placeholder='Enter Vendor Name']")private WebElement Vendor_Name_Text_Box;
	@FindBy(xpath = "//input[@placeholder='Enter Email id']")private WebElement Email_Id_TextBox;
	@FindBy(xpath = "//input[@placeholder='Enter mobile no']")private WebElement Mobile_No_TextBox;
	@FindBy(xpath = "//input[@placeholder='Contact Person']")private WebElement Contact_Person_TextBox;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_Button_On_Add_Vendor_Page;
	@FindBy(xpath = "//button[@type='submit']")private WebElement Submit_Button__Add_Vendor_Page;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement Ok_Button__Add_Vendor_Confirmation_Page;
	@FindBy(xpath = "//button[normalize-space()='Assets']")private WebElement Assets_Tab_On_Info_Page;
	@FindBy(xpath = "//button[normalize-space()='Logs']")private WebElement Logs_Tab_On_Info_Page;
	@FindBy(xpath = "//button[normalize-space()='Files']")private WebElement Files_Tab_OnLogs_Page;
	@FindBy(xpath = "//button[normalize-space()='Activity Logs']")private WebElement Activity_Logs_Tab_OnLogs_Page;
	@FindBy(xpath = "//input[@placeholder='Activity']")private WebElement Filter_By_Activity_TextField;
	@FindBy(xpath = "//button[@class='button select-button ']//span[.='Associate']")private WebElement Filter_By_Associate_Dropdown;
	@FindBy(xpath = "//a[.='ABC865']")private WebElement Filter_By_Associate_Dyamic_Name;
	@FindBy(xpath = "//button[@class='button select-button ']//span[.='Type of log']")private WebElement Filter_By_Type_Of_Log_Dropdown;
	@FindBy(xpath = "//a[.='Depreciation']" )private WebElement Filter_By_Depreciation_Dyamic_Name;
	@FindBy(xpath = "//input[@placeholder='File Name']")private WebElement Filter_By_File_name;
	@FindBy(xpath = "//button[@class='button select-button ']//span[.='Uploaded By']")private WebElement Filter_By_Uploaded_By;
	@FindBy(xpath = "//div[@class='input-group']//input[@id='custom']")private WebElement Filter_By_Uploaded_By_SerachBox;
	@FindBy(xpath = "//a[.='ABC865']" )private WebElement Filter_By_Uploaded_By_Dynamic_Name;
	@FindBy(xpath = "//button[normalize-space()='Reports']")private WebElement Reports_Tab_On_PartsInfo_Page;
	@FindBy(xpath = "//button[@class='button btn-primary']//span[.='Search']")private WebElement Search_Button_On_Reports_Page;
	@FindBy(xpath = "//button[@class='button btn-primary']//span[.='Clear']")private WebElement Clear_Button_On_Reports_Page;
	@FindBy(xpath = "//button[@id='custom']")private WebElement Parts_Reports_Download_Icon;
	@FindBy(xpath = "//a[normalize-space()='As PDF']")private WebElement Parts_Reports_Download_As_PDF_Tab;
	@FindBy(xpath = "//button[normalize-space()='Notify']")private WebElement Notify__Tab_On_PartsInfo_Page;
	@FindBy(xpath = "//select[@formcontrolname='notifyUser']")private WebElement Notif_User_Dropdown;
	@FindBy(xpath = "//span[normalize-space()='Transfer']")private WebElement Transfer_Button;
	@FindBy(xpath = "//span[normalize-space()='Add Parts']")private WebElement Add_Parts_Tab;
	@FindBy(xpath = "//a[normalize-space()='Single']")private WebElement Add_Parts_SingleTab;
	@FindBy(xpath = "//input[@formcontrolname='partName']")private WebElement PartName_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//input[@formcontrolname='number']")private WebElement Part_No_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//input[@formcontrolname='serialNo']")private WebElement Serial_No_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//select[@formcontrolname='propertyId']")private WebElement Property_Id_Dropdown_On_Add_SinglePart_page;
	@FindBy(xpath = "//select[@formcontrolname='locationId']")private WebElement Location_Id_Dropdown_On_Add_SinglePart_page;
	@FindBy(xpath = "//input[@formcontrolname='unitOfMeasure']")private WebElement UOM_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//input[@formcontrolname='minimumQuentity']")private WebElement MTQ_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//input[@formcontrolname='quentityInHand']")private WebElement Quantity_In_Hand_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//input[@formcontrolname='pricePerPice']")private WebElement Price_per_Piece_TextFiled_On_Add_SinglePart_page;
	@FindBy(xpath = "//button[@type='submit']")private WebElement Add_Parts_Button_On_Add_SinglePart_page;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Cancel_Button_On_Add_SinglePart_page;
	@FindBy(xpath = "//button[@id='backClicked']")private WebElement Ok_button_on_add_part_confirmation_page;
	@FindBy(xpath = "//a[.='Bulk']")private WebElement Bulk_Upload_Tab;
	@FindBy(xpath = "//span[normalize-space()='Download Sample Sheet']")private WebElement Download_sample_sheet_Tab_On_Bulk_Upload;
	@FindBy(xpath = "//input[@class='addFileDragInner']")private WebElement Click_Here_To_upload_File_Path;
	@FindBy(xpath = "//button[normalize-space()='Upload']")private WebElement Upload_Button_On_Bulk_Upload_Page;


	//Getters Method

	public WebElement getTransferred_Tab() {
		return Transferred_Tab;
	}
	public WebElement getOn_Property_Tab() {
		return On_Property_Tab;
	}
	public WebElement getFilter_Tab() {
		return Filter_Tab;
	}
	public WebElement getFilter_By_Property() {
		return Filter_By_Property;
	}
	public WebElement getFilter_By_Property_SearchBox() {
		return Filter_By_Property_SearchBox;
	}
	public WebElement getFilter_By_Select_Property_By_dynamic_Text() {
		return Filter_By_Select_Property_By_dynamic_Text;
	}
	public WebElement getFilter_By_Search_Part_No() {
		return Filter_By_Search_Part_No;
	}
	public WebElement getFilter_By_Search_Part_Name() {
		return Filter_By_Search_Part_Name;
	}
	public WebElement getFilter_Apply_Button() {
		return Filter_Apply_Button;
	}
	public WebElement getClear_Button() {
		return Clear_Button;
	}
	public WebElement getDynamic_Click_On_partname() {
		return dynamic_Click_On_partname;
	}
	public WebElement getQR_Button_On_Part_InfoPage() {
		return QR_Button_On_Part_InfoPage;
	}
	public WebElement getEdit_Button_On_Part_InfoPage() {
		return Edit_Button_On_Part_InfoPage;
	}
	public WebElement getView_OR_Edit_Location_Button_On_Part_InfoPage() {
		return View_OR_Edit_Location_Button_On_Part_InfoPage;
	}
	public WebElement getSelect_Location_Dropdown() {
		return Select_Location_Dropdown;
	}
	public WebElement getSet_New_Location_Button() {
		return Set_New_Location_Button;
	}
	public WebElement getOk_Button_On_edit_location_Confirmation_Page() {
		return Ok_Button_On_edit_location_Confirmation_Page;
	}
	public WebElement getUpdate_Quantity_Button_On_Part_InfoPage() {
		return Update_Quantity_Button_On_Part_InfoPage;
	}
	public WebElement getOrderPoId_Text_Filed_On_Update_quantity_Page() {
		return orderPoId_Text_Filed_On_Update_quantity_Page;
	}
	public WebElement getQuantity_Ordered_TextField_On_Update_quantity_Page() {
		return Quantity_Ordered_TextField_On_Update_quantity_Page;
	}
	public WebElement getQuantity_Received_TextField_On_Update_quantity_Page() {
		return Quantity_Received_TextField_On_Update_quantity_Page;
	}
	public WebElement getPrice_TextField_On_Update_quantity_Page() {
		return Price_TextField_On_Update_quantity_Page;
	}
	public WebElement getSelect_Status_Dropdown_On_Update_quantity_Page() {
		return Select_Status_Dropdown_On_Update_quantity_Page;
	}
	public WebElement getUpdate_Button_Update_quantity_Page() {
		return Update_Button_Update_quantity_Page;
	}
	public WebElement getOk_Button_parts_Update_Confirmation_Page() {
		return Ok_Button_parts_Update_Confirmation_Page;
	}
	public WebElement getSlider_On_Update_quantity_Page() {
		return Slider_On_Update_quantity_Page;
	}
	public WebElement getSelect_Status_Dropdown_On_Decrease_quantity_Page() {
		return Select_Status_Dropdown_On_Decrease_quantity_Page;
	}
	public WebElement getQuantity_TextBox_On_Decrease_quantity_Page() {
		return Quantity_TextBox_On_Decrease_quantity_Page;
	}
	public WebElement getDecrease_Button_Update_quantity_Page() {
		return Decrease_Button_Update_quantity_Page;
	}
	public WebElement getOk_Button_parts_Decrease_Confirmation_Page() {
		return Ok_Button_parts_Decrease_Confirmation_Page;
	}
	public WebElement getVendors_Tab_On_Info_Page() {
		return Vendors_Tab_On_Info_Page;
	}
	public WebElement getAdd_a_Vendor_Button_On_Vendors_Page() {
		return Add_a_Vendor_Button_On_Vendors_Page;
	}
	public WebElement getVendor_Name_Text_Box() {
		return Vendor_Name_Text_Box;
	}
	public WebElement getEmail_Id_TextBox() {
		return Email_Id_TextBox;
	}
	public WebElement getMobile_No_TextBox() {
		return Mobile_No_TextBox;
	}
	public WebElement getContact_Person_TextBox() {
		return Contact_Person_TextBox;
	}
	public WebElement getCancel_Button_On_Add_Vendor_Page() {
		return Cancel_Button_On_Add_Vendor_Page;
	}
	public WebElement getSubmit_Button__Add_Vendor_Page() {
		return Submit_Button__Add_Vendor_Page;
	}
	public WebElement getOk_Button__Add_Vendor_Confirmation_Page() {
		return Ok_Button__Add_Vendor_Confirmation_Page;
	}
	public WebElement getAssets_Tab_On_Info_Page() {
		return Assets_Tab_On_Info_Page;
	}
	public WebElement getLogs_Tab_On_Info_Page() {
		return Logs_Tab_On_Info_Page;
	}
	public WebElement getFiles_Tab_OnLogs_Page() {
		return Files_Tab_OnLogs_Page;
	}
	public WebElement getActivity_Logs_OnLogs_Page() {
		return Activity_Logs_Tab_OnLogs_Page;
	}
	public WebElement getFilter_By_Activity_TextField() {
		return Filter_By_Activity_TextField;
	}
	public WebElement getFilter_By_Associate_Dropdown() {
		return Filter_By_Associate_Dropdown;
	}
	public WebElement getFilter_By_Associate_Dyamic_Name() {
		return Filter_By_Associate_Dyamic_Name;
	}
	public WebElement getFilter_By_Type_Of_Log_Dropdown() {
		return Filter_By_Type_Of_Log_Dropdown;
	}
	public WebElement getFilter_By_Depreciation_Dyamic_Name() {
		return Filter_By_Depreciation_Dyamic_Name;
	}
	public WebElement getFilter_By_File_name() {
		return Filter_By_File_name;
	}
	public WebElement getFilter_By_Uploaded_By() {
		return Filter_By_Uploaded_By;
	}
	public WebElement getFilter_By_Uploaded_By_SerachBox() {
		return Filter_By_Uploaded_By_SerachBox;
	}
	public WebElement getFilter_By_Uploaded_By_Dynamic_Name() {
		return Filter_By_Uploaded_By_Dynamic_Name;
	}
	public WebElement getReports_Tab_On_PartsInfo_Page() {
		return Reports_Tab_On_PartsInfo_Page;
	}
	public WebElement getSearch_Button_On_Reports_Page() {
		return Search_Button_On_Reports_Page;
	}
	public WebElement getClear_Button_On_Reports_Page() {
		return Clear_Button_On_Reports_Page;
	}
	public WebElement getParts_Reports_Download_Icon() {
		return Parts_Reports_Download_Icon;
	}
	public WebElement getParts_Reports_Download_As_PDF_Tab() {
		return Parts_Reports_Download_As_PDF_Tab;
	}
	public WebElement getNotify__Tab_On_PartsInfo_Page() {
		return Notify__Tab_On_PartsInfo_Page;
	}
	public WebElement getNotif_User_Dropdown() {
		return Notif_User_Dropdown;
	}
	public WebElement getTransfer_Button() {
		return Transfer_Button;
	}
	public WebElement getAdd_Parts_Tab() {
		return Add_Parts_Tab;
	}
	public WebElement getAdd_Parts_SingleTab() {
		return Add_Parts_SingleTab;
	}
	public WebElement getPartName_TextFiled_On_Add_SinglePart_page() {
		return PartName_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getPart_No_TextFiled_On_Add_SinglePart_page() {
		return Part_No_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getSerial_No_TextFiled_On_Add_SinglePart_page() {
		return Serial_No_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getProperty_Id_Dropdown_On_Add_SinglePart_page() {
		return Property_Id_Dropdown_On_Add_SinglePart_page;
	}
	public WebElement getLocation_Id_Dropdown_On_Add_SinglePart_page() {
		return Location_Id_Dropdown_On_Add_SinglePart_page;
	}
	public WebElement getUOM_TextFiled_On_Add_SinglePart_page() {
		return UOM_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getMTQ_TextFiled_On_Add_SinglePart_page() {
		return MTQ_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getQuantity_In_Hand_TextFiled_On_Add_SinglePart_page() {
		return Quantity_In_Hand_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getPrice_per_Piece_TextFiled_On_Add_SinglePart_page() {
		return Price_per_Piece_TextFiled_On_Add_SinglePart_page;
	}
	public WebElement getAdd_Parts_Button_On_Add_SinglePart_page() {
		return Add_Parts_Button_On_Add_SinglePart_page;
	}
	public WebElement getCancel_Button_On_Add_SinglePart_page() {
		return Cancel_Button_On_Add_SinglePart_page;
	}
	public WebElement getOk_button_on_add_part_confirmation_page() {
		return Ok_button_on_add_part_confirmation_page;
	}
	public WebElement getBulk_Upload_Tab() {
		return Bulk_Upload_Tab;
	}
	public WebElement getDownload_sample_sheet_Tab_On_Bulk_Upload() {
		return Download_sample_sheet_Tab_On_Bulk_Upload;
	}
	public WebElement getClick_Here_To_upload_File_Path() {
		return Click_Here_To_upload_File_Path;
	}
	public WebElement getUpload_Button_On_Bulk_Upload_Page() {
		return Upload_Button_On_Bulk_Upload_Page;
	}

	//Business Logic
	public void ClickOn_Transferred_Tab()
	{
		Transferred_Tab.click();
	}
	public void ClickOn_On_Property_Tab()
	{
		On_Property_Tab.click();
	}
	public void CLickOn_Filter_Tab()
	{
		Filter_Tab.click();
	}
	public void ClickOn_Filter_By_Property()
	{
		Filter_By_Property.click();
	}
	public void ClickOn_Filter_By_Property_SearchBox(String search_property)
	{
		Filter_By_Property_SearchBox.sendKeys(search_property);
	}
	public void ClickOn_Filter_By_Select_Property_By_dynamic_Text()
	{
		Filter_By_Select_Property_By_dynamic_Text.click();
	}
	public void ClickOn_Filter_By_Search_Part_No(String Part_No)
	{
		Filter_By_Search_Part_No.sendKeys(Part_No);
	}
	public void ClickOn_Filter_By_Search_Part_Name(String Part_Name)
	{
		Filter_By_Search_Part_Name.sendKeys(Part_Name);
	}
	public void ClickOn_Filter_Apply_Button()
	{
		Filter_Apply_Button.click();
	}
	public void ClickOn_Clear_Button()
	{
		Clear_Button.click();
	}
	public void ClickOn_dynamic_Click_On_partname()
	{
		dynamic_Click_On_partname.click();
	}
	public void ClickOn_QR_Button_On_Part_InfoPage()
	{
		QR_Button_On_Part_InfoPage.click();
	}
	public void CLickOn_Edit_Button_On_Part_InfoPage()
	{
		Edit_Button_On_Part_InfoPage.click();

	}
	public void ClickOn_View_OR_Edit_Location_Button_On_Part_InfoPage()
	{
		View_OR_Edit_Location_Button_On_Part_InfoPage.click();
	}
	public void CLickOn_Select_Location_DropdownBy_VisibleText(String Location_Text)
	{
		Select sel=new Select(Select_Location_Dropdown);
		sel.selectByVisibleText(Location_Text);
	}
	public void ClickOn_Select_Location_Dropdown_By_Index(int Index)
	{
		Select sel=new Select(Select_Location_Dropdown);
		sel.selectByIndex(Index);
	}
	public void CLickOn_Select_Location_Dropdown_By_Value(String Value)
	{
		Select sel=new Select(Select_Location_Dropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_Set_New_Location_Button()
	{
		Set_New_Location_Button.click();
	}
   public void CLickOn_Ok_Button_On_edit_location_Confirmation_Page()
   {
	   Ok_Button_On_edit_location_Confirmation_Page.click();
   }
   public void CLickOn_Update_Quantity_Button_On_Part_InfoPage()
   {
	   Update_Quantity_Button_On_Part_InfoPage.click();
   }
   public void ClickOn_orderPoId_Text_Filed_On_Update_quantity_Page(String OderPoID)
   {
	   orderPoId_Text_Filed_On_Update_quantity_Page.sendKeys(OderPoID);
   }
   public void CLickOn_Quantity_Ordered_TextField_On_Update_quantity_Page(String Quantity_Ordered)
   {
	   Quantity_Ordered_TextField_On_Update_quantity_Page.sendKeys(Quantity_Ordered);
   }
   public void CLickOn_Quantity_Received_TextField_On_Update_quantity_Page(String Quantity_Received)
   {
	   Quantity_Received_TextField_On_Update_quantity_Page.sendKeys(Quantity_Received);
   }
   public void CLickOn_Price_TextField_On_Update_quantity_Page(String Price)
   {
	   Price_TextField_On_Update_quantity_Page.sendKeys(Price);
   }
   public void ClickOn_Select_Status_Dropdown_On_Update_quantity_Page_By_VisibleText(String Text)
   {
	   Select sel=new Select(Select_Status_Dropdown_On_Update_quantity_Page);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Select_Status_Dropdown_On_Update_quantity_Page_By_Index(int Index)
   {
	   Select sel=new Select(Select_Status_Dropdown_On_Update_quantity_Page);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Select_Status_Dropdown_On_Update_quantity_Page_By_Value(String Value)
   {
	   Select sel=new Select(Select_Status_Dropdown_On_Update_quantity_Page);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Update_Button_Update_quantity_Page()
   {
	   Update_Button_Update_quantity_Page.click();
   }
   public void ClickOn_Ok_Button_parts_Update_Confirmation_Page()
   {
	   Ok_Button_parts_Update_Confirmation_Page.click();
   }
   public void ClickOn_Slider_On_Update_quantity_Page()
   {
	   Slider_On_Update_quantity_Page.click();
   }
   public void ClickOn_Select_Status_Dropdown_On_Decrease_quantity_Page_By_VisibleText(String Enter_TExt)
   {
	   Select sel=new Select(Select_Status_Dropdown_On_Decrease_quantity_Page);
	   sel.selectByVisibleText(Enter_TExt);
   }
   public void ClickOn_Select_Status_Dropdown_On_Decrease_quantity_Page_By_Index(int Index)
   {
	   Select sel=new Select(Select_Status_Dropdown_On_Decrease_quantity_Page);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Select_Status_Dropdown_On_Decrease_quantity_Page_By_Value(String Value)
   {
	   Select sel=new Select(Select_Status_Dropdown_On_Decrease_quantity_Page);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Quantity_TextBox_On_Decrease_quantity_Page(String Quantity)
   {
	   Quantity_TextBox_On_Decrease_quantity_Page.sendKeys(Quantity);
   }
   public void ClickOn_Decrease_Button_Update_quantity_Page()
   {
	   Decrease_Button_Update_quantity_Page.click();
   }
   public void ClickOn_Ok_Button_parts_Decrease_Confirmation_Page()
   {
	   Ok_Button_parts_Decrease_Confirmation_Page.click();
   }
   public void ClickOn_Vendors_Tab_On_Info_Page()
   {
	   Vendors_Tab_On_Info_Page.click();
   }
   public void ClickOn_Add_a_Vendor_Button_On_Vendors_Page()
   {
	   Add_a_Vendor_Button_On_Vendors_Page.click();
   }
   public void ClickOn_Vendor_Name_Text_Box(String Vendor_Name)
   {
	   Vendor_Name_Text_Box.sendKeys(Vendor_Name);
   }
   public void ClickOn_Email_Id_TextBox(String Email)
   {
	   Email_Id_TextBox.sendKeys(Email);
   }
   public void ClickOn_Mobile_No_TextBox()
   {
	   Mobile_No_TextBox.sendKeys("Mobile_No");
   }
   public void ClickOn_Contact_Person_TextBox(String Contact_Person)
   {
	   Contact_Person_TextBox.sendKeys(Contact_Person);
   }
   public void ClickOn_Cancel_Button_On_Add_Vendor_Page()
   {
	   Cancel_Button_On_Add_Vendor_Page.click();
   }
   public void ClickOn_Submit_Button__Add_Vendor_Page()
   {
	   Submit_Button__Add_Vendor_Page.click();
   }
   public void ClickOn_Ok_Button__Add_Vendor_Confirmation_Page()
   {
	   Ok_Button__Add_Vendor_Confirmation_Page.click();
   }
   public void CLickOn_Assets_Tab_On_Info_Page()
   {
	   Assets_Tab_On_Info_Page.click();
   }
   public void ClickOn_Logs_Tab_On_Info_Page()
   {
	   Logs_Tab_On_Info_Page.click();
   }
   public void ClickOn_Files_Tab_OnLogs_Page()
   {
	   Files_Tab_OnLogs_Page.click();
   }
   public void CLickOn_Activity_Logs_Tab_OnLogs_Page()
   {
	   Activity_Logs_Tab_OnLogs_Page.click();
   }
   public void ClickOn_Filter_By_Activity_TextField(String ENter_Activity)
   {
	   Filter_By_Activity_TextField.sendKeys(ENter_Activity);
   }
   public void ClickOn_Filter_By_Associate_Dropdown()
   {
	   Filter_By_Associate_Dropdown.click();
   }
   public void ClickOn_Filter_By_Associate_Dyamic_Name()
   {
	   Filter_By_Associate_Dyamic_Name.click();
   }
   public void ClickOn_Filter_By_Type_Of_Log_Dropdown()
   {
	   Filter_By_Type_Of_Log_Dropdown.click();
   }
   public void ClickOn_Filter_By_Depreciation_Dyamic_Name()
   {
	   Filter_By_Depreciation_Dyamic_Name.click();
   }
   public void CLickOn_Filter_By_File_name(String File_Name)
   {
	   Filter_By_File_name.sendKeys(File_Name);
   }
   public void ClickOn_Filter_By_Uploaded_By()
   {
	   Filter_By_Uploaded_By.click();
   }
   public void CLickOn_Filter_By_Uploaded_By_SerachBox(String Search_UploadedBy)
   {
	   Filter_By_Uploaded_By_SerachBox.sendKeys(Search_UploadedBy);
   }
   public void ClickOn_Filter_By_Uploaded_By_Dynamic_Name()
   {
	   Filter_By_Uploaded_By_Dynamic_Name.click();
   }
   public void ClickOn_Reports_Tab_On_PartsInfo_Page()
   {
	   Reports_Tab_On_PartsInfo_Page.click();
   }
   public void ClickOn_Search_Button_On_Reports_Page()
   {
	   Search_Button_On_Reports_Page.click();
   }
   public void ClickOn_Clear_Button_On_Reports_Page()
   {
	   Clear_Button_On_Reports_Page.click();
   }
   public void clickOn_Parts_Reports_Download_Icon()
   {
	   Parts_Reports_Download_Icon.click();
   }
   public void ClickOn_Parts_Reports_Download_As_PDF_Tab()
   {
	   Parts_Reports_Download_As_PDF_Tab.click();
   }
   public void ClickOn_Notify__Tab_On_PartsInfo_Page()
   {
	   Notify__Tab_On_PartsInfo_Page.click();
   }
   public void ClickOn_Notif_User_Dropdown_By_VisibleText(String Text)
   {
	   Select sel=new Select(Notif_User_Dropdown);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Notif_User_Dropdown_By_Index(int Index)
   {
	   Select sel=new Select(Notif_User_Dropdown);
	   sel.selectByIndex(Index);
   }
   public void ClickOn_Notif_User_Dropdown_By_Value(String Value)
   {
	   Select sel=new Select(Notif_User_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Transfer_Button()
   {
	   Transfer_Button.click();
   }
   public void ClickOn_Add_Parts_Tab()
   {
	   Add_Parts_Tab.click();
   }
   public void ClickOn_Add_Parts_SingleTab()
   {
	   Add_Parts_SingleTab.click();
   }
   public void ClickOn_PartName_TextFiled_On_Add_SinglePart_page(String Part_Name)
   {
	   PartName_TextFiled_On_Add_SinglePart_page.sendKeys(Part_Name);
   }
   public void ClickOn_Part_No_TextFiled_On_Add_SinglePart_page(String Part_No)
   {
	   Part_No_TextFiled_On_Add_SinglePart_page.sendKeys(Part_No);
   }
   public void ClickOn_Serial_No_TextFiled_On_Add_SinglePart_page(String Serial_No)
   {
	   Serial_No_TextFiled_On_Add_SinglePart_page.sendKeys(Serial_No);
   }
   public void ClickOn_Property_Id_Dropdown_On_Add_SinglePart_page_By_VisibleText(String Text)
   {
	   Select sel=new Select(Property_Id_Dropdown_On_Add_SinglePart_page);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Property_Id_Dropdown_On_Add_SinglePart_page_By_Value(String Value)
   {
	   Select sel=new Select(Property_Id_Dropdown_On_Add_SinglePart_page);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Property_Id_Dropdown_On_Add_SinglePart_page_By_Index(int Index)
   {
	   Select sel=new Select(Property_Id_Dropdown_On_Add_SinglePart_page);
sel.selectByIndex(Index);
   }
   public void ClickOn_Location_Id_Dropdown_On_Add_SinglePart_page(String Text)
   {
	   Select sel=new Select(Location_Id_Dropdown_On_Add_SinglePart_page);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_Location_Id_Dropdown_On_Add_SinglePart_page_By_Index(String Value)
   {
	   Select sel=new Select(Location_Id_Dropdown_On_Add_SinglePart_page);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Location_Id_Dropdown_On_Add_SinglePart_page_By_Index(int Index)
   {
Select sel=new Select(Location_Id_Dropdown_On_Add_SinglePart_page);
sel.selectByIndex(Index);
   }
   public void ClickOn_UOM_TextFiled_On_Add_SinglePart_page(CharSequence Unit_Of_Measure)
   {
	   UOM_TextFiled_On_Add_SinglePart_page.sendKeys(Unit_Of_Measure);
   }
   public void ClickOn_MTQ_TextFiled_On_Add_SinglePart_page(String Minimum_Threshold_Qty)
   {
	   MTQ_TextFiled_On_Add_SinglePart_page.sendKeys(Minimum_Threshold_Qty);
   }
   public void ClickOn_Quantity_In_Hand_TextFiled_On_Add_SinglePart_page(String Quantity_In_Hand)
   {
	   Quantity_In_Hand_TextFiled_On_Add_SinglePart_page.sendKeys(Quantity_In_Hand);
   }
   public void ClickOn_Price_per_Piece_TextFiled_On_Add_SinglePart_page(String Price_Per_Piece)
   {
	   Price_per_Piece_TextFiled_On_Add_SinglePart_page.sendKeys(Price_Per_Piece);
   }
   public void ClickOn_Add_Parts_Button_On_Add_SinglePart_page()
   {
	   Add_Parts_Button_On_Add_SinglePart_page.click();
   }
   public void ClickOn_Cancel_Button_On_Add_SinglePart_page()
   {
	   Cancel_Button_On_Add_SinglePart_page.click();
   }
   public void ClickOn_Ok_button_on_add_part_confirmation_page()
   {
	   Ok_button_on_add_part_confirmation_page.click();
   }
   public void ClickOn_Bulk_Upload_Tab()
   {
	   Bulk_Upload_Tab.click();
   }
   public void ClickOn_Download_sample_sheet_Tab_On_Bulk_Upload()
   {
	   Download_sample_sheet_Tab_On_Bulk_Upload.click();
   }
   public void ClickOn_Click_Here_To_upload_File_Path(String Enter_File_Path)
   {
	   Click_Here_To_upload_File_Path.sendKeys(Enter_File_Path);
   }
   public void ClickOn_Upload_Button_On_Bulk_Upload_Page()
   {
	   Upload_Button_On_Bulk_Upload_Page.click();
	   try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
   
   
   
   







}
