package com.learn.java_eleven.var;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class VarWithLambdaExample {

	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAll();

		var instructors2 = Instructors.getAll();

		Predicate<Instructor> exp = (var s) -> s.getYearsOfExperience() > 10;
		
		instructors2.forEach(instructor ->{
			if(exp.test(instructor)) {
				var result = instructor.getName();
				System.out.println(result);
			}
		});
		
		BiFunction<Integer, Integer, Integer> sum = (var x, var y) -> x+y;
		System.out.println(sum.apply(2, 4));
	}

}
