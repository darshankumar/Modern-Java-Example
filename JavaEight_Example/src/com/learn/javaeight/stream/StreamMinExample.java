package com.learn.javaeight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// max using stream

		Optional<Integer> min = list.stream().min(Integer::compareTo);
		System.out.println(min.get());

		// Using reduce
		Optional<Integer> min2 = list.stream().reduce((a, b) -> a < b ? a : b);
		System.out.println(min2.get());

		// Using reduce
		Optional<Integer> min3 = list.stream().reduce(Integer::min);
		System.out.println(min3.get());
	}

}
