package com.lti.trainig.day2.basics;

public class ContactCall {

	public static void main(String[] args) {
			Phonebook ph=new Phonebook(30);
			Contact c=new Contact("RP", "155448525", "asda@gmail.com", "12-04-1994");
			Contact c1=new Contact("RP1", "155448525", "asda@gmail.com", "12-04-1994");
			Contact c2=new Contact("RP2", "155448525", "asda@gmail.com", "12-04-1994");
			Contact c3=new Contact("RP3", "155448525", "asda@gmail.com", "12-04-1994");
			ph.add(c1);
			ph.add(c2);
			ph.add(c3);
			ph.add(c);
			
			ph.display();
			
			Contact c4=ph.searchByName("RP1");
			System.out.println("Search results:");
			if(c4!=null)
			{
				System.out.println(c4.getName()+"\t"+c.getNumber());
			}
			else
				System.out.println("No matching contact found");
			
	}

}
