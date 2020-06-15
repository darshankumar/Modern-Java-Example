package com.learn.java_twale.Switch;

public class SwitchStatementExample {

	public static void main(String[] args) {
		String month = "JANUARY";
		String quarter;

		switch (month) {
		case "JANUARY":
			quarter = "FIRST";
			break;
		case "FEBURARY":
			quarter = "FIRST";
			break;

		case "MARCH":
			quarter = "FIRST";
			break;

		case "APRIL":
			quarter = "SECOND";
			break;

		case "MAY":
			quarter = "SECOND";
			break;

		case "JUNE":
			quarter = "SECOND";
			break;

		case "JULY":
			quarter = "THIRD";
			break;

		case "AUGUST":
			quarter = "THIRD";
			break;

		case "SEPTEMBER":
			quarter = "THIRD";
			break;
		case "OCTOBER":
			quarter = "FOURTH";
			break;
		case "NOVEMBER":
			quarter = "FOURTH";
			break;
		case "DECEMBER":
			quarter = "FOURTH";
			break;

		default:
			quarter = "UNKNOWN";
			// throw new IllegalArgumentException("Unexpected value: " + month);
		}

		System.out.println("quarter ---> " + quarter);
	}

}
