package com.learn.javaeight.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		// Date and SimpleDateFormatter

		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // 2020-05-20

		System.out.println("df.formatof " + df.format(date)); // 20/05/20, 7:31 pm
		
		// Time
		df = new SimpleDateFormat("HH:mm:ss");
		System.out.println("df.formatof " + df.format(date)); //19:35:55
		
		System.out.println(Calendar.getInstance().getTime());
		
		// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: "+ localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);
	}

}
