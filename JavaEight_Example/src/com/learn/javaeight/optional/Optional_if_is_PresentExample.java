/**
 * 
 */
package com.learn.javaeight.optional;

import java.util.Optional;

/**
 * @author Richa
 *
 */
public class Optional_if_is_PresentExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] numbers = new Integer[10];
		//int output = numbers[1].intValue(); // will throw NPE
		//System.out.println(output); // 
		
		
		Optional<Integer> intNullCheck	 = Optional.ofNullable(numbers[0]);
		int result  = intNullCheck.isPresent() ? intNullCheck.get():-1;
		System.out.println(result); //-1
		

	}

}

/**
 * 
 * Exception in thread "main" java.lang.NullPointerException at
 * com.learn.javaeight.optional.Optional_Example.main(Optional_Example.java:18)
 * 
 */
