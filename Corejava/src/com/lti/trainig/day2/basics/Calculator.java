package com.lti.trainig.day2.basics;

public class Calculator 
{
	public static void add( int x, int y)
		{
			System.out.println("Additon :"+ (x+y)); 	
		}
public static void sub( int x, int y)
		{
			System.out.println("Subtraction:"+ (x-y)); 	
		}
public static void main(String[] args) 
{
	//Calculator c=new Calculator();
//	c.add(10, 20);
//	c.sub(4,2);
	
	//===============For static functions==================
//	c.add(10,20);
	add(10,20);
	sub(10,20);
	
}
}

