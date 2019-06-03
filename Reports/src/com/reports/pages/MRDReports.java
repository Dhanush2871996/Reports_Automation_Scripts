package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class MRDReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"MRD Reports\" ]")
	public
	WebElement mRDReportsDropDown;
	
	@FindBy(linkText = "MRD Report Favourites")
	public
	WebElement mRDReportFavourites;
	
	@FindBy(linkText = "Case File Report Builder")
	public
	WebElement caseFileReportBuilder;
	
	public MRDReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		mRDReportsDropDown.click();
	}
	
	public void clickOnMRDReportsDropDown()
	{
		mRDReportsDropDown.click();
	}
	
	public void clickOnMRDReportFavourites()
	{
		mRDReportFavourites.click();
	}
	
	public void clickOnCaseFileReportBuilder()
	{
		caseFileReportBuilder.click();
	}
	
}
