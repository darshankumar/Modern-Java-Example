package com.learn.javaeight.stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		
		System.out.println("###################################### Start  " +NumericStreamAggregateExample.class.getSimpleName());
		
		System.out.println("###################################### Sum ");
		// using of 
		int sum = IntStream.rangeClosed(0, 1000).sum();
		System.out.println("Sum :: " + sum);
		
		System.out.println("###################################### Max Num ");
		// using of 
		OptionalInt max = IntStream.rangeClosed(0, 1000).max();
		System.out.println("max :: " + max.getAsInt());
		
		
		System.out.println("###################################### Min Num ");
		// using of 
		OptionalInt min = IntStream.rangeClosed(0, 1000).min();
		System.out.println("min :: " + min.getAsInt());
		
		
		System.out.println("###################################### Avg Num ");
		// using of 
		OptionalDouble avg = IntStream.rangeClosed(0, 1000).average();
		System.out.println("Avg :: " + avg.getAsDouble());
		
		System.out.println("###################################### Ends  " +NumericStreamAggregateExample.class.getSimpleName());
		
		
		
	}

}
