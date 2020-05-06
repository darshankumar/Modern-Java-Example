package com.learn.javaeight.funcprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		// All instructor who teaches online
		Predicate<Instructor> p1 = i->i.isOnlineCourses()==true;
		
		// instrcuor experience morethen 10
		Predicate<Instructor> p2 = i-> i.getYearsOfExperience()>10;
		
		List<Instructor> instructors = Instructors.getAll();
		
		instructors.forEach(instructor ->{
			if(p1.test(instructor)) {
				System.out.println(instructor);
			}
		});
		
		System.out.println("______________________________________");
		instructors.forEach(instructor ->{
			if(p1.and(p2).test(instructor)) {
				System.out.println(instructor);
			}
		});
	}

}
