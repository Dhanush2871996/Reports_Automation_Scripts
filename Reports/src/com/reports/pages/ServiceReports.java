package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class ServiceReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Service Reports\" ]")
    public
    WebElement serviceReportsDropDown;

    @FindBy(linkText = "Service Report Favourites")
    public
    WebElement serviceReportFavourites;

    @FindBy(linkText = "Services Report Builder")
    public
    WebElement servicesReportBuilder;
    
    @FindBy(linkText = "Services Prescription Ordered Report")
    public
    WebElement servicesPrescriptionOrderedReport;

    public ServiceReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	serviceReportsDropDown.click();
    }

    public void clickOnServiceReportsDropDown()
    {
    	serviceReportsDropDown.click();
    }	

    public void clickOnServiceReportFavourites()
    {
    	serviceReportFavourites.click();
    }

    public void clickOnServicesReportBuilder()
    {
    	servicesReportBuilder.click();
    }

    public void clickOnServicesPrescriptionOrderedReport()
    {
    	servicesPrescriptionOrderedReport.click();
    }

}
