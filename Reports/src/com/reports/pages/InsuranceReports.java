package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class InsuranceReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Insurance Reports\" ]")
	public
	WebElement insuranceReportsDropDown;
	
	@FindBy(linkText = "Insurance Report Favourites")
	public
	WebElement insuranceReportFavourites;
	
	@FindBy(linkText = "Insurance Claims Report Builder")
	public
	WebElement insuranceClaimsReportBuilder;
	
	@FindBy(linkText = "Insurance Claim Details Report Builder")
	public
	WebElement insuranceClaimDetailsReportBuilder;
	
	@FindBy(linkText = "Insurance Claim Batch Report Builder")
	public
	WebElement insuranceClaimBatchReportBuilder;
	
	public InsuranceReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		insuranceReportsDropDown.click();
	}
	
	
	
	public void clickOnInsuranceReportsDropDown()
	{
		insuranceReportsDropDown.click();
	}
	
	public void clickOnInsuranceReportFavourites()
	{
		insuranceReportFavourites.click();
	}
	
	public void clickOnInsuranceClaimsReportBuilder()
	{
		insuranceClaimsReportBuilder.click();
	}
	
	public void clickOnInsuranceClaimDetailsReportBuilder()
	{
		insuranceClaimDetailsReportBuilder.click();
	}
	
	public void clickOnInsuranceClaimBatchReportBuilder()
	{
		insuranceClaimBatchReportBuilder.click();
	}
	
}
