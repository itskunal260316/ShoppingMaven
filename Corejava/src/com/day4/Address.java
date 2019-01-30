package com.day4;

public class Address implements Cloneable
{
	private  String city;
	private int pin;
	public String getCity() {
		return city;
	
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	public Address() 
	{
		
	}
	
}
