package com.lti.day2.v6.O;
// Factory Design Pattern-----------
public class Loggerfactory 
{
	public static Logger getLoggerInstance()
	{
		return new ConsoleLogger();
	}
}
