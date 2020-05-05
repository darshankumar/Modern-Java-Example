package com.learn.javaeight.lambda;

public class ConcatenateOld implements ConcatenateInterface {

	@Override
	public String concat(String a, String b) {
		// TODO Auto-generated method stub
		return a+" "+b;
	}

	public static void main(String[] args) {
		ConcatenateOld concatenateOld = new ConcatenateOld();
		System.out.println(concatenateOld.concat("Hello", "World"));
	}

}
