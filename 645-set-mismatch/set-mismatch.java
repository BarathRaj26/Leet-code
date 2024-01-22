class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq=new int[nums.length+1];
        int[] res=new int[2];
        for(int n: nums){ //counting freq of every number
            freq[n]++;
        }
        int c=0;
        for(int i=1;i<freq.length;i++){
            if(freq[i]==2){// freq count=2 means repeated number
                res[0]=i;
                c++;
            }
            if(freq[i]==0){//freq count=1 means missing number
                res[1]=i;
                c++;
            }
            if(c==2){ //if both numbers are found break
                break;
            }
        }
        return res;//returns both the elements
    }
}