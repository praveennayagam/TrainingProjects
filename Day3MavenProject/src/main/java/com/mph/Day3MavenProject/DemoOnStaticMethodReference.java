package com.mph.Day3MavenProject;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnStaticMethodReference {


		// classname::methodname
		//objname::method
		
		
		static class NumberUtil{
			public static int squareNum(int num) {
				return num*num;
			}
			
			public static double log(double num) {
				return Math.log(num);
			}
			
			public static boolean isEven(int num)
			{
				return num%2==0;
			}
		}
		
		
		static class StringUtil{
			public static int stringLenth(String s) {
				return s.length();
			}
		}
		public static void main(String[] args) {
			Function<Integer, Integer> squareFunctionUsingLamda=(num)->NumberUtil.squareNum(num);
			Function<Integer, Integer> squareFunctionUsingMR=NumberUtil::squareNum;
			System.out.println(squareFunctionUsingLamda.apply(6));
			System.out.println(squareFunctionUsingMR.apply(8));
			
			Function<Double, Double> logUsingMR =NumberUtil::log;
			Function<Double, Double> logUsingLamda=(num)->NumberUtil.log(num);
			
			System.out.println(logUsingLamda.apply(6.0));
			System.out.println(logUsingMR.apply(6.0));
			
			
			Predicate<Integer> isEvenUsingLamda=(num)->NumberUtil.isEven(num);
			Predicate<Integer> isEvenUsingMR=NumberUtil::isEven;
			System.out.println(isEvenUsingLamda.test(6));
			System.out.println(isEvenUsingMR.test(6));
			
			String name="Praveen";
			
			Function<String,Integer> strLenUsingLamda=(s)->StringUtil.stringLenth(name);
			Function<String,Integer> strLenUsingMR=StringUtil::stringLenth;
			System.out.println(strLenUsingLamda.apply(name));
			System.out.println(strLenUsingMR.apply(name));
			
		}

	

}
