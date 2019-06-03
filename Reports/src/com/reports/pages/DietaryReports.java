package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class DietaryReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Dietary Reports\" ]")
	WebElement dietaryReportsDropDown;
	
	@FindBy(linkText = "Dietary Report Favourites")
	WebElement dietaryReportFavourites;
	
	@FindBy(linkText = "To Be Delivered Meals Report")
	WebElement toBeDeliveredMealsReport;
	
	public DietaryReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDietaryReportsDropDown()
	{
		dietaryReportsDropDown.click();
	}
	
	public void clickOnDietaryReportFavourites()
	{
		dietaryReportFavourites.click();
	}
	
	public void clickOnToBeDeliveredMealsReport()
	{
		toBeDeliveredMealsReport.click();
	}
	
}
