package com.lti.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class UserManager2  
{
	private List<User> users;
	
	public UserManager2() 
	{
	 users= new ArrayList<User>();
	 users.add(new User("sp","12"));
	 users.add(new User("rp","13"));
	 users.add(new User("kp","14"));
	 users.add(new User("pp","15"));
	}
	public boolean isValidUser(String username, String password)
	{
		for(User str : users)
		{
			if(str.getUsername().equals(username) &&  str.getPassword().equals(password))
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		UserManager2 usermanger=new UserManager2();
		boolean invalid=usermanger.isValidUser("sp","14");
		System.out.println(invalid);
	}
}
