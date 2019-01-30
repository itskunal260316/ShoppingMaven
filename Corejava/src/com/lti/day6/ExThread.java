package com.lti.day6;

public class ExThread 
{
	
 // inner class 
	class Task1 implements Runnable{

		@Override
		public void run() {
			
			for (int i=0; i<10;i++) {
				System.out.println("Task1 running.....");
				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
				Thread.yield();
			}
		}
		
	}   
	class Task2 implements Runnable {

		@Override
		public void run() {
			
			for (int i=0; i<10;i++) {
				System.out.println("Task2 running.....");
				try {
					Thread.sleep(100000000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}   
	private void launch() {
		 Task1 task1=new Task1();
		 Task2 task2=new Task2();
		 Thread th1=new Thread(task1);
		 Thread th2=new Thread(task2);
		//th1.setDaemon(true);
	//	th2.setDaemon(true);
		 th2.setPriority(Thread.MAX_PRIORITY);
		 th1.setPriority(Thread.MIN_PRIORITY);
		
		 th1.start();
		 th2.start();
		 
	}
	public static void main(String args [])
	{
		new ExThread().launch();
		
	}
	
}

