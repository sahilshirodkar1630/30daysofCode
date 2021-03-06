package Day11;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*
	Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
	
	Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
	
	 
	 */
	public int missingNumber(int[] nums) {
	        
	        int totalSum = 0;
	        for(int i = 0;i<nums.length+1;i++){
	            totalSum += i;
	        }
	        
	        int sum = 0;
	        for(int i = 0;i<nums.length;i++){
	            sum += nums[i];
	        }
	        
	        return totalSum - sum;
	    
	    }
}
