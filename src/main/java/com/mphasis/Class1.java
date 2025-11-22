package com.mphasis;

public class Class1 implements Interface1,Interface2{

	@Override
	public void sayHello() {
		Interface2.super.sayHello();
		//System.out.println("Hello...");
		
	}

}
