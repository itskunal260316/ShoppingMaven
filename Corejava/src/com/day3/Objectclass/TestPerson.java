package com.day3.Objectclass;

public class TestPerson {

	public static void main(String[] args)
	{	
			Person p1=new Person();
			p1.setName ("Shubham");
			p1.setAge(101);
		//	Person p2=new Person("Shubham",101);      //  Not A good practice/Not readable
			
			System.out.println(p1.getName() +" ,"+ p1.getAge());
			System.out.println(p1);
			
			Person p2=new Person("Shubham",101);
			
			System.out.println(p1.equals(p2));  //Value comparison
			System.out.println(p1==p2);
			
			System.out.println(p1.hashCode());           //Used by data structure
			System.out.println(p2.hashCode());				//this is used to find out it has  duplicate values  or not
			
			//if there are 2 objects if they are equal then their hashcode is also same 
		
	}

}
