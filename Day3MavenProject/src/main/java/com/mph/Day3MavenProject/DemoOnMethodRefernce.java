package com.mph.Day3MavenProject;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnMethodRefernce {

	public static void main(String[] args) {
		String name="Praveen";
		Supplier<Integer>lengthUsingLamda=()->name.length();
		Supplier<Integer>lengthUsingMR=name::length;
		System.out.println(lengthUsingLamda.get());
		System.out.println(lengthUsingMR.get());
		
		Hello h=new Hello();
		Supplier<String> hellousingLamda=()->h.sayHello();
		Supplier<String> helloUsingMR=h::sayHello;
		System.out.println(hellousingLamda.get());
		System.out.println(helloUsingMR.get());
		
		NumberUtil nu=new NumberUtil();
		Predicate<Integer>isEven=nu::isEven;
		System.out.println(isEven.test(4));
		Function<Integer, Integer> squareNumMr=nu::squareNumber;
		System.out.println(squareNumMr.apply(5));
		Function<Double, Double> logMr=nu::logNum;
		System.out.println(logMr.apply(4.8));
		
		int num[]= {23,12,56,13,78};
		Consumer<int []> printMR=nu::printNum; 
		printMR.accept(num);
		
           
        

	}

}

class Hello{
	public String sayHello() {
		return "hellooo....";
	}
}
	
	class NumberUtil{
		public int squareNumber(int num) {
			return num*num;
		}
		public boolean isEven(int num) {
			return num%2==0;
		}
		public double logNum(double num) {
			return Math.log(num);
		}
		public void printNum(int[]num) {
			for(int i=0;i<num.length;i++)
				System.out.print(num[i]+" ");
		}
		
		
	}
