package org.gl.leetcode.twosum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        /*
         * 构建一个HashMap, 将值作为key, 将索引作为value
         * */
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }

        /*
         * 遍历nums,对于每个num,用target - num, 获取想要的结果，然后在HashMap中获取
         * 想要的值的索引
         * */
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (map.containsKey(t) && map.get(t) != i) {
                result[0] = i;
                result[1] = map.get(t);
                break;
            }
        }
        return result;
    }

    public static void main(String [] args) {
        int [] nums = {2, 4, 7, 9, 10, 11, 15, 18};
        int [] result = twoSum(nums, 27);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
