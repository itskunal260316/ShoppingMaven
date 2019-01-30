package com.lti.trainig.day2.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DObToAge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the date in dd/mm/yyyy:");
		String dobstr=s.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date dob=null;
		try {
			dob = sdf.parse(dobstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int year=dob.getYear();
		
		Date currentdate=new Date();
		int currentyear=new Date().getYear();
		
		System.out.println("Your age is:" +(currentyear-year));

	}

}
