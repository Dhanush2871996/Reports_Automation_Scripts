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
		
		
	}
	
//	@Test(priority = 1)
//	public void test1() throws InterruptedException
//	{
//		customTestBuilder.navigateToCustomDashboard();
//		customTestBuilder.runCustomReportFor1Month();
//	}
	
	public static void closeAndSwitchTab(String mainAddres1)
	{
		driver.close();
		driver.switchTo().window(mainAddres1);
	}
	
	public static void failORPassStatment(boolean a, int month)
	{
		if(a== false)
		{
			Assert.assertEquals(a,true, "testCustomReportFor"+month+"Month got failed due to time out error.");
		}
		else
			Assert.assertEquals(a,true, "testCustomReportFor"+month+"Month got failed.");
		
	}
	//For all the negative cases i am calling all the methods from "TestBuilders" class
	

	public void testingAllTheNagativeCases() throws InterruptedException
	{
		 String mainAddress = customTestBuilder.initializeElement();
	
//		 boolean test = testBuilders.test3MonthPdf("01-01-2019", "20-01-2019");
//		 Assert.assertEquals(test,true,"testing 3 month got failed");
		 
		
		System.out.println("test start 1.1");
		boolean a= testBuilders.testDateFieldsBlank_pdf();
		Assert.assertEquals(a,true,"Blank date for generating pdf report got failed");
		
		
		System.out.println("test start 2");
		boolean b = testBuilders.testDateFieldsBlank_csv();
		Assert.assertEquals(b,true,"Blank date for generating csv report got failed");
		
		System.out.println("test start 3");
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
		
		//boolean j = 
		
		driver.close();
		driver.switchTo().window(mainAddress);
		
		System.out.println("test ends.");
	}


	@Test(priority=1)
	public void testCustomReportFor1Month_DepartmentWiseAllocation() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportfor1Month_1st();
		testBuilders = new TestBuilders();
		boolean a =testBuilders.verifyPdfDateRange("Previous Month");
		Assert.assertEquals(a,true, "testCustomReportFor1Month got failed.");
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 1);
	}

	
	@Test(priority = 2)
	public void testCustomReportFor2Month_DoctorWisePatientCount() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportfor2Month_2nd();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "28-02-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 2);
	}
	
	
	@Test(priority = 3)
	public void testCustomReportFor3Month_BillAdjustmentEntriesList() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportfor3Month_3th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "03-04-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 3);
	}
	
	
	@Test(priority=4)
	public void testCustomReportFor4Month_DoctorRevenueDetailed() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_4th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-05-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 4);
	}
	
	
	@Test(priority=5)
	public void testCustomReportFor5Month_RadiologyTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_5th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "02-06-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 5);
	}
	
	@Test(priority=6)
	public void testCustomReportFor6Month_DepartmentwisePatient() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor6Month_6th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-07-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 6);
			
	}
	
	@Test(priority=7)
	public void testCustomReportFor7Month_VisitStatusReportforHealthAuthority() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor7Month_7th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-08-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 7);
	}
	
	@Test(priority=8)
	public void testCustomReportFor8Month_SubmissionRejectionRate() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor8Month_8th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-09-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 8);
	}

	@Test(priority=9)
	public void testCustomReportFor9Month_SponsorWiseClaimSubmissionList() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor9Month_9th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-10-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);	
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		TestCustomReportBuilders.failORPassStatment(a, 9);
	}
	
	@Test(priority=10)
	public void testCustomReportFor10Month_MedicalCheckupReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor10Month_10th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-11-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		TestCustomReportBuilders.failORPassStatment(a, 10);
	}
	
	@Test(priority=11)
	public void testCustomReportFor11Month_RepeatingDiagnosisReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor11Month_11th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-12-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		TestCustomReportBuilders.failORPassStatment(a, 11);
	}
	
	@Test(priority=12)
	public void testCustomReportFor12Month_AirmileReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor12Month_12th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2020");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 12);
	}
	
	@Test(priority=13)
	public void testCustomReportFor1Month_RevenueProgressReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor1Month_13th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "31-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 1);
	}
	
	@Test(priority=14)
	public void testCustomReportFor2Month_PatientReferralReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor2Month_14th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "28-02-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 2);
	}
	
	@Test(priority=15)
	public void testCustomReportFor3Month_CashCreditSplitReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor3Month_15th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "03-04-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 3);
	}
	
	@Test(priority=16)
	public void testCustomReportFor4Month_InsuranceClaimBatchReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_16th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-05-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 4);
	}
	
	@Test(priority=17)
	public void testCustomReportFor5Month_StockRejectionReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_17th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-06-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 5);
	}
	/*
	@Test(priority=18)
	public void testCustomReportFor6Month_BillStatusReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor6Month_18th();
		
		builderElements.clickOnFromDateFields();
		
		builderElements.enterFromAndToDate("01-01-2019", "10-07-2019");
		Thread.sleep(2000);
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		
		((JavascriptExecutor)driver).executeScript("scroll(400,1000)");
		
		TestCustomReportBuilders.failORPassStatment(a, 6);
	}
	/*
	@Test(priority=19)
	public void testCustomReportFor7Month_LaboratoryTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor7Month_19th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "12-08-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 7);
	}
	
	@Test(priority=20)
	public void testCustomReportFor8Month_InsuranceCompanywiseSalesReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor8Month_20th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "15-09-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 8);
	}
	
	@Test(priority=21)
	public void testCustomReportFor9Month_ListofPlansReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor9Month_21th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "17-10-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 9);
	}
	
	@Test(priority=22)
	public void testCustomReportFor10Month_DenialAcceptanceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor10Month_22th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-11-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 10);
	}
	
	@Test(priority=23)
	public void testCustomReportFor11Month_NationWiseRevenueReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor11Month_23th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-12-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 11);
	}
	
	@Test(priority=24)
	public void testCustomReportFor12Month_NationWiseRevenueReportDepartmentWise() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor12Month_24th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-01-2020");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 12);
	}
	
	@Test(priority=25)
	public void testCustomReportFor1Month_BedOccupancyReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor1Month_25th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "31-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 1);
	}
	
	@Test(priority=26)
	public void testCustomReportFor2Month_DRGVarianceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor2Month_26th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-03-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 2);
	}
	
	@Test(priority=27)
	public void testCustomReportFor3Month_DoctorPerformanceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor3Month_27th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "03-04-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 3);
	}
	
	@Test(priority=28)
	public void testCustomReportFor4Month_TherapistReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_28th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "05-05-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 4);
	}
	
	@Test(priority=29)
	public void testCustomReportFor5Month_CustomerDueReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_29th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-06-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 5);
	}
	
	@Test(priority=30)
	public void testCustomReportFor5Month_RemittanceAdviceReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor6Month_30th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "02-07-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 6);
	}
	
	@Test(priority=31)
	public void testCustomReportFor7Month_ResubmissionReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor7Month_31th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-08-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 7);
	}
	
	@Test(priority=32)
	public void testCustomReportFor8Month_TotalSalesReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor8Month_32th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-09-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 8);
	}
	
	@Test(priority=33)
	public void testCustomReportFor9Month_DischargeStatusReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor9Month_33th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-10-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 9);
	}
	
	@Test(priority=34)
	public void testCustomReportFor10Month_AdvanceAndRefundReceipts() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor10Month_34th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-11-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 10);
	}
	
	@Test(priority=35)
	public void testCustomReportFor11Month_StockRejectionReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor11Month_35th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "07-12-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 11);
	}
	
	@Test(priority=36)
	public void testCustomReportFor12Month_PatientDueReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor12Month_36th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-01-2020");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 12);
	}
	
	@Test(priority=37)
	public void testCustomReportFor1Month_AppointmentTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor1Month_37th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "31-01-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 1);
	}
	
	@Test(priority=38)
	public void testCustomReportFor2Month_PriorAuthReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor2Month_38th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "01-03-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 2);
	}
	
	@Test(priority=39)
	public void testCustomReportFor3Month_RadiologyAlertCategoryReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor3Month_39th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "03-04-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 3);
	}
	
	@Test(priority=40)
	public void testCustomReportFor4Month_CollectionLogReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor4Month_40th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "04-05-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 4);
	}
	
	@Test(priority=41)
	public void testCustomReportFor5Month_AppointmentTATReport() throws InterruptedException
	{
		String mainAddres = customTestBuilder.runCustomReportsFor5Month_41th();
		
		builderElements.clickOnFromDateFields();
		builderElements.enterFromAndToDate("01-01-2019", "06-06-2019");
		
		boolean a =testBuilders.verifyPdfDateRange(null);
		TestCustomReportBuilders.closeAndSwitchTab(mainAddres);
		TestCustomReportBuilders.failORPassStatment(a, 5);
	}
*/
}