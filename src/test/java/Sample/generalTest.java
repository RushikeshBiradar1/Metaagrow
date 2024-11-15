package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.MetaaGrow.Generic_Utility.BaseClass;

import Properties.Properties;

public class generalTest extends BaseClass{

	
	public void windowswitching() throws Throwable
	{
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for(String exp : allwindow)
		{
			if(!parentwindow.equals(allwindow))
			{
				driver.switchTo().window(exp);
			}
		}
	}
}
