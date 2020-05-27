package leetcode.question.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static List<String> fizzBuzz(int n) {
		List<String> output = new ArrayList<>();
		Integer start = 1;
		
		while(start<=n) {
			
			if(start%15==0) {
				output.add("FizzBuzz");
			}
			else if(start%3==0) {
				output.add("Fizz");
			}
			else if(start%5==0) {
				output.add("Buzz");
			}
			else {
				output.add(start.toString());
			}
			
			start = start+1;
		}
		
		
		
		return output;
    }

	public static void main(String[] args) {
		System.out.println(fizzBuzz(20));

	}

}
