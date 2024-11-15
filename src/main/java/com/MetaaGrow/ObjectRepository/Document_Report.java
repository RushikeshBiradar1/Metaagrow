package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_Report {
	public Document_Report(WebDriver driver)
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
	@FindBy(xpath = "//span[.='Select Asset']")private WebElement Filter_By_Select_Asset;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement Filter_By_Asset_SearchBox;
	@FindBy(xpath = "//input[@placeholder='Document Type']")private WebElement Filter_By_Document_Type;
	@FindBy(xpath = "//input[@placeholder='Document Provider']")private WebElement Filter_By_Document_Provider;
	@FindBy(xpath = "//input[@placeholder='Document Number']")private WebElement Filter_By_Document_Number;
	@FindBy(xpath = "//span[.='Select Created by']")private WebElement Filter_By_Created_By;
	@FindBy(xpath = "(//input[@name='autocomplete'])[3]")private WebElement Filter_By_Created_By_Search_Box;
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
	public WebElement getFilter_By_Select_Asset() {
		return Filter_By_Select_Asset;
	}
	public WebElement getFilter_By_Asset_SearchBox() {
		return Filter_By_Asset_SearchBox;
	}
	public WebElement getFilter_By_Document_Type() {
		return Filter_By_Document_Type;
	}
	public WebElement getFilter_By_Document_Provider() {
		return Filter_By_Document_Provider;
	}
	public WebElement getFilter_By_Document_Number() {
		return Filter_By_Document_Number;
	}
	public WebElement getFilter_By_Created_By() {
		return Filter_By_Created_By;
	}
	public WebElement getFilter_By_Created_By_Search_Box() {
		return Filter_By_Created_By_Search_Box;
	}
	//Bisuness Logic
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
    public void ClickOn_Filter_By_Select_Asset()
    {
    	Filter_By_Select_Asset.click();
    }
    public void CLickON_Filter_By_Asset_SearchBox(String Search_Asset)
    {
    	Filter_By_Asset_SearchBox.sendKeys(Search_Asset);
    }
    public void ClickOn_Filter_By_Document_Type(String Document_Type)
    {
    	Filter_By_Document_Type.sendKeys(Document_Type);
    }
    public void ClickOn_Filter_By_Document_Provider(String Document_Provider)
    {
    	Filter_By_Document_Provider.sendKeys(Document_Provider);
    }
    public void ClickOn_Filter_By_Document_Number(String Document_Number)
    {
    	Filter_By_Document_Number.sendKeys(Document_Number);
    }
    public void ClickOn_Filter_By_Created_By()
    {
    	Filter_By_Created_By.click();
    }
    public void ClickOn_Filter_By_Created_By_Search_Box(String Search_Created_By)
    {
    	Filter_By_Created_By_Search_Box.sendKeys(Search_Created_By);
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
