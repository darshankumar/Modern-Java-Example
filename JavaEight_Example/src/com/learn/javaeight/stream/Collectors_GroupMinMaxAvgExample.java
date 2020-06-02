/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

/**
 * @author Richa
 *
 */
public class Collectors_GroupMinMaxAvgExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Boolean, Optional<Instructor>> maxInstructor = Instructors.getAll().stream().collect(Collectors.groupingBy(
				Instructor::isOnlineCourses, Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));

		System.out.println(maxInstructor);

		System.out.println("###########################################");

		// Collecting and Then
		Map<Boolean, Instructor> maxInstructor2 = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)), Optional::get)));

		System.out.println(maxInstructor2);
		System.out.println("###########################################");
		Map<Boolean, Double> maxInstructor3 = Instructors.getAll().stream().collect(Collectors
				.groupingBy(Instructor::isOnlineCourses, Collectors.averagingInt(Instructor::getYearsOfExperience)));

		System.out.println(maxInstructor3);
		System.out.println("###########################################");
		Map<Boolean, IntSummaryStatistics> maxInstructor4 = Instructors.getAll().stream().collect(Collectors
				.groupingBy(Instructor::isOnlineCourses, Collectors.summarizingInt(Instructor::getYearsOfExperience)));

		System.out.println(maxInstructor4);
		System.out.println("###########################################");
	}

}

/*
 * {false=Optional[Instructor{name='Gene', yearsOfExperience=6, title='Manager',
 * gender='M', onlineCourses=false, courses=[C++ Programming, C Programming,
 * React Native]}], true=Optional[Instructor{name='Anthony',
 * yearsOfExperience=15, title='Senior Developer', gender='M',
 * onlineCourses=true, courses=[Java Programming, Angular Programming, React
 * Native]}]}
 * 
 */