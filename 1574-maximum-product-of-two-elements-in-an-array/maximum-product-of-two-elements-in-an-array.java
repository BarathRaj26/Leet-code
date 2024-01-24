class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
/*
[3,4,5,2]
sort [2,3,4,5]
apply formula 
the last two elements will be maximum
*/