package com.lti.java.day8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeRetrieveCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileInputStream inFile=null;
//		FileOutputStream outFile=null;
		FileReader inFile=null;
		FileWriter outFile=null;
		BufferedReader buffin=null;
		BufferedWriter buffout=null;
		try
		{
			
			
//			inFile=new FileInputStream("D:\\GitHubDesktopSetup.exe");
//			outFile=new FileOutputStream("D:\\kolte_patil.exe");
		
			inFile=new FileReader("C:\\Users\\vshadmin\\Desktop\\Surya.txt");
			outFile =new FileWriter("sample2.txt");
			buffin=new BufferedReader(inFile);
			buffout=new BufferedWriter(outFile);
			String line=null;
			while(true)
			{
				line=buffin.readLine();
	
				
				if(line==null)
				{
					break;
				}
				//System.out.print((char)ch);
				buffout.write(line.toUpperCase());
				buffout.newLine();
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



