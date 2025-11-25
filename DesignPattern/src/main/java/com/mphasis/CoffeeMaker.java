package com.mphasis;

public class CoffeeMaker extends DrinkMaker {

	@Override
	void makeDrink() {
		System.out.println("making coffee");
		
	}

	@Override
	void addExtras() {
		System.out.println("adding sugar");
		
	}

}
