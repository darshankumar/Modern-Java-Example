package com.learn.javaeight.funcprogramming;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer, Double>  sqrt = n -> Math.sqrt(n);
		System.out.println("Square root of 64 = "+ sqrt.apply(64));
		System.out.println("Square root of 81 = "+ sqrt.apply(81));
		
		Function<String, String> lowercase= n ->n.toLowerCase();
		System.out.println(lowercase.apply("ABCD"));
		
		Function<String, String> concat = str -> str.concat(" In Java");
		// lowercase ---> Then concat
		System.out.println(lowercase.andThen(concat).apply("PROGRAMMING"));//programming In Java
		// concat first ---> then lowercase
		System.out.println(lowercase.compose(concat).apply("PROGRAMMING TO")); // programming to in java
		

	}

}
