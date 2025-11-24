package com.mph.Day3MavenProject;

import java.util.function.Predicate;

public class DemoOnPredicate {

	public static void main(String[] args) {
		Predicate<Integer> isEven=(n)->n%2==0;
		System.out.println(isEven.test(56));
		
		if(isEven.test(45))
			System.out.println("even");
		else
			System.out.println("odd");
		
		System.out.println(isEven.test(34)?"even":"odd");
		
		String s="Praveenn";
		Predicate<String> checkLength=(str)->str.length()>7;
		System.out.println(checkLength.test(s));
		
		 Employee emp1 = new Employee(12, "Praveen", 20000);
	        Employee emp2 = new Employee(3, "Barath", 10000);
	        Employee emp3 = new Employee(2, "Irfan", 120000);
	        Employee emp4 = new Employee(7, "Saro", 820000);
	        
	        Employee[] arr1 = {emp1, emp2, emp3, emp4};
	        
	        Predicate<Employee> checkSalary=(emp)-> emp.getSalary()>=50000;
	        
	        for(Employee e: arr1)
	        	if(checkSalary.test(e))
	        	System.out.println(e);
	}

}
