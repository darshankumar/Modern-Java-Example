/**
 * 
 */
package com.learn.javaeight.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.learn.javaeight.funcprogramming.Instructors;
import com.learn.javaeight.funcprogramming.Instructor;

/**
 * @author Richa
 *
 */
public class Collectors_MappingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// map
		List<String> iNames = Instructors.getAll().stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(iNames);
		System.out.println("#####################################");
		
		// mapping
		iNames =Instructors.getAll().stream().collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
		
		System.out.println(iNames);
		System.out.println("#####################################");
		
		Map<Integer, List<String>> output = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getYearsOfExperience,Collectors.mapping(Instructor::getName, Collectors.toList())));
		System.out.println(output);
		
		
	}

}

/**
[Mike, Jenny, Gene, Anthony, Syed]
#####################################
[Mike, Jenny, Gene, Anthony, Syed]
#####################################
*/