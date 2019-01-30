package com.lti.day2;

import java.time.LocalDate;

public class TestLogger {

	public static void main(String[] args)
	{
		Logger logger=new Logger();
		logger.log("Happy");
		logger.log("Some to Concern", Loglevel.WARN);
		logger.log("Some to WORRY", Loglevel.ERROR);
	}

}
