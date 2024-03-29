class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length,max=-1,start=0,count=0;
        long ans=0;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                ans=0;count=0;start=0;
            }
            if(nums[i]==max){
                count++;
            }
            while(start<=i && count==k){
                ans+=(n-i);
                if(nums[start]==max){
                    count--;
                }
                start++;
            }
        }
        return ans;
    }
}