package com.mphasis;

public class App {
    public static void main(String[] args) {
      Employee emp=new Employee();
      
      emp.setEmpid(123);
      emp.setEmpName("Praveen");
      emp.setDesg("Employee");
      emp.setMobileNumber("987654321");
      System.out.println(emp);
     
      Employee e1=new Employee("Barath",124,"Manager","123456789");
      System.out.println(e1);
      
    }
}
