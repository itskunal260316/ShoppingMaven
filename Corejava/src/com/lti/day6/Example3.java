package com.lti.day6;

class BankAccount
{
	int  accno;
	double balance;
	
	public BankAccount() {
		
	}

	public BankAccount(int accno, double balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	public synchronized void withdraw(double amount)
	{
		try {Thread.sleep(100);}catch(Exception e) {}
		if(amount<balance) {
			try {Thread.sleep(100);}catch(Exception e) {}
			balance -=amount;
			try {Thread.sleep(100);}catch(Exception e) {}
			System.out.println("Balance left"  +   balance);
			
			
		}
		else
			System.out.println("insufficient balance!!!!!!!!!!!!!!!!!");
	}
}
 class Transaction implements Runnable
 {
       BankAccount bk;
	public Transaction(BankAccount bankAcc) {
		// TODO Auto-generated constructor stub
		bk=bankAcc;
	}
	@Override
	public void run() {
		bk.withdraw(5000);
		
	
	
	}
		 
 }
  public class Example3 {
 
	public static void main(String [] args)
{
	BankAccount bankAcc=new BankAccount(1111,16000);
//	BankAccount bankAcc1=new BankAccount(1111,6000);
	Transaction tx1=new Transaction(bankAcc);
	Transaction tx2=new Transaction(bankAcc);
	Thread th1=new Thread(tx1);
	Thread th2=new Thread(tx2);
	th1.start();
	th2.start();
		
	}
}

