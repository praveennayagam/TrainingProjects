package com.mph.Day3MavenProject;

import java.util.Arrays;
import java.util.function.Consumer;



public class DemoOnConsumer {

	public static void main(String[] args) {
		
		Consumer<Integer> squareConsumer=(num1)->{
			System.out.println(num1*=num1);
		};
		
		squareConsumer.accept(5);
		
		
		
		Consumer<Integer []> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		Integer[] arr= {43,23,78,12,99,42,1};
		sortConsumer.accept(arr);
		
		 Employee emp1 = new Employee(12, "Praveen", 20000);
	        Employee emp2 = new Employee(3, "Barath", 10000);
	        Employee emp3 = new Employee(2, "Irfan", 120000);
	        Employee emp4 = new Employee(7, "Saro", 820000);
	        
	        Employee[] arr1 = {emp1, emp2, emp3, emp4};
	        
	        Consumer<Employee[]>printConsumer=(err)->{
	        	for(Employee e: err)
	        		System.out.println(e.getName());
	        };
	        printConsumer.accept(arr1);
		
 
	}

}
