package com.learn.javaeight.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {

	public static void main(String[] args) {
		
		System.out.println("###################################### Start  " +DoubleStreamExample.class.getSimpleName());
		
		System.out.println("###################################### Using Of");
		// using of 
		DoubleStream numbers = DoubleStream.of(1.2,2.2,3.2,4.2,5.2);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Iterator");
		
		numbers = DoubleStream.iterate(0, i->i+2.0).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Generator");
		
		numbers = DoubleStream.generate(new Random()::nextDouble).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Range");
		
		
		numbers = LongStream.range(1, 5).asDoubleStream();
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Range Closed");
		
		
		numbers = LongStream.rangeClosed(0, 5).asDoubleStream();
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Ends  " +DoubleStreamExample.class.getSimpleName());
		
		
		
	}

}
