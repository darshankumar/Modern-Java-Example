package com.learn.javaeight.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class StreamDebuggingExample {

	public static void main(String[] args) {

		Predicate<Instructor> p1 = Instructor::isOnlineCourses;
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;

		List<Instructor> list = Instructors.getAll();

		Map<String, List<String>> map = list.stream()
				.peek(s->System.out.println("Total Stream "+ s))
				.filter(p1)
				.peek(s->System.out.println("Total Stream after p1  "+ s))
				.filter(p2)
				.peek(s->System.out.println("Total Stream after p2   "+ s))
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		
		System.out.println(map);
		
		

	}

}
