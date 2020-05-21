package com.learn.javaeight.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {

	public static void main(String[] args) {
		// LocalTime
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime : " + localTime);

		localTime = localTime.of(15, 35); // HH:mm
		System.out.println("LocalTime : " + localTime);

		localTime = localTime.of(15, 35, 21); // HH:mm:ss
		System.out.println("LocalTime : " + localTime);

		localTime = localTime.of(15, 35, 21, 44); // HH:mm:ss ::nss
		System.out.println("LocalTime : " + localTime);

		// Get method
		localTime = LocalTime.now();
		System.out.println("LocalTime.getHour : " + localTime.getHour());
		System.out.println("LocalTime.getMinute : " + localTime.getMinute());
		System.out.println("LocalTime.getSecond : " + localTime.getSecond());
		System.out.println("LocalTime.getNano : " + localTime.getNano());

		System.out.println("LocalTime.HOUR_OF_DAY : " + localTime.get(ChronoField.HOUR_OF_DAY));
		System.out.println("LocalTime.MINUTE_OF_DAY : " + localTime.get(ChronoField.MINUTE_OF_DAY));
		System.out.println("LocalTime.SECOND_OF_DAY : " + localTime.get(ChronoField.SECOND_OF_DAY));

	}

}
