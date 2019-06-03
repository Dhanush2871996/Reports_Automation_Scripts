package com.reports.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditCustomReportRights 
{
	Select select;
	
	//************* Edit Report Rights start******************//
	//Note: Use Mouse Action to Left click on builder
	@FindBy(id = "allow_run_report_for_corporate_ofc")
	WebElement runReportForCorporateOffice;
	
	@FindBy(xpath = "//select[@name ='allowed_report_duration']")
	WebElement selectAllowedReportDuration;
	
	@FindBy(xpath = "//select[@name = 'allowed_report_duration']/option[2]")
	WebElement option2;
	
	@FindBy(xpath = "//input[@name=\"save_button\"]")
	WebElement saveBTN;
	
	@FindBy(xpath = "//select[@id='avlbListFlds']")
	WebElement selectAvailableUser;
	
	@FindBy(xpath = "//input[@name=\"addLstFldsButton\"]")
	WebElement addAvailUserBTN;
	
	@FindBy(linkText = "Custom Report DashBoard")
	WebElement customReportDashBoardLink;
	
	@FindBy(xpath = "//select[@id='listFields']")
	WebElement selectedUser;

	public EditCustomReportRights(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRunReportForCorporateOffice()
	{
		System.out.println("Before clicking : " +selectAllowedReportDuration.isEnabled());
		selectAllowedReportDuration.click();
		System.out.println("After clicking : " +selectAllowedReportDuration.isEnabled());
	}
	
	public void selectAllowedReportDuration(String month)
	{
		
		Select select1 = new Select(selectAllowedReportDuration);
		select1.selectByVisibleText(month);
		
	}
	
	public void selectAvailableUser(String userName)
	{
		Select select2 = new Select(selectAvailableUser);
		select2.selectByValue(userName);
	}
	
	public void clickOnAddAvailUserBTN()
	{
		addAvailUserBTN.click();
	}
	
	public void clickOnSaveBTN()
	{
		saveBTN.click();
	}
	//************* Edit Report Rights end******************//
	
	public boolean checkForSelectedUser(String userName)
	{
		int a =0;
		Select select = new Select(selectedUser);
		
		List<WebElement>  list= select.getOptions();
		
		for(int b=0; b<list.size(); b++)
		{
		    if(list.get(b).getText().contains("manishDoc"))a++;
		}
		
		if(a>0)return false;
		else return true;
		
//		Boolean val = selectedUser.isSelected();
//		return val;
	}
	
}