package com.reports.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reports.generics.BaseTest;
import com.reports.pages.BedUtilReports;
import com.reports.pages.BillingReports;
import com.reports.pages.ClinicalDataReports;
import com.reports.pages.ConsultationReports;
import com.reports.pages.DentalReports;
import com.reports.pages.DiagnosticsReports;
import com.reports.pages.DialysisReports;
import com.reports.pages.InsuranceReports;
import com.reports.pages.MRDReports;
import com.reports.pages.MaintAndContractsReports;
import com.reports.pages.MasterReports;
import com.reports.pages.OTReports;
import com.reports.pages.PatientFeedBackReports;
import com.reports.pages.PatientPackageReports;
import com.reports.pages.PatientStatsReports;
import com.reports.pages.ProcurementReports;
import com.reports.pages.RosterReports;
import com.reports.pages.SalesAndIssuesReports;
import com.reports.pages.SchedulerReports;
import com.reports.pages.ServiceReports;
import com.reports.pages.StoreMgmtReports;
import com.reports.pages.WardActivitiesReports;

public class InitlizationOfBuilders extends BaseTest{
	
	BillingReports billingReports;
	WebDriverWait wait;
	PatientStatsReports patientStatsReports;
	PatientFeedBackReports patientFeedBackReports;
	RosterReports rosterReports;
	SalesAndIssuesReports salesAndIssuesReports;
	ProcurementReports procurementReports;
	StoreMgmtReports storeMgmtReports;
	ConsultationReports consultationReports;
	SchedulerReports schedulerReports;
	DiagnosticsReports diagnosticsReports;
	DialysisReports dialysisReports;
	PatientPackageReports patientPackageReports;
	ClinicalDataReports clinicalDataReports;
	ServiceReports serviceReports;
	OTReports oTReports;
	BedUtilReports bedUtilReports;
	MRDReports mRDReports;
	MaintAndContractsReports maintAndContractsReports;
	InsuranceReports insuranceReports;
	MasterReports masterReports;
	DentalReports dentalReports;
	WardActivitiesReports wardActivitiesReports;
	
	
	public InitlizationOfBuilders()
		{
			wait = new WebDriverWait(driver,60);
		}
	
	
	public void navigateToReportsBuilder(String builderName)
	{
		switch (builderName) {
		case "Payment for Insurance":
		{
			billingReports = new BillingReports(driver);
			wait.until(ExpectedConditions.visibilityOf(billingReports.paymentforInsurance));
			billingReports.clickOnPaymentforInsurance();
		}
			
			break;

		case "Patient Details Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.patientDetailsBuilder));
			patientStatsReports.clickOnPatientDetailsBuilder();
		}
			
			break;
			
		case "Visit Details Report Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.visitDetailsReportBuilder));
			patientStatsReports.clickOnVisitDetailsReportBuilder();
		}
			
			break;
			
		case "Patient Vitals Report Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.patientVitalsReportBuilder));
			patientStatsReports.clickOnPatientVitalsReportBuilder();
		}
			
			break;
			
		case "In Patient Report Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.inPatientReportBuilder));
			patientStatsReports.clickOnInPatientReportBuilder();
		}
			
			break;
