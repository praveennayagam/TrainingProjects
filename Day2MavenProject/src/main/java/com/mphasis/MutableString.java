package com.mphasis;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableString {

	public static void main(String[] args) {
	
		StringBuffer buff=new StringBuffer();
		buff.append("praveen");
		buff.append("barath");
		buff.append("saro");
		buff.append("praveen");
		buff.append("barath");
		buff.append("saroooo");
		System.out.println(buff);
		System.out.println(buff.capacity());
		StringBuffer sbf=new StringBuffer("name");
		System.out.println(sbf.capacity());
		buff.ensureCapacity(15);
		System.out.println(sbf.capacity());//20*2+2=42
		sbf.ensureCapacity(30);
		System.out.println(sbf.capacity());
		
		
		StringBuilder sb=new StringBuilder("Praveen Nayagam");
		sb.replace(7, 13, "*");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		String str="apple,banan,orange,pineapple";
		StringTokenizer tok= new StringTokenizer(str,",");
		while(tok.hasMoreTokens())
		{
			System.out.println(tok.nextToken());
		}
		
		StringJoiner sj=new StringJoiner(",");
		System.out.println(sj.add(str));
		
		
	}

}
