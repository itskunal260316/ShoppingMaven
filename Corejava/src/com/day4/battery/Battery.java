package com.day4.battery;

public class Battery implements Cloneable{
	private static int seq=1;
	
	private String name;
	private int batteryNumber;
	
	public Battery()
	{
		
	}
	public Battery(String name) {
		super();
		this.name = name;
		this.batteryNumber=seq++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBatteryNumber() {
		return batteryNumber;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + ", batteryNumber=" + batteryNumber + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
