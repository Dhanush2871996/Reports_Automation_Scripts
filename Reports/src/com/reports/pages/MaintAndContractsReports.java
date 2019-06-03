package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class MaintAndContractsReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Maint. & Contracts Reports\" ]")
	public
	WebElement maintAndContractsReportsDropDown;
	
	@FindBy(linkText = "Maintenance Schedule Report Builder")
	public
	WebElement maintenanceScheduleReportBuilder;
	
	@FindBy(linkText = "Maintenance Activity Report Builder")
	public
	WebElement maintenanceActivityReportBuilder;
	
	@FindBy(linkText = "Complaints Report Builder")
	public
	WebElement complaintsReportBuilder;
	
	@FindBy(linkText = "Contract Report Builder")
	public
	WebElement contractReportBuilder;
	
	@FindBy(linkText = "License Report Builder")
	public
	WebElement licenseReportBuilder;
	
	public MaintAndContractsReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		maintAndContractsReportsDropDown.click();
	}
	
	public void clickOnMaintAndContractsReportsDropDown()
	{
		maintAndContractsReportsDropDown.click();
	}
	
	public void clickOnMaintenanceScheduleReportBuilder()
	{
		maintenanceScheduleReportBuilder.click();
	}
	
	public void clickOnMaintenanceActivityReportBuilder()
	{
		maintenanceActivityReportBuilder.click();
	}
	
	public void clickOnComplaintsReportBuilder()
	{
		complaintsReportBuilder.click();
	}
	
	public void clickOnContractReportBuilder()
	{
		contractReportBuilder.click();
	}
	
	public void clickOnLicenseReportBuilder()
	{
		licenseReportBuilder.click();
	}
}
