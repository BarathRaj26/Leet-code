class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        for(int i=0;i<n;i++) {
            result[2*i]=nums[i];
            result[2*i+1]=nums[n+i];
        }
        return result;
    }
}
/*
[1,1,2,2],n=2
result array 2*n [0,0,0,0]
i=0
result[0]=nums[0]=1
result[1]=nums[2+0]=2
i=1
result[2]=nums[1]=1
result[3]=nums[2+1]=2
2<2 condition fails
return result[1,2,1,2]
*/