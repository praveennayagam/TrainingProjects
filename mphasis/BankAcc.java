package com.mphasis;

public class BankAcc {
	
	private double balance=15000;

	public static void main(String[] args) {
		BankAcc account=new BankAcc();
		Runnable r=()->{
			account.withDraw(1000);
		};
		
		Thread t1=new Thread(r,"user1");
		Thread t2=new Thread(r,"user2");
		
		t1.start();
		t2.start();
	}

	public void withDraw(double amount) {
		System.out.println(Thread.currentThread().getName()+" is running");
		synchronized (this) {
			if(amount>balance)
				System.out.println("InSufficient Balance");
			else {
				
	            System.out.println(Thread.currentThread().getName()+" Withdrawal successful. ");
	            balance -= amount;
	            System.out.println("New balance: " + balance);
			}
		}
		
	}

}
