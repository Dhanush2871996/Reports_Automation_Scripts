package com.reports.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class CustomReportsRunByUser extends BaseTest
{
	//First log as particular user and then test the custom reports.

	
	//************* All Custom Reports Links for DashBoard starts **********//
		@FindBy(xpath = "//tr[@id='toolbarRow0']/td[4]/a")
		WebElement departmentWiseAllocationReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow1']/td[4]/a")
		WebElement doctorWisePatientCountReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow2']/td[4]/a")
		WebElement billAdjustmentEntriesList;
		
		@FindBy(xpath = "//tr[@id='toolbarRow3']/td[4]/a")
		WebElement doctorRevenueDetailedReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow4']/td[4]/a")
		WebElement radiologyTATReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow5']/td[4]/a")
		WebElement departmentwisePatientCount;
		
		@FindBy(xpath = "//tr[@id='toolbarRow6']/td[4]/a")
		WebElement consumableItemsPriceReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow7']/td[4]/a")
		WebElement visitStatusReportforHealthAuthority;
		
		@FindBy(xpath = "//tr[@id='toolbarRow8']/td[4]/a")
		WebElement submissionRejectionRateReporty;
		
		@FindBy(xpath = "//tr[@id='toolbarRow9']/td[4]/a")
		WebElement sponsorWiseClaimSubmissionList;
		
		@FindBy(xpath = "//tr[@id='toolbarRow10']/td[4]/a")
		WebElement medicalCheckupReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow11']/td[4]/a")
		WebElement repeatingDiagnosisReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow12']/td[4]/a")
		WebElement airmileReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow13']/td[4]/a")
		WebElement revenueProgressReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow14']/td[4]/a")
		WebElement detailedStockReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow15']/td[4]/a")
		WebElement patientReferralReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow16']/td[4]/a")
		WebElement cashCreditSplitReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow17']/td[4]/a")
		WebElement insuranceClaimBatchReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow18']/td[4]/a")
		WebElement stockRejectionReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow19']/td[4]/a")
		WebElement bifurcationReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow20']/td[4]/a")
		WebElement reconciliationReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow21']/td[4]/a")
		WebElement billStatusReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow22']/td[4]/a")
		WebElement laboratoryTATReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow23']/td[4]/a")
		WebElement insuranceCompanywiseSalesReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow24']/td[4]/a")
		WebElement listofPlansReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow25']/td[4]/a")
		WebElement denialAcceptanceReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow26']/td[4]/a")
		WebElement nationWiseRevenueReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow27']/td[4]/a")
		WebElement NationWiseRevenueReportDepartmentWise;	
		
		@FindBy(xpath = "//tr[@id='toolbarRow28']/td[4]/a")
		WebElement bedOccupancyReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow29']/td[4]/a")
		WebElement DRGVarianceReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow30']/td[4]/a")
		WebElement doctorPerformanceReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow31']/td[4]/a")
		WebElement therapistReport; 
		
		@FindBy(xpath = "//tr[@id='toolbarRow32']/td[4]/a")
		WebElement customerDueReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow33']/td[4]/a")
		WebElement remittanceAdviceReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow34']/td[4]/a")
		WebElement PACSOrderStatisticsReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow35']/td[4]/a")
		WebElement resubmissionReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow36']/td[4]/a")
		WebElement totalSalesReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow37']/td[4]/a")
		WebElement dischargeStatusReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow38']/td[4]/a")
		WebElement stockStatusReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow39']/td[4]/a")
		WebElement powerscribeReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow40']/td[4]/a")
		WebElement advanceAndRefundReceipts;
		
		@FindBy(xpath = "//tr[@id='toolbarRow41']/td[4]/a")
		WebElement depositAndRefundReceipt;
		
		@FindBy(xpath = "//tr[@id='toolbarRow42']/td[4]/a")
		WebElement patientDueReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow43']/td[4]/a")
		WebElement appointmentTATReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow44']/td[4]/a")
		WebElement priorAuthReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow45']/td[4]/a")
		WebElement radiologyAlertCategoryReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow46']/td[4]/a")
		WebElement collectionLogReport;
		
		@FindBy(xpath = "//tr[@id='toolbarRow47']/td[4]/a")
		WebElement newAppointmentTATreport;
		
		//************* All Custom Reports Links for DashBoard ends **********//
		
		public CustomReportsRunByUser(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//************* All Custom Reports Links for DashBoard starts **********//
		public void clickOnDepartmentWiseAllocationReport()
		{
			departmentWiseAllocationReport.click();
		}
		
		public void clickOnDoctorWisePatientCountReport()
		{
			doctorWisePatientCountReport.click();
		}
		
		public void clickOnBillAdjustmentEntriesList()
		{
			billAdjustmentEntriesList.click();
		}
		
		public void clickOnDoctorRevenueDetailedReport()
		{
			doctorRevenueDetailedReport.click();
		}
		
		public void clickOnRadiologyTATReport()
		{
			radiologyTATReport.click();
		}
		
		public void clickOnDepartmentwisePatientCount()
		{
			departmentwisePatientCount.click();
		}
		
		public void clickOnConsumableItemsPriceReport()
		{
			consumableItemsPriceReport.click();
		}
		
		public void clickOnVisitStatusReportforHealthAuthority()
		{
			visitStatusReportforHealthAuthority.click();
		}
		
		public void clickOnSubmissionRejectionRateReporty()
		{
			submissionRejectionRateReporty.click();
		}
		
		public void clickOnSponsorWiseClaimSubmissionList()
		{
			sponsorWiseClaimSubmissionList.click();
		}
		
		public void clickOnMedicalCheckupReport()
		{
			medicalCheckupReport.click();
		}
		
		public void clickOnRepeatingDiagnosisReport()
		{
			repeatingDiagnosisReport.click();
		}
		
		public void clickOnAirmileReport()
		{
			airmileReport.click();
		}
		
		public void clickOnRevenueProgressReport()
		{
			revenueProgressReport.click();
		}
		
		public void clickOnDetailedStockReport()
		{
			detailedStockReport.click();
		}
		
		public void clickOnPatientReferralReport()
		{
			patientReferralReport.click();
		}
		
		public void clickOnCashCreditSplitReport()
		{
			cashCreditSplitReport.click();
		}
		
		public void clickOnInsuranceClaimBatchReport()
		{
			insuranceClaimBatchReport.click();
		}
		
		public void clickOnStockRejectionReport()
		{
			stockRejectionReport.click();
		}
		
		public void clickOnBifurcationReport()
		{
			bifurcationReport.click();
		}
		
		public void clickOnReconciliationReport()
		{
			reconciliationReport.click();
		}
		
		public void clickOnBillStatusReport()
		{
			//((JavascriptExecutor)driver).executeScript("scroll(0,400)");
			billStatusReport.click();
		}
		
		public void clickOnLaboratoryTATReport()
		{
			laboratoryTATReport.click();
		}
		
		public void clickOnInsuranceCompanywiseSalesReport()
		{
			insuranceCompanywiseSalesReport.click();
		}
		
		public void clickOnListofPlansReport()
		{
			listofPlansReport.click();
		}
		
		public void clickOnDenialAcceptanceReport()
		{
			denialAcceptanceReport.click();
		}
		
		public void clickOnNationWiseRevenueReport()
		{
			nationWiseRevenueReport.click();
		}
		
		public void clickOnNationWiseRevenueReportDepartmentWise()
		{
			NationWiseRevenueReportDepartmentWise.click();
		}
		
		public void clickOnBedOccupancyReport()
		{
			bedOccupancyReport.click();
		}
		
		public void clickOnDRGVarianceReport()
		{
			DRGVarianceReport.click();
		}
		
		public void clickOnDoctorPerformanceReport()
		{
			doctorPerformanceReport.click();
		}
		
		public void clickOnTherapistReport()
		{
			therapistReport.click();
		}
		
		public void clickOnCustomerDueReport()
		{
			customerDueReport.click();
		}
		
		public void clickOnRemittanceAdviceReport()
		{
			remittanceAdviceReport.click();
		}
		
		public void clickOnPACSOrderStatisticsReport()
		{
			PACSOrderStatisticsReport.click();
		}
		
		public void clickOnResubmissionReport()
		{
			resubmissionReport.click();
		}
		
		public void clickOnTotalSalesReport()
		{
			//((JavascriptExecutor)driver).executeScript("scroll(400,1000)");
			totalSalesReport.click();
		}
		
		public void clickOnDischargeStatusReport()
		{
			dischargeStatusReport.click();
		}
		
		public void clickOnStockStatusReport()
		{
			stockStatusReport.click();
		}
		
		public void clickonPowerscribeReport()
		{
			powerscribeReport.click();
		}
		
		public void clickonAdvanceAndRefundReceipts()
		{
			advanceAndRefundReceipts.click();
		}
		
		public void clickonDepositAndRefundReceipt()
		{
			depositAndRefundReceipt.click();
		}
		
		public void clickonPatientDueReport()
		{
			patientDueReport.click();
		}
		
		public void clickonAppointmentTATReport()
		{
			appointmentTATReport.click();
		}
		
		public void clickonPriorAuthReport()
		{
			priorAuthReport.click();
		}
		
		public void clickonRadiologyAlertCategoryReport()
		{
			radiologyAlertCategoryReport.click();
		}

		public void clickonCollectionLogReport()
		{
			collectionLogReport.click();
		}
		
		public void clickonNewAppointmentTATReport()
		{
			newAppointmentTATreport.click();
		}
		//************* All Custom Reports Links for DashBoard ends **********//

		
}