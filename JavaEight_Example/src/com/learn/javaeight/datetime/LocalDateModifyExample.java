package com.learn.javaeight.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateModifyExample {

	public static void main(String[] args) {
		// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);

		// localDate +4
		System.out.println("localDate.plusDays(4) " +localDate.plusDays(4)); // Hence this is new instance
		System.out.println("localDate : " + localDate); // localDate is immutale 
		localDate = localDate.plusDays(4);
		System.out.println("localDate : " + localDate); // updating date
		
		localDate = localDate.now();
		System.out.println("localDate.plusMonths(4) " +localDate.plusMonths(4)); // Hence this is new instance
		System.out.println("localDate.plusYears " +localDate.plusYears(2)); // Hence this is new instance
		
		
		System.out.println("localDate.minusYears " +localDate.minusYears(2)); // Hence this is new instance
		System.out.println("localDate.minusMonths " +localDate.minusMonths(2)); // Hence this is new instance
		System.out.println("localDate.minusDays " +localDate.minusDays(2)); // Hence this is new instance
		
		
		
		System.out.println("localDate with(ChronoField.YEAR,2025): " + localDate.with(ChronoField.YEAR,2025)); // updating date
		System.out.println("localDate with(ChronoField.YEAR,2025): " + localDate.with(TemporalAdjusters.lastDayOfMonth())); // updating date
		
	}

}
