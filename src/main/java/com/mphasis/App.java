  package com.mphasis;

public class App {
	
	static {
		System.out.println("static 1");
	}
	static {
		System.out.println("static 2");
	}
 
    static {
		System.out.println("static 3");
	}
    public static void main() {
    	System.out.println("my own main method");
    }
   
    public static void main(String[] args) {
//      Employee emp=new Employee();
//      
//      emp.setEmpid(123);
//      emp.setEmpName("Praveen");
//      emp.setDesg("Employee");
//      emp.setMobileNumber("987654321");
//      System.out.println(emp);
//     
//      Employee e1=new Employee("Barath",124,"Manager","123456789");
//      System.out.println(e1);
//    	
    	Student s1=new Student(123,"praveen",90,22);
    	Student s2=new Student(123,"praveen",90,22);
//    	
//    	System.out.println(s1.hashCode());
//    	System.out.println(s2.hashCode());
//    	System.out.println(s1==s2);
//    	System.out.println(s1.equals(s2));
    	
    	s1.clgname="xyz college";
    	System.out.println(s2.clgname);
    	App.main();
    		
    	System.out.println("static 6");
    		
    		
    
       
    	
      
    }
    static {
		System.out.println("static 4");
	}

    static {
		System.out.println("static 5");
	}

}
