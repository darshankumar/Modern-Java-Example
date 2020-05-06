package com.learn.javaeight.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

	public static void main(String[] args) {

		Predicate<Instructor> isOnline = i -> i.isOnlineCourses() == true;
		BiFunction<List<Instructor>, Predicate, Map<String, Integer>> biMapFunction = ((instructors, predicate) -> {
			Map<String, Integer> map = new HashMap<>();
			instructors.forEach(instructor -> {
				if (predicate.test(instructor)) {
					map.put(instructor.getName(), instructor.getYearsOfExperience());
				}
			});
			return map;
		});

		System.out.println(biMapFunction.apply(Instructors.getAll(), isOnline));

	}

}
