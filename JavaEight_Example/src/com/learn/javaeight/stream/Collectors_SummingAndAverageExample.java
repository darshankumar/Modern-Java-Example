/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

/**
 * @author Richa
 *
 */
public class Collectors_SummingAndAverageExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IntStream intStream = IntStream.rangeClosed(0, 100);
		int sum = intStream.sum();
		System.out.println(sum);
		
		sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
		System.out.println(sum);
		
		Double avg = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
		System.out.println(avg);
		
	}

}

/*
 * 4 ##################################### 5
 * #####################################
 */