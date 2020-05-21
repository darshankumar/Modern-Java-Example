package com.learn.javaeight.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {

	public static void main(String[] args) {
		// duration between two localdatetime object
		
		LocalDateTime localDateTime1 = LocalDateTime.now();
		LocalDateTime localDateTime2 = localDateTime1.plusHours(2);
		
		Duration duration = Duration.between(localDateTime1, localDateTime2);
		System.out.println("Between :: " + duration.toHours());
		
		
		duration = Duration.ofHours(2);
		System.out.println(duration.toMinutes());
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = localTime1.plusHours(2);
		duration = Duration.between(localTime1, localTime2);
		System.out.println(duration.toHours());
		
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = localDate1.plusDays(10);
		duration = Duration.between(localDate1, localDate2);
		System.out.println(duration.toDays()); // throws Exceptions
		
	}

}
