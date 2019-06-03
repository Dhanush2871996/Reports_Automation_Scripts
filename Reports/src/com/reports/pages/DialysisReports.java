package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class DialysisReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Dialysis Reports\" ]")
    public
    WebElement dialysisReportsDropDown;

    @FindBy(linkText = "Dialysis Session Report Favourites")
    public
    WebElement dialysisSessionReportFavourites;

    @FindBy(linkText = "Dialysis Session Report Builder")
    public
    WebElement dialysisSessionReportBuilder;


    @FindBy(linkText = "Dialysis Frequency Report Builder")
    public
    WebElement dialysisFrequencyReportBuilder;
    
    @FindBy(linkText = "Clinical Outcomes Report")
    public
    WebElement clinicalOutcomesReport;
    
    @FindBy(linkText = "Intra Dialysis Parameters Report Builder")
    public
    WebElement intraDialysisParametersReportBuilder;


    public DialysisReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	dialysisReportsDropDown.click();
    }




    public void clickOnDialysisReportsDropDown()
    {
    	dialysisReportsDropDown.click();
    }	

    public void clickOnDialysisSessionReportFavourites()
    {
    	dialysisSessionReportFavourites.click();
    }

    public void clickOnDialysisSessionReportBuilder()
    {
    	dialysisSessionReportBuilder.click();
    }

    public void clickOnDialysisFrequencyReportBuilder()
    {
    	dialysisFrequencyReportBuilder.click();
    }
    
    public void clickOnClinicalOutcomesReport()
    {
    	clinicalOutcomesReport.click();
    }
    
    public void clickOnIntraDialysisParametersReportBuilder()
    {
    	intraDialysisParametersReportBuilder.click();
    }
}
