package com.lti.day2.v5.O;

public abstract class Logger {

	
	public abstract void log(String msg, Loglevel level);

	public void log(String msg)
	{
		log(msg,Loglevel.INFO);	
	}

	public static void main(String[] args) {
	

	}

}
