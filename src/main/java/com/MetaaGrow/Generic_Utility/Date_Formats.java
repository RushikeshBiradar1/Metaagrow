package com.MetaaGrow.Generic_Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Formats {

	public void start_Date1(WebDriver driver) throws Throwable
	{
		String month="Aug-2023";
		String day="11";
		driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
		Thread.sleep(3000);
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

	public void End_Date(WebDriver driver)
	{


		String end_month="Feb-2024";
		String end_day="20";
		driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	}

	//Maintenance create PM Template page
	public void start_Date_ON_create_PM_Template_page(WebDriver driver) throws Throwable
	{
		String month="Jan-2024";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).click();
		Thread.sleep(3000);
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	//Maintenance create PM Template page
	public void End_Date_ON_create_PM_Template_page(WebDriver driver)
	{


		String end_month="Feb-2024";
		String end_day="10";
		driver.findElement(By.xpath("//input[@formcontrolname='endDate']")).click();
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	}


	public void start_Date_ON_Parts_And_Inventory_Reports_Page(WebDriver driver) throws Throwable
	{
		String month="Jan-2024";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).click();
		Thread.sleep(3000);
		while(true)
		{
			//Aug-2023(Month-Year) path
			String text = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();
			System.out.println(text);
			if(text.equals(month))
			{
				break;
			}
			else
			{
				//date scroll left icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	public void End_Date_ON_Parts_And_Inventory_Reports_Page(WebDriver driver)
	{


		String end_month="Jan-2024";
		String end_day="10";
		driver.findElement(By.xpath("//input[@formcontrolname='endDate']")).click();
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();

	}
	public void Date_Of_Purchase_On_Add_Single_Parts_and_Asset_Page(WebDriver driver) throws Throwable
	{
		String month="Aug-2023";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='purchaseDate']")).click();
		Thread.sleep(3000);
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

	public void Expiry_Date_On_Add_Single_Parts_Page(WebDriver driver) throws Throwable
	{
		String month="Jan-2024";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='expiry']")).click();
		Thread.sleep(3000);
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
				//date scroll Right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	public void Warranty_Expiry_Date_On_Add_Single_Parts_Page(WebDriver driver) throws Throwable
	{
		String month="Feb-2024";
		String day="20";
		driver.findElement(By.xpath("//input[@formcontrolname='warrantyExpiry']")).click();
		Thread.sleep(3000);
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
				//date scroll Right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}


	public void Service_Start_Date_On_Add_New_Warranty_Service_Page(WebDriver driver) throws Throwable
	{
		String month="Jan-2023";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).click();
		Thread.sleep(3000);
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
	//

	public void Service_End_Date_On_Add_New_Warranty_Service_Page(WebDriver driver) throws Throwable
	{
		String month="Feb-2024";
		String day="20";
		driver.findElement(By.xpath("//input[@formcontrolname='endDate']")).click();
		Thread.sleep(3000);
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
				//date scroll Right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	public void Asset_Transfer_Date_Of_Transfer(WebDriver driver) throws Throwable
	{
		String month="Dec-2023";
		String day="21";
		driver.findElement(By.xpath("//input[@formcontrolname='dot']")).click();
		Thread.sleep(3000);
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
				//date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	public void Asset_Transfer_Date_Of_Return(WebDriver driver) throws Throwable
	{
		String month="Jan-2024";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='dor']")).click();
		Thread.sleep(3000);
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
				//date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}


	public void Asset_Placed_In_ServiceDate_On_Add_AssetPage(WebDriver driver) throws Throwable
	{
		String month="Jan-2024";
		String day="15";
		driver.findElement(By.xpath("//input[@formcontrolname='placeInService']")).click();
		Thread.sleep(3000);
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
				//date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	public void Warranty_start_Date_On_Add_Asset_Page(WebDriver driver) throws Throwable
	{
		String month="Feb-2024";
		String day="15";
		driver.findElement(By.xpath("(//input[@formcontrolname='startDate'])[1]")).click();
		Thread.sleep(3000);
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
				//date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}


	public void Warranty_End_Date_On_Add_Asset_Page(WebDriver driver) throws Throwable
	{
		String month="May-2024";
		String day="15";
		driver.findElement(By.xpath("(//input[@formcontrolname='endDate'])[1]")).click();
		Thread.sleep(3000);
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}



	public void AMC_start_Date_On_Add_Asset_Page(WebDriver driver) throws Throwable
	{
		String month="Feb-2024";
		String day="15";
		driver.findElement(By.xpath("(//input[@formcontrolname='startDate'])[2]")).click();
		Thread.sleep(3000);
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
				//date scroll right icon
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}


	public void AMC_End_Date_On_Add_Asset_Page(WebDriver driver) throws Throwable
	{
		String month="May-2024";
		String day="15";
		driver.findElement(By.xpath("(//input[@formcontrolname='endDate'])[2]")).click();
		Thread.sleep(3000);
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}

	public void Asset_Info_Reports_Filter_Start_And_End_Date(WebDriver driver)
	{
					driver.findElement(By.xpath("//input[@placeholder='Warranty Expiration']")).click();
					
					String month="Aug-2023";
					String day="15";
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
					
				
					String end_month="Dec-2023";
					String end_day="10";
					
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
							driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
							
						}
					
					}
					driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	}
	
	public void StartDate_OnCreate_a_Schedule_Page(WebDriver driver)
	{	
		String month="Jan-2024";
		String day="01";
		driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).click();
	
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}

		driver.findElement(By.xpath("//span[normalize-space()="+day+"]")).click();
	}
	public void EndDate_On_Create_a_Schedule_Page(WebDriver driver)
	{
		
		String end_month="Feb-2024";
		String end_day="10";
		driver.findElement(By.xpath("//input[@formcontrolname='endDate']")).click();
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	}
	public void Reports_Filter_BY_Start_Date(WebDriver driver) throws Throwable
	{
		String month="Aug-2023";
		String day="15";
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(3000);
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
	public void Reports_Filter_BY_End_Date(WebDriver driver) throws Throwable
	{
		String end_month="Mar-2024";
		String end_day="10";
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	}
	public void Asset_Return_Filter_By_Return_Date(WebDriver driver)
	{
		String month="Aug-2023";
		String day="15";
		driver.findElement(By.xpath("//input[@placeholder='Return Date']")).click();
		
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
	public void Tickets_reports_Filter_By_Start_Date(WebDriver driver)
	{
		String month="Aug-2023";
		String day="15";
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
	public void Tickets_Reports_Filter_By_End_Date(WebDriver driver)
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
				driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();

			}

		}
		driver.findElement(By.xpath("//span[normalize-space()="+end_day+"]")).click();
	}
}
