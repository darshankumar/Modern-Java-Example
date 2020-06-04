package com.learn.javaeight.defaults;

public interface InterfaceA {
	default void sumA(int a, int b) {
		System.out.println("InterfaceA : sumA " + (a + b));
	}
}
