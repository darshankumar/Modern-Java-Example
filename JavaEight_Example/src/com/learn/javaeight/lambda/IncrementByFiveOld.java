package com.learn.javaeight.lambda;

public class IncrementByFiveOld implements IncrementByFiveInterface {

	@Override
	public int incrementByFive(int a) {
		return a+5;
	}

	public static void main(String[] args) {
		IncrementByFiveOld incrementByFiveOld =  new IncrementByFiveOld();
		System.out.println(incrementByFiveOld.incrementByFive(2));
	}

}
