package com.learn.javaeight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("mike");
		names.add("Syed");
		names.add("Rajeev");
		System.out.println("-------------------");
		System.out.println(names);

		names.remove("Syed");

		System.out.println("-------------------");
		System.out.println(names);

		for (String name : names) {
			System.out.println(name); // External
		}

		Stream<String> nameStream = names.stream();
		// new Stream() stream can't initiated as it is abstract
		// Stream don't have add or remove operations

		nameStream.forEach(System.out::println); // internally

		List<String> list2 = names.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());

		System.out.println(list2);
		
		//Debugging stream using peak

	}
}
