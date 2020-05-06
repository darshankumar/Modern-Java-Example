package com.learn.javaeight.funcprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = i -> i * 10;
		System.out.println(unary.apply(10));

		Function<Integer, Integer> fun = i -> i * 10;

		System.out.println(fun.apply(10));

		IntUnaryOperator intUniOptr = i -> i * 10;
		System.out.println(intUniOptr.applyAsInt(10));

		LongUnaryOperator lngUniOptr = i -> i * 10L;
		System.out.println(lngUniOptr.applyAsLong(10L));

		DoubleUnaryOperator dblUniOptr = i -> i * 10;
		System.out.println(dblUniOptr.applyAsDouble(10));

	}

}
