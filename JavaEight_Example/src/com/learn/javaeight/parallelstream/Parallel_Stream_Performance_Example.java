/**
 * 
 */
package com.learn.javaeight.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * @author Richa
 *
 */
public class Parallel_Stream_Performance_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int loop = 20;
		Supplier<Integer> Sequential = Parallel_Stream_Performance_Example::sumSequentialStream;
		Supplier<Integer> parallel = Parallel_Stream_Performance_Example::sumSequentialStream;

		long result = measurePerformance(Sequential, loop);
		System.out.println("Sequential measurePerformance " + result + "TimeMillis");

		result = measurePerformance(parallel, loop);
		System.out.println("Parallel measurePerformance " + result + "TimeMillis");

	}

	public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < numberOfTimes; i++) {
			supplier.get();
		}

		return System.currentTimeMillis() - startTime;
	}

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 5000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(0, 5000).parallel().sum();
	}
}
