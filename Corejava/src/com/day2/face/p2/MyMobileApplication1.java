package com.day2.face.p2;

public class MyMobileApplication1 implements MobileApp{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("MyMobileApplication1 started....");
	}

	@Override
	public void pause() { 
		// TODO Auto-generated method stub
		System.out.println("\"MyMobileApplication1 paused....\"");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("MyMobileApplication1 stopped....");
	}

}
