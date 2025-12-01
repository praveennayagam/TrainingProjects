package com.mphasis;

import java.util.Scanner;

public class BSearch {

	public static void main(String[] args) {
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			Scanner sc=new Scanner(System.in);
			int target=sc.nextInt();
			int start=0;
			int end=arr.length-1;
			int mid=0;
			while(start<=end)
			{
				mid=(start+end)/2;
				if(arr[mid]==target)
				{
					System.out.println("element found at "+(mid+1)+"th position");
					break;
				}
				else if(arr[mid]<target)
				{
					start=mid+1;
				}
				else
					end=mid-1;
			}
			if(start>=end)
				System.out.println("not found!!!");

	}

}
