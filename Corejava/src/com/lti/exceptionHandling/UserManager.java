package com.lti.exceptionHandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager  
{
	private Map<String,String> users;
	
	public UserManager() 
	{
		
	 users= new HashMap<>();
	 users.put("sp","12");
	 users.put("rp","13");
	 users.put("kp","14");
	 users.put("pp","15");
	}
	public boolean isValidUser(String username, String password)
	{
		if(users.containsKey(username))
		{
			String pwd=users.get(username);
			if(pwd.equals(password))
				return true;
		}
		return false; 
			
 		
	}
	public static void main(String[] args) {
		UserManager usermanger=new UserManager();
		boolean invalid=usermanger.isValidUser("sp","12 ");
		System.out.println(invalid);
	}
}
