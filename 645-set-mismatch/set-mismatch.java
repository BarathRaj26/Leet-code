class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq=new int[nums.length+1];
        for(int n: nums){ //counting freq of every number
            freq[n]++;
        }
        int dup=0,miss=0;
        for(int i=1;i<freq.length;i++){
            if(freq[i]==2){// freq count=2 means repeated number
                dup=i;
            }
            if(freq[i]==0){//freq count=1 means missing number
                miss=i;
            }
        }
        return new int[]{dup,miss};//returns both the elements
    }
}