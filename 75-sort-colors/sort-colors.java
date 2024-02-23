class Solution {
    public void sortColors(int[] nums) {
       int count_0=0,count_1=0,count_2=0,i;
       for(i=0;i<nums.length;i++){
           if(nums[i]==0){
               count_0 ++;
           }
           if(nums[i]==1){
               count_1 ++;
           }
           if(nums[i]==2){
               count_2 ++;
           }
       }
       for(i=0;i<count_0;i++){
           nums[i]=0;
       }
       for(int j = 0; j < count_1; j++, i++) {
            nums[i] = 1;
        }
        for(int k = 0; k < count_2; k++, i++) {
            nums[i] = 2;
        }
    }
}