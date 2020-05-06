package com.learn.javaeight.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodRefernceExample {

	public static void main(String[] args) {
		Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		Predicate<Instructor> p2 = Instructor::isOnlineCourses;

		Function<Integer, Double> sqrt = n -> Math.sqrt(n);
		Function<Integer, Double> sqrt1 = Math::sqrt;
		
		Function<String,String> toLowCase = s ->s.toLowerCase();
		Function<String,String> toLowCase1 = String::toLowerCase;
	}

}
