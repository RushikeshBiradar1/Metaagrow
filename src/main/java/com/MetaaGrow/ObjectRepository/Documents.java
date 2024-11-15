package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Documents {
	
	//Initialization
	public  Documents(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//span[.='Filter']")private WebElement FilterIcon;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement Property_Filter;
	@FindBy(xpath = "(//input[@id='custom'])[2]")private WebElement propertySearchBox;
	public WebElement getPropertySearchBox() {
		return propertySearchBox;
	}

	@FindBy(xpath = "//input[@placeholder='Document Provider']")private WebElement Document_Provider_TextField_Filter;
	@FindBy(xpath = "//input[@placeholder='Document Type']")private WebElement Document_Type_TextFiled_Filter;
	@FindBy(xpath = "//span[.='Apply']")private WebElement Apply_Button;
	@FindBy(xpath = "//span[.='Clear']")private WebElement Filter_Clear_Button;
	@FindBy(xpath = "//img[@src='../../assets/images/icons/right.svg']")private WebElement Right_Slide_Arrow;
	@FindBy(xpath = "//img[@src='../../assets/images/icons/left.svg']")private WebElement Left_Slide_Arrow;
	@FindBy(xpath = "//span[text()='Back']")private WebElement Back_Button;
	@FindBy(xpath = "//span[text()='Add New Document']")private WebElement Add_New_Document_Button;
	@FindBy(xpath = "//input[@placeholder='Document Provider Name']")private WebElement Document_Provider_Name_TExtField;
	@FindBy(xpath = "//input[@placeholder='Document Type']")private WebElement Document_Type_TextField;
	@FindBy(xpath = "//input[@placeholder='Document Cost']")private WebElement Document_Cost_TExtField;
	@FindBy(xpath = "//input[@placeholder='Document Number']")private WebElement Document_Number_TextField;
	@FindBy(xpath = "//select[@formcontrolname='status']")private WebElement Status_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='outletId']")private WebElement select_Property_Dropdown;
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement select_Asset_Dropdown;
	@FindBy(xpath = "//span[.='Cancel']")private WebElement Cancel_Button_On_Add_Page;
	@FindBy(xpath = "//span[.='Close']")private WebElement Close_Button_On_Add_Page;
	@FindBy(xpath = "//span[.='Add Document']")private WebElement Add_Document_Button_On_AddPage;
	@FindBy(xpath = "//input[@placeholder='Expiration Date']")private WebElement Expiration_Date_DateField_On_AddNew_Document;
	@FindBy(xpath = "//input[@placeholder='Start Date']")private WebElement Start_Date_DateField;
	@FindBy(xpath = "//input[@placeholder='End Date']")private WebElement End_Date_DateField;
	@FindBy(xpath = "(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")private WebElement Calender_Month_Year_Path;
	@FindBy(xpath = "//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")private WebElement Previous_Month_Icon;
	@FindBy(xpath = "//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")private WebElement Next_Month_Icon;
	@FindBy(xpath = "//button[normalize-space()='Confirm Changes']")private WebElement ConfirmChangesButton;
	@FindBy(xpath = "//div[@class='col-auto ng-star-inserted']//button[@type='button'][normalize-space()='Ok']")private WebElement OkButton_On_editChangesCOnfirmation_Page;
	@FindBy(xpath = "//span[normalize-space()='Save']")private WebElement SaveButtonOnNotificationSetting;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement OkButton_OnNotificationSetting_ConfirmationPage;
	
	public WebElement getSaveButtonOnNotificationSetting() {
		return SaveButtonOnNotificationSetting;
	}
	public WebElement getOkButton_OnNotificationSetting_ConfirmationPage() {
		return OkButton_OnNotificationSetting_ConfirmationPage;
	}
	public WebElement getConfirmChangesButton() {
		return ConfirmChangesButton;
	}
	public WebElement getOkButton_On_editChangesCOnfirmation_Page() {
		return OkButton_On_editChangesCOnfirmation_Page;
	}

	@FindBy(xpath = "//button[normalize-space()='Info']")private WebElement InfoTab;
    @FindBy(xpath = "//span[normalize-space()='Edit']")private WebElement EditIconOnInfoPage;
    @FindBy(xpath = "//button[normalize-space()='Assets Covered']")private WebElement Assets_CoveredInfoPage;
    @FindBy(xpath = "//button[normalize-space()='Files']")private WebElement FilesTabOnInfoPage;
    @FindBy(xpath = "//button[normalize-space()='Notification Settings']")private WebElement NotificationSettingOnInfoPage;
    @FindBy(xpath = "//select[@class='form-control normalSelect']")private WebElement UserstobenotifiedDropdownOn;
    @FindBy(xpath = "(//select[@class='form-control ng-pristine ng-valid ng-touched'])[1]")private WebElement SelectWhenToBeNotifyPeriodDropdown;
    @FindBy(xpath = "(//select[@class='form-control ng-pristine ng-valid ng-touched'])[2]")private WebElement SelectWhenToBeNotifyDayDropdown;
	@FindBy(xpath = "//ul[@class='action-buttons']//button[@type='button']")private WebElement DownloadPDFButton;
	
    
    //Getters Methods
    
    
    public WebElement getDownloadPDFButton() {
		return DownloadPDFButton;
	}
	public WebElement getInfoTab() {
		return InfoTab;
	}
	public WebElement getEditIconOnInfoPage() {
		return EditIconOnInfoPage;
	}
	public WebElement getAssets_CoveredInfoPage() {
		return Assets_CoveredInfoPage;
	}
	public WebElement getFilesTabOnInfoPage() {
		return FilesTabOnInfoPage;
	}
	public WebElement getNotificationSettingOnInfoPage() {
		return NotificationSettingOnInfoPage;
	}
	public WebElement getUserstobenotifiedDropdownOn() {
		return UserstobenotifiedDropdownOn;
	}
	public WebElement getSelectWhenToBeNotifyPeriodDropdown() {
		return SelectWhenToBeNotifyPeriodDropdown;
	}
	public WebElement getSelectWhenToBeNotifyDayDropdown() {
		return SelectWhenToBeNotifyDayDropdown;
	}
    
	public WebElement getFilterIcon() {
		return FilterIcon;
	}
	public WebElement getProperty_Filter() {
		return Property_Filter;
	}
	public WebElement getDocument_Provider_TextField_Filter() {
		return Document_Provider_TextField_Filter;
	}
	public WebElement getDocument_Type_TextFiled_Filter() {
		return Document_Type_TextFiled_Filter;
	}
	public WebElement getApply_Button() {
		return Apply_Button;
	}
	public WebElement getFilter_Clear_Button() {
		return Filter_Clear_Button;
	}
	public WebElement getRight_Slide_Arrow() {
		return Right_Slide_Arrow;
	}
	public WebElement getLeft_Slide_Arrow() {
		return Left_Slide_Arrow;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}
	public WebElement getAdd_New_Document_Button() {
		return Add_New_Document_Button;
	}
	public WebElement getDocument_Provider_Name_TExtField() {
		return Document_Provider_Name_TExtField;
	}
	public WebElement getDocument_Type_TextField() {
		return Document_Type_TextField;
	}
	public WebElement getDocument_Cost_TExtField() {
		return Document_Cost_TExtField;
	}
	public WebElement getDocument_Number_TextField() {
		return Document_Number_TextField;
	}
	public WebElement getStatus_Dropdown() {
		return Status_Dropdown;
	}
	public WebElement getSelect_Property_Dropdown() {
		return select_Property_Dropdown;
	}
	public WebElement getSelect_Asset_Dropdown() {
		return select_Asset_Dropdown;
	}
	public WebElement getCancel_Button_On_Add_Page() {
		return Cancel_Button_On_Add_Page;
	}
	public WebElement getClose_Button_On_Add_Page() {
		return Close_Button_On_Add_Page;
	}
	public WebElement getAdd_Document_Button_On_AddPage() {
		return Add_Document_Button_On_AddPage;
	}
	public WebElement getExpiration_Date_DateField_On_AddNew_Document() {
		return Expiration_Date_DateField_On_AddNew_Document;
	}
	public WebElement getStart_Date_DateField() {
		return Start_Date_DateField;
	}
	public WebElement getEnd_Date_DateField() {
		return End_Date_DateField;
	}
	public WebElement getCalender_Month_Year_Path() {
		return Calender_Month_Year_Path;
	}
	public WebElement getPrevious_Month_Icon() {
		return Previous_Month_Icon;
	}
	public WebElement getNext_Month_Icon() {
		return Next_Month_Icon;
	}
	
	
	//Business Logic 
	public void ClickOn_FilterIcon()
	{
		FilterIcon.click();
	}
	public void ClickOn_Property_Filter()
	{
		Property_Filter.click();
	}
	public void ClickOn_Document_Provider_TextField_Filter(String Enter_Document_Provider)
	{
		Document_Provider_TextField_Filter.sendKeys(Enter_Document_Provider);
	}
	public void CLickOn_Document_Type_TextFiled_Filter(String Enter_Document_Type)
	{
		Document_Type_TextFiled_Filter.sendKeys(Enter_Document_Type);
	}
	public void CLickOn_Apply_Button()
	{
		Apply_Button.click();
	}
	public void ClickOn_Filter_Clear_Button()
	{
		Filter_Clear_Button.click();
	}
	public void CLickOn_Right_Slide_Arrow()
	{
		Right_Slide_Arrow.click();
	}
	public void CLickOn_Left_Slide_Arrow()
	{
		Left_Slide_Arrow.click();
	}
	public void ClickOn_Back_Button()
	{
		Back_Button.click();
	}
	public void CLickOn_Add_New_Document_Button()
	{
		Add_New_Document_Button.click();
	}
	public void ClickOn_Document_Provider_Name_TExtField(String Enter_Document_Provider_Name)
	{
		Document_Provider_Name_TExtField.sendKeys(Enter_Document_Provider_Name);
	}
	public void ClickOn_Document_Type_TextField(String Enter_Document_Type)
	{
		Document_Type_TextField.sendKeys(Enter_Document_Type);
	}
	public void ClickOn_Document_Cost_TExtField(String Enter_DOcument_Cost)
	{
		Document_Cost_TExtField.sendKeys(Enter_DOcument_Cost);
	}
	public void CLickOn_Document_Number_TextField(String Enter_Document_Number)
	{
		Document_Number_TextField.sendKeys(Enter_Document_Number);
	}
	public void Select_Status_DropdownBy_VisibleTExt(String ENter_TExt)
	{
		Select sel=new Select(Status_Dropdown);
		sel.selectByVisibleText(ENter_TExt);
	}
	public void Select_Status_DropdownBy_Index( int ENter_Value)
	{
		Select sel=new Select(Status_Dropdown);
		sel.selectByIndex(ENter_Value);
	}
	public void Select_Status_DropdownBy_Value(String Value)
	{
		Select sel=new Select(Status_Dropdown);
		sel.deselectByValue(Value);
	}
	public void Select_Property_DropdownBy_VisibleText(String ENter_Text)
	{
		Select sel=new Select(select_Property_Dropdown);
		sel.selectByVisibleText(ENter_Text);
	}
	public void Select_Property_DropdownBy_Value(String Value)
	{
		Select sel=new Select(select_Property_Dropdown);
		sel.selectByValue(Value);
	}
    public void select_Property_DropdownBy_Index(int Index)
    {
    	Select sel=new Select(select_Property_Dropdown);
    	sel.selectByIndex(Index);
    }
    public void clickOn_Asset_DropdownBy_VisibleTExt()
    {
    	select_Asset_Dropdown.click();
    	
    }
//    public void select_Asset_DropdownBy_Value(String Value)
//    {
//    	Select sel=new Select(select_Asset_Dropdown);
//    	sel.selectByValue(Value);
//    }
//    public void select_Asset_DropdownBy_Index(int Index)
//    {
//    	Select sel=new Select(select_Asset_Dropdown);
//    	sel.selectByIndex(Index);
//    }
    public void ClickOn_Cancel_Button_On_Add_Page()
    {
    	Cancel_Button_On_Add_Page.click();
    }
    public void ClickOn_Close_Button_On_Add_Page()
    {
    	Close_Button_On_Add_Page.click();
    }
    public void ClickOn_Add_Document_Button_On_AddPage()
    {
    	Add_Document_Button_On_AddPage.click();
    }
    public void ClickOn_Expiration_Date_DateField_On_AddNew_Document(WebDriver driver)
    {
    	Expiration_Date_DateField_On_AddNew_Document.click();
    	String Expiration_month="Jan-2024";
		String Expiration_day="10";
		while(true)
		{
				//(Month-Year) path
			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
			System.out.println(text);
			if(text.equals(Expiration_month))
			{
				break;
			}
			else
			{
				//Date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
				
			}
		
		}
		driver.findElement(By.xpath("//span[normalize-space()="+Expiration_day+"]")).click();
	}
    public void ClickOn_Calender_Month_Year_Path()
    {
    	Calender_Month_Year_Path.click();
    }
    public void CLickOn_Previous_Month_Icon()
    {
    	Previous_Month_Icon.click();
    }
    public void ClickOn_Next_Month_Icon()
    {
    	Next_Month_Icon.click();
    }
    public void ClickOn_propertySearchBox(String Search_Property)
    {
    	propertySearchBox.sendKeys(Search_Property);
    }
    public void ClickOn_InfoTab()
	{
		InfoTab.click();
	}
	public void ClickOn_EditIconOnInfoPage()
	{
		EditIconOnInfoPage.click();
	}
	public void ClickOn_Assets_CoveredInfoPage()
	{
		Assets_CoveredInfoPage.click();
	}
	public void ClickOn_FilesTabOnInfoPage()
	{
		FilesTabOnInfoPage.click();
	}
	public void clickOn_NotificationSettingOnInfoPage()
	{
		NotificationSettingOnInfoPage.click();
	}
	public void Select_UserstobenotifiedDropdownOn(String Text)
	{
		Select sel=new Select(UserstobenotifiedDropdownOn);
		sel.selectByVisibleText(Text);
	}
	public void Select_SelectWhenToBeNotifyPeriodDropdown(String Text)
	{
		Select sel=new Select(SelectWhenToBeNotifyPeriodDropdown);
		sel.selectByVisibleText(Text);
	}
	public void Select_SelectWhenToBeNotifyDayDropdown(String Text)
	{
		Select sel=new Select(SelectWhenToBeNotifyDayDropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClearDocument_Cost_TExtField()
	{
		Document_Cost_TExtField.clear();
	}
	public void ClickOn_ConfirmChangesButton()
	{
		ConfirmChangesButton.click();
	}
	public void ClickOn_OkButton_On_editChangesCOnfirmation_Page()
	{
		OkButton_On_editChangesCOnfirmation_Page.click();
	}
	public void ClickOn_SaveButtonOnNotificationSetting()
	{
		SaveButtonOnNotificationSetting.click();
	}
	public void ClickOn_OkButton_OnNotificationSetting_ConfirmationPage()
	{
		OkButton_OnNotificationSetting_ConfirmationPage.click();
	}
	public void ClickOn_DownloadPDFButton()
	{
		DownloadPDFButton.click();
	}
}
