package com.lti.trainig.day2.basics;

import java.util.Date;

public class TestCar
{
 public static void main(String [] args)
 {
	 Car c=new Car("1990", "1996/04/01",2000);
	 Date d=new Date();
	 System.out.println(c.getModel());
	 System.out.println(d.getHours()+"-"+d.getMinutes()+"-"+d.getSeconds());
	 System.out.println(d.getDate());
	System.out.println(c.getPrice());
	System.out.println(c.getYear());
	
	Runtime r=Runtime.getRuntime(); 
	long total=r.totalMemory()/ 1024/1024;
	System.out.println("Total memory="+r.totalMemory());
	System.out.println("Total ="+ total+"MB");
	System.out.println("	Free memory="+r.freeMemory()/1024/1024+"mb");
	System.out.println("	Max memory="+r.maxMemory()/1024/1024+"mb");
 }
}

