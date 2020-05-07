package com.learn.javaeight.stream;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class StreamMapFilterReduceExample {

	public static void main(String[] args) {

		Integer total = Instructors.getAll().stream().filter(Instructor::isOnlineCourses)
				.map(Instructor::getYearsOfExperience).reduce(0, Integer::sum);

		System.out.println(total);
	}
}
