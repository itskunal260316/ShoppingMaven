package com.lti.day6;

public class Example2 {
	class SomeTask implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Line 1 is executed");
			try {
				Thread.sleep(1000*60*60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Kisne mujhe jagaya");
			}
		}
		
			
		}
	void launch()
	{
		Thread th=new Thread(new SomeTask());
		th.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		th.interrupt();
	}
	public static void main(String[] args) {
		new Example2().launch();
	}
		
}
