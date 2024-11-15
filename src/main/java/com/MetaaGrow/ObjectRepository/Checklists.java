package com.MetaaGrow.ObjectRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checklists {
	//Initialization
	public Checklists(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//h4[.='Revenue ']")private WebElement RevenueLinkText;
	@FindBy(xpath = "//h4[.='F&B']")private WebElement F_and_B_LinkText;
	@FindBy(xpath = "(//select[@id='selectUser'])[2]")private WebElement select_Proprty_Dropdown;
	@FindBy(xpath = "//span[.='Import']")private WebElement Import_Button;
	@FindBy(xpath = "//label[@for='304']")private WebElement Trampoline_Park_Checklist;
	@FindBy(xpath = "//label[@for='303']")private WebElement Store_Door_Opening_Checklist;
	@FindBy(xpath = "//label[@for='299']")private WebElement Dashing_Car_Checklists;
	@FindBy(xpath = "//label[@for='297']")private WebElement Soft_Play_Checklist;
	@FindBy(xpath = "//label[@for='290']")private WebElement Video_Games_checklist;
	@FindBy(xpath = "//label[@for='287']")private WebElement Kiddy_Rides_Checklist;
	@FindBy(xpath = "//label[@for='286']")private WebElement Prize_Redemption_Checklist;
	@FindBy(xpath = "//label[@for='284']")private WebElement Ticket_Redemption_Checklist;
	@FindBy(xpath = "//label[@for='118']")private WebElement Cricket_Simulators_Checklist;
	@FindBy(xpath = "//label[@for='116']")private WebElement Go_Karting_Checklist;
	@FindBy(xpath = "//label[@for='113']")private WebElement Trampoline_Park;
	@FindBy(xpath="//label[@for='105']")private WebElement Bowling_Lane;
	@FindBy(xpath = "//span[text()='Back']")private WebElement Back_Button;
	@FindBy(xpath = "//label[@for='selectAll']")private WebElement Template_Name;
	@FindBy(xpath = "//button[@id='openSuccessOP3']")private WebElement Ok_Button_On_Confirmation_Page;
@FindBy(xpath = "//button[@id='openSuccessOP3']")private WebElement Ok_Button_On_errorPopUp_On_Confirmation_Page;


	
	//Getters Method
public WebElement getOk_Button_On_errorPopUp_On_Confirmation_Page() {
	return Ok_Button_On_errorPopUp_On_Confirmation_Page;
}
	public WebElement getOk_Button_On_Confirmation_Page() {
		return Ok_Button_On_Confirmation_Page;
	}
	
	public WebElement getRevenueLinkText() {
		return RevenueLinkText;
	}
	public WebElement getF_and_B_LinkText() {
		return F_and_B_LinkText;
	}
	public WebElement getSelect_Proprty_Dropdown() {
		return select_Proprty_Dropdown;
	}
	public WebElement getImport_Button() {
		return Import_Button;
	}
	public WebElement getTrampoline_Park_Checklist() {
		return Trampoline_Park_Checklist;
	}
	public WebElement getStore_Door_Opening_Checklist() {
		return Store_Door_Opening_Checklist;
	}
	public WebElement getDashing_Car_Checklists() {
		return Dashing_Car_Checklists;
	}
	public WebElement getSoft_Play_Checklist() {
		return Soft_Play_Checklist;
	}
	public WebElement getVideo_Games_checklist() {
		return Video_Games_checklist;
	}
	public WebElement getKiddy_Rides_Checklist() {
		return Kiddy_Rides_Checklist;
	}
	public WebElement getPrize_Redemption_Checklist() {
		return Prize_Redemption_Checklist;
	}
	public WebElement getTicket_Redemption_Checklist() {
		return Ticket_Redemption_Checklist;
	}
	public WebElement getCricket_Simulators_Checklist() {
		return Cricket_Simulators_Checklist;
	}
	public WebElement getGo_Karting_Checklist() {
		return Go_Karting_Checklist;
	}
	public WebElement getTrampoline_Park() {
		return Trampoline_Park;
	}
	public WebElement getBowling_Lane() {
		return Bowling_Lane;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}
	public WebElement getTemplate_Name() {
		return Template_Name;
	}

	//Business Logic 
	public void ClickOn_RevenueLinkText()
	{
		RevenueLinkText.click();
	}

	public void ClickOn_F_and_B_LinkText()
	{
		F_and_B_LinkText.click();
	}

	public void ClickOn_select_Proprty_Dropdown_By_VisibleText(String Text)
	{
		Select sel=new Select(select_Proprty_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_select_Proprty_Dropdown_By_Index(int Index)
	{
		Select sel=new Select(select_Proprty_Dropdown);
		sel.selectByIndex(Index);
	}
	public void ClickOn_select_Proprty_Dropdown_By_value(String Value)
	{
		Select sel=new Select(select_Proprty_Dropdown);
		sel.selectByValue(Value);
	}

	public void ClickOn_Import_Button()
	{
		Import_Button.click();
	}

	public void ClickOn_Trampoline_Park_Checklist()
	{
		Trampoline_Park_Checklist.click();
	}

	public void ClickOn_Store_Door_Opening_Checklist()
	{
		Store_Door_Opening_Checklist.click();
	}

	public void ClickOn_Dashing_Car_Checklists()
	{
		Dashing_Car_Checklists.click();
	}
	public void ClickOn_Soft_Play_Checklist()
	{
		Soft_Play_Checklist.click();
	}

	public void ClickOn_Video_Games_checklist()
	{
		Video_Games_checklist.click();
	}
	public void ClickOn_Kiddy_Rides_Checklist()
	{
		Kiddy_Rides_Checklist.click();
	}
	public void ClickOn_Prize_Redemption_Checklist()
	{
		Prize_Redemption_Checklist.click();
	}
	public void ClickOn_Ticket_Redemption_Checklist()
	{
		Ticket_Redemption_Checklist.click();
	}
	public void ClickOn_Cricket_Simulators_Checklist()
	{
		Cricket_Simulators_Checklist.click();
	}
	public void ClickOn_Go_Karting_Checklist()
	{
		Go_Karting_Checklist.click();
	}
	public void ClickOn_Trampoline_Park()
	{
		Trampoline_Park.click();
	}
	public void ClickOn_Bowling_Lane()
	{
		Bowling_Lane.click();
	}
	public void ClickOn_Back_Button()
	{
		Back_Button.click();
	}
	public void ClickOn_Template_Name()
	{
		Template_Name.click();
	}
	public void ClickOn_Ok_Button_On_Confirmation_Page()
	{
		Ok_Button_On_Confirmation_Page.click();
	}
	public void CLickOn_Ok_Button_On_errorPopUp_On_Confirmation_Page()
	{
		Ok_Button_On_errorPopUp_On_Confirmation_Page.click();
	}

}