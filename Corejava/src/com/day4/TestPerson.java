package com.day4;

public class TestPerson {

	public static void main(String[] args) throws CloneNotSupportedException
	{	
			Person p1=new Person();
			p1.setName ("Shubham");
			p1.setAge(101);
//		//	Person p2=new Person("Shubham",101);      //  Not A good practice/Not readable
//			
//			System.out.println(p1.getName() +" ,"+ p1.getAge());
//			System.out.println(p1);
//			
//			Person p2=new Person("Shubham",101);
//			
//			System.out.println(p1.equals(p2));  //Value comparison
//			System.out.println(p1==p2);
//			
//			System.out.println(p1.hashCode());           //Used by data structure
//			System.out.println(p2.hashCode());				//this is used to find out it has  duplicate values  or not
//			
			//if there are 2 objects if they are equal then their hashcode is also same 
			
			
			//clone methods
			Person p3=(Person )p1.clone();
		System.out.println("Clone:"+p3);
		
		Address a1=new Address("China",41);
		Person p4=new Person("RP",102,a1);
		
		Person p5=(Person) p4.clone();
		System.out.println(p4.getAddr().getCity());
		System.out.println(p5.getAddr().getCity());
		p4.getAddr().setCity("Pune");                            //changed the value in clone  This is shallow copy
		System.out.println(p4.getAddr().getCity());		
		System.out.println(p5.getAddr().getCity());
		
		p1=null;
		p5=null;
		p4=null;
		System.gc();/////we cannot use this project
		
	}

}
