package com.learn.javaeight.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalTimeModifyExample {

	public static void main(String[] args) {
		// LocalTime
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime : " + localTime);

		System.out.println("LocalTime.plusHours : " + localTime.plusHours(4));
		System.out.println("LocalTime.plusMinutes : " + localTime.plusMinutes(30));
		System.out.println("LocalTime.plusSeconds : " + localTime.plusSeconds(30));
		System.out.println("LocalTime.plusNanos : " + localTime.plusNanos(30));

		System.out.println("LocalTime.minusHours : " + localTime.minusHours(4));
		System.out.println("LocalTime.minusHours : " + localTime.minus(2, ChronoUnit.HOURS));

		System.out.println("LocalTime.with : " + localTime.with(LocalTime.MIDNIGHT));
		System.out.println("LocalTime.with : " + localTime.with(ChronoField.HOUR_OF_DAY, 4));

	}

}
