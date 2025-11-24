package com.mph.Day3MavenProject;

import java.util.function.Function;

public class DemoOnFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction=(num)->num*num;
		int []arr= {3,2,4,1,5,8,9};
		for(int i=0;i<arr.length;i++)
			System.out.println(squareFunction.apply(arr[i]));
		
		 Employee emp1 = new Employee(12, "Praveen", 20000);
	        Employee emp2 = new Employee(3, "Barath", 10000);
	        Employee emp3 = new Employee(2, "Irfan", 120000);
	        Employee emp4 = new Employee(7, "Saro", 820000);
	        
	        Employee[] arr1 = {emp1, emp2, emp3, emp4};
	        
	        Function<Employee, String> upperCaseFunction=(e)->e.getName().toUpperCase();
	        for(Employee e1:arr1)
	        	System.out.println(upperCaseFunction.apply(e1));
	        
	        Function<Integer, Integer> add20=(num)->num+20;
	        System.out.println(squareFunction.andThen(add20).apply(5));
	        
	        Function<Employee,Employee> checkSal=(e)->
	        {
	        	if(e.getSalary()>50000)
	        		return e;
	        	else
	        		return null;
	        };
	
	
	}

}
