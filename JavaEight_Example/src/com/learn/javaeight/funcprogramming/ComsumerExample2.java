package com.learn.javaeight.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ComsumerExample2 {

	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAll();

		// Looping through all the instructors and printing out values of instructor

		Consumer<Instructor> c1 = (s1) -> System.out.println(s1);

		instructors.forEach(c1);
		
		// Loop through all the instructor and print out name only
		
		Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
		
		instructors.forEach(c2);
		
		// Loop through all the instructor and print out name and courses
		
		Consumer<Instructor> c3 = (s1) -> System.out.print(s1.getCourses());
		
		instructors.forEach(c2.andThen(c3)); // chaining of consumer
		
		// Loop through all the instructors and print out name if year of experience >10
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
		instructors.forEach(s1 -> {
			if(s1.getYearsOfExperience()>10) {
				c1.accept(s1);
			}
		});
		
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
		
		// Loop through all the instructor and print out name and experience if yrs of experience >5 and course is online
		
		instructors.forEach(s1->{
			if(s1.getYearsOfExperience()>5 && s1.isOnlineCourses()) {
				c1.andThen(c2).accept(s1);
				
			}
		});
		
		
	}

}
