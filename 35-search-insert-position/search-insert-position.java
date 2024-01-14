class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,mid;
        int high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low= mid+1;
            else high=mid-1;
        }
        return low;
    }
}
/*
1,3,5,6  target=7
mid=0+(3-0)/2=0+1=1
3 == 7 so mid is lesser than target
low=mid+1 -> low = 1+1=2
mid=2+(3-2)/2=2+0=2
5==7 low=2+1=3
mid=3+(3-3)/2=3
6==7 low=3+1=4
while(4<=3) condition fails
low=4 so 7 is to be inserted as 4th position
*/