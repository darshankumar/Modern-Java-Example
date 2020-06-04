package com.learn.javaeight.defaults;

public interface InterfaceD {
	default void sumA(int a, int b) {
		System.out.println("InterfaceD : sumA " + (a + b));
	}
}
