package com.day4.battery;

public class TestToy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Toy t=new Toy("CAR",5);
		
		t.addBattery("Sony");
		t.addBattery("cell");
		t.addBattery("nippo");
		t.addBattery("eveready");
		t.addBattery("Duracell");
		
		Toy t2=(Toy) t.clone();
		
		System.out.println(t);
		System.out.println(t2);

	}

}
