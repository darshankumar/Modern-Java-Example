package com.learn.javaeight.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class StreamComparatorExample {

	public static void main(String[] args) {
		
		// Compare by name
		List<Instructor> list = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName))
				.collect(Collectors.toList());

		list.forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		// Compare by name in reverse
		List<Instructor> relist = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName).reversed())
				.collect(Collectors.toList());

		relist.forEach(System.out::println);


	}

}
