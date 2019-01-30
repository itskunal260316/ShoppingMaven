package com.lti.day2.v6.O;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 *  implementation of logging in java
 * @author RP
 *
 */
public class FileLogger implements Logger
{
	
	@Override
	public void log(String msg, Loglevel level)
	{
		try(FileWriter fw=new FileWriter("app.log",true))
		{
		switch (level)
		{
			case INFO:
			fw.write("[INFO]  ["+LocalDateTime.now()+"]"+"   "+msg);
			break;
			
			case WARN:
				fw.write("[WARN]  ["+LocalDateTime.now()+"]"+"   "+msg);
				break;
				
			case ERROR:
				fw.write("[ERROR]  ["+LocalDateTime.now()+"]"+"   "+msg);
				break;
		
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
			
		
	}
	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		
	}

}
