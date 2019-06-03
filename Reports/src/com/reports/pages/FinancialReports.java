package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class FinancialReports extends BaseTest{

    @FindBy(xpath = "//span[text()=\"Financial Reports\"]")
    WebElement financialReportsDropDown;
    
    @FindBy(linkText = "Revenue Report Builder")
    WebElement revenueReportBuilder;
    
    @FindBy(linkText = "Revenue Accrual Report Builder")
    WebElement revenueAccrualReportBuilder;
    
    @FindBy(linkText = "Collections Report Builder")
    WebElement collectionsReportBuilder;
    
    @FindBy(linkText = "Collection Allocation Builder")
    WebElement collectionAllocationBuilder;
    
    @FindBy(linkText = "Payment Details Report Builder")
    WebElement paymentDetailsReportBuilder;
    
    @FindBy(linkText = "Payments Paid Report Builder")
    WebElement paymentsPaidReportBuilder;
    
    @FindBy(linkText = "Payments Consolidated Report Builder")
    WebElement paymentsConsolidatedReportBuilder;
    
    @FindBy(linkText = "Doctor wise Revenue Report Builder")
    WebElement doctorwiseRevenueReportBuilder;
    
	
    public FinancialReports(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
    	financialReportsDropDown.click();
    }
    
    public void clickOnRevenueReportBuilder() 
    {
    	revenueReportBuilder.click();
    }
    
    
    public void clickOnFinancialReportsDropDown() 
    {
    	financialReportsDropDown.click();
	}
    
    public void clickOnRevenueAccrualReportBuilder() 
    {
    	revenueAccrualReportBuilder.click();
    }
    public void clickOnCollectionsReportBuilder()
    {
    	collectionsReportBuilder.click();
    }
    
    public void clickOnCollectionAllocationBuilder()
    {
    	collectionAllocationBuilder.click();
    }
    
    public void clickOnPaymentDetailsReportBuilder()
    {
    	paymentDetailsReportBuilder.click();
    }
    
    public void clickOnPaymentsPaidReportBuilder()
    {
    	paymentsPaidReportBuilder.click();
    }
    
    public void clickOnPaymentsConsolidatedReportBuilder()
    {
    	paymentsConsolidatedReportBuilder.click();
    }
    
    public void clickOnDoctorwiseRevenueReportBuilder()
    {
    	doctorwiseRevenueReportBuilder.click();
    }
}
