/*
Problem Description:
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

*/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] += sum; 
            sum = nums[i];
        }
        return nums;
        
        //1 -> 1 + 0 = 1  [1, _, _, _]
        //2 -> 2 + 1 = 3  [1, 3, _, _]
        //3 -> 3 + 3 = 6  [1, 3, 6, _]
        //4 -> 4 + 6 = 10 [1, 3, 6, 10]
    }
}