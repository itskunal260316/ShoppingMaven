package com.day2.face.p2;

public class TestMobApp {

	public static void main(String[] args) {
		
		MyMobileApplication1 app1=new MyMobileApplication1();
		MyMobileApplication2 app2=new MyMobileApplication2();
		
		Launcher launcher=new Launcher();
		launcher.launch(app1);
		launcher.launch(app2);
		
		
	System.out.println(launcher.runningAppsCount());	
		

	}

}
