package com.lti.day2.v2.O;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 *  implementation of logging in java
 * @author Rp
 *
 */
public class ConsoleLogger 
{
	public void log(String msg)
	{
		log(msg,Loglevel.INFO);
	}
	
	public void log(String msg, Loglevel level)
	{
		switch (level)
		{
			case INFO:
			System.out.println("[INFO]  ["+LocalDateTime.now()+"]"+"   "+msg);
			break;
			
			case WARN:
				System.out.println("[WARN]  ["+LocalDateTime.now()+"]"+"   "+msg);
				break;
				
			case ERROR:
				System.out.println("[ERROR]  ["+LocalDateTime.now()+"]"+"   "+msg);
				break;
		
		}
	}
	public static void main(String[] args) 
	{
			
		
	}

}