//right xml from here	
		case "Birth Details Report Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.birthDetailsReportBuilder));
			patientStatsReports.clickOnBirthDetailsReportBuilder();
		}
			
			break;
			
		case "IP Stats/Bed Occupancy Report Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.iPStats_BedOccupancyReportBuilder));
			patientStatsReports.clickOnIPStats_BedOccupancyReportBuilder();
		}
			
			break;
			
		case "Patient Duplicates Report Builder":
		{
			patientStatsReports = new PatientStatsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientStatsReports.patientDuplicatesReportBuilder));
			patientStatsReports.clickOnPatientDuplicatesReportBuilder();
		}
			
			break;
			
		case "Patient Survey Response Details Report Builder":
		{
			patientFeedBackReports = new PatientFeedBackReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientFeedBackReports.patientSurveyResponseDetailsReportBuilder));
			patientFeedBackReports.clickOnPatientSurveyResponseDetailsReportBuilder();
		}
			
			break;
			
		case "Duty Roster Report Builder":
		{
			rosterReports = new RosterReports(driver);
			wait.until(ExpectedConditions.visibilityOf(rosterReports.dutyRosterReportBuilder));
			rosterReports.clickOnDutyRosterReportBuilder();
		}
			
			break;
			
			
		case "Sales Bills Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.salesBillsBuilder));
			salesAndIssuesReports.clickOnSalesBillsBuilder();
		}
			
			break;
			
		case "Sale Items Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.saleItemsBuilder));
			salesAndIssuesReports.clickOnSaleItemsBuilder();
		}
			
			break;
			
		case "Prescription Lead Time Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.prescriptionLeadTimeBuilder));
			salesAndIssuesReports.clickOnPrescriptionLeadTimeBuilder();
		}
			
			break;
			
		case "Stock Consumption Report Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.stockConsumptionReportBuilder));
			salesAndIssuesReports.clickOnStockConsumptionReportBuilder();
		}
			
			break;
			
		case "Stock Issues Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.stockIssuesBuilder));
			salesAndIssuesReports.clickOnStockIssuesBuilder();
		}
			
			break;
			
		case "Sales/Issues ABC Analysis Report Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.sales_IssuesABCAnalysisReportBuilder));
			salesAndIssuesReports.clickOnSales_IssuesABCAnalysisReportBuilder();
		}
			
			break;
			
		case "Patient Indent Items Builder":
		{
			salesAndIssuesReports = new SalesAndIssuesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(salesAndIssuesReports.patientIndentItemsBuilder));
			salesAndIssuesReports.clickOnPatientIndentItemsBuilder();
		}
			
			break;
			
		case "Purchase Invoices Builder":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.purchaseInvoicesBuilder));
			procurementReports.clickOnPurchaseInvoicesBuilder();
		}
			
			break;
			
		case "Purchase Items Builder":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.purchaseItemsBuilder));
			procurementReports.clickOnPurchaseItemsBuilder();
		}
			
			break;
			
		case "Purchase Invoice Tax Report":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.purchaseInvoiceTaxReport));
			procurementReports.clickOnPurchaseInvoiceTaxReport();
		}
			
			break;
		
		case "Purchase Items Tax Report":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.purchaseItemsTaxReport));
			procurementReports.clickOnPurchaseItemsTaxReport();
		}
			
			break;
			
		case "Supplier Returns Builder":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.supplierReturnsBuilder));
			procurementReports.clickOnSupplierReturnsBuilder();
		}
			
			break;
			
		case "PO - Items Builder":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.PO_ItemsBuilder));
			procurementReports.clickOnPO_ItemsBuilder();
		}
			
			break;
			
		case "PO-Pending Items Builder":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.PO_PendingItemsBuilder));
			procurementReports.clickOnPO_PendingItemsBuilder();
		}
			
			break;
