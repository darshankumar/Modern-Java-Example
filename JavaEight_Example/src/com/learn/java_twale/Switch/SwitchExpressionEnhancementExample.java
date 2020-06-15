package com.learn.java_twale.Switch;

import java.time.LocalDate;

public class SwitchExpressionEnhancementExample {

	public static void main(String[] args) {
		String month = "JANUARY";
		String quarter = switch (month) {
		case "JANUARY", "FEBURARY", "MARCH" -> {
			var isLeapYear = LocalDate.now().isLeapYear();
			yield (isLeapYear ? "FIRST LEAP YEAR" : "FIRST");
		}
		case "APRIL", "MAY", "JUNE" -> "SECOND";
		case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD";
		case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH";
		default -> "UNKNOWN";
		};

		System.out.println("quarter ---> " + quarter);

	}

}
