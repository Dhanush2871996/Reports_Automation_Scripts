package com.reports.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.reports.generics.BaseTest;

public class CustomReports extends BaseTest
{
	Select select;
	Actions action;
	int count = 0;
	//WebDriver driver;
	
	//************** Custom Reports Links end ***********//
	
	@FindBy(xpath = "//span[text()='Custom Reports']")
	WebElement customReportsDropdown;

	@FindBy(linkText = "Report List")
	WebElement reportList;
	
	@FindBy(linkText = "Add Report")
	WebElement addReport;
	
	@FindBy(linkText = "Run")
	WebElement runLink;
	
	@FindBy(linkText = "Delete")
	WebElement deleteLink;
	
	@FindBy(linkText = "Add Custom Report")
	WebElement addCustomReport;
	
	//************* Custom Reports Links end *****************//
	
	//************* All Custom Reports Links for DashBoard starts **********//
	@FindBy(xpath = "//tr[@id='toolbarRow0']")
	WebElement departmentWiseAllocationReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow1']")
	WebElement doctorWisePatientCountReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow2']")
	WebElement billAdjustmentEntriesList;
	
	@FindBy(xpath = "//tr[@id='toolbarRow3']")
	WebElement doctorRevenueDetailedReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow4']")
	WebElement radiologyTATReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow5']")
	WebElement departmentwisePatientCount;
	
	@FindBy(xpath = "//tr[@id='toolbarRow6']")
	WebElement consumableItemsPriceReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow7']")
	WebElement visitStatusReportforHealthAuthority;
	
	@FindBy(xpath = "//tr[@id='toolbarRow8']")
	WebElement submissionRejectionRateReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow9']")
	WebElement sponsorWiseClaimSubmissionList;
	
	@FindBy(xpath = "//tr[@id='toolbarRow10']")
	WebElement medicalCheckupReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow11']")
	WebElement repeatingDiagnosisReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow12']")
	WebElement airmileReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow13']")
	WebElement revenueProgressReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow14']")
	WebElement detailedStockReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow15']")
	WebElement patientReferralReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow16']")
	WebElement cashCreditSplitReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow17']")
	WebElement insuranceClaimBatchReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow18']")
	WebElement stockRejectionReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow19']")
	WebElement bifurcationReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow20']")
	WebElement reconciliationReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow21']")
	WebElement billStatusReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow22']")
	WebElement laboratoryTATReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow23']")
	WebElement insuranceCompanywiseSalesReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow24']")
	WebElement listofPlansReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow25']")
	WebElement denialAcceptanceReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow26']")
	WebElement nationWiseRevenueReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow27']")
	WebElement NationWiseRevenueReportDepartmentWise;	
	
	@FindBy(xpath = "//tr[@id='toolbarRow28']")
	WebElement bedOccupancyReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow29']")
	WebElement DRGVarianceReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow30']")
	WebElement doctorPerformanceReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow31']")
	WebElement therapistReport; 
	
	@FindBy(xpath = "//tr[@id='toolbarRow32']")
	WebElement customerDueReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow33']")
	WebElement remittanceAdviceReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow34']")
	WebElement PACSOrderStatisticsReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow35']")
	WebElement resubmissionReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow36']")
	WebElement totalSalesReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow37']")
	WebElement dischargeStatusReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow38']")
	WebElement stockStatusReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow39']")
	WebElement powerscribeReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow40']")
	WebElement advanceAndRefundReceipts;
	
	@FindBy(xpath = "//tr[@id='toolbarRow41']")
	WebElement depositAndRefundReceipt;
	
	@FindBy(xpath = "//tr[@id='toolbarRow42']")
	WebElement patientDueReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow43']")
	WebElement appointmentTATReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow44']")
	WebElement priorAuthReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow45']")
	WebElement radiologyAlertCategoryReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow46']")
	WebElement collectionLogReport;
	
