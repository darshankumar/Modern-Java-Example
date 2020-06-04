package com.learn.javaeight.defaults;

public interface InterfaceC {
	default void sumC(int a, int b) {
		System.out.println("InterfaceC : sumC " + (a + b));
	}
}
