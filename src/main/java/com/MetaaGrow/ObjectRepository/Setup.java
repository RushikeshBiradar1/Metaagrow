package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Setup {
	//Initialization
	public Setup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
    @FindBy(id = "Departments") private WebElement DepartmentsLinkText;
    @FindBy(xpath = "//a[@id='Properties']//div[@class='grad-box card']")private WebElement ProPropertiesLinkText;
    @FindBy(xpath = "//a[@id='Users']")private WebElement Users_And_TeamsLinkText;
    @FindBy(xpath = "(//a[@id='Roles'])[1]")private WebElement Roles_And_PermissionsLinkText;
    @FindBy(id = "Checklists")private WebElement ChecklistLinkText;
    @FindBy(id = "Document")private WebElement DocumentsLinkText;
    @FindBy(id = "Surveys")private WebElement SurveysLinkText;
    @FindBy(id = "Settings")private WebElement SettingsLInkText;
    @FindBy(xpath = "(//div[@class='grad-box card'])[8]")private WebElement NoticationLinkText;
    @FindBy(xpath = "(//a[@id='Settings'])[2]")private WebElement IncidentForm;
    
    
	
  public WebElement getIncidentForm() {
		return IncidentForm;
	}
public WebElement getNoticationLinkText() {
		return NoticationLinkText;
	}
	//Getters Method
    public WebElement getDepartmentsLinkText() {
		return DepartmentsLinkText;
	}
	public WebElement getProPropertiesLinkText() {
		return ProPropertiesLinkText;
	}
	public WebElement getUsers_And_TeamsLinkText() {
		return Users_And_TeamsLinkText;
	}
	public WebElement getRoles_And_PermissionsLinkText() {
		return Roles_And_PermissionsLinkText;
	}
	public WebElement getChecklistLinkText() {
		return ChecklistLinkText;
	}
	public WebElement getDocumentsLinkText() {
		return DocumentsLinkText;
	}
	public WebElement getSurveysLinkText() {
		return SurveysLinkText;
	}
	public WebElement getSettingsLInkText() {
		return SettingsLInkText;
	}
	public void ClickOn_IncidentForm()
	{
		IncidentForm.click();
	}
    
    
    //Business Logic
	public void ClickOnDepartmentsLinkText()
	{
		DepartmentsLinkText.click();
	}
	public void ClickOnProPropertiesLinkText()
	{
		ProPropertiesLinkText.click();
	}
    public void ClickOnUsers_And_TeamsLinkText()
    {
    	Users_And_TeamsLinkText.click();
    }
    public void ClickOnRoles_And_PermissionsLinkText()
    {
    	Roles_And_PermissionsLinkText.click();
    }
    public void ClickOnChecklistLinkText()
    {
    	ChecklistLinkText.click();
    }
    public void ClickOnDocumentsLinkText()
    {
    	DocumentsLinkText.click();
    }
    public void ClickOnSurveysLinkText()
    {
    	SurveysLinkText.click();
    }
    public void ClickOnSettingsLInkText()
    {
    	SettingsLInkText.click();
    }
    public void ClickOn_NoticationLinkText()
    {
    	NoticationLinkText.click();
    }
    
}
