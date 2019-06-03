package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class PatientPackageReports extends BaseTest{

    @FindBy(xpath = "Patient Package Reports")
    public
    WebElement patientPackageReportsDropDown;

    @FindBy(linkText = "Patient Packages")
    public
    WebElement patientPackages;


    public PatientPackageReports(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	patientPackageReportsDropDown.click();
    }




    public void clickOnPatientPackageReportsDropDown()
    {
    	patientPackageReportsDropDown.click();
    }	

    public void clickOnPatientPackages()
    {
    	patientPackages.click();
    }
}
