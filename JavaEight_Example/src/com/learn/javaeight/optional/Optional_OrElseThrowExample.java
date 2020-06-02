/**
 * 
 */
package com.learn.javaeight.optional;

import java.util.Optional;

/**
 * @author Richa
 *
 */
public class Optional_OrElseThrowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] numbers = new Integer[10];
		numbers[0] = 1;

		// orElse -- it return value
		Optional<Integer> number = Optional.ofNullable(numbers[0]);
		int result = number.orElse(-1);
		System.out.println(result); // -1

		number = Optional.ofNullable(numbers[1]); // it null now
		result = number.orElse(-1);
		System.out.println(result); // -1

		// orElseGet - it takes supplier
		number = Optional.ofNullable(numbers[0]); // it null now
		result = number.orElseGet(() -> -1);
		System.out.println(result); // -1

		number = Optional.ofNullable(numbers[1]); // it null now
		result = number.orElseGet(() -> -1);
		System.out.println(result); // -1

		// orElseThrow

		// orElseGetThrow - it will throw exception
		number = Optional.ofNullable(numbers[0]); // it null now
		result = number.orElseThrow();
		System.out.println(result); // -1

		number = Optional.ofNullable(numbers[1]); // it null now
		try {
			result = number.orElseThrow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// java.util.NoSuchElementException
		System.out.println(result); // -1

		// orElseGetThrow - it will throw exception
		number = Optional.ofNullable(numbers[0]); // it null now
		try {
			result = number.orElseThrow(Exception::new);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result); // -1

		number = Optional.ofNullable(numbers[1]); // it null now
		try {
			result = number.orElseThrow(Exception::new);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result); // -1

	}

}

/**
 * 
 * Exception in thread "main" java.lang.NullPointerException at
 * com.learn.javaeight.optional.Optional_Example.main(Optional_Example.java:18)
 * 
 */
