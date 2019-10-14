package findmediansortedarrays;

public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int result = 0;

        while (i < m) {
            j = ( m + n) / 2 - i;

            if(Math.max(nums1[i - 1], nums2[j - 1]) <= Math.min(nums1[i], nums2[j])) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums1 = {1, 3, 5};
        int [] nums2 = {2, 4};
        double i = findMedianSortedArrays(nums1, nums2);

        System.out.println(i);
    }
}
