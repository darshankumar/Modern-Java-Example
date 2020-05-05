package com.learn.javaeight.lambda;

public class HelloWorldOld implements HelloWorldInterface {

	@Override
	public void sayHello() {
		System.out.println("Hello World Old ++++ sayHello");
	}

	public static void main(String[] args) {
		HelloWorldOld helloWorldOld = new HelloWorldOld();
		helloWorldOld.sayHello();
	}

}
