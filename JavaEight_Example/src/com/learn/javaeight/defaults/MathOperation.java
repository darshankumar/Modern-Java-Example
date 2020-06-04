package com.learn.javaeight.defaults;

public class MathOperation implements Calculator {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public static void main(String[] args) {
		MathOperation mathOperation = new MathOperation();
		System.out.println("mathOperation.sum " + mathOperation.sum(3, 4));
		// System.out.println("mathOperation.division " + mathOperation.division(9, 3));

		Calculator calculatorDivide = (a, b) -> a % b;
		System.out.println("Calculator Override ---- " + calculatorDivide.sum(3, 2));

		// static method
		System.out.println("mathOperation.multiply " + Calculator.multiply(3, 4));

	}

}
