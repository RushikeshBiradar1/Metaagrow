package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class Meters {
	
   WebDriver driver;
	//Initiazation
	public Meters(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//button[.='Inactive ']")private WebElement InactivePage_Button;
	@FindBy(xpath = "//button[@class='active button']")private WebElement ActivePage_Button;
	@FindBy(xpath = "//span[.='Add New Meter']")private WebElement Add_New_Meter_Button;
	@FindBy(xpath = "//input[@formcontrolname='meterName']")private WebElement Meter_Name_TextField;
	@FindBy(xpath = "//div[@class='form-group']//div[@class='form-group']//span[@id='custom']")private WebElement UOM_Dropdown;
	@FindBy(name = "autocomplete")private WebElement UOM_search_Box;
	@FindBy(xpath = "//input[@placeholder='Add Custom Unit']")private WebElement Add_Custom_Unit_TextField;
	@FindBy(xpath = "//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-meter-add-new/div[@class='full-modal modal']/div[@role='document']/div[@class='modal-content']/div[@class='modal-body']/div[@class='tab-content transfer-type']/div[@role='tabpanel']/div/form[@name='meterDetailsForm']/ul[@class='row']/li[@class='col-6']/div[@class='form-group']/button[1]")private WebElement Frequency_Measurement_Dropdown;
	@FindBy(xpath = "//a[.='Custom']")private WebElement Custom_Frequency_Of_Measurement;
	@FindBy(xpath = "//a[.='Once']")private WebElement Once_Frequency_Of_Measurement;
	@FindBy(xpath = "//a[.='Daily']")private WebElement Daily_Frequency_Of_Measurement;
	@FindBy(xpath = "//a[.='Monthly']")private WebElement Monthly_Frequency_Of_Measurement;
	@FindBy(xpath = "//a[.='Weekly']")private WebElement Weekly_Frequency_Of_Measurement;
	@FindBy(xpath = "//input[@placeholder='Frequency']")private WebElement Custom_Frequency_TextField;
	@FindBy(xpath = "//span[.='Select Measurement']")private WebElement Select_Measurement_Dropdown;
	@FindBy(xpath = "//a[.='Day']")private WebElement Day_Measurement;
	@FindBy(xpath = "//a[.='Week']")private WebElement Week_Measurement;
	@FindBy(xpath = "//a[.='Month']")private WebElement Month_Measurement;
	@FindBy(xpath = "//a[.='Year']")private WebElement Year_Measurement;
	@FindBy(xpath = "//select[@formcontrolname='property']")private WebElement Select_Property_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='location']")private WebElement Select_Location_Dropdown;
	@FindBy(xpath = "//select[@formcontrolname='asset']")private WebElement Select_Asset_Dropdown;
	@FindBy(xpath = "//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-meter-add-new/div[@class='full-modal modal']/div[@role='document']/div[@class='modal-content']/div[@class='modal-body']/div[@class='tab-content transfer-type']/div[@role='tabpanel']/div/ul[@class='row']/li[@class='col-6']/div[@class='form-group']/select[1]")private WebElement Select_Assignee_Dropdown;
	@FindBy(xpath = "//div[@class='img-box text-wt-drk']")private WebElement Add_Another_Assignee_Icon;
	@FindBy(xpath = "//img[@src='../../assets/images/icons/close.svg']")private WebElement Remove_another_assignee_Icon;
	@FindBy(xpath = "//span[.='Next']")private WebElement Next_Button;
	@FindBy(xpath = "//span[.='Cancel']")private WebElement Cancel_Button;
	@FindBy(xpath = "//span[.='Add Meter']")private WebElement Add_meter_button_on_confirmation_page;
	@FindBy(xpath = "//button[@id='dismissOk']")private WebElement OK_button_on_confirmation_page;
	@FindBy(xpath = "//SPAN[.='Filter']")private WebElement Filter_Icon;
	@FindBy(xpath = "//SPAN[.='Select Property']")private WebElement Filter_by_Property;
	@FindBy(xpath = "//li[1]//ul[1]//li[1]//div[1]//input[1]")private WebElement Filter_By_property_searchBox;
	@FindBy(xpath = "//span[.='Select Location']")private WebElement Filter_By_Location;
	@FindBy(xpath = "//li[2]//ul[1]//li[1]//div[1]//input[1]")private WebElement Location_SearchBox;
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement Filter_By_Asset;
	@FindBy(xpath = "//li[@id='custom']//ul[@id='custom']//li//input[@id='custom']")private WebElement Filter_By_Asset_SearchBox;
	@FindBy(xpath = "//input[@placeholder='Meter Name']")private WebElement Filter_By_Meter_Name_TextField;
	@FindBy(xpath = "//span[.='Apply']")private WebElement Filter_Apply_Button;
	@FindBy(xpath = "//span[.='Clear']")private WebElement Clear_Filter_Button;
	@FindBy(xpath = "//span[.='QR Code']")private WebElement QR_Code_Tab;
	@FindBy(xpath = "//label[normalize-space()='meter1']")private WebElement QRWithDyanamic_Xpath;
	@FindBy(xpath = "//span[.='Print']")private WebElement Print_Button;
	@FindBy(xpath = "//button[normalize-space()='Info']")private WebElement InfoPage;
	@FindBy(xpath = "//button[@class='button qr-bdr-btn']")private WebElement PrintQRButtonOnInfo;
	@FindBy(xpath = "//button[normalize-space()='Trigger']")private WebElement TriggerButtonOnInfo;
	
	public WebElement getTriggerButtonOnInfo() {
		return TriggerButtonOnInfo;
	}
	public WebElement getPrintQRButtonOnInfo() {
		return PrintQRButtonOnInfo;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getInfoPage() {
		return InfoPage;
	}
	public WebElement getEnterReadingtextField() {
		return EnterReadingtextField;
	}
	public WebElement getAddreadingButton() {
		return AddreadingButton;
	}
	public WebElement getPrintQROnInfo() {
		return PrintQROnInfo;
	}
	public WebElement getHistoryTab() {
		return HistoryTab;
	}
	public WebElement getFilterIconOnHistoryPage() {
		return FilterIconOnHistoryPage;
	}
	public WebElement getFilterBystartDateInHistoryPage() {
		return FilterBystartDateInHistoryPage;
	}
	public WebElement getFilterByEndDateInHistoryPage() {
		return FilterByEndDateInHistoryPage;
	}
	public WebElement getApplyButton() {
		return ApplyButton;
	}
	public WebElement getClearButton() {
		return ClearButton;
	}
	public WebElement getExportButton() {
		return ExportButton;
	}
	public WebElement getNewTriggerButton() {
		return NewTriggerButton;
	}
	public WebElement getMeterReadingDropdownOnAddTriggerPage() {
		return MeterReadingDropdownOnAddTriggerPage;
	}
	public WebElement getSetThresholdValueOnAddTriggerPage() {
		return SetThresholdValueOnAddTriggerPage;
	}
	public WebElement getTicketTitleOnAddTriggerPage() {
		return TicketTitleOnAddTriggerPage;
	}
	public WebElement getDescriptionOnAddTriggerPage() {
		return DescriptionOnAddTriggerPage;
	}
	public WebElement getDepartmentdropdownOnAddTriggerPage() {
		return departmentdropdownOnAddTriggerPage;
	}
	public WebElement getHighPriority() {
		return HighPriority;
	}
	public WebElement getMediumPriority() {
		return MediumPriority;
	}
	public WebElement getLowPriority() {
		return LowPriority;
	}
	public WebElement getUserDropdownOnAddTriggerPage() {
		return UserDropdownOnAddTriggerPage;
	}
	public WebElement getAddanotherIconOnTriggerPage() {
		return AddanotherIconOnTriggerPage;
	}
	public WebElement getNextButtonOnTriggerPage() {
		return NextButtonOnTriggerPage;
	}
	public WebElement getCancelButtonOnTriggerPage() {
		return CancelButtonOnTriggerPage;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	public WebElement getButtonButton() {
		return ButtonButton;
	}
	public WebElement getOkButtonOnMetertriggersetsuccessfullyPopup() {
		return OkButtonOnMetertriggersetsuccessfullyPopup;
	}

	@FindBy(xpath = "//input[@id='assetName']")private WebElement EnterReadingtextField;
	@FindBy(xpath = "//span[normalize-space()='Add Reading']")private WebElement AddreadingButton;
	@FindBy(xpath = "//span[normalize-space()='Print QR Code']")private WebElement PrintQROnInfo;
	@FindBy(xpath = "//button[normalize-space()='History']")private WebElement HistoryTab;
	@FindBy(xpath = "//img[@alt='Delete']")private WebElement FilterIconOnHistoryPage;
	@FindBy(xpath = "//input[@placeholder='Start Date']")private WebElement FilterBystartDateInHistoryPage;
	@FindBy(xpath = "//input[@placeholder='End Date']")private WebElement FilterByEndDateInHistoryPage;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement ApplyButton;
	@FindBy(xpath = "//span[normalize-space()='Clear']")private WebElement ClearButton;
	@FindBy(xpath = "//span[.='Export']")private WebElement ExportButton;
	@FindBy(xpath = "//span[normalize-space()='New Trigger']")private WebElement NewTriggerButton;
	@FindBy(xpath = "//select[@formcontrolname='option']")private WebElement MeterReadingDropdownOnAddTriggerPage;
	@FindBy(xpath = "//input[@placeholder='Set threshold value']")private WebElement SetThresholdValueOnAddTriggerPage;
	@FindBy(xpath = "//input[@placeholder='Type the title here']")private WebElement TicketTitleOnAddTriggerPage;
	@FindBy(xpath = "//textarea[@placeholder='Description']")private WebElement DescriptionOnAddTriggerPage;
	@FindBy(xpath = "//select[@formcontrolname='department']")private WebElement departmentdropdownOnAddTriggerPage;
	@FindBy(xpath = "//div[normalize-space()='High']")private WebElement HighPriority;
	@FindBy(xpath = "//select[@formcontrolname=' Medium ']")private WebElement MediumPriority;
	@FindBy(xpath = "//div[normalize-space()='Low']")private WebElement LowPriority;
	@FindBy(xpath = "(//select[@id='selectUser'])[4]")private WebElement UserDropdownOnAddTriggerPage;
	@FindBy(xpath = "//div[@class='img-box aa']")private WebElement AddanotherIconOnTriggerPage;
	@FindBy(xpath = "//span[normalize-space()='Next']")private WebElement NextButtonOnTriggerPage;
	@FindBy(xpath = "//span[.='Cancel']")private WebElement CancelButtonOnTriggerPage;
	@FindBy(xpath = "//span[normalize-space()='Save']")private WebElement SaveButton;
	@FindBy(xpath = "//span[normalize-space()='Back']")private WebElement ButtonButton;
	@FindBy(xpath = "//button[@id='dismissOk']")private WebElement OkButtonOnMetertriggersetsuccessfullyPopup;
	@FindBy(xpath = "//button[normalize-space()='Confirm Changes']")private WebElement ConfirmChangesButtonOnEditMeterPage;
	public WebElement getConfirmChangesButtonOnEditMeterPage() {
		return ConfirmChangesButtonOnEditMeterPage;
	}
	public WebElement getEditMeter() {
		return EditMeter;
	}
	public WebElement getFrequencyOfMeasurementOnEditmeter() {
		return FrequencyOfMeasurementOnEditmeter;
	}
	public WebElement getWeeklyFrequency() {
		return WeeklyFrequency;
	}
	public WebElement getOkButton_OnEditedConfirmation() {
		return OkButton_OnEditedConfirmation;
	}

	@FindBy(xpath = "//span[normalize-space()='Edit']")private WebElement EditMeter;
	@FindBy(xpath = "//body/app-root/main[@class='main']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0 overflow-auto main-box']/app-meter-details/main[@class='main assets-details']/div[@class='container-fluid']/div[@class='row']/div[@class='col-lg px-0']/section[@class='info-section']/div[@class='round-shadow-box']/div[@class='row align-items-center']/div[@class='col-auto']/app-meter-details-edit/div[@id='duplicate']/div[@role='document']/div[@class='modal-content']/div[@class='modal-body']/form[@name='meterDetailsForm']/ul[@class='row']/li[@class='col-6']/div[@class='form-group']/button[1]")private WebElement FrequencyOfMeasurementOnEditmeter;
	@FindBy(xpath = "//a[normalize-space()='Weekly']")private WebElement WeeklyFrequency;
	@FindBy(xpath = "//button[normalize-space()='Ok']")private WebElement OkButton_OnEditedConfirmation;
	
	
	
	//Getters Methods
	public WebElement getInactivePage_Button() {
		return InactivePage_Button;
	}
	public WebElement getActivePage_Button() {
		return ActivePage_Button;
	}
	public WebElement getAdd_New_Meter_Button() {
		return Add_New_Meter_Button;
	}
	public WebElement getMeter_Name_TextField() {
		return Meter_Name_TextField;
	}
	public WebElement getUOM_Dropdown() {
		return UOM_Dropdown;
	}
	public WebElement getUOM_search_Box() {
		return UOM_search_Box;
	}
	public WebElement getAdd_Custom_Unit_TextField() {
		return Add_Custom_Unit_TextField;
	}
	public WebElement getFrequency_Measurement_Dropdown() {
		return Frequency_Measurement_Dropdown;
	}
	public WebElement getCustom_Frequency_Of_Measurement() {
		return Custom_Frequency_Of_Measurement;
	}
	public WebElement getOnce_Frequency_Of_Measurement() {
		return Once_Frequency_Of_Measurement;
	}
	public WebElement getDaily_Frequency_Of_Measurement() {
		return Daily_Frequency_Of_Measurement;
	}
	public WebElement getMonthly_Frequency_Of_Measurement() {
		return Monthly_Frequency_Of_Measurement;
	}
	public WebElement getWeekly_Frequency_Of_Measurement() {
		return Weekly_Frequency_Of_Measurement;
	}
	public WebElement getCustom_Frequency_TextField() {
		return Custom_Frequency_TextField;
	}
	public WebElement getSelect_Measurement_Dropdown() {
		return Select_Measurement_Dropdown;
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
	public WebElement getSelect_Property_Dropdown() {
		return Select_Property_Dropdown;
	}
	public WebElement getSelect_Location_Dropdown() {
		return Select_Location_Dropdown;
	}
	public WebElement getSelect_Asset_Dropdown() {
		return Select_Asset_Dropdown;
	}
	public WebElement getSelect_Assignee_Dropdown() {
		return Select_Assignee_Dropdown;
	}
	public WebElement getAdd_Another_Assignee_Icon() {
		return Add_Another_Assignee_Icon;
	}
	public WebElement getRemove_another_assignee_Icon() {
		return Remove_another_assignee_Icon;
	}
	public WebElement getNext_Button() {
		return Next_Button;
	}
	public WebElement getCancel_Button() {
		return Cancel_Button;
	}
	public WebElement getAdd_meter_button_on_confirmation_page() {
		return Add_meter_button_on_confirmation_page;
	}
	public WebElement getOK_button_on_confirmation_page() {
		return OK_button_on_confirmation_page;
	}
	public WebElement getFilter_Icon() {
		return Filter_Icon;
	}
	public WebElement getFilter_by_Property() {
		return Filter_by_Property;
	}
	public WebElement getFilter_By_property_searchBox() {
		return Filter_By_property_searchBox;
	}
	public WebElement getFilter_By_Location() {
		return Filter_By_Location;
	}
	public WebElement getLocation_SearchBox() {
		return Location_SearchBox;
	}
	public WebElement getFilter_By_Asset() {
		return Filter_By_Asset;
	}
	public WebElement getFilter_By_Asset_SearchBox() {
		return Filter_By_Asset_SearchBox;
	}
	public WebElement getFilter_By_Meter_Name_TextField() {
		return Filter_By_Meter_Name_TextField;
	}
	public WebElement getFilter_Apply_Button() {
		return Filter_Apply_Button;
	}
	public WebElement getClear_Filter_Button() {
		return Clear_Filter_Button;
	}
	public WebElement getQR_Code_Tab() {
		return QR_Code_Tab;
	}
	public WebElement getQRWithDyanamic_Xpath(  ) {
	return QRWithDyanamic_Xpath;
	}
	public WebElement getPrint_Button() {
		return Print_Button;
	}
	 public void ClickOn_getQRWithDyanamic_Xpath(WebDriver driver, String dynamic_value)
	   {
		 QRWithDyanamic_Xpath.click();
	   }
	//Business Logic
	public void ClickOn_InactivePage_Button()
	{
		InactivePage_Button.click();
	}
	public void ClickOn_ActivePage_Button()
	{
		ActivePage_Button.click();
	}
	public void CLickOn_Add_New_Meter_Button()
	{
		Add_New_Meter_Button.click();
	}
	public void CLickOn_Meter_Name_TextField(String Enter_MeterName)
	{
		Meter_Name_TextField.sendKeys(Enter_MeterName);
	}
	public void ClickOn_UOM_Dropdown()
	{
		UOM_Dropdown.click();
	}
	public void CLickOn_UOM_search_Box(String Search_UOM)
	{
		UOM_search_Box.sendKeys(Search_UOM);
	}
	public void CLickOn_Add_Custom_Unit_TextField(String Enter_Custom_Unit)
	{
		Add_Custom_Unit_TextField.sendKeys(Enter_Custom_Unit);
	}
	public void ClickOn_Frequency_Measurement_Dropdown()
	{
		Frequency_Measurement_Dropdown.click();
	}
    public void ClickOn_Custom_Frequency_Of_Measurement()
    {
    	Custom_Frequency_Of_Measurement.click();
    }
    public void ClickOn_Once_Frequency_Of_Measurement()
    {
    	Once_Frequency_Of_Measurement.click();
    }
    public void ClickOn_Daily_Frequency_Of_Measurement()
    {
    	Daily_Frequency_Of_Measurement.click();
    }
    public void ClickOn_Monthly_Frequency_Of_Measurement()
    {
    	Monthly_Frequency_Of_Measurement.click();
    }
    public void ClickOn_Weekly_Frequency_Of_Measurement()
    {
    	Weekly_Frequency_Of_Measurement.click();
    }
    public void ClickOn_Custom_Frequency_TextField(String Enter_Frequency)
    {
    	Custom_Frequency_TextField.sendKeys(Enter_Frequency);
    }
    public void Select_Select_Measurement_Dropdown()
    {
    	Select_Measurement_Dropdown.click();
    }
    public void ClickOn_Day_Measurement()
    {
    	Day_Measurement.click();
    }
    public void ClickOn_Week_Measurement()
    {
    	Week_Measurement.click();
    }
    public void ClickOn_Month_Measurement()
    {
    	Month_Measurement.click();
    }
    public void ClickOn_Year_Measurement()
    {
    	Year_Measurement.click();
    }
    public void ClickOn_Select_Property_Dropdown()
    {
    	Select_Property_Dropdown.click();
    }
    public void Select_Property_DropdowBy_VisibleTextn(String Text)
    {
    	Select sel=new Select(Select_Property_Dropdown);
    	sel.selectByVisibleText(Text);
    }
    public void Select_Property_DropdownBy_Index(int Index)
    {
    	Select sel=new Select(Select_Property_Dropdown);
sel.selectByIndex(Index);
    }
    public void Select_Property_DropdownBy_Value(String Value)
    {
    	Select sel=new Select(Select_Property_Dropdown);
sel.selectByValue(Value);
    }
    public void Select_Location_DropdownBy_visibleText(String Text)
    {
    	Select sel=new Select(Select_Location_Dropdown);
    	sel.selectByVisibleText(Text);
    }
    public void Select_Location_DropdownBy_Index(int Index)
    {
    	Select sel=new Select(Select_Location_Dropdown);
    	sel.selectByIndex(Index);

    }
    public void Select_Location_DropdownBy_Value(String Value)
    {
    	Select sel=new Select(Select_Location_Dropdown);
sel.selectByValue(Value);
    }
    public void Select_Asset_DropdownBy_VisibleText(String Text)
    {
    	Select sel=new Select(Select_Asset_Dropdown);
    	sel.selectByVisibleText(Text);
    }
    public void Select_Asset_DropdownBy_Value(String Value)
    {
    	Select sel=new Select(Select_Asset_Dropdown);
    	sel.selectByValue(Value);
    }
    public void Select_Asset_DropdownBy_Index(int Index)
    {
    	Select sel=new Select(Select_Asset_Dropdown);
    	sel.selectByIndex(Index);
    }
   public void Select_Assignee_DropdownBy_visibleText(String Text)
   {
	   Select sel=new Select(Select_Assignee_Dropdown);
	   sel.selectByVisibleText(Text);
   }
   public void Select_Assignee_DropdownBy_Index(int Index)
   {
	   Select sel=new Select(Select_Assignee_Dropdown);
	   sel.selectByIndex(Index);
   }
   public void Select_Assignee_DropdownBy_Value(String Value)
   {
	   Select sel=new Select(Select_Assignee_Dropdown);
	   sel.selectByValue(Value);
   }
   public void ClickOn_Add_Another_Assignee_Icon()
   {
	   Add_Another_Assignee_Icon.click();
   }
   public void ClickOn_Remove_another_assignee_Icon()
   {
	   Remove_another_assignee_Icon.click();
   }
   public void CLickOn_Next_Button()
   {
	   Next_Button.click();
   }
   public void ClickOn_Cancel_Button()
   {
	   Cancel_Button.click();
   }
   public void ClickOn_Add_meter_button_on_confirmation_page()
   {
	   Add_meter_button_on_confirmation_page.click();
   }
   public void ClickOn_OK_button_on_confirmation_page()
   {
	   OK_button_on_confirmation_page.click();
   }
   public void ClickOn_Filter_Icon()
   {
	   Filter_Icon.click();
   }
   public void ClickOn_Filter_by_Property()
   {
	   Filter_by_Property.click();
   }
   public void ClickOn_Filter_By_property_searchBox(String Search_property)
   {
	   Filter_By_property_searchBox.sendKeys(Search_property);
   }
   public void ClickOn_Filter_By_Location()
   {
	   Filter_By_Location.click();
   }
   public void ClickOn_Location_SearchBox(String Search_Location)
   {
	   Location_SearchBox.sendKeys(Search_Location);
   }
   public void ClickOn_Filter_By_Asset()
   {
	   Filter_By_Asset.click();
   }
   public void CLickOn_Filter_By_Asset_SearchBox(String Search_Asset)
   {
	   Filter_By_Asset_SearchBox.sendKeys(Search_Asset);
   }
   public void ClickOn_Filter_By_Meter_Name_TextField(String Search_Meter_Name)
   {
	   Filter_By_Meter_Name_TextField.sendKeys(Search_Meter_Name);
   }
   public void ClickOn_Filter_Apply_Button()
   {
	   Filter_Apply_Button.click();
   }
   public void ClickOn_Clear_Filter_Button()
   {
	   Clear_Filter_Button.click();
   }
   public void ClickOn_QR_Code_Tab()
   {
	   QR_Code_Tab.click();
   }
  
   public void ClickOn_Print_Button()
   {
	   Print_Button.click();
   }
   public void ClickOn_InfoPage()
   {
	   InfoPage.click();
   }
   public void ClickOn_EnterReadingtextField(String Enter_Reading)
   {
	   int count =0;
	   for(int i=0;i<1;i++)
	   {
		   count++;
		   EnterReadingtextField.sendKeys(Enter_Reading+count);
	   }
	  
   }
   public void Clickon_AddreadingButton()
   {
	   AddreadingButton.click();
   }
   public void Clickon_AddGreaterreadingButton()
   {
//	   int count=0;
	   
	   AddreadingButton.click();
   }
   public void ClickOn_PrintQROnInfo()
   {
	   PrintQROnInfo.click();
   }
   public void ClickOn_HistoryTab()
   {
	   HistoryTab.click();
   }
   public void ClickOn_FilterIconOnHistoryPage()
   {
	   FilterIconOnHistoryPage.click();
   }
   public void CLickOn_FilterBystartDateInHistoryPage(String targetMonth, String targetDay) throws Throwable
   {
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
               // Click on the left arrow to navigate to the previous month
               driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
           }
       }

       // Click on the day in the date picker
       driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
   }
   public void ClickOn_FilterByEndDateInHistoryPage(String targetMonth, String targetDay)
   {
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
               // Click on the right arrow to navigate to the next month
               driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
           }
       }
       System.out.println("before click");

       // Click on the day in the date picker
       driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
       System.out.println("after click");

   }
   public void ClickOn_ApplyButton()
   {
	   ApplyButton.click();
   }
   public void ClickOn_ClearButton()
   {
	   ClearButton.click();
   }
   public void ClickOn_ExportButton()
   {
	   ExportButton.click();
   }
   public void ClickOn_NewTriggerButton()
   {
	   NewTriggerButton.click();
   }
   public void ClickOn_MeterReadingDropdownOnAddTriggerPage(String Text)
   {
	   Select sel = new Select(MeterReadingDropdownOnAddTriggerPage);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_SetThresholdValueOnAddTriggerPage(String Enter_ThresholdValue)
   {
	   SetThresholdValueOnAddTriggerPage.sendKeys(Enter_ThresholdValue);
   }
   public void ClickOn_TicketTitleOnAddTriggerPage(String Enter_TicketTitle)
   {
	   TicketTitleOnAddTriggerPage.sendKeys(Enter_TicketTitle);
   }
   public void ClickOn_DescriptionOnAddTriggerPage(String Enter_Description)
   {
	   DescriptionOnAddTriggerPage.sendKeys(Enter_Description);
   }
   public void ClickOn_departmentdropdownOnAddTriggerPage(String Text)
   {
	   Select sel=new Select(departmentdropdownOnAddTriggerPage);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_HighPriority()
   {
	   HighPriority.click();
   }
   public void ClickOn_MediumPriority()
   {
	   MediumPriority.click();
   }
   public void ClickOn_LowPriority()
   {
	   LowPriority.click();
   }
   public void ClickOn_UserDropdownOnAddTriggerPage(String Text)
   {
	   Select sel=new Select(UserDropdownOnAddTriggerPage);
	   sel.selectByVisibleText(Text);
   }
   public void ClickOn_AddanotherIconOnTriggerPage()
   {
	   AddanotherIconOnTriggerPage.click();
   }
   public void ClickOn_NextButtonOnTriggerPage()
   {
	   NextButtonOnTriggerPage.click();
   }
   public void ClickOn_CancelButtonOnTriggerPage()
   {
	   CancelButtonOnTriggerPage.click();
   }
   public void ClickOn_SaveButton()
   {
	   SaveButton.click();
   }
   public void ClickOn_ButtonButton()
   {
	   ButtonButton.click();
   }
   public void ClickOn_OkButtonOnMetertriggersetsuccessfullyPopup()
   {
	   OkButtonOnMetertriggersetsuccessfullyPopup.click();
   }
   public void ClickOn_PrintQRButtonOnInfo()
   {
	   PrintQRButtonOnInfo.click();
   }
   public void clickon_ConfirmChangesButtonOnEditMeterPage()
   {
	   ConfirmChangesButtonOnEditMeterPage.click();
   }
   public void ClickOn_EditMeter()
   {
	   EditMeter.click();
   }
   public void ClickOn_FrequencyOfMeasurementOnEditmeter()
   {
	   FrequencyOfMeasurementOnEditmeter.click();
   }
   public void ClickOn_WeeklyFrequency()
   {
	   WeeklyFrequency.click();
   }
   public void ClickOn_OkButton_OnEditedConfirmation()
   {
	   OkButton_OnEditedConfirmation.click();
   }
   public void CLickOn_TriggerButtonOnInfo()
   {
	   TriggerButtonOnInfo.click();
   }
}
