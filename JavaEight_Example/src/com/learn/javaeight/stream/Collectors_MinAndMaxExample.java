/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learn.javaeight.funcprogramming.Instructors;
import com.learn.javaeight.funcprogramming.Instructor;

/**
 * @author Richa
 *
 */
public class Collectors_MinAndMaxExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instrucors with min yrs of experience
		Optional<Instructor> instrucotr = Instructors.getAll().stream()
				.collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));

		//instrucotr.ifPresent(e -> System.out.println(e.getName()));
		instrucotr.ifPresent(System.out::print);
		System.out.println(instrucotr.get());
		
		
		instrucotr = Instructors.getAll().stream().min
				(Comparator.comparing(Instructor::getYearsOfExperience));

		//instrucotr.ifPresent(e -> System.out.println(e.getName()));
		instrucotr.ifPresent(System.out::print);
		System.out.println(instrucotr.get());
		
		
		instrucotr = Instructors.getAll().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));

		//instrucotr.ifPresent(e -> System.out.println(e.getName()));
		instrucotr.ifPresent(System.out::print);
		System.out.println(instrucotr.get());
		
		instrucotr = Instructors.getAll().stream().max(Comparator.comparing(Instructor::getYearsOfExperience));

		//instrucotr.ifPresent(e -> System.out.println(e.getName()));
		instrucotr.ifPresent(System.out::print);
		System.out.println(instrucotr.get());

	}

}

/*
 * 4 ##################################### 5
 * #####################################
 */