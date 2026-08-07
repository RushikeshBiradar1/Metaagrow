package com.MetaaGrow.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Surveys_And_Feedback {
	//Initiazation
	public Surveys_And_Feedback(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Decalration
	@FindBy(xpath = "//button[.='Feedback']") private WebElement Feedback_Button;
	@FindBy(xpath = "//button[@class='active button']")private WebElement SurveyPage_Button;
	@FindBy(xpath = "//span[.='Filter']")private WebElement Filter_Icon;
	@FindBy(xpath = "(//span[.='Property'])[1]")private WebElement Property_Filter;
	@FindBy(xpath = "(//input[@id='custom'])[2]")private WebElement propertySearchBox;

	public WebElement getPropertySearchBox() {
		return propertySearchBox;
	}

	@FindBy(xpath = "//input[@placeholder='Location Name']")private WebElement Location_NameTextField_Filter;
	@FindBy(xpath = "//span[.='Apply']")private WebElement Apply_Filter_Button;
	@FindBy(xpath = "//span[.='Clear']")private WebElement Clear_Button_Filter;
	@FindBy(xpath = "//span[.='Create Survey']")private WebElement Create_Survey_Button;
	@FindBy(xpath = "//input[@placeholder='Survey Name']")private WebElement Survey_Name_Text_Field;
	@FindBy(xpath = "//select[@formcontrolname='outletId']")private WebElement Select_property_dropdown;
	@FindBy(xpath = "//input[@placeholder='Feedback Location']")private WebElement Location_Text_Field;
	@FindBy(xpath = "//input[@formcontrolname='emailmandatory']")private WebElement email_Mandatory_CheckBox;
	@FindBy(xpath = "//input[@formcontrolname='mobilemandatory']")private WebElement Mobile_Mandatory_CheckBox;
	@FindBy(xpath = "(//span[@class='slider'])[2]")private WebElement Slider_Of_Single_And_Multiple_Question;
	@FindBy(xpath = "//input[@name='groupName']")private WebElement Section_Name_TextField;
	@FindBy(xpath = "(//input[@placeholder='Question'])")private WebElement Question_Text_Field;
	@FindBy(xpath = "(//input[@placeholder='Question'])[2]")private WebElement Question2_TextField;
	public WebElement getQuestion2_TextField() {
		return Question2_TextField;
	}

	@FindBy(xpath = "//span[.='Add new Section']")private WebElement Add_New_Section_Icon;
	@FindBy(xpath = "//span[.='Add Question']")private WebElement Add_Question_Icon;
	@FindBy(xpath = "//img[@alt='Down']")private WebElement Add_New_Section_HideDropdown_Icon;
	@FindBy(xpath = "(//input[@style='width: 18px;height: 18px;'])[2]")private WebElement Remove_Question_Icon;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement cancel_button_on_create_survey_page;
	@FindBy(xpath = "//span[.='Create Survey']")private WebElement Create_button_on_create_survey_page;
	@FindBy(xpath = "//input[@placeholder='Enter Question']")private WebElement Single_Question_TExtField_For_Feedback;
	@FindBy(xpath = "//span[.='Close']")private WebElement Close_Button_On_Create_SurveyPage;

	@FindBy(xpath = "(//img[@id='changeBUton'])[1]")private WebElement ActionButton;
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")private WebElement EditSurveyLinkText;
	@FindBy(xpath = "(//a[contains(text(),'View Questions')])[1]")private WebElement surveyViewQuestionLinkText;
	@FindBy(xpath = "(//a[contains(text(),'View Responses')])[1]")private WebElement SurveyViewResponsesLinkText;
	@FindBy(xpath = "//button[@class='grad-bg add']")private WebElement DownloadButtonOnViewResponsesPage;
	@FindBy(xpath = "//button[@id='dismissOk']")private WebElement OkButton_OnCreateSurveyPage;
	@FindBy(xpath = "//select[contains(@class,'createChecklistDepartment')]")private List<WebElement> SelectResponseTypeDropdown;
	@FindBy(xpath = "//span[.='Update Survey']")private WebElement UpdateSurveyButton;
	@FindBy(xpath = "//input[@placeholder='Title ']")private WebElement FilterByTitle;
	
	
	public WebElement getFilterByTitle() {
		return FilterByTitle;
	}
	public WebElement getUpdateSurveyButton() {
		return UpdateSurveyButton;
	}
	public List<WebElement> getSelectResponseTypeDropdown() {
		return SelectResponseTypeDropdown;
	}
	public WebElement getOkButton_OnCreateSurveyPage() {
		return OkButton_OnCreateSurveyPage;
	}
	public WebElement getDownloadButtonOnViewResponsesPage() {
		return DownloadButtonOnViewResponsesPage;
	}
	public WebElement getAsPdfButton() {
		return AsPdfButton;
	}
	public WebElement getDownloadExcelButton() {
		return DownloadExcelButton;
	}

	@FindBy(xpath = "//a[normalize-space()='PDF']")private WebElement AsPdfButton;
	@FindBy(xpath = "//a[normalize-space()='Excel']")private WebElement DownloadExcelButton;
	
	@FindBy(xpath = "(//a[contains(text(),'View QrCode')])[1]")private WebElement surveyViewQRCodeLinkText;
	@FindBy(xpath = "//button[@id='dismissOk']")private WebElement OkButton_OnEditSurveyConfirmationPage;


	public WebElement getActionButton() {
		return ActionButton;
	}
	public WebElement getEditSurveyLinkText() {
		return EditSurveyLinkText;
	}
	public WebElement getSurveyViewQuestionLinkText() {
		return surveyViewQuestionLinkText;
	}
	public WebElement getSurveyViewResponsesLinkText() {
		return SurveyViewResponsesLinkText;
	}
	public WebElement getSurveyViewQRCodeLinkText() {
		return surveyViewQRCodeLinkText;
	}
	public WebElement getOkButton_OnEditSurveyConfirmationPage() {
		return OkButton_OnEditSurveyConfirmationPage;
	}
	//Getters Methods
	public WebElement getFeedback_Button() {
		return Feedback_Button;
	}
	public WebElement getSurveyPage_Button() {
		return SurveyPage_Button;
	}
	public WebElement getFilter_Icon() {
		return Filter_Icon;
	}
	public WebElement getProperty_Filter() {
		return Property_Filter;
	}
	public WebElement getLocation_NameTextField_Filter() {
		return Location_NameTextField_Filter;
	}
	public WebElement getApply_Filter_Button() {
		return Apply_Filter_Button;
	}
	public WebElement getClear_Button_Filter() {
		return Clear_Button_Filter;
	}
	public WebElement getCreate_Survey_Button() {
		return Create_Survey_Button;
	}
	public WebElement getSurvey_Name_Text_Field() {
		return Survey_Name_Text_Field;
	}
	public WebElement getSelect_property_dropdown() {
		return Select_property_dropdown;
	}
	public WebElement getLocation_Text_Field() {
		return Location_Text_Field;
	}
	public WebElement getEmail_Mandatory_CheckBox() {
		return email_Mandatory_CheckBox;
	}
	public WebElement getMobile_Mandatory_CheckBox() {
		return Mobile_Mandatory_CheckBox;
	}
	public WebElement getSlider_Of_Single_And_Multiple_Question() {
		return Slider_Of_Single_And_Multiple_Question;
	}
	public WebElement getSection_Name_TextField() {
		return Section_Name_TextField;
	}
	public WebElement getQuestion_Text_Field() {
		return Question_Text_Field;
	}
	public WebElement getAdd_New_Section_Icon() {
		return Add_New_Section_Icon;
	}
	public WebElement getAdd_Question_Icon() {
		return Add_Question_Icon;
	}
	public WebElement getAdd_New_Section_HideDropdown_Icon() {
		return Add_New_Section_HideDropdown_Icon;
	}
	public WebElement getRemove_Question_Icon() {
		return Remove_Question_Icon;
	}
	public WebElement getCancel_button_on_create_survey_page() {
		return cancel_button_on_create_survey_page;
	}
	public WebElement getCreate_button_on_create_survey_page() {
		return Create_button_on_create_survey_page;
	}
	public WebElement getSingle_Question_TExtField_For_Feedback() {
		return Single_Question_TExtField_For_Feedback;
	}
	public WebElement getClose_Button_On_Create_SurveyPage() {
		return Close_Button_On_Create_SurveyPage;
	}


	public void ClickOn_Feedback_Button()
	{
		Feedback_Button.click();
	}
	public void ClickOn_SurveyPage_Button()
	{
		SurveyPage_Button.click();
	}
	public void ClickOn_Filter_Icon()
	{
		Filter_Icon.click();
	}
	public void clickOn_Property_Filter()
	{
		Property_Filter.click();
	}
	public void ClickOn_Location_NameTextField_Filter(String ENter_Location)
	{
		Location_NameTextField_Filter.sendKeys(ENter_Location);
	}
	public void ClickOn_Apply_Filter_Button()
	{
		Apply_Filter_Button.click();
	}
	public void ClickOn_Clear_Button_Filter()
	{
		Clear_Button_Filter.click();
	}
	public void ClickOn_Create_Survey_Button()
	{
		Create_Survey_Button.click();
	}
	public void ClickOn_Survey_Name_Text_Field(String ENter_Survey_Name)
	{
		Survey_Name_Text_Field.sendKeys(ENter_Survey_Name);
	}
	public void Clear_Survey_Name_Text_Field()
	{
		Survey_Name_Text_Field.clear();
	}
	public void Select_property_dropdown_ByVisibleText(String Text)
	{
		Select sel=new Select(Select_property_dropdown);
		sel.selectByVisibleText(Text);
	}
	public void Select_property_dropdown_ByValue(String Value)
	{
		Select sel=new Select(Select_property_dropdown);
		sel.selectByValue(Value);
	}
	public void Select_property_dropdown_ByIndex(int Index)
	{
		Select sel=new Select(Select_property_dropdown);
		sel.selectByIndex(Index);
	}

	public void ClickOn_Location_Text_Field(String Enter_Location)
	{
		Location_Text_Field.sendKeys(Enter_Location);
	}
	public void ClickOn_email_Mandatory_CheckBox()
	{
		email_Mandatory_CheckBox.click();
	}
	public void ClickOn_Mobile_Mandatory_CheckBox()
	{
		Mobile_Mandatory_CheckBox.click();
	}
	public void ClickOn_Slider_Of_Single_And_Multiple_Question()
	{
		Slider_Of_Single_And_Multiple_Question.click();
	}
	public void ClickOn_Section_Name_TextField(String Enter_Section_Name)
	{
		Section_Name_TextField.sendKeys(Enter_Section_Name);
	}
	public void ClickOn_Section_Name_TextField()
	{
		Section_Name_TextField.click();
	}
	public void ClickOn_Question_Text_Field(String Enter_Question)
	{
		Question_Text_Field.sendKeys(Enter_Question);
	}
	public void ClickOn_Add_New_Section_Icon()
	{
		Add_New_Section_Icon.click();
	}
	public void ClickOn_Add_Question_Icon()
	{
		Add_Question_Icon.click();
	}
	public void ClickOn_Add_New_Section_HideDropdown_Icon()
	{
		Add_New_Section_HideDropdown_Icon.click();
	}
	public void ClickOn_Remove_Question_Icon()
	{
		Remove_Question_Icon.click();
	}
	public void ClickOn_cancel_button_on_create_survey_page()
	{
		cancel_button_on_create_survey_page.click();
	}
	public void ClickOn_Create_button_on_create_survey_page()
	{
		Create_button_on_create_survey_page.click();
	}
	public void ClickOn_Single_Question_TExtField_For_Feedback(String ENter_Question)
	{
		Single_Question_TExtField_For_Feedback.sendKeys(ENter_Question);
	}
	public void ClickOn_Close_Button_On_Create_SurveyPage()
	{
		Close_Button_On_Create_SurveyPage.click();
	}
	public void ClickOn_propertySearchBox(String Search_Property)
	{
		propertySearchBox.sendKeys(Search_Property);
	}
	public void ClickOn_ActionButton()
	{
		ActionButton.click();
	}
	public void ClickOn_EditSurveyLinkText()
	{
		EditSurveyLinkText.click();
	}
	public void ClickOn_surveyViewQuestionLinkText()
	{
		surveyViewQuestionLinkText.click();
	}
	public void Clickon_OkButton_OnEditSurveyConfirmationPage()
	{
		OkButton_OnEditSurveyConfirmationPage.click();
	}
	public void ClickON_SurveyViewResponsesLinkText()
	{
		SurveyViewResponsesLinkText.click();
	}
	public void ClickOn_DownloadButtonOnViewResponsesPage()
	{
		DownloadButtonOnViewResponsesPage.click();
	}
	public void ClickOn_AsPdfButton()
	{
		AsPdfButton.click();
	}
	public void CLickOn_DownloadExcelButton()
	{
		DownloadExcelButton.click();
	}
	public void ClickOn_surveyViewQRCodeLinkText()
	{
		surveyViewQRCodeLinkText.click();
	}
	public void ClickOn_Question2_TextField(String Question2)
	{
		Question2_TextField.sendKeys(Question2);
	}
	public void ClickOn_OkButton_OnCreateSurveyPage()
	{
		OkButton_OnCreateSurveyPage.click();
	}
	
	// Select different response types for each question
	public void selectResponseTypeByIndex(int index, String text) {
        Select select = new Select(SelectResponseTypeDropdown.get(index));
        select.selectByVisibleText(text);
    }
	public void ClickOn_UpdateSurveyButton()
	
	{
		UpdateSurveyButton.click();
	}
	public void clickOn_FilterByTitle(String enter_SurveyTitle)
	{
		FilterByTitle.sendKeys(enter_SurveyTitle);
	}

	
}
