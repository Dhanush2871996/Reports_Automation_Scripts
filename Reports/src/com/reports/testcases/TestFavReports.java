package com.reports.testcases;

public class TestFavReports 
{

	public static boolean testRunFavReport(String favName, String message)
	{
		int len = favName.length();
	
		char a= favName.charAt(len-5);
		//System.out.println(a);
		int c=Character.getNumericValue(a);
		//System.out.println(c);
		
		switch(c)
		{
		case 1:System.out.println("1");
		case 2:System.out.println("2");
		case 3:System.out.println("32344");
		}
		
		
		String actualMessage="hi";
		if(message.equalsIgnoreCase(actualMessage)) return true;
		else return false;
	
	}
	public static void main(String[] args)
	{
	boolean i	=TestFavReports.testRunFavReport("m 3 ish", "hi");
	System.out.println(i);
	}
	
	
}
