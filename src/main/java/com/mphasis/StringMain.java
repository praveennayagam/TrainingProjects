 package com.mphasis;

public class StringMain {

	public static void main(String[] args) {
	String s="   helloworld      ";
	String str=new String ("helloworld");
	String s1="Mphasis";
	System.out.println(s.length());
	System.out.println(s.indexOf('w'));
	System.out.println(s.concat(s1));
	
	System.out.println(s==str);
	System.out.println(s.equals(str));
	System.out.println(s.substring(5, 10));
	System.out.println(s.strip());
	System.out.println(s.trim());
	

	}

}