//******
		case "Purchase Order Builder":
		{
			procurementReports = new ProcurementReports(driver);
			wait.until(ExpectedConditions.visibilityOf(procurementReports.purchaseOrderBuilder));
			procurementReports.clickOnPurchaseOrderBuilder();
		}
			
			break;
			
		case "Item Master Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.itemMasterBuilder));
			storeMgmtReports.clickOnItemMasterBuilder();
		}
			
			break;
			
		case "Detailed Stock Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.detailedStockBuilder));
			storeMgmtReports.clickOnDetailedStockBuilder();
		}
			
			break;
			
		case "Item-Wise Stock Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.item_WiseStockBuilder));
			storeMgmtReports.clickOnItem_WiseStockBuilder();
		}
			
			break;
			
		case "Indent Flow Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.indentFlowBuilder));
			storeMgmtReports.clickOnIndentFlowBuilder();
		}
			
			break;
			
		case "Indent Items Detail Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.indentItemsDetailBuilder));
			storeMgmtReports.clickOnIndentItemsDetailBuilder();
		}
			
			break;
			
		case "Stock Transfers Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.stockTransfersBuilder));
			storeMgmtReports.clickOnStockTransfersBuilder();
		}
			
			break;
			
		case "Stock Adjustment Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.stockAdjustmentBuilder));
			storeMgmtReports.clickOnStockAdjustmentBuilder();
		}
			
			break;
			
		case "Stock Movement Report":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.stockMovementReport));
			storeMgmtReports.clickOnStockMovementReport();
		}
			
			break;
			
		case "Reagent/Consumable Report Builder":
		{
			storeMgmtReports = new StoreMgmtReports(driver);
			wait.until(ExpectedConditions.visibilityOf(storeMgmtReports.reagent_ConsumableReportBuilder));
			storeMgmtReports.clickOnreagent_ConsumableReportBuilder();
		}
			
			break;
			
		case "Doctor Consultation Report Builder":
		{
			consultationReports = new ConsultationReports(driver);
			wait.until(ExpectedConditions.visibilityOf(consultationReports.doctorConsultationReportBuilder));
			consultationReports.clickOnDoctorConsultationReportBuilder();
		}
			
			break;
			
		case "Prescribing Order Details Report Builder":
		{
			consultationReports = new ConsultationReports(driver);
			wait.until(ExpectedConditions.visibilityOf(consultationReports.prescribingOrderDetailsReportBuilder));
			consultationReports.clickOnPrescribingOrderDetailsReportBuilder();
		}
			
			break;
			
		case "Doctor Appointments Report Builder":
		{
			schedulerReports = new SchedulerReports(driver);
			wait.until(ExpectedConditions.visibilityOf(schedulerReports.doctorAppointmentsReportBuilder));
			schedulerReports.clickOnDoctorAppointmentsReportBuilder();
		}
			
			break;
			
		case "Tests Scheduled Report Builder":
		{
			schedulerReports = new SchedulerReports(driver);
			wait.until(ExpectedConditions.visibilityOf(schedulerReports.testsScheduledReportBuilder));
			schedulerReports.clickOnTestsScheduledReportBuilder();
		}
			
			break;
			
		case "Services Scheduled Report Builder":
		{
			schedulerReports = new SchedulerReports(driver);
			wait.until(ExpectedConditions.visibilityOf(schedulerReports.servicesScheduledReportBuilder));
			schedulerReports.clickOnServicesScheduledReportBuilder();
		}
			
			break;
			
		case "Surgery Appointments Report Builder":
		{
			schedulerReports = new SchedulerReports(driver);
			wait.until(ExpectedConditions.visibilityOf(schedulerReports.surgeryAppointmentsReportBuilder));
			schedulerReports.clickOnSurgeryAppointmentsReportBuilder();
		}
			
			break;
			
		case "Consolidated Appointments Report":
		{
			schedulerReports = new SchedulerReports(driver);
			wait.until(ExpectedConditions.visibilityOf(schedulerReports.consolidatedAppointmentsReport));
			schedulerReports.clickOnConsolidatedAppointmentsReport();
		}
			
			break;
			
		case "Diagnostics Report Builder":
		{
			diagnosticsReports = new DiagnosticsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(diagnosticsReports.diagnosticsReportBuilder));
			diagnosticsReports.clickOnDiagnosticsReportBuilder();
		}
			
			break;
			
		case "Diagnostics Revenue Report Builder":
		{
			diagnosticsReports = new DiagnosticsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(diagnosticsReports.diagnosticsRevenueReportBuilder));
			diagnosticsReports.clickOnDiagnosticsRevenueReportBuilder();
		}
			
			break;
			
		case "Equipment Test Report Builder":
		{
			diagnosticsReports = new DiagnosticsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(diagnosticsReports.equipmentTestReportBuilder));
			diagnosticsReports.clickOnEquipmentTestReportBuilder();
		}
			
			break;
			
		case "Sample Rejections Report Builder":
		{
			diagnosticsReports = new DiagnosticsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(diagnosticsReports.sampleRejectionsReportBuilder));
			diagnosticsReports.clickOnSampleRejectionsReportBuilder();
		}
			
			break;
			
		case "Diag Internal Lab Report Builder":
		{
			diagnosticsReports = new DiagnosticsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(diagnosticsReports.diagInternalLabReportBuilder));
			diagnosticsReports.clickOnDiagInternalLabReportBuilder();
		}
			
			break;
			 
		case "Dialysis Session Report Builder":
		{
			dialysisReports = new DialysisReports(driver);
			wait.until(ExpectedConditions.visibilityOf(dialysisReports.dialysisSessionReportBuilder));
			dialysisReports.clickOnDialysisSessionReportBuilder();
		}
			
			break;
			 
		case "Dialysis Frequency Report Builder":
		{
			dialysisReports = new DialysisReports(driver);
			wait.until(ExpectedConditions.visibilityOf(dialysisReports.dialysisFrequencyReportBuilder));
			dialysisReports.clickOnDialysisFrequencyReportBuilder();
		}
			
			break;
			 
		case "Intra Dialysis Parameters Report Builder":
		{
			dialysisReports = new DialysisReports(driver);
			wait.until(ExpectedConditions.visibilityOf(dialysisReports.intraDialysisParametersReportBuilder));
			dialysisReports.clickOnIntraDialysisParametersReportBuilder();
		}
			
			break;
			 
		case "Patient Packages":
		{
			patientPackageReports = new PatientPackageReports(driver);
			wait.until(ExpectedConditions.visibilityOf(patientPackageReports.patientPackages));
			patientPackageReports.clickOnPatientPackages();
		}
			
			break;
			 
		case "Lab Test Results Report Builder":
		{
			clinicalDataReports = new ClinicalDataReports(driver);
			wait.until(ExpectedConditions.visibilityOf(clinicalDataReports.labTestResultsReportBuilder));
			clinicalDataReports.clickOnLabTestResultsReportBuilder();
		}
			
			break;
			 
		case "Clinical Lab Test Results Report Builder":
		{
			clinicalDataReports = new ClinicalDataReports(driver);
			wait.until(ExpectedConditions.visibilityOf(clinicalDataReports.clinicalLabTestResultsReportBuilder));
			clinicalDataReports.clickOnClinicalLabTestResultsReportBuilder();
		}
			
			break;
			 
		case "Diagnosis Codes Report Builder":
		{
			clinicalDataReports = new ClinicalDataReports(driver);
			wait.until(ExpectedConditions.visibilityOf(clinicalDataReports.diagnosisCodesReportBuilder));
			clinicalDataReports.clickOnDiagnosisCodesReportBuilder();
		}
			
			break;
			 
		case "Procedure Codes Report Builder":
		{
			clinicalDataReports = new ClinicalDataReports(driver);
			wait.until(ExpectedConditions.visibilityOf(clinicalDataReports.procedureCodesReportBuilder));
			clinicalDataReports.clickOnProcedureCodesReportBuilder();
		}
			
			break;
			
		case "Services Report Builder":
		{
			serviceReports = new ServiceReports(driver);
			wait.until(ExpectedConditions.visibilityOf(serviceReports.servicesReportBuilder));
			serviceReports.clickOnServicesReportBuilder();
		}
			
			break;
			 
		case "OT Schedule Report Builder":
		{
			oTReports = new OTReports(driver);
			wait.until(ExpectedConditions.visibilityOf(oTReports.oTScheduleReportBuilder));
			oTReports.clickOnOTScheduleReportBuilder();
		}
			
			break;
			 
		case "Current Bed Occupancy Report Builder":
		{
			bedUtilReports = new BedUtilReports(driver);
			wait.until(ExpectedConditions.visibilityOf(bedUtilReports.currentBedOccupancyReportBuilder));
			bedUtilReports.clickOnCurrentBedOccupancyReportBuilder();
		}
			
			break;
