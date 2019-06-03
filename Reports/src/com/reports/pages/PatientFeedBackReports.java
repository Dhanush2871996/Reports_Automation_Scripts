package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class PatientFeedBackReports extends BaseTest
{
	
	@FindBy(xpath = "//span[text()=\"Patient Feedback Reports\"]")
	public
	WebElement patientFeedbackReportsDropdown;
	
	@FindBy(linkText = "Patient Survey Response Details Report Builder")
	public
	WebElement patientSurveyResponseDetailsReportBuilder;
	
	public PatientFeedBackReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		patientFeedbackReportsDropdown.click();
	}
	
	public void clickOnPatientFeedbackReportsDropdown()
	{
		patientFeedbackReportsDropdown.click();
	}
	
	public void clickOnPatientSurveyResponseDetailsReportBuilder()
	{
		patientSurveyResponseDetailsReportBuilder.click();
	}
}