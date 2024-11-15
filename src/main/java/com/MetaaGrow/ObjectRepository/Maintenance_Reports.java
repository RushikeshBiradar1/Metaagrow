package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maintenance_Reports {
	public Maintenance_Reports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "//img[@alt='Duplicate']")private WebElement Filter_By_Download_Button;
	@FindBy(xpath = "(//button[@id='custom'])[1]")private WebElement Filter_Icon;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement Filter_By_Apply_Button;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")private WebElement Filter_By_Cancel_Button;
	@FindBy(xpath = "//span[normalize-space()='Select Property']")private WebElement Filter_By_Property;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement Filter_By_Property_SearchBox;
     @FindBy(xpath = "//input[@placeholder='PM Name']")private WebElement Filter_By_Pm_Name;
     @FindBy(xpath = "//input[@placeholder='category']")private WebElement Filter_By_Category;
     @FindBy(xpath = "//span[@title='Select Status']")private WebElement Filter_By_Status;
     @FindBy(xpath = "//a[normalize-space()='Completed']")private WebElement Filter_By_Completed_Status;
     @FindBy(xpath = "//span[@title='Select Assigned To']")private WebElement Filter_By_Assigned_To;
     @FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Assigned_To_Search_Box;
     @FindBy(xpath = "//span[.='Select Asset']")private WebElement Filter_By_Asset;
     @FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Asset_SearchBox;
     @FindBy(xpath = "//span[@title='Select Completed By']")private WebElement Filter_By_Completed_By;
     @FindBy(xpath = "(//input[@name='autocomplete'])[4]")private WebElement Filter_By_Completed_By_SearchBox;
     
     //Getters Method
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
	public WebElement getFilter_By_Pm_Name() {
		return Filter_By_Pm_Name;
	}
	public WebElement getFilter_By_Category() {
		return Filter_By_Category;
	}
	public WebElement getFilter_By_Status() {
		return Filter_By_Status;
	}
	public WebElement getFilter_By_Completed_Status() {
		return Filter_By_Completed_Status;
	}
	public WebElement getFilter_By_Assigned_To() {
		return Filter_By_Assigned_To;
	}
	public WebElement getFilter_By_Assigned_To_Search_Box() {
		return Filter_By_Assigned_To_Search_Box;
	}
	public WebElement getFilter_By_Asset() {
		return Filter_By_Asset;
	}
	public WebElement getFilter_By_Asset_SearchBox() {
		return Filter_By_Asset_SearchBox;
	}
	public WebElement getFilter_By_Completed_By() {
		return Filter_By_Completed_By;
	}
	public WebElement getFilter_By_Completed_By_SearchBox() {
		return Filter_By_Completed_By_SearchBox;
	}
     
	//Business Logic
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
    public void ClickOn_Filter_By_Pm_Name(String PM_Name)
    {
    	Filter_By_Pm_Name.sendKeys(PM_Name);
    }
    public void ClickOn_Filter_By_Category(String Category)
    {
    	Filter_By_Category.sendKeys(Category);
    }
    public void ClickOn_Filter_By_Status()
    {
    	Filter_By_Status.click();
    	}
    public void ClickOn_Filter_By_Completed_Status()
    {
    	Filter_By_Completed_Status.click();
    }
    public void ClickOn_Filter_By_Assigned_To()
    {
    	Filter_By_Assigned_To.click();
    }
    public void ClickOn_Filter_By_Assigned_To_Search_Box(String Search_Assigned_To)
    {
    	Filter_By_Assigned_To_Search_Box.sendKeys(Search_Assigned_To);
    }
    public void ClickOn_Filter_By_Asset()
    {
    	Filter_By_Asset.click();
    }
    public void ClickOn_Filter_By_Asset_SearchBox(String Search_Asset)
    {
    	Filter_By_Asset_SearchBox.sendKeys(Search_Asset);
    }
    public void ClickOn_Filter_By_Completed_By()
    {
    	Filter_By_Completed_By.click();
    }
    public void ClickOn_Filter_By_Completed_By_SearchBox(String Search_Completed_By)
    {
    	Filter_By_Completed_By_SearchBox.sendKeys(Search_Completed_By);
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
    public void ClickOn_Filter_By_End_Date(WebDriver driver)
    {
    	String end_month="Oct-2023";
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
