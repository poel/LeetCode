package org.gl.leetcode.twosum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void twoSum() {
        int [] nums = {2, 4, 5, 6, 8, 19};
        int target = 14;
        int [] expect = {3, 4};
        int [] result = Solution.twoSum(nums, target);

        assertArrayEquals(expect, result);
    }
}