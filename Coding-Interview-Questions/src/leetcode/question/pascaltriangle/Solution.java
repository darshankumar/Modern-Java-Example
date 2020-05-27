package leetcode.question.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> traingle = new ArrayList();

		if (numRows == 0) {
			return traingle;
		}

		List<Integer> first_row = new ArrayList();
		first_row.add(1); // start with 1 
		traingle.add(first_row);// first row started
		
		for(int i=1; i< numRows;i++) { // start from 1
			List<Integer> prev_row = traingle.get(i-1);
			List<Integer> current_row = new ArrayList();
			current_row.add(1);//  as first element is 1
			
			for(int j=1 ;j<i;j++) {
				current_row.add(prev_row.get(j-1)+prev_row.get(j));
			}			
			current_row.add(1);//  as last element is 1
			traingle.add(current_row);// adding row 
		}
		return traingle;
	}
	
	public static void main(String[] args) {
		System.out.println(generate(0));
		System.out.println(generate(5));
		System.out.println(generate(10));
	}
}