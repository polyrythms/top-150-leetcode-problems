package org.example;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 1;
        int k = 0;
        for (int i = 1; i + k < nums.length; i++) {
            while(i + k < nums.length - 1 &&
                    nums[i+k] <= nums[i-1]) {
                k++;
            }
                nums[i] = nums[i+k];
            if(nums[i-1] < nums[i])
                result++;
        }
        return result;
    }
}