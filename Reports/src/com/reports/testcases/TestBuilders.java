package com.reports.testcases;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import com.reports.generics.BaseTest;
import com.reports.generics.DateProvider;
import com.reports.generics.NameProvider;
import com.reports.pages.BuiderElements;
import com.reports.pages.FavouriteReports;
import com.reports.pages.FinancialReports;
import com.reports.pages.RunFavouriteReport;

public class TestBuilders extends BaseTest{

	TestLoginPage testLoginPage;
	FinancialReports financialReport;
	BuiderElements builderElements;
	DateProvider getDate;
	NameProvider Name;
	FavouriteReports favouriteReports;
	String fromDate;
	String toDate;
	RunFavouriteReport runReport;

	public TestBuilders()
	{
		builderElements = new BuiderElements(driver);
	}

	public TestBuilders(String userName,String passWord,String shouldInitlization)
	{
		testLoginPage = new TestLoginPage(userName,passWord,shouldInitlization);
		
		builderElements = new BuiderElements(driver);
		
		getDate = new DateProvider();
		
		 Name= new NameProvider();
		 
		 favouriteReports = new FavouriteReports(driver);
		 
		 runReport = new RunFavouriteReport(driver);
	}
	
	
	public String loginAsAdmin()
	{
		builderElements.clickOnLogOut();
		TestLoginPage.logIn(USERNAME2,PASSWORD2);
		return driver.getCurrentUrl();	
	}
	
	public String loginAsUser()
	{
		builderElements.clickOnLogOut();
		TestLoginPage.logIn(USERNAME,PASSWORD);
		return driver.getCurrentUrl();	
	}
	
	public String loginAsUser2()
	{
		builderElements.clickOnLogOut();
		TestLoginPage.logIn(USERNAME3,PASSWORD3);
		return driver.getCurrentUrl();	
	}
	
