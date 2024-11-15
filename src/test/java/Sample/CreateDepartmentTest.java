package Sample;

import org.openqa.selenium.WebDriver;

import com.MetaaGrow.ObjectRepository.Departments;
import com.MetaaGrow.ObjectRepository.HomePage;

public class CreateDepartmentTest {
	public WebDriver driver;
	public void Createdepartment() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		
		Departments dm=new Departments(driver);
		dm.ClickOnDepartments();
				dm.ClickOnAddDepartmentsLinkText();
		dm.ClickOnDepartmentNameTextField("Rakul");
		Thread.sleep(3000);
		dm.ClickOnStatusDropdown();
		dm.ClickOnActiveDepartmentPage();
	}

}
