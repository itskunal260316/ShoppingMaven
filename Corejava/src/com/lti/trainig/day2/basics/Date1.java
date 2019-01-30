package com.lti.trainig.day2.basics;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Date1 
{

	public static void main(String[] args) 
	{
    Date d=new Date();
    //Calendar class can be also used to get the date
    //SimpldeDateFormat is recommended
    //System.out.println("Today's Date   :"+d.getDate() + "-" +d.getMonth()+ "-" +d.getYear());
    SimpleDateFormat p=new SimpleDateFormat("dd-MM-yyyy");
   String str=p.format(d);
   System.out.println(str);
   
   
		   Calendar c1=Calendar.getInstance();
		   c1.set(1996,2, 16);
		   String dayName = new DateFormatSymbols().getWeekdays()[c1 .get(Calendar.DAY_OF_WEEK)];
		   System.out.println(dayName);
	
		 //  int day=c1.get(c1.DAY_OF_WEEK);
		   //String[] days= {"Sun","Mon","Tue","Wed","Thurs","Fri","Sat"};
		   //System.out.println("Day is/was "+days[day-1]);
		   
	//========OR INHERITANCE=======
		   
		 //  GregorianCalendar cal=new GregorianCalendar(yyyy, mm-1, dd);
		   
		   //Display the age
		   int dd,yy,mm;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the year");
		   yy=sc.nextInt();
		   System.out.println("Enter your month");
		   mm=sc.nextInt();
		   System.out.println("Enter the day");
		   dd=sc.nextInt();
		   
		   c1.set(yy, mm, dd);
		  
		   
		  LocalDate today = LocalDate.now();                          //Today's date
		   LocalDate birthday = LocalDate.of(yy,mm,dd);  //Birth date
		    
		  Period p1 = Period.between(birthday, today);
		    
		   //Now access the values as below
		   System.out.println(p1.getDays());
		   System.out.println(p1.getMonths());
		   System.out.println(p1.getYears());
	
	}

}
