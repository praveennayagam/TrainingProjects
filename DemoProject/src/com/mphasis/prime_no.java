package com.mphasis;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int count=0;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
				break;
		}
			if(count!=0)
				System.out.println("Not a Prime number...");
			else
				System.out.println("Prime number...");	
		
		

	}

}
