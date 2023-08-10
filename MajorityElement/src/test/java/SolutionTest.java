import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int expectedResult = 3;
        int result = solution.majorityElement(new int[] {3,2,3});

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void test2() {
        int expectedResult = 2;
        int result = solution.majorityElement(new int[] {2,2,1,1,1,2,2});

        Assert.assertEquals(expectedResult, result);
    }
}