//******			 
		case "Detailed Bed Occupancy Report Builder":
		{
			bedUtilReports = new BedUtilReports(driver);
			wait.until(ExpectedConditions.visibilityOf(bedUtilReports.detailedBedOccupancyReportBuilder));
			bedUtilReports.clickOnDetailedBedOccupancyReportBuilder();
		}
			
			break;
			 
		case "Patient Bed Occupancy Report Builder":
		{
			bedUtilReports = new BedUtilReports(driver);
			wait.until(ExpectedConditions.visibilityOf(bedUtilReports.patientBedOccupancyReportBuilder));
			bedUtilReports.clickOnPatientBedOccupancyReportBuilder();
		}
			
			break;
			 
		case "Luxury Tax Report Builder":
		{
			bedUtilReports = new BedUtilReports(driver);
			wait.until(ExpectedConditions.visibilityOf(bedUtilReports.luxuryTaxReportBuilder));
			bedUtilReports.clickOnLuxuryTaxReportBuilder();
		}
			
			break;
			

			 
		case "Case File Report Builder":
		{
			mRDReports = new MRDReports(driver);
			wait.until(ExpectedConditions.visibilityOf(mRDReports.caseFileReportBuilder));
			mRDReports.clickOnCaseFileReportBuilder();
		}
			
			break;
			 
		case "Maintenance Activity Report Builder":
		{
			maintAndContractsReports = new MaintAndContractsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(maintAndContractsReports.maintenanceActivityReportBuilder));
			maintAndContractsReports.clickOnMaintenanceActivityReportBuilder();
		}
			
			break;

			 
		case "Complaints Report Builder":
		{
			maintAndContractsReports = new MaintAndContractsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(maintAndContractsReports.complaintsReportBuilder));
			maintAndContractsReports.clickOnComplaintsReportBuilder();
		}
			
			break;

			 
		case "Contract Report Builder":
		{
			maintAndContractsReports = new MaintAndContractsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(maintAndContractsReports.contractReportBuilder));
			maintAndContractsReports.clickOnContractReportBuilder();
		}
			
			break;

			 
		case "License Report Builder":
		{
			maintAndContractsReports = new MaintAndContractsReports(driver);
			wait.until(ExpectedConditions.visibilityOf(maintAndContractsReports.licenseReportBuilder));
			maintAndContractsReports.clickOnLicenseReportBuilder();
		}
			
			break;
			

			 
		case "Insurance Claims Report Builder":
		{
			insuranceReports = new InsuranceReports(driver);
			wait.until(ExpectedConditions.visibilityOf(insuranceReports.insuranceClaimsReportBuilder));
			insuranceReports.clickOnInsuranceClaimsReportBuilder();
		}
			
			break;

			 
		case "Insurance Claim Details Report Builder":
		{
			insuranceReports = new InsuranceReports(driver);
			wait.until(ExpectedConditions.visibilityOf(insuranceReports.insuranceClaimDetailsReportBuilder));
			insuranceReports.clickOnInsuranceClaimDetailsReportBuilder();
		}
			
			break;

			 
		case "Insurance Claim Batch Report Builder":
		{
			insuranceReports = new InsuranceReports(driver);
			wait.until(ExpectedConditions.visibilityOf(insuranceReports.insuranceClaimBatchReportBuilder));
			insuranceReports.clickOnInsuranceClaimBatchReportBuilder();
		}
			
			break;
			 
		case "Rate Master Report Builder":
		{
			masterReports = new MasterReports(driver);
			wait.until(ExpectedConditions.visibilityOf(masterReports.rateMasterRportBuilder));
			masterReports.clickOnRateMasterReportBuilder();
		}
			
			break;
			 
		case "Dental Treatment Details Report Builder":
		{
			dentalReports = new DentalReports(driver);
			wait.until(ExpectedConditions.visibilityOf(dentalReports.dentalTreatmentDetailsReportBuilder));
			dentalReports.clickOnDentalTreatmentDetailsReportBuilder();
		}
			
			break;
			 
		case "Dental Supplies Report Builder":
		{
			dentalReports = new DentalReports(driver);
			wait.until(ExpectedConditions.visibilityOf(dentalReports.dentalSuppliesReportBuilder));
			dentalReports.clickOnDentalSuppliesReportBuilder();
		}
			
			break;
			 
		case "Patient Activities Report Builder":
		{
			wardActivitiesReports = new WardActivitiesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(wardActivitiesReports.patientActivitiesReportBuilder));
			wardActivitiesReports.clickOnPatientActivitiesReportBuilder();
		}
			
			break;
			 
		case "Doctor Order Report Builder":
		{
			wardActivitiesReports = new WardActivitiesReports(driver);
			wait.until(ExpectedConditions.visibilityOf(wardActivitiesReports.doctorOrderReportBuilder));
			wardActivitiesReports.clickOnDoctorOrderReportBuilder();
		}
			
			break;
			
		default:
			break;
		}
	}
}
