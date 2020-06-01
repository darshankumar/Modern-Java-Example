package leetcode.question.steps.pyramid.logs;

public class Solution {

	public static void steps(int n) {
		int row = 0;
		int total_coulumn = 2*n-1;
		int midpoint = (int) Math.floor( total_coulumn/2);
		
		while (row < n) {
			// System.out.print(".");
			int column = 0;
			
			while (column < total_coulumn) {
				
				if(midpoint-row <= column && midpoint+row >= column) { // 
					System.out.print("#");
				}else {
					System.out.print("*");
				}
				column++;
			}
			System.out.println(" ");
			row++;
		}

	}

	
	public static String steps_rec(int n , int row , String str) {
		if(row==n) {
			return "";
		}
		if(str.length() == 2*n-1) {
			System.out.println(str);
			return steps_rec(n,row+1,"");
		}
		
		int total_coulumn = 2*n-1;
		int midpoint = (int) Math.floor( total_coulumn/2);
		
		if(midpoint-row <= str.length() && midpoint+row >= str.length()) {
			str+="#";
		}else {
			str+=" ";
		}
		return steps_rec(n ,row ,str);
	}
	
	public static void main(String[] args) {
		System.out.println(steps_rec(10,0," "));
	}

}
