package com.mphasis;

public class Calculator  implements ScientificCalculatorInterface{
		
	
	
	
	public void add(int a, int b)
	{
		System.out.println(a+b); 
	}
	public void add(long a, double b)
	{
		System.out.println(a+b); 
	}
	
	public void add(double a,double   b)
	{
		System.out.println(a+b); 
	}
	public void add(float a,float b)
	{
		System.out.println(a+b); 
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
	
	public void add(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber c3= new ComplexNumber();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		System.out.println(c3.real+"+i"+ c3.imag);
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.add(5, 8);
		cal.add(2.5, 5.8);
		//System.out.println(cal.add(2, 3));
		
		ComplexNumber c1=new ComplexNumber(3,4);
		ComplexNumber c2=new ComplexNumber(5,6);
		cal.add(c1, c2);
		
	}
	@Override
	public double power(double m, double n) {
		
		return Math.pow(m, n);
	}
	@Override
	public double squareRoot(double m) {
		
		return Math.sqrt(m);
	}
	@Override
	public double logValues(double m) {
		
		return Math.log(m);
	}
	
	

}
