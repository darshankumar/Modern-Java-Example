package com.learn.javaeight.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample1 {

	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAll();

		// Print name and gender

		BiConsumer<String, String> biConsumer = (name, gender) -> System.out
				.println("name is :" + name + "and gender is " + gender);

		instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getGender()));

		// Print out name and list courses

		BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out
				.println("name is " + name + "and courses are :" + courses);

		instructors.forEach(instructor -> biConsumer2.accept(instructor.getName(), instructor.getCourses()));

		// Print name and gender who teaches online

		instructors.forEach(instructor -> {
			if (instructor.isOnlineCourses()) {
				biConsumer.accept(instructor.getName(), instructor.getGender());
			}
		});

	}

}
