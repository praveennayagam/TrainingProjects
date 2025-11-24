package com.mphasis;

import java.util.Arrays;

public class MyCalculator  {
	
	
	
	public static void main(String[] args) {
//		Calculator mc=	(int a, int b)-> a+b;
//		System.out.println(mc.add(5, 6));
		
//		Calculator c=(int a,int b)->System.out.println(a-b);
//		c.sub(77, 6);
		
//		Calculator c=()->{
//			int a=89,b=4;
//			System.out.println(a*b);
//		};
//		c.mul();
		
		Calculator c=()->{
			int a=89,b=4;
			return a/b;
		};
		System.out.println(c.div());
		
//		
//		Calculator c=(String name)-> System.out.println(name);
//		c.printName("praveen");
		
		
//		Calculator c=(String str) ->{
//			System.out.println(new StringBuffer(str).reverse().toString());
//		};
//		c.stringReverse("Praveen");
		
//		Calculator c=(int n)->System.out.println(n%2==0?"even":"odd");
//		c.isEven(2);
		
//		Calculator c=(int []arr)-> {
//			for(int i:arr)
//				System.out.println(i*i);
//		};
//		int arr[]= {1,2,3,4,5};
//		c.squareNum(arr);
//
//		Calculator c=(String s)->{
//			char []ch=s.toCharArray();
//			Arrays.sort(ch);
//			String str=new String(ch);
//			System.out.println(str);
//		};
//		c.sortString("praveen");
		
		
//		String []s= {"praveen","barth","saro"};
//		Calculator c=(String[] str)->{
//			Arrays.sort(s);
//			for(String i:s)
//			System.out.println(i);
//		};
//		c.sortString(s);
		
//		String []s= {"praveen","barth","saro"};
//		Calculator c=(String[] str)->{
//			int len[]=new int[str.length];
//			for(int i=0;i<len.length;i++) {
//				len[i]=str[i].length();
//			}
//			return len;
//		
//		
//	};
//			int l[]=c.findLength(s);
//			for(int i=0;i<l.length;i++)
//				System.out.println(l[i]);
	}
	
}
