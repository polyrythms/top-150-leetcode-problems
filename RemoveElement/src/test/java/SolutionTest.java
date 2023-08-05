import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void testExample1() {
        int[] nums = new int[] {3,2,2,3};
        int output = 2;
        int result = solution.removeElement(nums, 3);
        Assert.assertEquals(2, result);
        Assert.assertArrayEquals(new int[] {2,2}, Arrays.copyOfRange(nums, 0, output));
    }
    @Test
    public void testExample2() {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int output = 5;
        int result = solution.removeElement(nums, 2);
        Assert.assertEquals(5, result);
        Assert.assertArrayEquals(new int[] {0,1,3,0,4}, Arrays.copyOfRange(nums, 0, output));
    }

}
