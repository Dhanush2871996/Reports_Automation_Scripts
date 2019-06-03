package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class SchedulerReports extends BaseTest
{
	@FindBy(xpath = "//span[text()=\"Scheduler Reports\"]")
	public
	WebElement schedulerReportsDropdown;
	
	@FindBy(linkText = "Scheduled Appointment Report Favourites")
	public
	WebElement scheduledAppointmentReportFavourites;
	
	@FindBy(linkText = "Doctor Appointments Report Builder")
	public
	WebElement doctorAppointmentsReportBuilder;
	
	@FindBy(linkText = "Tests Scheduled Report Builder")
	public
	WebElement testsScheduledReportBuilder;
	
	@FindBy(linkText = "Services Scheduled Report Builder")
	public
	WebElement servicesScheduledReportBuilder;
	
	@FindBy(linkText = "Surgery Appointments Report Builder")
	public
	WebElement surgeryAppointmentsReportBuilder;
	
	@FindBy(linkText = "Consolidated Appointments Report")
	public
	WebElement consolidatedAppointmentsReport;
	
	public SchedulerReports(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
		schedulerReportsDropdown.click();
	}
	
	public void clickOnSchedulerReportsDropdown()
	{
		schedulerReportsDropdown.click();
	}
	
	public void clickOnScheduledAppointmentReportFavourites()
	{
		scheduledAppointmentReportFavourites.click();
	}
	
	public void clickOnDoctorAppointmentsReportBuilder()
	{
		doctorAppointmentsReportBuilder.click();
	}
	
	public void clickOnTestsScheduledReportBuilder()
	{
		testsScheduledReportBuilder.click();
	}
	
	public void clickOnServicesScheduledReportBuilder()
	{
		servicesScheduledReportBuilder.click();
	}
	
	public void clickOnSurgeryAppointmentsReportBuilder()
	{
		surgeryAppointmentsReportBuilder.click();
	}
	
	public void clickOnConsolidatedAppointmentsReport()
	{
		consolidatedAppointmentsReport.click();
	}

}