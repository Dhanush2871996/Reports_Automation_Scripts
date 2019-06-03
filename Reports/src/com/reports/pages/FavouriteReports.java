package com.reports.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FavouriteReports
{
	Select select;
	
	@FindBy(xpath="//span[text() = 'Favourite Reports']")
	WebElement favouriteReportsDropDown;
	
	@FindBy(linkText="Favourite Reports")
	WebElement favouriteReportsLink;
	
	@FindBy(linkText = "Clear")
	WebElement clearLink;
	
	@FindBy(xpath = "//a[@id= \"aMore\"]")
	WebElement moreOption;
	
	@FindBy(xpath = "//input[@name= \"report_title\"]")
	WebElement favReportName;
	
	@FindBy(xpath = "//input[@id= \"Search\"]")
	WebElement searchBTN;
	
	@FindBy(xpath = "//input[@id = \"_Total Advances Collected\"]")
	WebElement checkBox;
	
	@FindBy(xpath = "//input[@name= \"delete_button\"]")
	WebElement deleteFav;
	
	@FindBy(xpath = "//input[@name= \"freq_button\"]")
	WebElement toggelFrequrentlyViewed;
	
	//@FindBy(xpath = "//table[@id= \"dragTable\"]")
	//WebElement table;
	
	@FindBy(xpath = "//tr[@id= \"toolbarRow0\"]")
	WebElement tableRowZero;
	
	@FindBy(id = "toolbarAction_defaultRunReport")
	WebElement runLink;
	
	@FindBy(id = "toolbarAction_defaultRights")
	WebElement editAccessRightsLink;
	
	//*******************Edit Access fav Rights start ***********************//
	
	@FindBy(id = "aloow_date_change")
	WebElement allowDateChangeCheckBox;
	
	@FindBy(id = "avlbListFlds")
	WebElement availableRolesSelectBox;
	
	@FindBy( id = "listFields")
	WebElement selectedRolesSelectBox;
	
	@FindBy(name = "save_button")
	WebElement accessSaveButton;
	
	@FindBy(name = "addLstFldsButton")
	WebElement addBTN;
	
	//*******************Edit Access fav Rights ends***********************//
	
	public FavouriteReports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnClearLink()
	{
		clearLink.click();
	}
	
	public void clickOnMoreOption()
	{
		moreOption.click();
	}
	
	public void enterReportName(String favName)
	{
		favReportName.sendKeys(favName);
	}
	
	public void clickOnSearchBTN()
	{
		searchBTN.click();
	}
	
//	public void favReportSearch()//pending to extract data(then pass the row to runReportLink method for left click

	public void runReport(WebDriver Driver) throws AWTException
	{
	Actions action = new Actions(Driver);
	
	Robot robot = new Robot();
	robot.mouseMove(715,420);

		action.moveByOffset(650, 295).click().build().perform();

		action.click(runLink).build().perform();

	}

	public void editAccessRights(WebDriver Driver) throws AWTException
	{
	Actions action = new Actions(Driver);
	
	Robot robot = new Robot();
	robot.mouseMove(715,420);

		action.moveByOffset(650, 295).click().build().perform();

		action.click(editAccessRightsLink).build().perform();

	}
	
	public void clickOnFavouriteReportsDropDown()
	{
		favouriteReportsDropDown.click();
	}
	
	public void clickOnFavouriteReportsLink()
	{
		favouriteReportsLink.click();
	}
	
	//*******************Edit Access fav Rights start ***********************//
	
	public void clickOnAllowDateChangeCheckBox()
	{
		allowDateChangeCheckBox.click();
	}
	
	public void selectAvailableRolesSelectBox(String roleName1)
	{
		select = new Select(availableRolesSelectBox);
		select.selectByVisibleText(roleName1);
	}
	
	public void clickOnAccessSaveButton()
	{
		accessSaveButton.click();
	}
	
	public void clickOnaddBTN()
	{
		addBTN.click();
	}
	
	//*******************Edit Access fav Rights end ***********************//
	
	
//	public void test(WebDriver Driver) throws AWTException 
//	{
//		
//		clickOnClearLink();
//		clickOnMoreOption();
//		enterReportName("2255_RRBIH_2 mon");
//		clickOnSearchBTN();
//		
//		
//		
//		Actions action = new Actions(Driver);
//		Robot robot = new Robot();
//		robot.mouseMove(715,420);
//		
//		//robot.mouseMove(900,550);
//		
//		action.moveByOffset(650, 310).click().build().perform();
//		
//		//action.contextClick(tableRowZero).click().perform();
//		//action.moveToElement(tableRowZero);
//		
//		WebDriverWait wait = new WebDriverWait(Driver,2);
//		
//		wait.until(ExpectedConditions.visibilityOf(Driver.findElement(By.id("divToolBar_default"))));
//		
//		//action.moveToElement(editAccessRightsLink);
//
//		action.click(editAccessRightsLink).build().perform();
//	}
}
