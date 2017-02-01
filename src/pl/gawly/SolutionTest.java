package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(1, s.solution(0, 0, 1));
    }

    @Test
    public void testEx1() {
        Assert.assertEquals(3, s.solution(6, 11, 2));
    }

    @Test
    public void testEx2() {
        Assert.assertEquals(3, s.solution(6, 8, 1));
    }

    @Test
    public void testEx3() {
        Assert.assertEquals(3, s.solution(7, 17, 3));
    }

    @Test
    public void testEx4() {
        Assert.assertEquals(0, s.solution(11, 19, 10));
    }

    @Test
    public void testEx5() {
        Assert.assertEquals(1, s.solution(12, 20, 10));
    }

    @Test
    public void testEx6() {
        Assert.assertEquals(1, s.solution(10, 18, 10));
    }

    @Test
    public void testEx7() {
        Assert.assertEquals(2, s.solution(18, 36, 10));
    }

    @Test
    public void testEx8() {
        Assert.assertEquals(1, s.solution(8, 16, 10));
    }

    @Test
    public void testLarge1() {
        Assert.assertNotNull(s.solution(1, 2000000000, 3));
    }

    @Test
    public void testLarge2() {
        Assert.assertEquals(2, s.solution(1, 2000000000, 1000000000));
    }
}
