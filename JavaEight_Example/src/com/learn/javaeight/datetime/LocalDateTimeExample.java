package com.learn.javaeight.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime : " + localDateTime);

		localDateTime = LocalDateTime.of(2020, 05, 21, 10, 26, 30, 3000);
		System.out.println("LocalDateTime : " + localDateTime);
		
		localDateTime = LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println("LocalDateTime : " + localDateTime);

		// get
		
		System.out.println("LocalDateTime : " + localDateTime.getHour());
		System.out.println("LocalDateTime : " + localDateTime.getMinute());
		System.out.println("LocalDateTime : " + localDateTime.getSecond());
		
		System.out.println("LocalDateTime : " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
		
		//Modify
		
		System.out.println("LocalDateTime : " + localDateTime.plusYears(2));
		System.out.println("LocalDateTime : " + localDateTime.plusMonths(6));
		System.out.println("LocalDateTime : " + localDateTime.plusHours(30));
		
		
		System.out.println("LocalDateTime : " + localDateTime.with(ChronoField.HOUR_OF_DAY, 11));
		System.out.println("LocalDateTime : " + localDateTime.with(LocalTime.MIDNIGHT));
		
		
		
		
		
	}

}
