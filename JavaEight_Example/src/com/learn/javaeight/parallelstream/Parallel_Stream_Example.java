/**
 * 
 */
package com.learn.javaeight.parallelstream;

import java.util.stream.IntStream;

/**
 * @author Richa
 *
 */
public class Parallel_Stream_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(" sumSequentialStream() = " + sumSequentialStream());
		System.out.println(" sumParallelStream() =  " + sumParallelStream());

	}

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 5000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(0, 5000).parallel().sum();
	}
}
