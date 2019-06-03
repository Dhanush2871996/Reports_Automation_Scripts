package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.reports.generics.BaseTest;

public class WardActivitiesReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Ward Activities Reports\" ]")
	public
	WebElement wardActivitiesReportsDropDown;
	
	
	@FindBy(linkText = "Patient Activities Report Builder")
	public
	WebElement patientActivitiesReportBuilder;
	
	@FindBy(linkText = "Doctor Order Report Builder")
	public
	WebElement doctorOrderReportBuilder;
	
	public WardActivitiesReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wardActivitiesReportsDropDown.click();
	}
	
	public void clickOnWardActivitiesReportsDropDown()
	{
		wardActivitiesReportsDropDown.click();
	}
	
	public void clickOnPatientActivitiesReportBuilder()
	{
		patientActivitiesReportBuilder.click();
	}
	
	public void clickOnDoctorOrderReportBuilder()
	{
		doctorOrderReportBuilder.click();
	}
}
