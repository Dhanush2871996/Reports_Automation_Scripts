/**
 * In this class we are running all the test cases for the builder for custom reports builder.
 * 
 * */

package com.reports.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.reports.generics.BaseTest;
import com.reports.pages.BuiderElements;
import com.reports.pages.CustomReports;
import com.reports.pages.CustomReportsRunByUser;
import com.reports.pages.CustomTestBuilder;
import com.reports.pages.EditCustomReportRights;

public class TestCustomReportBuilders extends BaseTest
{	
	CustomReports customReports;
	TestLoginPage testLoginPage;
	EditCustomReportRights editCustomReportRights;
	BuiderElements builderElements;
	CustomTestBuilder customTestBuilder;
	TestBuilders testBuilders;
	CustomReportsRunByUser customReportsRunByUser;
	TestCustomReportBuilders testCustomReportBuilders;
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		testLoginPage = new TestLoginPage(USERNAME2, PASSWORD2, "Y");
		customReports = new CustomReports(driver);
		editCustomReportRights = new EditCustomReportRights(driver);
		customTestBuilder= new CustomTestBuilder(driver);
		
//		customReports.clickOnCustomReportsDropdown();
//		customReports.clickOnReportListLink();
//
//		customTestBuilder.provideAccess(); //give access to all the custom report for an particular user
		
		builderElements = new BuiderElements(driver);
		builderElements.clickOnLogOut();
		TestLoginPage.logIn(USERNAME4, PASSWORD4);//login as that user to whom the access rights are given.
	
		customTestBuilder.navigateToCustomDashboard();
		
