package com.lti.trainig.day2.basics;

public class Hex
{
    static int x=65;
  
  
  public static void decToBinary(int n)
  {
	  int  [ ]binary_num=new int[1000]; 
	  	int i=0;
	  	while(n>0)
	  	{
	  			binary_num[i]=n%2;
	  			n=n/2;
	  			i++;
	  	}
	  	for(int j=i-1; j>=0; j--)
	  	{
	  			System.out.print(binary_num[j]);
	  	}
  }
	public static void main(String[] args) 
	{
		
		//System.out.println(Integer.toBinaryString(x));
		//System.out.println(Integer.toHexString(x));
		decToBinary(14);
	}	

}
