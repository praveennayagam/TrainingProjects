package com.mphasis;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
public class DemoOnDatesAndTime {

	public static void main(String[] args) throws ParseException {
		
		Date currDate=new Date();
		System.out.println(currDate);
		
		 LocalDate dob = LocalDate.of(2003, 5, 19); 
		System.out.println(dob);
		
		long ms=System.currentTimeMillis();
		System.out.println(ms);
		Date currentDateOfMS=new Date(ms);
		System.out.println(currentDateOfMS);
		
		Date newDate=new Date(2024-1900,07,22); //1900 is the year offsets so minus the curryear from the 1900
		System.out.println(newDate);
		
		System.out.println(currDate.getDate()+3);
		System.out.println(currDate.getDay());
		System.out.println(currDate.getYear()+1900);
		
		Date date1=new Date(2025,01,24);
		Date date2=new Date(2023,01,24);
		System.out.println(date1.after(date2));
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(sdf.format(currDate));
		
		String str="24-11-2025";
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		Date d=sdf1.parse(str);
		System.out.println(d);
			
		Date dob1=new Date(2000-1900,05,20);
		Date today=new Date();
		int ageInYears=today.getYear()-dob1.getYear();
		System.out.println(ageInYears + " years");
		
		System.out.println(today.toString());		
	}

}
