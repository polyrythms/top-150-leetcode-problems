import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int output = 5;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(output, result);
        Assert.assertArrayEquals(new int[]{1,1,2,2,3}, Arrays.copyOfRange(nums, 0, output));
    }

    @Test
    public void testExample2() {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        int output = 7;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(output, result);
        Assert.assertArrayEquals(new int[]{0,0,1,1,2,3,3}, Arrays.copyOfRange(nums, 0, output));
    }
    @Test
    public void testExample3() {
        int[] nums = new int[]{1,1};
        int output = 2;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(output, result);
        Assert.assertArrayEquals(new int[]{1, 1}, Arrays.copyOfRange(nums, 0, output));
    }
    @Test
    public void testExample4() {
        int[] nums = new int[]{1,2};
        int output = 2;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(output, result);
        Assert.assertArrayEquals(new int[]{1,2}, Arrays.copyOfRange(nums, 0, output));
    }
    @Test
    public void testExample5() {
        int[] nums = new int[]{1,1,1};
        int output = 2;
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(output, result);
        Assert.assertArrayEquals(new int[]{1, 1}, Arrays.copyOfRange(nums, 0, output));
    }
}