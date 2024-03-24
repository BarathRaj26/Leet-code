class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxo=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxo=Math.max(maxo,count);
                count=0;
            }
        }
        return Math.max(maxo,count);
    }
}