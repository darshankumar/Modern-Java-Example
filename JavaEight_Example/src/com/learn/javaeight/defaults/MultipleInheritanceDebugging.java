package com.learn.javaeight.defaults;

public class MultipleInheritanceDebugging implements InterfaceA, InterfaceD {

	public static void main(String[] args) {

	}
	
	// we need to implement as it has common in both interface
	public void sumA(int a, int b) {
		System.out.println("MultipleInheritanceDebugging : sumA " + (a + b));
	}
}
