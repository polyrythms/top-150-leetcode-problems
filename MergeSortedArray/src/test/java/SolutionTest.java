import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void mergeTest1() {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[] {2,5,6}, 3);
        Assert.assertArrayEquals(nums1, new int[] {1,2,2,3,5,6});
    }
    @Test
    public void mergeTest2() {
        int[] nums1 = new int[] {1};
        solution.merge(nums1, 1, new int[] {}, 0);
        Assert.assertArrayEquals(nums1, new int[] {1});
    }
    @Test
    public void mergeTest3() {
        int[] nums1 = new int[] {0};
        solution.merge(nums1, 0, new int[] {1}, 1);
        Assert.assertArrayEquals(nums1, new int[] {1});
    }

}