		testCustomReportBuilders = new TestCustomReportBuilders();
	}
	
	public static void closeAndSwitchTab(String mainAddres1)
	{
		driver.close();
		driver.switchTo().window(mainAddres1);
	}
	
	public static void failORPassStatment(boolean a, String monthReportName)
	{
		if(a== false)
		{
			Assert.assertEquals(a,true, "testCustomReportFor"+monthReportName+" got failed due to time out error.");
		}
		else
			Assert.assertEquals(a,true, "testCustomReportFor"+monthReportName+" got failed.");
		
	}
	//For all the negative cases i am calling all the methods from "TestBuilders" class
	

	public  void testingAllTheNagativeCases() throws InterruptedException
	{
//		 String mainAddress = customTestBuilder.initializeElement();
//	
////		 boolean test = testBuilders.test3MonthPdf("01-01-2019", "20-01-2019");
////		 Assert.assertEquals(test,true,"testing 3 month got failed");
		 
		testBuilders = new TestBuilders();
		boolean a= testBuilders.testDateFieldsBlank_pdf();
		Assert.assertEquals(a,true,"Blank date for generating pdf report got failed");
		
		boolean b = testBuilders.testDateFieldsBlank_csv();
		Assert.assertEquals(b,true,"Blank date for generating csv report got failed");
		
		boolean c = testBuilders.testDateFieldsBlank_text();
		Assert.assertEquals(c,true,"Blank date for generating text report got failed");
		
		boolean d = testBuilders.testFromDateFieldBlank_pdf();
		Assert.assertEquals(d, true,"testFromDatefieldBlank_pdf got failed.");
		
		boolean e = testBuilders.testToDateFieldBlank_pdf();
		Assert.assertEquals(e,true, "testToDateFieldBlank_pdf got failed.");
		
		boolean f = testBuilders.testFromDateFieldBlank_cvs();
		Assert.assertEquals(f,true, "testFromDateFieldBlank_cvs got failed.");
		
		boolean g = testBuilders.testToDateFieldBlank_cvs();
		Assert.assertEquals(g,true, "testToDateFieldBlank_cvs got failed.");
		
		boolean h = testBuilders.testFromDateFieldBlank_text();
		Assert.assertEquals(h,true, "testFromDateFieldBlank_text got failed.");
		
		boolean i = testBuilders.testToDateFieldBlank_text();
		Assert.assertEquals(i,true, "testToDateFieldBlank_text got failed.");
		
	}
	
	@Test(priority=1)
	public void testCustomReportFor1Month_DepartmentWiseAllocation() throws InterruptedException
	{

		String mainAddres = customTestBuilder.runCustomReportfor1Month_1st();
		testCustomReportBuilders.testingAllTheNagativeCases();
		
		testBuilders = new TestBuilders();
		boolean a =testBuilders.verifyPdfDateRange("Previous Month");
		Assert.assertEquals(a,true, "testCustomReportFor1Month got failed.");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "1Month_DepartmentWiseAllocation");
	}
	/*
	@Test(priority = 2)
	public void testCustomReportFor2Month_DoctorWisePatientCount() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportfor2Month_2nd();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "28-02-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "2Month_DoctorWisePatientCount");
	}

	@Test(priority = 3)
	public void testCustomReportFor3Month_BillAdjustmentEntriesList() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportfor3Month_3th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "03-04-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "3Month_BillAdjustmentEntriesList");
	}
	*/
	@Test(priority=4)
	public void testCustomReportFor4Month_DoctorRevenueDetailed() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_4th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-05-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "4Month_DoctorRevenueDetailed");
	}
	
	//always give time out error
	@Test(priority=5)
	public void testCustomReportFor5Month_RadiologyTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_5th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "5Month_RadiologyTATReport");
	
	}
	
	//Always give time out error when we are running
	@Test(priority=6)
	public void testCustomReportFor6Month_DepartmentwisePatientCount() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor6Month_6th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		System.out.println("title 1 the page is: "+driver.getTitle());
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		System.out.println("title 2 of the pg: "+driver.getTitle());
		
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		System.out.println("title 3 of the pg: "+driver.getTitle());
		TestCustomReportBuilders.failORPassStatment(a, "6Month_DepartmentwisePatientCount");
			
	}
	//always give time out error when we will be running
	@Test(priority=7)
	public void testCustomReportFor7Month_VisitStatusReportforHealthAuthority() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor7Month_7th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "7Month_VisitStatusReportforHealthAuthority");
	}
	//give time out error when run this test
	@Test(priority=8)
	public void testCustomReportFor8Month_SubmissionRejectionRate() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor8Month_8th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "8Month_SubmissionRejectionRate");
	}

	@Test(priority=9)
	public void testCustomReportFor9Month_SponsorWiseClaimSubmissionList() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor9Month_9th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-1-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");	
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		TestCustomReportBuilders.failORPassStatment(a, "9Month_SponsorWiseClaimSubmissionList");
	}
	
	@Test(priority=10)
	public void testCustomReportFor10Month_MedicalCheckupReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor10Month_10th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		TestCustomReportBuilders.failORPassStatment(a, "10Month_MedicalCheckupReport");
	}
	//
	@Test(priority=11)
	public void testCustomReportFor11Month_RepeatingDiagnosisReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor11Month_11th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		TestCustomReportBuilders.failORPassStatment(a, "11Month_RepeatingDiagnosisReport");
	}
	
	@Test(priority=12)
	public void testCustomReportFor12Month_AirmileReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor12Month_12th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "12Month_AirmileReport");
	}
	//always give the time out error when we run this report
	@Test(priority=13)
	public void testCustomReportFor1Month_RevenueProgressReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor1Month_13th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "1Month_RevenueProgressReport");
	}
	
	@Test(priority=14)
	public void testCustomReportFor2Month_PatientReferralReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor2Month_14th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "2Month_PatientReferralReport");
	}
	
	@Test(priority=15)
	public void testCustomReportFor3Month_CashCreditSplitReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor3Month_15th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		System.out.println("title 1 is: "+driver.getTitle());
		TestCustomReportBuilders.failORPassStatment(a, "3Month_CashCreditSplitReport");
	}
	
	@Test(priority=16)
	public void testCustomReportFor4Month_InsuranceClaimBatchReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_16th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "4Month_InsuranceClaimBatchReport");
	}
	
	@Test(priority=17)
	public void testCustomReportFor5Month_StockRejectionReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_17th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "5Month_StockRejectionRepor");
	}
		//=============================scroll page here============================================
	@Test(priority=18) //scroll the page
	public void testCustomReportFor6Month_BillStatusReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor6Month_18th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		((JavascriptExecutor)driver).executeScript("scroll(200,500)");
		Thread.sleep(3000);
		TestCustomReportBuilders.failORPassStatment(a, "6Month_BillStatusReport");
	}
	
	@Test(priority=19)
	public void testCustomReportFor7Month_LaboratoryTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor7Month_19th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "7Month_LaboratoryTATReport");
	}
	
	@Test(priority=20)
	public void testCustomReportFor8Month_InsuranceCompanywiseSalesReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor8Month_20th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "8Month_InsuranceCompanywiseSalesReport");
	}
	
	@Test(priority=21)
	public void testCustomReportFor9Month_ListofPlansReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor9Month_21th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "9Month_ListofPlansReport");
	}
	
	@Test(priority=22)
	public void testCustomReportFor10Month_DenialAcceptanceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor10Month_22th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "10Month_DenialAcceptanceReport");
	}
	
	@Test(priority=23)
	public void testCustomReportFor11Month_NationWiseRevenueReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor11Month_23th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "11Month_NationWiseRevenueReport");
	}
	
	@Test(priority=24)
	public void testCustomReportFor12Month_NationWiseRevenueReportDepartmentWise() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor12Month_24th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "12Month_NationWiseRevenueReportDepartmentWise");
	}
	
	@Test(priority=25)
	public void testCustomReportFor1Month_BedOccupancyReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor1Month_25th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "1Month_BedOccupancyReport");
	}
	
	@Test(priority=26)
	public void testCustomReportFor2Month_DRGVarianceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor2Month_26th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "2Month_DRGVarianceReport");
	}
	
	@Test(priority=27)
	public void testCustomReportFor3Month_DoctorPerformanceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor3Month_27th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "3Month_DoctorPerformanceReport");
	}
	
	@Test(priority=28)
	public void testCustomReportFor4Month_TherapistReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_28th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a,"4Month_TherapistReport");
	}
	
	@Test(priority=29)
	public void testCustomReportFor5Month_CustomerDueReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_29th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "5Month_CustomerDueReport");
	}
	
	@Test(priority=30)
	public void testCustomReportFor5Month_RemittanceAdviceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor6Month_30th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a,"5Month_RemittanceAdviceReport");
	}
	
	@Test(priority=31)
	public void testCustomReportFor7Month_ResubmissionReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor7Month_31th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "7Month_ResubmissionReport");
	}
	
	//=============================scroll page here============================================
	
	@Test(priority=32)//scroll the pages for webelement location
	public void testCustomReportFor8Month_TotalSalesReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor8Month_32th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		((JavascriptExecutor)driver).executeScript("scroll(200,1000)");
		TestCustomReportBuilders.failORPassStatment(a, "8Month_TotalSalesReport");
	}
	
	@Test(priority=33)
	public void testCustomReportFor9Month_DischargeStatusReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor9Month_33th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "9Month_DischargeStatusReport");
	}
	
	@Test(priority=34)
	public void testCustomReportFor10Month_AdvanceAndRefundReceipts() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor10Month_34th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "10Month_AdvanceAndRefundReceipts");
	}
	
	@Test(priority=35)
	public void testCustomReportFor11Month_DepositAndRefundReceipt() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor11Month_35th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "11Month_DepositAndRefundReceipt");
	}
	
	@Test(priority=36)
	public void testCustomReportFor12Month_PatientDueReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor12Month_36th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a,"12Month_PatientDueReport");
	}
	
	@Test(priority=37)
	public void testCustomReportFor1Month_AppointmentTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor1Month_37th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "1Month_AppointmentTATReport");
	}
	
	@Test(priority=38)
	public void testCustomReportFor2Month_PriorAuthReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor2Month_38th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "2Month_PriorAuthReport");
	}
	
	@Test(priority=39)
	public void testCustomReportFor3Month_RadiologyAlertCategoryReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor3Month_39th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "3Month_RadiologyAlertCategoryReport");
	}
	
	@Test(priority=40)
	public void testCustomReportFor4Month_CollectionLogReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_40th();
		
		testCustomReportBuilders.testingAllTheNagativeCases();
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange("custom");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, "4Month_CollectionLogReport");
	}

//	@Test(priority=41)
//	public void testCustomReportFor5Month_AppointmentTATReport() throws InterruptedException
//	{
//		String mainAddres = customTestBuilder.runCustomReportsFor5Month_41th();
//		
//		builderElements.clickOnFromDateFields();
//		builderElements.enterFromAndToDate("01-01-2019", "06-06-2019");
//		
//		boolean a =testBuilders.verifyPdfDateRange(null);
//		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
//		TestCustomReportBuilders.failORPassStatment(a, 5);
//	}

}