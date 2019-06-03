package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class OTReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"OT Reports\" ]")
    public
    WebElement oTReportsDropDown;

    @FindBy(linkText = "OT Report Favourites")
    public
    WebElement oTReportFavourites;

    @FindBy(linkText = "OT Schedule Report Builder")
    public
    WebElement oTScheduleReportBuilder;

    public OTReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	oTReportsDropDown.click();
    }

    public void clickOnOTReportsDropDown()
    {
    	oTReportsDropDown.click();
    }	

    public void clickOnOTReportFavourites()
    {
    	oTReportFavourites.click();
    }

    public void clickOnOTScheduleReportBuilder()
    {
    	oTScheduleReportBuilder.click();
    }

}
