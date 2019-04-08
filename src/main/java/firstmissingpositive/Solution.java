package firstmissingpositive;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1 && nums[i] <= nums.length) {
                temp[nums[i] - 1] = nums[i];
            }
        }

        int i;
        for (i = 0; i < nums.length; i++) {
            if (temp[i] != (i + 1)) {
                break;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int [] nums = {99,94,96,11,92,5,91,89,57,85,66,63,84,81,79,61,74,78,77,30,64,13,58,18,70,69,51,12,32,34,9,43,39,8,1,38,49,27,21,45,47,44,53,52,48,19,50,59,3,40,31,82,23,56,37,41,16,28,22,33,65,42,54,20,29,25,10,26,4,60,67,83,62,71,24,35,72,55,75,0,2,46,15,80,6,36,14,73,76,86,88,7,17,87,68,90,95,93,97,98};
        int result = firstMissingPositive(nums);

        System.out.println(result);
    }
}
