class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
/*[1,3,2]
val=3
i=0
1!=3  nums[0]=1
i=1
3!=3 condition fails
2!=3  nums[1]=2
i=2
j<nums.length 2<2 fails
return i  nums=[1,2,3]
*/
