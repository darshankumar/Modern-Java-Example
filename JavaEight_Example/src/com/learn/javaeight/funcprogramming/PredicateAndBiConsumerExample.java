package com.learn.javaeight.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {

	public static void main(String[] args) {
	
		List<Instructor> instructors = Instructors.getAll();
		
		Predicate<Instructor> p1 = i -> i.isOnlineCourses()==true;
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() >10;
		
		BiConsumer<String, List<String>> bc1 = (name,courses) -> System.out.println("name is  " + name + "  courses is " + courses);
		
		instructors.forEach(instructor ->{
			if(p1.and(p2).test(instructor)) {
				bc1.accept(instructor.getName(), instructor.getCourses());
			}
		});
		

	}

}
