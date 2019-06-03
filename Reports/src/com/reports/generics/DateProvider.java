package com.reports.generics;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateProvider {
	
	SimpleDateFormat formate;
	Date date;
	Date dateBefore;
	Date dateAfter;
	int daysBetween;
	
	public DateProvider()
		{
		date = new Date();
		formate = new SimpleDateFormat("dd-MM-yyyy");
		}

	public String currentDate() 
	{     
		String currentDate = formate.format(date);
	    return currentDate;
	}  
	
	public String yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    String yesterdayDate = formate.format(cal.getTime());
	    return yesterdayDate;
	}
	
	public String monthDate(int x) {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, x);
	    String yesterdayDate = formate.format(cal.getTime());
	    return yesterdayDate;
	}
	
	public String monthEndDate()
	{
		int i=0;	
		while(monthDate(i).charAt(4) == monthDate(0).charAt(4))
		{
			if(monthDate(0).charAt(4)!=monthDate(i+1).charAt(4))return monthDate(i);		
			i++;
		}
		return "Unknown";
	}
	
	public String monthStartDate()
	{
		int i=0;	
		while(monthDate(i).charAt(4) == monthDate(0).charAt(4))
		{
			if(monthDate(0).charAt(4)!=monthDate(i-1).charAt(4))return monthDate(i);		
			i--;
		}
		return "Unknown";
	}
	
	
	
	public int differenceBetweenDates(String dateBeforeString, String dateAfterString)
	{
		try {
		 dateBefore = formate.parse(dateBeforeString);
		 dateAfter = formate.parse(dateAfterString);
		 long difference = dateAfter.getTime() - dateBefore.getTime();
		 daysBetween = (int)(difference / (1000*60*60*24));
		}
		 
		 catch (Exception e) 
		 {
		       e.printStackTrace();
		 }
		return daysBetween;
	}
	
	
	public static void main(String[] args)
	{
		DateProvider x = new DateProvider();
//		int y = x.differenceBetweenDates("01-02-2019", "02-02-2019");
//		System.out.println(y);
		
		
		System.out.println(x.monthEndDate());
		
		System.out.println(x.yesterday());
	}
}
