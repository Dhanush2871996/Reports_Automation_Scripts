package com.reports.testcases;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.reports.pages.BuiderElements;
import com.reports.pages.CustomReports;
import com.reports.pages.EditCustomReportRights;

public class CustomTestBuilder extends CustomReports
{
	int reportDate;
	WebDriver driver;
	EditCustomReportRights editCustReportRights;
	
	CustomReports customReports;
	BuiderElements builderElements;
	
	public CustomTestBuilder(WebDriver driver)
	{
		super(driver);
		editCustReportRights = new EditCustomReportRights(driver);
		builderElements = new BuiderElements(driver);
			
	}
	
	public void rightsConfig(String allowedReportDuration) throws InterruptedException
	{
		//Code For Switch Window
		
		
		String addrMain;
		addrMain = driver.getWindowHandle();
		
		builderElements.switchTabs(addrMain);
//		Set<String> allWindowAddress= driver.getWindowHandles();
//		
//		for(String childAddres: allWindowAddress)
//		{
//			if(!allWindowAddress.equals(childAddres))
//			{
//				driver.switchTo().window(childAddres);
//			}
//		}
		
		editCustReportRights.selectAllowedReportDuration(allowedReportDuration);
		editCustReportRights.selectAvailableUser("manish01");
		editCustReportRights.clickOnAddAvailUserBTN();
		
		editCustReportRights.clickOnSaveBTN();
		driver.close();
		
		driver.close();
		driver.switchTo().window(addrMain);
		//controle to main window
	}
	

	public void provideAccess() throws InterruptedException
	{
		clickOnDepartmentWiseAllocationReport(driver);
		rightsConfig("1");
		
		clickOnDoctorWisePatientCountReport(driver);
		rightsConfig("2");
		
		clickOnBillAdjustmentEntriesList(driver);
		rightsConfig("3");
		
		clickOnDoctorRevenueDetailedReport(driver);
		rightsConfig("4");
		
		clickOnBillAdjustmentEntriesList(driver);
		rightsConfig("5");
		
		clickOnDoctorRevenueDetailedReport(driver);
		rightsConfig("6");
		
		clickOnRadiologyTATReport(driver);
		rightsConfig("7");
		
		clickOnDepartmentwisePatientCount(driver);
		rightsConfig("8");
		
		clickOnConsumableItemsPriceReport(driver);
		rightsConfig("9");
		
		clickOnVisitStatusReportforHealthAuthority(driver);
		rightsConfig("10");
		
		clickOnSubmissionRejectionRateReport(driver);
		rightsConfig("11");
		
		clickOnSponsorWiseClaimSubmissionList(driver);
		rightsConfig("12");
		
		clickOnMedicalCheckupReport(driver);
		rightsConfig("1");
		
		clickOnRepeatingDiagnosisReport(driver);
		rightsConfig("2");
		
		clickOnAirmileReport(driver);
		rightsConfig("3");
		
		clickOnRevenueProgressReport(driver);
		rightsConfig("4");
		
		clickOnDetailedStockReport(driver);
		rightsConfig("5");
		
		clickOnPatientReferralReport(driver);
		rightsConfig("6");
		
		clickOnCashCreditSplitReport(driver);
		rightsConfig("7");
		
		clickOnInsuranceClaimBatchReport(driver);
		rightsConfig("8");
		
		clickOnStockRejectionReport(driver);
		rightsConfig("9");
		
		clickOnBifurcationReport(driver);
		rightsConfig("10");
		
		clickOnReconciliationReport(driver);
		rightsConfig("11");
		
		clickOnBillStatusReport(driver);
		rightsConfig("12");
		
		clickOnLaboratoryTATReport(driver);
		rightsConfig("1");
		
		clickOnLaboratoryTATReport(driver);
		rightsConfig("2");
		
		clickOnListofPlansReport(driver);
		rightsConfig("3");
		
		clickOnDenialAcceptanceReport( driver);
		rightsConfig("4");
		
		clickOnNationWiseRevenueReport(driver);
		rightsConfig("5");
		
		clickOnNationWiseRevenueReportDepartmentWise(driver);
		rightsConfig("6");
		
		clickOnBedOccupancyReport(driver);
		rightsConfig("7");
		
		clickOnDRGVarianceReport(driver);
		rightsConfig("8");
		
		clickOnDoctorPerformanceReport(driver);
		rightsConfig("9");
		
		clickOnTherapistReport(driver);
		rightsConfig("10");
		
		clickOnCustomerDueReport(driver);
		rightsConfig("12");
		
		clickOnRemittanceAdviceReport(driver);
		rightsConfig("1");
		
		clickOnPACSOrderStatisticsReport(driver);
		rightsConfig("2");
		
		clickOnResubmissionReport(driver);
		rightsConfig("3");
		
		clickOnTotalSalesReport(driver);
		rightsConfig("4");
		
		clickOnDischargeStatusReport(driver);
		rightsConfig("5");
		
		clickOnStockStatusReport(driver);
		rightsConfig("6");
		
		clickonPowerscribeReport(driver);
		rightsConfig("7");
		
		clickonAdvanceAndRefundReceipts(driver);
		rightsConfig("8");
		
		clickonDepositAndRefundReceipt(driver);
		rightsConfig("9");
		
		clickonPatientDueReport(driver);
		rightsConfig("10");
		
		clickonAppointmentTATReport(driver);
		rightsConfig("11");
		
		clickonPriorAuthReport(driver);
		rightsConfig("12");
		
		clickonRadiologyAlertCategoryReport(driver);
		rightsConfig("1");
		
//		clickonLabTatReport_fields(driver);
//		rightsConfig("2");
//		
//		clickonModifiedRevenueProgressReport(driver);
//		rightsConfig("3");
//		
//		clickonCollectionLogReportFinal(driver);
//		rightsConfig("5");
	}

}
