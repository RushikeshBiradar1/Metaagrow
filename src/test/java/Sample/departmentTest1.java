package Sample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.Departments;
import com.MetaaGrow.ObjectRepository.HomePage;
import com.MetaaGrow.ObjectRepository.Setup;

public class departmentTest1 extends BaseClass{
	@Test
	public void DDDDDDDDDDDe() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Setup s = new Setup(driver);
		s.ClickOnDepartmentsLinkText();
		Departments d = new Departments(driver);
		d.ClickOnFilterIcon();
		Thread.sleep(2000);

		d.ClickOn_Filter_By_Department();
		Thread.sleep(2000);

		d.ClickOn_Filter_By_Dynamic_Department();
		Thread.sleep(2000);

		d.ClickOnApplyButtonOnFilter();
		Thread.sleep(4000);
		d.ClickOnFilterIcon();
		Thread.sleep(2000);
		d.ClickOnClearButtonOnFilter();
		Thread.sleep(2000);
		d.ClickOnAddDepartmentsLinkText();
		Thread.sleep(2000);
		d.ClickOnDepartmentNameTextField("Cook");
		//d.ClickOnStatusDropdown();
		Thread.sleep(2000); 
		d.ClickOnStatusDropdown();
		Thread.sleep(2000);
		d.ClickOnInactiveDepartment();
		Thread.sleep(2000);
		d.ClickAddDepartmentsButton_On_Create_Department_Page();
		d.CLickOn_Ok_Button_On_Add_Department_Confirmation_Page();
		
		Thread.sleep(5000);
	}

}