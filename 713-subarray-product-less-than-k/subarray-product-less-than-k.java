class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }

        int prod=1,res=0,left=0,right=0;

        while(right<nums.length){
            prod=prod*nums[right];
            while(prod>=k){
                prod=prod/nums[left];
                left++;
            }
            res=res+right-left+1;
            right++;
        }
        return res;
    }
}