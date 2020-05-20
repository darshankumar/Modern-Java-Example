package com.learn.javaeight.stream;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamExample {

	public static void main(String[] args) {
		
		System.out.println("###################################### Start  " +LongStreamExample.class.getSimpleName());
		
		System.out.println("###################################### Using Of");
		// using of 
		LongStream numbers = LongStream.of(1,2,3,4,5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Iterator");
		
		numbers = LongStream.iterate(0, i->i+2).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Generator");
		
		numbers = LongStream.generate(new Random()::nextLong).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Range");
		
		
		numbers = LongStream.range(1, 5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Range Closed");
		
		
		numbers = LongStream.rangeClosed(0, 5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Ends  " +LongStreamExample.class.getSimpleName());
		
		
		
	}

}
