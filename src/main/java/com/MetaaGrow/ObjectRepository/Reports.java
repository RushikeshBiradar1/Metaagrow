package com.MetaaGrow.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {

	//Initialization
	public Reports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath = "(//div[@class='grad-box card'])[1]")private WebElement StockReport;
	@FindBy(xpath = "(//div[@class='grad-box card'])[2]")private WebElement Inventory_Procurement_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[3]")private WebElement Parts_Movement_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[4]")private WebElement Asset_Expense_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[5]")private WebElement Asset_Return_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[6]")private WebElement Part_Return_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[7]")private WebElement Disposed_Asset_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[8]")private WebElement Tickets_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[9]")private WebElement Asset_Movement_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[10]")private WebElement Vendor_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[11]")private WebElement Asset_Downtime_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[12]")private WebElement Inspection_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[13]")private WebElement Document_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[14]")private WebElement Maintenance_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[1]")private WebElement Asset_Vendor_Report;
	@FindBy(xpath = "(//div[@class='grad-box card'])[2]")private WebElement Parts_Vendor_Report;

	public WebElement getAsset_Vendor_Report() {
		return Asset_Vendor_Report;
	}
	public WebElement getParts_Vendor_Report() {
		return Parts_Vendor_Report;
	}
	//Getters Method
	public WebElement getStockReport() {
		return StockReport;
	}
	public WebElement getInventory_Procurement_Report() {
		return Inventory_Procurement_Report;
	}
	public WebElement getParts_Movement_Report() {
		return Parts_Movement_Report;
	}
	public WebElement getAsset_Expense_Report() {
		return Asset_Expense_Report;
	}
	public WebElement getAsset_Return_Report() {
		return Asset_Return_Report;
	}
	public WebElement getPart_Return_Report() {
		return Part_Return_Report;
	}
	public WebElement getDisposed_Asset_Report() {
		return Disposed_Asset_Report;
	}
	public WebElement getTickets_Report() {
		return Tickets_Report;
	}
	public WebElement getAsset_Movement_Report() {
		return Asset_Movement_Report;
	}
	public WebElement getVendor_Report() {
		return Vendor_Report;
	}
	public WebElement getAsset_Downtime_Report() {
		return Asset_Downtime_Report;
	}
	public WebElement getInspection_Report() {
		return Inspection_Report;
	}
	public WebElement getDocument_Report() {
		return Document_Report;
	}
	public WebElement getMaintenance_Report() {
		return Maintenance_Report;
	}



	//Business Logic
	public void ClickOn_StockReport()
	{
		StockReport.click();
	}
	public void ClickOn_Inventory_Procurement_Report()
	{
		Inventory_Procurement_Report.click();
	}
	public void ClickOn_Parts_Movement_Report()
	{
		Parts_Movement_Report.click();
	}
	public void ClickOn_Asset_Expense_Report()
	{
		Asset_Expense_Report.click();
	}
	public void ClickOn_Asset_Return_Report()
	{
		Asset_Return_Report.click();
	}
	public void ClickOn_Part_Return_Report()
	{
		Part_Return_Report.click();
	}
	public void ClickOn_Disposed_Asset_Report()
	{
		Disposed_Asset_Report.click();
	}
	public void ClickOn_Tickets_Report()
	{
		Tickets_Report.click();
	}
	public void ClickOn_Asset_Movement_Report()
	{
		Asset_Movement_Report.click();
	}
	public void ClickOn_Vendor_Report()
	{
		Vendor_Report.click();
	}
	public void ClickON_Asset_Downtime_Report()
	{
		Asset_Downtime_Report.click();
	}
	public void ClickOn_Inspection_Report()
	{
		Inspection_Report.click();
	}
	public void CLickOn_Document_Report()
	{
		Document_Report.click();
	}
	public void CLickOn_Maintenance_Report()
	{
		Maintenance_Report.click();
	}
	public void ClickOn_Asset_Vendor_Report()
	{
		Asset_Vendor_Report.click();
	}
	public void ClickOn_Parts_Vendor_Report()
	{
		Parts_Vendor_Report.click();
	}








}
