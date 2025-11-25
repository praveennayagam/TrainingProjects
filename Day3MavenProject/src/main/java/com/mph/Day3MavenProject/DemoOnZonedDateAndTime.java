package com.mph.Day3MavenProject;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnZonedDateAndTime {

	public static void main(String[] args) {
		ZonedDateTime dateTime =ZonedDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getZone());
		System.out.println(dateTime.getOffset());
		
		ZonedDateTime regionDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(regionDateTime);
//		
//		Duration diff=Duration.between(dateTime.toInstant(), regionDateTime.toInstant());
//		System.out.println(diff.toHours());
		
//		        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//		        ZonedDateTime regionDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

		        System.out.println("Local dateTime: " + dateTime);
		        System.out.println("America/New_York dateTime: " + regionDateTime);

		        int secDiff = dateTime.getOffset().getTotalSeconds() 
		                      - regionDateTime.getOffset().getTotalSeconds();
		        
		        int hours=secDiff/3600;
		        int min=(secDiff%3600)/60;
		        
		        System.out.println("Difference is:"+hours+" hours "+min+" minutes");
		        
		        
		        //converting localdate to zoneddatetime
		        LocalDateTime dateTime2=LocalDateTime.now();
		        ZonedDateTime zonedDateTime=dateTime2.atZone(ZoneId.of("Asia/Kolkata"));
		        System.out.println(zonedDateTime);
		        //converting zoneddatetime to localdate
		        System.out.println(zonedDateTime.toLocalDateTime());
		        
		        //convert indian time to US time
		        ZonedDateTime indiaTime=ZonedDateTime.now();
		        ZonedDateTime usaTime=indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		        System.out.println(indiaTime);
		        System.out.println(usaTime); 
		        
		        
		        //print zonedatetime in the specific pattern
		        
		        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a z");
		        String formattedZonedDateTime=indiaTime.format(df);
		        System.out.println(formattedZonedDateTime);
		        System.out.println(regionDateTime.format(df));
		        
		    }

}