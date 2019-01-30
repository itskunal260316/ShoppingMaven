package com.day2.face.p2;

//Google INC
public class Launcher {
	
	private TaskManager taskManager;
	
	public Launcher()
	{
		taskManager=new TaskManager();
	}
	
	public void launch(MobileApp mobileApp)
	{
			mobileApp.start();
			taskManager.newAppLoaded(mobileApp);
			mobileApp.pause();
			taskManager.closeAllRunningApps();
			mobileApp.stop();
		
	}
	
	public int runningAppsCount()
	{
		return taskManager.getNumberofRunningApps();
	}

}
