package com.learn.javaeight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitSkipExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		list.forEach(System.out::print);
		System.out.println("-----------------------------------");
		List<Integer> listTill5 = list.stream().limit(5).collect(Collectors.toList());
		
		listTill5.forEach(System.out::print);
		
		System.out.println("-----------------------------------");
		List<Integer> listSkip5 = list.stream().skip(5).collect(Collectors.toList());
		
		listSkip5.forEach(System.out::print);
	}

}
