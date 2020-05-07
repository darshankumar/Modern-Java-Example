package com.learn.javaeight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// max using stream

		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println(max.get());

		// Using reduce
		Optional<Integer> max2 = list.stream().reduce((a, b) -> a > b ? a : b);
		System.out.println(max2.get());

		// Using reduce
		Optional<Integer> max3 = list.stream().reduce(Integer::max);
		System.out.println(max3.get());
	}

}
