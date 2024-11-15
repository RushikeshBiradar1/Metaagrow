package com.MetaaGrow.ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class IncidentForm {

	//Initialization
	public IncidentForm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy (xpath = "//span[.='Filter']") private WebElement FilterIcon;
	@FindBy(xpath = "//span[.='Select Property']")private WebElement FilterByProperty;
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement FilterByPropertySearchBox;
	@FindBy(xpath = "(//a[normalize-space()='ANDHERI'])[1]")private WebElement DynamicPropertyName;
	@FindBy(xpath = "//span[.='Select Location']")private WebElement FilterByLocation;
	@FindBy(xpath = "(//input[@id='custom'])[1]")private WebElement FilterByLocationSearchBox;
	@FindBy(xpath = "//span[@title='Select Attendees To']" )private WebElement FilterbySelectAttendeesTo;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement FilterbySelectAttendeesToSearchBox;
	@FindBy(xpath = "//input[@placeholder='Start Date']")private WebElement FilerByStartDate;
	@FindBy(xpath = "//input[@placeholder='End Date']")private WebElement FilterByEndDate;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement ApplyFilterButton;
	@FindBy(xpath = "//span[.='Clear']")private WebElement ClearFilterButton;
	@FindBy(xpath = "//span[@title='INCRUS001']")private WebElement DynamicIncidentNo;
	@FindBy(xpath = "//span[normalize-space()='Email']")private WebElement EmailIconOnViewIncidentPage;
	@FindBy(xpath = "//input[@placeholder='Enter Email Address']")private WebElement EmailTextFiled;
	@FindBy(xpath = "//button[normalize-space()='Send']")private WebElement EmailSendButton;
	@FindBy(xpath = "//button[@id='cancelEmailPopup']")private WebElement CancelEmailButton;
	@FindBy(xpath = "//span[.='Download']")private WebElement DownloadButton;
	@FindBy(xpath = "//img[@alt='Close modal']")private WebElement BackButtonOnInfoPage;
	@FindBy(xpath = "//div[@aria-controls='collapseOne']//div//img[@id='custom']")private WebElement personsInvolvedHideDropdownIcon;
	@FindBy(xpath = "//button[@name='pdfButton']")private WebElement downloadPDFButton_ONListingPage;
	@FindBy(xpath = "//ul[@class='reports-block']//button[@id='custom']")private WebElement AddIncidentIconButton;
	@FindBy(xpath = "//input[@placeholder='Date & Time']")private WebElement IncidentDateandTime;
	@FindBy(xpath = "//select[@formcontrolname='property']")private WebElement PropertyDropdownIncidentForm;
	@FindBy(xpath = "//input[@formcontrolname='name']")private WebElement FullName;
	@FindBy(xpath = "//input[@formcontrolname='phonenumber']")private WebElement phonenumber;
	@FindBy(xpath = "//input[@formcontrolname='emailid']")private WebElement emailid;
	@FindBy(xpath = "//select[@formcontrolname='gender']")private WebElement GenderDropdown;
	@FindBy(xpath = "//input[@placeholder='Enter age']")private WebElement AgeTextField;
	@FindBy(xpath = "//input[@placeholder='Enter Address']")private WebElement AddressField;
	@FindBy(xpath = "//input[@placeholder='Enter type of injury']")private WebElement TypeOfInjury;
	@FindBy(xpath = "//input[@placeholder='Enter body part(s) injured']")private WebElement BodyPartInjured;
	@FindBy(xpath = "//input[@placeholder='Enter customer decision']")private WebElement CustomerDicision;
	@FindBy(xpath = "//input[@placeholder='Enter treatment duration']")private WebElement TreatementDurationTextBox;
	@FindBy(xpath = "//input[@placeholder='Enter Were the Family Informed?']")private WebElement wereTheFamilyInformed;
	@FindBy(xpath = "//div[@class='col-sm-12']//button[@type='button']")private WebElement AddMoreDetailsIcon_On_PersonInvolved;
	@FindBy(xpath = "//input[@placeholder='Enter cause of the incident']")private WebElement CauseOfIncidentTextBox;
	@FindBy(xpath = "//select[@formcontrolname='location']")private WebElement LocationDropdownOnAddPage;
	@FindBy(xpath = "//select[@formcontrolname='staffincharge']")private WebElement AttendiesNameDropedoen;
	@FindBy(xpath = "//select[@formcontrolname='teamleader']")private WebElement TeamLeaderDropdown;
	@FindBy(xpath = "(//input[@value='Yes'])[1]")private WebElement YesRadioButton_on_Was_Medical_Treatment_offered_on_site;
	@FindBy(xpath = "(//input[@value='No'])[1]")private WebElement NoRadioButton_on_Was_Medical_Treatment_offered_on_site;
	@FindBy(xpath = "(//input[@value='Rejected'])[1]")private WebElement RejectedRadioButton_on_Was_Medical_Treatment_offered_on_site;
	@FindBy(xpath = "(//input[@value='Yes'])[2]")private WebElement YesButton_On_Was_it_Needed_to_call_for_an_ambulance;
	@FindBy(xpath = "(//input[@value='No'])[2]")private WebElement NoButton_On_Was_it_Needed_to_call_for_an_ambulance;
	@FindBy(xpath = "(//input[@value='Rejected'])[2]")private WebElement Rejected_Button_On_Was_it_Needed_to_call_for_an_ambulance;
	@FindBy(xpath = "//input[@formcontrolname='ambulancecontactname']")private WebElement Name_of_the_Ambulance_Caller;
	@FindBy(xpath = "//input[@formcontrolname='ambulancecontactnumber']")private WebElement Contact_details_of_the_Ambulance_Caller;
	@FindBy(xpath = "//input[@formcontrolname='firstaidprovidername']")private WebElement Name_of_the_First_Aid_Provider_TextField;
	@FindBy(xpath = "//input[@formcontrolname='firstaidprovidercontact']")private WebElement Contact_details_of_the_First_Aid_Provider_TextField;
	@FindBy(xpath = "//input[@formcontrolname='witnessname']")private WebElement WitnessNameTextBox;
	@FindBy(xpath = "//input[@formcontrolname='witnessnumber']")private WebElement WitnessContactDetailsTextBox;
	@FindBy(xpath = "//span[normalize-space()='Add Witness']")private WebElement AddWitnessIcon;
	@FindBy(xpath = "//input[@placeholder='Enter details']")private WebElement AdditionalRemark_EnterDetailsTextBox;
	@FindBy(xpath = "//select[@id='selectUser' and @formcontrolname='reportedby']")private WebElement ReportedByDropdown;
	@FindBy(xpath = "(//span[contains(text(),'Add Signature')])[1]")private WebElement ReportedByAddSignature;
	@FindBy(xpath = "//select[@id='selectUser' and @formcontrolname='checkedby']")private WebElement CheckedByDropdown;
	@FindBy(xpath = "(//span[contains(text(),'Add Signature')])[2]")private WebElement checkedByAddSignature;
	@FindBy(xpath = "//select[@id='selectUser' and @formcontrolname='reviewedby']")private WebElement ReviewedByDropdown;
	@FindBy(xpath = "(//span[contains(text(),'Add Signature')])[2]")private WebElement ReviewedByAddSignature;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement CancelButton;
	@FindBy(xpath = "//span[text()='Submit']")private WebElement SubmitButton;
	@FindBy(xpath = "//input[@placeholder='Enter action taken in the incident']")private WebElement ActionTextField;
	@FindBy(xpath = "//span[normalize-space()='Set']")private WebElement setButtonOn_Incident_Date_Time;

	//Getters Methods

	public WebElement getSetButtonOn_Incident_Date_Time() {
		return setButtonOn_Incident_Date_Time;
	}
	public WebElement getActionTextField() {
		return ActionTextField;
	}
	public WebElement getFilterIcon() {
		return FilterIcon;
	}
	public WebElement getFilterByProperty() {
		return FilterByProperty;
	}
	public WebElement getFilterByPropertySearchBox() {
		return FilterByPropertySearchBox;
	}
	public WebElement getDynamicPropertyName() {
		return DynamicPropertyName;
	}
	public WebElement getFilterByLocation() {
		return FilterByLocation;
	}
	public WebElement getFilterByLocationSearchBox() {
		return FilterByLocationSearchBox;
	}
	public WebElement getFilterbySelectAttendeesTo() {
		return FilterbySelectAttendeesTo;
	}
	public WebElement getFilterbySelectAttendeesToSearchBox() {
		return FilterbySelectAttendeesToSearchBox;
	}
	public WebElement getFilerByStartDate() {
		return FilerByStartDate;
	}
	public WebElement getFilterByEndDate() {
		return FilterByEndDate;
	}
	public WebElement getApplyFilterButton() {
		return ApplyFilterButton;
	}
	public WebElement getClearFilterButton() {
		return ClearFilterButton;
	}
	public WebElement getDynamicIncidentNo() {
		return DynamicIncidentNo;
	}
	public WebElement getEmailIconOnViewIncidentPage() {
		return EmailIconOnViewIncidentPage;
	}
	public WebElement getEmailTextFiled() {
		return EmailTextFiled;
	}
	public WebElement getEmailSendButton() {
		return EmailSendButton;
	}
	public WebElement getCancelEmailButton() {
		return CancelEmailButton;
	}
	public WebElement getDownloadButton() {
		return DownloadButton;
	}
	public WebElement getBackButtonOnInfoPage() {
		return BackButtonOnInfoPage;
	}
	public WebElement getPersonsInvolvedHideDropdownIcon() {
		return personsInvolvedHideDropdownIcon;
	}
	public WebElement getDownloadPDFButton_ONListingPage() {
		return downloadPDFButton_ONListingPage;
	}
	public WebElement getAddIncidentIconButton() {
		return AddIncidentIconButton;
	}
	public WebElement getIncidentDateandTime() {
		return IncidentDateandTime;
	}
	public WebElement getPropertyDropdownIncidentForm() {
		return PropertyDropdownIncidentForm;
	}
	public WebElement getFullName() {
		return FullName;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getGenderDropdown() {
		return GenderDropdown;
	}
	public WebElement getAgeTextField() {
		return AgeTextField;
	}
	public WebElement getAddressField() {
		return AddressField;
	}
	public WebElement getTypeOfInjury() {
		return TypeOfInjury;
	}
	public WebElement getBodyPartInjured() {
		return BodyPartInjured;
	}
	public WebElement getCustomerDicision() {
		return CustomerDicision;
	}
	public WebElement getTreatementDurationTextBox() {
		return TreatementDurationTextBox;
	}
	public WebElement getWereTheFamilyInformed() {
		return wereTheFamilyInformed;
	}
	public WebElement getAddMoreDetailsIcon_On_PersonInvolved() {
		return AddMoreDetailsIcon_On_PersonInvolved;
	}
	public WebElement getCauseOfIncidentTextBox() {
		return CauseOfIncidentTextBox;
	}
	public WebElement getLocationDropdownOnAddPage() {
		return LocationDropdownOnAddPage;
	}
	public WebElement getAttendiesNameDropedoen() {
		return AttendiesNameDropedoen;
	}
	public WebElement getTeamLeaderDropdown() {
		return TeamLeaderDropdown;
	}
	public WebElement getYesRadioButton_on_Was_Medical_Treatment_offered_on_site() {
		return YesRadioButton_on_Was_Medical_Treatment_offered_on_site;
	}
	public WebElement getNoRadioButton_on_Was_Medical_Treatment_offered_on_site() {
		return NoRadioButton_on_Was_Medical_Treatment_offered_on_site;
	}
	public WebElement getRejectedRadioButton_on_Was_Medical_Treatment_offered_on_site() {
		return RejectedRadioButton_on_Was_Medical_Treatment_offered_on_site;
	}
	public WebElement getYesButton_On_Was_it_Needed_to_call_for_an_ambulance() {
		return YesButton_On_Was_it_Needed_to_call_for_an_ambulance;
	}
	public WebElement getNoButton_On_Was_it_Needed_to_call_for_an_ambulance() {
		return NoButton_On_Was_it_Needed_to_call_for_an_ambulance;
	}
	public WebElement getRejected_Button_On_Was_it_Needed_to_call_for_an_ambulance() {
		return Rejected_Button_On_Was_it_Needed_to_call_for_an_ambulance;
	}
	public WebElement getName_of_the_Ambulance_Caller() {
		return Name_of_the_Ambulance_Caller;
	}
	public WebElement getContact_details_of_the_Ambulance_Caller() {
		return Contact_details_of_the_Ambulance_Caller;
	}
	public WebElement getName_of_the_First_Aid_Provider_TextField() {
		return Name_of_the_First_Aid_Provider_TextField;
	}
	public WebElement getContact_details_of_the_First_Aid_Provider_TextField() {
		return Contact_details_of_the_First_Aid_Provider_TextField;
	}
	public WebElement getWitnessNameTextBox() {
		return WitnessNameTextBox;
	}
	public WebElement getWitnessContactDetailsTextBox() {
		return WitnessContactDetailsTextBox;
	}
	public WebElement getAddWitnessIcon() {
		return AddWitnessIcon;
	}
	public WebElement getAdditionalRemark_EnterDetailsTextBox() {
		return AdditionalRemark_EnterDetailsTextBox;
	}
	public WebElement getReportedByDropdown() {
		return ReportedByDropdown;
	}
	public WebElement getReportedByAddSignature() {
		return ReportedByAddSignature;
	}
	public WebElement getCheckedByDropdown() {
		return CheckedByDropdown;
	}
	public WebElement getCheckedByAddSignature() {
		return checkedByAddSignature;
	}
	public WebElement getReviewedByDropdown() {
		return ReviewedByDropdown;
	}
	public WebElement getReviewedByAddSignature() {
		return ReviewedByAddSignature;
	}
	public WebElement getCancelButton() {
		return CancelButton;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}


	//Business Logic 
	public void ClickOn_FilterIcon()
	{
		FilterIcon.click();
	}
	public void ClickOn_FilterByProperty()
	{
		FilterByProperty.click();
	}
	public void Clickon_FilterByPropertySearchBox(String Search_Property)
	{
		FilterByPropertySearchBox.sendKeys(Search_Property);
	}
	public void Clickon_DynamicPropertyName()
	{
		DynamicPropertyName.click();
	}
	public void ClickOn_FilterByLocation()
	{
		FilterByLocation.click();
	}
	public void ClickON_FilterByLocationSearchBox(String Location)
	{
		FilterByLocationSearchBox.sendKeys(Location);
	}
	public void ClickOn_FilterbySelectAttendeesTo()
	{
		FilterbySelectAttendeesTo.click();
	}
	public void ClickOn_FilterbySelectAttendeesToSearchBox(String Attendes_Name)
	{
		FilterbySelectAttendeesToSearchBox.sendKeys(Attendes_Name);
	}
	public void ClickOn_ApplyFilterButton()
	{
		ApplyFilterButton.click();
	}
	public void ClickOn_ClearFilterButton()
	{
		ClearFilterButton.click();

	}
	public void ClickON_DynamicIncidentNo()
	{
		DynamicIncidentNo.click();
	}
	public void ClickoN_EmailIconOnViewIncidentPage()
	{
		EmailIconOnViewIncidentPage.click();
	}
	public void Clickon_EmailTextFiled(String Emailid)
	{
		EmailTextFiled.sendKeys(Emailid);
	}
	public void Clickon_EmailSendButton()
	{
		EmailSendButton.click();
	}
	public void ClickOn_CancelEmailButton()
	{
		CancelEmailButton.click();
	}
	public void ClickON_DownloadButton()
	{
		DownloadButton.click();
	}
	public void ClickoN_BackButtonOnInfoPage()
	{
		BackButtonOnInfoPage.click();
	}
	public void ClickON_personsInvolvedHideDropdownIcon()
	{
		personsInvolvedHideDropdownIcon.click();
	}
	public void ClickoN_downloadPDFButton_ONListingPage()
	{
		downloadPDFButton_ONListingPage.click();
	}
	public void ClickOn_AddIncidentIconButton()
	{

		AddIncidentIconButton.click();
	}
	public void ClickoN_IncidentDateandTime()
	{
		IncidentDateandTime.click();
	}
	public void Clickon_PropertyDropdownIncidentForm(String Text)
	{
		Select sel=new Select(PropertyDropdownIncidentForm);
		sel.selectByVisibleText(Text);
	}
	public void ClickoN_FullName(String Full_Name)
	{
		FullName.sendKeys(Full_Name);
	}
	public void ClickOn_phonenumber(String Number)
	{
		phonenumber.sendKeys(Number);
	}
	public void ClickOn_emailid(String email_id)
	{
		emailid.sendKeys(email_id);
	}
	public void Clickon_GenderDropdown(String Text)
	{
		Select sel=new Select(GenderDropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_AgeTextField(String Enter_Age)
	{
		AgeTextField.sendKeys(Enter_Age);
	}
	public void ClickON_AddressField(String Address)
	{
		AddressField.sendKeys(Address);
	}
	public void ClickoN_TypeOfInjury(String TypeOf_Injury)
	{
		TypeOfInjury.sendKeys(TypeOf_Injury);
	}
	public void ClickOn_BodyPartInjured(String Body_Part_Injured)
	{
		BodyPartInjured.sendKeys(Body_Part_Injured);
	}
	public void ClickOn_CustomerDicision(String Customer_Dicision)
	{
		CustomerDicision.sendKeys(Customer_Dicision);
	}
	public void ClickOn_TreatementDurationTextBox(String Treatement_Time)
	{
		TreatementDurationTextBox.sendKeys(Treatement_Time);
	}
	public void ClickOn_wereTheFamilyInformed(String Family_Informed)
	{
		wereTheFamilyInformed.sendKeys(Family_Informed);
	}
	public void ClickOn_AddMoreDetailsIcon_On_PersonInvolved()
	{
		AddMoreDetailsIcon_On_PersonInvolved.click();
	}
	public void ClickOn_CauseOfIncidentTextBox(String CauseOfIncident)
	{
		CauseOfIncidentTextBox.sendKeys(CauseOfIncident);
	}
	public void ClickOn_LocationDropdownOnAddPage(String Text)
	{
		Select sel=new Select(LocationDropdownOnAddPage);
		sel.selectByVisibleText(Text);
	}
	public void CLickOn_AttendiesNameDropedown(String Attendies_Name)
	{
		Select sel=new Select(AttendiesNameDropedoen);
		sel.selectByVisibleText(Attendies_Name);
	}
	public void Select_TreatementDurationTextBox(String Text)
	{
		Select sel=new Select(TreatementDurationTextBox);
		sel.selectByVisibleText(Text);
	}


	public void CLickOn_TeamLeaderDropdown(String Text)
	{
		Select sel=new Select(TeamLeaderDropdown);
		sel.selectByVisibleText(Text);
	}
	public void clickOn_YesRadioButton_on_Was_Medical_Treatment_offered_on_site()
	{
		YesRadioButton_on_Was_Medical_Treatment_offered_on_site.click();
	}
	public void ClickOn_NoRadioButton_on_Was_Medical_Treatment_offered_on_site()
	{
		NoRadioButton_on_Was_Medical_Treatment_offered_on_site.click();
	}
	public void ClickOn_RejectedRadioButton_on_Was_Medical_Treatment_offered_on_site()
	{
		RejectedRadioButton_on_Was_Medical_Treatment_offered_on_site.click();
	}
	public void ClickOn_YesButton_On_Was_it_Needed_to_call_for_an_ambulance()
	{
		YesButton_On_Was_it_Needed_to_call_for_an_ambulance.click();
	}
	public void clickon_NoButton_On_Was_it_Needed_to_call_for_an_ambulance()
	{
		NoButton_On_Was_it_Needed_to_call_for_an_ambulance.click();
		
	}
	public void ClickOn_Rejected_Button_On_Was_it_Needed_to_call_for_an_ambulance()
	{
		Rejected_Button_On_Was_it_Needed_to_call_for_an_ambulance.click();
	}
	public void ClickOn_Name_of_the_Ambulance_Caller(String Name)
	{
		Name_of_the_Ambulance_Caller.sendKeys(Name);
	}
	public void ClickON_Contact_details_of_the_Ambulance_Caller(String Contact_Details)
	{
		Contact_details_of_the_Ambulance_Caller.sendKeys(Contact_Details);
	}
	public void Clickon_Name_of_the_First_Aid_Provider_TextField(String Name)
	{
		Name_of_the_First_Aid_Provider_TextField.sendKeys(Name);
	}
	public void ClickOn_Contact_details_of_the_First_Aid_Provider_TextField(String Contact_Detail)
	{
		Contact_details_of_the_First_Aid_Provider_TextField.sendKeys(Contact_Detail);
	}
	public void ClickoN_WitnessNameTextBox(String Witness_Name)
	{
		WitnessNameTextBox.sendKeys(Witness_Name);
	}
	public void ClickOn_WitnessContactDetailsTextBox(String witness_ContactDetails)
	{
		WitnessContactDetailsTextBox.sendKeys(witness_ContactDetails);
	}
	public void clickon_AddWitnessIcon()
	{
		AddWitnessIcon.click();
	}
	public void clickon_AdditionalRemark_EnterDetailsTextBox(String Additional_Remark)
	{
		AdditionalRemark_EnterDetailsTextBox.sendKeys(Additional_Remark);
	}
	public void Select_ReportedByDropdown(String Text)
	{
		Select sel=new Select(ReportedByDropdown);
		sel.selectByVisibleText(Text);
	}
	public void Clickon_ReportedByAddSignature()
	{
		ReportedByAddSignature.click();
	}
	public void Clickon_CheckedByDropdown(String Text)
	{
		Select sel=new Select(CheckedByDropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_checkedByAddSignature()
	{
		checkedByAddSignature.click();
	}
	public void ClickOn_ReviewedByDropdown(String Text)
	{
		Select sel=new Select(ReviewedByDropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_ReviewedByAddSignature()
	{
		ReviewedByAddSignature.click();
	}
	public void ClickOn_CancelButton()
	{
		CancelButton.click();
	}
	public void ClickON_SubmitButton()
	{
		SubmitButton.click();
	}
	public void ClickOn_ActionTextField(String enter_action_Taken)
	{
		ActionTextField.sendKeys(enter_action_Taken);
	}
	public void clickOn_setButtonOn_Incident_Date_Time()
	{
		setButtonOn_Incident_Date_Time.click();
	}
	
	public void Select_startDate_and_Time(WebDriver driver, String targetMonth, String targetDay) throws InterruptedException {
        // Click on the Start Date input field to open the date picker
//        driver.findElement(By.xpath("//input[@placeholder='Date & Time']")).click();
//        Thread.sleep(3000);

        // Loop until the target month is displayed
        while (true) {
            // Extract the text of the currently displayed month in the date picker
            String displayedMonth = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

            // Check if the displayed month matches the target month
            if (displayedMonth.equals(targetMonth)) {
                break; // Exit the loop if the target month is reached
            } else {
                // Click on the left arrow to navigate to the previous month
                driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
            }
        }

        // Click on the day in the date picker
        driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
        
        //Select Time  
//        WebElement  hours = driver.findElement(By.xpath("(//input[@class='owl-dt-timer-input'])[1]"));
//        hours.clear();
//        hours.sendKeys("11");
//       WebElement Minute=driver.findElement(By.xpath("(//input[@class='owl-dt-timer-input'])[2]"));
//       Minute.clear();
//       Minute.sendKeys("12");
//          driver.findElement(By.xpath("//span[normalize-space()='Set']"));
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
                 // Click on the right arrow to navigate to the Back month
                 driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
             }
         }
         System.out.println("before click");

         // Click on the day in the date picker
         driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
         System.out.println("after click");

     }
     


}
