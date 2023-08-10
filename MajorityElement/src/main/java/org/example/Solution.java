package org.example;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result = nums[0];
        int maxOverlap = 0;
        for (int num : nums) {
            int countOfNum = hm.getOrDefault(num, 0) + 1;
            hm.put(num, countOfNum);
            if (countOfNum > maxOverlap) {
                result = num;
                maxOverlap = countOfNum;
            }
        }
        return result;
    }
}