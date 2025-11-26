package com.mphasis;

public class NetBanking implements Payment{

	CashPayment cash=new CashPayment();
	@Override
	public void pay(double amount) {
		System.out.println("NetBanking Payment Processing");
		System.out.println("user validated and authenticated");
		System.out.println("ottp verification done");
		System.out.println("payment Successfull");
		cash.pay(amount);
	}

}
