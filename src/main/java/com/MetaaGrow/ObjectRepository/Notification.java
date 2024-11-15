package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Notification {
	
	public Notification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Filter']")private WebElement FilterIcon;
	@FindBy(xpath = "//span[normalize-space()='Select Property']")private WebElement SelectPropertyFilter;
	@FindBy(xpath = "(//input[@name='autocomplete'])[1]")private WebElement PropertyFilterSearchBox;
	@FindBy(xpath = "//span[normalize-space()='Select Asset']" )private WebElement SelectAssetFilter;
	@FindBy(xpath = "(//input[@name='autocomplete'])[2]")private WebElement FilterByAssetSearchBox;
	@FindBy(xpath = "//span[normalize-space()='Apply']")private WebElement ApplyFilterButton;
	@FindBy(xpath = "//span[.='Clear']")private WebElement ClearFilterBtton;
	@FindBy(xpath = "//span[normalize-space()='Add Asset Notification']")private WebElement Add_AssetNotificationButton;
	@FindBy(xpath = "//select[@id='selectUser']")private WebElement SelectPropertyDropdown;
	@FindBy(xpath = "(//select[@formcontrolname='departmentId'])[1]")private WebElement SelectDepartmentDropdown_OnAddAssetPage;
	@FindBy(xpath = "(//select[@formcontrolname='departmentId'])[2]")private WebElement SelectDepartmentDropdown_OnEditPage;
	public WebElement getSelectDepartmentDropdown_OnEditPage() {
		return SelectDepartmentDropdown_OnEditPage;
	}

	@FindBy(xpath = "(//select[@formcontrolname='userId'])[1]")private WebElement SelectUserDropdown_OnAddAssetPage;
	@FindBy(xpath = "(//select[@formcontrolname='userId'])[2]")private WebElement SelectUserDropdown_OnEditPage;
	public WebElement getSelectUserDropdown_OnEditPage() {
		return SelectUserDropdown_OnEditPage;
	}

	@FindBy(xpath = "//div[@id='myModal']//button[@type='button'][normalize-space()='Submit']")private WebElement SubmitButton;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[1]")private WebElement EditButton;
	@FindBy(xpath = "//a[normalize-space()='ANDHERI']")private WebElement SelectDynamicPropertyFilter;
	@FindBy(xpath = "//a[normalize-space()='Raptor']")private WebElement SelectDynamicAssetFilter;
	@FindBy(xpath = "//div[@id='editnotify']//button[@type='button'][normalize-space()='Submit']")private WebElement SubmitButtonOnEditPage;
	@FindBy(xpath = "//button[@id='closeeditnotify']")private WebElement CloseButtonOn_EditPage;
	@FindBy(xpath = "//button[@id='closemyModal']")private WebElement CloseButtonOn_AddPage;
	
	public WebElement getCloseButtonOn_AddPage() {
		return CloseButtonOn_AddPage;
	}
	public WebElement getCloseButtonOn_EditPage() {
		return CloseButtonOn_EditPage;
	}
	public WebElement getSubmitButtonOnEditPage() {
		return SubmitButtonOnEditPage;
	}
	public WebElement getSelectDynamicAssetFilter() {
		return SelectDynamicAssetFilter;
	}
	public WebElement getSelectDynamicPropertyFilter() {
		return SelectDynamicPropertyFilter;
	}
	//Getters Methods
	public WebElement getFilterIcon() {
		return FilterIcon;
	}
	public WebElement getSelectPropertyFilter() {
		return SelectPropertyFilter;
	}
	public WebElement getPropertyFilterSearchBox() {
		return PropertyFilterSearchBox;
	}
	public WebElement getSelectAssetFilter() {
		return SelectAssetFilter;
	}
	public WebElement getFilterByAssetSearchBox() {
		return FilterByAssetSearchBox;
	}
	public WebElement getApplyFilterButton() {
		return ApplyFilterButton;
	}
	public WebElement getClearFilterBtton() {
		return ClearFilterBtton;
	}
	public WebElement getAdd_AssetNotificationButton() {
		return Add_AssetNotificationButton;
	}
	public WebElement getSelectPropertyDropdown() {
		return SelectPropertyDropdown;
	}
	public WebElement getSelectDepartmentDropdown_OnAddAssetPage() {
		return SelectDepartmentDropdown_OnAddAssetPage;
	}
	public WebElement getSelectUserDropdown_OnAddAssetPage() {
		return SelectUserDropdown_OnAddAssetPage;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public WebElement getEditButton() {
		return EditButton;
	}
	
	//Business Logic
  public void ClickOn_FilterIcon()
  {
	  FilterIcon.click();
  }
  public void ClickOn_SelectPropertyFilter()
  {
	  SelectPropertyFilter.click();
  }
  public void ClickOn_PropertyFilterSearchBox(String Search_Property)
  {
	  PropertyFilterSearchBox.sendKeys(Search_Property);
  }
  public void ClickOn_SelectAssetFilter()
  {
	  SelectAssetFilter.click();
  }
  public void ClickOn_FilterByAssetSearchBox(String Search_Asset)
  {
	  FilterByAssetSearchBox.sendKeys(Search_Asset);
  }
  public void ClickOn_ApplyFilterButton()
  {
	  ApplyFilterButton.click();
  }
  public void ClickOn_ClearFilterBtton()
  {
	  ClearFilterBtton.click();
  }
  public void ClickOn_Add_AssetNotificationButton()
  {
	  Add_AssetNotificationButton.click();
  }
  public void SelectPropertyDropdown(String Text)
  {
	  Select sel=new Select(SelectPropertyDropdown);
	  sel.selectByVisibleText(Text);
  }
  public void ClickOn_SelectDepartmentDropdown_OnAddAssetPage(String Text)
  {
	 Select sel = new Select(SelectDepartmentDropdown_OnAddAssetPage);
	 sel.selectByVisibleText(Text);
  }
  public void ClickOn_SelectUserDropdown_OnAddAssetPage(String Text)
  {
	  Select sel=new Select(SelectUserDropdown_OnAddAssetPage);
	  sel.selectByVisibleText(Text);
  }
  public void clickOn_SubmitButton()
  {
	  SubmitButton.click();
  }
  public void ClickOn_EditButton()
  {
	  EditButton.click();
  }
  public void ClickOn_SelectDynamicPropertyFilter()
  {
	  SelectDynamicPropertyFilter.click();
  }
  public void clickOn_SelectDynamicAssetFilter()
  {
	  SelectDynamicAssetFilter.click();
  }
  public void ClickOn_SelectDepartmentDropdown_OnEditPage(String Text)
  {
	  Select sel=new Select(SelectDepartmentDropdown_OnEditPage);
	  sel.selectByVisibleText(Text);
  }
  
  public void ClickOn_SelectUserDropdown_OnEditPage(String Text)
  {
	  Select sel=new Select(SelectUserDropdown_OnEditPage);
	  sel.selectByVisibleText(Text);
  }
  public void ClickOn_SubmitButtonOnEditPage()
  {
	  SubmitButtonOnEditPage.click();
  }
  public void ClickOn_CloseButtonOn_EditPage()
  {
	  CloseButtonOn_EditPage.click();
  }
  public void ClickOn_CloseButtonOn_AddPage()
  {
	  CloseButtonOn_AddPage.click();
  }
}
