package com.mphasis;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		LocalTime t1=LocalTime.of(9, 30);//24-hrs format
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(10, 58, 45);
		System.out.println(t2);
		
		LocalTime t3=LocalTime.of(3, 45, 34, 45);
		System.out.println(t3);
		
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		
		
		//convert string to localtime
		String str="11:35:20";
		LocalTime convertedTime=LocalTime.parse(str);
		System.out.println(convertedTime);
		
		//convert to specific format
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime=time.format(df);
		System.out.println(formattedTime);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);

	}

}
