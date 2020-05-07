package com.learn.javaeight.stream;

import java.util.List;
import java.util.Optional;

import com.learn.javaeight.funcprogramming.Instructor;
import com.learn.javaeight.funcprogramming.Instructors;

public class StreamReduceExample2 {

	public static void main(String[] args) {

		List<Instructor> list = Instructors.getAll();

		Optional<Instructor> instructor = Instructors.getAll().stream().reduce((s1, s2) -> {
			if (s1.getYearsOfExperience() > s2.getYearsOfExperience())
				return s1;
			else
				return s2;
		});
		
		if(instructor.isPresent())
		System.out.println(instructor.get());
		
		
		Optional<Instructor> instructor2 = Instructors.getAll().stream().reduce((s1, s2) -> s1.getYearsOfExperience()>s2.getYearsOfExperience()?s1:s2);
		
		if(instructor2.isPresent())
		System.out.println(instructor2.get());
	}
}
