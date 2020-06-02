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
public class Collectors_JoiningExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String results = Stream.of("A", "B", "C", "D").collect(Collectors.joining());
		System.out.println(results);
		System.out.println("#####################################");

		results = Stream.of("A", "B", "C", "D").collect(Collectors.joining(","));
		System.out.println(results);
		System.out.println("#####################################");

		results = Stream.of("A", "B", "C", "D").collect(Collectors.joining(",", "{", "}"));
		System.out.println(results);
		System.out.println("#####################################");

		// get names of instructor separated by , and surrounded by [ ]

		results = Instructors.getAll().stream().map(e -> e.getName()).collect(Collectors.joining(",", "{", "}"));
		System.out.println(results);
		System.out.println("#####################################");
		
		results = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.joining(",", "{", "}"));
		System.out.println(results);
		System.out.println("#####################################");
		
	}

}

/*
 * Output ABCD ##################################### A,B,C,D
 * ##################################### {A,B,C,D}
 * #####################################
 */