/*
 *1. USing this class method we are giving the custom Builder access  for the particular user
 * 	by login as the InstaAdmin user.
 * 
 * 2.Also storing all the common methods for running the reports which are not present in fav builder page
 * 
		**/
package com.reports.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.reports.pages.CustomReports;
import com.reports.pages.EditCustomReportRights;
import com.reports.testcases.TestBuilders;

public class CustomTestBuilder extends CustomReports
{
	int reportDate;
	String userName;
	EditCustomReportRights editCustReportRights;
	
	CustomReports customReports;
	static BuiderElements builderElements;
	CustomReportsRunByUser customReportsRunByUser;
	TestBuilders testBuilders;
	
	static String mainAddres;
	
	
	public CustomTestBuilder(WebDriver driver)
	{
		super(driver);
		editCustReportRights = new EditCustomReportRights(driver);
		builderElements = new BuiderElements(driver);
		testBuilders = new TestBuilders();
	}
	
	public void rightsConfig(String allowedReportDuration) throws InterruptedException
	{
		//Code For Switch Window
		String parent1 =driver.getWindowHandle();
		builderElements.switchTabs(parent1);
		
		editCustReportRights.selectAllowedReportDuration(allowedReportDuration);
		
		System.out.println(editCustReportRights.checkForSelectedUser("manishDoc"));
		if(editCustReportRights.checkForSelectedUser("manishDoc"))
		{
		editCustReportRights.selectAvailableUser("manishDoc");
		editCustReportRights.clickOnAddAvailUserBTN();
		}
		
		editCustReportRights.clickOnSaveBTN();
		driver.close();
		
		driver.switchTo().window(parent1);
		//control to main window
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
		
		clickOnRadiologyTATReport(driver);
		rightsConfig("5");
		
		clickOnDepartmentwisePatientCount(driver);
		rightsConfig("6");
		
//		clickOnConsumableItemsPriceReport(driver); //not used since there is no "date field" only
//		rightsConfig("7");
		
		clickOnVisitStatusReportforHealthAuthority(driver);
		rightsConfig("7");
		
		clickOnSubmissionRejectionRateReport(driver);
		rightsConfig("8");
		
		clickOnSponsorWiseClaimSubmissionList(driver);
		rightsConfig("9");
		
		clickOnMedicalCheckupReport(driver);
		rightsConfig("10");
		
		clickOnRepeatingDiagnosisReport(driver);
		rightsConfig("11");
		
		clickOnAirmileReport(driver);
		rightsConfig("12");
		
		clickOnRevenueProgressReport(driver);
		rightsConfig("1");
		
//		clickOnDetailedStockReport(driver);//not part of automation since it does not have from and to date fields
//		rightsConfig("5");
		
		clickOnPatientReferralReport(driver);
		rightsConfig("2");
		
		clickOnCashCreditSplitReport(driver);
		rightsConfig("3");
		
		clickOnInsuranceClaimBatchReport(driver);
		rightsConfig("4");
		
		clickOnStockRejectionReport(driver);
		rightsConfig("5");
		
//		clickOnBifurcationReport(driver);// not part of script since it of type pdf format
//		rightsConfig("7");
//		
//		clickOnReconciliationReport(driver);// not part of script since it of type pdf format
//		rightsConfig("8");
	
		clickOnBillStatusReport(driver); //Run this report every time so that page will get scroll upward. 
		rightsConfig("6");
	
		clickOnLaboratoryTATReport(driver);
		rightsConfig("7");
		
		clickOnInsuranceCompanywiseSalesReport(driver);
		rightsConfig("8");
		
		clickOnListofPlansReport(driver);
		rightsConfig("9");
		
		clickOnDenialAcceptanceReport( driver);
		rightsConfig("10");
		
		clickOnNationWiseRevenueReport(driver);
		rightsConfig("11");
		
		clickOnNationWiseRevenueReportDepartmentWise(driver);
		rightsConfig("12");
		
		clickOnBedOccupancyReport(driver);
		rightsConfig("1");
		
		clickOnDRGVarianceReport(driver);
		rightsConfig("2");
		/*
		clickOnDoctorPerformanceReport(driver);
		rightsConfig("3");
		
		clickOnTherapistReport(driver);
		rightsConfig("4");
		
		clickOnCustomerDueReport(driver);
		rightsConfig("5");
		
		clickOnRemittanceAdviceReport(driver);
		rightsConfig("6");
		
//		clickOnPACSOrderStatisticsReport(driver);//not part of the automation since it is pdf
//		rightsConfig("2");
		
		clickOnResubmissionReport(driver);
		rightsConfig("7");
	
		clickOnTotalSalesReport(driver);  //always run this reports because it will scroll the page upward.
		rightsConfig("8");
		
		clickOnDischargeStatusReport(driver);
		rightsConfig("9");
		
//		clickOnStockStatusReport(driver);//not part of the automation since it does not have from and to date field
//		rightsConfig("6");
		
//		clickonPowerscribeReport(driver);//not part of the automation since it is pdf
//		rightsConfig("7");
		
		clickonAdvanceAndRefundReceipts(driver);
		rightsConfig("10");
		
		clickonDepositAndRefundReceipt(driver);
		rightsConfig("11");
		
		clickonPatientDueReport(driver);
		rightsConfig("12");
		
		clickonAppointmentTATReport(driver);
		rightsConfig("1");
		
		clickonPriorAuthReport(driver);
		rightsConfig("2");
		
		clickonRadiologyAlertCategoryReport(driver);
		rightsConfig("3");
		
		clickonCollectionLogReport(driver);
		rightsConfig("4");
		
		clickonNewAppointmentTATReport(driver);
		rightsConfig("5");
*/
	}
	
