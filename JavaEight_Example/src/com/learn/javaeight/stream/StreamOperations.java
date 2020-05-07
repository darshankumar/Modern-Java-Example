package com.learn.javaeight.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class StreamOperations {

	public static void main(String[] args) {

		List<String> courses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(courses);

		// Count

		Long count = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).count();
		System.out.println(count);

		// Distinct

		Long distinctcount = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).distinct()
				.count();
		System.out.println(distinctcount);

		List<String> dcourses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.distinct().collect(Collectors.toList());
		System.out.println(dcourses);

		// Sorted
		List<String> sortedcourses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedcourses);

		// Any match

		boolean anymatchcourses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.distinct().sorted().anyMatch(s -> s.startsWith("J"));

		System.out.println(anymatchcourses);// true

		// All match

		boolean allmatchcourses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.distinct().sorted().allMatch(s -> s.startsWith("J"));

		System.out.println(allmatchcourses); // false

		// None match

		boolean nonematchcourses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.distinct().sorted().noneMatch(s -> s.startsWith("J"));

		System.out.println(nonematchcourses); // false

	}

}
