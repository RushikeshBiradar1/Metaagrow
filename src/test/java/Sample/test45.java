package Sample;

import org.testng.annotations.Test;

import com.MetaaGrow.Generic_Utility.BaseClass;
import com.MetaaGrow.ObjectRepository.HomePage;

public class test45 extends BaseClass{
	@Test
	public void tesssst() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnSetupLinkText(driver);
		Thread.sleep(2000);
		hp.ClickOnMetersLinkText();
		Thread.sleep(2000);
		hp.ClickOnMaintenanceLinkText();
		Thread.sleep(2000);
		hp.ClickOnTicketsLinkText();
		Thread.sleep(2000);
		hp.ClickOnAssetsLinkText();
		Thread.sleep(2000);
		hp.ClickOnInspectionsLinkText();
		Thread.sleep(2000);
		hp.ClickOnReportsLinkText();
		Thread.sleep(2000);
	}

}
