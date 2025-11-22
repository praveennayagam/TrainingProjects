package com.mphasis;

public class DemoOnThrows {

	public static void main(String[] args) {
		int a=51,b[]= {2,3,4,5};
		
		checkMethod(a,b);
		System.out.println("Application Completed...");
	}

	public static void checkMethod(int a, int[] b) {
		
		for(int i=0;i<=b.length;i++)
		{	
			//b[10]=67;
			if(b[i]==0)
				throw new ArithmeticException();
			else if(i>=b.length)
				throw new ArrayIndexOutOfBoundsException();
			else
				System.out.println(a/b[i]);
		}
		
	}

}
