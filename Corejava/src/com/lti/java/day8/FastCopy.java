package com.lti.java.day8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FastCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
////		FileReader inFile=null;
////		FileWriter outFile=null;
		BufferedInputStream buffin=null;
		BufferedOutputStream buffout=null;
		try
		{
			
			
			inFile=new FileInputStream("D:\\GitHubDesktopSetup.exe");
			outFile=new FileOutputStream("D:\\kolte_patil.exe");
			buffin=new BufferedInputStream(inFile);
			buffout=new BufferedOutputStream(outFile);
//			inFile=new FileReader("D:\\jdk-8u131-windows-x64.exe");
//			outFile =new FileWriter("D:\\jdk-8u131-windows1-x64.exe");
			int ch=0;
			while(true)
			{
				ch=buffin.read();
				if(ch==-1)
				{
					break;
				}
				//System.out.print((char)ch);
				buffout.write(ch);
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
				buffin.close();
				buffout.close();
				inFile.close();
				outFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		
		

	}

}



