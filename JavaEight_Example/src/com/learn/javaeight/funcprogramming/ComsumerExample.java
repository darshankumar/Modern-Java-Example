package com.learn.javaeight.funcprogramming;

import java.util.function.Consumer;

public class ComsumerExample {

	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println(x.length() + " the value of x :" + x);
		c.accept("Up In The Air");
		
		
		//Consumer  with Block statment
		Consumer<Integer> d = (x) ->{
			System.out.println("x*x = : " + x*x);
			System.out.println("x*/x = : " + x/x);
		};
		
		d.accept(10);
	}

}
