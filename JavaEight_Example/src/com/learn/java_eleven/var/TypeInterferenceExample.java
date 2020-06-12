package com.learn.java_eleven.var;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterferenceExample {
	
	//var test = "ok"; // var can't be global level
	
	public static void main(String[] args) {
		// String
		String name = "Mike";
		var name2 = "Mike";
		System.out.println(name2);

		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		var localDateTime2 = LocalDateTime.now();
		System.out.println(localDateTime2);

		// Map
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		var map2 = new HashMap<Integer, String>();

		// integer array
		int[] numbers = { 1, 2, 3, 4, 5 };
		// var numbers2 = {1,2,3,4,5}; // it wwont't work
		var numbers2 = new int[] { 1, 2, 3, 4, 5 }; // it wwont't work

		// List
		List<String> names = new ArrayList<String>();
		names.add("Darshan");
		names.add("Bhatia");
		// names.add(2.00); this is type safty ..can't allow other type
		System.out.println(names);

		var names2 = new ArrayList();
		names2.add("Darshan");
		names2.add("Bhatia");
		names2.add(100); // can allow any type
		names2.add(3.00);
		System.out.println(names2);

		// Interger
		var integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		integers.forEach(System.out::println);

		// int num =999999999999L; won't work
		var num = 999999999999L; // it works as now it is long
		var num2 = 999999999999.88888D; // it decimal now

		var result = 9 / 2;
		System.out.println("result  " + result);

		var result2 = 9.0 / 2;
		System.out.println("result2  " + result2);

		var result3 = 11d / 2d;
		System.out.println("result3  " + result3);

		var str = "OK fine";
		printString(str);
	}

	private static void printString(String str) {
		System.out.println(str);

	}

}

/** Notes
var can't be global or class level
its only local to method
**/