package com.lti.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream inFile=null;
		try
		{
			inFile=new FileInputStream("C:\\Users\\vshadmin\\Desktop\\Surya.txt");
			int ch=0;
			while(true)
			{
				ch=inFile.read();
				if(ch==-1)
				{
					break;
				}
				System.out.print((char)ch);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Please check the no. of your glasses!!");
			// TODO: handle exception
		}
		catch (IOException e) {
			System.out.println("please contact mr. santosh");
			// TODO: handle exception
		}
		finally {
			try {
				inFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		
		

	}

}
