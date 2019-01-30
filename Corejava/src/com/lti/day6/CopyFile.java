package com.lti.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
//		FileReader inFile=null;
//		FileWriter outFile=null;
		try
		{
			inFile=new FileInputStream("D:\\jdk-8u131-windows-x64.exe");
			outFile=new FileOutputStream("D:\\patil.exe");
//			inFile=new FileReader("D:\\jdk-8u131-windows-x64.exe");
//			outFile =new FileWriter("D:\\jdk-8u131-windows1-x64.exe");
			int ch=0;
			while(true)
			{
				ch=inFile.read();
				if(ch==-1)
				{
					break;
				}
				//System.out.print((char)ch);
				outFile.write(ch);
			}
			System.out.print("Copied successfully");
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
				outFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		
		

	}

}



