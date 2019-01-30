package com.day4.battery;

import java.util.Arrays;

public class Toy implements Cloneable {
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Battery[] getBatteries() {
		return batteries;
	}

	private String name;
	private Battery[] batteries;
	@Override
	public String toString() {
		return "Toy [name=" + name + ", batteries=" + Arrays.toString(batteries) + "]";
	}

	private int count;
	
	public Toy()
	{
		
	}
	public Toy(String name,int no_batteries)
	{
		this.name=name;
		this.batteries=new Battery[no_batteries];
	}
	public void addBattery(String batteryName)
	{
			Battery battery=new Battery(batteryName);
			batteries[count++]=battery;
			
			
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Toy t=(Toy) super.clone();
		Battery[] newBatteries= new Battery[batteries.length];
		for(int i=0;i<batteries.length; i++)
		{
			newBatteries[i]=(Battery) batteries[i].clone();
			
			
		}
		t.setBatteries(newBatteries);
		return t;
	}
	
	public void setBatteries(Battery[] batteries) {
		this.batteries = batteries;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
