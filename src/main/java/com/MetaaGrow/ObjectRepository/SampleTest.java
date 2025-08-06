package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleTest {
	
	//Initialization
	public SampleTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Declaration 
	@FindBy(id="today") private WebElement TodaysTab;
	@FindBy(id="manageSchedules") private WebElement ManageSchedule_Button;
	
	
	//Business Logic 
	public void ClickOn_TodaysTab()
	{
		TodaysTab.click();
	}
	public void ClickOn_ManageScheduleButton()
	{
		ManageSchedule_Button.click();
	}
	

}
