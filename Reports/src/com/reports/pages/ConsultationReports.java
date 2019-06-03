package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class ConsultationReports extends BaseTest
{
	
	@FindBy(xpath = "//span[text()=\"Consultation Reports\"]")
	public
	WebElement consultationReportsDropdown;
	
	@FindBy(linkText = "Consultation Report Favourites")
	public
	WebElement consultationReportFavourites;
	
	@FindBy(linkText = "Doctor Consultation Report Builder")
	public
	WebElement doctorConsultationReportBuilder;
	
	@FindBy(linkText = "Prescribing Order Details Report Builder")
	public
	WebElement prescribingOrderDetailsReportBuilder;
	
	public ConsultationReports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		consultationReportsDropdown.click();
	}

	public void clickOnConsultationReportsDropdown()
	{
		 consultationReportsDropdown.click();
	}
	
	public void clickOnConsultationReportFavourites()
	{
		consultationReportFavourites.click();
	}
	
	public void clickOnDoctorConsultationReportBuilder()
	{
		doctorConsultationReportBuilder.click();
	}
	
	public void clickOnPrescribingOrderDetailsReportBuilder()
	{
		prescribingOrderDetailsReportBuilder.click();
	}

}
