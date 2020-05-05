package com.learn.javaeight.lambda;

public class IncrementByFiveLambda {

	public static void main(String[] args) {
		IncrementByFiveInterface incrementByFiveLambda = a -> a + 5;
		System.out.println(incrementByFiveLambda.incrementByFive(2));
	}

}
