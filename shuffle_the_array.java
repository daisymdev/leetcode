/* 
Problem Description:
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. 

*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        //[2,5,1,3,4,7]  3
        int[] sol = new int[nums.length];
        
        int j = 0;
        for(int i = 0; i < n; i++){
            sol[j] = nums[i];
            j = j + 2;
            // System.out.println(j);
            // [2, _, _, _, _, _]
            // [2, _, 5, _, _, _]
            // [2, _, 5, _, 1, _]
        }

        int k = 1;
            // [2, _, 5, _, 1, _]
        for(int i = n; i < nums.length; i++){
            sol[k] = nums[n];
            k = k + 2; 
            n++;
            // System.out.println(k);
            // [2, 3, 5, _, 1, _]
            // [2, 3, 5, 4, 1, _]
            // [2, 3, 5, 4, 1, 7]
        }
        return sol;
    }
}