	//test1
	public void navigateToCustomDashboard()
	{
		customReports = new CustomReports(driver);//Initializing the page elements
		
		((JavascriptExecutor)driver).executeScript("scroll(50,500)");
		customReports.clickOnCustomReportsDropdown();
		customReports.clickOnReportListLink();
		
		customReportsRunByUser = new CustomReportsRunByUser(driver);
		builderElements = new BuiderElements(driver);
		
	}

	public String initializeElement() throws InterruptedException
	{
		customReportsRunByUser = new CustomReportsRunByUser(driver);//Initializing the element of the dashboard.
		
		mainAddres = driver.getWindowHandle();
		
		builderElements.switchTabs(mainAddres);
		
		return mainAddres;
	}
	
	
	/////////////////////All the Positive cases for custom reports starts/////////////////
	
	public static void getWindowHandle_SwitchTab() throws InterruptedException
	{
		mainAddres = driver.getWindowHandle();
		builderElements.switchTabs(mainAddres);	
	}
	//test1
	public String runCustomReportfor1Month_1st() throws InterruptedException
	{
		customReportsRunByUser = new CustomReportsRunByUser(driver);//initializing the webelement for buiderelements
		customReportsRunByUser.clickOnDepartmentWiseAllocationReport();

		CustomTestBuilder.getWindowHandle_SwitchTab();
		
		return mainAddres;
		
	}
	//test2
	public String runCustomReportfor2Month_2nd() throws InterruptedException
	{
		customReportsRunByUser.clickOnDoctorWisePatientCountReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test3
	public String runCustomReportfor3Month_3th() throws InterruptedException
	{
		customReportsRunByUser.clickOnBillAdjustmentEntriesList();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	/////////////////////All the Positive cases for custom reports starts/////////////////
	
	//test4
	public String runCustomReportsFor4Month_4th() throws InterruptedException
	{
		customReportsRunByUser.clickOnDoctorRevenueDetailedReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test5
	public String runCustomReportsFor5Month_5th() throws InterruptedException
	{
		customReportsRunByUser.clickOnRadiologyTATReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test6
	public String runCustomReportsFor6Month_6th() throws InterruptedException
	{
		customReportsRunByUser.clickOnDepartmentwisePatientCount();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test7
//	public String runCustomReportsFor7Month_7th() throws InterruptedException
//	{
//		customReportsRunByUser.clickOnConsumableItemsPriceReport();
//		CustomTestBuilder.getWindowHandle_SwitchTab();
//		return mainAddres;
//	}
	
	//test8
	public String runCustomReportsFor7Month_7th() throws InterruptedException
	{
		customReportsRunByUser.clickOnVisitStatusReportforHealthAuthority();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test9
	public String runCustomReportsFor8Month_8th() throws InterruptedException
	{	customReportsRunByUser.clickOnSubmissionRejectionRateReporty();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test10
	public String runCustomReportsFor9Month_9th() throws InterruptedException
	{
		customReportsRunByUser.clickOnSponsorWiseClaimSubmissionList();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test11
	public String runCustomReportsFor10Month_10th() throws InterruptedException
	{
		customReportsRunByUser.clickOnMedicalCheckupReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test12
	public String runCustomReportsFor11Month_11th() throws InterruptedException
	{
		customReportsRunByUser.clickOnRepeatingDiagnosisReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}

	//test13
	public String runCustomReportsFor12Month_12th() throws InterruptedException
	{
		customReportsRunByUser.clickOnAirmileReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test14
	public String runCustomReportsFor1Month_13th() throws InterruptedException
	{
		customReportsRunByUser.clickOnRevenueProgressReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test15
	public String runCustomReportsFor2Month_14th() throws InterruptedException
	{
		customReportsRunByUser.clickOnPatientReferralReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test16
	public String runCustomReportsFor3Month_15th() throws InterruptedException
	{
		customReportsRunByUser.clickOnCashCreditSplitReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test17
	public String runCustomReportsFor4Month_16th() throws InterruptedException
	{
		customReportsRunByUser.clickOnInsuranceClaimBatchReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test18
	public String runCustomReportsFor5Month_17th() throws InterruptedException
	{
		customReportsRunByUser.clickOnStockRejectionReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test19
	
	public String runCustomReportsFor6Month_18th() throws InterruptedException
	{
		customReportsRunByUser.clickOnBillStatusReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test20
	public String runCustomReportsFor7Month_19th() throws InterruptedException
	{
		customReportsRunByUser.clickOnLaboratoryTATReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test21
	public String runCustomReportsFor8Month_20th() throws InterruptedException
	{
		customReportsRunByUser.clickOnInsuranceCompanywiseSalesReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test22
	public String runCustomReportsFor9Month_21th() throws InterruptedException
	{
		customReportsRunByUser.clickOnListofPlansReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test23
	public String runCustomReportsFor10Month_22th() throws InterruptedException
	{
		customReportsRunByUser.clickOnDenialAcceptanceReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test24
	public String runCustomReportsFor11Month_23th() throws InterruptedException
	{
		customReportsRunByUser.clickOnNationWiseRevenueReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test25
	public String runCustomReportsFor12Month_24th() throws InterruptedException
	{
		customReportsRunByUser.clickOnNationWiseRevenueReportDepartmentWise();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test26
	public String runCustomReportsFor1Month_25th() throws InterruptedException
	{
		customReportsRunByUser.clickOnBedOccupancyReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test27
	public String runCustomReportsFor2Month_26th() throws InterruptedException
	{
		customReportsRunByUser.clickOnDRGVarianceReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test28
	public String runCustomReportsFor3Month_27th() throws InterruptedException
	{
		customReportsRunByUser.clickOnDoctorPerformanceReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	
	//test29
	public String runCustomReportsFor4Month_28th() throws InterruptedException
	{
		customReportsRunByUser.clickOnTherapistReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test30
	public String runCustomReportsFor5Month_29th() throws InterruptedException
	{
		customReportsRunByUser.clickOnCustomerDueReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test31
	public String runCustomReportsFor6Month_30th() throws InterruptedException
	{
		customReportsRunByUser.clickOnRemittanceAdviceReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test32
	public String runCustomReportsFor7Month_31th() throws InterruptedException
	{
		customReportsRunByUser.clickOnResubmissionReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test33
	public String runCustomReportsFor8Month_32th() throws InterruptedException
	{
		customReportsRunByUser.clickOnTotalSalesReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test34
	public String runCustomReportsFor9Month_33th() throws InterruptedException
	{
		customReportsRunByUser.clickOnDischargeStatusReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test35
	public String runCustomReportsFor10Month_34th() throws InterruptedException
	{
		customReportsRunByUser.clickonAdvanceAndRefundReceipts();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test36
	public String runCustomReportsFor11Month_35th() throws InterruptedException
	{
		customReportsRunByUser.clickonDepositAndRefundReceipt();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test37
	public String runCustomReportsFor12Month_36th() throws InterruptedException
	{
		customReportsRunByUser.clickonPatientDueReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test38
	public String runCustomReportsFor1Month_37th() throws InterruptedException
	{
		customReportsRunByUser.clickonAppointmentTATReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test39
	public String runCustomReportsFor2Month_38th() throws InterruptedException
	{
		customReportsRunByUser.clickonPriorAuthReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test40
	public String runCustomReportsFor3Month_39th() throws InterruptedException
	{
		customReportsRunByUser.clickonRadiologyAlertCategoryReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test41
	public String runCustomReportsFor4Month_40th() throws InterruptedException
	{
		customReportsRunByUser.clickonCollectionLogReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
	//test42
	public String runCustomReportsFor5Month_41th() throws InterruptedException
	{
		customReportsRunByUser.clickonNewAppointmentTATReport();
		CustomTestBuilder.getWindowHandle_SwitchTab();
		return mainAddres;
	}
}