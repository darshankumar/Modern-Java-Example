package com.learn.javaeight.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		
		System.out.println("###################################### Start  " +IntStreamExample.class.getSimpleName());
		
		System.out.println("###################################### Using Of");
		// using of 
		IntStream numbers = IntStream.of(1,2,3,4,5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Iterator");
		
		numbers = IntStream.iterate(0, i->i+2).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Generator");
		
		numbers = IntStream.generate(new Random()::nextInt).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Range");
		
		
		numbers = IntStream.range(1, 5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Using Range Closed");
		
		
		numbers = IntStream.rangeClosed(0, 5);
		numbers.forEach(System.out::println);
		
		System.out.println("###################################### Ends  " +IntStreamExample.class.getSimpleName());
		
		
		
	}

}
