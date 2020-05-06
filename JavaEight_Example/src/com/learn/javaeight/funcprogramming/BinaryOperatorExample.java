package com.learn.javaeight.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(2, 4));

		Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
		BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
		System.out.println(maxBi.apply(10, 20));

		BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
		System.out.println(minBi.apply(10, 20));

		IntBinaryOperator intBi = (a, b) -> a * b;
		System.out.println(intBi.applyAsInt(20, 30));

		LongBinaryOperator lngBi = (a, b) -> a * b;
		System.out.println(lngBi.applyAsLong(20, 30));

		DoubleBinaryOperator dblBi = (a, b) -> a * b;
		System.out.println(dblBi.applyAsDouble(20, 30));
	}

}
