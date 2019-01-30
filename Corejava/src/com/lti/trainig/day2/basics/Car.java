package com.lti.trainig.day2.basics;

public class Car
{
 //member variables
//instance variables
	//non-static variables
	//member represent the state of the object
	
	private String model;
	private String year;
	private double price;
	
	//constructor(s)
	
	public Car(String model, String year, double price)
	{
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}
//============	Getter and Setter===========
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//==========Main Class===========
	public static void main(String[] args)
	{
		

	}

}
