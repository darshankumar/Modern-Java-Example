package com.learn.javaeight.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class StreamFilterExample {

	public static void main(String[] args) {

		Predicate<Instructor> p1 = Instructor::isOnlineCourses;
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;

		List<Instructor> list = Instructors.getAll();

		Map<String, List<String>> map = list.stream()
				.filter(p1)
				.filter(p2)
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		
		System.out.println(map);
		
		Comparator<Instructor> c1 = Comparator.comparing(Instructor::getName);
		
		List<Instructor> ilist = list.stream()
				.filter(p2) // filter by experience 
				.sorted(c1) // sorted by name
				.collect(Collectors.toList());
		
		System.out.println(ilist);
		
		
		

	}

}
