package com.reports.pages;

import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.reports.generics.BaseTest;

public class BuiderElements extends BaseTest
{

	@FindBy(id="_sel")
	WebElement dateRangeDropdown;
   
	@FindBy(id = "fromDate")
	WebElement fromDate;
	
	@FindBy(id = "toDate")
	WebElement toDate;
	
	@FindBy(xpath = "//button[@title=\"PDF Report\"]")
	WebElement pdfButton;
	
	@FindBy(xpath = "//button[@title=\"CSV Report\"]")
	WebElement csvButton;
	
	@FindBy(xpath = "//button[@title=\"Text Report\"]")
	WebElement textButton;
	
	@FindBy(id = "Reset")
	WebElement resetBuilder;
	
	@FindBy(name = "allowed_report_duration")
	WebElement allowedReportDuration;
	
	@FindBy(id = "_report_name")
	WebElement favName;
	
	@FindBy(xpath = "//input[@value=\"Save\"]")
	WebElement saveButton;
	
	
	@FindBy(xpath = "//img[@src=\"/instanmc/icons/logout.png\"]")
	WebElement logOutIMG; 
	
	@FindBy(xpath = "//select[@name=\"userRoleId\"]")
	WebElement userRoleDropDown;
	
//	@FindBy(xpath = "/html/body/div[1]/div[2]/div[4]/div/div/div[2]/span[3]")
//	public
//	WebElement pdfDate;
	
	@FindBy(xpath = "//*[contains(text(),'-2019 to ')]")//year is hard coded here,
	public                         
	WebElement pdfDate;
	
	@FindBy(xpath="//input[@value='Download']")
	public
	WebElement downloadBTN;
	
	@FindBy(xpath="//select[@name = 'modifiedCenterId']")
	public
	WebElement centerDropDown;
	
	@FindBy(xpath="//select[@id = 'listFields']")
	public
	WebElement fieldsListBox;
	
	@FindBy(xpath="//*[@id=\"listFieldsDiv\"]/fieldset/table/tbody/tr/td[4]/div/button[3]/img")
	public
	WebElement deselecButton;
	
	public BuiderElements(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void selectDateRangeOPtion(String dateOption) 
	{
		Select select = new Select(dateRangeDropdown);
		select.selectByVisibleText(dateOption);
	}
	
	public void refresh() 
	{
		driver.navigate().refresh();
	}
	
	public void enterFromAndToDate(String fromDateEnter,String toDateEnter) 
	{
		fromDate.clear();
		fromDate.sendKeys(fromDateEnter);
		toDate.clear();
		toDate.sendKeys(toDateEnter);
	}
	
	public void clickOnFromDateFields()
	{
		fromDate.click();
	}
	
	public void clickOnToDateFields()
	{
		toDate.click();
	}
	
	public void clickOnPdfButton() 
	{
		pdfButton.click();
	}
	
	public void clickOnCsvButton() 
	{
		csvButton.click();
	}
	
	public void clickOnTextButton() 
	{
		textButton.click();
	}
	
	public void selectAllowedDateOPtion(String dateOption) 
	{
		Select select = new Select(allowedReportDuration);
		select.selectByVisibleText(dateOption);
	}
	
	public void setFavName(String enterFavName) 
	{
		favName.clear();
		favName.sendKeys(enterFavName);
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public boolean verifyDateRangeAlertMsg(String expectedMsg )
	{
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		
		if(alertMsg.equalsIgnoreCase(expectedMsg))
		{
			
			alert.accept();
			return true;
		}
		
		else
		{
			//softAssert.assertFalse(false, "Message7");;
			System.out.println("Actual Message Displayed is :"+alertMsg + "\n Expected Message is :"+ expectedMsg);
			
			alert.dismiss();
			return false;
		}
//		return softAssert;
		
	}
	
	public boolean checkYearOptionDateRangeDropDown (String optionValue)
	{
		Select select = new Select(dateRangeDropdown);
		List<WebElement>allOptions = select.getOptions();
		int count = allOptions.size();
		int optCount = 0;
	
		/*
		List<String>allText = new ArrayList<String>();
		for(int i=0;i<=count;i++) 
		{
			String text=allOptions.get(i).getText();
		    allText.add(text);
		}
		*/
		
		for(int i=0;i<count;i++)
		{
			if(allOptions.get(i).getText().equals(optionValue))
					{
				optCount++;
					}
			
		}
		
		if(optCount>0) return false;
		return true;
	}
	
	public boolean dateFieldsForDateOptions(String FromDate, String ToDate)
	{
		if(fromDate.getAttribute("value").equals(FromDate) &&  toDate.getAttribute("value").equals(ToDate))return true;
		return false;
	}
	
	
	public boolean checkForInvaliedDate(String expectedMsg)
	{
	    Alert alert = driver.switchTo().alert();
	    String alertMsg =  alert.getText();
	    
	    if(alertMsg.equalsIgnoreCase(expectedMsg))
		{	
			alert.accept();
			return true;
		}
		
		else
		{
			System.out.println("Actual Message Displayed is :"+alertMsg + "\n Expected Message is :"+ expectedMsg);		
			alert.dismiss();
			return false;
		}
	}
	
	public boolean yesterdaysDateOnReFreshing(String yesterdaysDate)
    {
      if(fromDate.getAttribute("value").equals(yesterdaysDate)&toDate.getAttribute("value").equals(yesterdaysDate)) return true;
      else return false;
      
	}
	
	
	public boolean autoCustomDateOption()
	{
		Select select = new Select(dateRangeDropdown);
	  if(select.getFirstSelectedOption().getText().equals("Custom Date"))return true;
	  else return false;
	}
	
	public void clickOnLogOut() 
	{
		logOutIMG.click();
	}
	
	public String getCurrentUserRole() {
		
		Select select = new Select(userRoleDropDown);
		System.out.println(select.getFirstSelectedOption().getText()+" :: THIS IS THE ROLE");
		return select.getFirstSelectedOption().getText();
	}
	
	public String getPdfDate()
	{
		String date = pdfDate.getText();
		return date;
	}
	
	public void goBackToHomePage()
	{
		driver.get("http://10.8.55.122/instanmc/home.do");
	}
	
	public String currentCenter()
	{
		Select select = new Select(centerDropDown);
		return select.getFirstSelectedOption().getText();
	}
	
	public void selectCenter(String center)
	{
		Select select = new Select(centerDropDown);
		select.selectByVisibleText(center);
	}
	
	public void switchTabs(String addrMain) throws InterruptedException
	{
		Thread.sleep(2000);
	      Set<String> allTabAddress =driver.getWindowHandles();
			
			for(String addr : allTabAddress)
			{
				if(!addrMain.equalsIgnoreCase(addr))
				{
					driver.switchTo().window(addr);
//					addrMain = addr;	
				}
			}
			
			allTabAddress.clear();
	}
	
	
	public String currentPageTitle()
	{
		return driver.getTitle();
	}
	
	public void switchAndAcceptAlert()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void numOfFieldsSelected()
	{
		Select select = new Select(fieldsListBox);
		List<WebElement> listBox =select.getOptions();
		int size = listBox.size();
		if(size>4) {
			for(int i=size;i>2;i--)
			{
				driver.findElement(By.xpath(" //*[@id=\"listFields\"]/option["+i+"]")).click();
				deselecButton.click();
			}
		}
	}
	
	
	
}
