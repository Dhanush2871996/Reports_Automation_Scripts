package com.reports.testcases;


import com.reports.generics.BaseTest;
import com.reports.generics.Login_Page;

public class TestLoginPage extends BaseTest {

static Login_Page loginObj;
	
    public TestLoginPage(String userNAme,String passWOrd,String shouldInitlization)
    {
    	if(shouldInitlization.equals("Y"))
    		{
    		Initlization();
    		loginObj= new Login_Page(driver);
    		}
    	
		 
		loginObj.setUserName(userNAme);
		loginObj.setPassword(passWOrd);
		loginObj.clickOnButton();
    }
	
    static public void logIn(String userNAme,String passWOrd)
    {
    	loginObj= new Login_Page(driver);
		 
		loginObj.setUserName(userNAme);
		loginObj.setPassword(passWOrd);
		loginObj.clickOnButton();
    }
    
}