	public String loginAsUser3()
	{
		builderElements.clickOnLogOut();
		TestLoginPage.logIn(USERNAME4,PASSWORD4);
		return driver.getCurrentUrl();	
	}
	
//Test 1
	public boolean test3MonthPdf(String fromDate1,String toDate1)
	{
		builderElements.enterFromAndToDate(fromDate1, toDate1);
//		builderElements.enterFromAndToDate("01-01-2019", "01-05-2019");
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 3 Months Duration and generate the Report."); 					
	}
	
//Test 2
	public boolean test3MonthCsv()
	{
		builderElements.enterFromAndToDate("01-01-2019", "01-05-2020");
		builderElements.clickOnCsvButton();
		
		boolean a= builderElements.verifyDateRangeAlertMsg("Please Select 3 Months Duration and generate the Report.");
	    
		return a;
	}
	
	
//Test 3	
	public boolean test3MonthText()
	{
		builderElements.enterFromAndToDate("01-04-2019", "01-04-2020");
		builderElements.clickOnCsvButton();
		
        return builderElements.verifyDateRangeAlertMsg("Please Select 3 Months Duration and generate the Report.");	
	}

//Test 4	
	public boolean testDateFieldsBlank_pdf() 
	{
		builderElements.enterFromAndToDate("", "");
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 5	
	public boolean  testDateFieldsBlank_csv() 
	{
		builderElements.enterFromAndToDate("", "");
		builderElements.clickOnCsvButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 6	
	public boolean testDateFieldsBlank_text() 
	{
		builderElements.enterFromAndToDate("", "");
		builderElements.clickOnTextButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		

	}
	
//Test 7
	public boolean testFromDateFieldBlank_pdf() 
	{
		builderElements.enterFromAndToDate("", "01-04-2019");
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 8
	public boolean testToDateFieldBlank_pdf() 
	{
		builderElements.enterFromAndToDate("01-04-2019", "");
		builderElements.clickOnPdfButton();
		
		return	builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 9
	public boolean testFromDateFieldBlank_cvs() 
	{
		builderElements.enterFromAndToDate("", "01-04-2019");
		builderElements.clickOnCsvButton();
		
		return	builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 10
	public boolean testToDateFieldBlank_cvs() 
	{
		builderElements.enterFromAndToDate("01-04-2019", "");
		builderElements.clickOnCsvButton();
		
		return	builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 11
	public boolean testFromDateFieldBlank_text() 
	{
		builderElements.enterFromAndToDate("", "01-04-2019");
		builderElements.clickOnTextButton();
		
		return	builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}

//Test 12
	public boolean testToDateFieldBlank_text() 
	{
		builderElements.enterFromAndToDate("01-04-2019", "");
		builderElements.clickOnTextButton();
		
		return	builderElements.verifyDateRangeAlertMsg("Please select From and To Date's.");		
	}
	
//Test 13
	public boolean testDateFieldsBlank_favSaveButton() 
	{
		builderElements.enterFromAndToDate("", "");
		builderElements.setFavName("MyFave_Auto1");
		builderElements.clickOnSaveButton();
		
		return	builderElements.verifyDateRangeAlertMsg("From Date is required");		
	}
	
//Test 14
	public boolean testFromDateFieldBlank_favSaveButton() 
	{
		builderElements.enterFromAndToDate("", "01-04-2019");
		builderElements.setFavName("MyFave_Auto1");
		builderElements.clickOnSaveButton();
		
		return	builderElements.verifyDateRangeAlertMsg("From Date is required");		
	}
	
//Test 15
	public boolean testToDateFieldBlank_favSaveButton() 
	{
		builderElements.enterFromAndToDate("01-04-2019", "");
		builderElements.setFavName("MyFave_Auto1");
		builderElements.clickOnSaveButton();
		
	    return	builderElements.verifyDateRangeAlertMsg("To Date is required");		
	}
	
//Test 16
	public boolean checkForThisFinancialYear()
	{
		
		return builderElements.checkYearOptionDateRangeDropDown("This Financial Year");
	}
	
//Test 17
	public boolean checkForPreviousFinancialYear()
	{
		
		return builderElements.checkYearOptionDateRangeDropDown("Previous Financial Year");
	}
	
//Test 18 ####Should provide real time dates as argument####
	public boolean verifyDateFieldsForYesterdayOptions()
	{
		builderElements.selectDateRangeOPtion("Today");
		builderElements.selectDateRangeOPtion("Yesterday");
		return builderElements.dateFieldsForDateOptions(getDate.yesterday(),getDate.yesterday());
	}
	
//Test 19 ####Should provide real time dates as argument####
	public boolean verifyDateFieldsForTodayOptions()
	{
		builderElements.selectDateRangeOPtion("Today");
		return builderElements.dateFieldsForDateOptions(getDate.currentDate(),getDate.currentDate());
	}

	
//Test 20 ####Should provide real time dates as argument####
	public boolean verifyDateFieldsForPreviousMonthOptions()
	{
		builderElements.selectDateRangeOPtion("Previous Month");
		return builderElements.dateFieldsForDateOptions("01-05-2019","30-05-2019");
	}

	
//Test 21 ####Should provide real time dates as argument####
	public boolean verifyDateFieldsForThisMonthOptions()
	{
	    builderElements.selectDateRangeOPtion("This Month");
		return builderElements.dateFieldsForDateOptions(getDate.monthStartDate(),getDate.monthEndDate());
	}
	
//Test 22
	public boolean verifyDateFieldsForFromPastToFuture_pdf()
	{
		builderElements.enterFromAndToDate("30-04-2019", "01-04-2019");
		builderElements.clickOnPdfButton();
		return builderElements.checkForInvaliedDate("To date cannot be less than from date");
	}
	
//Test 23
	public boolean verifyDateFieldsForFromPastToFuture_csv()
	{
		builderElements.enterFromAndToDate("30-04-2019", "01-04-2019");
		builderElements.clickOnCsvButton();
		return builderElements.checkForInvaliedDate("To date cannot be less than from date");
	}
	
//Test 24
	public boolean verifyDateFieldsForFromPastToFuture_text()
	{
		builderElements.enterFromAndToDate("30-04-2019", "01-04-2019");
		builderElements.clickOnTextButton();
		return builderElements.checkForInvaliedDate("To date cannot be less than from date");
	}
	
//Test 25
	public boolean verifyDateFieldsForFromPastToFuture_fav()
	{
		builderElements.enterFromAndToDate("30-04-2019", "01-04-2019");
		builderElements.setFavName("MyFav_Auto1");
		builderElements.clickOnSaveButton();
		return builderElements.checkForInvaliedDate("To date cannot be less than from date");
	}

	
//Test 26 ####Should provide real time dates as argument####
	public boolean verifyForYesterdaysDateOnReFreshing()
	{
		builderElements.selectDateRangeOPtion("This Month");
		builderElements.refresh();
		boolean a=builderElements.yesterdaysDateOnReFreshing(getDate.yesterday());
		
		builderElements.selectDateRangeOPtion("Previous Month");
		builderElements.refresh();
		boolean b=builderElements.yesterdaysDateOnReFreshing(getDate.yesterday());
		
		builderElements.selectDateRangeOPtion("Today");
		builderElements.refresh();
		boolean c=builderElements.yesterdaysDateOnReFreshing(getDate.yesterday());
		
		builderElements.selectDateRangeOPtion("Yesterday");
		builderElements.refresh();
		boolean d=builderElements.yesterdaysDateOnReFreshing(getDate.yesterday());
		
		if(a&b&c&d) return true;
		else return false;
	}
	
//Test 27
	public boolean checkAutoCustomDateOption()
	{
		builderElements.clickOnToDateFields();
		boolean a = builderElements.autoCustomDateOption();
		
		
		
		builderElements.clickOnFromDateFields();
		boolean b = builderElements.autoCustomDateOption();
		
		if(a&b) return true;
		else return false;
	}
	
	//Pending: *Run builder in corporate office crentar  *Saving favorut with allowed *92Days
	
//	public static void main(String[] args)
//	{
//		TestBuilders x = new TestBuilders();
//		System.out.println(x.getDate.yesterday());
//	}
	
//Test 28
	
	public boolean checkForCorporateOffice(String dateRangeOptions, String button)
	{
//		if(builderElements.getCurrentUserRole().compareTo("InstaAdmin")!=0)
//		{
//			builderElements.clickOnLogOut();
//			new TestBuilders(USERNAME2,PASSWORD2,"N");
//			
////   		loginAsAdmin();
////			navigateToRevenueReportBuilder();
//	    }
		
		builderElements.selectDateRangeOPtion(dateRangeOptions);
		switch (button) {
		case "pdf":builderElements.clickOnPdfButton();
		break;
		
		case "csv":builderElements.clickOnCsvButton();
		break;	
		
		case "text":builderElements.clickOnTextButton();
		break;
			
		case "fav":
			{
				builderElements.setFavName("My_Fav_Auto2");
				builderElements.clickOnSaveButton();
			}
		break;
		default:return false;
		}
		
		return builderElements.checkForInvaliedDate("Report should be run for a specific center only. Choose a specific center and run the report.");
	}
	
//Test 29 //+ive cases for this is rquired (testcases for acceptance date range)
	
	public boolean verifyAllowedReportDuration(String option,String validationMessage)
	{
		builderElements.enterFromAndToDate("01-04-2019", "30-04-2030");
		builderElements.setFavName("My_Fav_Auto2");
		builderElements.selectAllowedDateOPtion(option);
		builderElements.clickOnSaveButton();
		return builderElements.verifyDateRangeAlertMsg(validationMessage);
	}
	
	public boolean verifyPdfDateRange(String option) throws InterruptedException
	{
		//declaire a int and incerment to close the driverclose
		
		String addrMain = driver.getWindowHandle();//Stores Main Window Address

		if(option!=null)
			{
			builderElements.selectDateRangeOPtion(option);// Dependent code we have to test once
			builderElements.numOfFieldsSelected();
			}
	
//		try {
//					builderElements.clickOnPdfButton();
//					driver.getTitle();
//			} 
//		catch (UnhandledAlertException f) 
//			{
//			   		builderElements.clickOnPdfButton();
//			        builderElements.switchAndAcceptAlert();
//			}
		
		builderElements.clickOnPdfButton();
	
		Set<String> allTabAddress =driver.getWindowHandles();
		
		for(String addr : allTabAddress)
		{
			if(!addrMain.equalsIgnoreCase(addr))
			{
				driver.switchTo().window(addr);
			}
		}
		
		System.out.println("stage2 "+driver.getTitle());
		
		try{
			WebDriverWait wait = new WebDriverWait(driver,90);
			wait.until(ExpectedConditions.visibilityOf(builderElements.pdfDate));
			}
		
		catch (Exception TimeoutException) 
		{
			System.out.println("Time out error");
			
				System.out.println(addrMain+" =====> "+driver.getWindowHandle());
				driver.close();		 
			
			System.out.println(addrMain+" =====> "+driver.getWindowHandle());
			driver.switchTo().window(addrMain);
			Thread.sleep(2000);
			return false;
		}
		
		System.out.println(driver.getTitle());

//	    int x=0;
		
//		while (!builderElements.pdfDate.isDisplayed()) 
//		{
//			x=(x+1)*2;
//			Thread.sleep(2000);
//			System.out.println("Waiting "+x+" mins");
//		}
		
		System.out.println("ddscsdfsdfsdf");
		String pdfDateRange = builderElements.getPdfDate();
		
		 fromDate = pdfDateRange.substring(0, 10);
		 toDate = pdfDateRange.substring(14, 24);
		
		 System.out.println("from :"+ fromDate);
		 System.out.println("to :"+ toDate);

		
		 if(!pdfDateRange.equals(null)) 
		 {
			 driver.close();
		 }
	
		driver.switchTo().window(addrMain);
		return builderElements.dateFieldsForDateOptions(fromDate,toDate);
		}
	
	public void textDateRange(String option) throws AWTException, InterruptedException
	{
		String addrMain = driver.getWindowHandle();
		builderElements.selectDateRangeOPtion(option);
		builderElements.clickOnTextButton();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Thread.sleep(3000);
		driver.navigate().to("http://10.8.55.122/instanmc/billing/RevenueReports.do?screenId=rep_revenue_builder&reportName=Revenue+Report&method=getText&outputMode=text&_searchMethod=getScreen&_parent_report_name=Revenue+Report+Builder&selDateRange=td&srjsFile=null&reptDescFile=RevenueReport.srjs&reportGroup=Financial+Reports&current_user=Doc001&print_title=Revenue+Report&_myreport=nosearch&reportType=list&dateFieldSelection=finalized_date&_sel=td&fromDate=24-04-2019&toDate=24-04-2019&listFields=bill_no&listFields=bill_patient_full_name&listFields=posted_date&listFields=chargehead_name&listFields=act_description&listFields=amount&listFields=discount&listFields=net_amount&baseFontSize=10&listGroups=&listGroups=&listGroups=&sumGroupHoriz=&sumGroupVert=&sumGroupVertSub=&trendType=day&trendGroupVert=&trendGroupVertSub=&vtrendGroupHoriz=&vtrendType=day&vtrendGroupVertSub=&customOrder1=&customOrder2=&filter.1=&filterOp.1=eq&allowed_report_duration=&_report_name=&_actionId=rep_revenue_builder&pdfcstm_option=un_needed&userNameNeeded=Y&pdfcstm_option=dt_needed&dt_needed=true&pdfcstm_option=hsp_needed&hsp_needed=true&hsp_needed_h=false&pdfcstm_option=pgn_needed&pgn_needed=true&grpn_needed=false&skip_repeated_values=false&pdfcstm_option=filterDesc_needed&filterDesc_needed=true");
		if(builderElements.downloadBTN.isEnabled()) 
		{
		builderElements.downloadBTN.click();
		}
//		Set<String> allTabAddress =driver.getWindowHandles();
//		
//		for(String addr : allTabAddress)
//		{
//			System.out.println(addr+" ==== "+allTabAddress);
//			System.out.println(!addrMain.equalsIgnoreCase(addr));
//			
//			if(!addrMain.equalsIgnoreCase(addr))
//			{	
//				System.out.println(allTabAddress);
//				
//				driver.switchTo().window(addr);
//				
//				System.out.println(builderElements.downloadBTN.isEnabled());
//				
//				
//				
//			}
//		}
		
		Robot robot = new Robot();
		
			
//			for(int i=0;i<=5;i++)
//			{
//			robot.keyPress(KeyEvent.VK_TAB);
//			
//			}
		
		robot.mouseMove(900,550);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		robot.keyPress(KeyEvent.VK_ENTER);
     	
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main (String [] args)
	{
		TestBuilders obj = new TestBuilders(USERNAME,PASSWORD,"Y");
		driver.navigate().to("http://10.8.55.122/instanmc/billing/RevenueReports.do?method=getScreen&screenId=rep_revenue_builder&reportName=Revenue+Report&method=saveFavourite&outputMode=pdf&selDateRange=pd&srjsFile=null&reptDescFile=RevenueReport.srjs&reportGroup=Financial+Reports&current_user=Doc001&print_title=Revenue+Report&reportType=list&dateFieldSelection=finalized_date&fromDate=24-04-2019&toDate=24-04-2019&listFields=bill_no&listFields=bill_patient_full_name&listFields=posted_date&listFields=chargehead_name&listFields=act_description&listFields=amount&listFields=discount&listFields=net_amount&baseFontSize=10&trendType=day&vtrendType=day&filterOp.1=eq&pdfcstm_option=un_needed&pdfcstm_option=dt_needed&pdfcstm_option=hsp_needed&pdfcstm_option=pgn_needed&pdfcstm_option=filterDesc_needed&userNameNeeded=Y&dt_needed=true&hsp_needed=true&hsp_needed_h=false&pgn_needed=true&grpn_needed=false&skip_repeated_values=false&filterDesc_needed=true&_savedfavourite=2329_RRBIH_SelectOption%203%20mon&prgkey=59428951");
		obj.createFavourites("3");
	}
	
	
	public void createFavourites(String options)
	{
		
		if(builderElements.currentCenter().equals("Corporate Office"))
		{
			builderElements.selectCenter("NMC Deira");
		}
//		Alert alert;
//		String msg;
		String newFaveName = "";
		
		builderElements.selectAllowedDateOPtion(options);
//		do {
			newFaveName = Name.favName(driver.getTitle(),options);
			builderElements.setFavName(newFaveName);
			
			String title = builderElements.currentPageTitle();
			
			try {
				builderElements.clickOnSaveButton();
				driver.getTitle();
				} 
	catch (UnhandledAlertException f) 
		{
				builderElements.clickOnSaveButton();
		        builderElements.switchAndAcceptAlert();
		}
				
			if(!title.equals(builderElements.currentPageTitle()))
			{
				builderElements.switchAndAcceptAlert();
			}
//			 alert = driver.switchTo().alert();
//			 msg = alert.getText();
//			 if(msg!=null) alert.accept();
//		} while (msg!=null);
		System.out.println(newFaveName);
		favouriteNames.add(newFaveName);
		//favouriteNames[i][j] = newFaveName;
	}
	
	
	public boolean checkFavForDefaultDate(String favNameFromList) throws InterruptedException, AWTException
	{
		if(!driver.getTitle().equals("Favourite Reports"))
		{
			builderElements.goBackToHomePage();
			favouriteReports.clickOnFavouriteReportsDropDown();
			favouriteReports.clickOnFavouriteReportsLink();
		}
		favouriteReports.clickOnClearLink();
		favouriteReports.clickOnMoreOption();
		favouriteReports.enterReportName(favNameFromList);
		
		favouriteReports.clickOnSearchBTN();
	
		String addrMain;
		
		addrMain = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		favouriteReports.editAccessRights(driver);
		
		Thread.sleep(2000);
	      Set<String> allTabAddress =driver.getWindowHandles();
			
			for(String addr : allTabAddress)
			{
				if(!addrMain.equalsIgnoreCase(addr))
				{
					driver.switchTo().window(addr);	
				}
			}
		favouriteReports.clickOnAllowDateChangeCheckBox();
		favouriteReports.selectAvailableRolesSelectBox("appRole1");
		favouriteReports.clickOnaddBTN();
		favouriteReports.clickOnAccessSaveButton();
		
		driver.close();
		driver.switchTo().window(addrMain);
		allTabAddress.clear();
		
		addrMain = driver.getWindowHandle();
		
		favouriteReports.runReport(driver);
		
		Thread.sleep(2000);
      Set<String> allTabAddress2 =driver.getWindowHandles();
		
		for(String addr : allTabAddress2)
		{
			if(!addrMain.equalsIgnoreCase(addr))
			{
				driver.switchTo().window(addr);	
			}
		}
		
		
		
		verifyPdfDateRange(null);
		boolean fromdateVerification = fromDate.equals(getDate.monthStartDate());//getDate.monthStartDate() while testing for all test cases
		boolean todateVerification = toDate.equals(getDate.monthEndDate());//change this to getDate.monthEndDate() while testing for all test cases
		
		driver.close();
		driver.switchTo().window(addrMain);
		allTabAddress2.clear();
		
		if(fromdateVerification&todateVerification) return true;
		else return false;
	}
	
	public boolean checkFavForOtherDate(String favNameFromList) throws InterruptedException, AWTException
	{
		if(!driver.getTitle().equals("Favourite Reports"))
		{
			builderElements.goBackToHomePage();
			favouriteReports.clickOnFavouriteReportsDropDown();
			favouriteReports.clickOnFavouriteReportsLink();
		}
		favouriteReports.clickOnClearLink();
		favouriteReports.clickOnMoreOption();
		favouriteReports.enterReportName(favNameFromList);
		
		favouriteReports.clickOnSearchBTN();
		
		String addrMain;
		addrMain = driver.getWindowHandle();
		
		favouriteReports.runReport(driver);
	
		Thread.sleep(2000);
      Set<String> allTabAddress =driver.getWindowHandles();
		
		for(String addr : allTabAddress)
		{
			if(!addrMain.equalsIgnoreCase(addr))
			{
				driver.switchTo().window(addr);
//				addrMain = addr;	
			}
		}
		
		
		
		verifyPdfDateRange(null);
		boolean fromdateVerification = fromDate.equals(getDate.yesterday());//getDate.monthStartDate() while testing for all test cases
		boolean todateVerification = toDate.equals(getDate.yesterday());//change this to getDate.monthEndDate() while testing for all test cases
		
		driver.close();
		driver.switchTo().window(addrMain);
		allTabAddress.clear();
		
		if(fromdateVerification&todateVerification) return true;
		else return false;
	}
	

	public boolean testRunFavReport(String favNameFromList) throws AWTException, InterruptedException
	{
		String expectedMessage="";
	if(!driver.getTitle().equals("Favourite Reports"))
	{
		builderElements.goBackToHomePage();
		favouriteReports.clickOnFavouriteReportsDropDown();
		favouriteReports.clickOnFavouriteReportsLink();
	}
		favouriteReports.clickOnClearLink();
		favouriteReports.clickOnMoreOption();
		favouriteReports.enterReportName(favNameFromList);
		
		favouriteReports.clickOnSearchBTN();
		
		String addrMain;
		addrMain = driver.getWindowHandle();
		
		favouriteReports.runReport(driver);
		
		builderElements.switchTabs(addrMain);
		
		runReport.clickOnOtherDate();
		
		builderElements.selectDateRangeOPtion("Custom Date");
		
		builderElements.enterFromAndToDate("25-04-2019", "25-04-2030");
		
		driver.getTitle();
		
		runReport.clickonFavPdfButton();
		
		int len = favNameFromList.length();
		char a= favNameFromList.charAt(len-5);

		int c=Character.getNumericValue(a);
		
		switch (c) {
		case 1: expectedMessage = "Please Select 1 Month Duration and generate the Report.";
			
			break;
			
		case 2: expectedMessage = "Please Select 2 Months Duration and generate the Report.";
		
		break;
		
		case 3: expectedMessage = "Please Select 3 Months Duration and generate the Report.";
		
		break;

		default:
			break;
		}
		
		Alert alert = driver.switchTo().alert();
		
		String actualMessage = alert.getText();
		alert.accept();
		
		driver.close();
		driver.switchTo().window(addrMain);
		
		if(actualMessage.equalsIgnoreCase(expectedMessage)) return true;
		else return false;
	
	}
	
	public boolean checkFavForCorporate(String favNameFromList) throws AWTException, InterruptedException
	{
		if(!driver.getTitle().equals("Favourite Reports"))
		{
			builderElements.goBackToHomePage();
			favouriteReports.clickOnFavouriteReportsDropDown();
			favouriteReports.clickOnFavouriteReportsLink();
		}
		favouriteReports.clickOnClearLink();
		favouriteReports.clickOnMoreOption();
		favouriteReports.enterReportName(favNameFromList);
		
		favouriteReports.clickOnSearchBTN();
		
		String addrMain;
		addrMain = driver.getWindowHandle();
		
		favouriteReports.runReport(driver);
		
		builderElements.switchTabs(addrMain);
		
		runReport.clickonFavPdfButton();
		
		Alert alert = driver.switchTo().alert();
		
		String actualMessage1 = alert.getText();
		alert.accept();
		
		
		
		runReport.clickOnOtherDate();
		
		builderElements.selectDateRangeOPtion("Custom Date");
		
		builderElements.enterFromAndToDate("25-04-2019", "25-04-2030");
		
		driver.getTitle();
		
		runReport.clickonFavPdfButton();
		
		alert = driver.switchTo().alert();
		
		String actualMessage2 = alert.getText();
		alert.accept();
		
		driver.close();
		driver.switchTo().window(addrMain);
		
		String expectedMsg = "Report should be run for a specific center only. Choose a specific center and run the report.";
		
		if(actualMessage1.equalsIgnoreCase(expectedMsg)&actualMessage2.equalsIgnoreCase(expectedMsg)) return true;
		else return false;
	}
	
//	public void test() throws AWTException
//	{
//		driver.navigate().to("http://10.8.55.122/instanmc/pages/Reports/FavouriteReportsDashboard.do?_method=getReport&frequently_viewed=Y&sortOrder=report_title");
//		favouriteReports.test(driver);
//	}
	
}
