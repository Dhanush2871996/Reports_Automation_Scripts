package com.reports.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Modified to test Github
//Modified to tet 2nd time
public class BaseTest implements IAutoReportConst
{
	public static WebDriver driver;
 
	 static
	 {
		// System.setProperty(CHROME_KEY, CHROME_VALUE);
		 System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	 }
	 
	public static void Initlization()
	{
		//driver  = new ChromeDriver();
		driver  = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	
		driver.get(URL);
	}
	
	public void closeApplication() {
		driver.close();
	}
	
}
