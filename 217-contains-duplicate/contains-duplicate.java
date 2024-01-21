class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
/*
[1,2,3,1]
i=0 add 1
i=1 add 2
i=2 add 3
1=3 set.contains(1) returns true
*/