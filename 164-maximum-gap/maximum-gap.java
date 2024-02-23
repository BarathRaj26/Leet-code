class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int i,max=0;
        for(i=0;i<nums.length-1;i++){
            if(max<nums[i+1]-nums[i]){
                max=nums[i+1]-nums[i];
            }
        }
        return max;
    }
}

