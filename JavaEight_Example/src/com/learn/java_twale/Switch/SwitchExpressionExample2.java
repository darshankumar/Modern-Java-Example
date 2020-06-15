package com.learn.java_twale.Switch;

public class SwitchExpressionExample2 {

	public static void main(String[] args) {
		String month = "JANUARY";
		switch (month) {
		case "JANUARY", "FEBURARY", "MARCH" -> System.out.println("quarter ---> " + "FIRST");
		case "APRIL", "MAY", "JUNE" -> System.out.println("quarter ---> " + "SECOND");
		case "JULY", "AUGUST", "SEPTEMBER" -> System.out.println("quarter ---> " + "THIRD");
		case "OCTOBER", "NOVEMBER", "DECEMBER" -> System.out.println("quarter ---> " + "FOURTH");
		default -> System.out.println("quarter ---> " + "UNKNOWN");
		}
		;

	}

}
