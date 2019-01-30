package com.lti.day2.v2.O;

import java.time.LocalDate;

public class TestLogger {

	public static void main(String[] args)
	{
		ConsoleLogger logger=new ConsoleLogger();
		logger.log("Happy");
		logger.log("Some to Concern", Loglevel.WARN);
		logger.log("Some to WORRY", Loglevel.ERROR);
		
	FileLogger logger1=new FileLogger();
		logger1.log("Happy"+"\n");
		logger1.log("Some to Concern"+"\n", Loglevel.WARN);
		logger1.log("Some to WORRY"+"\n", Loglevel.ERROR);
	}

}
