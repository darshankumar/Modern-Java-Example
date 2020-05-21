package com.learn.javaeight.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class InstantExample {

	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		System.out.println("Instant : " + instant);
		
		Instant instant2= instant.plusSeconds(3000);
		
		Duration duration = Duration.between(instant, instant2);
		System.out.println(duration.toSeconds());
		
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println(localDateTime);
		

	}

}
