class Solution {
    public int arraySign(int[] nums) {
        int count=0;
        for(int i:nums){
            if(i==0){
                return 0;
            }
            else if(i<0){
                count++;
            }
        }
        if(count%2==0) return 1;
        else return -1;    
    }
}
/*
[-1,1,-1,1,-1]
i=-1 count=1
i=1
i=-1 count=2
i=1
i=-1 count=3
count%2  ->  3%2 !=0
return -1  
*/