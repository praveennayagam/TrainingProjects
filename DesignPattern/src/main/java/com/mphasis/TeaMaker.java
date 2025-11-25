package com.mphasis;

public class TeaMaker extends DrinkMaker {

	@Override
	void makeDrink() {
		System.out.println("making tea");
		
	}

	@Override
	void addExtras() {
		System.out.println("adding ginger");
		
	}

}
