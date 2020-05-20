package com.learn.javaeight.stream;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToObjDoubleStreamExample {

	public static void main(String[] args) {

		System.out.println(
				"###################################### Start  " + MapToObjDoubleStreamExample.class.getSimpleName());

		System.out.println("######################################  MapToObj");
		List<RandomIds> randomIds = IntStream.rangeClosed(0, 5).mapToObj((i) -> {
			return new RandomIds(i, ThreadLocalRandom.current().nextInt(100));
		}).collect(Collectors.toList());

		randomIds.forEach(System.out::println);

		System.out.println("######################################  MapToLong");

		LongStream lngStream = IntStream.rangeClosed(0, 100).mapToLong(i -> (long) i);
		lngStream.forEach(System.out::println);
		
		System.out.println("######################################  MapToDouble");
		
		DoubleStream dblStream = LongStream.rangeClosed(0, 100).mapToDouble(i -> (double) i);
		dblStream.forEach(System.out::println);

		System.out.println(
				"###################################### Ends  " + MapToObjDoubleStreamExample.class.getSimpleName());

	}

}

class RandomIds {
	int id;

	int randomNumbers;

	public RandomIds(int id, int randomNumbers) {
		// super();
		this.id = id;
		this.randomNumbers = randomNumbers;
	}

	@Override
	public String toString() {
		return "RandomIds [id=" + id + ", randomNumbers=" + randomNumbers + "]";
	}

}