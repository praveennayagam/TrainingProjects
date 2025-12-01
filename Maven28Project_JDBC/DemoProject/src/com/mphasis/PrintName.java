package com.mphasis;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
			System.out.println("Praveen");
			System.out.println("do you want to repeat y/n ");
			choice= sc.next().charAt(0);
			
		}
		while(choice!='n');
		System.out.println("Thank You....");
		

	}

}
