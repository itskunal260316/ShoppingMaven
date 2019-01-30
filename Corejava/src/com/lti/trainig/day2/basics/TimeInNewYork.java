package com.lti.trainig.day2.basics;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeInNewYork {

	public static void main(String[] args) 
	{
		Calendar c=Calendar.getInstance();
		c.setTimeZone(TimeZone.getTimeZone("India/New_Delhi"));
		System.out.println("Australia time is:"+c.get(Calendar.HOUR_OF_DAY)  +"."+c.get(Calendar.MINUTE)+ "."+c.get(Calendar.SECOND));
		
	
	}

}
