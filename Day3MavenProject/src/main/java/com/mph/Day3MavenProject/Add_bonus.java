package com.mph.Day3MavenProject;

import java.util.function.Function;

public class Add_bonus {

	public static void main(String[] args) {
		 Employee emp1 = new Employee(12, "Praveen", 20000);
	        Employee emp2 = new Employee(3, "Barath", 10000);
	        Employee emp3 = new Employee(2, "Irfan", 120000);
	        Employee emp4 = new Employee(7, "Saro", 820000);
	        
	        Employee[] arr1 = {emp1, emp2, emp3, emp4};
	        
	        
	        
	        Function<Employee,Employee> checkSal=(e)->
	        {
	        	if(e.getSalary()>50000)
	        		return e;
	        	else
	        		return null;
	        };

	}

}
