package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class DentalReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Dental Reports\" ]")
	public
	WebElement dentalReportsDropDown;
	
	@FindBy(linkText = "Dental Treatment Details Report Builder")
	public
	WebElement dentalTreatmentDetailsReportBuilder;
	
	@FindBy(linkText = "Dental Supplies Report Builder")
	public
	WebElement dentalSuppliesReportBuilder;
	
	public DentalReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		dentalReportsDropDown.click();
	}
	
	public void clickOnDentalReportsDropDown()
	{
		dentalReportsDropDown.click();
	}
	
	public void clickOnDentalTreatmentDetailsReportBuilder()
	{
		dentalTreatmentDetailsReportBuilder.click();
	}
	
	public void clickOnDentalSuppliesReportBuilder()
	{
		dentalSuppliesReportBuilder.click();
	}
}
