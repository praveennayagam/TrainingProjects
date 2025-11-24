package com.mphasis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.sql.Date;

public class ConvertDate {

	public static void main(String[] args) throws ParseException {
	
//		Date date=new Date(2025-1900,10,24);
//		System.out.println(date);
//		System.out.println(new java.util.Date());
//		java.util.Date utilDate=new java.util.Date();
		
		
		Date today=new Date();
		java.util.Date sqlDate =new java.sql.Date(today.getTime());
		System.out.println(today);
		System.out.println(sqlDate);
		
		//util to sql using simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
		String formateDate=sdf.format(today);
		sqlDate=java.sql.Date.valueOf(formateDate);
		System.out.println(sqlDate);
		
		//convert string to util date then to sql date
		String strDate="15-08-2025";
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate=sdf.parse(strDate);
		java.sql.Date sDate=new java.sql.Date(uDate.getTime());
		
		
		//convert sql date to util date using valueof
		java.sql.Date sqlDate1=java.sql.Date.valueOf("2025-10-24");
		java.util.Date utilDate1=new java.util.Date(sqlDate1.getTime());
		java.util.Date utilDate2=sqlDate1;
		
		//using simpleDateFormate to convert util to sql
		java.sql.Date sqlDate2=java.sql.Date.valueOf("2025-03-25");
		String str=sqlDate2.toString();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.parseObject(str));
		
		//convert string to sql date then to util date
		String myDate="2023-06-26";
		sqlDate1=java.sql.Date.valueOf(myDate);
		System.out.println(sqlDate1);
		utilDate1=new java.util.Date(sqlDate1.getTime());//util date
		System.out.println(utilDate1);
	}

}
