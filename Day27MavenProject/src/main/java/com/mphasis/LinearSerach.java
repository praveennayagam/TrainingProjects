package com.mphasis;

import java.util.Scanner;

public class LinearSerach {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int i=0;
		for(;i<arr.length;i++)
			if(arr[i]==target) {
				System.out.println(arr[i]+" found");
				break;
			}
		
			if(i==arr.length)
				System.out.println("not found!!!");
		
		
		

	}

}
