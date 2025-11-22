package com.mphasis;

import java.util.Arrays;

public class DemoOnArraysUtilityClass {

	public static void main(String[] args) {
		
		int[] arr= {100,25,35,4};
		int [] brr= {100,25,35,4};
		
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr);
		System.out.println(nums);
		
		Arrays.sort(arr);
		
		for(int i:arr)
		System.out.print(i+" ");
		System.out.println();
		
		System.out.println(Arrays.binarySearch(arr, 100));
		//Arrays.sort(arr); arr is sorted so its false buz its check postion vlaues
		
		System.out.println(Arrays.equals(arr, brr));
		//Arrays.sort(brr);brr is sorted
		Arrays.sort(brr);
		System.out.println(Arrays.equals(arr, brr));
		
		// we can copy the array to an another array 
		int []crr=Arrays.copyOf(brr, 5);
		for(int i: crr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.fill(arr, 77);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.fill(brr, 1, 3, 45);
		for(int i: brr)
		{
			System.out.print(i +" ");
		}

	}

}
