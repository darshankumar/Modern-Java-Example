/**
 * 
 */
package com.learn.javaeight.optional;

import java.util.Optional;

/**
 * @author Richa
 *
 */
public class Optional_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ifPresent
		Optional<String> stringOptional = Optional.ofNullable("Hello World");
		// isPresent - just boolean to verrify
		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		}

		// ifPresent - call back function consumer
		stringOptional.ifPresent(System.out::println);

		stringOptional.ifPresent(s -> {
			s = s.toUpperCase();
			System.out.println(s);
		});

		stringOptional.ifPresentOrElse((i) -> System.out.println("if Present"+ i),
				() -> System.out.println("No Action Any"));

	}

}

/**
 * 
 * Exception in thread "main" java.lang.NullPointerException at
 * com.learn.javaeight.optional.Optional_Example.main(Optional_Example.java:18)
 * 
 */
