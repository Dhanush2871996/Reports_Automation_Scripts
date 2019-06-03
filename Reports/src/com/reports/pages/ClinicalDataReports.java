package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class ClinicalDataReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Clinical Data Reports\" ]")
    public
    WebElement clinicalDataReportsDropDown;

    @FindBy(linkText = "Clinical Data Report Favourites")
    public
    WebElement clinicalDataReportFavourites;

    @FindBy(linkText = "Lab Test Results Report Builder")
    public
    WebElement labTestResultsReportBuilder;

    @FindBy(linkText = "Clinical Lab Test Results Report Builder")
    public
    WebElement clinicalLabTestResultsReportBuilder;
    
    @FindBy(linkText = "Diagnosis Codes Report Builder")
    public
    WebElement diagnosisCodesReportBuilder;
    
    @FindBy(linkText = "Procedure Codes Report Builder")
    public
    WebElement procedureCodesReportBuilder;
    
    public ClinicalDataReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	clinicalDataReportsDropDown.click();
    }

    public void clickOnClinicalDataReportsDropDown()
    {
    	clinicalDataReportsDropDown.click();
    }	

    public void clickOnClinicalDataReportFavourites()
    {
    	clinicalDataReportFavourites.click();
    }

    public void clickOnLabTestResultsReportBuilder()
    {
    	labTestResultsReportBuilder.click();
    }
    

    public void clickOnClinicalLabTestResultsReportBuilder()
    {
    	clinicalLabTestResultsReportBuilder.click();
    }
    
    public void clickOnDiagnosisCodesReportBuilder()
    {
    	diagnosisCodesReportBuilder.click();
    }
    
    public void clickOnProcedureCodesReportBuilder()
    {
    	procedureCodesReportBuilder.click();
    }
}
