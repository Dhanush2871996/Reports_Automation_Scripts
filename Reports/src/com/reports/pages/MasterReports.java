package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.reports.generics.BaseTest;

public class MasterReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Master Reports\" ]")
	public
	WebElement masterReportsDropDown;
	
	@FindBy(linkText = "Master Report Favourites")
	public
	WebElement masterReportFavourites;
	
	@FindBy(linkText = "Rate Master Report Builder")
	public
	WebElement rateMasterRportBuilder;
	
	public MasterReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		masterReportsDropDown.click();
	}
	
	public void clickOnMasterReportsDropDown()
	{
		masterReportsDropDown.click();
	}
	
	public void clickOnMasterReportFavourites()
	{
		masterReportFavourites.click();
	}
	
	public void clickOnRateMasterReportBuilder()
	{
		rateMasterRportBuilder.click();
	}
}
