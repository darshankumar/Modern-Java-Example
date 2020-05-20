package com.learn.javaeight.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingStreamExample {

	public static void main(String[] args) {
		
		System.out.println("###################################### Start  " +BoxingUnboxingStreamExample.class.getSimpleName());
			
		IntStream intStream = IntStream.rangeClosed(0, 5000); // Stream of primitive
		
		List<Integer> numList = intStream.boxed().collect(Collectors.toList()); // making Integer List
		
		numList.forEach(System.out::println);
		
		
		Optional<Integer> sum = numList.stream().reduce((a,b)->a+b);
		sum.ifPresent(System.out::println);
		
		
		int sum1 = numList.stream().mapToInt(Integer::intValue).sum(); // unboxing
		System.out.println("Sum :: " + sum1);
		System.out.println("###################################### Ends  " +BoxingUnboxingStreamExample.class.getSimpleName());
		
		
		
	}

}
