package com.reports.generics;

import java.util.Random;

public class NameProvider {

	public String favName(String pageTitle,String option)
	{
		String name;
		String allowDateSufix= "";
		
		String title= ""+pageTitle.charAt(0);
		
		switch (option) {
		case "1": allowDateSufix = "1 mon";
			
			break;
			
		case "2": allowDateSufix = "2 mon";
		
		break;
		
		case "3": allowDateSufix = "3 mon";
		
		break;
		
		case "-- Select --": allowDateSufix = "SelectOption 3 mon";
		break;


		default:
			break;
		}
		
		for(int i=0;i<pageTitle.length();i++)
		{
			if(pageTitle.charAt(i)==' ')
			{
				if(pageTitle.charAt(i+1)=='-'|pageTitle.charAt(i+1)=='/') i = i+2;
				title =""+ title +pageTitle.charAt(i+1);
			}
		}
		
		Random rand = new Random();
		String ran =""+rand.nextInt(9999);
		
		name = ran+"_"+title+"_"+allowDateSufix;
		
		return name;
	}
	
//	public static void main (String[] args)
//	{
//		
//		System.out.println(new NameProvider().favName("Revenue Report Builder","1"));
//	}
	
}
