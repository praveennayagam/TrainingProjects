package com.mphasis;

import java.util.Arrays;

public class DemoOnGenerics {
	
	public static <T> void display(T data) {
		System.out.println(data);
	}
	
	public static  <T extends Number, U extends Number> void  add(T t1,U u1) {
		System.out.println( t1.doubleValue()+u1.doubleValue());
	}

	public static void main(String[] args) {
		
//		Container<String> c1=new Container<String>();
//		c1.setItem("Praveen");
//		System.out.println(c1.getItem());
//		
//		Container<Student> c2=new Container<Student>();
		Student s=new Student(123,"Barath","CSE");
//		c2.setItem(s);
//		System.out.println(c2.getItem());
//		
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItem(67);
//		System.out.println(c3.getItem());
//		
//		Container<Integer []> c4=new Container<Integer[]>();
//		Integer []arr= {1,2,3,4,5,6};
//		c4.setItem(arr);
//		System.out.println(Arrays.toString(c4.getItem()));
		
		
	
//		Pair<String,Double> p1=new Pair<String, Double>("distance in km",7.5);
//		System.out.println(p1);
//		Pair<String,Double> p2=new Pair<String, Double>("wait in kg",6.0);
//		System.out.println(p2);
//		Pair<Integer,String> p3=new Pair<Integer, String>(1234,"Laptop");
//		System.out.println(p3);
//		Pair<Integer,Student> p4=new Pair<Integer, Student>(1,s);
//		System.out.println(p4);
		
//		Order<String>o1=new Order<String>("Laptop");
//		Order<String>o2=new Order<String>("Mobile");
//		
//		System.out.println(o1);
//		System.out.println(o2);
//		
//		Item item=new Item(12,"LAPTOP",50000);
//		
//		Order<Item>o3= new Order<Item>(item);
//		System.out.println(o3);
//		
//		
//		Item item1=new Item(121,"LAPTOP",50000);
//		Item item2=new Item(122,"MOBILE",300000);
//		Item item3=new Item(123,"WATCH",800);
//		Item item4=new Item(124,"CAR",600000);
//		 Item irr[]= {item1,item2,item3,item4 };
		 
		// Order<Item[]> orders=new Order<Item[]>(irr);
//		 System.out.println(orders);
		 
		// System.out.println(Arrays.toString(orders.getItem()));
		 
		 //arrayprinters
		 
//		 Integer[] nums= {1,2,3,4,5,6,7,8,9,10};
//		 String[]str= {"str1","str2","str3","str4"};
//		 ArrayPointer<Integer>ap1=new ArrayPointer<Integer>(nums);
//		 ArrayPointer<String>ap2=new ArrayPointer<String>(str);
//		System.out.println(ap1);
//		System.out.println(ap2);
		 
		 //generic on methods
		 display("praveen");
		 display(123);
		 display(false);
		 Item item=new Item(12,"LAPTOP",50000);
		 display(item);
		add(12,30.5);
		
		
	}

}
