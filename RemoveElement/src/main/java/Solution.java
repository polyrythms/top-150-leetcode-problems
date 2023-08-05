public class Solution {
    public int removeElement(int[] nums, int val) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val & i < nums.length - 1) {
                int j = i + 1;
                while (j < nums.length - 1 && nums[j] == val) {
                    nums[i] = nums[j];
                    j++;
                }
                nums[i] = nums[j];
                nums[j] = val;
                if(nums[i] != val) {
                    output++;
                }

            } else if (nums[i] != val){
                output++;
            }
        }
        return output;
    }
}