	@FindBy(xpath = "//tr[@id='toolbarRow47']")
	WebElement newAppointmentTATReport;

	//************* All Custom Reports Links for DashBoard ends **********//

	public CustomReports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnCustomReportsDropdown()
	{
		System.out.println("drop down :"+customReportsDropdown.isDisplayed());
		customReportsDropdown.click();
	}
	
	//************* Custom Reports Links start *****************//
	public void clickOnReportListLink()
	{
		reportList.click();
	}
	
	public void clickOnRunLink()
	{
		runLink.click();
	}
	
	//************* Custom Reports Links end *****************//
	
	public void performAction(WebDriver driver0, WebElement element)
	{
		count = count+1;
		Actions action = new Actions(driver0);
		action.doubleClick(element).perform();
		System.out.println("count : "+count);
	}

	//************* All Custom Reports Links for DashBoard starts **********//
	public void clickOnDepartmentWiseAllocationReport(WebDriver driver1)
	{
		performAction(driver1,departmentWiseAllocationReport);
	}
	
	public void clickOnDoctorWisePatientCountReport(WebDriver driver2)
	{
		performAction(driver2, doctorWisePatientCountReport);
	}
	
	public void clickOnBillAdjustmentEntriesList(WebDriver driver3)
	{
		performAction(driver3, billAdjustmentEntriesList);
	}
	
	public void clickOnDoctorRevenueDetailedReport(WebDriver driver4)
	{
		performAction(driver4, doctorRevenueDetailedReport);
	}
	
	public void clickOnRadiologyTATReport(WebDriver driver5)
	{
		performAction(driver5, radiologyTATReport);
	}
	
	public void clickOnDepartmentwisePatientCount(WebDriver driver6)
	{
		performAction(driver6, departmentwisePatientCount);
	}
	
	public void clickOnConsumableItemsPriceReport(WebDriver driver7)
	{
		performAction(driver7, consumableItemsPriceReport);
	}
	
	public void clickOnVisitStatusReportforHealthAuthority(WebDriver driver8)
	{
		performAction(driver8, visitStatusReportforHealthAuthority);
	}
	
	public void clickOnSubmissionRejectionRateReport(WebDriver driver9)
	{
		performAction(driver9, submissionRejectionRateReport);
	}
	
	public void clickOnSponsorWiseClaimSubmissionList(WebDriver driver10)
	{
		performAction(driver10, sponsorWiseClaimSubmissionList);
	}
	
	public void clickOnMedicalCheckupReport(WebDriver driver11)
	{
		performAction(driver11, medicalCheckupReport);
	}
	
	public void clickOnRepeatingDiagnosisReport(WebDriver driver12)
	{
		performAction(driver12, repeatingDiagnosisReport);
	}
	
	public void clickOnAirmileReport(WebDriver driver13)
	{
		performAction(driver13, airmileReport);
	}
	
	public void clickOnRevenueProgressReport(WebDriver driver14)
	{
		performAction(driver14, revenueProgressReport);
	}
	
	public void clickOnDetailedStockReport(WebDriver driver15)
	{
		performAction(driver15, detailedStockReport);
	}
	
	public void clickOnPatientReferralReport(WebDriver driver16)
	{
		performAction(driver16, patientReferralReport);
	}
	
	public void clickOnCashCreditSplitReport(WebDriver driver17)
	{
		performAction(driver17, cashCreditSplitReport);
	}
	
	public void clickOnInsuranceClaimBatchReport(WebDriver driver18)
	{
		performAction(driver18, insuranceClaimBatchReport);
	}
	
	public void clickOnStockRejectionReport(WebDriver driver19)
	{
		performAction(driver19, stockRejectionReport);
	}
	
	public void clickOnBifurcationReport(WebDriver driver20)
	{
		performAction(driver20, bifurcationReport);
	}
	
	public void clickOnReconciliationReport(WebDriver driver21)
	{
		performAction(driver21, reconciliationReport);
	}
	
