package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingReports 
{
	//first click on dropdown
	@FindBy(xpath = "//span[text()='Billing Reports']")
	WebElement billingReportsDropdown;
	
	//element for favourite under each module
	@FindBy(linkText = "Billing Report Favourites")
	WebElement billingReportFavourites;
	
	@FindBy(linkText = "Bills Report Builder")
	WebElement billsReportBuilder;
	
	@FindBy(linkText = "Bills Adjustment Report Builder")
	WebElement billsAdjustmentReportBuilder;
	
	@FindBy(linkText = "Bill Charge Report Builder")
	WebElement billChargeReportBuilder; 
	
	@FindBy(linkText = "Bill Charge Adjustment Report Builder")
	WebElement billChargeAdjustmentReportBuilder;
	
	@FindBy(linkText = "Patient Dues Report Builder")
	WebElement patientDuesReportBuilder;
	
	@FindBy(linkText = "Day Book")
	WebElement dayBook;
	
	@FindBy(linkText = "Day Book Builder")
	WebElement dayBookBuilder;
	
	@FindBy(linkText = "Deposits Builder")
	WebElement depositsBuilder;
	
	@FindBy(linkText = "Deposit Receipts Builder")
	WebElement depositReceiptsBuilder;
	
	@FindBy(linkText = "Payment for Insurance")
	public
	WebElement paymentforInsurance;
	
	@FindBy(linkText = "Internal Transfer Revenue Report")
	WebElement internalTransferRevenueReport;
	
	@FindBy(linkText = "Rate Variation Report")
	WebElement rateVariationReport;
	
	@FindBy(linkText = "Bill Status Change Report")
	WebElement billStatusChangeReport;
	
	@FindBy(linkText = "Reward Points Builder")
	WebElement rewardPointsBuilder;
	
	public BillingReports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		billingReportsDropdown.click();
	}
	 
	public void clickOnBillingReportsDropdown()
	{
		billingReportsDropdown.click();
	}
	
	public void clickOnBillingReportFavourites()
	{
		billingReportFavourites.click();
	}
	
	public void clickOnBillsReportBuilder()
	{
		billsReportBuilder.click();
	}
	
	public void clickOnbillsAdjustmentReportBuilder()
	{
		billsAdjustmentReportBuilder.click();
	}
	
	public void clickOnbillChargeReportBuilder()
	{
		 billChargeReportBuilder.click();
	}
	
	public void clickOnBillChargeAdjustmentReportBuilder()
	{
		billChargeAdjustmentReportBuilder.click();
	}
	
	public void clickOnPatientDuesReportBuilder()
	{
		patientDuesReportBuilder.click();
	}
	
	public void clickOnDayBook()
	{
		dayBook.click();
	}
	
	public void clickOnDayBookBuilder()
	{
		dayBookBuilder.click();
	}
	
	public void clickOnDepositsBuilder()
	{
		depositsBuilder.click();
	}
	
	public void clickOnDepositReceiptsBuilder()
	{
		depositReceiptsBuilder.click();
	}
	
	public void clickOnPaymentforInsurance()
	{
		paymentforInsurance.click();
	}
	
	public void clickOnInternalTransferRevenueReport()
	{
		internalTransferRevenueReport.click();
	}
	
	public void clickOnRateVariationReport()
	{
		rateVariationReport.click();
	}

	public void clickOnBillStatusChangeReport()
	{
		billStatusChangeReport.click();
	}

	public void clickOnRewardPointsBuilder()
	{
		rewardPointsBuilder.click();
	}

}
