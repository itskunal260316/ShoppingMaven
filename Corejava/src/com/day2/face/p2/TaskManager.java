package com.day2.face.p2;

public class TaskManager {
		
	private int  count;
	 private MobileApp[] runningApps;
	 
	 public TaskManager()
	 {
		 runningApps=new MobileApp[100];
	 }
	 
	 public void newAppLoaded(MobileApp mobileApp)
	 {
		 runningApps[count++] =mobileApp;
	 }
	 public int getNumberofRunningApps()
	 {
		 return count;
	 }
	 public void closeAllRunningApps()
	 {
		 for(int i=0;i<count;i++)
		 {
			 runningApps[i].stop();
			 count=0;
		 }
	 }
	 
	public static void main(String[] args) {
		
	}

}
