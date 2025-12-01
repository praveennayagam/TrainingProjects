package com.mphasis;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
	
		char c=sc.next().charAt(0);
	
		
		switch(c){
		case '+' :
			
			System.out.println(n+m);
			break;
			
		case '-' :
		
			System.out.println(n-m);
			break;
			
		case '*' :
			
			System.out.println(n*m);
			break;
			
		case '/' :
			
			System.out.println((float)n/m);
			break;
			
		default :
			System.out.println("not a valid operator...");
			
			
		}
		
	}

}
