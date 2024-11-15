package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inspection_Report {
	public Inspection_Report(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declarationc
	@FindBy(xpath = "//img[@alt='Duplicate']")private WebElement Filter_By_Download_Button;
	@FindBy(xpath = "(//button[@id='custom'])[1]")private WebElement Filter_Icon;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Filter_By_Cancel_Button;
	@FindBy(xpath = "//span[normalize-space()='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
	@FindBy(xpath = "//Input[@placeholder='Schedule Name']")private WebElement Filter_By_Schedule_name;
	@FindBy(xpath = "//Input[@placeholder='Checklist Name']")private WebElement Filter_By_CheckList_name;
	@FindBy(xpath = "//span[@title='Select Status']")private WebElement Filter_By_Select_Status;
	@FindBy(xpath = "//a[normalize-space()='Completed']")private WebElement Filter_By_Select_Completed_Status;
	@FindBy(xpath = "//a[normalize-space()='Pending']")private WebElement Filter_By_Select_Pending_Status;
	@FindBy(xpath = "//span[@title='Select Assigned To']")private WebElement Filter_By_Assigned_To;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Assigned_To_SearchBox;
	@FindBy(xpath = "//span[@title='Select location']")private WebElement Filter_By_Location;
	@FindBy(xpath = "(//input[@name='autocomplete'])[3]")private WebElement Filter_By_Location_SearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select Completed By']")private WebElement Filter_By_Completed_By;
	@FindBy(xpath = "(//input[@name='autocomplete'])[4]")private WebElement Filter_By_completed_By_SearchBox;
	public WebElement getFilter_By_Download_Button() {
		return Filter_By_Download_Button;
	}
	public WebElement getFilter_Icon() {
		return Filter_Icon;
	}
	public WebElement getFilter_By_Apply_Button() {
		return Filter_By_Apply_Button;
	}
	public WebElement getFilter_By_Cancel_Button() {
		return Filter_By_Cancel_Button;
	}
	public WebElement getFilter_By_Property() {
		return Filter_By_Property;
	}
	public WebElement getFilter_By_Property_SearchBox() {
		return Filter_By_Property_SearchBox;
	}
	public WebElement getFilter_By_Schedule_name() {
		return Filter_By_Schedule_name;
	}
	public WebElement getFilter_By_CheckList_name() {
		return Filter_By_CheckList_name;
	}
	public WebElement getFilter_By_Select_Status() {
		return Filter_By_Select_Status;
	}
	public WebElement getFilter_By_Select_Completed_Status() {
		return Filter_By_Select_Completed_Status;
	}
	public WebElement getFilter_By_Select_Pending_Status() {
		return Filter_By_Select_Pending_Status;
	}
	public WebElement getFilter_By_Assigned_To() {
		return Filter_By_Assigned_To;
	}
	public WebElement getFilter_By_Assigned_To_SearchBox() {
		return Filter_By_Assigned_To_SearchBox;
	}
	public WebElement getFilter_By_Location() {
		return Filter_By_Location;
	}
	public WebElement getFilter_By_Location_SearchBox() {
		return Filter_By_Location_SearchBox;
	}
	public WebElement getFilter_By_Completed_By() {
		return Filter_By_Completed_By;
	}
	public WebElement getFilter_By_completed_By_SearchBox() {
		return Filter_By_completed_By_SearchBox;
	}
	
//	Business Logic
	public void ClickoN_Filter_By_Download_Button()
	{
		Filter_By_Download_Button.click();
	}
	public void ClickOn_Filter_Icon()
	{
		Filter_Icon.click();
	}
	public void ClickOn_Filter_By_Apply_Button()
	{
		Filter_By_Apply_Button.click();

	}
	public void ClickOn_Filter_By_Cancel_Button()
	{
		Filter_By_Cancel_Button.click();
	}
    
    public void ClickOn_Filter_By_Property()
    {
    	Filter_By_Property.click();
    }
    public void ClickOn_Filter_By_Property_SearchBox(String Search_Property)
    {
    	Filter_By_Property_SearchBox.sendKeys(Search_Property);
    }
    public void ClickOn_Filter_By_Schedule_name(String Schedule_Name)
    {
    	Filter_By_Schedule_name.sendKeys(Schedule_Name);
    }
    public void ClickOn_Filter_By_CheckList_name(String Checklist_Name)
    {
    	Filter_By_CheckList_name.sendKeys(Checklist_Name);
    }
    public void ClickOn_Filter_By_Select_Status()
    {
    	Filter_By_Select_Status.click();
    }
    public void clickOn_Filter_By_Select_Completed_Status()
    {
    	Filter_By_Select_Completed_Status.click();
    	
    }
    public void ClickOn_Filter_By_Select_Pending_Status()
    {
    	Filter_By_Select_Pending_Status.click();
    }
    public void ClickOn_Filter_By_Assigned_To()
    {
    	
    	Filter_By_Assigned_To.click();
    }
    public void ClickOn_Filter_By_Assigned_To_SearchBox(String Seaarch_Assigned_To)
    {
    	Filter_By_Assigned_To_SearchBox.sendKeys(Seaarch_Assigned_To);
    }
    public void ClickOn_Filter_By_Location()
    {
    	Filter_By_Location.click();
    }
    public void ClickOn_Filter_By_Location_SearchBox(String Loaction)
    {
    	Filter_By_Location_SearchBox.sendKeys(Loaction);
    }
    public void clickOn_Filter_By_Completed_By()
    {
    	Filter_By_Completed_By.click();
    }
    public void clickOn_Filter_By_completed_By_SearchBox(String Search_Completed_By)
    {
    	Filter_By_completed_By_SearchBox.sendKeys(Search_Completed_By);
    }
    public void ClickOn_Filter_By_Start_Date(WebDriver driver)
    {
    	String month="Aug-2023";
		String day="11";
		driver.findElement(By.xpath("(//input[@placeholder='Date'])[1]")).click();
		
		while(true)
		{
			//Aug-2023(Month-Year) path
			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

			if(text.equals(month))
			{
				break;
			}
			else
			{
				//date scroll left icon
				driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
    }
    public void ClickOn_Filter_By_ENd_Date(WebDriver driver)
    {
    	String end_month="Mar-2024";
		String end_day="10";
		driver.findElement(By.xpath("(//input[@placeholder='Date'])[2]")).click();
		while(true)
		{
			//(Month-Year) path
			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

			if(text.equals(end_month))
			{
				break;
			}
			else
			{
				//Date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
    }

}
