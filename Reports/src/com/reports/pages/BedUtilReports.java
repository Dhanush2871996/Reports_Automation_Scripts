package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class BedUtilReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Bed Util Reports\" ]")
    public
    WebElement bedUtilReportsDropDown;

    @FindBy(linkText = "Bed Util Report Favourites")
    public
    WebElement bedUtilReportFavourites;

    @FindBy(linkText = "Current Bed Occupancy Report Builder")
    public
    WebElement currentBedOccupancyReportBuilder;
    
    @FindBy(linkText = "Detailed Bed Occupancy Report Builder")
    public
    WebElement detailedBedOccupancyReportBuilder;
    
    @FindBy(linkText = "Patient Bed Occupancy Report Builder")
    public
    WebElement patientBedOccupancyReportBuilder;
    
    @FindBy(linkText = "Bed Utilization Report")
    public
    WebElement bedUtilizationReport;
    
    @FindBy(linkText = "Luxury Tax Report Builder")
    public
    WebElement luxuryTaxReportBuilder;

    public BedUtilReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	bedUtilReportsDropDown.click();
    }

    public void clickOnBedUtilReportsDropDown()
    {
    	bedUtilReportsDropDown.click();
    }	

    public void clickOnBedUtilReportFavourites()
    {
    	bedUtilReportFavourites.click();
    }

    public void clickOnCurrentBedOccupancyReportBuilder()
    {
    	currentBedOccupancyReportBuilder.click();
    }
	
    
    public void clickOnDetailedBedOccupancyReportBuilder()
    {
    	detailedBedOccupancyReportBuilder.click();
    }
    
    public void clickOnPatientBedOccupancyReportBuilder()
    {
    	patientBedOccupancyReportBuilder.click();
    }
    
    public void clickOnBedUtilizationReport()
    {
    	bedUtilizationReport.click();
    }
    
    public void clickOnLuxuryTaxReportBuilder()
    {
    	luxuryTaxReportBuilder.click();
    }
}
