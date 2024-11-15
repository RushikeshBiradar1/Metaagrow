package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Footer_and_Header_Common {
	//Initialization
	public Footer_and_Header_Common(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "(//img[@alt='Next'])[1]")private WebElement Right_Slide_Arrow;
	@FindBy(xpath = "(//img[@alt='Prev'])[1]")private WebElement Left_Slide_Arrow;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[2]")private WebElement Jump_To_Page_Dropdown;
	@FindBy(xpath = "(//select[@id='RowPerPage'])[1]")private WebElement Show_Rows_Dropdown;
	@FindBy(xpath = "//span[normalize-space()='Back']")private WebElement Back_Button;
	@FindBy(xpath = "//span[normalize-space()='Close']")private WebElement Close_Button;
	@FindBy(xpath = "//span[normalize-space()='Dark Mode']")private WebElement Dark_Mode_Button;
	@FindBy(xpath = "//img[@alt='collapse.svg']")private WebElement Collapse_Button;
	
	//Getters Mathod
	public WebElement getRight_Slide_Arrow() {
		return Right_Slide_Arrow;
	}
	public WebElement getLeft_Slide_Arrow() {
		return Left_Slide_Arrow;
	}
	public WebElement getJump_To_Page_Dropdown() {
		return Jump_To_Page_Dropdown;
	}
	public WebElement getShow_Rows_Dropdown() {
		return Show_Rows_Dropdown;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}
	public WebElement getClose_Button() {
		return Close_Button;
	}
	public WebElement getDark_Mode_Button() {
		return Dark_Mode_Button;
	}
	public WebElement getCollapse_Button() {
		return Collapse_Button;
	}
	
	//Business Logic
	public void ClickOn_Right_Slide_Arrow()
	{
		Right_Slide_Arrow.click();
	}
	public void ClickOn_Left_Slide_Arrow()
	{
		Left_Slide_Arrow.click();
	}
	public void ClickOn_Jump_To_Page_Dropdown_By_VisibleText(String Text)
	{
		Select sel=new Select(Jump_To_Page_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void ClickOn_Show_Rows_Dropdown(String Text)
	{
		Select sel=new Select(Show_Rows_Dropdown);
		sel.selectByVisibleText(Text);
	}
	
	public void ClickOn_Back_Button()
	{
		Back_Button.click();
	}
	public void ClickOn_Close_Button()
	{
		Close_Button.click();
	}
	public void ClickOn_Dark_Mode_Button()
	{
		Dark_Mode_Button.click();
	}
	public void ClickOn_Collapse_Button()
	{
		Collapse_Button.click();
	}
	public String  getselectedOptionsFromDropdown()
	{
		Select sel=new Select(Show_Rows_Dropdown);
		WebElement selectedOption =sel.getFirstSelectedOption();
		return selectedOption.getText();
	}


}
