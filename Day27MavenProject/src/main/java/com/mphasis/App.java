package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
       //Streams...
    	Integer[]arr= {2,3,4,5,6,7,8,9,12,55,88,32,78,134,3,9,55,78};
    	//terminal operations
    	List<Integer>listStream=Arrays.stream(arr).collect(Collectors.toList());
    	
    	Arrays.stream(arr).forEach(System.out::println);
    	System.out.print(listStream+" ");
    	System.out.println();
    	int min=Arrays.stream(arr).min((a,b)->a-b).get();
    	int min1=Arrays.stream(arr).min(Integer::compare).get();
    	System.out.println(min);
    	System.out.println(min1);
    	
    	long count=Arrays.stream(arr).count();
    	System.out.println(count);
    	
    	//sum of arr using reduce
    	int sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
    	System.out.println("sum of arrays: "+sum);
    	
    	System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b));
    	System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b));
    	
    	
    	//intermediate operations
    	//1.filter
    	System.out.println("-------filter---------");
    	
    	Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
    		
    	System.out.println("-------Map---------");
    	//2.map
    	Stream.of(arr).map(num->num+10).forEach(System.out::println);
    	
    	//3.limit
    	System.out.println("-------limit---------");
    		Stream.of(arr).limit(5).forEach(System.out::println);
    	//4.skip
    		System.out.println("----skip---");
    		Stream.of(arr).skip(5).forEach(System.out::println);
    	//5.distinct
    		System.out.println("---------distinct---------");
    		Stream.of(arr).distinct().forEach(System.out::println);
    		System.out.println("before distinct "+Arrays.stream(arr).count());
    		System.out.println("---------distinct then count---------");
    	
    		System.out.println(Arrays.stream(arr).distinct().count());
    		System.out.println(Arrays.toString(arr));
    		
    		System.out.println("---------any match---------");
    		System.out.println(Stream.of(arr).anyMatch(num->num>55));
    	
       		System.out.println("---------find first---------");
    	
       		System.out.println(Stream.of(arr).filter(num->num>55).findFirst().get());
       		System.out.println("------------------");
       		
       		
       		Integer[] nums= {23,12,45,56,25,78,12,45,34,34,23,78,90,32,94};
       		List<Integer> numList=Arrays.asList(nums);
       		numList.stream().filter(num->num%3==0)
       		.distinct()
       		.skip(2)
       		.limit(2)
       		.forEach(System.out::println);
    	
    	System.out.println("------sorted-------");
       		Arrays.stream(arr).sorted().forEach(System.out::println);
    	System.out.println("--------reverse sorted");
       		numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	
       		
       		//streams of strings
       		System.out.println("------------strings----------------------");
       		String[]str= {"praveen","barath","saro","irfan","prabha","bala","dhachu","prithiv","pradeep"};
       		Arrays.stream(str).filter(x->x.length()>=5)
       		.filter(x->x.startsWith("p"))
       		.sorted()
       		.forEach(System.out::println);
       		
       		
       		// streams with user defined object collection
       		
       		System.out.println("-------------------------------- ");
       		
       	 Employee emp1 = new Employee(101, "Ravi Kumar", 55000.0, "Developer", "IT");
         Employee emp2 = new Employee(102, "Priya Sharma", 62000.0, "Analyst", "Finance");
         Employee emp3 = new Employee(103, "Arun Singh", 75000.0, "Manager", "HR");
         Employee emp4 = new Employee(104, "Meena Reddy", 48000.0, "Tester", "QA");
         Employee emp5 = new Employee(105, "Rahul Desai", 90000.0, "Architect", "IT");
         Employee emp6 = new Employee(106, "Praveen ", 90000.0, "Manager", "HR");
       		
         ArrayList<Employee> elist = new ArrayList<Employee>(
        		    Arrays.asList(emp1, emp2, emp3, emp4, emp5,emp6));

       		elist.stream().
       		filter(x->x.getDesg()
       		.equals("Manager"))
       		.sorted((e1,e2)->e1.getEmpname().compareTo(e2.getEmpname()))
       		.map(e->e.getEmpname())
       		.forEach(System.out::println);
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
       		
 
    }
}
