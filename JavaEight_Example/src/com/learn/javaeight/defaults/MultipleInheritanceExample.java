package com.learn.javaeight.defaults;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {

	public static void main(String[] args) {
		MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();

		multipleInheritanceExample.sumA(2, 3); // resolve to child call
		multipleInheritanceExample.sumB(2, 3);
		multipleInheritanceExample.sumC(2, 3);

	}

	// implemented class first
	// subinterface that extends interface

	public void sumA(int a, int b) {
		System.out.println("MultipleInheritanceExample : sumA " + (a + b));
	}
}
