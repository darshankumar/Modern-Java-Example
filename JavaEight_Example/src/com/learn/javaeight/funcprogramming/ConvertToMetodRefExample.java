package com.learn.javaeight.funcprogramming;

import java.util.function.Predicate;

public class ConvertToMetodRefExample {

	public static void main(String[] args) {
		Predicate<Instructor> p1 = i -> i.getYearsOfExperience() > 10;

		Predicate<Instructor> p2 = ConvertToMetodRefExample::getGreaterThenYrs;
		
		Instructors.getAll().forEach(instructor -> {
			if(p2.test(instructor)) {
				System.out.println(instructor);
			}
		});
	}

	public static boolean getGreaterThenYrs(Instructor instructor) {
		if (instructor.getYearsOfExperience() > 10) {
			return true;
		}
		return false;

	}
}
