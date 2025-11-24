package com.mphasis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		//string in the format yyyy-MM-dd  hh:mm:sec a
		
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		  LocalDateTime localDateTime = LocalDateTime.of(2024, 11,22,15,45,40);
		  String str=df.format(localDateTime);
		  System.out.println(str);
		
		
//		String myDateTime = "2024-11-22 15:45:40";
//		myDateTime = myDateTime.trim(); // remove trailing space
//
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime localDateTime = LocalDateTime.parse(myDateTime, formatter);

		System.out.println(localDateTime);

	}

}
