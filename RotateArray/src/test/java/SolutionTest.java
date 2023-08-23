import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        solution.rotate(nums, k);
        int[] expectedResult =  new int[]{5,6,7,1,2,3,4};
        Assert.assertArrayEquals(expectedResult, nums);
    }

    @Test
    public void testExample2() {
        int[] nums = new int[]{-1,-100,3,99};
        int k = 2;
        solution.rotate(nums, k);
        int[] expectedResult =  new int[]{3,99,-1,-100};
        Assert.assertArrayEquals(expectedResult, nums);
    }
    @Test
    public void testExample3() {
        int[] nums = new int[]{1,2,3,4};
        int k = 2;
        solution.rotate(nums, k);
        int[] expectedResult =  new int[]{3,4,1,2};
        Assert.assertArrayEquals(expectedResult, nums);
    }

}