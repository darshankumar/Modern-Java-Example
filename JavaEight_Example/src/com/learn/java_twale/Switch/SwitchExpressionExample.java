package com.learn.java_twale.Switch;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		String month = "JANUARY";
		String quarter = switch (month) {
		case "JANUARY", "FEBURARY", "MARCH" -> "FIRST";
		case "APRIL", "MAY", "JUNE" -> "SECOND";
		case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD";
		case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH";
		default -> "UNKNOWN";
		};

		System.out.println("quarter ---> " + quarter);
	}

}
