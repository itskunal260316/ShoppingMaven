package com.lti.trainig.day2.basics;

import java.util.Scanner;

public class Phonebook 
{
	private int count;
	
	private Contact[] contacts;
	
	
/*public Phonebook()
	{
		contacts=new Contact[100];
	}*/
	////////////////////////////Parameterized constructor
	public Phonebook(int noOfEntries)
	{
		contacts =new Contact[noOfEntries];
	}
	public void add(Contact contact)
	{ 
		 contacts[count ++]	=contact;							
	}
	public  Contact searchByName(String name)
	{
//		Scanner sc=new Scanner(System.in);
//		String a;
//		System.out.println("Enter the name you want to search:");
//		a=sc.next();
		   for (int i = 0; i < count; i++)
		      {
		           if ( contacts[i].getName()==name ) 
		                 return contacts[i];  //We found it!!!
		           
		      }
		   return null;
	}
	 
	
	   public Contact searchByNumber(String Number)
	{
		return null;
	}
	   public void display()
	   {
		   	for(int i=0;i<count;i++)
		   	{
		   		System.out.println(contacts[i].getName()
		   										+"\t"+contacts[i].getNumber()
		   										+"\t"+contacts[i].getEmail()+
		   										"\t"+contacts[i].getDob());
		   	}
	   }
		
	 public void clear()
	{
		 																																					
	}
	public static void main(String args [])
	{
			
	}
}
