package com.mphasis;

public class App {
	
	
	public String sayHello()
	{
		return"Hello";
	}
	
	public String checkTest()
	{
		String str=null;
		return str;
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        App app=new App();
        app.sayHello();
    }
}
