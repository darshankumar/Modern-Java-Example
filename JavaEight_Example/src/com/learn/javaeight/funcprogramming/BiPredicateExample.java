package com.learn.javaeight.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAll();

		BiPredicate<Boolean, Integer> p3 = (isonline, experience) -> isonline == true && experience > 10;

		BiConsumer<String, List<String>> bc1 = (name, courses) -> System.out
				.println("name is  " + name + "  courses is " + courses);

		instructors.forEach(instructor -> {
			if (p3.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience())) {
				bc1.accept(instructor.getName(), instructor.getCourses());
			}
		});

	}

}
