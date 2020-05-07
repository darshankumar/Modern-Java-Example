package com.learn.javaeight.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class FlatMapExample {

	public static void main(String[] args) {

		Set<String> courses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.collect(Collectors.toSet());
		System.out.println(courses);

	}

}
