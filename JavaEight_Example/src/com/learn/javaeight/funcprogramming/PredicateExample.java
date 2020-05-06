package com.learn.javaeight.funcprogramming;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		//if number is >10 
		Predicate<Integer>  p1 = i->i>10;
		System.out.println(p1.test(11));
		
		//if i>10 and numbe is even
		Predicate<Integer>  p2= i-> i%2==0;
		
		System.out.println(p1.and(p2).test(20));
		
		// i>10 or i is even
		System.out.println(p1.or(p2).test(4));
		
		// i>10 && number is even
		System.out.println(p1.and(p2.negate()).test(33));
	}

}
