package com.learn.javaeight.funcprogramming;

import java.util.Arrays;

public class ConstructorRefExample {

	public static void main(String[] args) {
		InstructorFactory factory = Instructor :: new;
		
		Instructor instructor =factory.getInstructor("Mike", 10, "Software Developer"
		         , "M", true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
		
		System.out.println(instructor);
		
	}

}
