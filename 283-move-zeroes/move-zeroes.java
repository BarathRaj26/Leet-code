class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<n){
            nums[i]=0;
            i++;
        }
    }
}
/*
nums = [0,1,0,3,12]
i=0, n= 5
num=0, no action required
num=1  1!=0   nums[0]=1   nums=[1,1,0,3,2]   i++ -> 1
num=0 
num=3  3!=0   nums[1]=3   nums=[1,3,0,3,2]   i++ -> 2
num=12 12!=0  nums[2]=12  nums=[1,3,12,3,2]  i++ -> 3
for loop completed 
using while loop we will fill the remaining positions with zero
3<5 nums[3]=0 i++ -> 4 nums[1,3,12,0,2]
4<5 nums[4]=0 i++ -> 5 nums[1,3,12,0,0]
5<5 condition fails

*/