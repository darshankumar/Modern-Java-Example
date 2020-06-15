/**
 * 
 */
package com.learn.javaeight.parallelstream;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author Richa
 *
 */
public class Parallel_Stream_Performance_Example2 {
	static int tokenCount = 50000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int loop = 20;
		Supplier<Integer> Sequential = Parallel_Stream_Performance_Example2::sortSequentialStream;
		Supplier<Integer> parallel = Parallel_Stream_Performance_Example2::sortParallelStream;

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

	

	public static int sortSequentialStream() {
		List<RandomTokens> randomTokens = LongStream.range(0, tokenCount).mapToObj((i) -> {
			return new RandomTokens(i, ThreadLocalRandom.current().nextInt(tokenCount));
		}

		).collect(Collectors.toList());

		randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));

		return -1;
	}

	public static int sortParallelStream() {

		List<RandomTokens> randomTokens = LongStream.range(0, tokenCount).parallel().mapToObj((i) -> {
			return new RandomTokens(i, ThreadLocalRandom.current().nextInt(tokenCount));
		}

		).collect(Collectors.toList());

		randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));

		return -1;
	}

}

class RandomTokens {
	long id;
	long tokens;

	public RandomTokens(long i, long tokens) {
		// super();
		this.id = i;
		this.tokens = tokens;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the tokens
	 */
	public long getTokens() {
		return tokens;
	}

	/**
	 * @param tokens the tokens to set
	 */
	public void setTokens(long tokens) {
		this.tokens = tokens;
	}

}
