package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class DiagnosticsReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Diagnostics Reports\" ]")
    public
    WebElement diagnosticsReportsDropDown;

    @FindBy(linkText = "Diagnostics Report Favourites")
    public
    WebElement diagnosticsReportFavourites;

    @FindBy(linkText = "Diagnostics Report Builder")
    public
    WebElement diagnosticsReportBuilder;


    @FindBy(linkText = "Diagnostics Revenue Report Builder")
    public
    WebElement diagnosticsRevenueReportBuilder;
    
    @FindBy(linkText = "In Coming Test Details-Hospital wise")
    public
    WebElement inComingTestDetails_Hospitalwise;
    
    @FindBy(linkText = "Out Going Test Details-Hospital wise")
    public
    WebElement outGoingTestDetails_Hospitalwise;
    
    @FindBy(linkText = "Diagnostic Progressive Report")
    public
    WebElement diagnosticProgressiveReport;
    
    @FindBy(linkText = "Tests Prescription Ordered Report")
    public
    WebElement testsPrescriptionOrderedReport;
    
    @FindBy(linkText = "Equipment Test Report Builder")
    public
    WebElement equipmentTestReportBuilder;
    
    @FindBy(linkText = "Sample Rejections Report Builder")
    public
    WebElement sampleRejectionsReportBuilder;
    
    @FindBy(linkText = "Diag Internal Lab Report Builder")
    public
    WebElement diagInternalLabReportBuilder;

    public DiagnosticsReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	diagnosticsReportsDropDown.click();
    }




    public void clickOnDiagnosticsReportsDropDown()
    {
    	diagnosticsReportsDropDown.click();
    }	

    public void clickOnDiagnosticsReportFavourites()
    {
    	diagnosticsReportsDropDown.click();
    }

    public void clickOnDiagnosticsReportBuilder()
    {
    	diagnosticsReportFavourites.click();
    }

    public void clickOnDiagnosticsRevenueReportBuilder()
    {
    	diagnosticsReportBuilder.click();
    }
    
    public void clickOnInComingTestDetails_Hospitalwise()
    {
    	diagnosticsRevenueReportBuilder.click();
    }
    
    public void clickOnOutGoingTestDetails_Hospitalwise()
    {
    	inComingTestDetails_Hospitalwise.click();
    }
    
    public void clickOnDiagnosticProgressiveReport()
    {
    	outGoingTestDetails_Hospitalwise.click();
    }
    
    public void clickOnTestsPrescriptionOrderedReport()
    {
    	testsPrescriptionOrderedReport.click();
    }
    
    public void clickOnEquipmentTestReportBuilder()
    {
    	equipmentTestReportBuilder.click();
    }
    
    public void clickOnSampleRejectionsReportBuilder()
    {
    	sampleRejectionsReportBuilder.click();
    }
    
    public void clickOnDiagInternalLabReportBuilder()
    {
    	diagInternalLabReportBuilder.click();
    }
}
