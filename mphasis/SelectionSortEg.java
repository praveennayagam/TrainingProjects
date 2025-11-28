package com.mphasis;

public class SelectionSortEg {

	public static void main(String[] args) {
		int arr[]= {10,23,45,12,65,87,44,9,98};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]< arr[min])
					min=j;
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
				
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
