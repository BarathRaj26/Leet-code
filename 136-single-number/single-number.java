class Solution {
    public int singleNumber(int[] nums) {
        int num=nums[0];
        for (int i=1;i<nums.length;i++){
            num=num^nums[i];
        }
        return num;
    }
}
/*
1^1=0
0^1=1
4,1,2,1,2
4^1^2^1^2=4^0^0=4
*/