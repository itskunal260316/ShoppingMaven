package com.lti.java.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

	private static void serialize() throws Exception
	{
		FileOutputStream f=new FileOutputStream("emp.txt");
		ObjectOutputStream os=new ObjectOutputStream(f);
		
		Employee e=new Employee();
		e.setEmpno("1001");
		e.setName("RP");
		e.setSalary(100000);
		
		os.writeObject(e);
		f.close();
		
	}
	private static void deserialize() throws Exception
	{
		FileInputStream f1=new FileInputStream("emp.txt");
		ObjectInputStream os1=new ObjectInputStream(f1);
		
		Employee e1=(Employee) os1.readObject();
		System.out.println(e1.getEmpno()+e1.getName()+e1.getSalary());
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		serialize();
		System.out.println("After serializable");
		deserialize();
	}

}
