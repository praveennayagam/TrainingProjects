package com.mphasis;

public class CashPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("payment done for: "+amount);
		
	}

}
