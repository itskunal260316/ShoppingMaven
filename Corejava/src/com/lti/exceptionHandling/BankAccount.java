package com.lti.exceptionHandling;



public class BankAccount {
		
	private int acno;
	private String name;
	private double balance;

	
	public BankAccount(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public double withdraw(double amount) throws AccountException /*RuntimeException*/ 
	{
		if(amount>balance)
		{
//			Exception e=new Exception("Insufficent balance");
//			throw e;
			AccountException e=new AccountException("Insufficent balance");
			throw e;
		}
		else
		{
			balance -=amount;
			return balance;
		}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount=new BankAccount(010, "Surya",100);
		
			try {
				double balance=bankAccount.withdraw(800);
				System.out.println("Balance left:"+balance);
			} catch (AccountException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		
	}

}
