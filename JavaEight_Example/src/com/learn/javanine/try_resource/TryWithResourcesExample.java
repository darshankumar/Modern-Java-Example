package com.learn.javanine.try_resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		// java 8
		Reader inputString = new StringReader("Can the rope");
		BufferedReader bufferedReader = new BufferedReader(inputString);

		try (BufferedReader bufferedReader1 = bufferedReader) {
			System.out.println("java 8 try  " + bufferedReader1.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Java 9
		Reader inputString2 = new StringReader("Can the rope");
		BufferedReader bufferedReader2 = new BufferedReader(inputString2);

		try (bufferedReader2) {
			System.out.println("java 9 try  " + bufferedReader2.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
