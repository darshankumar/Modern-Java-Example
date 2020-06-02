/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

/**
 * @author Richa
 *
 */
public class Collectors_PartitioningByExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// parition by yr of exp >10 & epx <10

		Predicate<Instructor> expPredicate = instructor -> instructor.getYearsOfExperience() > 10;
		// Predicate<Instructor> expPredicate = instructor ->
		// instructor.getYearsOfExperience() <10;

		Map<Boolean, List<Instructor>> map = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(expPredicate));

		// System.out.println(map);

		map.forEach((k, v) -> System.out.println("k== " + k + "  v === " + v));

		Map<Boolean, Set<Instructor>> map2 = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(expPredicate, Collectors.toSet()));

		map2.forEach((k, v) -> System.out.println("k== " + k + "  v === " + v));

	}

}

/*
 * 4 ##################################### 5
 * #####################################
 */