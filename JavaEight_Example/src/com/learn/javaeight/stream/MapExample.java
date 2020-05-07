package com.learn.javaeight.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class MapExample {

	public static void main(String[] args) {

		Predicate<Instructor> p1 = Instructor::isOnlineCourses;
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;

		List<Instructor> list = Instructors.getAll();

		Map<String, List<String>> map = list.stream().filter(p1).filter(p2)
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

		System.out.println(map);

		// Map instrucotr to name
		List<String> names = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
		System.out.println(names);

		List<String> names2 = Instructors.getAll().stream().map(Instructor::getName).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(names2);

		Set<String> names3 = Instructors.getAll().stream().map(Instructor::getName).map(String::toUpperCase)
				.collect(Collectors.toSet());
		System.out.println(names3);

	}

}
