/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

/**
 * @author Richa
 *
 */
public class Collectors_GroupByExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> names = List.of("Darshan", "Ameet", "Richa", "Ritika", "Devaansh");

		Map<Integer, List<String>> groupby = names.stream().collect(
				Collectors.groupingBy(String::length, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
		System.out.println(groupby);

		System.out.println("################################");

		Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::getGender));

		System.out.println(instructorByGender);
		System.out.println("################################");
		Map<String, List<Instructor>> instructorByExperience = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(
						instructor -> instructor.getYearsOfExperience() > 10 ? "Senior" : "Junior",
						Collectors.filtering(instructor -> instructor.isOnlineCourses(), Collectors.toList())));

		System.out.println(instructorByExperience);
		System.out.println("################################");

	}

}

/*
 * 4 ##################################### 5
 * #####################################
 */