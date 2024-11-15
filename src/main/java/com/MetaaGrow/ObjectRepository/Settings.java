package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Settings {
	//Initialization
	public Settings(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(id = "region") private WebElement RegionSetting_Dropdown;
	@FindBy(id = "currency")private WebElement currencySetting_Dropdown;
	@FindBy(xpath = "//span[.='Save']")private WebElement Save_Button;
	@FindBy(xpath = "//button[.='Ok']")private WebElement Ok_Button_On_Confirmation_Page;
	@FindBy(xpath = "//span[.='Back']")private WebElement Back_Button;
	public WebElement getRegionSetting_Dropdown() {
		return RegionSetting_Dropdown;
	}
	public WebElement getCurrencySetting_Dropdown() {
		return currencySetting_Dropdown;
	}
	public WebElement getSave_Button() {
		return Save_Button;
	}
	public WebElement getOk_Button_On_Confirmation_Page() {
		return Ok_Button_On_Confirmation_Page;
	}
	public WebElement getBack_Button() {
		return Back_Button;
	}

	public void Select_Region_SettingBy_Index(int Index)
	{
		Select sel=new Select(RegionSetting_Dropdown);
		sel.selectByIndex(Index);
	}
	public void Select_Region_SettingBy_VisibleText(String Text)
	{
		Select sel=new Select(RegionSetting_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void Select_Region_SettingBy_Value(String Value)
	{
		Select sel=new Select(RegionSetting_Dropdown);
		sel.selectByValue(Value);
	}
	public void Select_currency_SettingBy_VisibleText(String Text)
	{
		Select sel=new Select(currencySetting_Dropdown);
		sel.selectByVisibleText(Text);
	}
	public void Select_currency_SettingBy_Index(int Index)
	{
		Select sel=new Select(currencySetting_Dropdown);
		sel.selectByIndex(Index);
	}
	public void Select_currency_SettingBy_Value(String Value)
	{
		Select sel=new Select(currencySetting_Dropdown);
		sel.selectByValue(Value);
	}
	public void ClickOn_Save_Button()
	{
		Save_Button.click();
	}
	public void ClickOn_Ok_Button_On_Confirmation_Page()
	{
		Ok_Button_On_Confirmation_Page.click();
	}
	public void ClickOn_Back_Button()
	{
		Back_Button.click();
	}
}
