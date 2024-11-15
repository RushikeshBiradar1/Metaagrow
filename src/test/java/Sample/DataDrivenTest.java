package Sample;

import java.util.Properties;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Excel_Utility;
import com.MetaaGrow.Generic_Utility.File_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.Generic_Utility.iPathConstant;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Properties1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	

	public static void main(String[]args) throws Throwable
	{
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		Excel_Utility ex = new Excel_Utility();
		File_Utility file = new File_Utility();
		driver.get("https://myworld.metaagrow.com/login-view");
		int rowcount = ex.getLastRowcountFromExcel("Sheet1", iPathConstant.ExcelFilePath);
		for(int i=1;i<=rowcount;i++)
		{
//			lp.ClickOn_LoginNotification_Icon(driver);
			String readusername = ex.ReadDataFromExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 0);
			String readpassword = ex.ReadDataFromExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 1);
            
			lp.getUserNameTextField().clear();
			lp.ClickOn_userNameTextField(readusername);
			Thread.sleep(2000);
			lp.getPassWordTextField().clear();
			lp.ClickOn_passWordTextField(readpassword);
		
			Thread.sleep(2000);
			lp.ClickOn_SignButton();
//			WebElement homepage = driver.findElement(By.xpath("//h2[normalize-space()='Dashboard']"));
//			    Verify login success
            boolean loginSuccessful = driver.findElement(By.xpath("//div[@class='logo']")).isDisplayed();
           
//			if(loginSuccessful) {
//				driver.findElement(By.xpath("//img[@id='customLogout']")).click();
//				driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
//				  System.out.println("Login successful for user: " + readusername);
//				  ex.CreateDataInExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 0, "Pass"); // Write "Pass" in column 2
//	                ex.setCellColor(i, 4, IndexedColors.GREEN, "iPathConstant.ExcelFilePath", "Sheet1"); // Color cell green
//				
//			} else {
//				
//			
//			System.out.println("Login failed for user: " + readusername);
//			  ex.CreateDataInExcel(iPathConstant.ExcelFilePath, "Sheet1", i, 0, "FAIL"); // Write "Pass" in column 2
//              ex.setCellColor(i, 4, IndexedColors.RED, "iPathConstant.ExcelFilePath", "Sheet1");
//			}


			
			
		
		}
		driver.close();
		
	}

}
