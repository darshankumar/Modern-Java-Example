package com.learn.javaeight.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {

	public static void main(String[] args) {

		// of method

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(System.out::println);

		// iterate

		Stream<Integer> stream1 = Stream.iterate(0, i -> i + 2).limit(20); // like loop
		stream1.forEach(System.out::println);

		// generate

		Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(20);
		stream2.forEach(System.out::println);

	}

}
