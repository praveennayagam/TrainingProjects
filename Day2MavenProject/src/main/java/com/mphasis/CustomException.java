package com.mphasis;

public class CustomException {

	public static void main(String[] args) {
	
		Person p=new Person("Praveen",123,7);
		System.out.println(p);
		try {
			p.checkEligibility();
		} catch (AgeNotSufficientException e) {
			
			e.printStackTrace();
		}
		System.out.println("Application closed...");
	}

}
