/*
 * This Page is generalized to non-builder where we have button like "view", "Print" and "help" link.
 * In This we have included all the "WebElements of the Non-Builder pages.
 * But Some WebElement might not be present in some report, but it will be present in atleast one of the report.
 * 
 * Here we have Radio buttons for selecting date range.
 * 
 * BTN = Button
 * (total @FindBy are 37.)
 * */

package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OtherReportBuilderElement 
{
	Select select ;
	
	@FindBy(id = "pd")
	WebElement yesterdayRadioBTN;// yesterday radio button
	
	@FindBy(id = "td")
	WebElement todayRadioBTN;
	
	@FindBy(id = "pm")
	WebElement previousMonthRadioBTN;
	
	@FindBy(id = "tm")
	WebElement thisMonthRadioBTN;
	
	@FindBy(id = "threeMonths")
	WebElement customDateRadioBTN;
	
	@FindBy(id = "fromDate")
	WebElement fromDatefield;
	
	@FindBy(id = "toDate")
	WebElement toDateField;
	
	@FindBy(xpath = "//button[text()=\"View\"]")
	WebElement viewButton;
	
	@FindBy(xpath = "//button[text()=\"Print\"]")
	WebElement printButton;
	
	/*
	@FindBy(linkText = "Help")
	WebElement helpLink;
	
	@FindBy(xpath = "//select [@name='dateField']")//under financial report "consolidated".
	WebElement selectRevenueBy;
	
	@FindBy(xpath = "//select [@name='accountGroup']")
	WebElement selectAccountGroup;
	*/
	
	@FindBy(xpath = "//select[@name = \"printerType\"]")//dropdown (printType) option: pdf, csv, text
	WebElement selectPrintType;
	
	@FindBy(xpath ="//button[@accesskey=\"G\"]")//generate button
	WebElement generateBTN;
	
	/////////////////// Billing Non-Builders start////////////////////////
	@FindBy(xpath = "//select[@onchange=\"disableDate(this);onChangeDateRange(this)\" ]")//Date Range dropdown(billing report)
	WebElement selectDateRange;
	
	@FindBy(id = "ip")   //patient type
	WebElement IPCheckBox;
	
	@FindBy(id = "op")
	WebElement OPCheckBox;
	
	@FindBy(id = "others")
	WebElement othersCheckBox;
	
	@FindBy(id = "counterid")
	WebElement selectCounterName;
	
	@FindBy(id = "counterUserName")
	WebElement selectCounterUserName;
	
	@FindBy(id = "payMode")
	WebElement selectPaymentMode;
	/////////////////// Billing Non-Builders end////////////////////////
	
	////////////////// Patient Stats Reports starts//////////////////////////
	@FindBy(xpath = "//select[@name='groupBy']")// patient stats tabular report
	WebElement selectGroupBy;
	
	@FindBy(xpath = "//select [@name = 'trendPeriod']") //Patient Stats Trend Report
	WebElement selectTrendType;
	
	@FindBy(id ="pfy")
	WebElement previousYearRadioBTN;
	
	@FindBy(id = "tyr")
	WebElement thisYearRadioBTN;
	
	@FindBy(id = "exportButton")
	WebElement exportToCsvBTN;
	////////////////// Patient Stats Reports end///////////////////////////////
	
	///////////////// Sales/Issues Report start////////////////////////////////
	@FindBy(id = "control_type_id")
	WebElement selectControlType; //control type is: AntiBiotic, restricted anti biotic etc
	
	@FindBy(xpath = "//select[@name='store_type_id']")
	WebElement selectStoreType;
	
	@FindBy(xpath = "//select[@name='store_id']")
	WebElement selectStoreName;
	///////////////// Sales/Issues Report start////////////////////////////////
	
	//////////////// Procurement Report start /////////////////////////////////
	@FindBy(xpath = "//select[@name = 'supplier']") //Procurement report
	WebElement selectSupplierName;
	
	@FindBy(xpath = "//select[@name = 'invstatausArray']")
	WebElement selectInvoiceStatus;     //Pharmacy suplier report under procurement report
	
	@FindBy(id = "medName")
	WebElement enterItemName;
	//////////////// Procurement Report end /////////////////////////////////
	
	/////////////// Stock Ledger start //////////////////////////////////////////
	@FindBy(id = "medicineName")
	WebElement stockLedgerItemName;
	
	@FindBy(xpath = "//input[@id='dates']")
	WebElement dateRangeRadioBTN;
	
	@FindBy(xpath = "//input[@onclick=\"return doSearch();\"]")//Stock Ledger
	WebElement searchBTN;
	
	@FindBy(xpath = "//input[@onclick=\"clearSearch();\"]")//Stock Ledger
	WebElement clearBTN;
	
	@FindBy(id = "batchno")
	WebElement enterBatchNo;
	/////////////// Stock Ledger start /////////////////////////////////
	
	@FindBy(xpath = "//select[@name = 'doctorId']") //diagnostic Report (test prescription ordered report)
	WebElement selectDoctorName;
	
	public OtherReportBuilderElement(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnYesterdayRadioBTN()
	{
		yesterdayRadioBTN.click();
	}
	
	public void clickOntodayRadioBTN()
	{
		todayRadioBTN.click();
	}
	
	public void clickOnPreviousMonthRadioBTN()
	{
		previousMonthRadioBTN.click();
	}

	public void clickOnThisMonthRadioBTN()
	{
		thisMonthRadioBTN.click();
	}
	
	public void clickOnCustomDateRadioBTN()
	{
		customDateRadioBTN.click();
	}
	
	public void enterFromAndToDate(String fromDate1, String toDate1)
	{
		fromDatefield.clear();
		fromDatefield.sendKeys(fromDate1);
		
		toDateField.clear();
		toDateField.sendKeys(toDate1);
	}
	
	public void clickOnViewButton()
	{
		viewButton.click();
	}
	
	public void clickOnPrintBTN()
	{
		printButton.click();
	}
	
	/*
	public void clickOnHelpLink()
	{
		helpLink.click();
	}
	
	//under financial reports "Revenue By".
	public void selectRevenueByOption(String option)
	{
		select = new Select (selectRevenueBy);
		select.selectByVisibleText(option);
	}
	
	//under financial reports for Consolidated dashboard "Include Account Groups".
	public void selectAccountGroupOption(String option)
	{
		select = new Select (selectAccountGroup);
		select.selectByVisibleText(option);
	}
	*/
	
	public void clickOnGenerateBTN()
	{
		generateBTN.click();
	}
	
	public void clickOnExportToCsvBTN()
	{
		exportToCsvBTN.click();
	}
	
	/////////////////// Billing Non-Builders start////////////////////////
	public void selectDateRangeOption(String option)
	{
		select = new Select(selectDateRange);
		select.selectByVisibleText(option);
	}
	
	/////////////////// Billing Non-Builders end////////////////////////
	
	public void selectPrintTypeOption(String option)
	{
		select = new Select(selectPrintType);
		select.selectByVisibleText(option);
	}
	
	///////////////// Store Non-Builder start //////////////////////////
	public void selectStoreNameOption(String option)
	{
		select = new Select(selectStoreName);
		select.selectByVisibleText(option);
	}

	public void clickOnDateRangeRadioBTN()
	{
		dateRangeRadioBTN.click();
	}
	public void clickOnSearchBTN()
	{
		searchBTN.click();
	}
	///////////////// Store Non-Builder start //////////////////////////
}
