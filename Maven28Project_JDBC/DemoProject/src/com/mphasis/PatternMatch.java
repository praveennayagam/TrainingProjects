package com.mphasis;

import java.util.Scanner;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String mobileno= sc.next();
		
		if(mobileno.matches("[6-9]\\d{9}"))
		{
			System.out.println("valid mobileno...");
		}
		else {
			System.out.println("Invalid mobileno...");
		}

	}

}
