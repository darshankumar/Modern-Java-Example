package com.learn.javaeight.lambda;

public class HelloWorldLambda {

	public static void main(String[] args) {
		HelloWorldInterface helloByLambda = () -> System.out.println("Hello World Lamdba +++ helloByLambda");
		HelloWorldInterface helloByLambda2 = () -> { System.out.println("Hello World Lamdba +++ helloByLambda");}; //within { }
		helloByLambda.sayHello();
		helloByLambda2.sayHello();
	}

}
