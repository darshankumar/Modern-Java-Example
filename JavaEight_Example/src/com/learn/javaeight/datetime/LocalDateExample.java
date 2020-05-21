package com.learn.javaeight.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

	public static void main(String[] args) {
		// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);

		localDate = LocalDate.ofYearDay(2020, 35);
		System.out.println("localDate : " + localDate);
		
		
		localDate = LocalDate.of(2020, 05, 21);
		System.out.println("localDate : " + localDate);
		
		localDate = LocalDate.now();
		System.out.println("localDate.getMonth : " + localDate.getMonth());
		System.out.println("localDate.getMonth : " + localDate.getMonthValue());
		
		System.out.println("localDate.getYear : " + localDate.getYear());
		
		
		System.out.println("localDate.getDayOfMonth : " + localDate.getDayOfMonth());
		System.out.println("localDate.getDayOfYear : " + localDate.getDayOfYear());
		System.out.println("localDate.getDayOfWeek : " + localDate.getDayOfWeek());
		
		
		System.out.println("localDate.DAY_OF_MONTH : " + localDate.get(ChronoField.DAY_OF_MONTH));
		System.out.println("localDate.DAY_OF_YEAR : " + localDate.get(ChronoField.DAY_OF_YEAR));
		System.out.println("localDate.DAY_OF_WEEK : " + localDate.get(ChronoField.DAY_OF_WEEK));
		
		
		
	}

}
