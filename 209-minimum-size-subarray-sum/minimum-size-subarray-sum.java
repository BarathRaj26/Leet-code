class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int sum=0,left=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minlen=Math.min(minlen,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?0:minlen;
    }
}