package com.mphasis;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int rev=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev*=10 ;
			rev+=rem;
			n/=10;
		}
		System.out.println(rev);

	}

}
