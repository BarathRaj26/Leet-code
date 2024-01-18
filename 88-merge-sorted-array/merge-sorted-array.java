class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
/*
nums1 = {1, 2, 3, 0, 0, 0} m=3
nums2 = {2, 5, 6} n=3
nums1[3]=nums2[0]   1,2,3,2,0,0
nums1[4]=nums2[1]   1,2,3,2,5,0
nums1[5]=nums2[2]   1,2,3,2,5,6
j++ 3<3 condition fails
Arrays.sort(nums1)
*/