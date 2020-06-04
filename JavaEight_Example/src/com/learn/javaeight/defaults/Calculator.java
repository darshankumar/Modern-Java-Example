package com.learn.javaeight.defaults;


public interface Calculator {

	// abstract sum method
	public int sum(int a, int b);

	// abstract division method
	//public int division(int a, int b);

	// default method sunstract
	default int substract(int a, int b) {
		return a - b;
	}

	// static method
	static int multiply(int a, int b) {
		return a * b;
	}

}
