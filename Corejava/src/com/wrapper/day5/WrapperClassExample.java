package com.wrapper.day5;

public class WrapperClassExample {

		public static void main(String[] args) {
			int x=10;
			Integer y=20;           //auto boxing
			//the above line is equivalent to
			Integer z=new Integer(30);           //new object is created
			z=50;												//new object is created again
			Integer a=new Integer(40);
			
			System.out.println();
			
			//converting int to integer
			Integer e=10;   //new INteger(10)
			int f=e;  //e.intValue();
			//converting string to integer
			Integer g=new Integer("100");
			//Integer to string
			String h=g.toString();
			//converting string to int
			int i=Integer.parseInt("100");
			//converting int to String
			String j=Integer.toString(100);
			
			
			//int-string-float-Double-Integer
			int k=100;
			
			String l=Integer.toString(k);
			float m=Float.parseFloat(l);
			Double n=new Double(m);
			Integer o= n.intValue();
			  
		}
}
