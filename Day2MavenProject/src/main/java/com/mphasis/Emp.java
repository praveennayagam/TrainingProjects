package com.mphasis;

import java.util.Arrays;

public class Emp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12, "Praveen", 20000);
        Employee emp2 = new Employee(3, "Barath", 10000);
        Employee emp3 = new Employee(2, "Irfan", 120000);
        Employee emp4 = new Employee(7, "Saro", 820000);

        Employee[] arr = {emp1, emp2, emp3, emp4};

//   
//        MyComparator com = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
//
//      
//        Arrays.sort(arr, (e1, e2) -> com.sortEmployee(e1, e2));
        
        
        
        
        
        Arrays.sort(arr,(e1,e2)->e1.getName().compareTo(e2.getName()));

        for (Employee e : arr) {
            System.out.println(e);
        }
    }
}

