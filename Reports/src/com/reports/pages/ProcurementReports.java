package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class ProcurementReports extends BaseTest
{
	@FindBy(xpath = "//span[text()=\"Procurement Reports\"]")
	public
	WebElement procurementReportsDropdown;
	
	@FindBy(linkText = "Procurement Report Favourites")
	public
	WebElement procurementReportFavourites;
	
	@FindBy(linkText = "Purchase Invoices Builder")
	public
	WebElement purchaseInvoicesBuilder;
	
	@FindBy(linkText = "Purchase Items Builder")
	public
	WebElement purchaseItemsBuilder;
	
	@FindBy(linkText = "Purchase Invoice Tax Report")
	public
	WebElement purchaseInvoiceTaxReport;
	
	@FindBy(linkText = "Purchase Items Tax Report")
	public
	WebElement purchaseItemsTaxReport;
	
	@FindBy(linkText = "Purchase Tax Report-Abated MRP")
	public
	WebElement purchaseTaxReport_AbatedMRP;
	
	@FindBy(linkText = "Supplier Returns Builder")
	public
	WebElement supplierReturnsBuilder;
	
	@FindBy(linkText = "Pending Replacement")
	public
	WebElement pendingReplacement;
	
	@FindBy(linkText = "Supplier Payments Report")
	public
	WebElement supplierPaymentsReport;
	
	@FindBy(linkText = "Bonus Items Report")
	public
	WebElement bonusItemsReport;
	
	@FindBy(linkText = "PO - Items Builder")
	public
	WebElement PO_ItemsBuilder;
	
	@FindBy(linkText = "PO-Pending Items Builder")
	public
	WebElement PO_PendingItemsBuilder;
	
	@FindBy(linkText = "Purchase Order Builder")
	public
	WebElement purchaseOrderBuilder;
	
	@FindBy(linkText = "Purchase Summary Report")
	public
	WebElement purchaseSummaryReport;
	
	@FindBy(linkText = "Purchase Details Report")
	public
	WebElement purchaseDetailsReport;
	
	
	public ProcurementReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		procurementReportsDropdown.click();
	}
	
	public void clickOnProcurementReportsDropdown()
	{
		procurementReportsDropdown.click();
	}
	
	public void clickOnProcurementReportFavourites()
	{
		procurementReportFavourites.click();
	}
	
	public void clickOnPurchaseInvoicesBuilder()
	{
		purchaseInvoicesBuilder.click();
	}
	
	public void clickOnPurchaseItemsBuilder()
	{
		purchaseItemsBuilder.click();
	}
	
	public void clickOnPurchaseInvoiceTaxReport()
	{
		purchaseInvoiceTaxReport.click();
	}
	
	public void clickOnPurchaseItemsTaxReport()
	{
		purchaseItemsTaxReport.click();
	}
	
	public void clickOnPurchaseTaxReport_AbatedMRP()
	{
		purchaseTaxReport_AbatedMRP.click();
	}
	
	public void clickOnSupplierReturnsBuilder()
	{
		supplierReturnsBuilder.click();
	}
	
	public void clickOnPendingReplacement()
	{
		pendingReplacement.click();
	}
	
	public void clickOnSupplierPaymentsReport()
	{
		supplierPaymentsReport.click();
	}
	
	public void clickOnBonusItemsReport()
	{
		bonusItemsReport.click();
	}
	
	public void clickOnPO_ItemsBuilder()
	{
		PO_ItemsBuilder.click();
	}
	
	public void clickOnPO_PendingItemsBuilder()
	{
		PO_PendingItemsBuilder.click();
	}
	
	public void clickOnPurchaseOrderBuilder()
	{
		purchaseOrderBuilder.click();
	}
	
	public void clickOnPurchaseSummaryReport()
	{
		purchaseSummaryReport.click();
	}
	
	public void clickOnpurchaseDetailsReport()
	{
		purchaseDetailsReport.click();
	}
}
