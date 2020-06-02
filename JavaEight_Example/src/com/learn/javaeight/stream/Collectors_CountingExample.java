/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learn.javaeight.funcprogramming.Instructors;
import com.learn.javaeight.funcprogramming.Instructor;

/**
 * @author Richa
 *
 */
public class Collectors_CountingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Long results = Stream.of("A", "B", "C", "D").collect(Collectors.counting());
		System.out.println(results);
		System.out.println("#####################################");

		results = Instructors.getAll().stream().map(e -> e.getName().length()).collect(Collectors.counting());
		System.out.println(results);
		System.out.println("#####################################");
		
		results = Instructors.getAll().stream().map(e -> e.isOnlineCourses()).count();
		System.out.println(results);
		System.out.println("#####################################");
		
		results = Instructors.getAll().stream().map(e -> e.isOnlineCourses()).collect(Collectors.counting());
		System.out.println(results);
		System.out.println("#####################################");

	}

}

/*
 * 4 ##################################### 5
 * #####################################
 */