	public void clickOnBillStatusReport(WebDriver driver22)
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		performAction(driver22, billStatusReport);
	}
	
	public void clickOnLaboratoryTATReport(WebDriver driver23)
	{
		performAction(driver23, laboratoryTATReport);
	}
	
	public void clickOnInsuranceCompanywiseSalesReport(WebDriver driver24)
	{
		performAction(driver24, insuranceCompanywiseSalesReport);
	}
	
	public void clickOnListofPlansReport(WebDriver driver25)
	{
		performAction(driver25, listofPlansReport);
	}
	
	public void clickOnDenialAcceptanceReport(WebDriver driver26)
	{
		performAction(driver26, denialAcceptanceReport);
	}
	
	public void clickOnNationWiseRevenueReport(WebDriver driver27)
	{
		performAction(driver27, nationWiseRevenueReport);
	}
	
	public void clickOnNationWiseRevenueReportDepartmentWise(WebDriver driver28)
	{
		performAction(driver28, NationWiseRevenueReportDepartmentWise);
	}
	
	public void clickOnBedOccupancyReport(WebDriver driver29)
	{
		performAction(driver29, bedOccupancyReport);
	}
	
	public void clickOnDRGVarianceReport(WebDriver driver30)
	{
		performAction(driver30, DRGVarianceReport);
	}
	
	public void clickOnDoctorPerformanceReport(WebDriver driver31)
	{
		performAction(driver31, doctorPerformanceReport);
	}
	
	public void clickOnTherapistReport(WebDriver driver32)
	{
		performAction(driver32, therapistReport);
	}
	
	public void clickOnCustomerDueReport(WebDriver driver33)
	{
		performAction(driver33, customerDueReport);
	}
	
	public void clickOnRemittanceAdviceReport(WebDriver driver34)
	{
		performAction(driver34, remittanceAdviceReport);
	}
	
	public void clickOnPACSOrderStatisticsReport(WebDriver driver35)
	{
		performAction(driver35, PACSOrderStatisticsReport);
	}
	
	public void clickOnResubmissionReport(WebDriver driver36)
	{
		performAction(driver36, resubmissionReport);
	}
	
	public void clickOnTotalSalesReport(WebDriver driver37)
	{
		((JavascriptExecutor)driver).executeScript("scroll(400,1000)");
		performAction(driver37, totalSalesReport);
	}
	
	public void clickOnDischargeStatusReport(WebDriver driver38)
	{
		performAction(driver38, dischargeStatusReport);
	}
	
	public void clickOnStockStatusReport(WebDriver driver39)
	{
		performAction(driver39, stockStatusReport);
	}
	
	public void clickonPowerscribeReport(WebDriver driver40)
	{
		performAction(driver40, powerscribeReport);
	}
	
	public void clickonAdvanceAndRefundReceipts(WebDriver driver41)
	{
		performAction(driver41, advanceAndRefundReceipts);
	}
	
	public void clickonDepositAndRefundReceipt(WebDriver driver42)
	{
		performAction(driver42, depositAndRefundReceipt);
	}
	
	public void clickonPatientDueReport(WebDriver driver43)
	{
		performAction(driver43, patientDueReport);
	}
	
	public void clickonAppointmentTATReport(WebDriver driver44)
	{
		performAction(driver44, appointmentTATReport);
	}
	
	public void clickonPriorAuthReport(WebDriver driver45)
	{
		performAction(driver45, priorAuthReport);
	}
	
	public void clickonRadiologyAlertCategoryReport(WebDriver driver46)
	{
		performAction(driver46,radiologyAlertCategoryReport);
	}
	
	public void clickonCollectionLogReport(WebDriver driver47)
	{
		performAction(driver47, collectionLogReport);
	}
	
	public void clickonNewAppointmentTATReport(WebDriver driver48)
	{
		performAction(driver48, newAppointmentTATReport);
	}
	//************* All Custom Reports Links for DashBoard ends **********//
	
	
	//method to scroll down the page.
	public void scroll(WebElement element)
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("argument[0].scrollIntoView;", element);
		
	}
}
	
