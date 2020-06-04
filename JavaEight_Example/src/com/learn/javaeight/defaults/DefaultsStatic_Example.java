/**
 * 
 */
package com.learn.javaeight.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Richa
 *
 */
public class DefaultsStatic_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> names =  Arrays.asList("Mike","Syed","Darshan","Ameet","Mahendra");
		Collections.sort(names); // this is static method.
		
		System.out.println("sorted == " + names);
		
		names =  Arrays.asList("Mike","Syed","Darshan","Ameet","Mahendra");
		names.sort(Comparator.naturalOrder()); // sort is default method in List interface
		
		System.out.println("sorted == " + names);

	}

}
