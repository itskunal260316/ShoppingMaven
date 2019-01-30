package com.lti.trainig.day2.basics;

class Contact
{
private String name;
private String number;
private String email;
private String dob;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}

public Contact(String name, String number, String email, String dob) {
	super();
	this.name = name;
	this.number = number;
	this.email = email;
	this.dob = dob;
}

		
}
