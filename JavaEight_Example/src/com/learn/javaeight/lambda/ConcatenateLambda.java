package com.learn.javaeight.lambda;

public class ConcatenateLambda {
	
	public static void main(String[] args) {
		ConcatenateInterface concatenateLambda = (a,b) -> a + " " +b;
		System.out.println(concatenateLambda.concat("Hello", "World"));
	}

}
