package com.reports.generics;

import java.util.ArrayList;
import java.util.List;

public interface IAutoReportConst 
{

	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "/home/debjyoti/Desktop/Dhanush_Documents/KT_22-02-2019/OT charges and Anestisia harges calculation/chromedriver";
	
	String FIREFOX_KEY = "webdriver.gecko.driver";
	String FIREFOX_VALUE = "/home/manish/Desktop/Driver/geckodriver";
	
	
	long ETO = 10;
	long ITO = 8;
	
	String URL = "http://10.8.55.122/instanmc/loginForm.do";
	String USERNAME = "Doc001";
	String PASSWORD = "Insta@123";
	
	String USERNAME2 = "InstaAdmin";
	String PASSWORD2 = "InstaAdmin";
	
	String USERNAME3 = "manish01";
	String PASSWORD3 = "Nmc@1234";
	
	
	String USERNAME4 = "manishDoc";
	String PASSWORD4 = "Nmc@1234";
	
	String[][] dateRangeOptions = {{"Yesterday", "pdf"},
			                       {"Custom Date", "pdf"},
			                       {"Today", "pdf"},
			                       {"This Month", "pdf"},
			                       {"Previous Month","pdf"},
								   {"Today", "csv"},
								   {"Previous Month", "text"},
								   {"This Month", "csv"}};//Still combination of options and buttons should be provided
	
//	,
//	   {"Yesterday","fav"},
//	   {"This Month","fav"},
//	   {"Custom Date","fav"}
	
	String[][] allowedReportDurationoption = {{"1", "Please Select 1 Month Duration and save the report."},
			   								  {"2", "Please Select 2 Months Duration and save the report."},
			   								  {"3", "Please Select 3 Months Duration and save the report."},
			   								  {"-- Select --", "Please Select 3 Months Duration and save the report."}};
	
	List <String> favouriteNames = new ArrayList<String>();
	//String[][] favouriteNames = new String[10][2];
	

}
