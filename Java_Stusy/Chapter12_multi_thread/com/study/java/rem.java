package com.study.java;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class rem {
	public static void main(String[] args) {
		long unixTime = System.currentTimeMillis();
		Instant.now().getEpochSecond();
		String date = "20200831093411";
		String date2 = "" + System.currentTimeMillis();
//		Date date2 =new Date(date);
//		long time2 = date2.getDate();
//		time2 = Instant.EPOCH.toEpochMilli();
//		LocalDate.parse("date"); 
	//	LocalDateTime.parse("2002-05-09"); // 2002-05-09
	//	LocalDateTime.parse(date); // 2002-05-09
		//LocalDateTime.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss"));
		
		System.out.println(LocalDateTime.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String date4 = LocalDateTime.parse(date,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toString()+"Z";
		
   		String data = "2020-08-31 12:16:32.1"; 
   		long timestamp = Timestamp.valueOf(data).getTime(); 
   		String tmp = Long.toString(timestamp); 
   		System.out.println("|||"+timestamp); 
   		System.out.println("||||||"+Long.toString(timestamp)); 
   	

		long time = Instant.now().toEpochMilli();
		
		String date3 = "" + Instant.now().toEpochMilli();

		System.out.println(date2);
		System.out.println("date4"+date4);
		
		System.out.println(date3);
		System.out.println(time);
		//System.out.println(time2);
		System.out.println(unixTime);
		Instant instant = Instant.now();
		String output = instant.toString();
		System.out.println(output);
		System.out.println(date);
	}
	
	public class Timeconversion {
	    private DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm", Locale.ENGLISH); //Specify your locale

	    public long timeConversion(String time) {
	        long unixTime = 0;
	        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+5:30")); //Specify your timezone
	        try {
	            unixTime = dateFormat.parse(time).getTime();
	            unixTime = unixTime / 1000;
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        return unixTime;
	    }
	}
}
