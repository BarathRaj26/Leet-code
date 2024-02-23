class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        
        for (int i = 0; i < m; i++) {
            nums[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            nums[m + i] = nums2[i];
        }
        Arrays.sort(nums);

        int s = nums.length;
        if (s % 2 != 0) {
            return (double) nums[s / 2];
        } else {
            return (nums[s / 2] + nums[s / 2 - 1]) / 2.0;
        }
    }
}


