package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class StoreMgmtReports extends BaseTest
{
	@FindBy(xpath = "//span[text()=\"Store Mgmt Reports\"]")
	public
	WebElement storeMgmtReportsDropdown;
	
	@FindBy(linkText = "Stores Report Favourites")
	public
	WebElement storesReportFavourites;
	
	@FindBy(linkText = "Item Master Builder")
	public
	WebElement itemMasterBuilder;
	
	@FindBy(linkText = "Detailed Stock Builder")
	public
	WebElement detailedStockBuilder;
	
	@FindBy(linkText = "Item-Wise Stock Builder")
	public
	WebElement item_WiseStockBuilder;
	
	@FindBy(linkText = "Indent Flow Builder")
	public
	WebElement indentFlowBuilder;
	
	@FindBy(linkText = "Indent Items Detail Builder")
	public
	WebElement indentItemsDetailBuilder;
	
	@FindBy(linkText = "Stock Transfers Builder")
	public
	WebElement stockTransfersBuilder;
	
	@FindBy(linkText = "Stock Adjustment Builder")
	public
	WebElement stockAdjustmentBuilder;
	
	@FindBy(linkText = "Stock Movement Report")
	public
	WebElement stockMovementReport;
	
	@FindBy(linkText = "Item wise Stock Quantity Checkpoint")
	public
	WebElement itemWiseStockQuantityCheckpoint;
	
	@FindBy(linkText = "Item Category wise Stock Value Checkpoint")
	public
	WebElement itemCategoryWiseStockValueCheckpoint;
	
	@FindBy(linkText = "Surplus Stock Report")
	public
	WebElement surplusStockReport;
	
	@FindBy(linkText = "Stock Ledger")
	public
	WebElement stockLedger;
	
	@FindBy(linkText = "Checkpoint Difference")
	public
	WebElement checkpointDifference;
	
	@FindBy(linkText = "TN Tax Report")
	public
	WebElement tNTaxReport;
	
	@FindBy(linkText = "Reagent/Consumable Report Builder")
	public
	WebElement reagent_ConsumableReportBuilder;

	public StoreMgmtReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		storeMgmtReportsDropdown.click();
	}
	
	public void clickOnStoreMgmtReportsDropdown()
	{
		storeMgmtReportsDropdown.click();
	}
	
	public void clickOnStoresReportFavourites()
	{
		storesReportFavourites.click();
	}
	
	public void clickOnItemMasterBuilder()
	{
		itemMasterBuilder.click();
	}
	
	public void clickOnDetailedStockBuilder()
	{
		detailedStockBuilder.click();
	}
	
	public void clickOnItem_WiseStockBuilder()
	{
		item_WiseStockBuilder.click();
	}
	
	public void clickOnIndentFlowBuilder()
	{
		indentFlowBuilder.click();
	}
	
	public void clickOnIndentItemsDetailBuilder()
	{
		indentItemsDetailBuilder.click();
	}
	
	public void clickOnStockTransfersBuilder()
	{
		stockTransfersBuilder.click();
	}
	
	public void clickOnStockAdjustmentBuilder()
	{
		stockAdjustmentBuilder.click();
	}
	
	public void clickOnStockMovementReport()
	{
		 stockMovementReport.click();
	}
	
	public void clickOnItemWiseStockQuantityCheckpoint()
	{
		itemWiseStockQuantityCheckpoint.click();
	}
	
	public void clickOnItemCategoryWiseStockValueCheckpoint()
	{
		itemCategoryWiseStockValueCheckpoint.click();
	}
	
	public void clickOnSurplusStockReport()
	{
		surplusStockReport.click();
	}
	
	public void clickOnStockLedger()
	{
		stockLedger.click();
	}
	
	public void clickOnTNTaxReport()
	{
		tNTaxReport.click();
	}
	public void clickOnreagent_ConsumableReportBuilder()
	{
		reagent_ConsumableReportBuilder.click();
	}
	
}
