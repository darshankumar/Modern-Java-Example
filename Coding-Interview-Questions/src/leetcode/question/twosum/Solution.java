package leetcode.question.twosum;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	int start =0;
    	int ends = nums.length -1;
    	
    	while(start<=ends){
    		int sum = nums[start] +nums[ends];
    		
    		if(sum>target) {
    			ends--; /// move to low number 
    		}else if (sum<target) {
    			start++; // move to high number
    		}else {
    			return new int[] {start+1,ends+1};
    		}
    	}
    	return new int[] {start+1,ends+1};
    }
    public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(nums,9)));
		
	}
}