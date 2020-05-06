package com.learn.javaeight.funcprogramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ComsumerExample3 {

	public static void main(String[] args) {

		IntConsumer intConsumer = a -> System.out.println(a * 10);
		intConsumer.accept(10);

		LongConsumer lngConsumer = a -> System.out.println(a * 10L);
		lngConsumer.accept(10L);

		DoubleConsumer dblConsumer = a -> System.out.println(a * 10L);
		dblConsumer.accept(10.50);
		
		
	}

}
