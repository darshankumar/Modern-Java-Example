/**
 * 
 */
package com.learn.javaeight.optional;

import java.util.Optional;

/**
 * @author Richa
 *
 */
public class OptionalOfEmpty_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Optional<String> optionalString = Optional.of("Hello World");
		System.out.println("optionalString = " + optionalString);

		//Optional<String> optionalString2 = Optional.of(null); // NPE
		//System.out.println("optionalString = " + optionalString2);
		
		System.out.println(getWords());
		

	}

	public static Optional<String> getWords() {
		String[] words = new String[10];
		words[1] = "test";
		Optional<String> optionalS = Optional.ofNullable(words[1]);
		if (optionalS.isPresent()) {
			return optionalS;
		} else {
			return Optional.empty();
		}
	}

}

/**
 * 
 * Exception in thread "main" java.lang.NullPointerException at
 * com.learn.javaeight.optional.Optional_Example.main(Optional_Example.java:18)
 * 
 */
