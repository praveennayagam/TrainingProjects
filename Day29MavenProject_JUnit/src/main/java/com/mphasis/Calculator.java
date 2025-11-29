package com.mphasis;

public class Calculator {

	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	public boolean isEven(int num)
	{
		return num%2==0;
	}
	
	public int[] checkArrays()
	{
		int arr[]= {1,2,3,4,5};
		
		return arr;
	}
	
	public ArithmeticException checkAE()
	{
		return new ArithmeticException();
	}
	public static void main(String[] args) {
	
		Calculator cal=new Calculator();
		
		System.out.println(cal.add(2, 3));
		System.out.println(cal.sub(2, 3));
		System.out.println(cal.mul(2, 3));
		System.out.println(cal.div(5, 2));
		cal.checkAE();
	}

}
