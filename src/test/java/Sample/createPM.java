package Sample;

import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.Generic_Utility.Java_Utility;
import com.MetaaGrow.Generic_Utility.WebDriver_Utility;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.LoginPage;
import com.MetaaGrow.ObjectRepository.Maintenance;

public class createPM extends BaseClass {
	@Test
	public void createpmwithallfields() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		lp.ClickOn_LoginNotification_Icon(driver);
		WebDriver_Utility wb = new WebDriver_Utility();
		wb.ImplicitlyWait(driver);
		wb.maximizeTheBrowser(driver);
		HomePage hp = new HomePage(driver);
		hp.ClickOnMaintenanceLinkText();
		Maintenance pm = new Maintenance(driver);
		pm.ClickOn_PM_Template_Tab();
		pm.ClickOn_Create_Template_Tab();
		pm.CLickOn_Create_Fresh_Template_Tab();
		Java_Utility java = new Java_Utility();
		String PM_Name ="General Maintenance" + java.getRandomNum();
		System.out.println(PM_Name);
		pm.ClickOn_Template_Name_TextField(PM_Name);

		
		pm.CLickon_Select_Property_Dropdown("THE_DHARAVI");
		Thread.sleep(3000);
		pm.CLickOn_Select_Asset_Dropdown("Train Tracker 17");
		Thread.sleep(3000);
		pm.selectTodayDate_OnStartDateOnCreatePMTemplate(driver);
		pm.End_Date(driver);
		Thread.sleep(3000);
	}

}
