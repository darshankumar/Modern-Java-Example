package com.learn.javaeight.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeToLocalDateAndTimeExample {

	public static void main(String[] args) {
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime : " + localDateTime);
		LocalDate localdate = localDateTime.toLocalDate();
		System.out.println("localdate : " + localdate);
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println("localTime : " + localTime);
		
		localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localTime : " + localDateTime);
	}

}
