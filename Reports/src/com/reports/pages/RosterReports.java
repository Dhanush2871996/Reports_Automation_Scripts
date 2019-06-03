package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class RosterReports extends BaseTest
{
	@FindBy(xpath = "//span[text()=\"Roster Reports\"]")
	public
	WebElement rosterReportsDropdown;
	
	@FindBy(linkText = "Duty Roster Report Builder")
	public
	WebElement dutyRosterReportBuilder;
	
	public RosterReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		rosterReportsDropdown.click();
	}
	
	
	public void clickOnRosterReportsDropdown()
	{
		rosterReportsDropdown.click();
	}
	
	public void clickOnDutyRosterReportBuilder ()
	{
		dutyRosterReportBuilder.click();
	}

}
