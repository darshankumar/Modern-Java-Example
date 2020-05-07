package com.learn.javaeight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstFindAnyExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// find Any

		Optional<Integer> any = list.stream().findAny();
		System.out.println(any.get());

		// find Many
		Optional<Integer> first = list.stream().findFirst();
		System.out.println(first.get());

		
	}

}
